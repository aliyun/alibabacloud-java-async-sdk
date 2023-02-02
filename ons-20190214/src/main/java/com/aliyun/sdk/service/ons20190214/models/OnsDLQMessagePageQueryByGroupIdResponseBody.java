// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsDLQMessagePageQueryByGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>OnsDLQMessagePageQueryByGroupIdResponseBody</p>
 */
public class OnsDLQMessagePageQueryByGroupIdResponseBody extends TeaModel {
    @NameInMap("MsgFoundDo")
    private MsgFoundDo msgFoundDo;

    @NameInMap("RequestId")
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
         * The returned results.
         */
        public Builder msgFoundDo(MsgFoundDo msgFoundDo) {
            this.msgFoundDo = msgFoundDo;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsDLQMessagePageQueryByGroupIdResponseBody build() {
            return new OnsDLQMessagePageQueryByGroupIdResponseBody(this);
        } 

    } 

    public static class MessageProperty extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
             * The name of the attribute. Valid values:
             * <p>
             * 
             * *   **TRACE_ON**: indicates whether a trace of the message exists.
             * *   **KEYS**: indicates the message key of the message.
             * *   **TAGS**: indicates the tag of the message.
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

            public MessageProperty build() {
                return new MessageProperty(this);
            } 

        } 

    }
    public static class PropertyList extends TeaModel {
        @NameInMap("MessageProperty")
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
    public static class OnsRestMessageDo extends TeaModel {
        @NameInMap("BodyCRC")
        private Integer bodyCRC;

        @NameInMap("BornHost")
        private String bornHost;

        @NameInMap("BornTimestamp")
        private Long bornTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MsgId")
        private String msgId;

        @NameInMap("PropertyList")
        private PropertyList propertyList;

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
             * The cyclic redundancy check (CRC) value of the message body.
             */
            public Builder bodyCRC(Integer bodyCRC) {
                this.bodyCRC = bodyCRC;
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
             * The timestamp when the message was produced.
             */
            public Builder bornTimestamp(Long bornTimestamp) {
                this.bornTimestamp = bornTimestamp;
                return this;
            }

            /**
             * The ID of the instance.
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
            public Builder propertyList(PropertyList propertyList) {
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
             * The timestamp when the Message Queue for Apache RocketMQ broker stored the message.
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

            public OnsRestMessageDo build() {
                return new OnsRestMessageDo(this);
            } 

        } 

    }
    public static class MsgFoundList extends TeaModel {
        @NameInMap("OnsRestMessageDo")
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
    public static class MsgFoundDo extends TeaModel {
        @NameInMap("CurrentPage")
        private Long currentPage;

        @NameInMap("MaxPageCount")
        private Long maxPageCount;

        @NameInMap("MsgFoundList")
        private MsgFoundList msgFoundList;

        @NameInMap("TaskId")
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
             * The page number of the returned page.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The total number of returned pages.
             */
            public Builder maxPageCount(Long maxPageCount) {
                this.maxPageCount = maxPageCount;
                return this;
            }

            /**
             * The information about dead-letter messages that are returned on the current page. The information that is contained in this parameter is the same as the information that is returned by the [OnsDLQMessageGetById](~~112667~~) operation.
             */
            public Builder msgFoundList(MsgFoundList msgFoundList) {
                this.msgFoundList = msgFoundList;
                return this;
            }

            /**
             * The ID of the query task. The first time you call this operation to query the dead-letter messages that are sent to a specified consumer group within a specified time range, this parameter is returned. You can use the task ID to query the details of dead-letter messages on other returned pages.
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
