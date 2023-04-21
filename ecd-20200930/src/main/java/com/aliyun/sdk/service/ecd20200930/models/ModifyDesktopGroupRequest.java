// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopGroupRequest</p>
 */
public class ModifyDesktopGroupRequest extends Request {
    @Query
    @NameInMap("AllowAutoSetup")
    @Validation(maximum = 1)
    private Integer allowAutoSetup;

    @Query
    @NameInMap("AllowBufferCount")
    @Validation(maximum = 1000)
    private Integer allowBufferCount;

    @Query
    @NameInMap("BindAmount")
    private Long bindAmount;

    @Query
    @NameInMap("BuyDesktopsCount")
    private Integer buyDesktopsCount;

    @Query
    @NameInMap("Classify")
    private String classify;

    @Query
    @NameInMap("Comments")
    private String comments;

    @Query
    @NameInMap("ConnectDuration")
    private Long connectDuration;

    @Query
    @NameInMap("DesktopGroupId")
    @Validation(required = true)
    private String desktopGroupId;

    @Query
    @NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @Query
    @NameInMap("DisableSessionConfig")
    private Boolean disableSessionConfig;

    @Query
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @Query
    @NameInMap("IdleDisconnectDuration")
    private Long idleDisconnectDuration;

    @Query
    @NameInMap("ImageId")
    private String imageId;

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
    @NameInMap("OwnBundleId")
    private String ownBundleId;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    @Query
    @NameInMap("PolicyGroupIds")
    private java.util.List < String > policyGroupIds;

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

    private ModifyDesktopGroupRequest(Builder builder) {
        super(builder);
        this.allowAutoSetup = builder.allowAutoSetup;
        this.allowBufferCount = builder.allowBufferCount;
        this.bindAmount = builder.bindAmount;
        this.buyDesktopsCount = builder.buyDesktopsCount;
        this.classify = builder.classify;
        this.comments = builder.comments;
        this.connectDuration = builder.connectDuration;
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupName = builder.desktopGroupName;
        this.disableSessionConfig = builder.disableSessionConfig;
        this.fileSystemId = builder.fileSystemId;
        this.idleDisconnectDuration = builder.idleDisconnectDuration;
        this.imageId = builder.imageId;
        this.keepDuration = builder.keepDuration;
        this.loadPolicy = builder.loadPolicy;
        this.maxDesktopsCount = builder.maxDesktopsCount;
        this.minDesktopsCount = builder.minDesktopsCount;
        this.ownBundleId = builder.ownBundleId;
        this.policyGroupId = builder.policyGroupId;
        this.policyGroupIds = builder.policyGroupIds;
        this.profileFollowSwitch = builder.profileFollowSwitch;
        this.ratioThreshold = builder.ratioThreshold;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.scaleStrategyId = builder.scaleStrategyId;
        this.stopDuration = builder.stopDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return bindAmount
     */
    public Long getBindAmount() {
        return this.bindAmount;
    }

    /**
     * @return buyDesktopsCount
     */
    public Integer getBuyDesktopsCount() {
        return this.buyDesktopsCount;
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
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
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return desktopGroupName
     */
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    /**
     * @return disableSessionConfig
     */
    public Boolean getDisableSessionConfig() {
        return this.disableSessionConfig;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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
     * @return ownBundleId
     */
    public String getOwnBundleId() {
        return this.ownBundleId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return policyGroupIds
     */
    public java.util.List < String > getPolicyGroupIds() {
        return this.policyGroupIds;
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

    public static final class Builder extends Request.Builder<ModifyDesktopGroupRequest, Builder> {
        private Integer allowAutoSetup; 
        private Integer allowBufferCount; 
        private Long bindAmount; 
        private Integer buyDesktopsCount; 
        private String classify; 
        private String comments; 
        private Long connectDuration; 
        private String desktopGroupId; 
        private String desktopGroupName; 
        private Boolean disableSessionConfig; 
        private String fileSystemId; 
        private Long idleDisconnectDuration; 
        private String imageId; 
        private Long keepDuration; 
        private Long loadPolicy; 
        private Integer maxDesktopsCount; 
        private Integer minDesktopsCount; 
        private String ownBundleId; 
        private String policyGroupId; 
        private java.util.List < String > policyGroupIds; 
        private Boolean profileFollowSwitch; 
        private Float ratioThreshold; 
        private String regionId; 
        private Long resetType; 
        private String scaleStrategyId; 
        private Long stopDuration; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopGroupRequest request) {
            super(request);
            this.allowAutoSetup = request.allowAutoSetup;
            this.allowBufferCount = request.allowBufferCount;
            this.bindAmount = request.bindAmount;
            this.buyDesktopsCount = request.buyDesktopsCount;
            this.classify = request.classify;
            this.comments = request.comments;
            this.connectDuration = request.connectDuration;
            this.desktopGroupId = request.desktopGroupId;
            this.desktopGroupName = request.desktopGroupName;
            this.disableSessionConfig = request.disableSessionConfig;
            this.fileSystemId = request.fileSystemId;
            this.idleDisconnectDuration = request.idleDisconnectDuration;
            this.imageId = request.imageId;
            this.keepDuration = request.keepDuration;
            this.loadPolicy = request.loadPolicy;
            this.maxDesktopsCount = request.maxDesktopsCount;
            this.minDesktopsCount = request.minDesktopsCount;
            this.ownBundleId = request.ownBundleId;
            this.policyGroupId = request.policyGroupId;
            this.policyGroupIds = request.policyGroupIds;
            this.profileFollowSwitch = request.profileFollowSwitch;
            this.ratioThreshold = request.ratioThreshold;
            this.regionId = request.regionId;
            this.resetType = request.resetType;
            this.scaleStrategyId = request.scaleStrategyId;
            this.stopDuration = request.stopDuration;
        } 

        /**
         * Specifies whether to automatically create cloud desktops in the desktop group if you set the billing method to subscription. If you set the ChargeType parameter to PrePaid, this parameter is required. Valid values:
         * <p>
         * 
         * *   0: does not create cloud desktops in the desktop group.
         * *   1: creates cloud desktops in the desktop group.
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * Specifies whether to reserve cloud desktops if you set the billing method to pay-as-you-go. If you set the ChargeType parameter to PostPaid, this parameter is required. Valid values: 0: does not reserve cloud desktops. N: reserves N cloud desktops. Valid values of N: 1 to the value of the MaxDesktopsCount parameter.
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * The maximum number of sessions per cloud desktop in the multi-session desktop group.
         */
        public Builder bindAmount(Long bindAmount) {
            this.putQueryParameter("BindAmount", bindAmount);
            this.bindAmount = bindAmount;
            return this;
        }

        /**
         * The number of cloud desktops to purchase. Valid values: 0 to 200.
         */
        public Builder buyDesktopsCount(Integer buyDesktopsCount) {
            this.putQueryParameter("BuyDesktopsCount", buyDesktopsCount);
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }

        /**
         * The classification of the cloud desktop pool.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
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
         * The maximum duration of the session. Unit: milliseconds.
         */
        public Builder connectDuration(Long connectDuration) {
            this.putQueryParameter("ConnectDuration", connectDuration);
            this.connectDuration = connectDuration;
            return this;
        }

        /**
         * The ID of the desktop group.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
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
         * Specifies whether to disable session management.
         */
        public Builder disableSessionConfig(Boolean disableSessionConfig) {
            this.putQueryParameter("DisableSessionConfig", disableSessionConfig);
            this.disableSessionConfig = disableSessionConfig;
            return this;
        }

        /**
         * The ID of the Apsara File Storage NAS (NAS) file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The maximum duration of the idle session. Unit: milliseconds.
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }

        /**
         * The IDs of the images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The retention period of cloud desktops in the desktop group after end users disconnect from the desktops. Unit: ms.
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
         * The ID of the cloud desktop template.
         */
        public Builder ownBundleId(String ownBundleId) {
            this.putQueryParameter("OwnBundleId", ownBundleId);
            this.ownBundleId = ownBundleId;
            return this;
        }

        /**
         * The ID of the security policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * The IDs of policy groups.
         */
        public Builder policyGroupIds(java.util.List < String > policyGroupIds) {
            this.putQueryParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
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
         * The session usage threshold for the multi-session desktop group that has an auto scaling policy in effect.
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * The region ID of the desktop group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies which type of disk to reset for cloud desktops in the desktop group.
         */
        public Builder resetType(Long resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * The ID of the scaling policy group.
         * <p>
         * 
         * >  This parameter is unavailable.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * The duration before an idle cloud desktop is stopped. Unit: milliseconds.
         */
        public Builder stopDuration(Long stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        @Override
        public ModifyDesktopGroupRequest build() {
            return new ModifyDesktopGroupRequest(this);
        } 

    } 

}
