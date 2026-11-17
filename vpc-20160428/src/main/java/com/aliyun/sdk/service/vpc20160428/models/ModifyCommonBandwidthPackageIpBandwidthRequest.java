// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyCommonBandwidthPackageIpBandwidthRequest} extends {@link RequestModel}
 *
 * <p>ModifyCommonBandwidthPackageIpBandwidthRequest</p>
 */
public class ModifyCommonBandwidthPackageIpBandwidthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipId")
    private String eipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpInstanceId")
    private String ipInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyCommonBandwidthPackageIpBandwidthRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.eipId = builder.eipId;
        this.ipInstanceId = builder.ipInstanceId;
        this.ipType = builder.ipType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCommonBandwidthPackageIpBandwidthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public String getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return eipId
     */
    public String getEipId() {
        return this.eipId;
    }

    /**
     * @return ipInstanceId
     */
    public String getIpInstanceId() {
        return this.ipInstanceId;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyCommonBandwidthPackageIpBandwidthRequest, Builder> {
        private String bandwidth; 
        private String bandwidthPackageId; 
        private String eipId; 
        private String ipInstanceId; 
        private String ipType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCommonBandwidthPackageIpBandwidthRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.eipId = request.eipId;
            this.ipInstanceId = request.ipInstanceId;
            this.ipType = request.ipType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The maximum bandwidth that can be allocated in the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder bandwidth(String bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The instance ID of the Internet Shared Bandwidth.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-2zep6hw5d6y8exscd****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The ID of the EIP that is added to the Internet Shared Bandwidth instance. This parameter applies only to EIPs. For IPv6 addresses, use IpInstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-2zewysoansu0svfbg****</p>
         */
        public Builder eipId(String eipId) {
            this.putQueryParameter("EipId", eipId);
            this.eipId = eipId;
            return this;
        }

        /**
         * <p>The ID of the public IP address instance for which you want to set the maximum available bandwidth in the Internet Shared Bandwidth instance. This parameter and EipId are mutually exclusive. We recommend that you use this parameter for new workloads. If IpType is set to <strong>VpcIpv6</strong>, specify the ID of the IPv6 address.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-2zewysoansu0svfbg****</p>
         */
        public Builder ipInstanceId(String ipInstanceId) {
            this.putQueryParameter("IpInstanceId", ipInstanceId);
            this.ipInstanceId = ipInstanceId;
            return this;
        }

        /**
         * <p>The resource type of the public IP address for which you want to set the maximum available bandwidth in the Internet Shared Bandwidth instance. Valid values:</p>
         * <ul>
         * <li><strong>EIP</strong>: the public IP address of an EIP.</li>
         * <li><strong>VpcIpv6</strong>: the IPv6 address of a VPC.</li>
         * </ul>
         * <p>If this parameter is not specified, the default value is <strong>EIP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the Internet Shared Bandwidth instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyCommonBandwidthPackageIpBandwidthRequest build() {
            return new ModifyCommonBandwidthPackageIpBandwidthRequest(this);
        } 

    } 

}
