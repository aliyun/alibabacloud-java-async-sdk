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
    @NameInMap("CardTemplate")
    private String cardTemplate;

    @Body
    @NameInMap("DailyNoc")
    private Boolean dailyNoc;

    @Body
    @NameInMap("DailyNocTime")
    private String dailyNocTime;

    @Body
    @NameInMap("DingSignKey")
    private String dingSignKey;

    @Body
    @NameInMap("EnableOutgoing")
    private Boolean enableOutgoing;

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
    @NameInMap("Token")
    private String token;

    @Body
    @NameInMap("Type")
    private String type;

    private CreateOrUpdateIMRobotRequest(Builder builder) {
        super(builder);
        this.cardTemplate = builder.cardTemplate;
        this.dailyNoc = builder.dailyNoc;
        this.dailyNocTime = builder.dailyNocTime;
        this.dingSignKey = builder.dingSignKey;
        this.enableOutgoing = builder.enableOutgoing;
        this.robotAddress = builder.robotAddress;
        this.robotId = builder.robotId;
        this.robotName = builder.robotName;
        this.token = builder.token;
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
     * @return cardTemplate
     */
    public String getCardTemplate() {
        return this.cardTemplate;
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
     * @return dingSignKey
     */
    public String getDingSignKey() {
        return this.dingSignKey;
    }

    /**
     * @return enableOutgoing
     */
    public Boolean getEnableOutgoing() {
        return this.enableOutgoing;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateIMRobotRequest, Builder> {
        private String cardTemplate; 
        private Boolean dailyNoc; 
        private String dailyNocTime; 
        private String dingSignKey; 
        private Boolean enableOutgoing; 
        private String robotAddress; 
        private Long robotId; 
        private String robotName; 
        private String token; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateIMRobotRequest request) {
            super(request);
            this.cardTemplate = request.cardTemplate;
            this.dailyNoc = request.dailyNoc;
            this.dailyNocTime = request.dailyNocTime;
            this.dingSignKey = request.dingSignKey;
            this.enableOutgoing = request.enableOutgoing;
            this.robotAddress = request.robotAddress;
            this.robotId = request.robotId;
            this.robotName = request.robotName;
            this.token = request.token;
            this.type = request.type;
        } 

        /**
         * 卡片模版配置信息
         */
        public Builder cardTemplate(String cardTemplate) {
            this.putBodyParameter("CardTemplate", cardTemplate);
            this.cardTemplate = cardTemplate;
            return this;
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
         * DingSignKey.
         */
        public Builder dingSignKey(String dingSignKey) {
            this.putBodyParameter("DingSignKey", dingSignKey);
            this.dingSignKey = dingSignKey;
            return this;
        }

        /**
         * EnableOutgoing.
         */
        public Builder enableOutgoing(Boolean enableOutgoing) {
            this.putBodyParameter("EnableOutgoing", enableOutgoing);
            this.enableOutgoing = enableOutgoing;
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
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
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
