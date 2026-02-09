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
 * {@link ListMcubeHotpatchResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMcubeHotpatchResourcesResponseBody</p>
 */
public class ListMcubeHotpatchResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListHotpatchResourceResult")
    private ListHotpatchResourceResult listHotpatchResourceResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMcubeHotpatchResourcesResponseBody(Builder builder) {
        this.listHotpatchResourceResult = builder.listHotpatchResourceResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMcubeHotpatchResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listHotpatchResourceResult
     */
    public ListHotpatchResourceResult getListHotpatchResourceResult() {
        return this.listHotpatchResourceResult;
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
        private ListHotpatchResourceResult listHotpatchResourceResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        private Builder() {
        } 

        private Builder(ListMcubeHotpatchResourcesResponseBody model) {
            this.listHotpatchResourceResult = model.listHotpatchResourceResult;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMessage = model.resultMessage;
        } 

        /**
         * ListHotpatchResourceResult.
         */
        public Builder listHotpatchResourceResult(ListHotpatchResourceResult listHotpatchResourceResult) {
            this.listHotpatchResourceResult = listHotpatchResourceResult;
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

        public ListMcubeHotpatchResourcesResponseBody build() {
            return new ListMcubeHotpatchResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMcubeHotpatchResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeHotpatchResourcesResponseBody</p>
     */
    public static class HotpatchResourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

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

        @com.aliyun.core.annotation.NameInMap("HotpatchVersion")
        private String hotpatchVersion;

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

        @com.aliyun.core.annotation.NameInMap("PublishPeriod")
        private Long publishPeriod;

        @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        private HotpatchResourceInfo(Builder builder) {
            this.appCode = builder.appCode;
            this.creator = builder.creator;
            this.downloadUrl = builder.downloadUrl;
            this.fileSize = builder.fileSize;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hotpatchVersion = builder.hotpatchVersion;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.memo = builder.memo;
            this.modifier = builder.modifier;
            this.packageId = builder.packageId;
            this.platform = builder.platform;
            this.productId = builder.productId;
            this.productVersion = builder.productVersion;
            this.publishPeriod = builder.publishPeriod;
            this.releaseVersion = builder.releaseVersion;
            this.sourceName = builder.sourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotpatchResourceInfo create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
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
         * @return hotpatchVersion
         */
        public String getHotpatchVersion() {
            return this.hotpatchVersion;
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
         * @return publishPeriod
         */
        public Long getPublishPeriod() {
            return this.publishPeriod;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        public static final class Builder {
            private String appCode; 
            private String creator; 
            private String downloadUrl; 
            private String fileSize; 
            private String gmtCreate; 
            private String gmtModified; 
            private String hotpatchVersion; 
            private Long id; 
            private String md5; 
            private String memo; 
            private String modifier; 
            private Long packageId; 
            private String platform; 
            private String productId; 
            private String productVersion; 
            private Long publishPeriod; 
            private String releaseVersion; 
            private String sourceName; 

            private Builder() {
            } 

            private Builder(HotpatchResourceInfo model) {
                this.appCode = model.appCode;
                this.creator = model.creator;
                this.downloadUrl = model.downloadUrl;
                this.fileSize = model.fileSize;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.hotpatchVersion = model.hotpatchVersion;
                this.id = model.id;
                this.md5 = model.md5;
                this.memo = model.memo;
                this.modifier = model.modifier;
                this.packageId = model.packageId;
                this.platform = model.platform;
                this.productId = model.productId;
                this.productVersion = model.productVersion;
                this.publishPeriod = model.publishPeriod;
                this.releaseVersion = model.releaseVersion;
                this.sourceName = model.sourceName;
            } 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
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
             * HotpatchVersion.
             */
            public Builder hotpatchVersion(String hotpatchVersion) {
                this.hotpatchVersion = hotpatchVersion;
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
             * PublishPeriod.
             */
            public Builder publishPeriod(Long publishPeriod) {
                this.publishPeriod = publishPeriod;
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
             * SourceName.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            public HotpatchResourceInfo build() {
                return new HotpatchResourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMcubeHotpatchResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMcubeHotpatchResourcesResponseBody</p>
     */
    public static class ListHotpatchResourceResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("HotpatchResourceInfo")
        private java.util.List<HotpatchResourceInfo> hotpatchResourceInfo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ListHotpatchResourceResult(Builder builder) {
            this.currentPage = builder.currentPage;
            this.errorCode = builder.errorCode;
            this.hasMore = builder.hasMore;
            this.hotpatchResourceInfo = builder.hotpatchResourceInfo;
            this.pageSize = builder.pageSize;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListHotpatchResourceResult create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return hotpatchResourceInfo
         */
        public java.util.List<HotpatchResourceInfo> getHotpatchResourceInfo() {
            return this.hotpatchResourceInfo;
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

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private String errorCode; 
            private Boolean hasMore; 
            private java.util.List<HotpatchResourceInfo> hotpatchResourceInfo; 
            private Integer pageSize; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ListHotpatchResourceResult model) {
                this.currentPage = model.currentPage;
                this.errorCode = model.errorCode;
                this.hasMore = model.hasMore;
                this.hotpatchResourceInfo = model.hotpatchResourceInfo;
                this.pageSize = model.pageSize;
                this.requestId = model.requestId;
                this.resultMsg = model.resultMsg;
                this.success = model.success;
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * HotpatchResourceInfo.
             */
            public Builder hotpatchResourceInfo(java.util.List<HotpatchResourceInfo> hotpatchResourceInfo) {
                this.hotpatchResourceInfo = hotpatchResourceInfo;
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

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListHotpatchResourceResult build() {
                return new ListHotpatchResourceResult(this);
            } 

        } 

    }
}
