// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The performance mode of the burstable instance. Valid values:
         * <p>
         * 
         * *   Standard
         * *   Unlimited
         * 
         * For more information about the performance modes of burstable instances, see [Overview](~~59977~~).
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * The release protection attribute of the instance. This parameter specifies whether you can use the ECS console or call the [DeleteInstance](~~25507~~) operation to release the instance.
         * <p>
         * 
         * >  This parameter is applicable only to pay-as-you-go instances. The release protection attribute can protect instances against manual releases, but not against automatic releases.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The description of the instance. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:
         * <p>
         * 
         * true
         * 
         * false
         * 
         * You can enable the Jumbo Frames feature only for specific instance types. For more information, see [MTUs](~~200512~~).
         */
        public Builder enableJumboFrame(Boolean enableJumboFrame) {
            this.putQueryParameter("EnableJumboFrame", enableJumboFrame);
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }

        /**
         * The hostname of the instance. Take note of the following items:
         * <p>
         * 
         * *   When you change the hostname of the instance, the instance cannot be in the Creating (`Pending`) or Starting (`Starting`) state. Otherwise, the new hostname and the configurations in `/etc/hosts` may not take effect. You can call the [DescribeInstances](~~25506~~) operation to query the status of the instance.
         * *   After you change the hostname, you must call the [RebootInstance](~~25502~~) operation for the new hostname to take effect.
         * 
         * The following limits apply to the hostnames of instances that run different operating systems:
         * 
         * *   For Windows Server, the hostname must be 2 to 15 characters in length and can contain letters, digits, and hyphens (-). The hostname cannot start or end with a hyphen (-), contain consecutive hyphens (-), or contain only digits.
         * *   For other operating systems such as Linux, the hostname must be 2 to 64 characters in length. You can use periods (.) to separate a hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-). The hostname cannot contain consecutive periods (.) or hyphens (-). The hostname cannot start or end with a period (.) or a hyphen (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the instance. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The number of queues supported by the primary ENI.
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
         * The password of the instance. The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported:
         * <p>
         * 
         *     ( ) ` ~ ! @ # $ % ^ & * - _ + = | { } [ ] : ; \" < > , . ? /
         * 
         * The password of a Windows instance cannot start with a forward slash (/).
         * 
         * >  For security reasons, we recommend that you use HTTPS to send requests if `Password` is specified.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PrivateDnsNameOptions.
         */
        public Builder privateDnsNameOptions(PrivateDnsNameOptions privateDnsNameOptions) {
            this.putQueryParameter("PrivateDnsNameOptions", privateDnsNameOptions);
            this.privateDnsNameOptions = privateDnsNameOptions;
            return this;
        }

        /**
         * >  This parameter is in invitational preview and is not publicly available.
         */
        public Builder recyclable(Boolean recyclable) {
            this.putQueryParameter("Recyclable", recyclable);
            this.recyclable = recyclable;
            return this;
        }

        /**
         * >  This parameter is in invitational preview and is not publicly available.
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
         * The IDs of replacement security groups.
         * <p>
         * 
         * *   All security group IDs must be unique.
         * *   The instance is moved from the current security groups to the replacement security groups. If you want the instance to remain in the current security groups, add the IDs of the current security groups to the list.
         * *   You can move the instance to security groups of a different type. However, the list cannot contain the IDs of both basic and advanced security groups.
         * *   The security groups and the instance must belong to the same VPC.
         * *   The valid values of N vary based on the maximum number of security groups to which the instance can belong. For more information, see the [Security group limits](~~25412#SecurityGroupQuota1~~) section in the "Limits and quotas" topic.
         * *   New security groups become valid for the instance after a short latency.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The user data of the instance. The user data must be encoded in Base64.
         * <p>
         * 
         * The maximum size of the raw data before encoding is 32 KB. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you must pass in confidential information, we recommend that you encrypt and Base64-encode the information before you pass it in. Then, you can decode and decrypt the information in the same way within the instance.
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
             * The CPU topology type of the instance. Valid values:
             * <p>
             * 
             * *   `ContinuousCoreToHTMapping`: The Hyper-Threading (HT) technology allows continuous threads to run on the same core in the CPU topology of the instance.
             * *   `DiscreteCoreToHTMapping`: The HT technology allows discrete threads to run on the same core in the CPU topology of the instance.
             * 
             * By default, this parameter is left empty.
             * 
             * > 
             * 
             * *   This parameter is supported only by specific instance families. For information about the supported instance families, see [View and modify CPU topologies](~~2636059~~).
             * 
             * *   Before you specify this parameter, make sure that the instance is in the Stopped (`Stopped`) state.
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
             * EnableInstanceIdDnsAAAARecord.
             */
            public Builder enableInstanceIdDnsAAAARecord(Boolean enableInstanceIdDnsAAAARecord) {
                this.enableInstanceIdDnsAAAARecord = enableInstanceIdDnsAAAARecord;
                return this;
            }

            /**
             * EnableInstanceIdDnsARecord.
             */
            public Builder enableInstanceIdDnsARecord(Boolean enableInstanceIdDnsARecord) {
                this.enableInstanceIdDnsARecord = enableInstanceIdDnsARecord;
                return this;
            }

            /**
             * EnableIpDnsARecord.
             */
            public Builder enableIpDnsARecord(Boolean enableIpDnsARecord) {
                this.enableIpDnsARecord = enableIpDnsARecord;
                return this;
            }

            /**
             * EnableIpDnsPtrRecord.
             */
            public Builder enableIpDnsPtrRecord(Boolean enableIpDnsPtrRecord) {
                this.enableIpDnsPtrRecord = enableIpDnsPtrRecord;
                return this;
            }

            /**
             * HostnameType.
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
             * >  This parameter is in invitational preview and is not publicly available.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * >  This parameter is in invitational preview and is not publicly available.
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
