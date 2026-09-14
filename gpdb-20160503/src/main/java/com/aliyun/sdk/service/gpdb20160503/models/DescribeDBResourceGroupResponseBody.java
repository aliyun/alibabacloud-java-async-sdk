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
         * ResourceGroupItems.
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
             * ResourceGroupConfig.
             */
            public Builder resourceGroupConfig(String resourceGroupConfig) {
                this.resourceGroupConfig = resourceGroupConfig;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * RoleList.
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
