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
 * {@link CreateDhcpOptionsSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDhcpOptionsSetRequest</p>
 */
public class CreateDhcpOptionsSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetDescription")
    private String dhcpOptionsSetDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DhcpOptionsSetName")
    private String dhcpOptionsSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameServers")
    private String domainNameServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6LeaseTime")
    private String ipv6LeaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LeaseTime")
    private String leaseTime;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateDhcpOptionsSetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dhcpOptionsSetDescription = builder.dhcpOptionsSetDescription;
        this.dhcpOptionsSetName = builder.dhcpOptionsSetName;
        this.domainName = builder.domainName;
        this.domainNameServers = builder.domainNameServers;
        this.dryRun = builder.dryRun;
        this.ipv6LeaseTime = builder.ipv6LeaseTime;
        this.leaseTime = builder.leaseTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDhcpOptionsSetRequest create() {
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
     * @return dhcpOptionsSetDescription
     */
    public String getDhcpOptionsSetDescription() {
        return this.dhcpOptionsSetDescription;
    }

    /**
     * @return dhcpOptionsSetName
     */
    public String getDhcpOptionsSetName() {
        return this.dhcpOptionsSetName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameServers
     */
    public String getDomainNameServers() {
        return this.domainNameServers;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipv6LeaseTime
     */
    public String getIpv6LeaseTime() {
        return this.ipv6LeaseTime;
    }

    /**
     * @return leaseTime
     */
    public String getLeaseTime() {
        return this.leaseTime;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDhcpOptionsSetRequest, Builder> {
        private String clientToken; 
        private String dhcpOptionsSetDescription; 
        private String dhcpOptionsSetName; 
        private String domainName; 
        private String domainNameServers; 
        private Boolean dryRun; 
        private String ipv6LeaseTime; 
        private String leaseTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDhcpOptionsSetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dhcpOptionsSetDescription = request.dhcpOptionsSetDescription;
            this.dhcpOptionsSetName = request.dhcpOptionsSetName;
            this.domainName = request.domainName;
            this.domainNameServers = request.domainNameServers;
            this.dryRun = request.dryRun;
            this.ipv6LeaseTime = request.ipv6LeaseTime;
            this.leaseTime = request.leaseTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the DHCP options set. </p>
         * <p>The description can be empty or 1 to 256 characters in length. It must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            this.putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
            this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }

        /**
         * <p>The name of the DHCP options set.</p>
         * <p>The name must be 1 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
            this.putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
            this.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }

        /**
         * <p>The hostname suffix. Example: example.com.</p>
         * <p>After you associate VPC with the DHCP options set, the hostname suffix is automatically synchronized to the ECS instances in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The IP addresses of DNS servers. You can specify up to four DNS server IP addresses. Separate multiple IP addresses with commas (,).</p>
         * <blockquote>
         * <p>If you do not specify DNS server IP addresses, ECS instances use the DNS server IP addresses provided by Alibaba Cloud by default (100.100.2.136 and 100.100.2.138).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.123</p>
         */
        public Builder domainNameServers(String domainNameServers) {
            this.putQueryParameter("DomainNameServers", domainNameServers);
            this.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * <p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the DHCP options set is created.</p>
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
         * <p>The lease time of the IPv6 DHCP options set.</p>
         * <ul>
         * <li><p>If the lease time is set in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>24h</strong>.</p>
         * </li>
         * <li><p>If the lease time is set in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>1d</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must include the unit when specifying the value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3650d</p>
         */
        public Builder ipv6LeaseTime(String ipv6LeaseTime) {
            this.putQueryParameter("Ipv6LeaseTime", ipv6LeaseTime);
            this.ipv6LeaseTime = ipv6LeaseTime;
            return this;
        }

        /**
         * <p>The lease time of the IPv4 DHCP options set.</p>
         * <ul>
         * <li><p>If the lease time is set in hours, the unit is h. Valid values: <strong>24h to 1176h</strong> and <strong>87600h to 175200h</strong>. Default value: <strong>87600h</strong>.</p>
         * </li>
         * <li><p>If the lease time is set in days, the unit is d. Valid values: <strong>1d to 49d</strong> and <strong>3650d to 7300d</strong>. Default value: <strong>3650d</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must include the unit when specifying the value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3650d</p>
         */
        public Builder leaseTime(String leaseTime) {
            this.putQueryParameter("LeaseTime", leaseTime);
            this.leaseTime = leaseTime;
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
         * <p>The region where the DHCP options set resides.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
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
         * <p>The ID of the resource group to which the DHCP options set belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The tags of the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDhcpOptionsSetRequest build() {
            return new CreateDhcpOptionsSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDhcpOptionsSetRequest} extends {@link TeaModel}
     *
     * <p>CreateDhcpOptionsSetRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
