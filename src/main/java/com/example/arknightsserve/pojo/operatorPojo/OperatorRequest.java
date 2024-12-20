package com.example.arknightsserve.pojo.operatorPojo;



public class OperatorRequest {
    private Integer userId;
    private Integer operatorId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "OperatorRequest{" +
                "userId=" + userId +
                ", operatorId=" + operatorId +
                '}';
    }
}
