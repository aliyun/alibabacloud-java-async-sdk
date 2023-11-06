// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVersionConfigResponseBody</p>
 */
public class DescribeVersionConfigResponseBody extends TeaModel {
    @NameInMap("AgentlessCapacity")
    private Long agentlessCapacity;

    @NameInMap("AllowPartialBuy")
    private Integer allowPartialBuy;

    @NameInMap("AppWhiteList")
    private Integer appWhiteList;

    @NameInMap("AppWhiteListAuthCount")
    private Long appWhiteListAuthCount;

    @NameInMap("AssetLevel")
    private Integer assetLevel;

    @NameInMap("CspmCapacity")
    private Long cspmCapacity;

    @NameInMap("HighestVersion")
    private Integer highestVersion;

    @NameInMap("HoneypotCapacity")
    private Long honeypotCapacity;

    @NameInMap("ImageScanCapacity")
    private Long imageScanCapacity;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("IsNewContainerVersion")
    private Boolean isNewContainerVersion;

    @NameInMap("IsNewMultiVersion")
    private Boolean isNewMultiVersion;

    @NameInMap("IsOverBalance")
    private Boolean isOverBalance;

    @NameInMap("IsPostpay")
    private Boolean isPostpay;

    @NameInMap("IsTrialVersion")
    private Integer isTrialVersion;

    @NameInMap("LastTrailEndTime")
    private Long lastTrailEndTime;

    @NameInMap("MVAuthCount")
    private Integer MVAuthCount;

    @NameInMap("MVUnusedAuthCount")
    private Integer MVUnusedAuthCount;

    @NameInMap("OpenTime")
    private Long openTime;

    @NameInMap("PostPayInstanceId")
    private String postPayInstanceId;

    @NameInMap("PostPayModuleSwitch")
    private String postPayModuleSwitch;

    @NameInMap("PostPayOpenTime")
    private Long postPayOpenTime;

    @NameInMap("PostPayStatus")
    private Integer postPayStatus;

    @NameInMap("RaspCapacity")
    private Long raspCapacity;

    @NameInMap("ReleaseTime")
    private Long releaseTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SasLog")
    private Integer sasLog;

    @NameInMap("SasScreen")
    private Integer sasScreen;

    @NameInMap("SlsCapacity")
    private Long slsCapacity;

    @NameInMap("ThreatAnalysisCapacity")
    private Long threatAnalysisCapacity;

    @NameInMap("UserDefinedAlarms")
    private Integer userDefinedAlarms;

    @NameInMap("Version")
    private Integer version;

    @NameInMap("VmCores")
    private Integer vmCores;

    @NameInMap("VulFixCapacity")
    private Long vulFixCapacity;

    @NameInMap("WebLock")
    private Integer webLock;

    @NameInMap("WebLockAuthCount")
    private Long webLockAuthCount;

    private DescribeVersionConfigResponseBody(Builder builder) {
        this.agentlessCapacity = builder.agentlessCapacity;
        this.allowPartialBuy = builder.allowPartialBuy;
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
        this.openTime = builder.openTime;
        this.postPayInstanceId = builder.postPayInstanceId;
        this.postPayModuleSwitch = builder.postPayModuleSwitch;
        this.postPayOpenTime = builder.postPayOpenTime;
        this.postPayStatus = builder.postPayStatus;
        this.raspCapacity = builder.raspCapacity;
        this.releaseTime = builder.releaseTime;
        this.requestId = builder.requestId;
        this.sasLog = builder.sasLog;
        this.sasScreen = builder.sasScreen;
        this.slsCapacity = builder.slsCapacity;
        this.threatAnalysisCapacity = builder.threatAnalysisCapacity;
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
     * @return openTime
     */
    public Long getOpenTime() {
        return this.openTime;
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
        private Long openTime; 
        private String postPayInstanceId; 
        private String postPayModuleSwitch; 
        private Long postPayOpenTime; 
        private Integer postPayStatus; 
        private Long raspCapacity; 
        private Long releaseTime; 
        private String requestId; 
        private Integer sasLog; 
        private Integer sasScreen; 
        private Long slsCapacity; 
        private Long threatAnalysisCapacity; 
        private Integer userDefinedAlarms; 
        private Integer version; 
        private Integer vmCores; 
        private Long vulFixCapacity; 
        private Integer webLock; 
        private Long webLockAuthCount; 

        /**
         * The quota for agentless detection.
         * <p>
         * 
         * >  The agentless detection feature is unavailable for purchase. You can ignore this parameter.
         */
        public Builder agentlessCapacity(Long agentlessCapacity) {
            this.agentlessCapacity = agentlessCapacity;
            return this;
        }

        /**
         * Indicates whether the pay-as-you-go billing method is supported.
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder allowPartialBuy(Integer allowPartialBuy) {
            this.allowPartialBuy = allowPartialBuy;
            return this;
        }

        /**
         * Indicates whether the application whitelist feature is enabled. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **2**: yes
         */
        public Builder appWhiteList(Integer appWhiteList) {
            this.appWhiteList = appWhiteList;
            return this;
        }

        /**
         * The quota for the application whitelist feature.
         * <p>
         * 
         * >  The quantity of servers that are allowed by the quota is deducted by one each time you apply an application whitelist to a server. After you enable the application whitelist feature, the quota is 20 by default.
         */
        public Builder appWhiteListAuthCount(Long appWhiteListAuthCount) {
            this.appWhiteListAuthCount = appWhiteListAuthCount;
            return this;
        }

        /**
         * The quota for servers that can be protected.
         */
        public Builder assetLevel(Integer assetLevel) {
            this.assetLevel = assetLevel;
            return this;
        }

        /**
         * The quota for configuration assessment. Unit: times/month.
         */
        public Builder cspmCapacity(Long cspmCapacity) {
            this.cspmCapacity = cspmCapacity;
            return this;
        }

        /**
         * The most advanced edition that is used. Valid values:
         * <p>
         * 
         * *   **1**: Basic edition
         * *   **3**: Enterprise edition
         * *   **5**: Advanced edition
         * *   **6**: Anti-virus edition
         * *   **7**: Ultimate edition
         * *   **10**: Value-added Plan edition
         * 
         * >  If you purchase the Multi-version edition of Security Center, the value indicates the most advanced edition that is used in the Multi-version edition. If you do not purchase the Multi-version edition of Security Center, the value indicates the edition of Security Center.
         */
        public Builder highestVersion(Integer highestVersion) {
            this.highestVersion = highestVersion;
            return this;
        }

        /**
         * The number of honeypots.
         */
        public Builder honeypotCapacity(Long honeypotCapacity) {
            this.honeypotCapacity = honeypotCapacity;
            return this;
        }

        /**
         * The quota for the container image scan feature.
         */
        public Builder imageScanCapacity(Long imageScanCapacity) {
            this.imageScanCapacity = imageScanCapacity;
            return this;
        }

        /**
         * The ID of purchased Security Center.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Indicates whether Security Center runs the latest version of the Ultimate edition.
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder isNewContainerVersion(Boolean isNewContainerVersion) {
            this.isNewContainerVersion = isNewContainerVersion;
            return this;
        }

        /**
         * Indicates whether Security Center runs the latest version of the Multi-version edition. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder isNewMultiVersion(Boolean isNewMultiVersion) {
            this.isNewMultiVersion = isNewMultiVersion;
            return this;
        }

        /**
         * Indicates whether the number of existing servers exceeds the purchased quota. Valid values:
         * <p>
         * 
         * *   **false**: no
         * *   **true**: yes
         */
        public Builder isOverBalance(Boolean isOverBalance) {
            this.isOverBalance = isOverBalance;
            return this;
        }

        /**
         * IsPostpay.
         */
        public Builder isPostpay(Boolean isPostpay) {
            this.isPostpay = isPostpay;
            return this;
        }

        /**
         * Indicates whether Security Center runs the free trial edition. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder isTrialVersion(Integer isTrialVersion) {
            this.isTrialVersion = isTrialVersion;
            return this;
        }

        /**
         * The timestamp when the last trial ends. Unit: milliseconds.
         */
        public Builder lastTrailEndTime(Long lastTrailEndTime) {
            this.lastTrailEndTime = lastTrailEndTime;
            return this;
        }

        /**
         * The total quota in the Multi-version edition of purchased Security Center.
         */
        public Builder MVAuthCount(Integer MVAuthCount) {
            this.MVAuthCount = MVAuthCount;
            return this;
        }

        /**
         * The total remaining quota in the Multi-version edition of purchased Security Center.
         */
        public Builder MVUnusedAuthCount(Integer MVUnusedAuthCount) {
            this.MVUnusedAuthCount = MVUnusedAuthCount;
            return this;
        }

        /**
         * The timestamp when Security Center is purchased. Unit: milliseconds.
         */
        public Builder openTime(Long openTime) {
            this.openTime = openTime;
            return this;
        }

        /**
         * PostPayInstanceId.
         */
        public Builder postPayInstanceId(String postPayInstanceId) {
            this.postPayInstanceId = postPayInstanceId;
            return this;
        }

        /**
         * PostPayModuleSwitch.
         */
        public Builder postPayModuleSwitch(String postPayModuleSwitch) {
            this.postPayModuleSwitch = postPayModuleSwitch;
            return this;
        }

        /**
         * PostPayOpenTime.
         */
        public Builder postPayOpenTime(Long postPayOpenTime) {
            this.postPayOpenTime = postPayOpenTime;
            return this;
        }

        /**
         * PostPayStatus.
         */
        public Builder postPayStatus(Integer postPayStatus) {
            this.postPayStatus = postPayStatus;
            return this;
        }

        /**
         * The quota for application protection. Unit: process/month.
         */
        public Builder raspCapacity(Long raspCapacity) {
            this.raspCapacity = raspCapacity;
            return this;
        }

        /**
         * The timestamp when Security Center is released. Unit: milliseconds. The value of this parameter is seven days after Security Center expires.
         * <p>
         * 
         * > If you do not renew the subscription within seven days after the expiration date, the Value-added Plan, Basic Anti-Virus, Advanced, or Enterprise edition is downgraded to the Basic edition. In this case, you can no longer view the existing configurations or statistics such as DDoS alerts. You must purchase the Anti-virus, Advanced, or Enterprise edition to continue using relevant features. For more information, see [Purchase Security Center](~~42308~~).
         */
        public Builder releaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether log analysis is purchased. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder sasLog(Integer sasLog) {
            this.sasLog = sasLog;
            return this;
        }

        /**
         * Indicates whether the security screen feature is purchased. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder sasScreen(Integer sasScreen) {
            this.sasScreen = sasScreen;
            return this;
        }

        /**
         * The log storage capacity that you purchase. Unit: GB. Valid values: 0 to 200000.
         */
        public Builder slsCapacity(Long slsCapacity) {
            this.slsCapacity = slsCapacity;
            return this;
        }

        /**
         * The purchased log storage capacity for threat analysis. Unit: GB.
         */
        public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
            this.threatAnalysisCapacity = threatAnalysisCapacity;
            return this;
        }

        /**
         * Indicates whether the custom alert feature is enabled. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **2**: yes
         */
        public Builder userDefinedAlarms(Integer userDefinedAlarms) {
            this.userDefinedAlarms = userDefinedAlarms;
            return this;
        }

        /**
         * The edition of purchased Security Center. Valid values:
         * <p>
         * 
         * *   **1**: Basic edition
         * *   **3**: Enterprise edition
         * *   **5**: Advanced edition
         * *   **6**: Anti-virus edition
         * *   **7**: Ultimate edition
         * *   **8**: Multi-version edition
         * *   **10**: Value-added Plan edition
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * The quota for the cores of servers that can be protected.
         */
        public Builder vmCores(Integer vmCores) {
            this.vmCores = vmCores;
            return this;
        }

        /**
         * The quota for vulnerability fixing. Unit: times/month.
         */
        public Builder vulFixCapacity(Long vulFixCapacity) {
            this.vulFixCapacity = vulFixCapacity;
            return this;
        }

        /**
         * Indicates whether the web tamper proofing feature is enabled. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder webLock(Integer webLock) {
            this.webLock = webLock;
            return this;
        }

        /**
         * The quota for the web tamper proofing feature. The quantity of servers that are allowed by the quota is deducted by one each time a server is protected by the web tamper proofing feature. Valid values: 0 to N.
         * <p>
         * 
         * >  N indicates the number of servers that you own.
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
