// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEventSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>SetEventSubscriptionResponseBody</p>
 */
public class SetEventSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private SetEventSubscriptionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEventSubscriptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The detailed information.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public SetEventSubscriptionResponseBody build() {
            return new SetEventSubscriptionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("active")
        private Integer active;

        @NameInMap("channelType")
        private String channelType;

        @NameInMap("contactGroupName")
        private String contactGroupName;

        @NameInMap("contactName")
        private String contactName;

        @NameInMap("eventContext")
        private String eventContext;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("lang")
        private String lang;

        @NameInMap("level")
        private String level;

        @NameInMap("minInterval")
        private Integer minInterval;

        @NameInMap("userId")
        private String userId;

        private Data(Builder builder) {
            this.active = builder.active;
            this.channelType = builder.channelType;
            this.contactGroupName = builder.contactGroupName;
            this.contactName = builder.contactName;
            this.eventContext = builder.eventContext;
            this.instanceId = builder.instanceId;
            this.lang = builder.lang;
            this.level = builder.level;
            this.minInterval = builder.minInterval;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return eventContext
         */
        public String getEventContext() {
            return this.eventContext;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return minInterval
         */
        public Integer getMinInterval() {
            return this.minInterval;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer active; 
            private String channelType; 
            private String contactGroupName; 
            private String contactName; 
            private String eventContext; 
            private String instanceId; 
            private String lang; 
            private String level; 
            private Integer minInterval; 
            private String userId; 

            /**
             * Indicates whether the event subscription feature is enabled. Valid values:
             * <p>
             * 
             * *   **0**: The event subscription feature is disabled.
             * *   **1**: The event subscription feature is enabled.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * The notification method. Valid values:
             * <p>
             * 
             * *   **hdm_alarm_sms**: text message.
             * *   **dingtalk**: DingTalk chatbot.
             * *   **hdm_alarm_sms_and_email**: text message and email.
             * *   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * The name of the contact group that receives alert notifications. Multiple names are separated by commas (,).
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * The name of the contact who receives alert notifications. Multiple names are separated by commas (,).
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * The supported event scenarios. Only **AllContext** is returned for this parameter, which indicates that all scenarios are supported.
             */
            public Builder eventContext(String eventContext) {
                this.eventContext = eventContext;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The language of event notifications. Only **zh-CN** is returned for this parameter, which indicates that event notifications are sent in Chinese.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The risk level of the events. Valid values:
             * <p>
             * 
             * *   **Notice**
             * *   **Optimization**
             * *   **Warn**
             * *   **Critical**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The minimum interval between consecutive event notifications. Unit: seconds.
             */
            public Builder minInterval(Integer minInterval) {
                this.minInterval = minInterval;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
