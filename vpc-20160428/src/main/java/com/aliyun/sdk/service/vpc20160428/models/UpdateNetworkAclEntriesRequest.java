// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateNetworkAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkAclEntriesRequest</p>
 */
public class UpdateNetworkAclEntriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EgressAclEntries")
    private java.util.List < EgressAclEntries> egressAclEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IngressAclEntries")
    private java.util.List < IngressAclEntries> ingressAclEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAclId;

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
    @com.aliyun.core.annotation.NameInMap("UpdateEgressAclEntries")
    private Boolean updateEgressAclEntries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateIngressAclEntries")
    private Boolean updateIngressAclEntries;

    private UpdateNetworkAclEntriesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressAclEntries = builder.egressAclEntries;
        this.ingressAclEntries = builder.ingressAclEntries;
        this.networkAclId = builder.networkAclId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.updateEgressAclEntries = builder.updateEgressAclEntries;
        this.updateIngressAclEntries = builder.updateIngressAclEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkAclEntriesRequest create() {
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
     * @return egressAclEntries
     */
    public java.util.List < EgressAclEntries> getEgressAclEntries() {
        return this.egressAclEntries;
    }

    /**
     * @return ingressAclEntries
     */
    public java.util.List < IngressAclEntries> getIngressAclEntries() {
        return this.ingressAclEntries;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
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
     * @return updateEgressAclEntries
     */
    public Boolean getUpdateEgressAclEntries() {
        return this.updateEgressAclEntries;
    }

    /**
     * @return updateIngressAclEntries
     */
    public Boolean getUpdateIngressAclEntries() {
        return this.updateIngressAclEntries;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkAclEntriesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EgressAclEntries> egressAclEntries; 
        private java.util.List < IngressAclEntries> ingressAclEntries; 
        private String networkAclId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean updateEgressAclEntries; 
        private Boolean updateIngressAclEntries; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkAclEntriesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressAclEntries = request.egressAclEntries;
            this.ingressAclEntries = request.ingressAclEntries;
            this.networkAclId = request.networkAclId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.updateEgressAclEntries = request.updateEgressAclEntries;
            this.updateIngressAclEntries = request.updateIngressAclEntries;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including the AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The information about the outbound rules.</p>
         */
        public Builder egressAclEntries(java.util.List < EgressAclEntries> egressAclEntries) {
            this.putQueryParameter("EgressAclEntries", egressAclEntries);
            this.egressAclEntries = egressAclEntries;
            return this;
        }

        /**
         * <p>The information about the inbound rule.</p>
         */
        public Builder ingressAclEntries(java.util.List < IngressAclEntries> ingressAclEntries) {
            this.putQueryParameter("IngressAclEntries", ingressAclEntries);
            this.ingressAclEntries = ingressAclEntries;
            return this;
        }

        /**
         * <p>The ID of the network ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-bp1lhl0taikrzxsc****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
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
         * <p>The region ID of the network ACL.</p>
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

        /**
         * <p>Specifies whether to update outbound rules. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> This parameter cannot be used to add outbound rules to ACLs. If you want to add more outbound rules to ACLs, specify both the existing rule and the rule that you want to add when you call this API operation. If you specify only the rule that you want to add, it overwrites the existing rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder updateEgressAclEntries(Boolean updateEgressAclEntries) {
            this.putQueryParameter("UpdateEgressAclEntries", updateEgressAclEntries);
            this.updateEgressAclEntries = updateEgressAclEntries;
            return this;
        }

        /**
         * <p>Specifies whether to update inbound rules. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> This parameter cannot be used to add inbound rules to ACLs. If you want to add more inbound rules to ACLs, you must specify both the existing rule and the rule that you want to add when you call this API operation. If you specify only the rule that you want to add, it overwrites the existing rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder updateIngressAclEntries(Boolean updateIngressAclEntries) {
            this.putQueryParameter("UpdateIngressAclEntries", updateIngressAclEntries);
            this.updateIngressAclEntries = updateIngressAclEntries;
            return this;
        }

        @Override
        public UpdateNetworkAclEntriesRequest build() {
            return new UpdateNetworkAclEntriesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateNetworkAclEntriesRequest} extends {@link TeaModel}
     *
     * <p>UpdateNetworkAclEntriesRequest</p>
     */
    public static class EgressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrIp")
        private String destinationCidrIp;

        @com.aliyun.core.annotation.NameInMap("EntryType")
        private String entryType;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private EgressAclEntries(Builder builder) {
            this.description = builder.description;
            this.destinationCidrIp = builder.destinationCidrIp;
            this.entryType = builder.entryType;
            this.ipVersion = builder.ipVersion;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressAclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destinationCidrIp
         */
        public String getDestinationCidrIp() {
            return this.destinationCidrIp;
        }

        /**
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String description; 
            private String destinationCidrIp; 
            private String entryType; 
            private String ipVersion; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 

            /**
             * <p>The description of the outbound rule.</p>
             * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>This is EgressAclEntries.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder destinationCidrIp(String destinationCidrIp) {
                this.destinationCidrIp = destinationCidrIp;
                return this;
            }

            /**
             * <p>The type of the rule. Set the value to <strong>custom</strong>, which specifies custom rules.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong> (default)</li>
             * <li><strong>IPv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The ID of the outbound rule.</p>
             * <p>Valid values of <strong>N</strong>: <strong>0</strong> to <strong>99</strong>. You can specify at most 100 outbound rules.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-2zecs97e0brcge46****</p>
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * <p>The name of the outbound rule.</p>
             * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-2</p>
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The destination port range of the outbound traffic.</p>
             * <ul>
             * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specified all ports.</li>
             * <li>If the <strong>protocol</strong> of the outbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid values for a port: <strong>1</strong> to <strong>65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong></li>
             * <li><strong>gre</strong></li>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * <li><strong>all</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public EgressAclEntries build() {
                return new EgressAclEntries(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateNetworkAclEntriesRequest} extends {@link TeaModel}
     *
     * <p>UpdateNetworkAclEntriesRequest</p>
     */
    public static class IngressAclEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntryType")
        private String entryType;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryId")
        private String networkAclEntryId;

        @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
        private String networkAclEntryName;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private IngressAclEntries(Builder builder) {
            this.description = builder.description;
            this.entryType = builder.entryType;
            this.ipVersion = builder.ipVersion;
            this.networkAclEntryId = builder.networkAclEntryId;
            this.networkAclEntryName = builder.networkAclEntryName;
            this.policy = builder.policy;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressAclEntries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return entryType
         */
        public String getEntryType() {
            return this.entryType;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return networkAclEntryId
         */
        public String getNetworkAclEntryId() {
            return this.networkAclEntryId;
        }

        /**
         * @return networkAclEntryName
         */
        public String getNetworkAclEntryName() {
            return this.networkAclEntryName;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String description; 
            private String entryType; 
            private String ipVersion; 
            private String networkAclEntryId; 
            private String networkAclEntryName; 
            private String policy; 
            private String port; 
            private String protocol; 
            private String sourceCidrIp; 

            /**
             * <p>The description of the inbound rule.</p>
             * <p>The description must be 1 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>This is IngressAclEntries.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The type of the rule. Set the value to <strong>custom</strong>, which specifies custom rules.</p>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder entryType(String entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * <p>The IP version. Valid values:</p>
             * <ul>
             * <li><strong>IPv4</strong> (default)</li>
             * <li><strong>IPv6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The ID of the inbound rule.</p>
             * <p>Valid values of <strong>N</strong>: <strong>0</strong> to <strong>99</strong>. You can specify at most 100 inbound rules.</p>
             * 
             * <strong>example:</strong>
             * <p>nae-2zepn32de59j8m4****</p>
             */
            public Builder networkAclEntryId(String networkAclEntryId) {
                this.networkAclEntryId = networkAclEntryId;
                return this;
            }

            /**
             * <p>The name of the inbound rule.</p>
             * <p>The name must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-3</p>
             */
            public Builder networkAclEntryName(String networkAclEntryName) {
                this.networkAclEntryName = networkAclEntryName;
                return this;
            }

            /**
             * <p>The action to be performed on network traffic that matches the rule. Valid values:</p>
             * <ul>
             * <li><strong>accept</strong></li>
             * <li><strong>drop</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The source port range of the inbound rule.</p>
             * <ul>
             * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>all</strong>, <strong>icmp</strong>, or <strong>gre</strong>, the port range is -1/-1, which specifies all ports.</li>
             * <li>If the <strong>protocol</strong> of the inbound rule is set to <strong>tcp</strong> or <strong>udp</strong>, set the port range in the following format: <strong>1/200</strong> or <strong>80/80</strong>, which specifies port 1 to port 200 or port 80. Valid ports: <strong>1</strong> to <strong>65535</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1/-1</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Valid values:</p>
             * <ul>
             * <li><strong>icmp</strong></li>
             * <li><strong>gre</strong></li>
             * <li><strong>tcp</strong></li>
             * <li><strong>udp</strong></li>
             * <li><strong>all</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public IngressAclEntries build() {
                return new IngressAclEntries(this);
            } 

        } 

    }
}
