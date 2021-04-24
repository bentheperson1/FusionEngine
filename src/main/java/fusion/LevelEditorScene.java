package fusion;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene{
    private boolean changingScene = false;
    private float timeToChangeScene = 2.0f;

    public LevelEditorScene() {

    }

    @Override
    public void update(float dt) {
        if(!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changingScene = true;
        }

        if(changingScene) {

        }
    }
}
