// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
 */
public class OnsDLQMessagePageQueryByGroupIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MsgFoundDo")
    private MsgFoundDo msgFoundDo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsDLQMessagePageQueryByGroupIdResponseBody(Builder builder) {
        this.msgFoundDo = builder.msgFoundDo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsDLQMessagePageQueryByGroupIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return msgFoundDo
     */
    public MsgFoundDo getMsgFoundDo() {
        return this.msgFoundDo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MsgFoundDo msgFoundDo; 
        private String requestId; 

        /**
         * <p>The information about dead-letter messages that are queried.</p>
         */
        public Builder msgFoundDo(MsgFoundDo msgFoundDo) {
            this.msgFoundDo = msgFoundDo;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B00CD3C8-D81E-4A41-85E2-38F19252****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBody build() {
            return new OnsDLQMessagePageQueryByGroupIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
     */
    public static class MessageProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private MessageProperty(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageProperty create() {
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
             * <li><strong>TRACE_ON</strong>: indicates whether a trace of the message exists.</li>
             * <li><strong>KEYS</strong>: indicates the key of the message.</li>
             * <li><strong>TAGS</strong>: indicates the tag that is attached to the message.</li>
             * <li><strong>INSTANCE_ID</strong>: indicates the ID of the instance that contains the message.</li>
             * </ul>
             * <p>For information about the terms that are used in ApsaraMQ for RocketMQ, see <a href="https://help.aliyun.com/document_detail/29533.html">Terms</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>TAGS</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>TagA</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MessageProperty build() {
                return new MessageProperty(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MessageProperty")
        private java.util.List < MessageProperty> messageProperty;

        private PropertyList(Builder builder) {
            this.messageProperty = builder.messageProperty;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return messageProperty
         */
        public java.util.List < MessageProperty> getMessageProperty() {
            return this.messageProperty;
        }

        public static final class Builder {
            private java.util.List < MessageProperty> messageProperty; 

            /**
             * MessageProperty.
             */
            public Builder messageProperty(java.util.List < MessageProperty> messageProperty) {
                this.messageProperty = messageProperty;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
     */
    public static class OnsRestMessageDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BodyCRC")
        private Integer bodyCRC;

        @com.aliyun.core.annotation.NameInMap("BornHost")
        private String bornHost;

        @com.aliyun.core.annotation.NameInMap("BornTimestamp")
        private Long bornTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private PropertyList propertyList;

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

        private OnsRestMessageDo(Builder builder) {
            this.bodyCRC = builder.bodyCRC;
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

        public static OnsRestMessageDo create() {
            return builder().build();
        }

        /**
         * @return bodyCRC
         */
        public Integer getBodyCRC() {
            return this.bodyCRC;
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
        public PropertyList getPropertyList() {
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
            private Integer bodyCRC; 
            private String bornHost; 
            private Long bornTimestamp; 
            private String instanceId; 
            private String msgId; 
            private PropertyList propertyList; 
            private Integer reconsumeTimes; 
            private String storeHost; 
            private Integer storeSize; 
            private Long storeTimestamp; 
            private String topic; 

            /**
             * <p>The cyclic redundancy check (CRC) value of the message body.</p>
             * 
             * <strong>example:</strong>
             * <p>914112295</p>
             */
            public Builder bodyCRC(Integer bodyCRC) {
                this.bodyCRC = bodyCRC;
                return this;
            }

            /**
             * <p>The producer instance that generated the message.</p>
             * 
             * <strong>example:</strong>
             * <p>42.120.<em><strong>.</strong></em>:59270</p>
             */
            public Builder bornHost(String bornHost) {
                this.bornHost = bornHost;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the message was produced.</p>
             * 
             * <strong>example:</strong>
             * <p>1570760999721</p>
             */
            public Builder bornTimestamp(Long bornTimestamp) {
                this.bornTimestamp = bornTimestamp;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_111111111111_DOxxxxxx</p>
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
            public Builder propertyList(PropertyList propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * <p>The number of retries that were performed to send the message to consumers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * <p>The ApsaraMQ for RocketMQ broker that stores the message.</p>
             * 
             * <strong>example:</strong>
             * <p>11.193.<em><strong>.</strong></em>:10911</p>
             */
            public Builder storeHost(String storeHost) {
                this.storeHost = storeHost;
                return this;
            }

            /**
             * <p>The size of the message. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>406</p>
             */
            public Builder storeSize(Integer storeSize) {
                this.storeSize = storeSize;
                return this;
            }

            /**
             * <p>The timestamp that indicates the point in time when the ApsaraMQ for RocketMQ broker stored the message.</p>
             * 
             * <strong>example:</strong>
             * <p>1570760999811</p>
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

            public OnsRestMessageDo build() {
                return new OnsRestMessageDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
     */
    public static class MsgFoundList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnsRestMessageDo")
        private java.util.List < OnsRestMessageDo> onsRestMessageDo;

        private MsgFoundList(Builder builder) {
            this.onsRestMessageDo = builder.onsRestMessageDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsgFoundList create() {
            return builder().build();
        }

        /**
         * @return onsRestMessageDo
         */
        public java.util.List < OnsRestMessageDo> getOnsRestMessageDo() {
            return this.onsRestMessageDo;
        }

        public static final class Builder {
            private java.util.List < OnsRestMessageDo> onsRestMessageDo; 

            /**
             * OnsRestMessageDo.
             */
            public Builder onsRestMessageDo(java.util.List < OnsRestMessageDo> onsRestMessageDo) {
                this.onsRestMessageDo = onsRestMessageDo;
                return this;
            }

            public MsgFoundList build() {
                return new MsgFoundList(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
     */
    public static class MsgFoundDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("MaxPageCount")
        private Long maxPageCount;

        @com.aliyun.core.annotation.NameInMap("MsgFoundList")
        private MsgFoundList msgFoundList;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private MsgFoundDo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.maxPageCount = builder.maxPageCount;
            this.msgFoundList = builder.msgFoundList;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsgFoundDo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return maxPageCount
         */
        public Long getMaxPageCount() {
            return this.maxPageCount;
        }

        /**
         * @return msgFoundList
         */
        public MsgFoundList getMsgFoundList() {
            return this.msgFoundList;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long currentPage; 
            private Long maxPageCount; 
            private MsgFoundList msgFoundList; 
            private String taskId; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder maxPageCount(Long maxPageCount) {
                this.maxPageCount = maxPageCount;
                return this;
            }

            /**
             * <p>The information about dead-letter messages that are returned on the current page. The information that is contained in this parameter is the same as the information that is returned by the <a href="https://help.aliyun.com/document_detail/112667.html">OnsDLQMessageGetById</a> operation.</p>
             */
            public Builder msgFoundList(MsgFoundList msgFoundList) {
                this.msgFoundList = msgFoundList;
                return this;
            }

            /**
             * <p>The ID of the query task. The first time you call this operation to query the dead-letter messages that are sent to a specified consumer group within a specified time range, this parameter is returned. You can use the task ID to query the details of dead-letter messages on other returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>0BC1310300002A9F000021E4D7A48346</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public MsgFoundDo build() {
                return new MsgFoundDo(this);
            } 

        } 

    }
}
