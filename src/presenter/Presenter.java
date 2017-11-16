package presenter;

import javafx.scene.paint.Color;
import model.Ampelphase;
import model.Model;
import view.PassiveView;

public class Presenter {
    private Model model;
    private PassiveView passiveView;

    public Presenter(PassiveView passiveView) {
        this.passiveView = passiveView;
        model = new Model(this);
    }

    public void weiter() {
        model.weiter();
    }

    public void setAmpelzustand(Ampelphase ampelphase) {

        switch (ampelphase) {
            case ROT:
                passiveView.rotAn();
                passiveView.gelbAus();
                passiveView.gruenAus();
                break;
            case ROTGELB:
                passiveView.rotAn();
                passiveView.gelbAn();
                passiveView.gruenAus();
                break;
            case GRUEN:
                passiveView.rotAus();
                passiveView.gelbAus();
                passiveView.gruenAn();
                break;
            case GELB:
                passiveView.rotAus();
                passiveView.gelbAn();
                passiveView.gruenAus();
                break;
        }
    }


}
