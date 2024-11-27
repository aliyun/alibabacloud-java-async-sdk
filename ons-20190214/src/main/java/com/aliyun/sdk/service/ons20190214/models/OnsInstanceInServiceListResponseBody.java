// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceInServiceListResponseBody</p>
 */
public class OnsInstanceInServiceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OnsInstanceInServiceListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceInServiceListResponseBody create() {
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
         * <p>The returned information about the queried instances.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0598E46F-DB06-40E2-AD7B-C45923EE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsInstanceInServiceListResponseBody build() {
            return new OnsInstanceInServiceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceInServiceListResponseBody</p>
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
             * <p>ServiceA</p>
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
     * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceInServiceListResponseBody</p>
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
     * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceInServiceListResponseBody</p>
     */
    public static class InstanceVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private Integer instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private Integer instanceType;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private Long releaseTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TopicCount")
        private Integer topicCount;

        private InstanceVO(Builder builder) {
            this.createTime = builder.createTime;
            this.groupCount = builder.groupCount;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.releaseTime = builder.releaseTime;
            this.tags = builder.tags;
            this.topicCount = builder.topicCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceVO create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public Integer getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return releaseTime
         */
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topicCount
         */
        public Integer getTopicCount() {
            return this.topicCount;
        }

        public static final class Builder {
            private Long createTime; 
            private Integer groupCount; 
            private Boolean independentNaming; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceStatus; 
            private Integer instanceType; 
            private Long releaseTime; 
            private Tags tags; 
            private Integer topicCount; 

            /**
             * <p>The time when the instance was created. The value of this parameter is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640847284000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of consumer groups.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>Indicates whether a namespace is used for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: A separate namespace is used for the instance. The identifier of each resource in the instance must be unique within the instance. However, the identifier of a resource in the instance can be the same as the identifier of a resource in another instance that uses a different namespace.</li>
             * <li><strong>false</strong>: A separate namespace is not used for the instance. The name of each resource must be globally unique within the instance and across all instances.</li>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>MQ_INST_188077086902****_BXSuW61e</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * <p>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.</li>
             * <li><strong>2</strong>: The instance has overdue payments. This value is valid only for Standard Edition instances.</li>
             * <li><strong>5</strong>: The instance is running. This value is valid only for Standard Edition instances and Enterprise Platinum Edition instances.</li>
             * <li><strong>7</strong>: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder instanceStatus(Integer instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Standard Edition</li>
             * <li><strong>2</strong>: Enterprise Platinum Edition</li>
             * </ul>
             * <p>For information about the instance editions and the differences between the editions, see <a href="https://help.aliyun.com/document_detail/185261.html">Instance editions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The time when the instance expires. If the instance is of Enterprise Platinum Edition, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1551024000000</p>
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * <p>The tags that are attached to the instance.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The number of topics.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder topicCount(Integer topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            public InstanceVO build() {
                return new InstanceVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
     *
     * <p>OnsInstanceInServiceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceVO")
        private java.util.List < InstanceVO> instanceVO;

        private Data(Builder builder) {
            this.instanceVO = builder.instanceVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceVO
         */
        public java.util.List < InstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

        public static final class Builder {
            private java.util.List < InstanceVO> instanceVO; 

            /**
             * InstanceVO.
             */
            public Builder instanceVO(java.util.List < InstanceVO> instanceVO) {
                this.instanceVO = instanceVO;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
