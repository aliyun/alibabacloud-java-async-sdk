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
    @com.aliyun.core.annotation.NameInMap("DeleteDuration")
    private Long deleteDuration;

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
    private java.util.List<String> policyGroupIds;

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
        this.deleteDuration = builder.deleteDuration;
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
     * @return deleteDuration
     */
    public Long getDeleteDuration() {
        return this.deleteDuration;
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
    public java.util.List<String> getPolicyGroupIds() {
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
        private Long deleteDuration; 
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
        private java.util.List<String> policyGroupIds; 
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
            this.deleteDuration = request.deleteDuration;
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
         * <p>Specifies whether to allow automatic creation of cloud computers in the subscription shared cloud computer. This parameter takes effect only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>, and is required in this case.</p>
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
         * <p>The number of cloud computers that can be reserved in a pay-as-you-go shared cloud computer. This parameter takes effect only when the <code>ChargeType</code> parameter is set to <code>PostPaid</code>, and is required in this case. Valid values: </p>
         * <ul>
         * <li>0: no reservation</li>
         * <li>N: reserve N cloud computers (1 ≤ N ≤ 100)</li>
         * </ul>
         * <blockquote>
         * <p>If no available cloud computers are reserved, the system must create and start a cloud computer before assigning it to the user when an end user initiates a connection request. This process takes a relatively long time. Reserve a certain number of cloud computers as needed to ensure a good experience for end users.</p>
         * </blockquote>
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
         * <p>The number of concurrent sessions allowed on each cloud computer in a multi-session shared cloud computer with multiple cloud computers.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
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
         * <ul>
         * <li>For subscription shared cloud computers: the number of cloud computers to purchase. Valid values: 0 to 200.</li>
         * <li>For pay-as-you-go shared cloud computers: the minimum number of cloud computers to create in the pool. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder buyDesktopsCount(Integer buyDesktopsCount) {
            this.putQueryParameter("BuyDesktopsCount", buyDesktopsCount);
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }

        /**
         * <p>The type of the shared cloud computer.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
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
         * <p>The shared cloud computer ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The shared cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>desktopGroupName1</p>
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * <p>Specifies whether to disable session management.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableSessionConfig(Boolean disableSessionConfig) {
            this.putQueryParameter("DisableSessionConfig", disableSessionConfig);
            this.disableSessionConfig = disableSessionConfig;
            return this;
        }

        /**
         * <p>The NAS file system ID used by the user data roaming feature.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>04f314****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The maximum idle duration after a user session is connected. If no keyboard or mouse activity occurs within this duration, the session is disconnected. Unit: milliseconds. Valid values: 360000 (6 minutes) to 3600000 (60 minutes).</p>
         * <p>30 seconds before this duration is reached, the end user in the session receives a prompt to save document data. The end user must save document data promptly to avoid data loss.</p>
         * <blockquote>
         * <p>This parameter applies only to cloud computers with an image version of 1.0.2 or later.</p>
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
         * <p>desktopimage-windows-server-2016-64-ch</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * <p>When a session is disconnected because the user actively disconnects or because of other unexpected factors, the retention period starts from the time of disconnection. If the user does not reconnect to the session within the retention period, the session is logged off and all unsaved data is destroyed. If the user successfully reconnects within the retention period, the user can access the original session and the data that existed before the disconnection.</p>
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
         * <p>The load balancing policy for multi-session shared cloud computers with multiple cloud computers.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
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
         * <p>The maximum number of cloud computers that a pay-as-you-go shared cloud computer can contain. Valid values: 0 to 500.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * <p>The maximum number of cloud computers that can be subject to automatic creation in a subscription shared cloud computer. This parameter takes effect only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>, and is required in this case. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</p>
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
         * <p>The cloud computer template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b-7t275tpgjueeu****</p>
         */
        public Builder ownBundleId(String ownBundleId) {
            this.putQueryParameter("OwnBundleId", ownBundleId);
            this.ownBundleId = ownBundleId;
            return this;
        }

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-53iyi2aar0nd6****</p>
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The list of policy group IDs.</p>
         */
        public Builder policyGroupIds(java.util.List<String> policyGroupIds) {
            this.putQueryParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable user data roaming.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
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
         * <p>The session occupancy threshold, which is used as the auto scaling trigger condition for multi-session shared cloud computers with multiple cloud computers. The session occupancy is calculated by using the following formula:</p>
         * <p><code>Session occupancy = Number of attached sessions / (Total number of cloud computer resources × Maximum number of sessions supported per cloud computer) × 100%</code></p>
         * <p>When the session occupancy reaches this threshold, new cloud computers are created. When the session occupancy is below this threshold, excess cloud computers are deleted.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
         * <p>The cloud computer reset type.</p>
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
         * <p>The scaling policy group ID.</p>
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>s-kakowkdl****</p>
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * <p>The idle shutdown duration. When the idle duration of a cloud computer reaches this value, the cloud computer is automatically shut down. If a user connects after the shutdown, the cloud computer is automatically started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300000</p>
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
