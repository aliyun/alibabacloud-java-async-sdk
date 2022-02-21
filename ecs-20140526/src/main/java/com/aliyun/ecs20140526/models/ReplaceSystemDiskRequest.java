// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceSystemDiskRequest} extends {@link RequestModel}
 *
 * <p>ReplaceSystemDiskRequest</p>
 */
public class ReplaceSystemDiskRequest extends Request {
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("Architecture")
    private String architecture;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("SecurityEnhancementStrategy")
    private String securityEnhancementStrategy;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("UseAdditionalService")
    private Boolean useAdditionalService;

    private ReplaceSystemDiskRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.diskId = builder.diskId;
        this.instanceId = builder.instanceId;
        this.imageId = builder.imageId;
        this.clientToken = builder.clientToken;
        this.passwordInherit = builder.passwordInherit;
        this.architecture = builder.architecture;
        this.platform = builder.platform;
        this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
        this.keyPairName = builder.keyPairName;
        this.password = builder.password;
        this.useAdditionalService = builder.useAdditionalService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceSystemDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return securityEnhancementStrategy
     */
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return useAdditionalService
     */
    public Boolean getUseAdditionalService() {
        return this.useAdditionalService;
    }

    public static final class Builder extends Request.Builder<ReplaceSystemDiskRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String diskId; 
        private String instanceId; 
        private String imageId; 
        private String clientToken; 
        private Boolean passwordInherit; 
        private String architecture; 
        private String platform; 
        private String securityEnhancementStrategy; 
        private String keyPairName; 
        private String password; 
        private Boolean useAdditionalService; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceSystemDiskRequest response) {
            super(response);
            this.systemDisk = response.systemDisk;
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.diskId = response.diskId;
            this.instanceId = response.instanceId;
            this.imageId = response.imageId;
            this.clientToken = response.clientToken;
            this.passwordInherit = response.passwordInherit;
            this.architecture = response.architecture;
            this.platform = response.platform;
            this.securityEnhancementStrategy = response.securityEnhancementStrategy;
            this.keyPairName = response.keyPairName;
            this.password = response.password;
            this.useAdditionalService = response.useAdditionalService;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
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
         * The ID of the image used to reset the system.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to use the default password of the image.
         * <p>
         * 
         * Default value: false
         * 
         * > If this parameter is used, the Password parameter must be empty. Make sure that the password is set for the image you are using.
         * 
         * 
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The system architecture. Valid values:
         * <p>
         * 
         * -i386
         * -x86_64
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * The operating system release. Valid values:
         * <p>
         * 
         * -CentOS
         * 
         * -Ubuntu
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * Indicates whether to use security center for free after the system disk is replaced. Valid values:
         * <p>
         * 
         * -Active: used. This value only supports public images.
         * 
         * -Deactive: not used. This value supports all images.
         * 
         * Default value: Deactive
         */
        public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
            this.putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
            this.securityEnhancementStrategy = securityEnhancementStrategy;
            return this;
        }

        /**
         * The name of the key pair.
         * <p>
         * 
         * > This parameter takes effect only for Linux ECS instances. You can bind an SSH key pair to an ECS instance as a logon credential. After an SSH key pair is used, the logon credential for the username and password is disabled.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * Specifies whether to reset the username and password of the ECS instance. The description must be 8 to 30 characters in length and must contain letters, digits, and special characters. Special symbols can be:
         * <p>
         * 
         * """
         * ()"~! @%& *-_+ =} [],.?/
         * """
         * 
         * The Windows instance cannot start with a slash (/).
         * 
         * Default value: the value remains unchanged.
         * 
         * > If the "Password" parameter is specified, we recommend that you send requests over HTTPS to avoid password leakage.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Whether to use Alibaba Cloud provided virtual machine system configuration (Windows:NTP, KMS;Linux:NTP, YUM).
         * <p>
         * 
         * > Mount system disk (which is the device named/dev/xvda) effective.
         */
        public Builder useAdditionalService(Boolean useAdditionalService) {
            this.putQueryParameter("UseAdditionalService", useAdditionalService);
            this.useAdditionalService = useAdditionalService;
            return this;
        }

        @Override
        public ReplaceSystemDiskRequest build() {
            return new ReplaceSystemDiskRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private Integer size; 

            /**
             * The capacity of the new system disk. Unit: GiB. Valid values: Max{20. The size of the image corresponding to the parameter ImageId} to 500.
             * <p>
             * 
             * Default value: Max{40. The size of the image corresponding to the parameter ImageId}.
             * 
             * > additional fees will be charged if the disk capacity exceeds the value of max {20, system disk capacity before replacement}.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
