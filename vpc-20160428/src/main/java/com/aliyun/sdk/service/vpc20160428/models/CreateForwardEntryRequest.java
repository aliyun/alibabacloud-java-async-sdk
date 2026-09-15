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
 * {@link CreateForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateForwardEntryRequest</p>
 */
public class CreateForwardEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    private String forwardEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortBreak")
    private Boolean portBreak;

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

    private CreateForwardEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryName = builder.forwardEntryName;
        this.forwardTableId = builder.forwardTableId;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portBreak = builder.portBreak;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardEntryRequest create() {
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
     * @return externalIp
     */
    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * @return externalPort
     */
    public String getExternalPort() {
        return this.externalPort;
    }

    /**
     * @return forwardEntryName
     */
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    /**
     * @return forwardTableId
     */
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return internalPort
     */
    public String getInternalPort() {
        return this.internalPort;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
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
     * @return portBreak
     */
    public Boolean getPortBreak() {
        return this.portBreak;
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

    public static final class Builder extends Request.Builder<CreateForwardEntryRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryName; 
        private String forwardTableId; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean portBreak; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateForwardEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.externalIp = request.externalIp;
            this.externalPort = request.externalPort;
            this.forwardEntryName = request.forwardEntryName;
            this.forwardTableId = request.forwardTableId;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.ipProtocol = request.ipProtocol;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portBreak = request.portBreak;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may differ for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without creating a DNAT entry. The system checks the AccessKey pair, the authorization of the Resource Access Management (RAM) user, and the required parameters. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends a Normal request. If the check succeeds, a 2xx HTTP status code is returned and the DNAT entry is created.</p>
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
         * <ul>
         * <li>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the elastic IP address (EIP) that provides public network access.</li>
         * <li>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the NAT IP address that provides external network access.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>116.28.XX.XX</p>
         */
        public Builder externalIp(String externalIp) {
            this.putQueryParameter("ExternalIp", externalIp);
            this.externalIp = externalIp;
            return this;
        }

        /**
         * <ul>
         * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the external port or port range for port forwarding.</p>
         * <ul>
         * <li>Valid port values: <strong>1</strong> to <strong>65535</strong>.</li>
         * <li>To specify a port range, separate the start and end ports with a forward slash (/), such as <code>10/20</code>.</li>
         * <li>If <strong>ExternalPort</strong> is set to a port range, <strong>InternalPort</strong> must also be set to a port range with the same number of ports. For example, if <strong>ExternalPort</strong> is set to <code>10/20</code>, <strong>InternalPort</strong> can be set to <code>80/90</code>.</li>
         * </ul>
         * </li>
         * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the port on the NAT IP address that is accessed by the external network. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder externalPort(String externalPort) {
            this.putQueryParameter("ExternalPort", externalPort);
            this.externalPort = externalPort;
            return this;
        }

        /**
         * <p>The name of the DNAT rule.</p>
         * <p>The name must be 2 to 128 characters in length and must start with a letter or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardEntry-1</p>
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * <p>The ID of the DNAT table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ftb-bp1mbjubq34hlcqpa****</p>
         */
        public Builder forwardTableId(String forwardTableId) {
            this.putQueryParameter("ForwardTableId", forwardTableId);
            this.forwardTableId = forwardTableId;
            return this;
        }

        /**
         * <ul>
         * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the private IP address of the ECS instance that needs to communicate over the Internet. The private IP address must meet the following conditions: </p>
         * <ul>
         * <li><p>It must belong to the CIDR block of the VPC in which the NAT gateway resides. </p>
         * </li>
         * <li><p>The DNAT entry takes effect only when the IP address is used by an ECS instance that is not associated with an EIP.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the private IP address that communicates through the DNAT rule.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <ul>
         * <li><p>If you add a DNAT entry for an Internet NAT gateway, this parameter specifies the internal port or port range for port forwarding. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * </li>
         * <li><p>If you add a DNAT entry for a VPC NAT gateway, this parameter specifies the destination port of the ECS instance to which traffic is mapped. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * <p>The protocol type. Valid values: </p>
         * <ul>
         * <li><p><strong>TCP</strong>: forwards TCP packets.   </p>
         * </li>
         * <li><p><strong>UDP</strong>: forwards UDP packets.   </p>
         * </li>
         * <li><p><strong>Any</strong>: forwards packets of all protocols. If <strong>IpProtocol</strong> is set to <strong>Any</strong>, <strong>ExternalPort</strong> and <strong>InternalPort</strong> must also be set to <strong>Any</strong> to implement DNAT IP mapping.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether to enable port breaking. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables port breaking.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables port breaking.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If a DNAT entry and an SNAT entry use the same public IP address, and you want to configure a port number greater than 1024, set <strong>PortBreak</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder portBreak(Boolean portBreak) {
            this.putQueryParameter("PortBreak", portBreak);
            this.portBreak = portBreak;
            return this;
        }

        /**
         * <p>The region ID of the NAT gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
        public CreateForwardEntryRequest build() {
            return new CreateForwardEntryRequest(this);
        } 

    } 

}
