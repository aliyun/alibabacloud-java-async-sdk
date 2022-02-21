// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAttributeRequest</p>
 */
public class ModifyInstanceAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("Recyclable")
    private Boolean recyclable;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("UserData")
    private String userData;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.recyclable = builder.recyclable;
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.description = builder.description;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.instanceName = builder.instanceName;
        this.creditSpecification = builder.creditSpecification;
        this.password = builder.password;
        this.securityGroupIds = builder.securityGroupIds;
        this.deletionProtection = builder.deletionProtection;
        this.networkInterfaceQueueNumber = builder.networkInterfaceQueueNumber;
        this.hostName = builder.hostName;
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
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return recyclable
     */
    public Boolean getRecyclable() {
        return this.recyclable;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return creditSpecification
     */
    public String getCreditSpecification() {
        return this.creditSpecification;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List < String > getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return networkInterfaceQueueNumber
     */
    public Integer getNetworkInterfaceQueueNumber() {
        return this.networkInterfaceQueueNumber;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Boolean recyclable; 
        private String instanceId; 
        private Long ownerId; 
        private String description; 
        private Long resourceOwnerId; 
        private String resourceOwnerAccount; 
        private String instanceName; 
        private String creditSpecification; 
        private String password; 
        private java.util.List < String > securityGroupIds; 
        private Boolean deletionProtection; 
        private Integer networkInterfaceQueueNumber; 
        private String hostName; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.recyclable = response.recyclable;
            this.instanceId = response.instanceId;
            this.ownerId = response.ownerId;
            this.description = response.description;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.instanceName = response.instanceName;
            this.creditSpecification = response.creditSpecification;
            this.password = response.password;
            this.securityGroupIds = response.securityGroupIds;
            this.deletionProtection = response.deletionProtection;
            this.networkInterfaceQueueNumber = response.networkInterfaceQueueNumber;
            this.hostName = response.hostName;
            this.userData = response.userData;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * Recyclable.
         */
        public Builder recyclable(Boolean recyclable) {
            this.putQueryParameter("Recyclable", recyclable);
            this.recyclable = recyclable;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The description of the instance. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         * <p>
         * 
         * Default value: None
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Modify the running mode of a burstable instance. Valid values:
         * <p>
         * 
         * -Standard: Standard mode. For more information about instance performance, see performance constraint mode in [What is burstable instance](~~ 59977 ~~).
         * -Unlimited: Unlimited Mode. For more information about instance performance, see Unlimited mode in [What is burstable instance](~~ 59977 ~~).
         * 
         * Default value: None
         */
        public Builder creditSpecification(String creditSpecification) {
            this.putQueryParameter("CreditSpecification", creditSpecification);
            this.creditSpecification = creditSpecification;
            return this;
        }

        /**
         * The password of the instance. Support length is 8 to 30 characters, must contain both case English letters, numbers, and special symbols of three categories in the characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
         * 
         * The Windows instance cannot start with a slash (/).
         * 
         * > If the "Password" parameter is specified, we recommend that you send requests over HTTPS to avoid password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Instance back join security group list.
         * <p>
         * 
         * -Security Group ID cannot be repeated.
         * -Instance will leave the current security group, for retention settings, you need to in the list add the current security group ID.
         * -Support switch security group type, but set security group in the list cannot contain both ordinary security group and Enterprise Security Group.
         * -Security Group must and instance belong to the same VPC.
         * -N-value range and instance can add security group quota-related, for more details, please see [use restrictions](~~ 25412#SecurityGroupQuota1 ~~) security group chapters.
         * -After the security group is modified, it will soon take effect on the corresponding instance, but there may be a small delay.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * Instance release protection attribute, specifies whether support pass console or API([DeleteInstance](~~ 25507 ~~)) release instance.
         * <p>
         * 
         * Default value: None
         * 
         * > This property only applies to quantity pay instance, and only limit manual release operation, the system release operation no effect.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The primary card number of queues.
         * <p>
         * 
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
            return this;
        }

        /**
         * Operation the host name of the system. Modify when a host name, please call RebootInstance changes to take effect.
         * <p>
         * 
         * -Windows Server System: length is 2-15 characters, allowed case letters, numbers, or hyphens (-). Can"t to hyphen (-) beginning or end, can"t continuous use a hyphen (-), also can not only use digital.
         * 
         * -Other Type instance (Linux, etc.): length is 2-64 characters, allowed to use the period (.) delimited character into polyline, each segment allowed lower case letters, numbers, or a hyphen (-), but not continuous use the period (.) or a hyphen (-). Can"t to the period (.) or a hyphen (-) beginning or end.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * Instance custom data, need to Base64 encoding.
         * <p>
         * 
         * Before coding, original data cannot exceed 16KB. Not recommended clear text incoming sensitive information, such as passwords and private key. If you must incoming sensitive information, recommends that you encrypt after to Base64 coding incoming, instance interior in the same way decryption.
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

}
