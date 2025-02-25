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
    private java.util.List<ResourceGroupItems> resourceGroupItems;

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
    public java.util.List<ResourceGroupItems> getResourceGroupItems() {
        return this.resourceGroupItems;
    }

    public static final class Builder extends Request.Builder<ModifyDBResourceGroupRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private java.util.List<ResourceGroupItems> resourceGroupItems; 

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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
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
         * <p>The information about the resource group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceGroupItems(java.util.List<ResourceGroupItems> resourceGroupItems) {
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

    /**
     * 
     * {@link ModifyDBResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBResourceGroupRequest</p>
     */
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
             * <p>The configurations of the resource group to which you want to modify.</p>
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup</p>
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
