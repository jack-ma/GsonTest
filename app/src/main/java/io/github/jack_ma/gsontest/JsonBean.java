package io.github.jack_ma.gsontest;

import java.util.List;

/**
 * Created by trys on 16-1-25.
 */
public class JsonBean {
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    private String desc;
    private String status;
    private Data data;
}
