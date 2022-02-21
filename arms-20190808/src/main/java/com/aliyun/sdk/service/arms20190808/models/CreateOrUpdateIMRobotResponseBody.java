// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateIMRobotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateIMRobotResponseBody</p>
 */
public class CreateOrUpdateIMRobotResponseBody extends TeaModel {
    @NameInMap("AlertRobot")
    private AlertRobot alertRobot;

    @NameInMap("RequestId")
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
         * AlertRobot.
         */
        public Builder alertRobot(AlertRobot alertRobot) {
            this.alertRobot = alertRobot;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("DailyNoc")
        private Boolean dailyNoc;

        @NameInMap("DailyNocTime")
        private String dailyNocTime;

        @NameInMap("RobotAddress")
        private String robotAddress;

        @NameInMap("RobotId")
        private Float robotId;

        @NameInMap("RobotName")
        private String robotName;

        @NameInMap("Type")
        private String type;

        private AlertRobot(Builder builder) {
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

        public static AlertRobot create() {
            return builder().build();
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean dailyNoc; 
            private String dailyNocTime; 
            private String robotAddress; 
            private Float robotId; 
            private String robotName; 
            private String type; 

            /**
             * 是否发送每日统计信息
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * 每日统计发送时间
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * 告警机器人地址
             */
            public Builder robotAddress(String robotAddress) {
                this.robotAddress = robotAddress;
                return this;
            }

            /**
             * 告警机器人ID
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * 告警机器人名称
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * 告警机器人类型:dingding/wechat
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
