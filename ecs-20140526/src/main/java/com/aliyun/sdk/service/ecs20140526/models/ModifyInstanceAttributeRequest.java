// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("EnableNetworkEncryption")
    private Boolean enableNetworkEncryption;

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
    private java.util.List<String> securityGroupIds;

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
        this.enableNetworkEncryption = builder.enableNetworkEncryption;
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
     * @return enableNetworkEncryption
     */
    public Boolean getEnableNetworkEncryption() {
        return this.enableNetworkEncryption;
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
    public java.util.List<String> getSecurityGroupIds() {
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
        private Boolean enableNetworkEncryption; 
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
        private java.util.List<String> securityGroupIds; 
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
            this.enableNetworkEncryption = request.enableNetworkEncryption;
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
         * <p>The running mode of the burstable instance. Valid values:</p>
         * <ul>
         * <li>Standard: standard mode.</li>
         * <li>Unlimited: unlimited mode.</li>
         * </ul>
         * <p>For more information about the running modes of burstable instances, see <a href="https://help.aliyun.com/document_detail/59977.html">Overview of burstable instances</a>.</p>
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
         * <p>The release protection attribute of the instance. Specifies whether the instance can be released from the console or by calling <a href="https://help.aliyun.com/document_detail/25507.html">DeleteInstance</a>.</p>
         * <blockquote>
         * <p>This attribute is applicable only to pay-as-you-go instances. It can only restrict manual release operations and does not take effect on system-initiated release operations.</p>
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
         * <p>Specifies whether to enable the Jumbo Frame feature for the instance MTU. Valid values:</p>
         * <ul>
         * <li>true: enables the feature.</li>
         * <li>false: does not enable the feature.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The instance must be in the Running or Stopped state.</li>
         * <li>The instance must be a VPC-connected instance.</li>
         * <li>After the Jumbo Frame feature is enabled, the MTU value of the instance changes to 8500. After the feature is disabled, the MTU value is rolled back to 1500.
         * Only specific instance types support the Jumbo Frame feature. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</li>
         * </ul>
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
         * <p>Specifies whether to enable VPC network traffic encryption. Valid values:</p>
         * <ul>
         * <li>true: enables the encryption.</li>
         * <li>false: disables the encryption.<blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNetworkEncryption(Boolean enableNetworkEncryption) {
            this.putQueryParameter("EnableNetworkEncryption", enableNetworkEncryption);
            this.enableNetworkEncryption = enableNetworkEncryption;
            return this;
        }

        /**
         * <p>The hostname of the operating system. Take note of the following items:</p>
         * <ul>
         * <li><p>The instance cannot be in the Pending or Starting state. Otherwise, the hostname and <code>/etc/hosts</code> configuration may not take effect. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query the current status of the instance.</p>
         * </li>
         * <li><p>The new hostname takes effect after you restart the instance. You can restart the instance in the ECS console (for more information, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>. Restarting the instance from within the operating system does not take effect.</p>
         * </li>
         * </ul>
         * <p>The following limits apply to hostnames for different operating systems:</p>
         * <ul>
         * <li><p>Windows Server: The hostname must be 2 to 15 characters in length and can contain uppercase letters, lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-), cannot contain consecutive hyphens (-), and cannot contain only digits.</p>
         * </li>
         * <li><p>Other instances (such as Linux): The hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain uppercase letters, lowercase letters, digits, and hyphens (-), but cannot contain consecutive periods (.) or hyphens (-). The hostname cannot start or end with a period (.) or hyphen (-).</p>
         * </li>
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
         * <p>The name of the instance. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
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
         * <p>The number of queues supported by the primary network interface controller (NIC). Take note of the following items:</p>
         * <ul>
         * <li>The instance must be in the Stopped state.</li>
         * <li>The value cannot exceed the maximum number of queues per NIC allowed by the instance type. The total number of queues for all NICs on the instance cannot exceed the queue quota allowed by the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the maximum number of queues per NIC and the total queue quota for an instance type.</li>
         * <li>If you set this parameter to -1, the number of queues on the primary NIC is reset to the default value for the instance type. You can call <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the default number of queues for Elastic Network Interfaces (ENIs) of an instance type.</li>
         * </ul>
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
         * <p>The password of the instance. The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <strong>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</strong>
         * . For Windows instances, the password cannot start with a forward slash (/). Take note of the following items:</p>
         * <ul>
         * <li>The instance cannot be in the Starting state.</li>
         * <li>The new password takes effect after you restart the instance. You can restart the instance in the ECS console (for more information, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>) or by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>. Restarting the instance from within the operating system does not take effect.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify the Password parameter, use HTTPS to send the request to avoid password leaks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test123456&amp;$</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The private domain name configuration of the instance.</p>
         * <p>For more information about private private domain resolution, see <a href="https://help.aliyun.com/document_detail/2844797.html">ECS private private domain resolution</a>.</p>
         */
        public Builder privateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
            this.putQueryParameter("PrivateDnsNameOptions", privateDnsNameOptions);
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder recyclable(Boolean recyclable) {
            this.putQueryParameter("Recyclable", recyclable);
            this.recyclable = recyclable;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
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
         * <p>The IDs of the security groups to which the instance is reassigned. Take note of the following items:</p>
         * <ul>
         * <li>Security group IDs in the array cannot be duplicated. The maximum length of the array depends on the maximum number of security groups to which the instance can belong. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
         * <li>The instance is removed from the current security groups. To retain the current security groups, add their IDs to the array.</li>
         * <li>You can switch between security group types, but the list cannot contain both basic security groups and advanced security groups at the same time.</li>
         * <li>The security groups must belong to the same VPC as the instance.</li>
         * </ul>
         * <blockquote>
         * <p>Changes to security groups take effect on the instance shortly after the modification, but a slight delay may occur.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-bp15ed6xe1yxeycg7o****</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The instance user data. We recommend that you pass in Base64-encoded data. Take note of the following items:</p>
         * <ul>
         * <li>The instance must meet the usage limits for instance user data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Create instance user data</a>.</li>
         * <li>After you restart the instance, the new user data is displayed on the instance but is not run.</li>
         * </ul>
         * <blockquote>
         * <p>Before Base64 encoding, the raw data cannot exceed 32 KB. Do not pass in sensitive information such as passwords and private keys in plaintext. If you must pass in sensitive information, encrypt the information, encode it in Base64, and then decrypt it in the same way within the instance.</p>
         * </blockquote>
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
        @com.aliyun.core.annotation.NameInMap("Core")
        private Integer core;

        @com.aliyun.core.annotation.NameInMap("ThreadsPerCore")
        private Integer threadsPerCore;

        @com.aliyun.core.annotation.NameInMap("TopologyType")
        private String topologyType;

        @com.aliyun.core.annotation.NameInMap("EnableVISST")
        private Boolean enableVISST;

        @com.aliyun.core.annotation.NameInMap("EnableVRDT")
        private Boolean enableVRDT;

        @com.aliyun.core.annotation.NameInMap("NestedVirtualization")
        private String nestedVirtualization;

        @com.aliyun.core.annotation.NameInMap("TurboMode")
        private String turboMode;

        private CpuOptions(Builder builder) {
            this.core = builder.core;
            this.threadsPerCore = builder.threadsPerCore;
            this.topologyType = builder.topologyType;
            this.enableVISST = builder.enableVISST;
            this.enableVRDT = builder.enableVRDT;
            this.nestedVirtualization = builder.nestedVirtualization;
            this.turboMode = builder.turboMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuOptions create() {
            return builder().build();
        }

        /**
         * @return core
         */
        public Integer getCore() {
            return this.core;
        }

        /**
         * @return threadsPerCore
         */
        public Integer getThreadsPerCore() {
            return this.threadsPerCore;
        }

        /**
         * @return topologyType
         */
        public String getTopologyType() {
            return this.topologyType;
        }

        /**
         * @return enableVISST
         */
        public Boolean getEnableVISST() {
            return this.enableVISST;
        }

        /**
         * @return enableVRDT
         */
        public Boolean getEnableVRDT() {
            return this.enableVRDT;
        }

        /**
         * @return nestedVirtualization
         */
        public String getNestedVirtualization() {
            return this.nestedVirtualization;
        }

        /**
         * @return turboMode
         */
        public String getTurboMode() {
            return this.turboMode;
        }

        public static final class Builder {
            private Integer core; 
            private Integer threadsPerCore; 
            private String topologyType; 
            private Boolean enableVISST; 
            private Boolean enableVRDT; 
            private String nestedVirtualization; 
            private String turboMode; 

            private Builder() {
            } 

            private Builder(CpuOptions model) {
                this.core = model.core;
                this.threadsPerCore = model.threadsPerCore;
                this.topologyType = model.topologyType;
                this.enableVISST = model.enableVISST;
                this.enableVRDT = model.enableVRDT;
                this.nestedVirtualization = model.nestedVirtualization;
                this.turboMode = model.turboMode;
            } 

            /**
             * <p>The number of CPU cores. This parameter does not support custom values and can only use the default value.</p>
             * <p>&lt;props=&quot;china&quot;&gt;Default value: see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder core(Integer core) {
                this.core = core;
                return this;
            }

            /**
             * <p>The number of threads per CPU core. The number of vCPUs of the ECS instance = <code>CpuOptions.Core</code> value × <code>CpuOptions.ThreadsPerCore</code> value.</p>
             * <ul>
             * <li><p><code>CpuOptions.ThreadsPerCore=1</code> indicates that hyper-threading is disabled.</p>
             * </li>
             * <li><p>Only specific instance types support this parameter.</p>
             * </li>
             * </ul>
             * <p>&lt;props=&quot;china&quot;&gt;Valid values and default value: see <a href="https://help.aliyun.com/document_detail/145895.html">Customize CPU options</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder threadsPerCore(Integer threadsPerCore) {
                this.threadsPerCore = threadsPerCore;
                return this;
            }

            /**
             * <p>The CPU topology type of the instance. Valid values:</p>
             * <ul>
             * <li>ContinuousCoreToHTMapping: the hyper-threads (HTs) of the same core in the CPU topology of the instance are continuous.</li>
             * <li>DiscreteCoreToHTMapping: the HTs of the same core in the instance are discrete.</li>
             * </ul>
             * <p>Default value: null.</p>
             * <p>Take note of the following items:</p>
             * <ul>
             * <li>The instance must be in the Stopped state.</li>
             * </ul>
             * <blockquote>
             * <p>Only specific instance families support this parameter. For more information about the supported instance families, see <a href="https://help.aliyun.com/document_detail/2636059.html">View and modify the CPU topology structure</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>DiscreteCoreToHTMapping</p>
             */
            public Builder topologyType(String topologyType) {
                this.topologyType = topologyType;
                return this;
            }

            /**
             * EnableVISST.
             */
            public Builder enableVISST(Boolean enableVISST) {
                this.enableVISST = enableVISST;
                return this;
            }

            /**
             * EnableVRDT.
             */
            public Builder enableVRDT(Boolean enableVRDT) {
                this.enableVRDT = enableVRDT;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder nestedVirtualization(String nestedVirtualization) {
                this.nestedVirtualization = nestedVirtualization;
                return this;
            }

            /**
             * TurboMode.
             */
            public Builder turboMode(String turboMode) {
                this.turboMode = turboMode;
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

            private Builder() {
            } 

            private Builder(PrivateDnsNameOptions model) {
                this.enableInstanceIdDnsAAAARecord = model.enableInstanceIdDnsAAAARecord;
                this.enableInstanceIdDnsARecord = model.enableInstanceIdDnsARecord;
                this.enableIpDnsARecord = model.enableIpDnsARecord;
                this.enableIpDnsPtrRecord = model.enableIpDnsPtrRecord;
                this.hostnameType = model.hostnameType;
            } 

            /**
             * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to the IPv6 address. Valid values:</p>
             * <ul>
             * <li>true: enables the resolution.</li>
             * <li>false: disables the resolution.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
                this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable DNS resolution from the instance ID-based domain name to the IPv4 address. Valid values:</p>
             * <ul>
             * <li>true: enables the resolution.</li>
             * <li>false: disables the resolution.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
                this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable DNS resolution from the IP-based domain name to the IPv4 address. Valid values:</p>
             * <ul>
             * <li>true: enables the resolution.</li>
             * <li>false: disables the resolution.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpDnsARecord(Boolean enableIpDnsARecord) {
                this.enableIpDnsARecord = enableIpDnsARecord;
                return this;
            }

            /**
             * <p>Specifies whether to enable reverse DNS resolution from the IPv4 address to the IP-based domain name. Valid values:</p>
             * <ul>
             * <li>true: enables the resolution.</li>
             * <li>false: disables the resolution.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
                this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
                return this;
            }

            /**
             * <p>The hostname type. Valid values:</p>
             * <ul>
             * <li>Custom: custom.</li>
             * <li>IpBased: IP-based hostname.</li>
             * <li>InstanceIdBased: instance ID-based hostname.</li>
             * </ul>
             * <p>Default value: Custom.</p>
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

            private Builder() {
            } 

            private Builder(RemoteConnectionOptions model) {
                this.password = model.password;
                this.type = model.type;
            } 

            /**
             * <blockquote>
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
             * <p>This parameter is in invitational preview and is not publicly available.</p>
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
