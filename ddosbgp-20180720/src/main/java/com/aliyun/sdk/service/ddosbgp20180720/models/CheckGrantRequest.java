// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckGrantRequest} extends {@link RequestModel}
 *
 * <p>CheckGrantRequest</p>
 */
public class CheckGrantRequest extends Request {
    @Query
    @NameInMap("IsSlr")
    private Boolean isSlr;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CheckGrantRequest(Builder builder) {
        super(builder);
        this.isSlr = builder.isSlr;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckGrantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSlr
     */
    public Boolean getIsSlr() {
        return this.isSlr;
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

    public static final class Builder extends Request.Builder<CheckGrantRequest, Builder> {
        private Boolean isSlr; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CheckGrantRequest request) {
            super(request);
            this.isSlr = request.isSlr;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * IsSlr.
         */
        public Builder isSlr(Boolean isSlr) {
            this.putQueryParameter("IsSlr", isSlr);
            this.isSlr = isSlr;
            return this;
        }

        /**
         * WB269094
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CheckGrant
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CheckGrantRequest build() {
            return new CheckGrantRequest(this);
        } 

    } 

}
