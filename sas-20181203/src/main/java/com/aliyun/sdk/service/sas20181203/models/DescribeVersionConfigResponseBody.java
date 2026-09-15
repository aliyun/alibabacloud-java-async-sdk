// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionConfigResponseBody</p>
 */
public class DescribeVersionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentlessCapacity")
    private Long agentlessCapacity;

    @com.aliyun.core.annotation.NameInMap("AllowPartialBuy")
    private Integer allowPartialBuy;

    @com.aliyun.core.annotation.NameInMap("AntiRansomwareCapacity")
    private Integer antiRansomwareCapacity;

    @com.aliyun.core.annotation.NameInMap("AntiRansomwareService")
    private Integer antiRansomwareService;

    @com.aliyun.core.annotation.NameInMap("AppWhiteList")
    private Integer appWhiteList;

    @com.aliyun.core.annotation.NameInMap("AppWhiteListAuthCount")
    private Long appWhiteListAuthCount;

    @com.aliyun.core.annotation.NameInMap("AssetLevel")
    private Integer assetLevel;

    @com.aliyun.core.annotation.NameInMap("BuySasEdr")
    private String buySasEdr;

    @com.aliyun.core.annotation.NameInMap("CanTryPostPaidPackage")
    private Integer canTryPostPaidPackage;

    @com.aliyun.core.annotation.NameInMap("CspmCapacity")
    private Long cspmCapacity;

    @com.aliyun.core.annotation.NameInMap("CspmInstanceCapacity")
    private Integer cspmInstanceCapacity;

    @com.aliyun.core.annotation.NameInMap("HighestVersion")
    private Integer highestVersion;

    @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
    private Long honeypotCapacity;

    @com.aliyun.core.annotation.NameInMap("HybridPaidGrayStatus")
    private String hybridPaidGrayStatus;

    @com.aliyun.core.annotation.NameInMap("HybridPaidModuleSwitchMap")
    private Integer hybridPaidModuleSwitchMap;

    @com.aliyun.core.annotation.NameInMap("HybridPaidStatus")
    private Integer hybridPaidStatus;

    @com.aliyun.core.annotation.NameInMap("HybridSwitch")
    private Integer hybridSwitch;

    @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
    private Long imageScanCapacity;

    @com.aliyun.core.annotation.NameInMap("InstanceBuyType")
    private Integer instanceBuyType;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("IntelligentAnalysisFlow")
    private Integer intelligentAnalysisFlow;

    @com.aliyun.core.annotation.NameInMap("IsNewContainerVersion")
    private Boolean isNewContainerVersion;

    @com.aliyun.core.annotation.NameInMap("IsNewMultiVersion")
    private Boolean isNewMultiVersion;

    @com.aliyun.core.annotation.NameInMap("IsOverBalance")
    private Boolean isOverBalance;

    @com.aliyun.core.annotation.NameInMap("IsPostpay")
    private Boolean isPostpay;

    @com.aliyun.core.annotation.NameInMap("IsTrialVersion")
    private Integer isTrialVersion;

    @com.aliyun.core.annotation.NameInMap("LastTrailEndTime")
    private Long lastTrailEndTime;

    @com.aliyun.core.annotation.NameInMap("MVAuthCount")
    private Integer MVAuthCount;

    @com.aliyun.core.annotation.NameInMap("MVUnusedAuthCount")
    private Integer MVUnusedAuthCount;

    @com.aliyun.core.annotation.NameInMap("MergedVersion")
    private Integer mergedVersion;

    @com.aliyun.core.annotation.NameInMap("MultiVersion")
    private String multiVersion;

    @com.aliyun.core.annotation.NameInMap("NewPostPaidCspm")
    private Integer newPostPaidCspm;

    @com.aliyun.core.annotation.NameInMap("NewThreatAnalysis")
    private Integer newThreatAnalysis;

    @com.aliyun.core.annotation.NameInMap("OnboardedAssets")
    private Integer onboardedAssets;

    @com.aliyun.core.annotation.NameInMap("OpenTime")
    private Long openTime;

    @com.aliyun.core.annotation.NameInMap("PostPayHostVersion")
    private Integer postPayHostVersion;

    @com.aliyun.core.annotation.NameInMap("PostPayInstanceId")
    private String postPayInstanceId;

    @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
    private String postPayModuleSwitch;

    @com.aliyun.core.annotation.NameInMap("PostPayOpenTime")
    private Long postPayOpenTime;

    @com.aliyun.core.annotation.NameInMap("PostPayStatus")
    private Integer postPayStatus;

    @com.aliyun.core.annotation.NameInMap("RaspCapacity")
    private Long raspCapacity;

    @com.aliyun.core.annotation.NameInMap("ReleaseTime")
    private Long releaseTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasEdrClientAuthCount")
    private String sasEdrClientAuthCount;

    @com.aliyun.core.annotation.NameInMap("SasEdrPostPaidInstanceId")
    private String sasEdrPostPaidInstanceId;

    @com.aliyun.core.annotation.NameInMap("SasEdrPrePaidInstanceId")
    private String sasEdrPrePaidInstanceId;

    @com.aliyun.core.annotation.NameInMap("SasEdrPrePaidInstanceStatus")
    private String sasEdrPrePaidInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("SasEdrVersion")
    private String sasEdrVersion;

    @com.aliyun.core.annotation.NameInMap("SasLog")
    private Integer sasLog;

    @com.aliyun.core.annotation.NameInMap("SasScreen")
    private Integer sasScreen;

    @com.aliyun.core.annotation.NameInMap("SdkAiPostPaidGray")
    private Integer sdkAiPostPaidGray;

    @com.aliyun.core.annotation.NameInMap("SdkCapacity")
    private Long sdkCapacity;

    @com.aliyun.core.annotation.NameInMap("SlsCapacity")
    private Long slsCapacity;

    @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
    private Long threatAnalysisCapacity;

    @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
    private Integer threatAnalysisFlow;

    @com.aliyun.core.annotation.NameInMap("TrialModuleList")
    private java.util.List<TrialModuleList> trialModuleList;

    @com.aliyun.core.annotation.NameInMap("TrialVersion")
    private Integer trialVersion;

    @com.aliyun.core.annotation.NameInMap("UserDefinedAlarms")
    private Integer userDefinedAlarms;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    @com.aliyun.core.annotation.NameInMap("VmCores")
    private Integer vmCores;

    @com.aliyun.core.annotation.NameInMap("VulFixCapacity")
    private Long vulFixCapacity;

    @com.aliyun.core.annotation.NameInMap("WebLock")
    private Integer webLock;

    @com.aliyun.core.annotation.NameInMap("WebLockAuthCount")
    private Long webLockAuthCount;

    private DescribeVersionConfigResponseBody(Builder builder) {
        this.agentlessCapacity = builder.agentlessCapacity;
        this.allowPartialBuy = builder.allowPartialBuy;
        this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
        this.antiRansomwareService = builder.antiRansomwareService;
        this.appWhiteList = builder.appWhiteList;
        this.appWhiteListAuthCount = builder.appWhiteListAuthCount;
        this.assetLevel = builder.assetLevel;
        this.buySasEdr = builder.buySasEdr;
        this.canTryPostPaidPackage = builder.canTryPostPaidPackage;
        this.cspmCapacity = builder.cspmCapacity;
        this.cspmInstanceCapacity = builder.cspmInstanceCapacity;
        this.highestVersion = builder.highestVersion;
        this.honeypotCapacity = builder.honeypotCapacity;
        this.hybridPaidGrayStatus = builder.hybridPaidGrayStatus;
        this.hybridPaidModuleSwitchMap = builder.hybridPaidModuleSwitchMap;
        this.hybridPaidStatus = builder.hybridPaidStatus;
        this.hybridSwitch = builder.hybridSwitch;
        this.imageScanCapacity = builder.imageScanCapacity;
        this.instanceBuyType = builder.instanceBuyType;
        this.instanceId = builder.instanceId;
        this.intelligentAnalysisFlow = builder.intelligentAnalysisFlow;
        this.isNewContainerVersion = builder.isNewContainerVersion;
        this.isNewMultiVersion = builder.isNewMultiVersion;
        this.isOverBalance = builder.isOverBalance;
        this.isPostpay = builder.isPostpay;
        this.isTrialVersion = builder.isTrialVersion;
        this.lastTrailEndTime = builder.lastTrailEndTime;
        this.MVAuthCount = builder.MVAuthCount;
        this.MVUnusedAuthCount = builder.MVUnusedAuthCount;
        this.mergedVersion = builder.mergedVersion;
        this.multiVersion = builder.multiVersion;
        this.newPostPaidCspm = builder.newPostPaidCspm;
        this.newThreatAnalysis = builder.newThreatAnalysis;
        this.onboardedAssets = builder.onboardedAssets;
        this.openTime = builder.openTime;
        this.postPayHostVersion = builder.postPayHostVersion;
        this.postPayInstanceId = builder.postPayInstanceId;
        this.postPayModuleSwitch = builder.postPayModuleSwitch;
        this.postPayOpenTime = builder.postPayOpenTime;
        this.postPayStatus = builder.postPayStatus;
        this.raspCapacity = builder.raspCapacity;
        this.releaseTime = builder.releaseTime;
        this.requestId = builder.requestId;
        this.sasEdrClientAuthCount = builder.sasEdrClientAuthCount;
        this.sasEdrPostPaidInstanceId = builder.sasEdrPostPaidInstanceId;
        this.sasEdrPrePaidInstanceId = builder.sasEdrPrePaidInstanceId;
        this.sasEdrPrePaidInstanceStatus = builder.sasEdrPrePaidInstanceStatus;
        this.sasEdrVersion = builder.sasEdrVersion;
        this.sasLog = builder.sasLog;
        this.sasScreen = builder.sasScreen;
        this.sdkAiPostPaidGray = builder.sdkAiPostPaidGray;
        this.sdkCapacity = builder.sdkCapacity;
        this.slsCapacity = builder.slsCapacity;
        this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
        this.threatAnalysisFlow = builder.threatAnalysisFlow;
        this.trialModuleList = builder.trialModuleList;
        this.trialVersion = builder.trialVersion;
        this.userDefinedAlarms = builder.userDefinedAlarms;
        this.version = builder.version;
        this.vmCores = builder.vmCores;
        this.vulFixCapacity = builder.vulFixCapacity;
        this.webLock = builder.webLock;
        this.webLockAuthCount = builder.webLockAuthCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVersionConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentlessCapacity
     */
    public Long getAgentlessCapacity() {
        return this.agentlessCapacity;
    }

    /**
     * @return allowPartialBuy
     */
    public Integer getAllowPartialBuy() {
        return this.allowPartialBuy;
    }

    /**
     * @return antiRansomwareCapacity
     */
    public Integer getAntiRansomwareCapacity() {
        return this.antiRansomwareCapacity;
    }

    /**
     * @return antiRansomwareService
     */
    public Integer getAntiRansomwareService() {
        return this.antiRansomwareService;
    }

    /**
     * @return appWhiteList
     */
    public Integer getAppWhiteList() {
        return this.appWhiteList;
    }

    /**
     * @return appWhiteListAuthCount
     */
    public Long getAppWhiteListAuthCount() {
        return this.appWhiteListAuthCount;
    }

    /**
     * @return assetLevel
     */
    public Integer getAssetLevel() {
        return this.assetLevel;
    }

    /**
     * @return buySasEdr
     */
    public String getBuySasEdr() {
        return this.buySasEdr;
    }

    /**
     * @return canTryPostPaidPackage
     */
    public Integer getCanTryPostPaidPackage() {
        return this.canTryPostPaidPackage;
    }

    /**
     * @return cspmCapacity
     */
    public Long getCspmCapacity() {
        return this.cspmCapacity;
    }

    /**
     * @return cspmInstanceCapacity
     */
    public Integer getCspmInstanceCapacity() {
        return this.cspmInstanceCapacity;
    }

    /**
     * @return highestVersion
     */
    public Integer getHighestVersion() {
        return this.highestVersion;
    }

    /**
     * @return honeypotCapacity
     */
    public Long getHoneypotCapacity() {
        return this.honeypotCapacity;
    }

    /**
     * @return hybridPaidGrayStatus
     */
    public String getHybridPaidGrayStatus() {
        return this.hybridPaidGrayStatus;
    }

    /**
     * @return hybridPaidModuleSwitchMap
     */
    public Integer getHybridPaidModuleSwitchMap() {
        return this.hybridPaidModuleSwitchMap;
    }

    /**
     * @return hybridPaidStatus
     */
    public Integer getHybridPaidStatus() {
        return this.hybridPaidStatus;
    }

    /**
     * @return hybridSwitch
     */
    public Integer getHybridSwitch() {
        return this.hybridSwitch;
    }

    /**
     * @return imageScanCapacity
     */
    public Long getImageScanCapacity() {
        return this.imageScanCapacity;
    }

    /**
     * @return instanceBuyType
     */
    public Integer getInstanceBuyType() {
        return this.instanceBuyType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intelligentAnalysisFlow
     */
    public Integer getIntelligentAnalysisFlow() {
        return this.intelligentAnalysisFlow;
    }

    /**
     * @return isNewContainerVersion
     */
    public Boolean getIsNewContainerVersion() {
        return this.isNewContainerVersion;
    }

    /**
     * @return isNewMultiVersion
     */
    public Boolean getIsNewMultiVersion() {
        return this.isNewMultiVersion;
    }

    /**
     * @return isOverBalance
     */
    public Boolean getIsOverBalance() {
        return this.isOverBalance;
    }

    /**
     * @return isPostpay
     */
    public Boolean getIsPostpay() {
        return this.isPostpay;
    }

    /**
     * @return isTrialVersion
     */
    public Integer getIsTrialVersion() {
        return this.isTrialVersion;
    }

    /**
     * @return lastTrailEndTime
     */
    public Long getLastTrailEndTime() {
        return this.lastTrailEndTime;
    }

    /**
     * @return MVAuthCount
     */
    public Integer getMVAuthCount() {
        return this.MVAuthCount;
    }

    /**
     * @return MVUnusedAuthCount
     */
    public Integer getMVUnusedAuthCount() {
        return this.MVUnusedAuthCount;
    }

    /**
     * @return mergedVersion
     */
    public Integer getMergedVersion() {
        return this.mergedVersion;
    }

    /**
     * @return multiVersion
     */
    public String getMultiVersion() {
        return this.multiVersion;
    }

    /**
     * @return newPostPaidCspm
     */
    public Integer getNewPostPaidCspm() {
        return this.newPostPaidCspm;
    }

    /**
     * @return newThreatAnalysis
     */
    public Integer getNewThreatAnalysis() {
        return this.newThreatAnalysis;
    }

    /**
     * @return onboardedAssets
     */
    public Integer getOnboardedAssets() {
        return this.onboardedAssets;
    }

    /**
     * @return openTime
     */
    public Long getOpenTime() {
        return this.openTime;
    }

    /**
     * @return postPayHostVersion
     */
    public Integer getPostPayHostVersion() {
        return this.postPayHostVersion;
    }

    /**
     * @return postPayInstanceId
     */
    public String getPostPayInstanceId() {
        return this.postPayInstanceId;
    }

    /**
     * @return postPayModuleSwitch
     */
    public String getPostPayModuleSwitch() {
        return this.postPayModuleSwitch;
    }

    /**
     * @return postPayOpenTime
     */
    public Long getPostPayOpenTime() {
        return this.postPayOpenTime;
    }

    /**
     * @return postPayStatus
     */
    public Integer getPostPayStatus() {
        return this.postPayStatus;
    }

    /**
     * @return raspCapacity
     */
    public Long getRaspCapacity() {
        return this.raspCapacity;
    }

    /**
     * @return releaseTime
     */
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasEdrClientAuthCount
     */
    public String getSasEdrClientAuthCount() {
        return this.sasEdrClientAuthCount;
    }

    /**
     * @return sasEdrPostPaidInstanceId
     */
    public String getSasEdrPostPaidInstanceId() {
        return this.sasEdrPostPaidInstanceId;
    }

    /**
     * @return sasEdrPrePaidInstanceId
     */
    public String getSasEdrPrePaidInstanceId() {
        return this.sasEdrPrePaidInstanceId;
    }

    /**
     * @return sasEdrPrePaidInstanceStatus
     */
    public String getSasEdrPrePaidInstanceStatus() {
        return this.sasEdrPrePaidInstanceStatus;
    }

    /**
     * @return sasEdrVersion
     */
    public String getSasEdrVersion() {
        return this.sasEdrVersion;
    }

    /**
     * @return sasLog
     */
    public Integer getSasLog() {
        return this.sasLog;
    }

    /**
     * @return sasScreen
     */
    public Integer getSasScreen() {
        return this.sasScreen;
    }

    /**
     * @return sdkAiPostPaidGray
     */
    public Integer getSdkAiPostPaidGray() {
        return this.sdkAiPostPaidGray;
    }

    /**
     * @return sdkCapacity
     */
    public Long getSdkCapacity() {
        return this.sdkCapacity;
    }

    /**
     * @return slsCapacity
     */
    public Long getSlsCapacity() {
        return this.slsCapacity;
    }

    /**
     * @return threatAnalysisCapacity
     */
    public Long getThreatAnalysisCapacity() {
        return this.threatAnalysisCapacity;
    }

    /**
     * @return threatAnalysisFlow
     */
    public Integer getThreatAnalysisFlow() {
        return this.threatAnalysisFlow;
    }

    /**
     * @return trialModuleList
     */
    public java.util.List<TrialModuleList> getTrialModuleList() {
        return this.trialModuleList;
    }

    /**
     * @return trialVersion
     */
    public Integer getTrialVersion() {
        return this.trialVersion;
    }

    /**
     * @return userDefinedAlarms
     */
    public Integer getUserDefinedAlarms() {
        return this.userDefinedAlarms;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * @return vmCores
     */
    public Integer getVmCores() {
        return this.vmCores;
    }

    /**
     * @return vulFixCapacity
     */
    public Long getVulFixCapacity() {
        return this.vulFixCapacity;
    }

    /**
     * @return webLock
     */
    public Integer getWebLock() {
        return this.webLock;
    }

    /**
     * @return webLockAuthCount
     */
    public Long getWebLockAuthCount() {
        return this.webLockAuthCount;
    }

    public static final class Builder {
        private Long agentlessCapacity; 
        private Integer allowPartialBuy; 
        private Integer antiRansomwareCapacity; 
        private Integer antiRansomwareService; 
        private Integer appWhiteList; 
        private Long appWhiteListAuthCount; 
        private Integer assetLevel; 
        private String buySasEdr; 
        private Integer canTryPostPaidPackage; 
        private Long cspmCapacity; 
        private Integer cspmInstanceCapacity; 
        private Integer highestVersion; 
        private Long honeypotCapacity; 
        private String hybridPaidGrayStatus; 
        private Integer hybridPaidModuleSwitchMap; 
        private Integer hybridPaidStatus; 
        private Integer hybridSwitch; 
        private Long imageScanCapacity; 
        private Integer instanceBuyType; 
        private String instanceId; 
        private Integer intelligentAnalysisFlow; 
        private Boolean isNewContainerVersion; 
        private Boolean isNewMultiVersion; 
        private Boolean isOverBalance; 
        private Boolean isPostpay; 
        private Integer isTrialVersion; 
        private Long lastTrailEndTime; 
        private Integer MVAuthCount; 
        private Integer MVUnusedAuthCount; 
        private Integer mergedVersion; 
        private String multiVersion; 
        private Integer newPostPaidCspm; 
        private Integer newThreatAnalysis; 
        private Integer onboardedAssets; 
        private Long openTime; 
        private Integer postPayHostVersion; 
        private String postPayInstanceId; 
        private String postPayModuleSwitch; 
        private Long postPayOpenTime; 
        private Integer postPayStatus; 
        private Long raspCapacity; 
        private Long releaseTime; 
        private String requestId; 
        private String sasEdrClientAuthCount; 
        private String sasEdrPostPaidInstanceId; 
        private String sasEdrPrePaidInstanceId; 
        private String sasEdrPrePaidInstanceStatus; 
        private String sasEdrVersion; 
        private Integer sasLog; 
        private Integer sasScreen; 
        private Integer sdkAiPostPaidGray; 
        private Long sdkCapacity; 
        private Long slsCapacity; 
        private Long threatAnalysisCapacity; 
        private Integer threatAnalysisFlow; 
        private java.util.List<TrialModuleList> trialModuleList; 
        private Integer trialVersion; 
        private Integer userDefinedAlarms; 
        private Integer version; 
        private Integer vmCores; 
        private Long vulFixCapacity; 
        private Integer webLock; 
        private Long webLockAuthCount; 

        private Builder() {
        } 

        private Builder(DescribeVersionConfigResponseBody model) {
            this.agentlessCapacity = model.agentlessCapacity;
            this.allowPartialBuy = model.allowPartialBuy;
            this.antiRansomwareCapacity = model.antiRansomwareCapacity;
            this.antiRansomwareService = model.antiRansomwareService;
            this.appWhiteList = model.appWhiteList;
            this.appWhiteListAuthCount = model.appWhiteListAuthCount;
            this.assetLevel = model.assetLevel;
            this.buySasEdr = model.buySasEdr;
            this.canTryPostPaidPackage = model.canTryPostPaidPackage;
            this.cspmCapacity = model.cspmCapacity;
            this.cspmInstanceCapacity = model.cspmInstanceCapacity;
            this.highestVersion = model.highestVersion;
            this.honeypotCapacity = model.honeypotCapacity;
            this.hybridPaidGrayStatus = model.hybridPaidGrayStatus;
            this.hybridPaidModuleSwitchMap = model.hybridPaidModuleSwitchMap;
            this.hybridPaidStatus = model.hybridPaidStatus;
            this.hybridSwitch = model.hybridSwitch;
            this.imageScanCapacity = model.imageScanCapacity;
            this.instanceBuyType = model.instanceBuyType;
            this.instanceId = model.instanceId;
            this.intelligentAnalysisFlow = model.intelligentAnalysisFlow;
            this.isNewContainerVersion = model.isNewContainerVersion;
            this.isNewMultiVersion = model.isNewMultiVersion;
            this.isOverBalance = model.isOverBalance;
            this.isPostpay = model.isPostpay;
            this.isTrialVersion = model.isTrialVersion;
            this.lastTrailEndTime = model.lastTrailEndTime;
            this.MVAuthCount = model.MVAuthCount;
            this.MVUnusedAuthCount = model.MVUnusedAuthCount;
            this.mergedVersion = model.mergedVersion;
            this.multiVersion = model.multiVersion;
            this.newPostPaidCspm = model.newPostPaidCspm;
            this.newThreatAnalysis = model.newThreatAnalysis;
            this.onboardedAssets = model.onboardedAssets;
            this.openTime = model.openTime;
            this.postPayHostVersion = model.postPayHostVersion;
            this.postPayInstanceId = model.postPayInstanceId;
            this.postPayModuleSwitch = model.postPayModuleSwitch;
            this.postPayOpenTime = model.postPayOpenTime;
            this.postPayStatus = model.postPayStatus;
            this.raspCapacity = model.raspCapacity;
            this.releaseTime = model.releaseTime;
            this.requestId = model.requestId;
            this.sasEdrClientAuthCount = model.sasEdrClientAuthCount;
            this.sasEdrPostPaidInstanceId = model.sasEdrPostPaidInstanceId;
            this.sasEdrPrePaidInstanceId = model.sasEdrPrePaidInstanceId;
            this.sasEdrPrePaidInstanceStatus = model.sasEdrPrePaidInstanceStatus;
            this.sasEdrVersion = model.sasEdrVersion;
            this.sasLog = model.sasLog;
            this.sasScreen = model.sasScreen;
            this.sdkAiPostPaidGray = model.sdkAiPostPaidGray;
            this.sdkCapacity = model.sdkCapacity;
            this.slsCapacity = model.slsCapacity;
            this.threatAnalysisCapacity = model.threatAnalysisCapacity;
            this.threatAnalysisFlow = model.threatAnalysisFlow;
            this.trialModuleList = model.trialModuleList;
            this.trialVersion = model.trialVersion;
            this.userDefinedAlarms = model.userDefinedAlarms;
            this.version = model.version;
            this.vmCores = model.vmCores;
            this.vulFixCapacity = model.vulFixCapacity;
            this.webLock = model.webLock;
            this.webLockAuthCount = model.webLockAuthCount;
        } 

        /**
         * <p>The number of agentless detection licenses.</p>
         * <blockquote>
         * <p>Agentless detection is not available for purchase. You can ignore this field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder agentlessCapacity(Long agentlessCapacity) {
            this.agentlessCapacity = agentlessCapacity;
            return this;
        }

        /**
         * <p>Indicates whether pay-as-you-go purchasing is allowed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not allowed.</li>
         * <li><strong>1</strong>: Allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allowPartialBuy(Integer allowPartialBuy) {
            this.allowPartialBuy = allowPartialBuy;
            return this;
        }

        /**
         * <p>The anti-ransomware backup capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
         */
        public Builder antiRansomwareCapacity(Integer antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }

        /**
         * <p>The status of the anti-ransomware managed service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not activated.</li>
         * <li><strong>1</strong>: Activated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder antiRansomwareService(Integer antiRansomwareService) {
            this.antiRansomwareService = antiRansomwareService;
            return this;
        }

        /**
         * <p>Indicates whether the application whitelist is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not enabled.</li>
         * <li><strong>2</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder appWhiteList(Integer appWhiteList) {
            this.appWhiteList = appWhiteList;
            return this;
        }

        /**
         * <p>The number of application whitelist authorizations.</p>
         * <blockquote>
         * <p>One authorization allows you to apply an application whitelist policy to one server. After the application whitelist feature is enabled, the account has 20 authorizations by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder appWhiteListAuthCount(Long appWhiteListAuthCount) {
            this.appWhiteListAuthCount = appWhiteListAuthCount;
            return this;
        }

        /**
         * <p>The number of purchased server authorization licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * <p>Indicates whether EDR is purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder buySasEdr(String buySasEdr) {
            this.buySasEdr = buySasEdr;
            return this;
        }

        /**
         * <p>Indicates whether the pay-as-you-go trial plan can be activated. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder canTryPostPaidPackage(Integer canTryPostPaidPackage) {
            this.canTryPostPaidPackage = canTryPostPaidPackage;
            return this;
        }

        /**
         * <p>The number of purchased Cloud Security Posture Management (CSPM) scans, in scans per month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder cspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }

        /**
         * <p>The AI digital human analysis traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cspmInstanceCapacity(Integer cspmInstanceCapacity) {
            this.cspmInstanceCapacity = cspmInstanceCapacity;
            return this;
        }

        /**
         * <p>The highest purchased edition of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * <li><strong>10</strong>: Value-added services only.<blockquote>
         * <p>If a single version is purchased, this value indicates the corresponding version. If multiple versions are purchased, this value indicates the highest version among the purchased editions of Security Center.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * <p>The number of purchased honeypot authorization licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder honeypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }

        /**
         * <p>The canary release module for elastic billing.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CSPM_INSTANCE&quot;:1}</p>
         */
        public Builder hybridPaidGrayStatus(String hybridPaidGrayStatus) {
            this.hybridPaidGrayStatus = hybridPaidGrayStatus;
            return this;
        }

        /**
         * <p>The AI digital human analysis traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder hybridPaidModuleSwitchMap(Integer hybridPaidModuleSwitchMap) {
            this.hybridPaidModuleSwitchMap = hybridPaidModuleSwitchMap;
            return this;
        }

        /**
         * <p>The status of the elastic billing switch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder hybridPaidStatus(Integer hybridPaidStatus) {
            this.hybridPaidStatus = hybridPaidStatus;
            return this;
        }

        /**
         * <p>The AI digital human analysis traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder hybridSwitch(Integer hybridSwitch) {
            this.hybridSwitch = hybridSwitch;
            return this;
        }

        /**
         * <p>The number of purchased image scan authorization licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>8954</p>
         */
        public Builder imageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }

        /**
         * <p>The instance purchase type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Self-purchased.</li>
         * <li><strong>1</strong>: Allocated from a multi-account setup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instanceBuyType(Integer instanceBuyType) {
            this.instanceBuyType = instanceBuyType;
            return this;
        }

        /**
         * <p>The instance ID of the purchased Security Center instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-vg6hafdsafs****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The AI digital human analysis traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder intelligentAnalysisFlow(Integer intelligentAnalysisFlow) {
            this.intelligentAnalysisFlow = intelligentAnalysisFlow;
            return this;
        }

        /**
         * <p>Indicates whether the instance is the new Ultimate Edition. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance is the latest version.</li>
         * <li><strong>false</strong>: The instance is not the latest version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isNewContainerVersion(Boolean isNewContainerVersion) {
            this.isNewContainerVersion = isNewContainerVersion;
            return this;
        }

        /**
         * <p>Indicates whether the instance is the new multi-version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance is the latest multi-version.</li>
         * <li><strong>false</strong>: The instance is not the latest multi-version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isNewMultiVersion(Boolean isNewMultiVersion) {
            this.isNewMultiVersion = isNewMultiVersion;
            return this;
        }

        /**
         * <p>Indicates whether the number of existing servers exceeds the maximum number of purchased authorizations. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not exceeded.</li>
         * <li><strong>true</strong>: Exceeded.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: This parameter is deprecated. You can ignore it.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isOverBalance(Boolean isOverBalance) {
            this.isOverBalance = isOverBalance;
            return this;
        }

        /**
         * <p>Indicates whether pay-as-you-go billing is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not enabled.</li>
         * <li><strong>true</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isPostpay(Boolean isPostpay) {
            this.isPostpay = isPostpay;
            return this;
        }

        /**
         * <p>Indicates whether the current Security Center edition is a trial version. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not a trial version.</li>
         * <li><strong>1</strong>: Trial version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isTrialVersion(Integer isTrialVersion) {
            this.isTrialVersion = isTrialVersion;
            return this;
        }

        /**
         * <p>The end timestamp of the last trial of Security Center, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1603934844000</p>
         */
        public Builder lastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }

        /**
         * <p>The total number of authorizations when multiple versions are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder MVAuthCount(Integer MVAuthCount) {
            this.MVAuthCount = MVAuthCount;
            return this;
        }

        /**
         * <p>The total number of remaining authorizations when multiple versions are purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder MVUnusedAuthCount(Integer MVUnusedAuthCount) {
            this.MVUnusedAuthCount = MVUnusedAuthCount;
            return this;
        }

        /**
         * <p>The higher protection edition when both host protection and container protection are activated with subscription and pay-as-you-go billing methods in Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder mergedVersion(Integer mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }

        /**
         * <p>The multi-version number and authorization usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder multiVersion(String multiVersion) {
            this.multiVersion = multiVersion;
            return this;
        }

        /**
         * <p>The AI digital human analysis traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder newPostPaidCspm(Integer newPostPaidCspm) {
            this.newPostPaidCspm = newPostPaidCspm;
            return this;
        }

        /**
         * <p>Indicates whether the new version of Cloud Threat Detection and Response (CTDR) is enabled. The new version of CTDR supports purchasing traffic ingestion and log storage capacity. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder newThreatAnalysis(Integer newThreatAnalysis) {
            this.newThreatAnalysis = newThreatAnalysis;
            return this;
        }

        /**
         * <p>The AI digital human managed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder onboardedAssets(Integer onboardedAssets) {
            this.onboardedAssets = onboardedAssets;
            return this;
        }

        /**
         * <p>The timestamp when the service was activated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657244824669</p>
         */
        public Builder openTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }

        /**
         * <p>The highest protection edition bound to assets when the pay-as-you-go host and container security service is activated. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.</li>
         * <li><strong>7</strong>: Ultimate Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPayHostVersion(Integer postPayHostVersion) {
            this.postPayHostVersion = postPayHostVersion;
            return this;
        }

        /**
         * <p>The instance ID of the pay-as-you-go instance.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-**</p>
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * <p>The status of pay-as-you-go module switches, in JSON string format. Valid values:</p>
         * <ul>
         * <li>Key:<ul>
         * <li><strong>VUL</strong>: Vulnerability fix module.</li>
         * <li><strong>CSPM</strong>: Cloud Security Posture Management (CSPM) module.</li>
         * <li><strong>AGENTLESS</strong>: Agentless detection module.</li>
         * <li><strong>SERVERLESS</strong>: Serverless security module.</li>
         * <li><strong>CTDR</strong>: Cloud Threat Detection and Response (CTDR) module.</li>
         * <li><strong>POST_HOST</strong>: Host and container security module.</li>
         * <li><strong>SDK</strong>: Malicious file detection SDK module.</li>
         * <li><strong>RASP</strong>: Runtime application self-protection (RASP) module.</li>
         * </ul>
         * </li>
         * <li>Value: 0 indicates disabled, and 1 indicates enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VUL&quot;:1}</p>
         */
        public Builder postPayModuleSwitch(String postPayModuleSwitch) {
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }

        /**
         * <p>The time when pay-as-you-go billing was activated. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698915219000</p>
         */
        public Builder postPayOpenTime(Long postPayOpenTime) {
            this.postPayOpenTime = postPayOpenTime;
            return this;
        }

        /**
         * <p>The instance status of the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Normal.</li>
         * <li><strong>2</strong>: Suspended due to overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder postPayStatus(Integer postPayStatus) {
            this.postPayStatus = postPayStatus;
            return this;
        }

        /**
         * <p>The number of purchased application protection licenses, in licenses per month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder raspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }

        /**
         * <p>The UNIX timestamp when the Security Center instance expires, in milliseconds.</p>
         * <blockquote>
         * <p>If you do not complete renewal within 7 days after the instance expires, your paid edition instance is downgraded to Free Edition. You can no longer use the features of the paid edition, and your previous Security Center configuration data and historical alerting data (such as DDoS alerts) become inaccessible. In this case, you must repurchase Security Center to enable the paid edition. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchase Security Center</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1625846400000</p>
         */
        public Builder releaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * <p>The unique request ID generated by Alibaba Cloud for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of servers purchased for EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sasEdrClientAuthCount(String sasEdrClientAuthCount) {
            this.sasEdrClientAuthCount = sasEdrClientAuthCount;
            return this;
        }

        /**
         * <p>The pay-as-you-go instance ID of EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-edr-postpaid-fadaf</p>
         */
        public Builder sasEdrPostPaidInstanceId(String sasEdrPostPaidInstanceId) {
            this.sasEdrPostPaidInstanceId = sasEdrPostPaidInstanceId;
            return this;
        }

        /**
         * <p>The subscription instance ID of EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-edr-sfkhakhk</p>
         */
        public Builder sasEdrPrePaidInstanceId(String sasEdrPrePaidInstanceId) {
            this.sasEdrPrePaidInstanceId = sasEdrPrePaidInstanceId;
            return this;
        }

        /**
         * <p>The instance status of the EDR upfront instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        public Builder sasEdrPrePaidInstanceStatus(String sasEdrPrePaidInstanceStatus) {
            this.sasEdrPrePaidInstanceStatus = sasEdrPrePaidInstanceStatus;
            return this;
        }

        /**
         * <p>The purchased edition of EDR.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sasEdrVersion(String sasEdrVersion) {
            this.sasEdrVersion = sasEdrVersion;
            return this;
        }

        /**
         * <p>Indicates whether log analysis is purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not purchased.</li>
         * <li><strong>1</strong>: Purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sasLog(Integer sasLog) {
            this.sasLog = sasLog;
            return this;
        }

        /**
         * <p>Indicates whether the security dashboard is purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not purchased.</li>
         * <li><strong>1</strong>: Purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder sasScreen(Integer sasScreen) {
            this.sasScreen = sasScreen;
            return this;
        }

        /**
         * <p>The canary release status of the pay-as-you-go SDK.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sdkAiPostPaidGray(Integer sdkAiPostPaidGray) {
            this.sdkAiPostPaidGray = sdkAiPostPaidGray;
            return this;
        }

        /**
         * <p>The number of malicious file detection SDK authorization licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sdkCapacity(Long sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }

        /**
         * <p>The purchased log storage capacity, in GB. Valid values: 0 to 200000.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder slsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }

        /**
         * <p>The purchased threat analysis capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }

        /**
         * <p>The purchased log ingestion traffic for Cloud Threat Detection and Response (CTDR), in GB per day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder threatAnalysisFlow(Integer threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }

        /**
         * <p>The list of trial sub-modules.</p>
         */
        public Builder trialModuleList(java.util.List<TrialModuleList> trialModuleList) {
            this.trialModuleList = trialModuleList;
            return this;
        }

        /**
         * <p>The trial version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder trialVersion(Integer trialVersion) {
            this.trialVersion = trialVersion;
            return this;
        }

        /**
         * <p>Indicates whether the custom alerting feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not enabled.</li>
         * <li><strong>2</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder userDefinedAlarms(Integer userDefinedAlarms) {
            this.userDefinedAlarms = userDefinedAlarms;
            return this;
        }

        /**
         * <p>The purchased edition of Security Center. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition. </li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>5</strong>: Advanced Edition.</li>
         * <li><strong>6</strong>: Anti-virus Edition.    </li>
         * <li><strong>7</strong>: Ultimate Edition.   </li>
         * <li><strong>8</strong>: Multi-version.   </li>
         * <li><strong>10</strong>: Value-added services only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The number of purchased authorized cores.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }

        /**
         * <p>The number of purchased vulnerability fixes, in fixes per month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vulFixCapacity(Long vulFixCapacity) {
            this.vulFixCapacity = vulFixCapacity;
            return this;
        }

        /**
         * <p>Indicates whether web tamper-proofing is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not enabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder webLock(Integer webLock) {
            this.webLock = webLock;
            return this;
        }

        /**
         * <p>The number of purchased web tamper-proofing authorizations. One authorization enables web tamper-proofing protection for one server. Valid values: 0 to N.</p>
         * <blockquote>
         * <p>N is the number of servers that you own.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder webLockAuthCount(Long webLockAuthCount) {
            this.webLockAuthCount = webLockAuthCount;
            return this;
        }

        public DescribeVersionConfigResponseBody build() {
            return new DescribeVersionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVersionConfigResponseBody</p>
     */
    public static class TrialModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TrialModuleList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialModuleList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(TrialModuleList model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the trial sub-module.</p>
             * 
             * <strong>example:</strong>
             * <p>EDR</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TrialModuleList build() {
                return new TrialModuleList(this);
            } 

        } 

    }
}
