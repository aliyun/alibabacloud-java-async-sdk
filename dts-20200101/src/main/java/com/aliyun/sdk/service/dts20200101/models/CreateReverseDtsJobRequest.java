// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReverseDtsJobRequest} extends {@link RequestModel}
 *
 * <p>CreateReverseDtsJobRequest</p>
 */
public class CreateReverseDtsJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DtsJobId")
    @Validation(required = true)
    private String dtsJobId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateReverseDtsJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dtsJobId = builder.dtsJobId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReverseDtsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateReverseDtsJobRequest, Builder> {
        private String regionId; 
        private String dtsJobId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReverseDtsJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dtsJobId = request.dtsJobId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
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
        public CreateReverseDtsJobRequest build() {
            return new CreateReverseDtsJobRequest(this);
        } 

    } 

}
