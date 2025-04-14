// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetMessageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageDetailResponseBody</p>
 */
public class GetMessageDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMessageDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageDetailResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMessageDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic.NotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter instanceId is mandatory for this action .</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FAEBD71F-E839-52F9-BD7B-8F1290525841</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMessageDetailResponseBody build() {
            return new GetMessageDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("bodySize")
        private Integer bodySize;

        @com.aliyun.core.annotation.NameInMap("bornHost")
        private String bornHost;

        @com.aliyun.core.annotation.NameInMap("bornTime")
        private String bornTime;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("messageGroup")
        private String messageGroup;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("messageKeys")
        private java.util.List<String> messageKeys;

        @com.aliyun.core.annotation.NameInMap("messageTag")
        private String messageTag;

        @com.aliyun.core.annotation.NameInMap("messageType")
        private String messageType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("storeHost")
        private String storeHost;

        @com.aliyun.core.annotation.NameInMap("storeTime")
        private String storeTime;

        @com.aliyun.core.annotation.NameInMap("systemProperties")
        private java.util.Map<String, String> systemProperties;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("userProperties")
        private java.util.Map<String, String> userProperties;

        private Data(Builder builder) {
            this.body = builder.body;
            this.bodySize = builder.bodySize;
            this.bornHost = builder.bornHost;
            this.bornTime = builder.bornTime;
            this.instanceId = builder.instanceId;
            this.messageGroup = builder.messageGroup;
            this.messageId = builder.messageId;
            this.messageKeys = builder.messageKeys;
            this.messageTag = builder.messageTag;
            this.messageType = builder.messageType;
            this.regionId = builder.regionId;
            this.storeHost = builder.storeHost;
            this.storeTime = builder.storeTime;
            this.systemProperties = builder.systemProperties;
            this.topicName = builder.topicName;
            this.userProperties = builder.userProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return bodySize
         */
        public Integer getBodySize() {
            return this.bodySize;
        }

        /**
         * @return bornHost
         */
        public String getBornHost() {
            return this.bornHost;
        }

        /**
         * @return bornTime
         */
        public String getBornTime() {
            return this.bornTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageGroup
         */
        public String getMessageGroup() {
            return this.messageGroup;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return messageKeys
         */
        public java.util.List<String> getMessageKeys() {
            return this.messageKeys;
        }

        /**
         * @return messageTag
         */
        public String getMessageTag() {
            return this.messageTag;
        }

        /**
         * @return messageType
         */
        public String getMessageType() {
            return this.messageType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storeHost
         */
        public String getStoreHost() {
            return this.storeHost;
        }

        /**
         * @return storeTime
         */
        public String getStoreTime() {
            return this.storeTime;
        }

        /**
         * @return systemProperties
         */
        public java.util.Map<String, String> getSystemProperties() {
            return this.systemProperties;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return userProperties
         */
        public java.util.Map<String, String> getUserProperties() {
            return this.userProperties;
        }

        public static final class Builder {
            private String body; 
            private Integer bodySize; 
            private String bornHost; 
            private String bornTime; 
            private String instanceId; 
            private String messageGroup; 
            private String messageId; 
            private java.util.List<String> messageKeys; 
            private String messageTag; 
            private String messageType; 
            private String regionId; 
            private String storeHost; 
            private String storeTime; 
            private java.util.Map<String, String> systemProperties; 
            private String topicName; 
            private java.util.Map<String, String> userProperties; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
                this.bodySize = model.bodySize;
                this.bornHost = model.bornHost;
                this.bornTime = model.bornTime;
                this.instanceId = model.instanceId;
                this.messageGroup = model.messageGroup;
                this.messageId = model.messageId;
                this.messageKeys = model.messageKeys;
                this.messageTag = model.messageTag;
                this.messageType = model.messageType;
                this.regionId = model.regionId;
                this.storeHost = model.storeHost;
                this.storeTime = model.storeTime;
                this.systemProperties = model.systemProperties;
                this.topicName = model.topicName;
                this.userProperties = model.userProperties;
            } 

            /**
             * <p>The message body.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The size of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder bodySize(Integer bodySize) {
                this.bodySize = bodySize;
                return this;
            }

            /**
             * <p>The client on which the message was produced.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.xx.xxx.xx</p>
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * <p>The time when the message was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder bornTime(String bornTime) {
                this.bornTime = bornTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-7e22ody****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The sharding key. This parameter is returned only for ordered messages.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder messageGroup(String messageGroup) {
                this.messageGroup = messageGroup;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>01BE87E485F0C7808C04543CAF00000001</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The message keys.</p>
             */
            public Builder messageKeys(java.util.List<String> messageKeys) {
                this.messageKeys = messageKeys;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder messageTag(String messageTag) {
                this.messageTag = messageTag;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder messageType(String messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The broker on which the message was stored.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.xx.xxx.xx</p>
             */
            public Builder storeHost(String storeHost) {
                this.storeHost = storeHost;
                return this;
            }

            /**
             * <p>The time when the message was stored.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-22 12:17:08</p>
             */
            public Builder storeTime(String storeTime) {
                this.storeTime = storeTime;
                return this;
            }

            /**
             * <p>The default system attributes.</p>
             */
            public Builder systemProperties(java.util.Map<String, String> systemProperties) {
                this.systemProperties = systemProperties;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic_test</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The user attributes.</p>
             */
            public Builder userProperties(java.util.Map<String, String> userProperties) {
                this.userProperties = userProperties;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
