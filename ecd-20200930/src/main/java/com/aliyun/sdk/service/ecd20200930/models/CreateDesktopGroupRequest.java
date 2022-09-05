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
    @NameInMap("BindAmount")
    private Long bindAmount;

    @Query
    @NameInMap("BundleId")
    @Validation(required = true)
    private String bundleId;

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
    @Validation(maximum = 1000, minimum = 1)
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
    private String policyGroupId;

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
        this.bindAmount = builder.bindAmount;
        this.bundleId = builder.bundleId;
        this.chargeType = builder.chargeType;
        this.classify = builder.classify;
        this.clientToken = builder.clientToken;
        this.comments = builder.comments;
        this.connectDuration = builder.connectDuration;
        this.defaultInitDesktopCount = builder.defaultInitDesktopCount;
        this.desktopGroupName = builder.desktopGroupName;
        this.directoryId = builder.directoryId;
        this.endUserIds = builder.endUserIds;
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
        private Long bindAmount; 
        private String bundleId; 
        private String chargeType; 
        private String classify; 
        private String clientToken; 
        private String comments; 
        private Long connectDuration; 
        private Integer defaultInitDesktopCount; 
        private String desktopGroupName; 
        private String directoryId; 
        private java.util.List < String > endUserIds; 
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
            this.bindAmount = request.bindAmount;
            this.bundleId = request.bundleId;
            this.chargeType = request.chargeType;
            this.classify = request.classify;
            this.clientToken = request.clientToken;
            this.comments = request.comments;
            this.connectDuration = request.connectDuration;
            this.defaultInitDesktopCount = request.defaultInitDesktopCount;
            this.desktopGroupName = request.desktopGroupName;
            this.directoryId = request.directoryId;
            this.endUserIds = request.endUserIds;
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
         * AllClassifyUsers.
         */
        public Builder allClassifyUsers(Boolean allClassifyUsers) {
            this.putQueryParameter("AllClassifyUsers", allClassifyUsers);
            this.allClassifyUsers = allClassifyUsers;
            return this;
        }

        /**
         * AllowAutoSetup.
         */
        public Builder allowAutoSetup(Integer allowAutoSetup) {
            this.putQueryParameter("AllowAutoSetup", allowAutoSetup);
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }

        /**
         * AllowBufferCount.
         */
        public Builder allowBufferCount(Integer allowBufferCount) {
            this.putQueryParameter("AllowBufferCount", allowBufferCount);
            this.allowBufferCount = allowBufferCount;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * BindAmount.
         */
        public Builder bindAmount(Long bindAmount) {
            this.putQueryParameter("BindAmount", bindAmount);
            this.bindAmount = bindAmount;
            return this;
        }

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * ConnectDuration.
         */
        public Builder connectDuration(Long connectDuration) {
            this.putQueryParameter("ConnectDuration", connectDuration);
            this.connectDuration = connectDuration;
            return this;
        }

        /**
         * DefaultInitDesktopCount.
         */
        public Builder defaultInitDesktopCount(Integer defaultInitDesktopCount) {
            this.putQueryParameter("DefaultInitDesktopCount", defaultInitDesktopCount);
            this.defaultInitDesktopCount = defaultInitDesktopCount;
            return this;
        }

        /**
         * DesktopGroupName.
         */
        public Builder desktopGroupName(String desktopGroupName) {
            this.putQueryParameter("DesktopGroupName", desktopGroupName);
            this.desktopGroupName = desktopGroupName;
            return this;
        }

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * EndUserIds.
         */
        public Builder endUserIds(java.util.List < String > endUserIds) {
            this.putQueryParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * IdleDisconnectDuration.
         */
        public Builder idleDisconnectDuration(Long idleDisconnectDuration) {
            this.putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration);
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }

        /**
         * KeepDuration.
         */
        public Builder keepDuration(Long keepDuration) {
            this.putQueryParameter("KeepDuration", keepDuration);
            this.keepDuration = keepDuration;
            return this;
        }

        /**
         * LoadPolicy.
         */
        public Builder loadPolicy(Long loadPolicy) {
            this.putQueryParameter("LoadPolicy", loadPolicy);
            this.loadPolicy = loadPolicy;
            return this;
        }

        /**
         * MaxDesktopsCount.
         */
        public Builder maxDesktopsCount(Integer maxDesktopsCount) {
            this.putQueryParameter("MaxDesktopsCount", maxDesktopsCount);
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }

        /**
         * MinDesktopsCount.
         */
        public Builder minDesktopsCount(Integer minDesktopsCount) {
            this.putQueryParameter("MinDesktopsCount", minDesktopsCount);
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * OwnType.
         */
        public Builder ownType(Integer ownType) {
            this.putQueryParameter("OwnType", ownType);
            this.ownType = ownType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * RatioThreshold.
         */
        public Builder ratioThreshold(Float ratioThreshold) {
            this.putQueryParameter("RatioThreshold", ratioThreshold);
            this.ratioThreshold = ratioThreshold;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResetType.
         */
        public Builder resetType(Long resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * ScaleStrategyId.
         */
        public Builder scaleStrategyId(String scaleStrategyId) {
            this.putQueryParameter("ScaleStrategyId", scaleStrategyId);
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }

        /**
         * StopDuration.
         */
        public Builder stopDuration(Long stopDuration) {
            this.putQueryParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        /**
         * VolumeEncryptionEnabled.
         */
        public Builder volumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled);
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }

        /**
         * VolumeEncryptionKey.
         */
        public Builder volumeEncryptionKey(String volumeEncryptionKey) {
            this.putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }

        /**
         * VpcId.
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
