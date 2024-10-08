// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourceGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The resource groups.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListResourceGroupsResponseBody build() {
            return new ListResourceGroupsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizExtKey")
        private String bizExtKey;

        @com.aliyun.core.annotation.NameInMap("Cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableKp")
        private Boolean enableKp;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupType")
        private String resourceGroupType;

        @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("Specs")
        private java.util.Map < String, ? > specs;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.bizExtKey = builder.bizExtKey;
            this.cluster = builder.cluster;
            this.createTime = builder.createTime;
            this.enableKp = builder.enableKp;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.isDefault = builder.isDefault;
            this.mode = builder.mode;
            this.name = builder.name;
            this.resourceGroupType = builder.resourceGroupType;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.sequence = builder.sequence;
            this.specs = builder.specs;
            this.status = builder.status;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizExtKey
         */
        public String getBizExtKey() {
            return this.bizExtKey;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableKp
         */
        public Boolean getEnableKp() {
            return this.enableKp;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupType
         */
        public String getResourceGroupType() {
            return this.resourceGroupType;
        }

        /**
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return specs
         */
        public java.util.Map < String, ? > getSpecs() {
            return this.specs;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String bizExtKey; 
            private String cluster; 
            private String createTime; 
            private Boolean enableKp; 
            private Long id; 
            private String identifier; 
            private Boolean isDefault; 
            private String mode; 
            private String name; 
            private String resourceGroupType; 
            private String resourceManagerResourceGroupId; 
            private Integer sequence; 
            private java.util.Map < String, ? > specs; 
            private Integer status; 
            private java.util.List < Tags> tags; 
            private Long tenantId; 
            private String updateTime; 

            /**
             * The category of the resource group. Valid values:
             * <p>
             * 
             * *   default: shared resource group
             * *   single: exclusive resource group
             */
            public Builder bizExtKey(String bizExtKey) {
                this.bizExtKey = bizExtKey;
                return this;
            }

            /**
             * The name of the cluster. This parameter is returned only if the type of the resource group is MaxCompute or PAI.
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * The time when the cluster was created. Example: Jul 9, 2018 2:43:37 PM.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether the UID of an Alibaba Cloud account is used for access. Valid values:
             * <p>
             * 
             * *   true: The MaxCompute compute engine uses the UID of the Alibaba Cloud account as the display name of the account for access.
             * *   false: The MaxCompute compute engine uses the name of the Alibaba Cloud account as the display name of the account for access. The remaining values are useless. This parameter is returned only if the type of the resource group is MaxCompute.
             */
            public Builder enableKp(Boolean enableKp) {
                this.enableKp = enableKp;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The identifier of the resource group.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * Indicates whether the resource group is the default resource group. Valid values:
             * <p>
             * 
             * *   true: The resource group is the default resource group.
             * *   false: The resource group is not the default resource group.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The mode of the resource group. Valid values:
             * <p>
             * 
             * *   ISOLATE: exclusive resource group that adopts the subscription billing method
             * *   SHARE: shared resource group that adopts the pay-as-you-go billing method
             * *   DEVELOP: resource group for developers
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the resource group. Valid values:
             * <p>
             * 
             * *   0: DataWorks
             * *   2: MaxCompute
             * *   3: PAI
             * *   4: Data Integration
             * *   7: scheduling
             * *   9: DataService Studio
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            /**
             * The ID of your Alibaba Cloud resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The sequence number of the resource group. Created resource groups are sorted in ascending order by sequence number.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * The details of the resource group. The content enclosed in braces {} is the details of the resource group.
             */
            public Builder specs(java.util.Map < String, ? > specs) {
                this.specs = specs;
                return this;
            }

            /**
             * The status of the resource group. Valid values:
             * <p>
             * 
             * *   0: NORMAL, which indicates that the resource group is running or in service.
             * *   1: STOP, which indicates that the resource group has expired and is frozen.
             * *   2: DELETED, which indicates that the resource group is released or destroyed.
             * *   3: CREATING, which indicates that the resource group is being created or started.
             * *   4: CREATE_FAILED, which indicates that the resource group fails to be created or started.
             * *   5: UPDATING, which indicates that the resource group is being scaled out or upgraded.
             * *   6: UPDATE_FAILED, which indicates that the resource group fails to be scaled out or upgraded.
             * *   7: DELETING, which indicates that the resource group is being released or destroyed.
             * *   8: DELETE_FAILED, which indicates that the resource group fails to be released or destroyed.
             * *   9: TIMEOUT, which indicates that the operation performed on the resource group times out. All operations may time out. This value is temporarily available only for DataService Studio.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The tenant ID.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The time when the resource group was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
