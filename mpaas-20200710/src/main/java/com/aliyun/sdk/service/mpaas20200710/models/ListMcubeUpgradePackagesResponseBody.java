// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link ListMcubeUpgradePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeUpgradePackagesResponseBody</p>
 */
public class ListMcubeUpgradePackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("ListPackagesResult")
    private ListPackagesResult listPackagesResult;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMcubeUpgradePackagesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.hasMore = builder.hasMore;
        this.listPackagesResult = builder.listPackagesResult;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeUpgradePackagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return listPackagesResult
     */
    public ListPackagesResult getListPackagesResult() {
        return this.listPackagesResult;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Boolean hasMore; 
        private ListPackagesResult listPackagesResult; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListMcubeUpgradePackagesResponseBody model) {
            this.currentPage = model.currentPage;
            this.hasMore = model.hasMore;
            this.listPackagesResult = model.listPackagesResult;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * HasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * ListPackagesResult.
         */
        public Builder listPackagesResult(ListPackagesResult listPackagesResult) {
            this.listPackagesResult = listPackagesResult;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMcubeUpgradePackagesResponseBody build() {
            return new ListMcubeUpgradePackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcubeUpgradePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeUpgradePackagesResponseBody</p>
     */
    public static class Packages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCreateTask")
        private Boolean allowCreateTask;

        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("AppstoreUrl")
        private String appstoreUrl;

        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private String changeLog;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsEnterprise")
        private Integer isEnterprise;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("NeedCheck")
        private Integer needCheck;

        @com.aliyun.core.annotation.NameInMap("PackageType")
        private String packageType;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Integer publishPeriod;

        @com.aliyun.core.annotation.NameInMap("VerificationCode")
        private String verificationCode;

        private Packages(Builder builder) {
            this.allowCreateTask = builder.allowCreateTask;
            this.appCode = builder.appCode;
            this.appstoreUrl = builder.appstoreUrl;
            this.changeLog = builder.changeLog;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isEnterprise = builder.isEnterprise;
            this.md5 = builder.md5;
            this.modifier = builder.modifier;
            this.needCheck = builder.needCheck;
            this.packageType = builder.packageType;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishPeriod = builder.publishPeriod;
            this.verificationCode = builder.verificationCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return allowCreateTask
         */
        public Boolean getAllowCreateTask() {
            return this.allowCreateTask;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return appstoreUrl
         */
        public String getAppstoreUrl() {
            return this.appstoreUrl;
        }

        /**
         * @return changeLog
         */
        public String getChangeLog() {
            return this.changeLog;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isEnterprise
         */
        public Integer getIsEnterprise() {
            return this.isEnterprise;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return needCheck
         */
        public Integer getNeedCheck() {
            return this.needCheck;
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
         * @return publishPeriod
         */
        public Integer getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return verificationCode
         */
        public String getVerificationCode() {
            return this.verificationCode;
        }

        public static final class Builder {
            private Boolean allowCreateTask; 
            private String appCode; 
            private String appstoreUrl; 
            private String changeLog; 
            private String creator; 
            private String downloadUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer isEnterprise; 
            private String md5; 
            private String modifier; 
            private Integer needCheck; 
            private String packageType; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Integer publishPeriod; 
            private String verificationCode; 

            private Builder() {
            } 

            private Builder(Packages model) {
                this.allowCreateTask = model.allowCreateTask;
                this.appCode = model.appCode;
                this.appstoreUrl = model.appstoreUrl;
                this.changeLog = model.changeLog;
                this.creator = model.creator;
                this.downloadUrl = model.downloadUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isEnterprise = model.isEnterprise;
                this.md5 = model.md5;
                this.modifier = model.modifier;
                this.needCheck = model.needCheck;
                this.packageType = model.packageType;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productVersion = model.productVersion;
                this.publishPeriod = model.publishPeriod;
                this.verificationCode = model.verificationCode;
            } 

            /**
             * AllowCreateTask.
             */
            public Builder allowCreateTask(Boolean allowCreateTask) {
                this.allowCreateTask = allowCreateTask;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * AppstoreUrl.
             */
            public Builder appstoreUrl(String appstoreUrl) {
                this.appstoreUrl = appstoreUrl;
                return this;
            }

            /**
             * ChangeLog.
             */
            public Builder changeLog(String changeLog) {
                this.changeLog = changeLog;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsEnterprise.
             */
            public Builder isEnterprise(Integer isEnterprise) {
                this.isEnterprise = isEnterprise;
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
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * NeedCheck.
             */
            public Builder needCheck(Integer needCheck) {
                this.needCheck = needCheck;
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
             * PublishPeriod.
             */
            public Builder publishPeriod(Integer publishPeriod) {
                this.publishPeriod = publishPeriod;
                return this;
            }

            /**
             * VerificationCode.
             */
            public Builder verificationCode(String verificationCode) {
                this.verificationCode = verificationCode;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcubeUpgradePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeUpgradePackagesResponseBody</p>
     */
    public static class ListPackagesResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Packages")
        private java.util.List<Packages> packages;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private ListPackagesResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.packages = builder.packages;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListPackagesResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return packages
         */
        public java.util.List<Packages> getPackages() {
            return this.packages;
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
            private java.util.List<Packages> packages; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(ListPackagesResult model) {
                this.errorCode = model.errorCode;
                this.packages = model.packages;
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
             * Packages.
             */
            public Builder packages(java.util.List<Packages> packages) {
                this.packages = packages;
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

            public ListPackagesResult build() {
                return new ListPackagesResult(this);
            } 

        } 

    }
}
