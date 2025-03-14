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

    @com.aliyun.core.annotation.NameInMap("AntiRansomwareService")
    private Integer antiRansomwareService;

    @com.aliyun.core.annotation.NameInMap("AppWhiteList")
    private Integer appWhiteList;

    @com.aliyun.core.annotation.NameInMap("AppWhiteListAuthCount")
    private Long appWhiteListAuthCount;

    @com.aliyun.core.annotation.NameInMap("AssetLevel")
    private Integer assetLevel;

    @com.aliyun.core.annotation.NameInMap("CspmCapacity")
    private Long cspmCapacity;

    @com.aliyun.core.annotation.NameInMap("HighestVersion")
    private Integer highestVersion;

    @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
    private Long honeypotCapacity;

    @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
    private Long imageScanCapacity;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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

    @com.aliyun.core.annotation.NameInMap("NewThreatAnalysis")
    private Integer newThreatAnalysis;

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
        this.antiRansomwareService = builder.antiRansomwareService;
        this.appWhiteList = builder.appWhiteList;
        this.appWhiteListAuthCount = builder.appWhiteListAuthCount;
        this.assetLevel = builder.assetLevel;
        this.cspmCapacity = builder.cspmCapacity;
        this.highestVersion = builder.highestVersion;
        this.honeypotCapacity = builder.honeypotCapacity;
        this.imageScanCapacity = builder.imageScanCapacity;
        this.instanceId = builder.instanceId;
        this.isNewContainerVersion = builder.isNewContainerVersion;
        this.isNewMultiVersion = builder.isNewMultiVersion;
        this.isOverBalance = builder.isOverBalance;
        this.isPostpay = builder.isPostpay;
        this.isTrialVersion = builder.isTrialVersion;
        this.lastTrailEndTime = builder.lastTrailEndTime;
        this.MVAuthCount = builder.MVAuthCount;
        this.MVUnusedAuthCount = builder.MVUnusedAuthCount;
        this.mergedVersion = builder.mergedVersion;
        this.newThreatAnalysis = builder.newThreatAnalysis;
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
     * @return cspmCapacity
     */
    public Long getCspmCapacity() {
        return this.cspmCapacity;
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
     * @return imageScanCapacity
     */
    public Long getImageScanCapacity() {
        return this.imageScanCapacity;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return newThreatAnalysis
     */
    public Integer getNewThreatAnalysis() {
        return this.newThreatAnalysis;
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
        private Integer antiRansomwareService; 
        private Integer appWhiteList; 
        private Long appWhiteListAuthCount; 
        private Integer assetLevel; 
        private Long cspmCapacity; 
        private Integer highestVersion; 
        private Long honeypotCapacity; 
        private Long imageScanCapacity; 
        private String instanceId; 
        private Boolean isNewContainerVersion; 
        private Boolean isNewMultiVersion; 
        private Boolean isOverBalance; 
        private Boolean isPostpay; 
        private Integer isTrialVersion; 
        private Long lastTrailEndTime; 
        private Integer MVAuthCount; 
        private Integer MVUnusedAuthCount; 
        private Integer mergedVersion; 
        private Integer newThreatAnalysis; 
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
            this.antiRansomwareService = model.antiRansomwareService;
            this.appWhiteList = model.appWhiteList;
            this.appWhiteListAuthCount = model.appWhiteListAuthCount;
            this.assetLevel = model.assetLevel;
            this.cspmCapacity = model.cspmCapacity;
            this.highestVersion = model.highestVersion;
            this.honeypotCapacity = model.honeypotCapacity;
            this.imageScanCapacity = model.imageScanCapacity;
            this.instanceId = model.instanceId;
            this.isNewContainerVersion = model.isNewContainerVersion;
            this.isNewMultiVersion = model.isNewMultiVersion;
            this.isOverBalance = model.isOverBalance;
            this.isPostpay = model.isPostpay;
            this.isTrialVersion = model.isTrialVersion;
            this.lastTrailEndTime = model.lastTrailEndTime;
            this.MVAuthCount = model.MVAuthCount;
            this.MVUnusedAuthCount = model.MVUnusedAuthCount;
            this.mergedVersion = model.mergedVersion;
            this.newThreatAnalysis = model.newThreatAnalysis;
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
         * <p>The quota for agentless detection.</p>
         * <blockquote>
         * <p> The agentless detection feature is unavailable for purchase. You can ignore this parameter.</p>
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
         * <p>Indicates whether the pay-as-you-go billing method is supported.</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>Switch of anti-ransomware hosting service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: off</li>
         * <li><strong>1</strong>: on</li>
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
         * <p>Indicates whether the application whitelist feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>2</strong>: yes</li>
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
         * <p>The quota for the application whitelist feature.</p>
         * <blockquote>
         * <p> The quantity of servers that are allowed by the quota is deducted by one each time you apply an application whitelist to a server. After you enable the application whitelist feature, the quota is 20 by default.</p>
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
         * <p>The quota for servers that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * <p>The purchased quota for configuration assessment. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder cspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }

        /**
         * <p>The most advanced edition that is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * <blockquote>
         * <p> If you purchase the Multi-version edition of Security Center, the value indicates the most advanced edition that is used in the Multi-version edition. If you do not purchase the Multi-version edition of Security Center, the value indicates the edition of Security Center.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * <p>The purchased quota for the cloud honeypot feature.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder honeypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }

        /**
         * <p>The purchased quota for the container image scan feature.</p>
         * 
         * <strong>example:</strong>
         * <p>8954</p>
         */
        public Builder imageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }

        /**
         * <p>The ID of purchased Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>sas-vg6hafdsafs****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether Security Center runs the latest version of the Ultimate edition.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>Indicates whether Security Center runs the latest version of the Multi-version edition. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Indicates whether the number of existing servers exceeds the purchased quota. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no</li>
         * <li><strong>true</strong>: yes<blockquote>
         * <p>Notice: This parameter is deprecated. You can ignore it.</p>
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
         * <p>Indicates whether the pay-as-you-go billing method is used. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>Indicates whether Security Center runs the free trial edition. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>The timestamp when the last trial of Security Center ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1603934844000</p>
         */
        public Builder lastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }

        /**
         * <p>The total quota in the Multi-version edition of purchased Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder MVAuthCount(Integer MVAuthCount) {
            this.MVAuthCount = MVAuthCount;
            return this;
        }

        /**
         * <p>The total remaining quota in the Multi-version edition of purchased Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder MVUnusedAuthCount(Integer MVUnusedAuthCount) {
            this.MVUnusedAuthCount = MVUnusedAuthCount;
            return this;
        }

        /**
         * <p>When both the annual/monthly and pay-as-you-go services of Cloud Security Center&quot;s host and container security are activated, the higher protection version among the two is selected. Values: - <strong>1</strong>: Free Edition - <strong>6</strong>: Anti-Virus Edition - <strong>5</strong>: Advanced Edition - <strong>3</strong>: Enterprise Edition - <strong>7</strong>: Ultimate Edition</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder mergedVersion(Integer mergedVersion) {
            this.mergedVersion = mergedVersion;
            return this;
        }

        /**
         * <p>Indicates whether the new version of the threat analysis and response feature is enabled. With the new version, you can purchase the amount of log data that you want to add to the feature and log storage capacity. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>The timestamp when Security Center is purchased. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657244824669</p>
         */
        public Builder openTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }

        /**
         * <p>When activating the pay-as-you-go service for host and container security, this represents the highest protection version for the already bound assets. The values are as follows: - <strong>1</strong>: Free Edition - <strong>3</strong>: Enterprise Edition - <strong>5</strong>: Advanced Edition - <strong>6</strong>: Anti-Virus Edition - <strong>7</strong>: Flagship Edition</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder postPayHostVersion(Integer postPayHostVersion) {
            this.postPayHostVersion = postPayHostVersion;
            return this;
        }

        /**
         * <p>The instance ID of Security Center that uses the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>postpay-sas-**</p>
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * <p>The configuration of the pay-as-you-go module. Valid values:</p>
         * <ul>
         * <li><strong>VUL</strong>: vulnerability fixing module</li>
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
         * <p>The creation time of Security Center that uses the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>1698915219000</p>
         */
        public Builder postPayOpenTime(Long postPayOpenTime) {
            this.postPayOpenTime = postPayOpenTime;
            return this;
        }

        /**
         * <p>The status of Security Center that uses the pay-as-you-go billing method. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The instance runs as expected.</li>
         * <li><strong>2</strong>: The instance is stopped due to overdue payments.</li>
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
         * <p>The purchased quota for application protection. Unit: process/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder raspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }

        /**
         * <p>The timestamp when the Security Center subscription ends. Unit: milliseconds.</p>
         * <blockquote>
         * <p> If you do not renew the subscription within seven days after the expiration date, Security Center of a paid edition is automatically downgraded to Security Center Basic. In this case, you can no longer use the features of the paid edition or view the existing configurations or statistics such as DDoS alerts in Security Center. You must purchase Security Center of a paid edition to use relevant features. For more information, see <a href="https://help.aliyun.com/document_detail/42308.html">Purchase Security Center</a>.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2DC96D2-DD2E-49D9-A28E-85590475DF55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether log analysis is purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>Indicates whether the security screen feature is purchased. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>The purchased quota for malicious file detection SDK. Unit: process/month.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder sdkCapacity(Long sdkCapacity) {
            this.sdkCapacity = sdkCapacity;
            return this;
        }

        /**
         * <p>The log storage capacity that you purchase. Unit: GB. Valid values: 0 to 200000.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder slsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }

        /**
         * <p>The purchased log storage capacity for threat analysis. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }

        /**
         * <p>The amount of log data that you purchase for the threat analysis and response feature. Unit: GB-day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder threatAnalysisFlow(Integer threatAnalysisFlow) {
            this.threatAnalysisFlow = threatAnalysisFlow;
            return this;
        }

        /**
         * <p>Indicates whether the custom alert feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>2</strong>: yes</li>
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
         * <p>The edition of purchased Security Center. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>8</strong>: Multi-version edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
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
         * <p>The quota for the cores of servers that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }

        /**
         * <p>The purchased quota for vulnerability fixing. Unit: times/month.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder vulFixCapacity(Long vulFixCapacity) {
            this.vulFixCapacity = vulFixCapacity;
            return this;
        }

        /**
         * <p>Indicates whether the web tamper proofing feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
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
         * <p>The quota for the web tamper proofing feature. The quantity of servers that are allowed by the quota is deducted by one each time a server is protected by the web tamper proofing feature. Valid values: 0 to N.</p>
         * <blockquote>
         * <p> N indicates the number of servers that you own.</p>
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
