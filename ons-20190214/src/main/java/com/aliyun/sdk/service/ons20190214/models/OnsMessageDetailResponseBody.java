// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsMessageDetailResponseBody} extends {@link TeaModel}
 *
 * <p>OnsMessageDetailResponseBody</p>
 */
public class OnsMessageDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EAE5BE23-37A1-4354-94D6-E44AE17E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsMessageDetailResponseBody build() {
            return new OnsMessageDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsMessageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OnsMessageDetailResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The name of the attribute. Valid values:</p>
             * <ul>
             * <li><strong>TRACE_ON</strong>: indicates whether the trace of the message exists.</li>
             * <li><strong>MSG_REGION</strong>: The region ID of the instance to which the topic belongs.</li>
             * <li><strong>__MESSAGE_DECODED_TIME</strong>: The time when the message was decoded.</li>
             * <li><strong>__BORNHOST</strong>: The IP address of the producer client.</li>
             * <li><strong>UNIQ_KEY</strong>: The ID of the message.</li>
             * </ul>
             * <p>For information about the terms that are used in ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>MSG_REGION</p>
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
    /**
     * 
     * {@link OnsMessageDetailResponseBody} extends {@link TeaModel}
     *
     * <p>OnsMessageDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("BodyCRC")
        private Integer bodyCRC;

        @com.aliyun.core.annotation.NameInMap("BodyStr")
        private String bodyStr;

        @com.aliyun.core.annotation.NameInMap("BornHost")
        private String bornHost;

        @com.aliyun.core.annotation.NameInMap("BornTimestamp")
        private Long bornTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List < PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("ReconsumeTimes")
        private Integer reconsumeTimes;

        @com.aliyun.core.annotation.NameInMap("StoreHost")
        private String storeHost;

        @com.aliyun.core.annotation.NameInMap("StoreSize")
        private Integer storeSize;

        @com.aliyun.core.annotation.NameInMap("StoreTimestamp")
        private Long storeTimestamp;

        @com.aliyun.core.annotation.NameInMap("Topic")
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
             * <p>The string that is obtained after the message body is encrypted by using the Base 64 algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>aGVsbG8=</p>
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The cyclic redundancy check (CRC) value of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>907060870</p>
             */
            public Builder bodyCRC(Integer bodyCRC) {
                this.bodyCRC = bodyCRC;
                return this;
            }

            /**
             * <p>The information about the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder bodyStr(String bodyStr) {
                this.bodyStr = bodyStr;
                return this;
            }

            /**
             * <p>The producer instance that generated the message.</p>
             * 
             * <strong>example:</strong>
             * <p><code>42.120.**.**</code>:64646</p>
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * <p>The timestamp that indicates the point in time when the message was generated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026630</p>
             */
            public Builder bornTimestamp(Long bornTimestamp) {
                this.bornTimestamp = bornTimestamp;
                return this;
            }

            /**
             * <p>The ID of the ApsaraMQ for RocketMQ Instance.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_184681981******_BXig0x6A</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>1E0578FE110F18B4AAC235C05F2*****</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The attributes of the message.</p>
             */
            public Builder propertyList(java.util.List < PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * <p>The number of retries that ApsaraMQ for RocketMQ performed to send the message to consumers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * <p>The ApsaraMQ for RocketMQ broker that stores the message.</p>
             * 
             * <strong>example:</strong>
             * <p>11.220.<em><strong>.</strong></em>:10911</p>
             */
            public Builder storeHost(String storeHost) {
                this.storeHost = storeHost;
                return this;
            }

            /**
             * <p>The size of the message. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder storeSize(Integer storeSize) {
                this.storeSize = storeSize;
                return this;
            }

            /**
             * <p>The timestamp that indicates the point in time when the ApsaraMQ for RocketMQ broker stored the message. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1570761026708</p>
             */
            public Builder storeTimestamp(Long storeTimestamp) {
                this.storeTimestamp = storeTimestamp;
                return this;
            }

            /**
             * <p>The topic to which the message belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test-mq_topic</p>
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
