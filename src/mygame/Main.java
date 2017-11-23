package mygame;

import com.jme3.animation.Skeleton;
import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Spatial;
import com.jme3.util.SkyFactory;
//@author kinks
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        viewPort.setBackgroundColor(ColorRGBA.LightGray);
        Material dump = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");
        Spatial luke = assetManager.loadModel("Models/Oto/Oto.mesh.xml"); 
        //Material mat = assetManager.loadMaterial("Models/Oto/Oto.j3m");
        luke.setMaterial(dump);
        //getRootNode().attachChild(SkyFactory.createSky(assetManager, "Common/MatDefs/Misc/Sky.j3md", SkyFactory.EnvMapType.CubeMap));
        rootNode.attachChild(luke);
        //Skeleton skeleton = (Skeleton)assetManager.loadAsset("Models/Oto/Oto.skeleton.xml");
        DirectionalLight sun = new DirectionalLight();
        rootNode.addLight(sun);
   }

    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
