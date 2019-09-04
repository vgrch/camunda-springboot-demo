package az.br.camunda.entity;

import java.io.Serializable;

public class ServiceADTO implements Serializable {



    private int respCode;
    private String desc;
    private Object obj;

    public ServiceADTO(int respCode, String desc, Object obj) {
        this.respCode = respCode;
        this.desc = desc;
        this.obj = obj;
    }

    public ServiceADTO() {
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceADTO{");
        sb.append("respCode=").append(respCode);
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", obj=").append(obj);
        sb.append('}');
        return sb.toString();
    }
}
