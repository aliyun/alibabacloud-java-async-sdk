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
 * {@link ModifyVirtualBorderRouterAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVirtualBorderRouterAttributeRequest</p>
 */
public class ModifyVirtualBorderRouterAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedPhysicalConnections")
    private String associatedPhysicalConnections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CircuitCode")
    private String circuitCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectMultiplier")
    private Long detectMultiplier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIpv6")
    private Boolean enableIpv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalGatewayIp")
    private String localGatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalIpv6GatewayIp")
    private String localIpv6GatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRxInterval")
    private Long minRxInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTxInterval")
    private Long minTxInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerGatewayIp")
    private String peerGatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerIpv6GatewayIp")
    private String peerIpv6GatewayIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeeringIpv6SubnetMask")
    private String peeringIpv6SubnetMask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeeringSubnetMask")
    private String peeringSubnetMask;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SitelinkEnable")
    private Boolean sitelinkEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanId")
    private Integer vlanId;

    private ModifyVirtualBorderRouterAttributeRequest(Builder builder) {
        super(builder);
        this.associatedPhysicalConnections = builder.associatedPhysicalConnections;
        this.bandwidth = builder.bandwidth;
        this.circuitCode = builder.circuitCode;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.detectMultiplier = builder.detectMultiplier;
        this.enableIpv6 = builder.enableIpv6;
        this.localGatewayIp = builder.localGatewayIp;
        this.localIpv6GatewayIp = builder.localIpv6GatewayIp;
        this.minRxInterval = builder.minRxInterval;
        this.minTxInterval = builder.minTxInterval;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerGatewayIp = builder.peerGatewayIp;
        this.peerIpv6GatewayIp = builder.peerIpv6GatewayIp;
        this.peeringIpv6SubnetMask = builder.peeringIpv6SubnetMask;
        this.peeringSubnetMask = builder.peeringSubnetMask;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sitelinkEnable = builder.sitelinkEnable;
        this.vbrId = builder.vbrId;
        this.vlanId = builder.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVirtualBorderRouterAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedPhysicalConnections
     */
    public String getAssociatedPhysicalConnections() {
        return this.associatedPhysicalConnections;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return circuitCode
     */
    public String getCircuitCode() {
        return this.circuitCode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detectMultiplier
     */
    public Long getDetectMultiplier() {
        return this.detectMultiplier;
    }

    /**
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    /**
     * @return localGatewayIp
     */
    public String getLocalGatewayIp() {
        return this.localGatewayIp;
    }

    /**
     * @return localIpv6GatewayIp
     */
    public String getLocalIpv6GatewayIp() {
        return this.localIpv6GatewayIp;
    }

    /**
     * @return minRxInterval
     */
    public Long getMinRxInterval() {
        return this.minRxInterval;
    }

    /**
     * @return minTxInterval
     */
    public Long getMinTxInterval() {
        return this.minTxInterval;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peerGatewayIp
     */
    public String getPeerGatewayIp() {
        return this.peerGatewayIp;
    }

    /**
     * @return peerIpv6GatewayIp
     */
    public String getPeerIpv6GatewayIp() {
        return this.peerIpv6GatewayIp;
    }

    /**
     * @return peeringIpv6SubnetMask
     */
    public String getPeeringIpv6SubnetMask() {
        return this.peeringIpv6SubnetMask;
    }

    /**
     * @return peeringSubnetMask
     */
    public String getPeeringSubnetMask() {
        return this.peeringSubnetMask;
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

    /**
     * @return sitelinkEnable
     */
    public Boolean getSitelinkEnable() {
        return this.sitelinkEnable;
    }

    /**
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    /**
     * @return vlanId
     */
    public Integer getVlanId() {
        return this.vlanId;
    }

    public static final class Builder extends Request.Builder<ModifyVirtualBorderRouterAttributeRequest, Builder> {
        private String associatedPhysicalConnections; 
        private Integer bandwidth; 
        private String circuitCode; 
        private String clientToken; 
        private String description; 
        private Long detectMultiplier; 
        private Boolean enableIpv6; 
        private String localGatewayIp; 
        private String localIpv6GatewayIp; 
        private Long minRxInterval; 
        private Long minTxInterval; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerGatewayIp; 
        private String peerIpv6GatewayIp; 
        private String peeringIpv6SubnetMask; 
        private String peeringSubnetMask; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean sitelinkEnable; 
        private String vbrId; 
        private Integer vlanId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVirtualBorderRouterAttributeRequest request) {
            super(request);
            this.associatedPhysicalConnections = request.associatedPhysicalConnections;
            this.bandwidth = request.bandwidth;
            this.circuitCode = request.circuitCode;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.detectMultiplier = request.detectMultiplier;
            this.enableIpv6 = request.enableIpv6;
            this.localGatewayIp = request.localGatewayIp;
            this.localIpv6GatewayIp = request.localIpv6GatewayIp;
            this.minRxInterval = request.minRxInterval;
            this.minTxInterval = request.minTxInterval;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerGatewayIp = request.peerGatewayIp;
            this.peerIpv6GatewayIp = request.peerIpv6GatewayIp;
            this.peeringIpv6SubnetMask = request.peeringIpv6SubnetMask;
            this.peeringSubnetMask = request.peeringSubnetMask;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sitelinkEnable = request.sitelinkEnable;
            this.vbrId = request.vbrId;
            this.vlanId = request.vlanId;
        } 

        /**
         * <p>The information about the Express Connect circuit associated with the VBR, including the following parameters:</p>
         * <ul>
         * <li><strong>CircuitCode</strong>: the circuit code provided by the connectivity provider for the Express Connect circuit.</li>
         * <li><strong>LocalGatewayIp</strong>: the IP address of the gateway device on the Alibaba Cloud side.</li>
         * <li><strong>PeerGatewayIp</strong>: the IP address of the gateway device on the customer side.</li>
         * <li><strong>PeeringSubnetMask</strong>: the subnet mask for the IP addresses of gateway devices on the Alibaba Cloud side and the customer side.</li>
         * <li><strong>PhysicalConnectionId</strong>: the ID of the Express Connect circuit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[   {     &quot;CircuitCode &quot;: &quot;longtel001&quot;,     &quot; LocalGatewayIp &quot;: &quot;192.168.XX.XX&quot;,     &quot;PeerGatewayIp&quot; : &quot;192.168.XX.XX&quot;,     &quot; PeeringSubnetMask &quot;: &quot;255.255.255.252&quot;,     &quot; PhysicalConnectionId &quot;: &quot;pc-kojok19****&quot;   } ]</p>
         */
        public Builder associatedPhysicalConnections(String associatedPhysicalConnections) {
            this.putQueryParameter("AssociatedPhysicalConnections", associatedPhysicalConnections);
            this.associatedPhysicalConnections = associatedPhysicalConnections;
            return this;
        }

        /**
         * <p>The bandwidth value. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The circuit code of the Express Connect circuit. The circuit code is provided by the connectivity provider.</p>
         * <blockquote>
         * <p> Only the owner of the Express Connect circuit can set this property.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>longtel001</p>
         */
        public Builder circuitCode(String circuitCode) {
            this.putQueryParameter("CircuitCode", circuitCode);
            this.circuitCode = circuitCode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the VBR.</p>
         * <p>It must be 2 to 256 characters in length. It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The maximum number of dropped packets that is allowed by the receiver when the initiator transmits packets. This value can be used to check whether a connection works as expected.</p>
         * <p>Valid values: <strong>3 to 10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder detectMultiplier(Long detectMultiplier) {
            this.putQueryParameter("DetectMultiplier", detectMultiplier);
            this.detectMultiplier = detectMultiplier;
            return this;
        }

        /**
         * <p>Specifies whether to enable IPv6. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableIpv6(Boolean enableIpv6) {
            this.putQueryParameter("EnableIpv6", enableIpv6);
            this.enableIpv6 = enableIpv6;
            return this;
        }

        /**
         * <p>The IP address of the VBR.</p>
         * <p>Only the owner of the VBR can set or modify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder localGatewayIp(String localGatewayIp) {
            this.putQueryParameter("LocalGatewayIp", localGatewayIp);
            this.localGatewayIp = localGatewayIp;
            return this;
        }

        /**
         * <p>The IPv6 address of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:1a2b</p>
         */
        public Builder localIpv6GatewayIp(String localIpv6GatewayIp) {
            this.putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
            this.localIpv6GatewayIp = localIpv6GatewayIp;
            return this;
        }

        /**
         * <p>The time interval to receive BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder minRxInterval(Long minRxInterval) {
            this.putQueryParameter("MinRxInterval", minRxInterval);
            this.minRxInterval = minRxInterval;
            return this;
        }

        /**
         * <p>The time interval to send BFD packets. Valid values: <strong>200 to 1000</strong>. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder minTxInterval(Long minTxInterval) {
            this.putQueryParameter("MinTxInterval", minTxInterval);
            this.minTxInterval = minTxInterval;
            return this;
        }

        /**
         * <p>The name of the VBR.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The IP address of the gateway device in the data center.</p>
         * <p>Only the owner of the VBR can set or modify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.X</p>
         */
        public Builder peerGatewayIp(String peerGatewayIp) {
            this.putQueryParameter("PeerGatewayIp", peerGatewayIp);
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }

        /**
         * <p>The IPv6 address of the gateway device in the data center.</p>
         * <ul>
         * <li>Only the owner of the VBR can set or modify this property.</li>
         * <li>This property is required when you create a VBR for the owner of the Express Connect circuit. You can ignore this property when you create a VBR for another Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2001:XXXX:3c4d:0015:0000:0000:0000:2a2b</p>
         */
        public Builder peerIpv6GatewayIp(String peerIpv6GatewayIp) {
            this.putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
            this.peerIpv6GatewayIp = peerIpv6GatewayIp;
            return this;
        }

        /**
         * <p>The subnet mask of the IPv6 addresses of the VBR and the gateway device in the data center.</p>
         * <p>The two IPv6 addresses must fall within the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4004:cc:400::/56</p>
         */
        public Builder peeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
            this.putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
            this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
            return this;
        }

        /**
         * <p>The subnet mask for the IP addresses of the gateway devices on the Alibaba Cloud side and on the customer side. Only the owner of the VBR can set or modify this parameter.</p>
         * <p>The two IP addresses must fall within the same subnet.</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.252</p>
         */
        public Builder peeringSubnetMask(String peeringSubnetMask) {
            this.putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
            this.peeringSubnetMask = peeringSubnetMask;
            return this;
        }

        /**
         * <p>The region ID of the VBR.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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

        /**
         * <p>Indicates whether to allow service access between data centers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder sitelinkEnable(Boolean sitelinkEnable) {
            this.putQueryParameter("SitelinkEnable", sitelinkEnable);
            this.sitelinkEnable = sitelinkEnable;
            return this;
        }

        /**
         * <p>The VBR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1lhl0taikrte****</p>
         */
        public Builder vbrId(String vbrId) {
            this.putQueryParameter("VbrId", vbrId);
            this.vbrId = vbrId;
            return this;
        }

        /**
         * <p>The VLAN ID of the VBR. Valid values: <strong>0 to 2999</strong>.</p>
         * <blockquote>
         * <p> This parameter is available only to Express Connect owners. The VLAN IDs of VBRs on the same Express Connect circuit must be unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vlanId(Integer vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public ModifyVirtualBorderRouterAttributeRequest build() {
            return new ModifyVirtualBorderRouterAttributeRequest(this);
        } 

    } 

}
