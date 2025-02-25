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
 * {@link DescribeForwardTableEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeForwardTableEntriesRequest</p>
 */
public class DescribeForwardTableEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalIp")
    private String externalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    private String externalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    private String forwardEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    private String forwardEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardTableId")
    private String forwardTableId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPort")
    private String internalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

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

    private DescribeForwardTableEntriesRequest(Builder builder) {
        super(builder);
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryId = builder.forwardEntryId;
        this.forwardEntryName = builder.forwardEntryName;
        this.forwardTableId = builder.forwardTableId;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.natGatewayId = builder.natGatewayId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeForwardTableEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
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
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeForwardTableEntriesRequest, Builder> {
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryId; 
        private String forwardEntryName; 
        private String forwardTableId; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 
        private String natGatewayId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeForwardTableEntriesRequest request) {
            super(request);
            this.externalIp = request.externalIp;
            this.externalPort = request.externalPort;
            this.forwardEntryId = request.forwardEntryId;
            this.forwardEntryName = request.forwardEntryName;
            this.forwardTableId = request.forwardTableId;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.ipProtocol = request.ipProtocol;
            this.natGatewayId = request.natGatewayId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <ul>
         * <li>The elastic IP addresses (EIPs) that can be accessed over the Internet when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The NAT IP addresses that can be accessed by external networks when you query DNAT entries of Virtual Private Cloud (VPC) NAT gateways.</li>
         * </ul>
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
         * <li><p>The external port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways.</p>
         * <ul>
         * <li>Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
         * <li>If you want to query a port range, separate the first port and last port with a forward slash (/), such as <code>10/20</code>.</li>
         * <li>If you set <strong>ExternalPort</strong> to a port range, you must also set <strong>InternalPort</strong> to a port range, and the number of ports specified by these parameters must be the same. For example, if you set <strong>ExternalPort</strong> to <code>10/20</code>, you can set <strong>InternalPort</strong> to <code>80/90</code>.</li>
         * </ul>
         * </li>
         * <li><p>The port that is used when the NAT IP address can be accessed by external networks when you query DNAT entries of VPC NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-8vbn3bc8roygjp0gy****</p>
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * <p>The name of the DNAT entry.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
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
         * <p>**</p>
         * <p><strong>Description</strong> You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
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
         * <p>The private IP address.</p>
         * <ul>
         * <li>The private IP address of the ECS instance that uses DNAT entries to communicate with the Internet when you query DNAT entries of Internet NAT gateways.</li>
         * <li>The private IP address that uses DNAT entries for communication when you query DNAT entries of VPC NAT gateways.</li>
         * </ul>
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
         * <li>The internal port or port range that is used for port forwarding when you query DNAT entries of Internet NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
         * <li>The port of the destination ECS instance to be mapped when you query DNAT entries of VPC NAT gateways. Valid values: <strong>1</strong> to <strong>65535</strong>.</li>
         * </ul>
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
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>Any</strong></li>
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
         * <p>The ID of the NAT gateway.</p>
         * <p>**</p>
         * <p><strong>Description</strong> You must specify at least one of <strong>ForwardTableId</strong> and <strong>NatGatewayId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-bp1uewa15k4iy5770****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where you want to create the NAT gateway.</p>
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
        public DescribeForwardTableEntriesRequest build() {
            return new DescribeForwardTableEntriesRequest(this);
        } 

    } 

}
