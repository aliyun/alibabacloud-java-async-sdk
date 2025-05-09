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
 * {@link ModifyImageSharePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageSharePermissionRequest</p>
 */
public class ModifyImageSharePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddAccount")
    private java.util.List<String> addAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsPublic")
    private Boolean isPublic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaunchPermission")
    private String launchPermission;

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
    @com.aliyun.core.annotation.NameInMap("RemoveAccount")
    private java.util.List<String> removeAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyImageSharePermissionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.addAccount = builder.addAccount;
        this.dryRun = builder.dryRun;
        this.imageId = builder.imageId;
        this.isPublic = builder.isPublic;
        this.launchPermission = builder.launchPermission;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.removeAccount = builder.removeAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageSharePermissionRequest create() {
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
     * @return addAccount
     */
    public java.util.List<String> getAddAccount() {
        return this.addAccount;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return this.isPublic;
    }

    /**
     * @return launchPermission
     */
    public String getLaunchPermission() {
        return this.launchPermission;
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
     * @return removeAccount
     */
    public java.util.List<String> getRemoveAccount() {
        return this.removeAccount;
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

    public static final class Builder extends Request.Builder<ModifyImageSharePermissionRequest, Builder> {
        private String sourceRegionId; 
        private java.util.List<String> addAccount; 
        private Boolean dryRun; 
        private String imageId; 
        private Boolean isPublic; 
        private String launchPermission; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> removeAccount; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageSharePermissionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.addAccount = request.addAccount;
            this.dryRun = request.dryRun;
            this.imageId = request.imageId;
            this.isPublic = request.isPublic;
            this.launchPermission = request.launchPermission;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.removeAccount = request.removeAccount;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * <p>The IDs of Alibaba Cloud accounts to which you want to share the custom image. Valid values of N: 1 to 10. If you specify more than 10 Alibaba Cloud account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder addAccount(java.util.List<String> addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the shared custom image.</p>
         * <blockquote>
         * <p> You can share images encrypted by using CMKs but cannot share images encrypted by using service keys. When you share an image encrypted by using a service key, an error is reported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp18ygjuqnwhechc****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>Specifies whether to publish or unpublish a community image. Valid values:</p>
         * <ul>
         * <li>true: publishes the custom image as a community image.</li>
         * <li>false: unpublishes a community image. The unpublish operation takes effect only on community images.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPublic(Boolean isPublic) {
            this.putQueryParameter("IsPublic", isPublic);
            this.isPublic = isPublic;
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
        public Builder launchPermission(String launchPermission) {
            this.putQueryParameter("LaunchPermission", launchPermission);
            this.launchPermission = launchPermission;
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
         * <p>The region ID of the custom image. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The IDs of Alibaba Cloud accounts from which you want to unshare the custom image. Valid values of N: 1 to 10. If you specify more than 10 Alibaba Cloud account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder removeAccount(java.util.List<String> removeAccount) {
            this.putQueryParameter("RemoveAccount", removeAccount);
            this.removeAccount = removeAccount;
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
        public ModifyImageSharePermissionRequest build() {
            return new ModifyImageSharePermissionRequest(this);
        } 

    } 

}
