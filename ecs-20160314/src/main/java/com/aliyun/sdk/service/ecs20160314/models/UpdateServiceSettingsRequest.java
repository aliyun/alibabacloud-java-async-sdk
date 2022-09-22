// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceSettingsRequest</p>
 */
public class UpdateServiceSettingsRequest extends Request {
    @Query
    @NameInMap("CloudAssistantDeliverySettings")
    private CloudAssistantDeliverySettings cloudAssistantDeliverySettings;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateServiceSettingsRequest(Builder builder) {
        super(builder);
        this.cloudAssistantDeliverySettings = builder.cloudAssistantDeliverySettings;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAssistantDeliverySettings
     */
    public CloudAssistantDeliverySettings getCloudAssistantDeliverySettings() {
        return this.cloudAssistantDeliverySettings;
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

    public static final class Builder extends Request.Builder<UpdateServiceSettingsRequest, Builder> {
        private CloudAssistantDeliverySettings cloudAssistantDeliverySettings; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceSettingsRequest request) {
            super(request);
            this.cloudAssistantDeliverySettings = request.cloudAssistantDeliverySettings;
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * CloudAssistantDeliverySettings.
         */
        public Builder cloudAssistantDeliverySettings(CloudAssistantDeliverySettings cloudAssistantDeliverySettings) {
            this.putQueryParameter("CloudAssistantDeliverySettings", cloudAssistantDeliverySettings);
            this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
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
         * RegionId.
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

        @Override
        public UpdateServiceSettingsRequest build() {
            return new UpdateServiceSettingsRequest(this);
        } 

    } 

    public static class CloudAssistantDeliverySettings extends TeaModel {
        @NameInMap("OssBucketName")
        private String ossBucketName;

        @NameInMap("OssEnabled")
        private Boolean ossEnabled;

        @NameInMap("OssKeyPrefix")
        private String ossKeyPrefix;

        @NameInMap("SlsEnabled")
        private Boolean slsEnabled;

        @NameInMap("SlsLogstoreName")
        private String slsLogstoreName;

        @NameInMap("SlsProjectName")
        private String slsProjectName;

        private CloudAssistantDeliverySettings(Builder builder) {
            this.ossBucketName = builder.ossBucketName;
            this.ossEnabled = builder.ossEnabled;
            this.ossKeyPrefix = builder.ossKeyPrefix;
            this.slsEnabled = builder.slsEnabled;
            this.slsLogstoreName = builder.slsLogstoreName;
            this.slsProjectName = builder.slsProjectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssistantDeliverySettings create() {
            return builder().build();
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossEnabled
         */
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        /**
         * @return ossKeyPrefix
         */
        public String getOssKeyPrefix() {
            return this.ossKeyPrefix;
        }

        /**
         * @return slsEnabled
         */
        public Boolean getSlsEnabled() {
            return this.slsEnabled;
        }

        /**
         * @return slsLogstoreName
         */
        public String getSlsLogstoreName() {
            return this.slsLogstoreName;
        }

        /**
         * @return slsProjectName
         */
        public String getSlsProjectName() {
            return this.slsProjectName;
        }

        public static final class Builder {
            private String ossBucketName; 
            private Boolean ossEnabled; 
            private String ossKeyPrefix; 
            private Boolean slsEnabled; 
            private String slsLogstoreName; 
            private String slsProjectName; 

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssEnabled.
             */
            public Builder ossEnabled(Boolean ossEnabled) {
                this.ossEnabled = ossEnabled;
                return this;
            }

            /**
             * OssKeyPrefix.
             */
            public Builder ossKeyPrefix(String ossKeyPrefix) {
                this.ossKeyPrefix = ossKeyPrefix;
                return this;
            }

            /**
             * SlsEnabled.
             */
            public Builder slsEnabled(Boolean slsEnabled) {
                this.slsEnabled = slsEnabled;
                return this;
            }

            /**
             * SlsLogstoreName.
             */
            public Builder slsLogstoreName(String slsLogstoreName) {
                this.slsLogstoreName = slsLogstoreName;
                return this;
            }

            /**
             * SlsProjectName.
             */
            public Builder slsProjectName(String slsProjectName) {
                this.slsProjectName = slsProjectName;
                return this;
            }

            public CloudAssistantDeliverySettings build() {
                return new CloudAssistantDeliverySettings(this);
            } 

        } 

    }
}
