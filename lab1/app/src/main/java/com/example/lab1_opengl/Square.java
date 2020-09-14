package com.example.lab1_opengl;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class Square implements GLSurfaceView.Renderer {

    float []a=new float[]{
            -1,0.7f,0,
            -1,-0.7f,0,
            1,-0.7f,0,
            1,0.7f,0

    };
    FloatBuffer f;
    ByteBuffer b;
    public Square(){
        b=ByteBuffer.allocateDirect(4*3*4);
        b.order(ByteOrder.nativeOrder());
        f=b.asFloatBuffer();
        f.put(a);
        f.position(0);
    }
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
    }
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
    }
    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClearColor(0.43f,0.66f,0.66f,1); //background
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(0,0,-1);
        gl.glScalef(0.5f,0.5f,0.5f);
        gl.glColor4f(1,0.42f,0,1); //square
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glVertexPointer(3,GL10.GL_FLOAT,0,f);
        gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,0,4);
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
    }


}
