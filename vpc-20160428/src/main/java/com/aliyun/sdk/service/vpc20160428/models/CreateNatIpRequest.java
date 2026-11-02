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
 * {@link CreateNatIpRequest} extends {@link RequestModel}
 *
 * <p>CreateNatIpRequest</p>
 */
public class CreateNatIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4Prefix")
    private String ipv4Prefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4PrefixCount")
    private Integer ipv4PrefixCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIp")
    private String natIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natIpCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpDescription")
    private String natIpDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpName")
    private String natIpName;

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

    private CreateNatIpRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipv4Prefix = builder.ipv4Prefix;
        this.ipv4PrefixCount = builder.ipv4PrefixCount;
        this.natGatewayId = builder.natGatewayId;
        this.natIp = builder.natIp;
        this.natIpCidr = builder.natIpCidr;
        this.natIpDescription = builder.natIpDescription;
        this.natIpName = builder.natIpName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ipv4Prefix
     */
    public String getIpv4Prefix() {
        return this.ipv4Prefix;
    }

    /**
     * @return ipv4PrefixCount
     */
    public Integer getIpv4PrefixCount() {
        return this.ipv4PrefixCount;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpCidr
     */
    public String getNatIpCidr() {
        return this.natIpCidr;
    }

    /**
     * @return natIpDescription
     */
    public String getNatIpDescription() {
        return this.natIpDescription;
    }

    /**
     * @return natIpName
     */
    public String getNatIpName() {
        return this.natIpName;
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

    public static final class Builder extends Request.Builder<CreateNatIpRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipv4Prefix; 
        private Integer ipv4PrefixCount; 
        private String natGatewayId; 
        private String natIp; 
        private String natIpCidr; 
        private String natIpDescription; 
        private String natIpName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNatIpRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipv4Prefix = request.ipv4Prefix;
            this.ipv4PrefixCount = request.ipv4PrefixCount;
            this.natGatewayId = request.natGatewayId;
            this.natIp = request.natIp;
            this.natIpCidr = request.natIpCidr;
            this.natIpDescription = request.natIpDescription;
            this.natIpName = request.natIpName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The system performs a dry run on the request without creating the NAT IP address. The system checks whether your AccessKey pair is valid, whether the Resource Access Management (RAM) user has the required authorization, and whether the required parameters are specified. If the request fails the dry run, the corresponding error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): The system sends a normal request. If the request passes the dry run, a 2xx HTTP status code is returned and the NAT IP address is created.</p>
         * </li>
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
         * <p>The IP prefix CIDR block.</p>
         * <p>The IP prefix CIDR block must fall within the reserved CIDR block of the vSwitch to which the NAT gateway belongs, and the reserved CIDR block must not be occupied. The mask of the IP prefix must be /28.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/28</p>
         */
        public Builder ipv4Prefix(String ipv4Prefix) {
            this.putQueryParameter("Ipv4Prefix", ipv4Prefix);
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }

        /**
         * <p>The number of IP prefixes to be automatically allocated.</p>
         * <p>The IP prefixes are randomly allocated from the unallocated reserved CIDR block of the vSwitch to which the NAT gateway belongs. Valid values: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ipv4PrefixCount(Integer ipv4PrefixCount) {
            this.putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount);
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        /**
         * <p>The instance ID of the VPC NAT gateway to which the NAT IP address belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The NAT IP address.</p>
         * <p>If you do not specify an IP address, the system randomly allocates an IP address from the NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.34</p>
         */
        public Builder natIp(String natIp) {
            this.putQueryParameter("NatIp", natIp);
            this.natIp = natIp;
            return this;
        }

        /**
         * <p>The CIDR block from which the NAT IP address is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder natIpCidr(String natIpCidr) {
            this.putQueryParameter("NatIpCidr", natIpCidr);
            this.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * <p>The description of the NAT IP address.</p>
         * <p>The description must be 2 to 256 characters in length, and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder natIpDescription(String natIpDescription) {
            this.putQueryParameter("NatIpDescription", natIpDescription);
            this.natIpDescription = natIpDescription;
            return this;
        }

        /**
         * <p>The name of the NAT IP address.</p>
         * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>newnatip</p>
         */
        public Builder natIpName(String natIpName) {
            this.putQueryParameter("NatIpName", natIpName);
            this.natIpName = natIpName;
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
         * <p>The region ID of the NAT gateway instance to which the NAT IP address belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eu-central-1</p>
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
        public CreateNatIpRequest build() {
            return new CreateNatIpRequest(this);
        } 

    } 

}
