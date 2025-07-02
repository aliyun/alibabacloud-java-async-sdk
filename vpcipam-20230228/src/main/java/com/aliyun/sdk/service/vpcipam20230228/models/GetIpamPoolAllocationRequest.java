// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link GetIpamPoolAllocationRequest} extends {@link RequestModel}
 *
 * <p>GetIpamPoolAllocationRequest</p>
 */
public class GetIpamPoolAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolAllocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetIpamPoolAllocationRequest(Builder builder) {
        super(builder);
        this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpamPoolAllocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipamPoolAllocationId
     */
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetIpamPoolAllocationRequest, Builder> {
        private String ipamPoolAllocationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetIpamPoolAllocationRequest request) {
            super(request);
            this.ipamPoolAllocationId = request.ipamPoolAllocationId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.putQueryParameter("IpamPoolAllocationId", ipamPoolAllocationId);
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * <p>The region of the IPAM pool.</p>
         * <blockquote>
         * <p> If the IPAM pool to which CIDR allocation belongs has the region attribute, this parameter is the region of the IPAM pool. If not, this parameter is the IPAM managed region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetIpamPoolAllocationRequest build() {
            return new GetIpamPoolAllocationRequest(this);
        } 

    } 

}
