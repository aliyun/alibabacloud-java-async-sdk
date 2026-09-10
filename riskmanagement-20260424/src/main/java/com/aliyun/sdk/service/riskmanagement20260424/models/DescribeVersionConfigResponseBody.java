// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeVersionConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeVersionConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. A success message is returned if the request succeeds. An error message is returned if the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6D462855-7835-5F91-835E-A62E44EC01CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values: true: The operation is successful. false: The operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
    public static class DataBody extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("HighestVersion")
        private Integer highestVersion;

        @com.aliyun.core.annotation.NameInMap("HoneypotCapacity")
        private Long honeypotCapacity;

        @com.aliyun.core.annotation.NameInMap("ImageScanCapacity")
        private Long imageScanCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceBuyType")
        private Integer instanceBuyType;

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

        @com.aliyun.core.annotation.NameInMap("MergedVersion")
        private Integer mergedVersion;

        @com.aliyun.core.annotation.NameInMap("MultiVersion")
        private String multiVersion;

        @com.aliyun.core.annotation.NameInMap("MvAuthCount")
        private Integer mvAuthCount;

        @com.aliyun.core.annotation.NameInMap("MvUnusedAuthCount")
        private Integer mvUnusedAuthCount;

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

        private DataBody(Builder builder) {
            this.agentlessCapacity = builder.agentlessCapacity;
            this.allowPartialBuy = builder.allowPartialBuy;
            this.antiRansomwareCapacity = builder.antiRansomwareCapacity;
            this.antiRansomwareService = builder.antiRansomwareService;
            this.appWhiteList = builder.appWhiteList;
            this.appWhiteListAuthCount = builder.appWhiteListAuthCount;
            this.assetLevel = builder.assetLevel;
            this.canTryPostPaidPackage = builder.canTryPostPaidPackage;
            this.cspmCapacity = builder.cspmCapacity;
            this.highestVersion = builder.highestVersion;
            this.honeypotCapacity = builder.honeypotCapacity;
            this.imageScanCapacity = builder.imageScanCapacity;
            this.instanceBuyType = builder.instanceBuyType;
            this.intelligentAnalysisFlow = builder.intelligentAnalysisFlow;
            this.isNewContainerVersion = builder.isNewContainerVersion;
            this.isNewMultiVersion = builder.isNewMultiVersion;
            this.isOverBalance = builder.isOverBalance;
            this.isPostpay = builder.isPostpay;
            this.isTrialVersion = builder.isTrialVersion;
            this.lastTrailEndTime = builder.lastTrailEndTime;
            this.mergedVersion = builder.mergedVersion;
            this.multiVersion = builder.multiVersion;
            this.mvAuthCount = builder.mvAuthCount;
            this.mvUnusedAuthCount = builder.mvUnusedAuthCount;
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

        public static DataBody create() {
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
         * @return instanceBuyType
         */
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
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
         * @return mvAuthCount
         */
        public Integer getMvAuthCount() {
            return this.mvAuthCount;
        }

        /**
         * @return mvUnusedAuthCount
         */
        public Integer getMvUnusedAuthCount() {
            return this.mvUnusedAuthCount;
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
            private Integer highestVersion; 
            private Long honeypotCapacity; 
            private Long imageScanCapacity; 
            private Integer instanceBuyType; 
            private Integer intelligentAnalysisFlow; 
            private Boolean isNewContainerVersion; 
            private Boolean isNewMultiVersion; 
            private Boolean isOverBalance; 
            private Boolean isPostpay; 
            private Integer isTrialVersion; 
            private Long lastTrailEndTime; 
            private Integer mergedVersion; 
            private String multiVersion; 
            private Integer mvAuthCount; 
            private Integer mvUnusedAuthCount; 
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

            private Builder(DataBody model) {
                this.agentlessCapacity = model.agentlessCapacity;
                this.allowPartialBuy = model.allowPartialBuy;
                this.antiRansomwareCapacity = model.antiRansomwareCapacity;
                this.antiRansomwareService = model.antiRansomwareService;
                this.appWhiteList = model.appWhiteList;
                this.appWhiteListAuthCount = model.appWhiteListAuthCount;
                this.assetLevel = model.assetLevel;
                this.canTryPostPaidPackage = model.canTryPostPaidPackage;
                this.cspmCapacity = model.cspmCapacity;
                this.highestVersion = model.highestVersion;
                this.honeypotCapacity = model.honeypotCapacity;
                this.imageScanCapacity = model.imageScanCapacity;
                this.instanceBuyType = model.instanceBuyType;
                this.intelligentAnalysisFlow = model.intelligentAnalysisFlow;
                this.isNewContainerVersion = model.isNewContainerVersion;
                this.isNewMultiVersion = model.isNewMultiVersion;
                this.isOverBalance = model.isOverBalance;
                this.isPostpay = model.isPostpay;
                this.isTrialVersion = model.isTrialVersion;
                this.lastTrailEndTime = model.lastTrailEndTime;
                this.mergedVersion = model.mergedVersion;
                this.multiVersion = model.multiVersion;
                this.mvAuthCount = model.mvAuthCount;
                this.mvUnusedAuthCount = model.mvUnusedAuthCount;
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
             * <p>The agentless detection quota.</p>
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
             * <p>Indicates whether pay-as-you-go purchase is allowed.</p>
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
             * <p>The allocated anti-ransomware capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1680</p>
             */
            public Builder antiRansomwareCapacity(Integer antiRansomwareCapacity) {
                this.antiRansomwareCapacity = antiRansomwareCapacity;
                return this;
            }

            /**
             * <p>Indicates whether the anti-ransomware managed service is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not enabled.</li>
             * <li><strong>1</strong>: Enabled.</li>
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
             * <li><strong>0</strong>: Not enabled.</li>
             * <li><strong>2</strong>: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The number of purchased server authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder assetLevel(Integer assetLevel) {
                this.assetLevel = assetLevel;
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
             * <p>0</p>
             */
            public Builder canTryPostPaidPackage(Integer canTryPostPaidPackage) {
                this.canTryPostPaidPackage = canTryPostPaidPackage;
                return this;
            }

            /**
             * <p>The allocated Cloud Security Posture Management (CSPM) scan quota. Unit: times/month.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cspmCapacity(Long cspmCapacity) {
                this.cspmCapacity = cspmCapacity;
                return this;
            }

            /**
             * <p>The highest purchased edition of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition.</li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.</li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * <li><strong>10</strong>: Value-added services only.<blockquote>
             * <p>If a single edition is purchased, this value indicates the corresponding edition. If multiple editions are purchased, this value indicates the highest edition among them.</p>
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
             * <p>The allocated number of honeypot authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder honeypotCapacity(Long honeypotCapacity) {
                this.honeypotCapacity = honeypotCapacity;
                return this;
            }

            /**
             * <p>The number of purchased image scan authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>1900</p>
             */
            public Builder imageScanCapacity(Long imageScanCapacity) {
                this.imageScanCapacity = imageScanCapacity;
                return this;
            }

            /**
             * <p>The instance purchase type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Self-purchased.</li>
             * <li><strong>1</strong>: Allocated by multi-account management.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceBuyType(Integer instanceBuyType) {
                this.instanceBuyType = instanceBuyType;
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
             * <p>Indicates whether the instance is the new Ultimate Edition.</p>
             * <ul>
             * <li><p><strong>true</strong>: The instance is the latest edition.</p>
             * </li>
             * <li><p><strong>false</strong>: The instance is not the latest edition.</p>
             * </li>
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
             * <p>Indicates whether the instance is the new multi-edition version.</p>
             * <ul>
             * <li><p><strong>true</strong>: The instance is the latest multi-edition version.</p>
             * </li>
             * <li><p><strong>false</strong>: The instance is not the latest multi-edition version.</p>
             * </li>
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
             * <p>Indicates whether the number of existing servers exceeds the maximum purchased authorization quota. Valid values:</p>
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
             * <li><strong>1</strong>: A trial version.</li>
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
             * <p>The end timestamp of the last Security Center trial. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1603934844000</p>
             */
            public Builder lastTrailEndTime(Long lastTrailEndTime) {
                this.lastTrailEndTime = lastTrailEndTime;
                return this;
            }

            /**
             * <p>The higher protection edition when both subscription and pay-as-you-go host and container security services are enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mergedVersion(Integer mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * <p>The multi-edition version numbers and authorization usage.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder multiVersion(String multiVersion) {
                this.multiVersion = multiVersion;
                return this;
            }

            /**
             * <p>The total number of authorizations when multiple editions are purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mvAuthCount(Integer mvAuthCount) {
                this.mvAuthCount = mvAuthCount;
                return this;
            }

            /**
             * <p>The total number of remaining authorizations when multiple editions are purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder mvUnusedAuthCount(Integer mvUnusedAuthCount) {
                this.mvUnusedAuthCount = mvUnusedAuthCount;
                return this;
            }

            /**
             * <p>Indicates whether the new version of Cloud Threat Detection and Response (CTDR) is enabled. The new version supports purchasing access traffic and log storage capacity for Cloud Threat Detection and Response (CTDR). Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder newThreatAnalysis(Integer newThreatAnalysis) {
                this.newThreatAnalysis = newThreatAnalysis;
                return this;
            }

            /**
             * <p>The AI digital human managed instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onboardedAssets(Integer onboardedAssets) {
                this.onboardedAssets = onboardedAssets;
                return this;
            }

            /**
             * <p>The timestamp when the service was activated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1657244824669</p>
             */
            public Builder openTime(Long openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * <p>The highest protection edition for bound assets when the pay-as-you-go host and container security service is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition.</li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.</li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postPayHostVersion(Integer postPayHostVersion) {
                this.postPayHostVersion = postPayHostVersion;
                return this;
            }

            /**
             * <p>The pay-as-you-go instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>postpay-sas-frme8vjfiw2j</p>
             */
            public Builder postPayInstanceId(String postPayInstanceId) {
                this.postPayInstanceId = postPayInstanceId;
                return this;
            }

            /**
             * <p>The switch status of pay-as-you-go modules in JSON string format. Valid values:</p>
             * <ul>
             * <li>Key:<ul>
             * <li><strong>VUL</strong>: Vulnerability fix module.</li>
             * <li><strong>CSPM</strong>: Cloud Security Posture Management module.</li>
             * <li><strong>AGENTLESS</strong>: Agentless detection module.</li>
             * <li><strong>SERVERLESS</strong>: Serverless security module.</li>
             * <li><strong>CTDR</strong>: Threat detection and response module.</li>
             * <li><strong>POST_HOST</strong>: Host and container security module.</li>
             * <li><strong>SDK</strong>: Malicious file detection SDK module.</li>
             * <li><strong>RASP</strong>: Application protection module.</li>
             * </ul>
             * </li>
             * <li>Value: 0 indicates disabled. 1 indicates enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;BASIC_SERVICE\&quot;:0,\&quot;VUL\&quot;:0}</p>
             */
            public Builder postPayModuleSwitch(String postPayModuleSwitch) {
                this.postPayModuleSwitch = postPayModuleSwitch;
                return this;
            }

            /**
             * <p>The time when pay-as-you-go billing was activated.</p>
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
             * <p>The number of purchased application protection quotas. Unit: count/month.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder raspCapacity(Long raspCapacity) {
                this.raspCapacity = raspCapacity;
                return this;
            }

            /**
             * <p>The UNIX timestamp that indicates when the Security Center instance expires. Unit: milliseconds.</p>
             * <blockquote>
             * <p>If you do not perform renewal within 7 days after the instance expires, your paid edition instance is downgraded to Free Edition. You can no longer use the features of the paid edition, and your previous Security Center configuration data and historical alerting data (such as DDoS alerts) become inaccessible. In this case, you must repurchase Security Center to re-enable the paid edition. For more information, refer to the Security Center purchase documentation.</p>
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
             * <p>The request ID of Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>A6FB9AC3-4431-538F-BA8A-2A13AEA208A4</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>Indicates whether log analysis has been purchased. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not purchased.</li>
             * <li><strong>1</strong>: Purchased.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sasLog(Integer sasLog) {
                this.sasLog = sasLog;
                return this;
            }

            /**
             * <p>Indicates whether the security dashboard has been purchased. Valid values:</p>
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
             * <p>The number of malicious file detection SDK authorizations.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder sdkCapacity(Long sdkCapacity) {
                this.sdkCapacity = sdkCapacity;
                return this;
            }

            /**
             * <p>The purchased log storage capacity. Unit: GB. Value range: 0 to 200000.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder slsCapacity(Long slsCapacity) {
                this.slsCapacity = slsCapacity;
                return this;
            }

            /**
             * <p>The purchased threat analysis capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder threatAnalysisCapacity(Long threatAnalysisCapacity) {
                this.threatAnalysisCapacity = threatAnalysisCapacity;
                return this;
            }

            /**
             * <p>The purchased threat detection and response log access traffic. Unit: GB/day.</p>
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
             * <p>The purchased edition of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Free Edition.</li>
             * <li><strong>3</strong>: Enterprise Edition.</li>
             * <li><strong>5</strong>: Premium Edition.</li>
             * <li><strong>6</strong>: Anti-virus Edition.</li>
             * <li><strong>7</strong>: Ultimate Edition.</li>
             * <li><strong>8</strong>: Multi-edition.</li>
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
             * <p>The number of purchased vulnerability fix quotas. Unit: times/month.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder vulFixCapacity(Long vulFixCapacity) {
                this.vulFixCapacity = vulFixCapacity;
                return this;
            }

            /**
             * <p>Indicates whether the web tamper proofing service is enabled. Valid values:</p>
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
             * <p>The number of purchased web tamper proofing authorizations. One authorization enables web tamper proofing protection for one server. Value range: 0 to N.</p>
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

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVersionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVersionConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * <p>The message body content encoded by the Base64 algorithm.</p>
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
