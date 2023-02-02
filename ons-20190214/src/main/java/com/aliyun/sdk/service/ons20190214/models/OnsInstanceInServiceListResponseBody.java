// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceInServiceListResponseBody} extends {@link TeaModel}
 *
 * <p>OnsInstanceInServiceListResponseBody</p>
 */
public class OnsInstanceInServiceListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The returned list of all published instances.
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

        public OnsInstanceInServiceListResponseBody build() {
            return new OnsInstanceInServiceListResponseBody(this);
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
    public static class InstanceVO extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("IndependentNaming")
        private Boolean independentNaming;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private Integer instanceStatus;

        @NameInMap("InstanceType")
        private Integer instanceType;

        @NameInMap("ReleaseTime")
        private Long releaseTime;

        @NameInMap("Tags")
        private Tags tags;

        private InstanceVO(Builder builder) {
            this.createTime = builder.createTime;
            this.independentNaming = builder.independentNaming;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.releaseTime = builder.releaseTime;
            this.tags = builder.tags;
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

        public static final class Builder {
            private Long createTime; 
            private Boolean independentNaming; 
            private String instanceId; 
            private String instanceName; 
            private Integer instanceStatus; 
            private Integer instanceType; 
            private Long releaseTime; 
            private Tags tags; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * The name of the instance.
             * <p>
             * 
             * The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   **0**: The instance is being deployed. This value is valid only for Enterprise Platinum Edition instances.
             * *   **2**: The instance has overdue payments. This value is valid only for Standard Edition instances.
             * *   **5**: The instance is running. This value is valid for Standard Edition instances and Enterprise Platinum Edition instances.
             * *   **7**: The instance is being upgraded and is running. This value is valid only for Enterprise Platinum Edition instances.
             */
            public Builder instanceStatus(Integer instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The instance type. Valid values:
             * <p>
             * 
             * *   **1**: Standard Edition
             * *   **2**: Enterprise Platinum Edition
             * 
             * For more information about the instance editions and differences between the editions, see [Instance editions](~~185261~~).
             */
            public Builder instanceType(Integer instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The point in time when the instance expires. If the instance is an Enterprise Platinum Edition instance, this parameter is returned.
             */
            public Builder releaseTime(Long releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The tags that are attached to the instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public InstanceVO build() {
                return new InstanceVO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("InstanceVO")
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
