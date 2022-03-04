// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("CreditSpecification")
    private String creditSpecification;

    @Query
    @NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @Query
    @NameInMap("SecurityGroupIds")
    private java.util.List < String > securityGroupIds;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("NetworkInterfaceQueueNumber")
    private Integer networkInterfaceQueueNumber;

    @Query
    @NameInMap("HostName")
    private String hostName;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.recyclable = builder.recyclable;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.instanceId = builder.instanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.password = builder.password;
        this.instanceName = builder.instanceName;
        this.description = builder.description;
        this.creditSpecification = builder.creditSpecification;
        this.deletionProtection = builder.deletionProtection;
        this.securityGroupIds = builder.securityGroupIds;
        this.userData = builder.userData;
        this.networkInterfaceQueueNumber = builder.networkInterfaceQueueNumber;
        this.hostName = builder.hostName;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Boolean recyclable; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String instanceId; 
        private Long resourceOwnerId; 
        private String password; 
        private String instanceName; 
        private String description; 
        private String creditSpecification; 
        private Boolean deletionProtection; 
        private java.util.List < String > securityGroupIds; 
        private String userData; 
        private Integer networkInterfaceQueueNumber; 
        private String hostName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.recyclable = request.recyclable;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.instanceId = request.instanceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.password = request.password;
            this.instanceName = request.instanceName;
            this.description = request.description;
            this.creditSpecification = request.creditSpecification;
            this.deletionProtection = request.deletionProtection;
            this.securityGroupIds = request.securityGroupIds;
            this.userData = request.userData;
            this.networkInterfaceQueueNumber = request.networkInterfaceQueueNumber;
            this.hostName = request.hostName;
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
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * The password of the instance. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
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
         * The name of the instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
         * The release protection property of the instance, which specifies whether to release the instance through the console or API([DeleteInstance](~~ 25507 ~~)).
         * <p>
         * 
         * Default value: None
         * 
         * > This attribute applies only to pay-as-you-go instances and can only restrict manual release operations. This attribute does not take effect for system release operations.
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The list of security groups to which the instance is added.
         * <p>
         * 
         * -The security group ID must be unique.
         * -The instance will leave the current security group. To retain the settings, you must add the current security group ID to the list.
         * -You can change the security group type. However, the security group list cannot contain both basic and enterprise security groups.
         * -The security group and the instance must belong to the same VPC.
         * The value range of-N depends on the number of security groups that the instance can join. For more information, see [limits](~~ 25412#SecurityGroupQuota1 ~~) security groups.
         * -After the security group is modified, it will soon take effect on the corresponding instance, but there may be a small delay.
         */
        public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * The user data of the instance, which must be base64-encoded.
         * <p>
         * 
         * Before encoding, the raw data cannot exceed 16kb. We recommend that you do not pass sensitive information in plaintext, such as passwords and private keys. If sensitive information is required, we recommend that you encrypt it before passing it in Base64 encoding, and decrypt it in the same way inside the instance.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The number of queues for the primary eni.
         * <p>
         * 
         */
        public Builder networkInterfaceQueueNumber(Integer networkInterfaceQueueNumber) {
            this.putQueryParameter("NetworkInterfaceQueueNumber", networkInterfaceQueueNumber);
            this.networkInterfaceQueueNumber = networkInterfaceQueueNumber;
            return this;
        }

        /**
         * The hostname of the operating system. After you modify the hostname, call the RebootInstance to make the modification take effect.
         * <p>
         * 
         * -Windows Server: the system must be 2 to 15 characters in length and can contain uppercase and lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen (-). It cannot contain consecutive hyphens (-) or digits.
         * 
         * -Other types of instances (such as Linux): the name must be 2 to 64 characters in length and can be separated by periods (.) into multiple segments. Each segment can contain uppercase and lowercase letters, digits, or hyphens (-), but cannot contain periods (.) or hyphens (-). It cannot start or end with a dot (.) or a hyphen (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        @Override
        public ModifyInstanceAttributeRequest build() {
            return new ModifyInstanceAttributeRequest(this);
        } 

    } 

}
