// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateIMRobotRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateIMRobotRequest</p>
 */
public class CreateOrUpdateIMRobotRequest extends Request {
    @Body
    @NameInMap("DailyNoc")
    private Boolean dailyNoc;

    @Body
    @NameInMap("DailyNocTime")
    private String dailyNocTime;

    @Body
    @NameInMap("RobotAddress")
    @Validation(required = true)
    private String robotAddress;

    @Body
    @NameInMap("RobotId")
    private Long robotId;

    @Body
    @NameInMap("RobotName")
    @Validation(required = true)
    private String robotName;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateOrUpdateIMRobotRequest(Builder builder) {
        super(builder);
        this.dailyNoc = builder.dailyNoc;
        this.dailyNocTime = builder.dailyNocTime;
        this.robotAddress = builder.robotAddress;
        this.robotId = builder.robotId;
        this.robotName = builder.robotName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateIMRobotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyNoc
     */
    public Boolean getDailyNoc() {
        return this.dailyNoc;
    }

    /**
     * @return dailyNocTime
     */
    public String getDailyNocTime() {
        return this.dailyNocTime;
    }

    /**
     * @return robotAddress
     */
    public String getRobotAddress() {
        return this.robotAddress;
    }

    /**
     * @return robotId
     */
    public Long getRobotId() {
        return this.robotId;
    }

    /**
     * @return robotName
     */
    public String getRobotName() {
        return this.robotName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateIMRobotRequest, Builder> {
        private Boolean dailyNoc; 
        private String dailyNocTime; 
        private String robotAddress; 
        private Long robotId; 
        private String robotName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateIMRobotRequest response) {
            super(response);
            this.dailyNoc = response.dailyNoc;
            this.dailyNocTime = response.dailyNocTime;
            this.robotAddress = response.robotAddress;
            this.robotId = response.robotId;
            this.robotName = response.robotName;
            this.type = response.type;
        } 

        /**
         * 是否发送每日统计信息
         */
        public Builder dailyNoc(Boolean dailyNoc) {
            this.putBodyParameter("DailyNoc", dailyNoc);
            this.dailyNoc = dailyNoc;
            return this;
        }

        /**
         * 每日统计发送时间
         */
        public Builder dailyNocTime(String dailyNocTime) {
            this.putBodyParameter("DailyNocTime", dailyNocTime);
            this.dailyNocTime = dailyNocTime;
            return this;
        }

        /**
         * 告警机器人地址
         */
        public Builder robotAddress(String robotAddress) {
            this.putBodyParameter("RobotAddress", robotAddress);
            this.robotAddress = robotAddress;
            return this;
        }

        /**
         * 告警机器人ID
         */
        public Builder robotId(Long robotId) {
            this.putBodyParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        /**
         * 告警机器人名称
         */
        public Builder robotName(String robotName) {
            this.putBodyParameter("RobotName", robotName);
            this.robotName = robotName;
            return this;
        }

        /**
         * 告警机器人类型:dingding/wechat
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateOrUpdateIMRobotRequest build() {
            return new CreateOrUpdateIMRobotRequest(this);
        } 

    } 

}
