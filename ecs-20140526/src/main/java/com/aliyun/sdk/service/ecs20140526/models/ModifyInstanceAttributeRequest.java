// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAttributeRequest</p>
 */
public class ModifyInstanceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOptions")
    private CpuOptions cpuOptions;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditSpecification")
    private String creditSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableJumboFrame")
    private Boolean enableJumboFrame;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateDnsNameOptions")
    private PrivateDnsNameOptions privateDnsNameOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recyclable")
    private Boolean recyclable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteConnectionOptions")
    private RemoteConnectionOptions remoteConnectionOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.cpuOptions = builder.cpuOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.creditSpecification = builder.creditSpecification;
        this.deletionProtection = builder.deletionProtection;
        this.description = builder.description;
        this.enableJumboFrame = builder.enableJumboFrame;
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.networkInterfaceQueueNumber = builder.networkInterfaceQueueNumber;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.privateDnsNameOptions = builder.privateDnsNameOptions;
        this.recyclable = builder.recyclable;
        this.remoteConnectionOptions = builder.remoteConnectionOptions;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupIds = builder.securityGroupIds;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuOptions
     */
    public CpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableJumboFrame
     */
    public Boolean getEnableJumboFrame() {
        return this.enableJumboFrame;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return networkInterfaceQueueNumber
     */
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return privateDnsNameOptions
     */
    public PrivateDnsNameOptions getPrivateDnsNameOptions() {
        return this.privateDnsNameOptions;
    }

    /**
     * @return recyclable
     */
    public Boolean getRecyclable() {
        return this.recyclable;
    }

    /**
     * @return remoteConnectionOptions
     */
    public RemoteConnectionOptions getRemoteConnectionOptions() {
        return this.remoteConnectionOptions;
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
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private CpuOptions cpuOptions; 
        private String sourceRegionId; 
        private String creditSpecification; 
        private Boolean deletionProtection; 
        private String description; 
        private Boolean enableJumboFrame; 
        private String hostName; 
        private String instanceId; 
        private String instanceName; 
        private Integer networkInterfaceQueueNumber; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private PrivateDnsNameOptions privateDnsNameOptions; 
        private Boolean recyclable; 
        private RemoteConnectionOptions remoteConnectionOptions; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < String > securityGroupIds; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest request) {
            super(request);
            this.cpuOptions = request.cpuOptions;
            this.sourceRegionId = request.sourceRegionId;
            this.creditSpecification = request.creditSpecification;
            this.deletionProtection = request.deletionProtection;
            this.description = request.description;
            this.enableJumboFrame = request.enableJumboFrame;
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.networkInterfaceQueueNumber = request.networkInterfaceQueueNumber;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.privateDnsNameOptions = request.privateDnsNameOptions;
            this.recyclable = request.recyclable;
            this.remoteConnectionOptions = request.remoteConnectionOptions;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupIds = request.securityGroupIds;
            this.userData = request.userData;
        } 

        /**
         * CpuOptions.
         */
        public Builder cpuOptions(CpuOptions cpuOptions) {
            this.putQueryParameter("CpuOptions", cpuOptions);
            this.cpuOptions = cpuOptions;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The performance mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard</li>
         * <li>Unlimited</li>
         * </ul>
         * <p>For more information about the performance modes of burstable instances, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * <p>The release protection attribute of the instance. This parameter specifies whether you can use the ECS console or call the <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a> operation to release the instance.</p>
         * <blockquote>
         * <p> This parameter is applicable only to pay-as-you-go instances. The release protection attribute can protect instances against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The description of the instance. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>You can enable the Jumbo Frames feature only for specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTU and jumbo frames</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.putQueryParameter("EnableJumboFrame", enableJumboFrame);
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * <p>The hostname of the instance. Take note of the following items:</p>
         * <ul>
         * <li>When you change the hostname of the instance, the instance cannot be in the Creating (<code>Pending</code>) or Starting (<code>Starting</code>) state. Otherwise, the new hostname and the configurations in <code>/etc/hosts</code> may not take effect. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of the instance.</li>
         * <li>After you change the hostname, you must call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new hostname to take effect.</li>
         * </ul>
         * <p>The following limits apply to the hostnames of instances that run different operating systems:</p>
         * <ul>
         * <li>For Windows Server, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.</li>
         * <li>For other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). The hostname cannot contain consecutive periods (.) or hyphens (-). The hostname cannot start or end with a period (.) or a hyphen (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4ph****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testInstanceName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The number of queues supported by the primary ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
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
         * <p>The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:</p>
         * <pre><code>( ) ` ~ ! @ # $ % ^ &amp; * - _ + = | { } [ ] : ; \&quot; &lt; &gt; , . ? /
         * </code></pre>
         * <p>The password of a Windows instance cannot start with a forward slash (/).</p>
         * <blockquote>
         * <p> For security reasons, we recommend that you use HTTPS to send requests if <code>Password</code> is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test123456</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        public Builder privateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
            this.putQueryParameter("PrivateDnsNameOptions", privateDnsNameOptions);
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        public Builder recyclable(Boolean recyclable) {
            this.putQueryParameter("Recyclable", recyclable);
            this.recyclable = recyclable;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         */
        public Builder remoteConnectionOptions(RemoteConnectionOptions remoteConnectionOptions) {
            this.putQueryParameter("RemoteConnectionOptions", remoteConnectionOptions);
            this.remoteConnectionOptions = remoteConnectionOptions;
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
         * <p>The IDs of replacement security groups.</p>
         * <ul>
         * <li>All security group IDs must be unique.</li>
         * <li>The instance is moved from the current security groups to the replacement security groups. If you want the instance to remain in the current security groups, add the IDs of the current security groups to the list.</li>
         * <li>You can move the instance to security groups of a different type. However, the list cannot contain the IDs of both basic and advanced security groups.</li>
         * <li>The security groups and the instance must belong to the same VPC.</li>
         * <li>The valid values of N vary based on the maximum number of security groups to which the instance can belong. For more information, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section in the &quot;Limits and quotas&quot; topic.</li>
         * <li>New security groups become valid for the instance after a short delay.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7o****</p>
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The user data of the instance. The user data must be encoded in Base64.</p>
         * <p>The maximum size of the raw data before encoding is 32 KB. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you must pass in confidential information, we recommend that you encrypt and Base64-encode the information before you pass it in. Then, you can decode and decrypt the information in the same way within the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ModifyInstanceAttributeRequest build() {
            return new ModifyInstanceAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceAttributeRequest</p>
     */
    public static class CpuOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        private CpuOptions(Builder builder) {
            this.topologyType = builder.topologyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        public static final class Builder {
            private String topologyType; 

            /**
             * <p>The CPU topology type of the instance. Valid values:</p>
             * <ul>
             * <li><code>ContinuousCoreToHTMapping</code>: The Hyper-Threading (HT) technology allows continuous threads to run on the same core in the CPU topology of the instance.</li>
             * <li><code>DiscreteCoreToHTMapping</code>: The HT technology allows discrete threads to run on the same core in the CPU topology of the instance.</li>
             * </ul>
             * <p>By default, this parameter is left empty.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is supported only by specific instance families. For information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify CPU topologies</a>.</p>
             * </li>
             * <li><p>Before you specify this parameter, make sure that the instance is in the Stopped (<code>Stopped</code>) state.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DiscreteCoreToHTMapping</p>
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            public CpuOptions build() {
                return new CpuOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyInstanceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceAttributeRequest</p>
     */
    public static class PrivateDnsNameOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsAAAARecord")
        private Boolean enableInstanceIdDnsAAAARecord;

        @com.aliyun.core.annotation.NameInMap("EnableInstanceIdDnsARecord")
        private Boolean enableInstanceIdDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsARecord")
        private Boolean enableIpDnsARecord;

        @com.aliyun.core.annotation.NameInMap("EnableIpDnsPtrRecord")
        private Boolean enableIpDnsPtrRecord;

        @com.aliyun.core.annotation.NameInMap("HostnameType")
        private String hostnameType;

        private PrivateDnsNameOptions(Builder builder) {
            this.enableInstanceIdDnsAAAARecord = builder.enableInstanceIdDnsAAAARecord;
            this.enableInstanceIdDnsARecord = builder.enableInstanceIdDnsARecord;
            this.enableIpDnsARecord = builder.enableIpDnsARecord;
            this.enableIpDnsPtrRecord = builder.enableIpDnsPtrRecord;
            this.hostnameType = builder.hostnameType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateDnsNameOptions create() {
            return builder().build();
        }

        /**
         * @return enableInstanceIdDnsAAAARecord
         */
        public Boolean getEnableInstanceIdDnsAAAARecord() {
            return this.enableInstanceIdDnsAAAARecord;
        }

        /**
         * @return enableInstanceIdDnsARecord
         */
        public Boolean getEnableInstanceIdDnsARecord() {
            return this.enableInstanceIdDnsARecord;
        }

        /**
         * @return enableIpDnsARecord
         */
        public Boolean getEnableIpDnsARecord() {
            return this.enableIpDnsARecord;
        }

        /**
         * @return enableIpDnsPtrRecord
         */
        public Boolean getEnableIpDnsPtrRecord() {
            return this.enableIpDnsPtrRecord;
        }

        /**
         * @return hostnameType
         */
        public String getHostnameType() {
            return this.hostnameType;
        }

        public static final class Builder {
            private Boolean enableInstanceIdDnsAAAARecord; 
            private Boolean enableInstanceIdDnsARecord; 
            private Boolean enableIpDnsARecord; 
            private Boolean enableIpDnsPtrRecord; 
            private String hostnameType; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
                this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
                this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpDnsARecord(Boolean enableIpDnsARecord) {
                this.enableIpDnsARecord = enableIpDnsARecord;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
                this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder hostnameType(String hostnameType) {
                this.hostnameType = hostnameType;
                return this;
            }

            public PrivateDnsNameOptions build() {
                return new PrivateDnsNameOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyInstanceAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceAttributeRequest</p>
     */
    public static class RemoteConnectionOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RemoteConnectionOptions(Builder builder) {
            this.password = builder.password;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteConnectionOptions create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String password; 
            private String type; 

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hide</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RemoteConnectionOptions build() {
                return new RemoteConnectionOptions(this);
            } 

        } 

    }
}
