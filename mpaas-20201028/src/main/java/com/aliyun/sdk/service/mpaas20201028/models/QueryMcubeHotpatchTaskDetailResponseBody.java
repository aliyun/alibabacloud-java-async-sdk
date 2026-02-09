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
 * {@link QueryMcubeHotpatchTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMcubeHotpatchTaskDetailResponseBody</p>
 */
public class QueryMcubeHotpatchTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryHotpatchTaskDetailResult")
    private QueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private QueryMcubeHotpatchTaskDetailResponseBody(Builder builder) {
        this.queryHotpatchTaskDetailResult = builder.queryHotpatchTaskDetailResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMcubeHotpatchTaskDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryHotpatchTaskDetailResult
     */
    public QueryHotpatchTaskDetailResult getQueryHotpatchTaskDetailResult() {
        return this.queryHotpatchTaskDetailResult;
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
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private QueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(QueryMcubeHotpatchTaskDetailResponseBody model) {
            this.queryHotpatchTaskDetailResult = model.queryHotpatchTaskDetailResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * QueryHotpatchTaskDetailResult.
         */
        public Builder queryHotpatchTaskDetailResult(QueryHotpatchTaskDetailResult queryHotpatchTaskDetailResult) {
            this.queryHotpatchTaskDetailResult = queryHotpatchTaskDetailResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public QueryMcubeHotpatchTaskDetailResponseBody build() {
            return new QueryMcubeHotpatchTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMcubeHotpatchTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMcubeHotpatchTaskDetailResponseBody</p>
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
     * {@link QueryMcubeHotpatchTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMcubeHotpatchTaskDetailResponseBody</p>
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
     * {@link QueryMcubeHotpatchTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMcubeHotpatchTaskDetailResponseBody</p>
     */
    public static class HotpatchTaskDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("BaseInfoId")
        private Long baseInfoId;

        @com.aliyun.core.annotation.NameInMap("Bundles")
        private java.util.List<String> bundles;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedStr")
        private String gmtModifiedStr;

        @com.aliyun.core.annotation.NameInMap("GreyConfigInfo")
        private String greyConfigInfo;

        @com.aliyun.core.annotation.NameInMap("GreyEndtimeData")
        private String greyEndtimeData;

        @com.aliyun.core.annotation.NameInMap("GreyNum")
        private Long greyNum;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private Long packageId;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishMode")
        private Long publishMode;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Long publishPeriod;

        @com.aliyun.core.annotation.NameInMap("PublishType")
        private Long publishType;

        @com.aliyun.core.annotation.NameInMap("QuickRollback")
        private Long quickRollback;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("RuleJsonList")
        private java.util.List<RuleJsonList> ruleJsonList;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Long taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskVersion")
        private Long taskVersion;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<Whitelist> whitelist;

        @com.aliyun.core.annotation.NameInMap("WhitelistIds")
        private String whitelistIds;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private HotpatchTaskDetail(Builder builder) {
            this.appCode = builder.appCode;
            this.appId = builder.appId;
            this.baseInfoId = builder.baseInfoId;
            this.bundles = builder.bundles;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.fileSize = builder.fileSize;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.gmtModifiedStr = builder.gmtModifiedStr;
            this.greyConfigInfo = builder.greyConfigInfo;
            this.greyEndtimeData = builder.greyEndtimeData;
            this.greyNum = builder.greyNum;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.packageId = builder.packageId;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishMode = builder.publishMode;
            this.publishPeriod = builder.publishPeriod;
            this.publishType = builder.publishType;
            this.quickRollback = builder.quickRollback;
            this.releaseVersion = builder.releaseVersion;
            this.ruleJsonList = builder.ruleJsonList;
            this.sourceName = builder.sourceName;
            this.taskStatus = builder.taskStatus;
            this.taskVersion = builder.taskVersion;
            this.whitelist = builder.whitelist;
            this.whitelistIds = builder.whitelistIds;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotpatchTaskDetail create() {
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
         * @return baseInfoId
         */
        public Long getBaseInfoId() {
            return this.baseInfoId;
        }

        /**
         * @return bundles
         */
        public java.util.List<String> getBundles() {
            return this.bundles;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtModifiedStr
         */
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
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
         * @return greyNum
         */
        public Long getGreyNum() {
            return this.greyNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return packageId
         */
        public Long getPackageId() {
            return this.packageId;
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
         * @return publishPeriod
         */
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return publishType
         */
        public Long getPublishType() {
            return this.publishType;
        }

        /**
         * @return quickRollback
         */
        public Long getQuickRollback() {
            return this.quickRollback;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return ruleJsonList
         */
        public java.util.List<RuleJsonList> getRuleJsonList() {
            return this.ruleJsonList;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return taskStatus
         */
        public Long getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskVersion
         */
        public Long getTaskVersion() {
            return this.taskVersion;
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

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String appCode; 
            private String appId; 
            private Long baseInfoId; 
            private java.util.List<String> bundles; 
            private String creator; 
            private String downloadUrl; 
            private String fileSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private String gmtModifiedStr; 
            private String greyConfigInfo; 
            private String greyEndtimeData; 
            private Long greyNum; 
            private Long id; 
            private String md5; 
            private String memo; 
            private String modifier; 
            private Long packageId; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Long publishMode; 
            private Long publishPeriod; 
            private Long publishType; 
            private Long quickRollback; 
            private String releaseVersion; 
            private java.util.List<RuleJsonList> ruleJsonList; 
            private String sourceName; 
            private Long taskStatus; 
            private Long taskVersion; 
            private java.util.List<Whitelist> whitelist; 
            private String whitelistIds; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(HotpatchTaskDetail model) {
                this.appCode = model.appCode;
                this.appId = model.appId;
                this.baseInfoId = model.baseInfoId;
                this.bundles = model.bundles;
                this.creator = model.creator;
                this.downloadUrl = model.downloadUrl;
                this.fileSize = model.fileSize;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.gmtModifiedStr = model.gmtModifiedStr;
                this.greyConfigInfo = model.greyConfigInfo;
                this.greyEndtimeData = model.greyEndtimeData;
                this.greyNum = model.greyNum;
                this.id = model.id;
                this.md5 = model.md5;
                this.memo = model.memo;
                this.modifier = model.modifier;
                this.packageId = model.packageId;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productVersion = model.productVersion;
                this.publishMode = model.publishMode;
                this.publishPeriod = model.publishPeriod;
                this.publishType = model.publishType;
                this.quickRollback = model.quickRollback;
                this.releaseVersion = model.releaseVersion;
                this.ruleJsonList = model.ruleJsonList;
                this.sourceName = model.sourceName;
                this.taskStatus = model.taskStatus;
                this.taskVersion = model.taskVersion;
                this.whitelist = model.whitelist;
                this.whitelistIds = model.whitelistIds;
                this.workspaceId = model.workspaceId;
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
             * BaseInfoId.
             */
            public Builder baseInfoId(Long baseInfoId) {
                this.baseInfoId = baseInfoId;
                return this;
            }

            /**
             * Bundles.
             */
            public Builder bundles(java.util.List<String> bundles) {
                this.bundles = bundles;
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
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
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
             * GmtModifiedStr.
             */
            public Builder gmtModifiedStr(String gmtModifiedStr) {
                this.gmtModifiedStr = gmtModifiedStr;
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
             * GreyNum.
             */
            public Builder greyNum(Long greyNum) {
                this.greyNum = greyNum;
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
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
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
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(Long packageId) {
                this.packageId = packageId;
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
             * PublishPeriod.
             */
            public Builder publishPeriod(Long publishPeriod) {
                this.publishPeriod = publishPeriod;
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
             * QuickRollback.
             */
            public Builder quickRollback(Long quickRollback) {
                this.quickRollback = quickRollback;
                return this;
            }

            /**
             * ReleaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
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
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
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
             * TaskVersion.
             */
            public Builder taskVersion(Long taskVersion) {
                this.taskVersion = taskVersion;
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

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public HotpatchTaskDetail build() {
                return new HotpatchTaskDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMcubeHotpatchTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMcubeHotpatchTaskDetailResponseBody</p>
     */
    public static class QueryHotpatchTaskDetailResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HotpatchTaskDetail")
        private HotpatchTaskDetail hotpatchTaskDetail;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private QueryHotpatchTaskDetailResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.hotpatchTaskDetail = builder.hotpatchTaskDetail;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryHotpatchTaskDetailResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hotpatchTaskDetail
         */
        public HotpatchTaskDetail getHotpatchTaskDetail() {
            return this.hotpatchTaskDetail;
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
            private String errorCode; 
            private HotpatchTaskDetail hotpatchTaskDetail; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(QueryHotpatchTaskDetailResult model) {
                this.errorCode = model.errorCode;
                this.hotpatchTaskDetail = model.hotpatchTaskDetail;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * HotpatchTaskDetail.
             */
            public Builder hotpatchTaskDetail(HotpatchTaskDetail hotpatchTaskDetail) {
                this.hotpatchTaskDetail = hotpatchTaskDetail;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>61B9F63C-4E6F-5D8E-A694-899450987B48</p>
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

            public QueryHotpatchTaskDetailResult build() {
                return new QueryHotpatchTaskDetailResult(this);
            } 

        } 

    }
}
