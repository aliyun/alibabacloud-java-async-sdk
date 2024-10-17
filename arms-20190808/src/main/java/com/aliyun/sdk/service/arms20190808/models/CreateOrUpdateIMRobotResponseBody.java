// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the IM chatbot.</p>
         */
        public Builder alertRobot(AlertRobot alertRobot) {
            this.alertRobot = alertRobot;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16AF921B-8187-489F-9913-43C808B4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateIMRobotResponseBody build() {
            return new CreateOrUpdateIMRobotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrUpdateIMRobotResponseBody} extends {@link TeaModel}
     *
     * <p>CreateOrUpdateIMRobotResponseBody</p>
     */
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
             * <p>The configurations of the alert card template.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;button&quot;: [         &quot;claim&quot;,         &quot;close&quot;,         &quot;follow&quot;,         &quot;send_itsm&quot;,         &quot;block&quot;,         &quot;unResolvedIncident&quot;     ],     &quot;field&quot;: [         {             &quot;fieldName&quot;: &quot;alarmName&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;notificationPolicy&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmContent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmTime&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;seriesChart&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;includeEvent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;assigned&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;similarAlarm&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;operator&quot;,             &quot;visible&quot;: true         }     ] }</p>
             */
            public Builder cardTemplate(String cardTemplate) {
                this.cardTemplate = cardTemplate;
                return this;
            }

            /**
             * <p>Indicates whether daily statistics are sent. Valid values:</p>
             * <ul>
             * <li><code>false</code> (default): Daily statistics are not sent.</li>
             * <li><code>true</code>: Daily statistics are sent.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dailyNoc(Boolean dailyNoc) {
                this.dailyNoc = dailyNoc;
                return this;
            }

            /**
             * <p>The point in time at which the daily statistics are sent. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.</p>
             * 
             * <strong>example:</strong>
             * <p>09:30,17:00</p>
             */
            public Builder dailyNocTime(String dailyNocTime) {
                this.dailyNocTime = dailyNocTime;
                return this;
            }

            /**
             * <p>Indicates whether the Outgoing feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOutgoing(Boolean enableOutgoing) {
                this.enableOutgoing = enableOutgoing;
                return this;
            }

            /**
             * <p>The webhook URL of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
             */
            public Builder robotAddress(String robotAddress) {
                this.robotAddress = robotAddress;
                return this;
            }

            /**
             * <p>The ID of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder robotId(Float robotId) {
                this.robotId = robotId;
                return this;
            }

            /**
             * <p>The name of the IM chatbot.</p>
             * 
             * <strong>example:</strong>
             * <p>Chatbot name</p>
             */
            public Builder robotName(String robotName) {
                this.robotName = robotName;
                return this;
            }

            /**
             * <p>The token required to enable the Outgoing feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1656558719183be1245ab44********</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The type of the IM chatbot. Valid values:</p>
             * <ul>
             * <li><code>dingding</code>: DingTalk chatbot</li>
             * <li><code>wechat</code>: WeCom chatbot</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dingding</p>
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
