// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopGroupRequest</p>
 */
public class CreateDesktopGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllClassifyUsers")
    private Boolean allClassifyUsers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowAutoSetup")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer allowAutoSetup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowBufferCount")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer allowBufferCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAmount")
    private Long bindAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyDesktopsCount")
    private Integer buyDesktopsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectDuration")
    private Long connectDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskCategory")
    private String dataDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskPerLevel")
    private String dataDiskPerLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    private Integer dataDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultInitDesktopCount")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer defaultInitDesktopCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultLanguage")
    private String defaultLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteDuration")
    private Long deleteDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopType")
    private String desktopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExclusiveType")
    private String exclusiveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupAmount")
    private Integer groupAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupVersion")
    private Integer groupVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleDisconnectDuration")
    private Long idleDisconnectDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeepDuration")
    private Long keepDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadPolicy")
    private Long loadPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxDesktopsCount")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer maxDesktopsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinDesktopsCount")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer minDesktopsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiResource")
    private Boolean multiResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnType")
    private Integer ownType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileFollowSwitch")
    private Boolean profileFollowSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RatioThreshold")
    private Float ratioThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    private Long resetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleStrategyId")
    private String scaleStrategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionType")
    private String sessionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SimpleUserGroupId")
    private String simpleUserGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotPolicyId")
    private String snapshotPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDuration")
    private Long stopDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
    private String systemDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskPerLevel")
    private String systemDiskPerLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
    private Integer systemDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimerGroupId")
    private String timerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupName")
    private String userGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserOuPath")
    private String userOuPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeEncryptionEnabled")
    private Boolean volumeEncryptionEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeEncryptionKey")
    private String volumeEncryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateDesktopGroupRequest(Builder builder) {
        super(builder);
        this.allClassifyUsers = builder.allClassifyUsers;
        this.allowAutoSetup = builder.allowAutoSetup;
        this.allowBufferCount = builder.allowBufferCount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bindAmount = builder.bindAmount;
        this.bundleId = builder.bundleId;
        this.buyDesktopsCount = builder.buyDesktopsCount;
        this.chargeType = builder.chargeType;
        this.classify = builder.classify;
        this.clientToken = builder.clientToken;
        this.comments = builder.comments;
        this.connectDuration = builder.connectDuration;
        this.dataDiskCategory = builder.dataDiskCategory;
        this.dataDiskPerLevel = builder.dataDiskPerLevel;
        this.dataDiskSize = builder.dataDiskSize;
        this.defaultInitDesktopCount = builder.defaultInitDesktopCount;
        this.defaultLanguage = builder.defaultLanguage;
        this.deleteDuration = builder.deleteDuration;
        this.desktopGroupName = builder.desktopGroupName;
        this.desktopType = builder.desktopType;
        this.directoryId = builder.directoryId;
        this.endUserIds = builder.endUserIds;
        this.exclusiveType = builder.exclusiveType;
        this.fileSystemId = builder.fileSystemId;
        this.groupAmount = builder.groupAmount;
        this.groupVersion = builder.groupVersion;
        this.hostname = builder.hostname;
        this.idleDisconnectDuration = builder.idleDisconnectDuration;
        this.imageId = builder.imageId;
        this.keepDuration = builder.keepDuration;
        this.loadPolicy = builder.loadPolicy;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.multiResource = builder.multiResource;
        this.officeSiteId = builder.officeSiteId;
        this.ownType = builder.ownType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.profileFollowSwitch = builder.profileFollowSwitch;
        this.promotionId = builder.promotionId;
        this.ratioThreshold = builder.ratioThreshold;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resetType = builder.resetType;
        this.scaleStrategyId = builder.scaleStrategyId;
        this.sessionType = builder.sessionType;
        this.simpleUserGroupId = builder.simpleUserGroupId;
        this.snapshotPolicyId = builder.snapshotPolicyId;
        this.stopDuration = builder.stopDuration;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.systemDiskPerLevel = builder.systemDiskPerLevel;
        this.systemDiskSize = builder.systemDiskSize;
        this.tag = builder.tag;
        this.timerGroupId = builder.timerGroupId;
        this.userGroupName = builder.userGroupName;
        this.userOuPath = builder.userOuPath;
        this.volumeEncryptionEnabled = builder.volumeEncryptionEnabled;
        this.volumeEncryptionKey = builder.volumeEncryptionKey;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allClassifyUsers
     */
    public Boolean getAllClassifyUsers() {
        return this.allClassifyUsers;
    }

    /**
     * @return allowAutoSetup
     */
    public Integer getAllowAutoSetup() {
        return this.allowAutoSetup;
    }

    /**
     * @return allowBufferCount
     */
    public Integer getAllowBufferCount() {
        return this.allowBufferCount;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bindAmount
     */
    public Long getBindAmount() {
        return this.bindAmount;
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return buyDesktopsCount
     */
    public Integer getBuyDesktopsCount() {
        return this.buyDesktopsCount;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return connectDuration
     */
    public Long getConnectDuration() {
        return this.connectDuration;
    }

    /**
     * @return dataDiskCategory
     */
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    /**
     * @return dataDiskPerLevel
     */
    public String getDataDiskPerLevel() {
        return this.dataDiskPerLevel;
    }

    /**
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return defaultInitDesktopCount
     */
    public Integer getDefaultInitDesktopCount() {
        return this.defaultInitDesktopCount;
    }

    /**
     * @return defaultLanguage
     */
    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    /**
     * @return deleteDuration
     */
    public Long getDeleteDuration() {
        return this.deleteDuration;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    /**
     * @return desktopType
     */
    public String getDesktopType() {
        return this.desktopType;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return exclusiveType
     */
    public String getExclusiveType() {
        return this.exclusiveType;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return groupAmount
     */
    public Integer getGroupAmount() {
        return this.groupAmount;
    }

    /**
     * @return groupVersion
     */
    public Integer getGroupVersion() {
        return this.groupVersion;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return idleDisconnectDuration
     */
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keepDuration
     */
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    /**
     * @return loadPolicy
     */
    public Long getLoadPolicy() {
        return this.loadPolicy;
    }

    /**
     * @return maxDesktopsCount
     */
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    /**
     * @return minDesktopsCount
     */
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    /**
     * @return multiResource
     */
    public Boolean getMultiResource() {
        return this.multiResource;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return ownType
     */
    public Integer getOwnType() {
        return this.ownType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return profileFollowSwitch
     */
    public Boolean getProfileFollowSwitch() {
        return this.profileFollowSwitch;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return ratioThreshold
     */
    public Float getRatioThreshold() {
        return this.ratioThreshold;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return resetType
     */
    public Long getResetType() {
        return this.resetType;
    }

    /**
     * @return scaleStrategyId
     */
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    /**
     * @return sessionType
     */
    public String getSessionType() {
        return this.sessionType;
    }

    /**
     * @return simpleUserGroupId
     */
    public String getSimpleUserGroupId() {
        return this.simpleUserGroupId;
    }

    /**
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * @return stopDuration
     */
    public Long getStopDuration() {
        return this.stopDuration;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return systemDiskPerLevel
     */
    public String getSystemDiskPerLevel() {
        return this.systemDiskPerLevel;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return timerGroupId
     */
    public String getTimerGroupId() {
        return this.timerGroupId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    /**
     * @return userOuPath
     */
    public String getUserOuPath() {
        return this.userOuPath;
    }

    /**
     * @return volumeEncryptionEnabled
     */
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    /**
     * @return volumeEncryptionKey
     */
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateDesktopGroupRequest, Builder> {
        private Boolean allClassifyUsers; 
        private Integer allowAutoSetup; 
        private Integer allowBufferCount; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private Long bindAmount; 
        private String bundleId; 
        private Integer buyDesktopsCount; 
        private String chargeType; 
        private String classify; 
        private String clientToken; 
        private String comments; 
        private Long connectDuration; 
        private String dataDiskCategory; 
        private String dataDiskPerLevel; 
        private Integer dataDiskSize; 
        private Integer defaultInitDesktopCount; 
        private String defaultLanguage; 
        private Long deleteDuration; 
        private String desktopGroupName; 
        private String desktopType; 
        private String directoryId; 
        private java.util.List<String> endUserIds; 
        private String exclusiveType; 
        private String fileSystemId; 
        private Integer groupAmount; 
        private Integer groupVersion; 
        private String hostname; 
        private Long idleDisconnectDuration; 
        private String imageId; 
        private Long keepDuration; 
        private Long loadPolicy; 
        private Integer maxDesktopsCount; 
        private Integer minDesktopsCount; 
        private Boolean multiResource; 
        private String officeSiteId; 
        private Integer ownType; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private Boolean profileFollowSwitch; 
        private String promotionId; 
        private Float ratioThreshold; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private Long resetType; 
        private String scaleStrategyId; 
        private String sessionType; 
        private String simpleUserGroupId; 
        private String snapshotPolicyId; 
        private Long stopDuration; 
        private String systemDiskCategory; 
        private String systemDiskPerLevel; 
        private Integer systemDiskSize; 
        private java.util.List<Tag> tag; 
        private String timerGroupId; 
        private String userGroupName; 
        private String userOuPath; 
        private Boolean volumeEncryptionEnabled; 
        private String volumeEncryptionKey; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopGroupRequest request) {
            super(request);
            this.allClassifyUsers = request.allClassifyUsers;
            this.allowAutoSetup = request.allowAutoSetup;
            this.allowBufferCount = request.allowBufferCount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bindAmount = request.bindAmount;
            this.bundleId = request.bundleId;
            this.buyDesktopsCount = request.buyDesktopsCount;
            this.chargeType = request.chargeType;
            this.classify = request.classify;
            this.clientToken = request.clientToken;
            this.comments = request.comments;
            this.connectDuration = request.connectDuration;
            this.dataDiskCategory = request.dataDiskCategory;
            this.dataDiskPerLevel = request.dataDiskPerLevel;
            this.dataDiskSize = request.dataDiskSize;
            this.defaultInitDesktopCount = request.defaultInitDesktopCount;
            this.defaultLanguage = request.defaultLanguage;
            this.deleteDuration = request.deleteDuration;
            this.desktopGroupName = request.desktopGroupName;
            this.desktopType = request.desktopType;
            this.directoryId = request.directoryId;
            this.endUserIds = request.endUserIds;
            this.exclusiveType = request.exclusiveType;
            this.fileSystemId = request.fileSystemId;
            this.groupAmount = request.groupAmount;
            this.groupVersion = request.groupVersion;
            this.hostname = request.hostname;
            this.idleDisconnectDuration = request.idleDisconnectDuration;
            this.imageId = request.imageId;
            this.keepDuration = request.keepDuration;
            this.loadPolicy = request.loadPolicy;
            this.maxDesktopsCount = request.maxDesktopsCount;
            this.minDesktopsCount = request.minDesktopsCount;
            this.multiResource = request.multiResource;
            this.officeSiteId = request.officeSiteId;
            this.ownType = request.ownType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.profileFollowSwitch = request.profileFollowSwitch;
            this.promotionId = request.promotionId;
            this.ratioThreshold = request.ratioThreshold;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resetType = request.resetType;
            this.scaleStrategyId = request.scaleStrategyId;
            this.sessionType = request.sessionType;
            this.simpleUserGroupId = request.simpleUserGroupId;
            this.snapshotPolicyId = request.snapshotPolicyId;
            this.stopDuration = request.stopDuration;
            this.systemDiskCategory = request.systemDiskCategory;
            this.systemDiskPerLevel = request.systemDiskPerLevel;
            this.systemDiskSize = request.systemDiskSize;
            this.tag = request.tag;
            this.timerGroupId = request.timerGroupId;
            this.userGroupName = request.userGroupName;
            this.userOuPath = request.userOuPath;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
            this.volumeEncryptionKey = request.volumeEncryptionKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The users of all shared cloud computer categories.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allClassifyUsers(Boolean allClassifyUsers) {
            this.putQueryParameter("AllClassifyUsers", allClassifyUsers);
            this.allClassifyUsers = allClassifyUsers;
            return this;
        }

        /**
         * <p>Specifies whether to allow automatic creation of cloud computers within subscription shared cloud computers. This parameter takes effect and is required only when ChargeType is set to PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * <p>The number of reserved cloud computers allowed in pay-as-you-go shared cloud computers. This parameter takes effect and is required only when ChargeType is set to PostPaid. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * <p>Specifies whether automatic payment is enabled for the subscription order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the subscription shared cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The number of concurrent sessions allowed per cloud computer in multi-session shared cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder bindAmount(Long bindAmount) {
            this.putQueryParameter("BindAmount", bindAmount);
            this.bindAmount = bindAmount;
            return this;
        }

        /**
         * <p>The cloud computer template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b-je9hani001wfn****</p>
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * <ul>
         * <li>For subscription shared cloud computers: the initial number of cloud computers to create. Valid values: 0 to 200.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder buyDesktopsCount(Integer buyDesktopsCount) {
            this.putQueryParameter("BuyDesktopsCount", buyDesktopsCount);
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }

        /**
         * <p>The billing method of the cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The type of the shared cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>teacher</p>
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * <p>The maximum duration that a session can remain in the connected state. The session is automatically disconnected when this duration is reached. Unit: milliseconds. Valid values: 900000 (15 minutes) to 345600000 (4 days).</p>
         * 
         * <strong>example:</strong>
         * <p>900000</p>
         */
        public Builder connectDuration(Long connectDuration) {
            this.putQueryParameter("ConnectDuration", connectDuration);
            this.connectDuration = connectDuration;
            return this;
        }

        /**
         * <p>The data cloud disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder dataDiskCategory(String dataDiskCategory) {
            this.putQueryParameter("DataDiskCategory", dataDiskCategory);
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }

        /**
         * <p>The performance level of the ESSD. Default value: PL0.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder dataDiskPerLevel(String dataDiskPerLevel) {
            this.putQueryParameter("DataDiskPerLevel", dataDiskPerLevel);
            this.dataDiskPerLevel = dataDiskPerLevel;
            return this;
        }

        /**
         * <p>The size of the attached data cloud disk. Unit: GB. Valid values: 0 to 16380. The value must be a multiple of 20.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder dataDiskSize(Integer dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * <p>The default number of cloud computers to create when you create multiple shared cloud computers. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultInitDesktopCount(Integer defaultInitDesktopCount) {
            this.putQueryParameter("DefaultInitDesktopCount", defaultInitDesktopCount);
            this.defaultInitDesktopCount = defaultInitDesktopCount;
            return this;
        }

        /**
         * <p>The system language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder defaultLanguage(String defaultLanguage) {
            this.putQueryParameter("DefaultLanguage", defaultLanguage);
            this.defaultLanguage = defaultLanguage;
            return this;
        }

        /**
         * <p>The retention period before cloud computers in the cloud computer pool are automatically deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder deleteDuration(Long deleteDuration) {
            this.putQueryParameter("DeleteDuration", deleteDuration);
            this.deleteDuration = deleteDuration;
            return this;
        }

        /**
         * <p>The name of the shared cloud computer. The name can be up to 30 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>SharedComputers01</p>
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * <p>The cloud computer specification. You can call <a href="~~DescribeDesktopTypes~~">DescribeDesktopTypes</a> to query the specification IDs supported by cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.16c64g</p>
         */
        public Builder desktopType(String desktopType) {
            this.putQueryParameter("DesktopType", desktopType);
            this.desktopType = desktopType;
            return this;
        }

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dri-uf62w3qzt4aigvlcb****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The list of user IDs for the shared cloud computer.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>Creates a static pool. This parameter is required when the <code>SessionType</code> parameter is set to <code>MultipleSession</code>. Set the value to <code>Exclusive</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        public Builder exclusiveType(String exclusiveType) {
            this.putQueryParameter("ExclusiveType", exclusiveType);
            this.exclusiveType = exclusiveType;
            return this;
        }

        /**
         * <p>The ID of the NAS file system used for user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>kegd-nas-****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The number of single shared cloud computers to create. This parameter is required only when the <code>MultiResource</code> parameter is set to <code>false</code>. Valid values: 1 to 5. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder groupAmount(Integer groupAmount) {
            this.putQueryParameter("GroupAmount", groupAmount);
            this.groupAmount = groupAmount;
            return this;
        }

        /**
         * <p>The version of the shared cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder groupVersion(Integer groupVersion) {
            this.putQueryParameter("GroupVersion", groupVersion);
            this.groupVersion = groupVersion;
            return this;
        }

        /**
         * <p>The custom hostname of the cloud computer. Only Settings for cloud computers that run the Windows operating system in AD office networks are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testhost</p>
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The maximum idle duration after a user session is established. If no keyboard or mouse activity occurs within this duration, the session is disconnected. Unit: milliseconds. Valid values: 360000 (6 minutes) to 3600000 (60 minutes).</p>
         * <p>30 seconds before this duration is reached, the end user in the session receives a prompt to save document data. The end user must save document data promptly to avoid data loss.</p>
         * <blockquote>
         * <p>Applicable only to cloud computers with an image version of 1.0.2 or later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>360000</p>
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-gx2x1dhsmusr2****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        public Builder keepDuration(Long keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * <p>The load balancing policy for multi-session shared cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder loadPolicy(Long loadPolicy) {
            this.putQueryParameter("LoadPolicy", loadPolicy);
            this.loadPolicy = loadPolicy;
            return this;
        }

        /**
         * <p>The maximum number of pay-as-you-go shared cloud computers. Valid values: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * <p>The maximum number of cloud computers that can be used for automatic creation for subscription shared cloud computers. This parameter takes effect and is required only when ChargeType is set to PrePaid. Default value: 1. Valid values: 0 to the value of MaxDesktopsCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * <p>Specifies whether the cloud computers are multi-resource shared cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder multiResource(Boolean multiResource) {
            this.putQueryParameter("MultiResource", multiResource);
            this.multiResource = multiResource;
            return this;
        }

        /**
         * <p>The ID of the office network to which the shared cloud computer belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The type of the shared cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ownType(Integer ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * <p>The subscription duration of the shared cloud computer. This parameter takes effect and is required only when ChargeType is set to PrePaid. The unit is specified by PeriodUnit.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription billable methods duration.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The ID of the policy associated with the shared cloud computer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9c2d6t2dwflqr****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
            this.putQueryParameter("ProfileFollowSwitch", profileFollowSwitch);
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>youhuiquan_promotion_option_id_*****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The session occupancy threshold used as the automatic scaling trigger condition for multi-session shared cloud computers. The session occupancy is calculated by using the following formula:</p>
         * <p><code>Session occupancy = Number of bound sessions / (Total number of cloud computer resources × Maximum number of sessions supported per cloud computer) × 100%</code></p>
         * <p>When the session occupancy reaches this threshold, new cloud computers are created. When the session occupancy is below this threshold, excess cloud computers are deleted.</p>
         * <blockquote>
         * <p>This parameter is not yet available for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The user ID of the resource ownership in reseller pattern. You do not need to specify this parameter in non-reseller pattern.</p>
         * 
         * <strong>example:</strong>
         * <p>1422724566551XXX</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The reset type of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder resetType(Long resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * <p>The scaling policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ss-f9dkjz6vw3aaw****</p>
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * <p>The session type.</p>
         * 
         * <strong>example:</strong>
         * <p>SingleSession</p>
         */
        public Builder sessionType(String sessionType) {
            this.putQueryParameter("SessionType", sessionType);
            this.sessionType = sessionType;
            return this;
        }

        /**
         * <p>The ID of the convenience user group.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-3f6c8a2b****</p>
         */
        public Builder simpleUserGroupId(String simpleUserGroupId) {
            this.putQueryParameter("SimpleUserGroupId", simpleUserGroupId);
            this.simpleUserGroupId = simpleUserGroupId;
            return this;
        }

        /**
         * <p>The ID of the automatic snapshot policy.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-28mp6my0l6zow****</p>
         */
        public Builder snapshotPolicyId(String snapshotPolicyId) {
            this.putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
            this.snapshotPolicyId = snapshotPolicyId;
            return this;
        }

        /**
         * <p>The idle shutdown duration. When the cloud computer has been idle for this duration, it is automatically shut down. If a user connects after shutdown, the cloud computer automatically starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
         */
        public Builder stopDuration(Long stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        /**
         * <p>The system cloud disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * <p>The performance level of the ESSD. Default value: PL0.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder systemDiskPerLevel(String systemDiskPerLevel) {
            this.putQueryParameter("SystemDiskPerLevel", systemDiskPerLevel);
            this.systemDiskPerLevel = systemDiskPerLevel;
            return this;
        }

        /**
         * <p>The system cloud disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * <p>The list of tags. A maximum of 20 tags can be specified.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0caoeogrk9m5****</p>
         */
        public Builder timerGroupId(String timerGroupId) {
            this.putQueryParameter("TimerGroupId", timerGroupId);
            this.timerGroupId = timerGroupId;
            return this;
        }

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Group</p>
         */
        public Builder userGroupName(String userGroupName) {
            this.putQueryParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        /**
         * <p>The organizational unit (OU) path of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder userOuPath(String userOuPath) {
            this.putQueryParameter("UserOuPath", userOuPath);
            this.userOuPath = userOuPath;
            return this;
        }

        /**
         * <p>Specifies whether to enable disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * <p>The ID of the KMS key used for disk encryption. You can call <a href="https://help.aliyun.com/document_detail/28951.html">ListKeys</a> to obtain the key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * <p>The VPC ID of the office network to which the shared cloud computer belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6w8u60n8xbkg5el****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateDesktopGroupRequest build() {
            return new CreateDesktopGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDesktopGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDesktopGroupRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. If you specify this parameter, the value cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be an empty string. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
