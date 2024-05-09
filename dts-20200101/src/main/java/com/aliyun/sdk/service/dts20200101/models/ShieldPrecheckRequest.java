// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShieldPrecheckRequest} extends {@link RequestModel}
 *
 * <p>ShieldPrecheckRequest</p>
 */
public class ShieldPrecheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrecheckItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private String precheckItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ShieldPrecheckRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.precheckItems = builder.precheckItems;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShieldPrecheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return precheckItems
     */
    public String getPrecheckItems() {
        return this.precheckItems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ShieldPrecheckRequest, Builder> {
        private String dtsInstanceId; 
        private String precheckItems; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ShieldPrecheckRequest request) {
            super(request);
            this.dtsInstanceId = request.dtsInstanceId;
            this.precheckItems = request.precheckItems;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the data migration or data synchronization instance. You can call the **DescribeMigrationJobs** or DescribeSynchronizationJobs operation to query the instance ID.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * The precheck items that you want to ignore. Separate multiple items with commas (,). Valid values:
         * <p>
         * 
         * *   **CHECK_SAME_OBJ**: schema name conflict
         * 
         * *   **CHECK_SAME_USER**: multiple usernames for one instance
         * 
         * *   **CHECK_SRC**: source database version
         * 
         * *   **CHECK_TOPOLOGY**: topology
         * 
         * > For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).
         * 
         * *   **CHECK_SERVER_ID**: value of server_id in the source database
         */
        public Builder precheckItems(String precheckItems) {
            this.putQueryParameter("PrecheckItems", precheckItems);
            this.precheckItems = precheckItems;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ShieldPrecheckRequest build() {
            return new ShieldPrecheckRequest(this);
        } 

    } 

}
