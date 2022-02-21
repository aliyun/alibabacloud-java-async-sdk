// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableNacosInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAvailableNacosInstancesRequest</p>
 */
public class DescribeAvailableNacosInstancesRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private DescribeAvailableNacosInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableNacosInstancesRequest create() {
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeAvailableNacosInstancesRequest, Builder> {
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAvailableNacosInstancesRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeAvailableNacosInstancesRequest build() {
            return new DescribeAvailableNacosInstancesRequest(this);
        } 

    } 

}
