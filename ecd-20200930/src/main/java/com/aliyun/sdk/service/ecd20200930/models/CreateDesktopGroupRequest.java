// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopGroupRequest</p>
 */
public class CreateDesktopGroupRequest extends Request {
    @Query
    @NameInMap("AllClassifyUsers")
    private Boolean allClassifyUsers;

    @Query
    @NameInMap("AllowAutoSetup")
    @Validation(maximum = 1)
    private Integer allowAutoSetup;

    @Query
    @NameInMap("AllowBufferCount")
    @Validation(maximum = 1000)
    private Integer allowBufferCount;

    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("BindAmount")
    private Long bindAmount;

    @Query
    @NameInMap("BundleId")
    @Validation(required = true)
    private String bundleId;

    @Query
    @NameInMap("BuyDesktopsCount")
    private Integer buyDesktopsCount;

    @Query
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Query
    @NameInMap("Classify")
    private String classify;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Comments")
    private String comments;

    @Query
    @NameInMap("ConnectDuration")
    private Long connectDuration;

    @Query
    @NameInMap("DefaultInitDesktopCount")
    @Validation(maximum = 1000)
    private Integer defaultInitDesktopCount;

    @Query
    @NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("EndUserIds")
    private java.util.List < String > endUserIds;

    @Query
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @Query
    @NameInMap("GroupVersion")
    private Integer groupVersion;

    @Query
    @NameInMap("IdleDisconnectDuration")
    private Long idleDisconnectDuration;

    @Query
    @NameInMap("KeepDuration")
    private Long keepDuration;

    @Query
    @NameInMap("LoadPolicy")
    private Long loadPolicy;

    @Query
    @NameInMap("MaxDesktopsCount")
    @Validation(maximum = 1000)
    private Integer maxDesktopsCount;

    @Query
    @NameInMap("MinDesktopsCount")
    @Validation(maximum = 500)
    private Integer minDesktopsCount;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("OwnType")
    private Integer ownType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    private String policyGroupId;

    @Query
    @NameInMap("ProfileFollowSwitch")
    private Boolean profileFollowSwitch;

    @Query
    @NameInMap("RatioThreshold")
    private Float ratioThreshold;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResetType")
    private Long resetType;

    @Query
    @NameInMap("ScaleStrategyId")
    private String scaleStrategyId;

    @Query
    @NameInMap("StopDuration")
    private Long stopDuration;

    @Query
    @NameInMap("VolumeEncryptionEnabled")
    private Boolean volumeEncryptionEnabled;

    @Query
    @NameInMap("VolumeEncryptionKey")
    private String volumeEncryptionKey;

    @Query
    @NameInMap("VpcId")
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
        this.defaultInitDesktopCount = builder.defaultInitDesktopCount;
        this.desktopGroupName = builder.desktopGroupName;
        this.directoryId = builder.directoryId;
        this.endUserIds = builder.endUserIds;
        this.fileSystemId = builder.fileSystemId;
        this.groupVersion = builder.groupVersion;
        this.idleDisconnectDuration = builder.idleDisconnectDuration;
        this.keepDuration = builder.keepDuration;
        this.loadPolicy = builder.loadPolicy;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.officeSiteId = builder.officeSiteId;
        this.ownType = builder.ownType;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.policyGroupId = builder.policyGroupId;
        this.profileFollowSwitch = builder.profileFollowSwitch;
        this.ratioThreshold = builder.ratioThreshold;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.scaleStrategyId = builder.scaleStrategyId;
        this.stopDuration = builder.stopDuration;
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
     * @return defaultInitDesktopCount
     */
    public Integer getDefaultInitDesktopCount() {
        return this.defaultInitDesktopCount;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
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
    public java.util.List < String > getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return groupVersion
     */
    public Integer getGroupVersion() {
        return this.groupVersion;
    }

    /**
     * @return idleDisconnectDuration
     */
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
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
     * @return stopDuration
     */
    public Long getStopDuration() {
        return this.stopDuration;
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
        private Integer defaultInitDesktopCount; 
        private String desktopGroupName; 
        private String directoryId; 
        private java.util.List < String > endUserIds; 
        private String fileSystemId; 
        private Integer groupVersion; 
        private Long idleDisconnectDuration; 
        private Long keepDuration; 
        private Long loadPolicy; 
        private Integer maxDesktopsCount; 
        private Integer minDesktopsCount; 
        private String officeSiteId; 
        private Integer ownType; 
        private Integer period; 
        private String periodUnit; 
        private String policyGroupId; 
        private Boolean profileFollowSwitch; 
        private Float ratioThreshold; 
        private String regionId; 
        private Long resetType; 
        private String scaleStrategyId; 
        private Long stopDuration; 
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
            this.defaultInitDesktopCount = request.defaultInitDesktopCount;
            this.desktopGroupName = request.desktopGroupName;
            this.directoryId = request.directoryId;
            this.endUserIds = request.endUserIds;
            this.fileSystemId = request.fileSystemId;
            this.groupVersion = request.groupVersion;
            this.idleDisconnectDuration = request.idleDisconnectDuration;
            this.keepDuration = request.keepDuration;
            this.loadPolicy = request.loadPolicy;
            this.maxDesktopsCount = request.maxDesktopsCount;
            this.minDesktopsCount = request.minDesktopsCount;
            this.officeSiteId = request.officeSiteId;
            this.ownType = request.ownType;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.policyGroupId = request.policyGroupId;
            this.profileFollowSwitch = request.profileFollowSwitch;
            this.ratioThreshold = request.ratioThreshold;
            this.regionId = request.regionId;
            this.resetType = request.resetType;
            this.scaleStrategyId = request.scaleStrategyId;
            this.stopDuration = request.stopDuration;
            this.volumeEncryptionEnabled = request.volumeEncryptionEnabled;
            this.volumeEncryptionKey = request.volumeEncryptionKey;
            this.vpcId = request.vpcId;
        } 

        /**
         * The end users whom you want to add to all types of desktop groups.
         */
        public Builder allClassifyUsers(Boolean allClassifyUsers) {
            this.putQueryParameter("AllClassifyUsers", allClassifyUsers);
            this.allClassifyUsers = allClassifyUsers;
            return this;
        }

        /**
         * Specifies whether to automatically create cloud desktops in the desktop group if you set the billing method to subscription. If you set the ChargeType parameter to PrePaid, this parameter is required.
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * Specifies whether to reserve cloud desktops if you set the billing method to pay-as-you-go. If you set the ChargeType parameter to PostPaid, this parameter is required. Valid values: 0: does not allow the system to reserve cloud desktops. N: allows the system to reserve N cloud desktops. The variable N must be an integer that ranges from 1 to 100.
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * 是否自动续费。
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The number of sessions that are allowed per cloud desktop in a multi-session desktop group.
         */
        public Builder bindAmount(Long bindAmount) {
            this.putQueryParameter("BindAmount", bindAmount);
            this.bindAmount = bindAmount;
            return this;
        }

        /**
         * The ID of the desktop template.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * The number of cloud desktops that you want to purchase. Valid values: 0 to 200.
         */
        public Builder buyDesktopsCount(Integer buyDesktopsCount) {
            this.putQueryParameter("BuyDesktopsCount", buyDesktopsCount);
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }

        /**
         * The billing method of the cloud desktops in the desktop group.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The type of the desktop group.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The remarks on the desktop group.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session automatically disconnects. Unit: milliseconds. This parameter is required only for cloud desktops in the same desktop group.
         */
        public Builder connectDuration(Long connectDuration) {
            this.putQueryParameter("ConnectDuration", connectDuration);
            this.connectDuration = connectDuration;
            return this;
        }

        /**
         * The default number of cloud desktops to create when you create the desktop group. Default value: 1.
         */
        public Builder defaultInitDesktopCount(Integer defaultInitDesktopCount) {
            this.putQueryParameter("DefaultInitDesktopCount", defaultInitDesktopCount);
            this.defaultInitDesktopCount = defaultInitDesktopCount;
            return this;
        }

        /**
         * The name of the desktop group.
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * The end users that can use the desktop group.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * The Apsara File Storage NAS (NAS) file system that is used after data roaming is enabled.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * 桌面组版本。
         */
        public Builder groupVersion(Integer groupVersion) {
            this.putQueryParameter("GroupVersion", groupVersion);
            this.groupVersion = groupVersion;
            return this;
        }

        /**
         * The maximum period of time for which a session remains idle. If an end user performs no operations on a cloud desktop by using keyboards or mouses during a session, the session becomes idle. When the specified maximum period of time is reached, the session automatically disconnects. Unit: milliseconds. This parameter is required only for cloud desktops in the same desktop group.
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }

        /**
         * The retention period of the cloud desktop after the end user disconnects from the cloud desktop. Unit: milliseconds.
         */
        public Builder keepDuration(Long keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * The load balancing policy of the multi-session desktop group.
         */
        public Builder loadPolicy(Long loadPolicy) {
            this.putQueryParameter("LoadPolicy", loadPolicy);
            this.loadPolicy = loadPolicy;
            return this;
        }

        /**
         * The maximum number of cloud desktops that the desktop group can contain. Valid values: 0 to 200.
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * The minimum number of cloud desktops that must be contained in the desktop group if you set the billing method to subscription. If you set the ChargeType parameter to PrePaid, this parameter is required. Valid values: 0 to the value of MaxDesktopsCount. Default value: 1.
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The type of the desktop group.
         */
        public Builder ownType(Integer ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * The subscription period of the cloud desktops in the desktop group. The unit is specified by the PeriodUnit parameter. The Period parameter takes effect only if you set the ChargeType parameter to PrePaid.
         * <p>
         * 
         * *   Valid values if you set the PeriodUnit parameter to Month:
         * 
         *     *   1
         *     *   2
         *     *   3
         *     *   6
         * 
         * *   Valid values if you set the PeriodUnit parameter to Year:
         * 
         *     *   1
         *     *   2
         *     *   3
         *     *   4
         *     *   5
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * Specifies whether to enable data roaming.
         */
        public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
            this.putQueryParameter("ProfileFollowSwitch", profileFollowSwitch);
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }

        /**
         * The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops × Maximum number of sessions allowed for each cloud desktop) × 100%`. When the specified threshold is reached, new cloud desktops are automatically created. When the specified threshold is not reached, idle cloud desktops are released.
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies which type of the disk to reset for cloud desktops in the desktop group.
         */
        public Builder resetType(Long resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * The ID of the scaling policy.
         * <p>
         * 
         * > This parameter is unavailable.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * The period of time before the idle cloud desktop is stopped. When the specified period of time is reached, the idle cloud desktop automatically stops. If an end user connects to a stopped cloud desktop, the cloud desktop automatically starts. Unit: milliseconds.
         */
        public Builder stopDuration(Long stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        /**
         * Specifies whether to enable disk encryption.
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * The ID of the Key Management Service (KMS) key that you want to use when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which you want to create the desktop group.
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

}
