// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupsResponseBody</p>
 */
public class ListResourceGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The time when the resource group was last updated.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The resource groups.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the resource group. Valid values:
         * <p>
         * 
         * *   0: The resource group is running or in service.
         * *   1: The resource group has expired and is frozen.
         * *   2: The resource group is released or destroyed.
         * *   3: The resource group is being created or started.
         * *   4: The resource group fails to be created or started.
         * *   5: The resource group is being scaled out or upgraded.
         * *   6: The resource group fails to be scaled out or upgraded.
         * *   7: The resource group is being released or destroyed.
         * *   8: The resource group fails to be released or destroyed.
         * *   9: The operation performed on the resource group times out. All operations may time out. This value is temporarily available only for DataService Studio.
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("BizExtKey")
        private String bizExtKey;

        @NameInMap("Cluster")
        private String cluster;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EnableKp")
        private Boolean enableKp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupType")
        private String resourceGroupType;

        @NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @NameInMap("Sequence")
        private Integer sequence;

        @NameInMap("Specs")
        private java.util.Map < String, ? > specs;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("UpdateTime")
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
             * The details of the resource group. The content enclosed in braces {} is the details of the resource group.
             */
            public Builder bizExtKey(String bizExtKey) {
                this.bizExtKey = bizExtKey;
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
            public Builder cluster(String cluster) {
                this.cluster = cluster;
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
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the cluster was created. Example: Jul 9, 2018 02:43:37 PM.
             */
            public Builder enableKp(Boolean enableKp) {
                this.enableKp = enableKp;
                return this;
            }

            /**
             * The ID of your Alibaba Cloud resource group.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The category of the resource group. Valid values:
             * <p>
             * 
             * *   default: shared resource group
             * *   single: exclusive resource group
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * Indicates whether the UID of an Alibaba Cloud account is used for access. Valid values:
             * <p>
             * 
             * *   true: The MaxCompute compute engine uses the UID of the Alibaba Cloud account as the display name of the account for access.
             * 
             * *   false: The MaxCompute compute engine uses the name of the Alibaba Cloud account as the display name of the account for access.
             * 
             *     The remaining values are useless. This parameter is returned only if the type of the resource group is MaxCompute.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The sequence number of the resource group. Created resource groups are sorted in ascending order by sequence number.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The identifier of the resource group.
             */
            public Builder resourceGroupType(String resourceGroupType) {
                this.resourceGroupType = resourceGroupType;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The name of the resource group.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder specs(java.util.Map < String, ? > specs) {
                this.specs = specs;
                return this;
            }

            /**
             * Indicates whether the resource group is the default resource group. Valid values:
             * <p>
             * 
             * *   true: The resource group is the default resource group.
             * *   false: The resource group is not the default resource group.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The name of the cluster. This parameter is returned only if the type of the resource group is MaxCompute or PAI.
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
