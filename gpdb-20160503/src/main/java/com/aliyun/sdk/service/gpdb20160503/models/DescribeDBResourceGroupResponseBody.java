// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBResourceGroupResponseBody</p>
 */
public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupItems")
    private ResourceGroupItems resourceGroupItems;

    private DescribeDBResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupItems = builder.resourceGroupItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBResourceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupItems
     */
    public ResourceGroupItems getResourceGroupItems() {
        return this.resourceGroupItems;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceGroupItems resourceGroupItems; 

        private Builder() {
        } 

        private Builder(DescribeDBResourceGroupResponseBody model) {
            this.requestId = model.requestId;
            this.resourceGroupItems = model.resourceGroupItems;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried resource group information.</p>
         */
        public Builder resourceGroupItems(ResourceGroupItems resourceGroupItems) {
            this.resourceGroupItems = resourceGroupItems;
            return this;
        }

        public DescribeDBResourceGroupResponseBody build() {
            return new DescribeDBResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<String> role;

        private RoleList(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List<String> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<String> role; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.role = model.role;
            } 

            /**
             * Role.
             */
            public Builder role(java.util.List<String> role) {
                this.role = role;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class ResourceGroupItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupConfig")
        private String resourceGroupConfig;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @com.aliyun.core.annotation.NameInMap("RoleList")
        private RoleList roleList;

        private ResourceGroupItem(Builder builder) {
            this.resourceGroupConfig = builder.resourceGroupConfig;
            this.resourceGroupName = builder.resourceGroupName;
            this.roleList = builder.roleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupItem create() {
            return builder().build();
        }

        /**
         * @return resourceGroupConfig
         */
        public String getResourceGroupConfig() {
            return this.resourceGroupConfig;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return roleList
         */
        public RoleList getRoleList() {
            return this.roleList;
        }

        public static final class Builder {
            private String resourceGroupConfig; 
            private String resourceGroupName; 
            private RoleList roleList; 

            private Builder() {
            } 

            private Builder(ResourceGroupItem model) {
                this.resourceGroupConfig = model.resourceGroupConfig;
                this.resourceGroupName = model.resourceGroupName;
                this.roleList = model.roleList;
            } 

            /**
             * <p>The configurations of the resource group.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>CpuRateLimit: the percentage of CPU resources that are available for the resource group. Unit: %.</p>
             * </li>
             * <li><p>MemoryLimit: the percentage of memory resources that are available for the resource group. Unit: %.</p>
             * </li>
             * <li><p>MemorySharedQuota: the percentage of memory resources shared among transactions that are submitted to the resource group. Unit: %. Default value: 80.</p>
             * </li>
             * <li><p>MemorySpillRatio: the memory spill ratio for memory-intensive transactions. When the memory that is used by memory-intensive transactions reaches this value, data is spilled to disks. Unit: %. Default value: 0.</p>
             * </li>
             * <li><p>Concurrency: the maximum number of concurrent transactions or parallel queries that are allowed for a resource group. Default value: 20.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;CpuRateLimit&quot;:&quot;10&quot;,&quot;MemoryLimit&quot;:&quot;12&quot;,&quot;MemorySharedQuota&quot;:&quot;20&quot;,&quot;MemorySpillRatio&quot;:&quot;75&quot;,&quot;Concurrency&quot;:&quot;3&quot;}</p>
             */
            public Builder resourceGroupConfig(String resourceGroupConfig) {
                this.resourceGroupConfig = resourceGroupConfig;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup</p>
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * <p>The roles.</p>
             */
            public Builder roleList(RoleList roleList) {
                this.roleList = roleList;
                return this;
            }

            public ResourceGroupItem build() {
                return new ResourceGroupItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBResourceGroupResponseBody</p>
     */
    public static class ResourceGroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupItem")
        private java.util.List<ResourceGroupItem> resourceGroupItem;

        private ResourceGroupItems(Builder builder) {
            this.resourceGroupItem = builder.resourceGroupItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupItems create() {
            return builder().build();
        }

        /**
         * @return resourceGroupItem
         */
        public java.util.List<ResourceGroupItem> getResourceGroupItem() {
            return this.resourceGroupItem;
        }

        public static final class Builder {
            private java.util.List<ResourceGroupItem> resourceGroupItem; 

            private Builder() {
            } 

            private Builder(ResourceGroupItems model) {
                this.resourceGroupItem = model.resourceGroupItem;
            } 

            /**
             * ResourceGroupItem.
             */
            public Builder resourceGroupItem(java.util.List<ResourceGroupItem> resourceGroupItem) {
                this.resourceGroupItem = resourceGroupItem;
                return this;
            }

            public ResourceGroupItems build() {
                return new ResourceGroupItems(this);
            } 

        } 

    }
}
