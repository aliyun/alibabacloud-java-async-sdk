// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceGroupAttributeRequest</p>
 */
public class UpdateResourceGroupAttributeRequest extends Request {
    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("NewResourceGroupId")
    @Validation(required = true)
    private String newResourceGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateResourceGroupAttributeRequest(Builder builder) {
        super(builder);
        this.drdsInstanceId = builder.drdsInstanceId;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateResourceGroupAttributeRequest, Builder> {
        private String drdsInstanceId; 
        private String newResourceGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupAttributeRequest request) {
            super(request);
            this.drdsInstanceId = request.drdsInstanceId;
            this.newResourceGroupId = request.newResourceGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the instance that you want to transfer.
         * <p>
         * 
         * >  You can call the [DescribeDrdsInstances](~~139284~~) operation to view the details of the instances under the account, including the instance IDs.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The ID of the resource group that you want to specify.
         * <p>
         * 
         * >  You can call the [ListResourceGroups](~~158855~~) operation to view the details of the resource groups, including the resource group IDs.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.putQueryParameter("NewResourceGroupId", newResourceGroupId);
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * The ID of the region where the instance you want to transfer is located.
         * <p>
         * 
         * >  You can call the [DescribeDrdsInstances](~~139284~~) operation to view the details of the instances under the account, including the region IDs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateResourceGroupAttributeRequest build() {
            return new UpdateResourceGroupAttributeRequest(this);
        } 

    } 

}
