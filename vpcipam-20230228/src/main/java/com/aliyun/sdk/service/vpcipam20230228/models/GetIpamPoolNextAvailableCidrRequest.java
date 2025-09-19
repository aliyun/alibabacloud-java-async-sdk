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
 * {@link GetIpamPoolNextAvailableCidrRequest} extends {@link RequestModel}
 *
 * <p>GetIpamPoolNextAvailableCidrRequest</p>
 */
public class GetIpamPoolNextAvailableCidrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrMask")
    private Integer cidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetIpamPoolNextAvailableCidrRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.cidrMask = builder.cidrMask;
        this.clientToken = builder.clientToken;
        this.ipamPoolId = builder.ipamPoolId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpamPoolNextAvailableCidrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return cidrMask
     */
    public Integer getCidrMask() {
        return this.cidrMask;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ipamPoolId
     */
    public String getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetIpamPoolNextAvailableCidrRequest, Builder> {
        private String cidrBlock; 
        private Integer cidrMask; 
        private String clientToken; 
        private String ipamPoolId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetIpamPoolNextAvailableCidrRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.cidrMask = request.cidrMask;
            this.clientToken = request.clientToken;
            this.ipamPoolId = request.ipamPoolId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>CIDR to be allocated.</p>
         * <blockquote>
         * <p> You must enter at least one of the CidrBlock and CidrMask fields.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.68.0.0/26</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The length of the CIDR mask to be allocated.</p>
         * <blockquote>
         * <p> You must enter at least one of the CidrBlock and CidrMask fields.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        public Builder cidrMask(Integer cidrMask) {
            this.putQueryParameter("CidrMask", cidrMask);
            this.cidrMask = cidrMask;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the IPAM pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        public Builder ipamPoolId(String ipamPoolId) {
            this.putQueryParameter("IpamPoolId", ipamPoolId);
            this.ipamPoolId = ipamPoolId;
            return this;
        }

        /**
         * <p>The region of the IPAM pool.</p>
         * <blockquote>
         * <p> If the IPAM pool has the region attribute, this parameter is set to the effective region of the IPAM pool. If not, this is set to the hosted region.</p>
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
        public GetIpamPoolNextAvailableCidrRequest build() {
            return new GetIpamPoolNextAvailableCidrRequest(this);
        } 

    } 

}
