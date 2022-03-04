// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLaunchTemplateVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteLaunchTemplateVersionRequest</p>
 */
public class DeleteLaunchTemplateVersionRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("DeleteVersion")
    @Validation(required = true)
    private java.util.List < Long > deleteVersion;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    private DeleteLaunchTemplateVersionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.deleteVersion = builder.deleteVersion;
        this.launchTemplateName = builder.launchTemplateName;
        this.launchTemplateId = builder.launchTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLaunchTemplateVersionRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deleteVersion
     */
    public java.util.List < Long > getDeleteVersion() {
        return this.deleteVersion;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteLaunchTemplateVersionRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private java.util.List < Long > deleteVersion; 
        private String launchTemplateName; 
        private String launchTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLaunchTemplateVersionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.deleteVersion = request.deleteVersion;
            this.launchTemplateName = request.launchTemplateName;
            this.launchTemplateId = request.launchTemplateId;
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
         * The ID of the region to which the template belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The version number of the template to be deleted.
         */
        public Builder deleteVersion(java.util.List < Long > deleteVersion) {
            this.putQueryParameter("DeleteVersion", deleteVersion);
            this.deleteVersion = deleteVersion;
            return this;
        }

        /**
         * The name of the launch template.
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * The ID of the launch template to be deleted. For more information, see [DescribeLaunchTemplates](~~ 73759 ~~).
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        @Override
        public DeleteLaunchTemplateVersionRequest build() {
            return new DeleteLaunchTemplateVersionRequest(this);
        } 

    } 

}
