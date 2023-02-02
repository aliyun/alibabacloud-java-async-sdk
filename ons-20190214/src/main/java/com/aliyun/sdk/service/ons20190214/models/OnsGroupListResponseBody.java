// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsGroupListResponseBody</p>
 */
public class OnsGroupListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsGroupListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupListResponseBody create() {
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
         * The returned list of subscriptions.
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

        public OnsGroupListResponseBody build() {
            return new OnsGroupListResponseBody(this);
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
    public static class SubscribeInfoDo extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private SubscribeInfoDo(Builder builder) {
            this.createTime = builder.createTime;
            this.groupId = builder.groupId;
            this.groupType = builder.groupType;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.owner = builder.owner;
            this.remark = builder.remark;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscribeInfoDo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String groupId; 
            private String groupType; 
            private Boolean independentNaming; 
            private String instanceId; 
            private String owner; 
            private String remark; 
            private Tags tags; 
            private Long updateTime; 

            /**
             * The time when the group was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the consumer group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The protocol over which the queried consumer groups consume messages. All clients in a consumer group communicate with the Message Queue for Apache RocketMQ broker over the same protocol. A consumer group cannot contain TCP clients and HTTP clients at the same time. You must create different consumer groups for TCP clients and HTTP clients. Valid values:
             * <p>
             * 
             * *   **tcp**: indicates that the consumer group consumes messages over TCP.
             * *   **http**: indicates that the consumer group consumes messages over HTTP.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * Indicates whether the instance uses a namespace. Valid values:
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
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the user who created the consumer group.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The description of the consumer group.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The tags that are attached to the consumer group.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The time when the group ID was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SubscribeInfoDo build() {
                return new SubscribeInfoDo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SubscribeInfoDo")
        private java.util.List < SubscribeInfoDo> subscribeInfoDo;

        private Data(Builder builder) {
            this.subscribeInfoDo = builder.subscribeInfoDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return subscribeInfoDo
         */
        public java.util.List < SubscribeInfoDo> getSubscribeInfoDo() {
            return this.subscribeInfoDo;
        }

        public static final class Builder {
            private java.util.List < SubscribeInfoDo> subscribeInfoDo; 

            /**
             * SubscribeInfoDo.
             */
            public Builder subscribeInfoDo(java.util.List < SubscribeInfoDo> subscribeInfoDo) {
                this.subscribeInfoDo = subscribeInfoDo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
