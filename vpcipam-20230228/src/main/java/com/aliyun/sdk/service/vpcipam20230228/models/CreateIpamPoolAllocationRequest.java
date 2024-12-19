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
         * Cidr.
         */
        public Builder cidr(String cidr) {
            this.putQueryParameter("Cidr", cidr);
            this.cidr = cidr;
            return this;
        }

        /**
         * CidrMask.
         */
        public Builder cidrMask(Integer cidrMask) {
            this.putQueryParameter("CidrMask", cidrMask);
            this.cidrMask = cidrMask;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IpamPoolAllocationDescription.
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.putQueryParameter("IpamPoolAllocationDescription", ipamPoolAllocationDescription);
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * IpamPoolAllocationName.
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.putQueryParameter("IpamPoolAllocationName", ipamPoolAllocationName);
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
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
