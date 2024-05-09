// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateIMRobotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateIMRobotResponseBody</p>
 */
public class CreateOrUpdateIMRobotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertRobot")
    private AlertRobot alertRobot;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateIMRobotResponseBody(Builder builder) {
        this.alertRobot = builder.alertRobot;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateIMRobotResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertRobot
     */
    public AlertRobot getAlertRobot() {
        return this.alertRobot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertRobot alertRobot; 
        private String requestId; 

        /**
         * The information about the IM chatbot.
         */
        public Builder alertRobot(AlertRobot alertRobot) {
            this.alertRobot = alertRobot;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateIMRobotResponseBody build() {
            return new CreateOrUpdateIMRobotResponseBody(this);
        } 

    } 

    public static class AlertRobot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardTemplate")
        private String cardTemplate;

        @com.aliyun.core.annotation.NameInMap("DailyNoc")
        private Boolean dailyNoc;

        @com.aliyun.core.annotation.NameInMap("DailyNocTime")
        private String dailyNocTime;

        @com.aliyun.core.annotation.NameInMap("EnableOutgoing")
        private Boolean enableOutgoing;

        @com.aliyun.core.annotation.NameInMap("RobotAddress")
        private String robotAddress;

        @com.aliyun.core.annotation.NameInMap("RobotId")
        private Float robotId;

        @com.aliyun.core.annotation.NameInMap("RobotName")
        private String robotName;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AlertRobot(Builder builder) {
            this.cardTemplate = builder.cardTemplate;
            this.dailyNoc = builder.dailyNoc;
            this.dailyNocTime = builder.dailyNocTime;
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

        public static AlertRobot create() {
            return builder().build();
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
        public Float getRobotId() {
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

        public static final class Builder {
            private String cardTemplate; 
            private Boolean dailyNoc; 
            private String dailyNocTime; 
            private Boolean enableOutgoing; 
            private String robotAddress; 
            private Float robotId; 
            private String robotName; 
            private String token; 
            private String type; 

            /**
             * The configurations of the alert card template.
             */
            public Builder cardTemplate(String cardTemplate) {
                this.cardTemplate = cardTemplate;
                return this;
            }

            /**
             * Indicates whether daily statistics are sent. Valid values:
             * <p>
             * 
             * *   `false` (default): Daily statistics are not sent.
             * *   `true`: Daily statistics are sent.
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * The point in time at which the daily statistics are sent. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * Indicates whether the Outgoing feature is enabled.
             */
            public Builder enableOutgoing(Boolean enableOutgoing) {
                this.enableOutgoing = enableOutgoing;
                return this;
            }

            /**
             * The webhook URL of the IM chatbot.
             */
            public Builder robotAddress(String robotAddress) {
                this.robotAddress = robotAddress;
                return this;
            }

            /**
             * The ID of the IM chatbot.
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * The name of the IM chatbot.
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * The token required to enable the Outgoing feature.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * The type of the IM chatbot. Valid values:
             * <p>
             * 
             * *   `dingding`: DingTalk chatbot
             * *   `wechat`: WeCom chatbot
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AlertRobot build() {
                return new AlertRobot(this);
            } 

        } 

    }
}
