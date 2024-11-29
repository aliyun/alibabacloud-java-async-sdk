// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIPv6TranslatorEntriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeIPv6TranslatorEntriesRequest</p>
 */
public class DescribeIPv6TranslatorEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclStatus")
    private String aclStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclType")
    private String aclType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocateIpv6Addr")
    private String allocateIpv6Addr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocateIpv6Port")
    private Integer allocateIpv6Port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendIpv4Addr")
    private String backendIpv4Addr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendIpv4Port")
    private Integer backendIpv4Port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryName")
    private String entryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
    private String ipv6TranslatorEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorId")
    private String ipv6TranslatorId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransProtocol")
    private String transProtocol;

    private DescribeIPv6TranslatorEntriesRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.allocateIpv6Addr = builder.allocateIpv6Addr;
        this.allocateIpv6Port = builder.allocateIpv6Port;
        this.backendIpv4Addr = builder.backendIpv4Addr;
        this.backendIpv4Port = builder.backendIpv4Port;
        this.clientToken = builder.clientToken;
        this.entryName = builder.entryName;
        this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        this.ipv6TranslatorId = builder.ipv6TranslatorId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transProtocol = builder.transProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPv6TranslatorEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclStatus
     */
    public String getAclStatus() {
        return this.aclStatus;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return allocateIpv6Addr
     */
    public String getAllocateIpv6Addr() {
        return this.allocateIpv6Addr;
    }

    /**
     * @return allocateIpv6Port
     */
    public Integer getAllocateIpv6Port() {
        return this.allocateIpv6Port;
    }

    /**
     * @return backendIpv4Addr
     */
    public String getBackendIpv4Addr() {
        return this.backendIpv4Addr;
    }

    /**
     * @return backendIpv4Port
     */
    public Integer getBackendIpv4Port() {
        return this.backendIpv4Port;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return entryName
     */
    public String getEntryName() {
        return this.entryName;
    }

    /**
     * @return ipv6TranslatorEntryId
     */
    public String getIpv6TranslatorEntryId() {
        return this.ipv6TranslatorEntryId;
    }

    /**
     * @return ipv6TranslatorId
     */
    public String getIpv6TranslatorId() {
        return this.ipv6TranslatorId;
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

    /**
     * @return transProtocol
     */
    public String getTransProtocol() {
        return this.transProtocol;
    }

    public static final class Builder extends Request.Builder<DescribeIPv6TranslatorEntriesRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private String allocateIpv6Addr; 
        private Integer allocateIpv6Port; 
        private String backendIpv4Addr; 
        private Integer backendIpv4Port; 
        private String clientToken; 
        private String entryName; 
        private String ipv6TranslatorEntryId; 
        private String ipv6TranslatorId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transProtocol; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIPv6TranslatorEntriesRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclStatus = request.aclStatus;
            this.aclType = request.aclType;
            this.allocateIpv6Addr = request.allocateIpv6Addr;
            this.allocateIpv6Port = request.allocateIpv6Port;
            this.backendIpv4Addr = request.backendIpv4Addr;
            this.backendIpv4Port = request.backendIpv4Port;
            this.clientToken = request.clientToken;
            this.entryName = request.entryName;
            this.ipv6TranslatorEntryId = request.ipv6TranslatorEntryId;
            this.ipv6TranslatorId = request.ipv6TranslatorId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transProtocol = request.transProtocol;
        } 

        /**
         * <p>The ID of the network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transacl-bp1de2****</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>Specifies whether to enable access control lists (ACLs). Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * <p>The ACL type. Valid values:</p>
         * <ul>
         * <li><strong>white</strong>: a whitelist. IPv6 addresses in the ACL are allowed to access backend services.</li>
         * <li><strong>black</strong>: a blacklist. IPv6 addresses in the ACL are not allowed to access backend services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * <p>The IPv6 address allocated to the IPv6 Translation Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2400:3200:1600::XX</p>
         */
        public Builder allocateIpv6Addr(String allocateIpv6Addr) {
            this.putQueryParameter("AllocateIpv6Addr", allocateIpv6Addr);
            this.allocateIpv6Addr = allocateIpv6Addr;
            return this;
        }

        /**
         * <p>The port used by the IPv6 address allocated to the IPv6 Translation Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder allocateIpv6Port(Integer allocateIpv6Port) {
            this.putQueryParameter("AllocateIpv6Port", allocateIpv6Port);
            this.allocateIpv6Port = allocateIpv6Port;
            return this;
        }

        /**
         * <p>The public IPv4 address that needs to provide IPv6 services.</p>
         * 
         * <strong>example:</strong>
         * <p>47.99.XX.XX</p>
         */
        public Builder backendIpv4Addr(String backendIpv4Addr) {
            this.putQueryParameter("BackendIpv4Addr", backendIpv4Addr);
            this.backendIpv4Addr = backendIpv4Addr;
            return this;
        }

        /**
         * <p>The port used by the public IPv4 address that needs to provide IPv6 services.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder backendIpv4Port(Integer backendIpv4Port) {
            this.putQueryParameter("BackendIpv4Port", backendIpv4Port);
            this.backendIpv4Port = backendIpv4Port;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
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
         * <p>The name of the IPv6 mapping entry.</p>
         * 
         * <strong>example:</strong>
         * <p>entryname</p>
         */
        public Builder entryName(String entryName) {
            this.putQueryParameter("EntryName", entryName);
            this.entryName = entryName;
            return this;
        }

        /**
         * <p>The ID of the IPv6 mapping entry.</p>
         * <blockquote>
         * <p>If <strong>Ipv6TranslatorId</strong> and <strong>Ipv6TranslatorEntryId</strong> are empty, information about all IPv6 mapping entries is returned. If only <strong>Ipv6TranslatorEntryId</strong> is empty, information about the IPv6 mapping entries of the current IPv6 Translation Service instance is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ipv6transentry-bp1g8bhrde****</p>
         */
        public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.putQueryParameter("Ipv6TranslatorEntryId", ipv6TranslatorEntryId);
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
            return this;
        }

        /**
         * <p>The ID of the IPv6 Translation Service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6trans-bp1858ysxx****</p>
         */
        public Builder ipv6TranslatorId(String ipv6TranslatorId) {
            this.putQueryParameter("Ipv6TranslatorId", ipv6TranslatorId);
            this.ipv6TranslatorId = ipv6TranslatorId;
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
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The number of entries to return on each page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
         * <p>The region of the IPv6 Translation Service instance. You can call the <strong>DescribeRegions</strong> operation to query the most recent region list.</p>
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

        /**
         * <p>The protocol used by the data to be forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder transProtocol(String transProtocol) {
            this.putQueryParameter("TransProtocol", transProtocol);
            this.transProtocol = transProtocol;
            return this;
        }

        @Override
        public DescribeIPv6TranslatorEntriesRequest build() {
            return new DescribeIPv6TranslatorEntriesRequest(this);
        } 

    } 

}
