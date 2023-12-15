// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGadInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteGadInstanceRequest</p>
 */
public class DeleteGadInstanceRequest extends Request {
    @Query
    @NameInMap("GadInstanceName")
    @Validation(required = true)
    private String gadInstanceName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DeleteGadInstanceRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGadInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
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

    public static final class Builder extends Request.Builder<DeleteGadInstanceRequest, Builder> {
        private String gadInstanceName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGadInstanceRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the global active database cluster. You can call the GadInstanceName operation to query the cluster ID.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * The region ID of the central node of the global active database cluster. The central node refers to the primary node. You can call the DescribeGadInstances operation to query the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DeleteGadInstanceRequest build() {
            return new DeleteGadInstanceRequest(this);
        } 

    } 

}
