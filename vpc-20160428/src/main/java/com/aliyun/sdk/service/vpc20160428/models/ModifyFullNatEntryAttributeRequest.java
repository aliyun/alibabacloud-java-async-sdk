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
 * {@link ModifyFullNatEntryAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullNatEntryAttributeRequest</p>
 */
public class ModifyFullNatEntryAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessDomain")
    private String accessDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessIp")
    private String accessIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPort")
    private String accessPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullNatEntryDescription")
    private String fullNatEntryDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullNatEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullNatEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullNatEntryName")
    private String fullNatEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullNatTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullNatTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIp")
    private String natIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatIpPort")
    private String natIpPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    private String networkInterfaceId;

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

    private ModifyFullNatEntryAttributeRequest(Builder builder) {
        super(builder);
        this.accessDomain = builder.accessDomain;
        this.accessIp = builder.accessIp;
        this.accessPort = builder.accessPort;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fullNatEntryDescription = builder.fullNatEntryDescription;
        this.fullNatEntryId = builder.fullNatEntryId;
        this.fullNatEntryName = builder.fullNatEntryName;
        this.fullNatTableId = builder.fullNatTableId;
        this.ipProtocol = builder.ipProtocol;
        this.natIp = builder.natIp;
        this.natIpPort = builder.natIpPort;
        this.networkInterfaceId = builder.networkInterfaceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFullNatEntryAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDomain
     */
    public String getAccessDomain() {
        return this.accessDomain;
    }

    /**
     * @return accessIp
     */
    public String getAccessIp() {
        return this.accessIp;
    }

    /**
     * @return accessPort
     */
    public String getAccessPort() {
        return this.accessPort;
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
     * @return fullNatEntryDescription
     */
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    /**
     * @return fullNatEntryId
     */
    public String getFullNatEntryId() {
        return this.fullNatEntryId;
    }

    /**
     * @return fullNatEntryName
     */
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    /**
     * @return fullNatTableId
     */
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return natIp
     */
    public String getNatIp() {
        return this.natIp;
    }

    /**
     * @return natIpPort
     */
    public String getNatIpPort() {
        return this.natIpPort;
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
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

    public static final class Builder extends Request.Builder<ModifyFullNatEntryAttributeRequest, Builder> {
        private String accessDomain; 
        private String accessIp; 
        private String accessPort; 
        private String clientToken; 
        private Boolean dryRun; 
        private String fullNatEntryDescription; 
        private String fullNatEntryId; 
        private String fullNatEntryName; 
        private String fullNatTableId; 
        private String ipProtocol; 
        private String natIp; 
        private String natIpPort; 
        private String networkInterfaceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullNatEntryAttributeRequest request) {
            super(request);
            this.accessDomain = request.accessDomain;
            this.accessIp = request.accessIp;
            this.accessPort = request.accessPort;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fullNatEntryDescription = request.fullNatEntryDescription;
            this.fullNatEntryId = request.fullNatEntryId;
            this.fullNatEntryName = request.fullNatEntryName;
            this.fullNatTableId = request.fullNatTableId;
            this.ipProtocol = request.ipProtocol;
            this.natIp = request.natIp;
            this.natIpPort = request.natIpPort;
            this.networkInterfaceId = request.networkInterfaceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The backend domain name to be modified for FULLNAT address translation.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        public Builder accessDomain(String accessDomain) {
            this.putQueryParameter("AccessDomain", accessDomain);
            this.accessDomain = accessDomain;
            return this;
        }

        /**
         * <p>The backend IP address to be modified for FULLNAT address translation.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder accessIp(String accessIp) {
            this.putQueryParameter("AccessIp", accessIp);
            this.accessIp = accessIp;
            return this;
        }

        /**
         * <p>The backend port to be modified for FULLNAT port mapping. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder accessPort(String accessPort) {
            this.putQueryParameter("AccessPort", accessPort);
            this.accessPort = accessPort;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without modifying the FULLNAT entry. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a Normal request. If the check succeeds, a 2xx HTTP status code is returned and the FULLNAT entry is modified.</li>
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
         * <p>The new description of the FULLNAT entry.</p>
         * <p>The description can be empty or 2 to 256 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        public Builder fullNatEntryDescription(String fullNatEntryDescription) {
            this.putQueryParameter("FullNatEntryDescription", fullNatEntryDescription);
            this.fullNatEntryDescription = fullNatEntryDescription;
            return this;
        }

        /**
         * <p>The ID of the FULLNAT entry to be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fullnat-gw8fz23jezpbblf1j****</p>
         */
        public Builder fullNatEntryId(String fullNatEntryId) {
            this.putQueryParameter("FullNatEntryId", fullNatEntryId);
            this.fullNatEntryId = fullNatEntryId;
            return this;
        }

        /**
         * <p>The new name of the FULLNAT entry.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>modify</p>
         */
        public Builder fullNatEntryName(String fullNatEntryName) {
            this.putQueryParameter("FullNatEntryName", fullNatEntryName);
            this.fullNatEntryName = fullNatEntryName;
            return this;
        }

        /**
         * <p>The ID of the FULLNAT table to which the FULLNAT entry belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fulltb-gw88z7hhlv43rmb26****</p>
         */
        public Builder fullNatTableId(String fullNatTableId) {
            this.putQueryParameter("FullNatTableId", fullNatTableId);
            this.fullNatTableId = fullNatTableId;
            return this;
        }

        /**
         * <p>The protocol type of the Redirection Port. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: forwards TCP packets. </li>
         * <li><strong>UDP</strong>: forwards UDP packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The NAT IP address to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder natIp(String natIp) {
            this.putQueryParameter("NatIp", natIp);
            this.natIp = natIp;
            return this;
        }

        /**
         * <p>The frontend port to be modified for FULLNAT port mapping. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder natIpPort(String natIpPort) {
            this.putQueryParameter("NatIpPort", natIpPort);
            this.natIpPort = natIpPort;
            return this;
        }

        /**
         * <p>The ID of the elastic network interfaces (ENIs), also known as the network interface controller (NIC), to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-gw8g131ef2dnbu3k****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
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
         * <p>The region ID of the VPC NAT gateway to which the FULLNAT entry belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
        public ModifyFullNatEntryAttributeRequest build() {
            return new ModifyFullNatEntryAttributeRequest(this);
        } 

    } 

}
