package com.example.fei.zmap_test.HTTP;

/**
 * Created by do_pc on 2017/12/23.
 */

public interface HTTPCallback {
    /**
     * 回调处理返回数据
     * @param status：返回状态
     */
    void onFinish(int status);
}
