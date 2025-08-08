// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
 */
public class QueryMdsUpgradeTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMdsUpgradeTaskDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMdsUpgradeTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(QueryMdsUpgradeTaskDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultContent = model.resultContent;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryMdsUpgradeTaskDetailResponseBody build() {
            return new QueryMdsUpgradeTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
     */
    public static class RuleJsonList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("RuleElement")
        private String ruleElement;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuleJsonList(Builder builder) {
            this.operation = builder.operation;
            this.ruleElement = builder.ruleElement;
            this.ruleType = builder.ruleType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleJsonList create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return ruleElement
         */
        public String getRuleElement() {
            return this.ruleElement;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operation; 
            private String ruleElement; 
            private String ruleType; 
            private String value; 

            private Builder() {
            } 

            private Builder(RuleJsonList model) {
                this.operation = model.operation;
                this.ruleElement = model.ruleElement;
                this.ruleType = model.ruleType;
                this.value = model.value;
            } 

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * RuleElement.
             */
            public Builder ruleElement(String ruleElement) {
                this.ruleElement = ruleElement;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleJsonList build() {
                return new RuleJsonList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
     */
    public static class Whitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("WhiteListCount")
        private Long whiteListCount;

        @com.aliyun.core.annotation.NameInMap("WhiteListName")
        private String whiteListName;

        private Whitelist(Builder builder) {
            this.appCode = builder.appCode;
            this.business = builder.business;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.idType = builder.idType;
            this.platform = builder.platform;
            this.status = builder.status;
            this.whiteListCount = builder.whiteListCount;
            this.whiteListName = builder.whiteListName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelist create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return whiteListCount
         */
        public Long getWhiteListCount() {
            return this.whiteListCount;
        }

        /**
         * @return whiteListName
         */
        public String getWhiteListName() {
            return this.whiteListName;
        }

        public static final class Builder {
            private String appCode; 
            private String business; 
            private String gmtModified; 
            private Long id; 
            private String idType; 
            private String platform; 
            private Long status; 
            private Long whiteListCount; 
            private String whiteListName; 

            private Builder() {
            } 

            private Builder(Whitelist model) {
                this.appCode = model.appCode;
                this.business = model.business;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.idType = model.idType;
                this.platform = model.platform;
                this.status = model.status;
                this.whiteListCount = model.whiteListCount;
                this.whiteListName = model.whiteListName;
            } 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * WhiteListCount.
             */
            public Builder whiteListCount(Long whiteListCount) {
                this.whiteListCount = whiteListCount;
                return this;
            }

            /**
             * WhiteListName.
             */
            public Builder whiteListName(String whiteListName) {
                this.whiteListName = whiteListName;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Appstoreurl")
        private String appstoreurl;

        @com.aliyun.core.annotation.NameInMap("ChannelContains")
        private String channelContains;

        @com.aliyun.core.annotation.NameInMap("ChannelExcludes")
        private String channelExcludes;

        @com.aliyun.core.annotation.NameInMap("CityContains")
        private String cityContains;

        @com.aliyun.core.annotation.NameInMap("CityExcludes")
        private String cityExcludes;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DeviceGreyNum")
        private Long deviceGreyNum;

        @com.aliyun.core.annotation.NameInMap("DevicePercent")
        private Long devicePercent;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ExecutionOrder")
        private Long executionOrder;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @com.aliyun.core.annotation.NameInMap("GreyNotice")
        private Long greyNotice;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Long greyNum;

        @com.aliyun.core.annotation.NameInMap("GreyUv")
        private Long greyUv;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InnerVersion")
        private String innerVersion;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Long isEnterprise;

        @com.aliyun.core.annotation.NameInMap("IsOfficial")
        private Long isOfficial;

        @com.aliyun.core.annotation.NameInMap("IsPush")
        private Long isPush;

        @com.aliyun.core.annotation.NameInMap("IsRc")
        private Long isRc;

        @com.aliyun.core.annotation.NameInMap("IsRelease")
        private Long isRelease;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("MobileModelContains")
        private String mobileModelContains;

        @com.aliyun.core.annotation.NameInMap("MobileModelExcludes")
        private String mobileModelExcludes;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("PackageInfoId")
        private Long packageInfoId;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Long publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Long publishType;

        @com.aliyun.core.annotation.NameInMap("PushContent")
        private String pushContent;

        @com.aliyun.core.annotation.NameInMap("QrcodeUrl")
        private String qrcodeUrl;

        @com.aliyun.core.annotation.NameInMap("ReleaseType")
        private String releaseType;

        @com.aliyun.core.annotation.NameInMap("RuleJsonList")
        private java.util.List<RuleJsonList> ruleJsonList;

        @com.aliyun.core.annotation.NameInMap("SilentType")
        private Long silentType;

        @com.aliyun.core.annotation.NameInMap("SyncMode")
        private String syncMode;

        @com.aliyun.core.annotation.NameInMap("SyncResult")
        private String syncResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Long taskStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeContent")
        private String upgradeContent;

        @com.aliyun.core.annotation.NameInMap("UpgradeType")
        private Long upgradeType;

        @com.aliyun.core.annotation.NameInMap("UpgradeValidTime")
        private Long upgradeValidTime;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<Whitelist> whitelist;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        private Content(Builder builder) {
            this.appCode = builder.appCode;
            this.appId = builder.appId;
            this.appstoreurl = builder.appstoreurl;
            this.channelContains = builder.channelContains;
            this.channelExcludes = builder.channelExcludes;
            this.cityContains = builder.cityContains;
            this.cityExcludes = builder.cityExcludes;
            this.creator = builder.creator;
            this.deviceGreyNum = builder.deviceGreyNum;
            this.devicePercent = builder.devicePercent;
            this.downloadUrl = builder.downloadUrl;
            this.executionOrder = builder.executionOrder;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNotice = builder.greyNotice;
            this.greyNum = builder.greyNum;
            this.greyUv = builder.greyUv;
            this.id = builder.id;
            this.innerVersion = builder.innerVersion;
            this.isEnterprise = builder.isEnterprise;
            this.isOfficial = builder.isOfficial;
            this.isPush = builder.isPush;
            this.isRc = builder.isRc;
            this.isRelease = builder.isRelease;
            this.memo = builder.memo;
            this.mobileModelContains = builder.mobileModelContains;
            this.mobileModelExcludes = builder.mobileModelExcludes;
            this.modifier = builder.modifier;
            this.netType = builder.netType;
            this.osVersion = builder.osVersion;
            this.packageInfoId = builder.packageInfoId;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishType = builder.publishType;
            this.pushContent = builder.pushContent;
            this.qrcodeUrl = builder.qrcodeUrl;
            this.releaseType = builder.releaseType;
            this.ruleJsonList = builder.ruleJsonList;
            this.silentType = builder.silentType;
            this.syncMode = builder.syncMode;
            this.syncResult = builder.syncResult;
            this.taskStatus = builder.taskStatus;
            this.upgradeContent = builder.upgradeContent;
            this.upgradeType = builder.upgradeType;
            this.upgradeValidTime = builder.upgradeValidTime;
            this.whitelist = builder.whitelist;
            this.whitelistIds = builder.whitelistIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appstoreurl
         */
        public String getAppstoreurl() {
            return this.appstoreurl;
        }

        /**
         * @return channelContains
         */
        public String getChannelContains() {
            return this.channelContains;
        }

        /**
         * @return channelExcludes
         */
        public String getChannelExcludes() {
            return this.channelExcludes;
        }

        /**
         * @return cityContains
         */
        public String getCityContains() {
            return this.cityContains;
        }

        /**
         * @return cityExcludes
         */
        public String getCityExcludes() {
            return this.cityExcludes;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deviceGreyNum
         */
        public Long getDeviceGreyNum() {
            return this.deviceGreyNum;
        }

        /**
         * @return devicePercent
         */
        public Long getDevicePercent() {
            return this.devicePercent;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return executionOrder
         */
        public Long getExecutionOrder() {
            return this.executionOrder;
        }

        /**
         * @return gmtCreateStr
         */
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        /**
         * @return greyConfigInfo
         */
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        /**
         * @return greyEndtimeData
         */
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        /**
         * @return greyNotice
         */
        public Long getGreyNotice() {
            return this.greyNotice;
        }

        /**
         * @return greyNum
         */
        public Long getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return greyUv
         */
        public Long getGreyUv() {
            return this.greyUv;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return innerVersion
         */
        public String getInnerVersion() {
            return this.innerVersion;
        }

        /**
         * @return isEnterprise
         */
        public Long getIsEnterprise() {
            return this.isEnterprise;
        }

        /**
         * @return isOfficial
         */
        public Long getIsOfficial() {
            return this.isOfficial;
        }

        /**
         * @return isPush
         */
        public Long getIsPush() {
            return this.isPush;
        }

        /**
         * @return isRc
         */
        public Long getIsRc() {
            return this.isRc;
        }

        /**
         * @return isRelease
         */
        public Long getIsRelease() {
            return this.isRelease;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return mobileModelContains
         */
        public String getMobileModelContains() {
            return this.mobileModelContains;
        }

        /**
         * @return mobileModelExcludes
         */
        public String getMobileModelExcludes() {
            return this.mobileModelExcludes;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return packageInfoId
         */
        public Long getPackageInfoId() {
            return this.packageInfoId;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return publishMode
         */
        public Long getPublishMode() {
            return this.publishMode;
        }

        /**
         * @return publishType
         */
        public Long getPublishType() {
            return this.publishType;
        }

        /**
         * @return pushContent
         */
        public String getPushContent() {
            return this.pushContent;
        }

        /**
         * @return qrcodeUrl
         */
        public String getQrcodeUrl() {
            return this.qrcodeUrl;
        }

        /**
         * @return releaseType
         */
        public String getReleaseType() {
            return this.releaseType;
        }

        /**
         * @return ruleJsonList
         */
        public java.util.List<RuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        /**
         * @return silentType
         */
        public Long getSilentType() {
            return this.silentType;
        }

        /**
         * @return syncMode
         */
        public String getSyncMode() {
            return this.syncMode;
        }

        /**
         * @return syncResult
         */
        public String getSyncResult() {
            return this.syncResult;
        }

        /**
         * @return taskStatus
         */
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return upgradeContent
         */
        public String getUpgradeContent() {
            return this.upgradeContent;
        }

        /**
         * @return upgradeType
         */
        public Long getUpgradeType() {
            return this.upgradeType;
        }

        /**
         * @return upgradeValidTime
         */
        public Long getUpgradeValidTime() {
            return this.upgradeValidTime;
        }

        /**
         * @return whitelist
         */
        public java.util.List<Whitelist> getWhitelist() {
            return this.whitelist;
        }

        /**
         * @return whitelistIds
         */
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

        public static final class Builder {
            private String appCode; 
            private String appId; 
            private String appstoreurl; 
            private String channelContains; 
            private String channelExcludes; 
            private String cityContains; 
            private String cityExcludes; 
            private String creator; 
            private Long deviceGreyNum; 
            private Long devicePercent; 
            private String downloadUrl; 
            private Long executionOrder; 
            private String gmtCreateStr; 
            private String greyConfigInfo; 
            private String greyEndtimeData; 
            private Long greyNotice; 
            private Long greyNum; 
            private Long greyUv; 
            private Long id; 
            private String innerVersion; 
            private Long isEnterprise; 
            private Long isOfficial; 
            private Long isPush; 
            private Long isRc; 
            private Long isRelease; 
            private String memo; 
            private String mobileModelContains; 
            private String mobileModelExcludes; 
            private String modifier; 
            private String netType; 
            private String osVersion; 
            private Long packageInfoId; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Long publishMode; 
            private Long publishType; 
            private String pushContent; 
            private String qrcodeUrl; 
            private String releaseType; 
            private java.util.List<RuleJsonList> ruleJsonList; 
            private Long silentType; 
            private String syncMode; 
            private String syncResult; 
            private Long taskStatus; 
            private String upgradeContent; 
            private Long upgradeType; 
            private Long upgradeValidTime; 
            private java.util.List<Whitelist> whitelist; 
            private String whitelistIds; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.appCode = model.appCode;
                this.appId = model.appId;
                this.appstoreurl = model.appstoreurl;
                this.channelContains = model.channelContains;
                this.channelExcludes = model.channelExcludes;
                this.cityContains = model.cityContains;
                this.cityExcludes = model.cityExcludes;
                this.creator = model.creator;
                this.deviceGreyNum = model.deviceGreyNum;
                this.devicePercent = model.devicePercent;
                this.downloadUrl = model.downloadUrl;
                this.executionOrder = model.executionOrder;
                this.gmtCreateStr = model.gmtCreateStr;
                this.greyConfigInfo = model.greyConfigInfo;
                this.greyEndtimeData = model.greyEndtimeData;
                this.greyNotice = model.greyNotice;
                this.greyNum = model.greyNum;
                this.greyUv = model.greyUv;
                this.id = model.id;
                this.innerVersion = model.innerVersion;
                this.isEnterprise = model.isEnterprise;
                this.isOfficial = model.isOfficial;
                this.isPush = model.isPush;
                this.isRc = model.isRc;
                this.isRelease = model.isRelease;
                this.memo = model.memo;
                this.mobileModelContains = model.mobileModelContains;
                this.mobileModelExcludes = model.mobileModelExcludes;
                this.modifier = model.modifier;
                this.netType = model.netType;
                this.osVersion = model.osVersion;
                this.packageInfoId = model.packageInfoId;
                this.packageType = model.packageType;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productVersion = model.productVersion;
                this.publishMode = model.publishMode;
                this.publishType = model.publishType;
                this.pushContent = model.pushContent;
                this.qrcodeUrl = model.qrcodeUrl;
                this.releaseType = model.releaseType;
                this.ruleJsonList = model.ruleJsonList;
                this.silentType = model.silentType;
                this.syncMode = model.syncMode;
                this.syncResult = model.syncResult;
                this.taskStatus = model.taskStatus;
                this.upgradeContent = model.upgradeContent;
                this.upgradeType = model.upgradeType;
                this.upgradeValidTime = model.upgradeValidTime;
                this.whitelist = model.whitelist;
                this.whitelistIds = model.whitelistIds;
            } 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Appstoreurl.
             */
            public Builder appstoreurl(String appstoreurl) {
                this.appstoreurl = appstoreurl;
                return this;
            }

            /**
             * ChannelContains.
             */
            public Builder channelContains(String channelContains) {
                this.channelContains = channelContains;
                return this;
            }

            /**
             * ChannelExcludes.
             */
            public Builder channelExcludes(String channelExcludes) {
                this.channelExcludes = channelExcludes;
                return this;
            }

            /**
             * CityContains.
             */
            public Builder cityContains(String cityContains) {
                this.cityContains = cityContains;
                return this;
            }

            /**
             * CityExcludes.
             */
            public Builder cityExcludes(String cityExcludes) {
                this.cityExcludes = cityExcludes;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * DeviceGreyNum.
             */
            public Builder deviceGreyNum(Long deviceGreyNum) {
                this.deviceGreyNum = deviceGreyNum;
                return this;
            }

            /**
             * DevicePercent.
             */
            public Builder devicePercent(Long devicePercent) {
                this.devicePercent = devicePercent;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * ExecutionOrder.
             */
            public Builder executionOrder(Long executionOrder) {
                this.executionOrder = executionOrder;
                return this;
            }

            /**
             * GmtCreateStr.
             */
            public Builder gmtCreateStr(String gmtCreateStr) {
                this.gmtCreateStr = gmtCreateStr;
                return this;
            }

            /**
             * GreyConfigInfo.
             */
            public Builder greyConfigInfo(String greyConfigInfo) {
                this.greyConfigInfo = greyConfigInfo;
                return this;
            }

            /**
             * GreyEndtimeData.
             */
            public Builder greyEndtimeData(String greyEndtimeData) {
                this.greyEndtimeData = greyEndtimeData;
                return this;
            }

            /**
             * GreyNotice.
             */
            public Builder greyNotice(Long greyNotice) {
                this.greyNotice = greyNotice;
                return this;
            }

            /**
             * GreyNum.
             */
            public Builder greyNum(Long greyNum) {
                this.greyNum = greyNum;
                return this;
            }

            /**
             * GreyUv.
             */
            public Builder greyUv(Long greyUv) {
                this.greyUv = greyUv;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InnerVersion.
             */
            public Builder innerVersion(String innerVersion) {
                this.innerVersion = innerVersion;
                return this;
            }

            /**
             * IsEnterprise.
             */
            public Builder isEnterprise(Long isEnterprise) {
                this.isEnterprise = isEnterprise;
                return this;
            }

            /**
             * IsOfficial.
             */
            public Builder isOfficial(Long isOfficial) {
                this.isOfficial = isOfficial;
                return this;
            }

            /**
             * IsPush.
             */
            public Builder isPush(Long isPush) {
                this.isPush = isPush;
                return this;
            }

            /**
             * IsRc.
             */
            public Builder isRc(Long isRc) {
                this.isRc = isRc;
                return this;
            }

            /**
             * IsRelease.
             */
            public Builder isRelease(Long isRelease) {
                this.isRelease = isRelease;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * MobileModelContains.
             */
            public Builder mobileModelContains(String mobileModelContains) {
                this.mobileModelContains = mobileModelContains;
                return this;
            }

            /**
             * MobileModelExcludes.
             */
            public Builder mobileModelExcludes(String mobileModelExcludes) {
                this.mobileModelExcludes = mobileModelExcludes;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * PackageInfoId.
             */
            public Builder packageInfoId(Long packageInfoId) {
                this.packageInfoId = packageInfoId;
                return this;
            }

            /**
             * PackageType.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * PublishMode.
             */
            public Builder publishMode(Long publishMode) {
                this.publishMode = publishMode;
                return this;
            }

            /**
             * PublishType.
             */
            public Builder publishType(Long publishType) {
                this.publishType = publishType;
                return this;
            }

            /**
             * PushContent.
             */
            public Builder pushContent(String pushContent) {
                this.pushContent = pushContent;
                return this;
            }

            /**
             * QrcodeUrl.
             */
            public Builder qrcodeUrl(String qrcodeUrl) {
                this.qrcodeUrl = qrcodeUrl;
                return this;
            }

            /**
             * ReleaseType.
             */
            public Builder releaseType(String releaseType) {
                this.releaseType = releaseType;
                return this;
            }

            /**
             * RuleJsonList.
             */
            public Builder ruleJsonList(java.util.List<RuleJsonList> ruleJsonList) {
                this.ruleJsonList = ruleJsonList;
                return this;
            }

            /**
             * SilentType.
             */
            public Builder silentType(Long silentType) {
                this.silentType = silentType;
                return this;
            }

            /**
             * SyncMode.
             */
            public Builder syncMode(String syncMode) {
                this.syncMode = syncMode;
                return this;
            }

            /**
             * SyncResult.
             */
            public Builder syncResult(String syncResult) {
                this.syncResult = syncResult;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Long taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * UpgradeContent.
             */
            public Builder upgradeContent(String upgradeContent) {
                this.upgradeContent = upgradeContent;
                return this;
            }

            /**
             * UpgradeType.
             */
            public Builder upgradeType(Long upgradeType) {
                this.upgradeType = upgradeType;
                return this;
            }

            /**
             * UpgradeValidTime.
             */
            public Builder upgradeValidTime(Long upgradeValidTime) {
                this.upgradeValidTime = upgradeValidTime;
                return this;
            }

            /**
             * Whitelist.
             */
            public Builder whitelist(java.util.List<Whitelist> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            /**
             * WhitelistIds.
             */
            public Builder whitelistIds(String whitelistIds) {
                this.whitelistIds = whitelistIds;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.content = builder.content;
            this.errorCode = builder.errorCode;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Content content; 
            private String errorCode; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.errorCode = model.errorCode;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMdsUpgradeTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMdsUpgradeTaskDetailResponseBody</p>
     */
    public static class ResultContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private Data data;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Data data; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(ResultContent model) {
                this.data = model.data;
                this.requestId = model.requestId;
            } 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
