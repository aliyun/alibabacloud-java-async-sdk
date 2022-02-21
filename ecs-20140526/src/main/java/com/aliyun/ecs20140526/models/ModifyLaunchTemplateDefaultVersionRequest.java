// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLaunchTemplateDefaultVersionRequest} extends {@link RequestModel}
 *
 * <p>ModifyLaunchTemplateDefaultVersionRequest</p>
 */
public class ModifyLaunchTemplateDefaultVersionRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DefaultVersionNumber")
    private Long defaultVersionNumber;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    private ModifyLaunchTemplateDefaultVersionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.launchTemplateId = builder.launchTemplateId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.defaultVersionNumber = builder.defaultVersionNumber;
        this.launchTemplateName = builder.launchTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLaunchTemplateDefaultVersionRequest create() {
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
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
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
     * @return defaultVersionNumber
     */
    public Long getDefaultVersionNumber() {
        return this.defaultVersionNumber;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public static final class Builder extends Request.Builder<ModifyLaunchTemplateDefaultVersionRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private String launchTemplateId; 
        private Long resourceOwnerId; 
        private String resourceOwnerAccount; 
        private Long ownerId; 
        private String regionId; 
        private Long defaultVersionNumber; 
        private String launchTemplateName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLaunchTemplateDefaultVersionRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.launchTemplateId = response.launchTemplateId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.defaultVersionNumber = response.defaultVersionNumber;
            this.launchTemplateName = response.launchTemplateName;
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
         * The ID of the launch template. You must specify LaunchTemplateId or LaunchTemplateName to determine the template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
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
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Template belongs geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Set as default version of starter template version number.
         */
        public Builder defaultVersionNumber(Long defaultVersionNumber) {
            this.putQueryParameter("DefaultVersionNumber", defaultVersionNumber);
            this.defaultVersionNumber = defaultVersionNumber;
            return this;
        }

        /**
         * Start template name. You must specify LaunchTemplateId or LaunchTemplateName to determine the template.
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        @Override
        public ModifyLaunchTemplateDefaultVersionRequest build() {
            return new ModifyLaunchTemplateDefaultVersionRequest(this);
        } 

    } 

}
