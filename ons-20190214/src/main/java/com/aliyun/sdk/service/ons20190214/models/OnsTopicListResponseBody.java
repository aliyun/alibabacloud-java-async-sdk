// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTopicListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTopicListResponseBody</p>
 */
public class OnsTopicListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsTopicListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicListResponseBody create() {
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
         * <p>The information about the topics.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4A978869-7681-4529-B470-107E1379****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTopicListResponseBody build() {
            return new OnsTopicListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicListResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>CartService</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>SrviceA</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicListResponseBody</p>
     */
    public static class PublishInfoDo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MessageType")
        private Integer messageType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Relation")
        private Integer relation;

        @com.aliyun.core.annotation.NameInMap("RelationName")
        private String relationName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private PublishInfoDo(Builder builder) {
            this.createTime = builder.createTime;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.messageType = builder.messageType;
            this.owner = builder.owner;
            this.relation = builder.relation;
            this.relationName = builder.relationName;
            this.remark = builder.remark;
            this.serviceStatus = builder.serviceStatus;
            this.tags = builder.tags;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishInfoDo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return independentNaming
         */
        public Boolean getIndependentNaming() {
            return this.independentNaming;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageType
         */
        public Integer getMessageType() {
            return this.messageType;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return relation
         */
        public Integer getRelation() {
            return this.relation;
        }

        /**
         * @return relationName
         */
        public String getRelationName() {
            return this.relationName;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Long createTime; 
            private Boolean independentNaming; 
            private String instanceId; 
            private Integer messageType; 
            private String owner; 
            private Integer relation; 
            private String relationName; 
            private String remark; 
            private Integer serviceStatus; 
            private Tags tags; 
            private String topic; 

            /**
             * <p>The time when the topic was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1570700947000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the instance that contains the topic uses a namespace. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.</li>
             * <li><strong>false</strong>: The instance does not use a separate namespace. The name of each resource must be globally unique within an instance and across all instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
                return this;
            }

            /**
             * <p>The ID of the instance that contains the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_188077086902****_BXSuW61e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The message type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: normal messages</li>
             * <li><strong>1</strong>: partitionally ordered messages</li>
             * <li><strong>2</strong>: globally ordered messages</li>
             * <li><strong>4</strong>: transactional messages</li>
             * <li><strong>5</strong>: scheduled or delayed messages</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder messageType(Integer messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * <p>The user ID of the topic owner. The value of this parameter is an Alibaba account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>138015630679****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Indicates the relationship between the current account and the topic. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The current account is the owner of the topic.</li>
             * <li><strong>2</strong>: The current account can publish messages to the topic.</li>
             * <li><strong>4</strong>: The current account can subscribe to the topic.</li>
             * <li><strong>6</strong>: The current account can publish messages to and subscribe to the topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder relation(Integer relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>The relationship between the current account and the topic. The value of this parameter indicates whether the current account is the owner of the topic, and whether the current account can subscribe or publish messages to the topic. the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Publish and subscribe</p>
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            /**
             * <p>The description of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the topic that is asynchronously created. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The topic is being created.</li>
             * <li><strong>1</strong>: The topic is being used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The tags that are attached to the topic.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public PublishInfoDo build() {
                return new PublishInfoDo(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsTopicListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsTopicListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishInfoDo")
        private java.util.List < PublishInfoDo> publishInfoDo;

        private Data(Builder builder) {
            this.publishInfoDo = builder.publishInfoDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return publishInfoDo
         */
        public java.util.List < PublishInfoDo> getPublishInfoDo() {
            return this.publishInfoDo;
        }

        public static final class Builder {
            private java.util.List < PublishInfoDo> publishInfoDo; 

            /**
             * PublishInfoDo.
             */
            public Builder publishInfoDo(java.util.List < PublishInfoDo> publishInfoDo) {
                this.publishInfoDo = publishInfoDo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
