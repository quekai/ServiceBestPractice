package com.example.quekai.servicebestpractice;

/**
 * Created by quekai on 2018/10/14.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();

}
