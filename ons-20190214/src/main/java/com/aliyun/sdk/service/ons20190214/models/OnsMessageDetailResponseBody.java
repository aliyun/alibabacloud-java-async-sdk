// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsMessageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OnsMessageDetailResponseBody</p>
 */
public class OnsMessageDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsMessageDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsMessageDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsMessageDetailResponseBody build() {
            return new OnsMessageDetailResponseBody(this);
        } 

    } 

    public static class PropertyList extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private PropertyList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The name of the attribute. Valid values:
             * <p>
             * 
             * *   **BODY**: indicates the message body
             * *   **TRACE_ON**: indicates whether the trace of the message exists.
             * *   **KEYS**: indicates the key of the message.
             * *   **TAGS**: indicates the tag that is attached to the message.
             * *   **INSTANCE_ID**: indicates the ID of the instance that contains the message.
             * 
             * For more information about the terms that are used in Message Queue for Apache RocketMQ, see [Terms](~~29533~~).
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the attribute.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Body")
        private String body;

        @NameInMap("BodyCRC")
        private Integer bodyCRC;

        @NameInMap("BodyStr")
        private String bodyStr;

        @NameInMap("BornHost")
        private String bornHost;

        @NameInMap("BornTimestamp")
        private Long bornTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MsgId")
        private String msgId;

        @NameInMap("PropertyList")
        private java.util.List < PropertyList> propertyList;

        @NameInMap("ReconsumeTimes")
        private Integer reconsumeTimes;

        @NameInMap("StoreHost")
        private String storeHost;

        @NameInMap("StoreSize")
        private Integer storeSize;

        @NameInMap("StoreTimestamp")
        private Long storeTimestamp;

        @NameInMap("Topic")
        private String topic;

        private Data(Builder builder) {
            this.body = builder.body;
            this.bodyCRC = builder.bodyCRC;
            this.bodyStr = builder.bodyStr;
            this.bornHost = builder.bornHost;
            this.bornTimestamp = builder.bornTimestamp;
            this.instanceId = builder.instanceId;
            this.msgId = builder.msgId;
            this.propertyList = builder.propertyList;
            this.reconsumeTimes = builder.reconsumeTimes;
            this.storeHost = builder.storeHost;
            this.storeSize = builder.storeSize;
            this.storeTimestamp = builder.storeTimestamp;
            this.topic = builder.topic;
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
         * @return bodyCRC
         */
        public Integer getBodyCRC() {
            return this.bodyCRC;
        }

        /**
         * @return bodyStr
         */
        public String getBodyStr() {
            return this.bodyStr;
        }

        /**
         * @return bornHost
         */
        public String getBornHost() {
            return this.bornHost;
        }

        /**
         * @return bornTimestamp
         */
        public Long getBornTimestamp() {
            return this.bornTimestamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return propertyList
         */
        public java.util.List < PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return reconsumeTimes
         */
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        /**
         * @return storeHost
         */
        public String getStoreHost() {
            return this.storeHost;
        }

        /**
         * @return storeSize
         */
        public Integer getStoreSize() {
            return this.storeSize;
        }

        /**
         * @return storeTimestamp
         */
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String body; 
            private Integer bodyCRC; 
            private String bodyStr; 
            private String bornHost; 
            private Long bornTimestamp; 
            private String instanceId; 
            private String msgId; 
            private java.util.List < PropertyList> propertyList; 
            private Integer reconsumeTimes; 
            private String storeHost; 
            private Integer storeSize; 
            private Long storeTimestamp; 
            private String topic; 

            /**
             * The body of the message.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * The cyclic redundancy check (CRC) value of the message body.
             */
            public Builder bodyCRC(Integer bodyCRC) {
                this.bodyCRC = bodyCRC;
                return this;
            }

            /**
             * 消息体内容。
             */
            public Builder bodyStr(String bodyStr) {
                this.bodyStr = bodyStr;
                return this;
            }

            /**
             * The producer instance that generated the message.
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * The timestamp that indicates the point in time when the message was generated. Unit: milliseconds.
             */
            public Builder bornTimestamp(Long bornTimestamp) {
                this.bornTimestamp = bornTimestamp;
                return this;
            }

            /**
             * The ID of the Message Queue for Apache RocketMQ Instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the message.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * The attributes of the message.
             */
            public Builder propertyList(java.util.List < PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * The number of retries that Message Queue for Apache RocketMQ performed to send the message to consumers.
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * The Message Queue for Apache RocketMQ broker that stores the message.
             */
            public Builder storeHost(String storeHost) {
                this.storeHost = storeHost;
                return this;
            }

            /**
             * The size of the message. Unit: KB.
             */
            public Builder storeSize(Integer storeSize) {
                this.storeSize = storeSize;
                return this;
            }

            /**
             * The timestamp that indicates the point in time when the Message Queue for Apache RocketMQ broker stored the message. Unit: milliseconds.
             */
            public Builder storeTimestamp(Long storeTimestamp) {
                this.storeTimestamp = storeTimestamp;
                return this;
            }

            /**
             * The topic to which the message belongs.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
