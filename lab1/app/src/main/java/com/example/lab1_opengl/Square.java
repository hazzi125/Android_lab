package com.example.lab1_opengl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glViewport;

import android.opengl.GLSurfaceView.Renderer;

public class Square implements Renderer {

    public void onDrawFrame(GL10 arg0) { // когда surface готово отобразить очередной кадр. В этом методе будем создавать изображение
        glClear(GL_COLOR_BUFFER_BIT); //	Очистка буфера цвета
    }

    public void onSurfaceChanged(GL10 arg0, int width, int height) { // при изменении размера surface(смена ориентации экрана)
        glViewport(0, 0, width, height);
    }

    public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {  //вызывается при создании/пересоздании surface(запуске приложения или,при выходе девайса из сна.
        // установка OpenGL параметров и инициализация графических объектов.
        glClearColor(0.48f, 0.76f, 0.68f, 1f); //передаем цвета
    }

}
