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
 * {@link ModifyIPv6TranslatorEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyIPv6TranslatorEntryRequest</p>
 */
public class ModifyIPv6TranslatorEntryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("AllocateIpv6Port")
    private Integer allocateIpv6Port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendIpv4Addr")
    private String backendIpv4Addr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendIpv4Port")
    private Integer backendIpv4Port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryBandwidth")
    private Integer entryBandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryDescription")
    private String entryDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryName")
    private String entryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6TranslatorEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipv6TranslatorEntryId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransProtocol")
    private String transProtocol;

    private ModifyIPv6TranslatorEntryRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.allocateIpv6Port = builder.allocateIpv6Port;
        this.backendIpv4Addr = builder.backendIpv4Addr;
        this.backendIpv4Port = builder.backendIpv4Port;
        this.entryBandwidth = builder.entryBandwidth;
        this.entryDescription = builder.entryDescription;
        this.entryName = builder.entryName;
        this.ipv6TranslatorEntryId = builder.ipv6TranslatorEntryId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transProtocol = builder.transProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIPv6TranslatorEntryRequest create() {
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
     * @return entryBandwidth
     */
    public Integer getEntryBandwidth() {
        return this.entryBandwidth;
    }

    /**
     * @return entryDescription
     */
    public String getEntryDescription() {
        return this.entryDescription;
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

    /**
     * @return transProtocol
     */
    public String getTransProtocol() {
        return this.transProtocol;
    }

    public static final class Builder extends Request.Builder<ModifyIPv6TranslatorEntryRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer allocateIpv6Port; 
        private String backendIpv4Addr; 
        private Integer backendIpv4Port; 
        private Integer entryBandwidth; 
        private String entryDescription; 
        private String entryName; 
        private String ipv6TranslatorEntryId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transProtocol; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIPv6TranslatorEntryRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclStatus = request.aclStatus;
            this.aclType = request.aclType;
            this.allocateIpv6Port = request.allocateIpv6Port;
            this.backendIpv4Addr = request.backendIpv4Addr;
            this.backendIpv4Port = request.backendIpv4Port;
            this.entryBandwidth = request.entryBandwidth;
            this.entryDescription = request.entryDescription;
            this.entryName = request.entryName;
            this.ipv6TranslatorEntryId = request.ipv6TranslatorEntryId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transProtocol = request.transProtocol;
        } 

        /**
         * <p>The ID of the associated ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6transacl-bp1de27sou71g0lf****</p>
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
         * <p>The port that is used by the IPv6 address allocated to the IPv6 Translation Service instance.</p>
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
         * <p>47.11.XX.XX</p>
         */
        public Builder backendIpv4Addr(String backendIpv4Addr) {
            this.putQueryParameter("BackendIpv4Addr", backendIpv4Addr);
            this.backendIpv4Addr = backendIpv4Addr;
            return this;
        }

        /**
         * <p>The port of the public IPv4 address that needs to provide IPv6 services.</p>
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
         * <p>The maximum bandwidth specified in the IPv6 mapping entry. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong> (default): does not limit the maximum bandwidth specified in the IPv6 mapping entry.</li>
         * <li><strong>1</strong> to <strong>200</strong>: changes the maximum bandwidth specified in the IPv6 mapping entry.</li>
         * </ul>
         * <blockquote>
         * <p>The sum of maximum bandwidth values specified in all IPv6 entries cannot exceed the maximum bandwidth supported by the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder entryBandwidth(Integer entryBandwidth) {
            this.putQueryParameter("EntryBandwidth", entryBandwidth);
            this.entryBandwidth = entryBandwidth;
            return this;
        }

        /**
         * <p>The description of the IPv6 mapping entry. It must be 2 to 100 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot start with http:// or <a href="https://%E3%80%82">https://</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>entrydescription</p>
         */
        public Builder entryDescription(String entryDescription) {
            this.putQueryParameter("EntryDescription", entryDescription);
            this.entryDescription = entryDescription;
            return this;
        }

        /**
         * <p>The name of the IPv6 mapping entry. It must be 2 to 100 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot start with http:// or <a href="https://%E3%80%82">https://</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>entry1</p>
         */
        public Builder entryName(String entryName) {
            this.putQueryParameter("EntryName", entryName);
            this.entryName = entryName;
            return this;
        }

        /**
         * <p>The ID of the IPv6 mapping entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv6trans-bp1858ys****</p>
         */
        public Builder ipv6TranslatorEntryId(String ipv6TranslatorEntryId) {
            this.putQueryParameter("Ipv6TranslatorEntryId", ipv6TranslatorEntryId);
            this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
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
         * <p>The region of the IPv6 Translation Service instance. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
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
        public ModifyIPv6TranslatorEntryRequest build() {
            return new ModifyIPv6TranslatorEntryRequest(this);
        } 

    } 

}
