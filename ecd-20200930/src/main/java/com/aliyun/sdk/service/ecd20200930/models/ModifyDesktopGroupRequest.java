// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopGroupRequest</p>
 */
public class ModifyDesktopGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowAutoSetup")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer allowAutoSetup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowBufferCount")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer allowBufferCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAmount")
    private Long bindAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyDesktopsCount")
    private Integer buyDesktopsCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectDuration")
    private Long connectDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupName")
    private String desktopGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableSessionConfig")
    private Boolean disableSessionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

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
    @com.aliyun.core.annotation.NameInMap("OwnBundleId")
    private String ownBundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    private java.util.List < String > policyGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileFollowSwitch")
    private Boolean profileFollowSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RatioThreshold")
    private Float ratioThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    private Long resetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleStrategyId")
    private String scaleStrategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StopDuration")
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
         * Specifies whether cloud computers can be automatically created in the subscription cloud computer pool. This parameter takes effect and is required only if you set `ChargeType` to `PrePaid`.
         * <p>
         * 
         * Valid values:
         * 
         * *   0: false
         * *   1: true
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * The number of cloud computers that can be reserved in the pay-as-you-go cloud computer pool. This parameter takes effect and is required only if you set `ChargeType` to `PostPaid`. Valid values:
         * <p>
         * 
         * *   0: does not allow the system to reserve cloud computers.
         * *   N: allows the system to reserve N cloud computers (1≤ N ≤ 100).
         * 
         * >  If you set this parameter to 0, the system must create and start cloud computers and then assign the cloud computers to end users when the end users request cloud computers. This process is time-consuming. To improve user experience, we recommend that you reserve a specific number of cloud computers.
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * The number of concurrent sessions that is allowed for each cloud computer in a multi-session cloud computer pool.
         * <p>
         * 
         * >  This parameter is unavailable.
         */
        public Builder bindAmount(Long bindAmount) {
            this.putQueryParameter("BindAmount", bindAmount);
            this.bindAmount = bindAmount;
            return this;
        }

        /**
         * *   This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter specifies the number of cloud computers to purchase in the pool. Valid values: 0 to 200.
         * <p>
         * *   For a pay-as-you-go pool, this parameter specifies the minimum number of cloud computers to create in the pool. Default value: 1. Valid values: 0 to `MaxDesktopsCount`.
         */
        public Builder buyDesktopsCount(Integer buyDesktopsCount) {
            this.putQueryParameter("BuyDesktopsCount", buyDesktopsCount);
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }

        /**
         * The role that uses the cloud computer pool.
         * <p>
         * 
         * >  This parameter is unavailable.
         * 
         * Valid values:
         * 
         * *   teacher
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   student
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * The remarks.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds. Valid values: 900000 to 345600000. That is, the session can be connected for 15 to 5,760 minutes (4 days).
         */
        public Builder connectDuration(Long connectDuration) {
            this.putQueryParameter("ConnectDuration", connectDuration);
            this.connectDuration = connectDuration;
            return this;
        }

        /**
         * The ID of the cloud computer pool.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The name of the cloud computer pool.
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
         * The ID of the Apsara File Storage NAS (NAS) file system for the user data roaming feature.
         * <p>
         * 
         * >  This parameter is unavailable.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * After an end user connects to a cloud computer, the session is established. If the system does not detect inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds. Valid values: 360000 to 3600000 (6 minutes to 60 minutes)
         * <p>
         * 
         * End users can receive a prompt to save data before sessions are disconnected. The system sends the prompt 30 seconds before the specified period of time is reached. To prevent data loss, end users must save the data of the sessions.
         * 
         * >  This parameter is suitable only for cloud computers whose image version is v1.0.2 or later.
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
         * The retention period of a session after it is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5,760 minutes (4 days) after it is disconnected. If you set this parameter to 0, the session is permanently retained after it is disconnected.
         * <p>
         * 
         * When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can continue to access data of the session.
         */
        public Builder keepDuration(Long keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * The load balancing policy of the multi-session cloud computer pool.
         * <p>
         * 
         * >  This parameter is unavailable.
         * 
         * Valid values:
         * 
         * *   0: depth-first
         * *   1: breadth-first
         */
        public Builder loadPolicy(Long loadPolicy) {
            this.putQueryParameter("LoadPolicy", loadPolicy);
            this.loadPolicy = loadPolicy;
            return this;
        }

        /**
         * The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool. Valid values: 0 to 500.
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool. This parameter takes effect and is required only if you set `ChargeType` to `PrePaid`. Default value: 1. Valid values: 0 to `MaxDesktopsCount`.
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * The ID of the cloud computer template.
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
         * Specifies whether to enable user data roaming.
         * <p>
         * 
         * >  This parameter is unavailable.
         */
        public Builder profileFollowSwitch(Boolean profileFollowSwitch) {
            this.putQueryParameter("ProfileFollowSwitch", profileFollowSwitch);
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }

        /**
         * The threshold for the ratio of connected sessions. This parameter indicates the condition that triggers auto scaling in a multi-session cloud computer pool. The ratio of connected sessions IS calculated by using the following formula:
         * <p>
         * 
         * `Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%`
         * 
         * If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.
         * 
         * >  This parameter is unavailable.
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by WUYING Workspace.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The disk reset type of cloud computers.
         * <p>
         * 
         * Valid values:
         * 
         * *   0: does not reset disks.
         * 
         * *   1: resets only the system disks.
         * 
         * *   2: resets only the user disks.
         * 
         * *   3: resets the system disks and user disks.
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
         * The period of time before the idle cloud computer enters the Stopped state. When the specified period of time is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer automatically starts. Unit: milliseconds.
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
