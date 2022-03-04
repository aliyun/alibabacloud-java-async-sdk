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
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("DetailFlag")
    private Boolean detailFlag;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("LaunchTemplateVersion")
    private java.util.List < Long > launchTemplateVersion;

    @Query
    @NameInMap("LaunchTemplateName")
    private String launchTemplateName;

    @Query
    @NameInMap("MinVersion")
    private Long minVersion;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @Query
    @NameInMap("MaxVersion")
    private Long maxVersion;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("DefaultVersion")
    private Boolean defaultVersion;

    private DescribeLaunchTemplateVersionsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.detailFlag = builder.detailFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.launchTemplateVersion = builder.launchTemplateVersion;
        this.launchTemplateName = builder.launchTemplateName;
        this.minVersion = builder.minVersion;
        this.pageSize = builder.pageSize;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.launchTemplateId = builder.launchTemplateId;
        this.maxVersion = builder.maxVersion;
        this.pageNumber = builder.pageNumber;
        this.defaultVersion = builder.defaultVersion;
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return detailFlag
     */
    public Boolean getDetailFlag() {
        return this.detailFlag;
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
     * @return launchTemplateVersion
     */
    public java.util.List < Long > getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * @return launchTemplateName
     */
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * @return minVersion
     */
    public Long getMinVersion() {
        return this.minVersion;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return maxVersion
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return defaultVersion
     */
    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    public static final class Builder extends Request.Builder<DescribeLaunchTemplateVersionsRequest, Builder> {
        private String sourceRegionId; 
        private String ownerAccount; 
        private Boolean detailFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Long > launchTemplateVersion; 
        private String launchTemplateName; 
        private Long minVersion; 
        private Integer pageSize; 
        private Long ownerId; 
        private String regionId; 
        private String launchTemplateId; 
        private Long maxVersion; 
        private Integer pageNumber; 
        private Boolean defaultVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLaunchTemplateVersionsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.ownerAccount = request.ownerAccount;
            this.detailFlag = request.detailFlag;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.launchTemplateVersion = request.launchTemplateVersion;
            this.launchTemplateName = request.launchTemplateName;
            this.minVersion = request.minVersion;
            this.pageSize = request.pageSize;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.launchTemplateId = request.launchTemplateId;
            this.maxVersion = request.maxVersion;
            this.pageNumber = request.pageNumber;
            this.defaultVersion = request.defaultVersion;
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
         * DetailFlag.
         */
        public Builder detailFlag(Boolean detailFlag) {
            this.putQueryParameter("DetailFlag", detailFlag);
            this.detailFlag = detailFlag;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * One or more instance launch template versions.
         */
        public Builder launchTemplateVersion(java.util.List < Long > launchTemplateVersion) {
            this.putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * The name of the instance launch template.
         */
        public Builder launchTemplateName(String launchTemplateName) {
            this.putQueryParameter("LaunchTemplateName", launchTemplateName);
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * Specify the minimum version number of the version by range.
         */
        public Builder minVersion(Long minVersion) {
            this.putQueryParameter("MinVersion", minVersion);
            this.minVersion = minVersion;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * The ID of the region to which the instance launch template belongs.
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the instance launch template.
         * <p>
         * 
         * You must specify LaunchTemplateId or LaunchTemplateName to determine the template.
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.putQueryParameter("LaunchTemplateId", launchTemplateId);
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * Specifies the maximum version number of a version by range.
         */
        public Builder maxVersion(Long maxVersion) {
            this.putQueryParameter("MaxVersion", maxVersion);
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * The page number of the instance launch template list. Start value: 1
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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

        @Override
        public DescribeLaunchTemplateVersionsRequest build() {
            return new DescribeLaunchTemplateVersionsRequest(this);
        } 

    } 

}
