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
 * {@link CreateIpamPoolAllocationRequest} extends {@link RequestModel}
 *
 * <p>CreateIpamPoolAllocationRequest</p>
 */
public class CreateIpamPoolAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cidr")
    private String cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrMask")
    private Integer cidrMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationDescription")
    private String ipamPoolAllocationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
    private String ipamPoolAllocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateIpamPoolAllocationRequest(Builder builder) {
        super(builder);
        this.cidr = builder.cidr;
        this.cidrMask = builder.cidrMask;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamPoolAllocationDescription = builder.ipamPoolAllocationDescription;
        this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
        this.ipamPoolId = builder.ipamPoolId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamPoolAllocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidr
     */
    public String getCidr() {
        return this.cidr;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipamPoolAllocationDescription
     */
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    /**
     * @return ipamPoolAllocationName
     */
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
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

    public static final class Builder extends Request.Builder<CreateIpamPoolAllocationRequest, Builder> {
        private String cidr; 
        private Integer cidrMask; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamPoolAllocationDescription; 
        private String ipamPoolAllocationName; 
        private String ipamPoolId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpamPoolAllocationRequest request) {
            super(request);
            this.cidr = request.cidr;
            this.cidrMask = request.cidrMask;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamPoolAllocationDescription = request.ipamPoolAllocationDescription;
            this.ipamPoolAllocationName = request.ipamPoolAllocationName;
            this.ipamPoolId = request.ipamPoolId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Enter a CIDR block to reserve a custom CIDR block.</p>
         * <p><strong>Usage notes</strong> Specify at least one of <strong>Cidr</strong> and <strong>CidrMask</strong> .</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * <p>Enter a mask to reserve a custom CIDR block.</p>
         * <p><strong>Usage notes</strong> Specify at least one of <strong>Cidr</strong> and <strong>CidrMask</strong> .</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder cidrMask(Integer cidrMask) {
            this.putQueryParameter("CidrMask", cidrMask);
            this.cidrMask = cidrMask;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <p><strong>Usage notes</strong> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The description of the allocation.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.putQueryParameter("IpamPoolAllocationDescription", ipamPoolAllocationDescription);
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * <p>The name of the allocation.</p>
         * 
         * <strong>example:</strong>
         * <p>test name</p>
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.putQueryParameter("IpamPoolAllocationName", ipamPoolAllocationName);
            this.ipamPoolAllocationName = ipamPoolAllocationName;
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
         * <p>The region ID of the custom CIDR block that you want to reserve.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public CreateIpamPoolAllocationRequest build() {
            return new CreateIpamPoolAllocationRequest(this);
        } 

    } 

}
