// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBResourceGroupRequest</p>
 */
public class ModifyDBResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ResourceGroupItems> resourceGroupItems;

    private ModifyDBResourceGroupRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceGroupItems = builder.resourceGroupItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupItems
     */
    public java.util.List < ResourceGroupItems> getResourceGroupItems() {
        return this.resourceGroupItems;
    }

    public static final class Builder extends Request.Builder<ModifyDBResourceGroupRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private java.util.List < ResourceGroupItems> resourceGroupItems; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBResourceGroupRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.resourceGroupItems = request.resourceGroupItems;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceGroupItems.
         */
        public Builder resourceGroupItems(java.util.List < ResourceGroupItems> resourceGroupItems) {
            String resourceGroupItemsShrink = shrink(resourceGroupItems, "ResourceGroupItems", "json");
            this.putQueryParameter("ResourceGroupItems", resourceGroupItemsShrink);
            this.resourceGroupItems = resourceGroupItems;
            return this;
        }

        @Override
        public ModifyDBResourceGroupRequest build() {
            return new ModifyDBResourceGroupRequest(this);
        } 

    } 

    public static class ResourceGroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceGroupConfig;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceGroupName;

        private ResourceGroupItems(Builder builder) {
            this.resourceGroupConfig = builder.resourceGroupConfig;
            this.resourceGroupName = builder.resourceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroupItems create() {
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

        public static final class Builder {
            private String resourceGroupConfig; 
            private String resourceGroupName; 

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

            public ResourceGroupItems build() {
                return new ResourceGroupItems(this);
            } 

        } 

    }
}
