// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetEventSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>SetEventSubscriptionResponseBody</p>
 */
public class SetEventSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SetEventSubscriptionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>097F0C56-B252-515A-B602-FC56EF93EF8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public SetEventSubscriptionResponseBody build() {
            return new SetEventSubscriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetEventSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>SetEventSubscriptionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Integer active;

        @com.aliyun.core.annotation.NameInMap("channelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("contactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("contactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("eventContext")
        private String eventContext;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("minInterval")
        private Integer minInterval;

        @com.aliyun.core.annotation.NameInMap("userId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.active = model.active;
                this.channelType = model.channelType;
                this.contactGroupName = model.contactGroupName;
                this.contactName = model.contactName;
                this.eventContext = model.eventContext;
                this.instanceId = model.instanceId;
                this.lang = model.lang;
                this.level = model.level;
                this.minInterval = model.minInterval;
                this.userId = model.userId;
            } 

            /**
             * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The event subscription feature is disabled.</li>
             * <li><strong>1</strong>: The event subscription feature is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The notification method. Valid values:</p>
             * <ul>
             * <li><strong>hdm_alarm_sms</strong>: text message.</li>
             * <li><strong>dingtalk</strong>: DingTalk chatbot.</li>
             * <li><strong>hdm_alarm_sms_and_email</strong>: text message and email.</li>
             * <li><strong>hdm_alarm_sms,dingtalk</strong>: text message and DingTalk chatbot.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hdm_alarm_sms,dingtalk</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The name of the contact group that receives alert notifications. Multiple names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>Default contact group</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The name of the contact who receives alert notifications. Multiple names are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>Default contact</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The supported event scenarios. Only <strong>AllContext</strong> is returned for this parameter, which indicates that all scenarios are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>AllContext</p>
             */
            public Builder eventContext(String eventContext) {
                this.eventContext = eventContext;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The language of event notifications. Only <strong>zh-CN</strong> is returned for this parameter, which indicates that event notifications are sent in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>zh_CN</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The risk level of the events. Valid values:</p>
             * <ul>
             * <li><strong>Notice</strong></li>
             * <li><strong>Optimization</strong></li>
             * <li><strong>Warn</strong></li>
             * <li><strong>Critical</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Optimization</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The minimum interval between consecutive event notifications. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder minInterval(Integer minInterval) {
                this.minInterval = minInterval;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1088760496****</p>
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
