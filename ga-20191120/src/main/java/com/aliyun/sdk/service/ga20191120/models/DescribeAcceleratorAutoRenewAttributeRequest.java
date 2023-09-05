// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAcceleratorAutoRenewAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAcceleratorAutoRenewAttributeRequest</p>
 */
public class DescribeAcceleratorAutoRenewAttributeRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeAcceleratorAutoRenewAttributeRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAcceleratorAutoRenewAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAcceleratorAutoRenewAttributeRequest, Builder> {
        private String acceleratorId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAcceleratorAutoRenewAttributeRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAcceleratorAutoRenewAttributeRequest build() {
            return new DescribeAcceleratorAutoRenewAttributeRequest(this);
        } 

    } 

}
