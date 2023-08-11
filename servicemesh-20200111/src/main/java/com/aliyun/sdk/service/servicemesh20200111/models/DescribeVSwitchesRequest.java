// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchesRequest} extends {@link RequestModel}
 *
 * <p>DescribeVSwitchesRequest</p>
 */
public class DescribeVSwitchesRequest extends Request {
    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private DescribeVSwitchesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVSwitchesRequest, Builder> {
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVSwitchesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The VPC ID.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeVSwitchesRequest build() {
            return new DescribeVSwitchesRequest(this);
        } 

    } 

}
