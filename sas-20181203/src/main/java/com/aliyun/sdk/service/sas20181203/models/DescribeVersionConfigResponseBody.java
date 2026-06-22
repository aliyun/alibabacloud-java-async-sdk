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

    @com.aliyun.core.annotation.NameInMap("SasLog")
    private Integer sasLog;

    @com.aliyun.core.annotation.NameInMap("SasScreen")
    private Integer sasScreen;

    @com.aliyun.core.annotation.NameInMap("SdkCapacity")
    private Long sdkCapacity;

    @com.aliyun.core.annotation.NameInMap("SlsCapacity")
    private Long slsCapacity;

    @com.aliyun.core.annotation.NameInMap("ThreatAnalysisCapacity")
    private Long threatAnalysisCapacity;

    @com.aliyun.core.annotation.NameInMap("ThreatAnalysisFlow")
    private Integer threatAnalysisFlow;

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
        this.canTryPostPaidPackage = builder.canTryPostPaidPackage;
        this.cspmCapacity = builder.cspmCapacity;
        this.cspmInstanceCapacity = builder.cspmInstanceCapacity;
        this.highestVersion = builder.highestVersion;
        this.honeypotCapacity = builder.honeypotCapacity;
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
        this.sasLog = builder.sasLog;
        this.sasScreen = builder.sasScreen;
        this.sdkCapacity = builder.sdkCapacity;
        this.slsCapacity = builder.slsCapacity;
        this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
        this.threatAnalysisFlow = builder.threatAnalysisFlow;
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
        private Integer canTryPostPaidPackage; 
        private Long cspmCapacity; 
        private Integer cspmInstanceCapacity; 
        private Integer highestVersion; 
        private Long honeypotCapacity; 
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
        private Integer sasLog; 
        private Integer sasScreen; 
        private Long sdkCapacity; 
        private Long slsCapacity; 
        private Long threatAnalysisCapacity; 
        private Integer threatAnalysisFlow; 
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
            this.canTryPostPaidPackage = model.canTryPostPaidPackage;
            this.cspmCapacity = model.cspmCapacity;
            this.cspmInstanceCapacity = model.cspmInstanceCapacity;
            this.highestVersion = model.highestVersion;
            this.honeypotCapacity = model.honeypotCapacity;
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
            this.sasLog = model.sasLog;
            this.sasScreen = model.sasScreen;
            this.sdkCapacity = model.sdkCapacity;
            this.slsCapacity = model.slsCapacity;
            this.threatAnalysisCapacity = model.threatAnalysisCapacity;
            this.threatAnalysisFlow = model.threatAnalysisFlow;
            this.userDefinedAlarms = model.userDefinedAlarms;
            this.version = model.version;
            this.vmCores = model.vmCores;
            this.vulFixCapacity = model.vulFixCapacity;
            this.webLock = model.webLock;
            this.webLockAuthCount = model.webLockAuthCount;
        } 

        /**
         * <p>Number of agentless detections. </p>
         * <blockquote>
         * <p>Agentless detection is not yet available for sale, so there&quot;s no need to pay attention to this field at the moment.</p>
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
         * <p>Whether to allow pay-as-you-go purchases.</p>
         * <ul>
         * <li><strong>0</strong>: Not allowed </li>
         * <li><strong>1</strong>: Allowed</li>
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
         * <p>Ransomware protection backup capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
         */
        public Builder antiRansomwareCapacity(Integer antiRansomwareCapacity) {
            this.antiRansomwareCapacity = antiRansomwareCapacity;
            return this;
        }

        /**
         * <p>Ransomware Guardian Service. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Not activated</li>
         * <li><strong>1</strong>: Activated</li>
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
         * <p>Whether to enable the application whitelist. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not enabled </li>
         * <li><strong>2</strong>: Enabled</li>
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
         * <p>Number of application whitelist authorizations. </p>
         * <blockquote>
         * <p>One authorization allows the application of a whitelist policy to one server. After enabling the application whitelist function, the account will have 20 authorizations by default.</p>
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
         * <p>Number of purchased server licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * <p>Whether it supports the activation of a post-paid trial package. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not supported</li>
         * <li><strong>1</strong>: Supported</li>
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
         * <p>Purchased cloud platform configuration check scan count. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder cspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }

        /**
         * CspmInstanceCapacity.
         */
        public Builder cspmInstanceCapacity(Integer cspmInstanceCapacity) {
            this.cspmInstanceCapacity = cspmInstanceCapacity;
            return this;
        }

        /**
         * <p>Purchase the highest version of the Security Center. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition </li>
         * <li><strong>5</strong>: Advanced Edition </li>
         * <li><strong>6</strong>: Anti-Virus Edition</li>
         * <li><strong>7</strong>: Flagship Edition </li>
         * <li><strong>10</strong>: Purchase Additional Services Only <blockquote>
         * <p>When purchasing a single version, it indicates the corresponding version. When purchasing multiple versions, this value represents the highest version among the purchased multi-versions of Cloud Security Center.</p>
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
         * <p>Number of purchased honeypot licenses.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder honeypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }

        /**
         * HybridPaidModuleSwitchMap.
         */
        public Builder hybridPaidModuleSwitchMap(Integer hybridPaidModuleSwitchMap) {
            this.hybridPaidModuleSwitchMap = hybridPaidModuleSwitchMap;
            return this;
        }

        /**
         * HybridPaidStatus.
         */
        public Builder hybridPaidStatus(Integer hybridPaidStatus) {
            this.hybridPaidStatus = hybridPaidStatus;
            return this;
        }

        /**
         * HybridSwitch.
         */
        public Builder hybridSwitch(Integer hybridSwitch) {
            this.hybridSwitch = hybridSwitch;
            return this;
        }

        /**
         * <p>Number of purchased image scanning authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>8954</p>
         */
        public Builder imageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }

        /**
         * <p>Instance purchase type. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Self-purchased</li>
         * <li><strong>1</strong>: Allocated from multiple accounts</li>
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
         * <p>ID of the purchased Cloud Security Center instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-vg6hafdsafs****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>AI digital human analyzes traffic</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder intelligentAnalysisFlow(Integer intelligentAnalysisFlow) {
            this.intelligentAnalysisFlow = intelligentAnalysisFlow;
            return this;
        }

        /**
         * <p>Whether it is the new flagship version.</p>
         * <ul>
         * <li><strong>true</strong>: It is the latest version</li>
         * <li><strong>false</strong>: It is not the latest version</li>
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
         * <p>Whether it is the latest multi-version.</p>
         * <ul>
         * <li><strong>true</strong>: It is the latest multi-version </li>
         * <li><strong>false</strong>: It is not the latest multi-version</li>
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
         * <p>Whether the number of existing servers exceeds the maximum authorized purchase quantity. Values: </p>
         * <ul>
         * <li><strong>false</strong>: Not exceeded </li>
         * <li><strong>true</strong>: Exceeded<blockquote>
         * <p>Notice: This parameter is deprecated, and you do not need to pay attention to it.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isOverBalance(Boolean isOverBalance) {
            this.isOverBalance = isOverBalance;
            return this;
        }

        /**
         * <p>Whether to enable pay-as-you-go. Values: </p>
         * <ul>
         * <li><strong>false</strong>: Not enabled </li>
         * <li><strong>true</strong>: Enabled</li>
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
         * <p>Indicates whether the current Cloud Security Center version is a trial version. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not a trial version </li>
         * <li><strong>1</strong>: Trial version</li>
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
         * <p>The timestamp of the last trial expiration for Cloud Security Center, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1603934844000</p>
         */
        public Builder lastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }

        /**
         * <p>Total number of licenses when purchasing multiple versions.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder MVAuthCount(Integer MVAuthCount) {
            this.MVAuthCount = MVAuthCount;
            return this;
        }

        /**
         * <p>Total remaining licenses when purchasing multiple versions.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder MVUnusedAuthCount(Integer MVUnusedAuthCount) {
            this.MVUnusedAuthCount = MVUnusedAuthCount;
            return this;
        }

        /**
         * <p>When both the annual/monthly and pay-as-you-go services for Cloud Security Center&quot;s host and container security are activated, the higher protection version of the two is selected. Values: </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition</li>
         * <li><strong>6</strong>: Anti-Virus Edition </li>
         * <li><strong>5</strong>: Advanced Edition </li>
         * <li><strong>3</strong>: Enterprise Edition </li>
         * <li><strong>7</strong>: Ultimate Edition</li>
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
         * <p>Usage of multiple version numbers and license counts</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder multiVersion(String multiVersion) {
            this.multiVersion = multiVersion;
            return this;
        }

        /**
         * NewPostPaidCspm.
         */
        public Builder newPostPaidCspm(Integer newPostPaidCspm) {
            this.newPostPaidCspm = newPostPaidCspm;
            return this;
        }

        /**
         * <p>Whether to enable the new version of Threat Analysis and Response service. The new version of Threat Analysis and Response service refers to the one that supports purchasing access traffic and log storage capacity. Values: </p>
         * <ul>
         * <li><strong>0</strong>: No </li>
         * <li><strong>1</strong>: Yes</li>
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
         * <p>AI Digital Human Management Instance</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder onboardedAssets(Integer onboardedAssets) {
            this.onboardedAssets = onboardedAssets;
            return this;
        }

        /**
         * <p>Service activation timestamp, unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657244824669</p>
         */
        public Builder openTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }

        /**
         * <p>When activating the pay-as-you-go service for host and container security, it represents the highest protection version of the already bound assets. Values: </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-Virus Edition </li>
         * <li><strong>7</strong>: Flagship Edition</li>
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
         * <p>Pay-As-You-Go instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-**</p>
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * <p>Pay-as-you-go module switch status, in the format of JsonString, with values as follows:</p>
         * <ul>
         * <li>Key:<ul>
         * <li><strong>VUL</strong>: Vulnerability Repair Module </li>
         * <li><strong>CSPM</strong>: Cloud Security Posture Management Module </li>
         * <li><strong>AGENTLESS</strong>: Agentless Detection Module </li>
         * <li><strong>SERVERLESS</strong>: Serverless Security Module </li>
         * <li><strong>CTDR</strong>: Threat Analysis and Response Module </li>
         * <li><strong>POST_HOST</strong>: Host and Container Security Module </li>
         * <li><strong>SDK</strong>: Malicious File Detection SDK Module </li>
         * <li><strong>RASP</strong>: Application Protection Module</li>
         * </ul>
         * </li>
         * <li>Value: 0 indicates off, 1 indicates on</li>
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
         * <p>Pay-as-you-go activation time</p>
         * 
         * <strong>example:</strong>
         * <p>1698915219000</p>
         */
        public Builder postPayOpenTime(Long postPayOpenTime) {
            this.postPayOpenTime = postPayOpenTime;
            return this;
        }

        /**
         * <p>Pay-As-You-Go instance status. Values: </p>
         * <ul>
         * <li><strong>1</strong>: Normal </li>
         * <li><strong>2</strong>: Stopped due to unpaid bills</li>
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
         * <p>Number of purchased application protections. Unit: per month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder raspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }

        /**
         * <p>The timestamp of when the Cloud Security Center instance will expire, in milliseconds.</p>
         * <blockquote>
         * <p>If you do not renew the service within 7 days after it expires, your paid instance will be downgraded to a free version, and you will no longer be able to use the features of the paid version. Your previous Cloud Security Center configuration data and historical alert data (e.g., DDoS alerts) will become inaccessible. At this point, you can only re-enable the paid version of Cloud Security Center by repurchasing it. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchasing Cloud Security Center</a>.</p>
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
         * <p>The unique identifier generated by Alibaba Cloud for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether log analysis has been purchased. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not purchased </li>
         * <li><strong>1</strong>: Purchased</li>
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
         * <p>Whether the security dashboard has been purchased. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not purchased </li>
         * <li><strong>1</strong>: Purchased</li>
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
         * <p>Number of SDK authorizations for malicious file detection</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sdkCapacity(Long sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }

        /**
         * <p>Purchased log storage capacity in GB. Range: 0 to 200000.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder slsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }

        /**
         * <p>Purchased threat analysis capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }

        /**
         * <p>Purchased threat analysis and response log access traffic. Unit is GB/day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder threatAnalysisFlow(Integer threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }

        /**
         * <p>Whether to enable the custom alarm function. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Not enabled </li>
         * <li><strong>2</strong>: Enabled</li>
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
         * <p>Purchased Cloud Security Center version. Values:   </p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition </li>
         * <li><strong>5</strong>: Advanced Edition </li>
         * <li><strong>6</strong>: Anti-Virus Edition     </li>
         * <li><strong>7</strong>: Flagship Edition   </li>
         * <li><strong>8</strong>: Multi-Edition  </li>
         * <li><strong>10</strong>: Value-Added Services Only</li>
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
         * <p>Number of authorized cores purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }

        /**
         * <p>Number of purchased vulnerability fixes. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vulFixCapacity(Long vulFixCapacity) {
            this.vulFixCapacity = vulFixCapacity;
            return this;
        }

        /**
         * <p>Indicates whether the web tamper-proof service is enabled. Values: </p>
         * <ul>
         * <li><strong>0</strong>: Not enabled </li>
         * <li><strong>1</strong>: Enabled</li>
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
         * <p>The number of purchased web tamper-proof licenses. One license can enable web tamper protection for one server. Value range: 0~N.</p>
         * <blockquote>
         * <p>N is the number of servers you have.</p>
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

}
