// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLaunchTemplateVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLaunchTemplateVersionsRequest</p>
 */
public class DescribeLaunchTemplateVersionsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DefaultVersion")
    private Boolean defaultVersion;

    @Query
    @NameInMap("DetailFlag")
    private Boolean detailFlag;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private java.util.List < Long > launchTemplateVersion;

    @Query
    @NameInMap("MaxVersion")
    private Long maxVersion;

    @Query
    @NameInMap("MinVersion")
    private Long minVersion;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

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

    private DescribeLaunchTemplateVersionsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.defaultVersion = builder.defaultVersion;
        this.detailFlag = builder.detailFlag;
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateName = builder.launchTemplateName;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.maxVersion = builder.maxVersion;
        this.minVersion = builder.minVersion;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLaunchTemplateVersionsRequest create() {
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
     * @return defaultVersion
     */
    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * @return detailFlag
     */
    public Boolean getDetailFlag() {
        return this.detailFlag;
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return launchTemplateVersion
     */
    public java.util.List < Long > getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return maxVersion
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * @return minVersion
     */
    public Long getMinVersion() {
        return this.minVersion;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeLaunchTemplateVersionsRequest, Builder> {
        private String sourceRegionId; 
        private Boolean defaultVersion; 
        private Boolean detailFlag; 
        private String launchTemplateId; 
        private String launchTemplateName; 
        private java.util.List < Long > launchTemplateVersion; 
        private Long maxVersion; 
        private Long minVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLaunchTemplateVersionsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.defaultVersion = request.defaultVersion;
            this.detailFlag = request.detailFlag;
            this.launchTemplateId = request.launchTemplateId;
            this.launchTemplateName = request.launchTemplateName;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.maxVersion = request.maxVersion;
            this.minVersion = request.minVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
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
         * Specifies whether to query the default version.
         */
        public Builder defaultVersion(Boolean defaultVersion) {
            this.putQueryParameter("DefaultVersion", defaultVersion);
            this.defaultVersion = defaultVersion;
            return this;
        }

        /**
         * Specifies whether to query the configurations of the launch template. Valid values:
         * <p>
         * 
         * *   true: queries the basic information and other details of the launch template. The details include the image ID and system disk size.
         * *   false: queries only the basic information of the launch template. The basic information includes the template ID, template name, and default version.
         * 
         * Default value: true.
         */
        public Builder detailFlag(Boolean detailFlag) {
            this.putQueryParameter("DetailFlag", detailFlag);
            this.detailFlag = detailFlag;
            return this;
        }

        /**
         * The ID of the launch template.
         * <p>
         * 
         * You must specify LaunchTemplateId or LaunchTemplateName to determine a launch template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
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
         * LaunchTemplateVersion.
         */
        public Builder launchTemplateVersion(java.util.List < Long > launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The maximum version number in the version range to query.
         */
        public Builder maxVersion(Long maxVersion) {
            this.putQueryParameter("MaxVersion", maxVersion);
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * The minimum version number in the version range to query.
         */
        public Builder minVersion(Long minVersion) {
            this.putQueryParameter("MinVersion", minVersion);
            this.minVersion = minVersion;
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
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the launch template.
         * <p>
         * 
         * You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
        public DescribeLaunchTemplateVersionsRequest build() {
            return new DescribeLaunchTemplateVersionsRequest(this);
        } 

    } 

}
