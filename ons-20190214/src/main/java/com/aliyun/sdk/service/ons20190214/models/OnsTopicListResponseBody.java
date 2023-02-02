// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTopicListResponseBody</p>
 */
public class OnsTopicListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The information about the topics.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. This is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTopicListResponseBody build() {
            return new OnsTopicListResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
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
    public static class PublishInfoDo extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MessageType")
        private Integer messageType;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Relation")
        private Integer relation;

        @NameInMap("RelationName")
        private String relationName;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Topic")
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
             * The point in time when the topic was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the instance that contains the topic uses a namespace. Valid values:
             * <p>
             * 
             * *   **true**: The instance uses a separate namespace. The name of each resource must be unique in the instance. The names of resources in different instances can be the same.
             * *   **false**: The instance does not use a separate namespace. The name of each resource must be globally unique within and across all instances.
             */
            public Builder independentNaming(Boolean independentNaming) {
                this.independentNaming = independentNaming;
                return this;
            }

            /**
             * The ID of the instance that contains the topic.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the messages. Valid values:
             * <p>
             * 
             * *   **0**: normal messages
             * *   **1**: partitionally ordered messages
             * *   **2**: globally ordered messages
             * *   **4**: transactional messages
             * *   **5**: scheduled or delayed messages
             */
            public Builder messageType(Integer messageType) {
                this.messageType = messageType;
                return this;
            }

            /**
             * The user ID of the topic owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The code of the relationship between the current account and the topic. Valid values:
             * <p>
             * 
             * *   **1**: The current account is the owner of the topic.
             * *   **2**: The current account can publish messages to the topic.
             * *   **4**: The current account can subscribe to the topic.
             * *   **6**: The current account can publish messages to and subscribe to the topic.
             */
            public Builder relation(Integer relation) {
                this.relation = relation;
                return this;
            }

            /**
             * The name of the relationship between the current account and the topic. The value of this parameter indicates that the current account is the owner of the topic, the current account can publish messages to the topic, the current account can subscribe to the topic, or the current account can publish messages to and subscribe to the topic.
             */
            public Builder relationName(String relationName) {
                this.relationName = relationName;
                return this;
            }

            /**
             * The description of the topic.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the topic. Valid values:
             * <p>
             * 
             * *   **0**: The topic is being created.
             * *   **1**: The topic is being used.
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * The tags that are attached to the topic.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The name of the topic.
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
    public static class Data extends TeaModel {
        @NameInMap("PublishInfoDo")
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
