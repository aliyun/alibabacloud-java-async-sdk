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
 * {@link ListMdsCubeResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMdsCubeResourcesResponseBody</p>
 */
public class ListMdsCubeResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultContent")
    private ResultContent resultContent;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMdsCubeResourcesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMdsCubeResourcesResponseBody create() {
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

        private Builder(ListMdsCubeResourcesResponseBody model) {
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

        public ListMdsCubeResourcesResponseBody build() {
            return new ListMdsCubeResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMdsCubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeResourcesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidMaxVersion")
        private String androidMaxVersion;

        @com.aliyun.core.annotation.NameInMap("AndroidMinVersion")
        private String androidMinVersion;

        @com.aliyun.core.annotation.NameInMap("AppCode")
        private String appCode;

        @com.aliyun.core.annotation.NameInMap("BinFileMd5")
        private String binFileMd5;

        @com.aliyun.core.annotation.NameInMap("BinPrivateFileUrl")
        private String binPrivateFileUrl;

        @com.aliyun.core.annotation.NameInMap("BinPublicFileUrl")
        private String binPublicFileUrl;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IosMaxVersion")
        private String iosMaxVersion;

        @com.aliyun.core.annotation.NameInMap("IosMinVersion")
        private String iosMinVersion;

        @com.aliyun.core.annotation.NameInMap("JsonPrivateFileUrl")
        private String jsonPrivateFileUrl;

        @com.aliyun.core.annotation.NameInMap("JsonPublicFileUrl")
        private String jsonPublicFileUrl;

        @com.aliyun.core.annotation.NameInMap("MinCubeSdkVersion")
        private String minCubeSdkVersion;

        @com.aliyun.core.annotation.NameInMap("MockDataDownloadUrl")
        private String mockDataDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("PreviewPictureUrl")
        private String previewPictureUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private Long resourceStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateResourceDesc")
        private String templateResourceDesc;

        @com.aliyun.core.annotation.NameInMap("TemplateResourceVersion")
        private String templateResourceVersion;

        private List(Builder builder) {
            this.androidMaxVersion = builder.androidMaxVersion;
            this.androidMinVersion = builder.androidMinVersion;
            this.appCode = builder.appCode;
            this.binFileMd5 = builder.binFileMd5;
            this.binPrivateFileUrl = builder.binPrivateFileUrl;
            this.binPublicFileUrl = builder.binPublicFileUrl;
            this.extendInfo = builder.extendInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.iosMaxVersion = builder.iosMaxVersion;
            this.iosMinVersion = builder.iosMinVersion;
            this.jsonPrivateFileUrl = builder.jsonPrivateFileUrl;
            this.jsonPublicFileUrl = builder.jsonPublicFileUrl;
            this.minCubeSdkVersion = builder.minCubeSdkVersion;
            this.mockDataDownloadUrl = builder.mockDataDownloadUrl;
            this.operator = builder.operator;
            this.platform = builder.platform;
            this.previewPictureUrl = builder.previewPictureUrl;
            this.resourceStatus = builder.resourceStatus;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateResourceDesc = builder.templateResourceDesc;
            this.templateResourceVersion = builder.templateResourceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return androidMaxVersion
         */
        public String getAndroidMaxVersion() {
            return this.androidMaxVersion;
        }

        /**
         * @return androidMinVersion
         */
        public String getAndroidMinVersion() {
            return this.androidMinVersion;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return binFileMd5
         */
        public String getBinFileMd5() {
            return this.binFileMd5;
        }

        /**
         * @return binPrivateFileUrl
         */
        public String getBinPrivateFileUrl() {
            return this.binPrivateFileUrl;
        }

        /**
         * @return binPublicFileUrl
         */
        public String getBinPublicFileUrl() {
            return this.binPublicFileUrl;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
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
         * @return iosMaxVersion
         */
        public String getIosMaxVersion() {
            return this.iosMaxVersion;
        }

        /**
         * @return iosMinVersion
         */
        public String getIosMinVersion() {
            return this.iosMinVersion;
        }

        /**
         * @return jsonPrivateFileUrl
         */
        public String getJsonPrivateFileUrl() {
            return this.jsonPrivateFileUrl;
        }

        /**
         * @return jsonPublicFileUrl
         */
        public String getJsonPublicFileUrl() {
            return this.jsonPublicFileUrl;
        }

        /**
         * @return minCubeSdkVersion
         */
        public String getMinCubeSdkVersion() {
            return this.minCubeSdkVersion;
        }

        /**
         * @return mockDataDownloadUrl
         */
        public String getMockDataDownloadUrl() {
            return this.mockDataDownloadUrl;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return previewPictureUrl
         */
        public String getPreviewPictureUrl() {
            return this.previewPictureUrl;
        }

        /**
         * @return resourceStatus
         */
        public Long getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateResourceDesc
         */
        public String getTemplateResourceDesc() {
            return this.templateResourceDesc;
        }

        /**
         * @return templateResourceVersion
         */
        public String getTemplateResourceVersion() {
            return this.templateResourceVersion;
        }

        public static final class Builder {
            private String androidMaxVersion; 
            private String androidMinVersion; 
            private String appCode; 
            private String binFileMd5; 
            private String binPrivateFileUrl; 
            private String binPublicFileUrl; 
            private String extendInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String iosMaxVersion; 
            private String iosMinVersion; 
            private String jsonPrivateFileUrl; 
            private String jsonPublicFileUrl; 
            private String minCubeSdkVersion; 
            private String mockDataDownloadUrl; 
            private String operator; 
            private String platform; 
            private String previewPictureUrl; 
            private Long resourceStatus; 
            private Integer status; 
            private String templateId; 
            private String templateResourceDesc; 
            private String templateResourceVersion; 

            private Builder() {
            } 

            private Builder(List model) {
                this.androidMaxVersion = model.androidMaxVersion;
                this.androidMinVersion = model.androidMinVersion;
                this.appCode = model.appCode;
                this.binFileMd5 = model.binFileMd5;
                this.binPrivateFileUrl = model.binPrivateFileUrl;
                this.binPublicFileUrl = model.binPublicFileUrl;
                this.extendInfo = model.extendInfo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.iosMaxVersion = model.iosMaxVersion;
                this.iosMinVersion = model.iosMinVersion;
                this.jsonPrivateFileUrl = model.jsonPrivateFileUrl;
                this.jsonPublicFileUrl = model.jsonPublicFileUrl;
                this.minCubeSdkVersion = model.minCubeSdkVersion;
                this.mockDataDownloadUrl = model.mockDataDownloadUrl;
                this.operator = model.operator;
                this.platform = model.platform;
                this.previewPictureUrl = model.previewPictureUrl;
                this.resourceStatus = model.resourceStatus;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateResourceDesc = model.templateResourceDesc;
                this.templateResourceVersion = model.templateResourceVersion;
            } 

            /**
             * AndroidMaxVersion.
             */
            public Builder androidMaxVersion(String androidMaxVersion) {
                this.androidMaxVersion = androidMaxVersion;
                return this;
            }

            /**
             * AndroidMinVersion.
             */
            public Builder androidMinVersion(String androidMinVersion) {
                this.androidMinVersion = androidMinVersion;
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
             * BinFileMd5.
             */
            public Builder binFileMd5(String binFileMd5) {
                this.binFileMd5 = binFileMd5;
                return this;
            }

            /**
             * BinPrivateFileUrl.
             */
            public Builder binPrivateFileUrl(String binPrivateFileUrl) {
                this.binPrivateFileUrl = binPrivateFileUrl;
                return this;
            }

            /**
             * BinPublicFileUrl.
             */
            public Builder binPublicFileUrl(String binPublicFileUrl) {
                this.binPublicFileUrl = binPublicFileUrl;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
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
             * IosMaxVersion.
             */
            public Builder iosMaxVersion(String iosMaxVersion) {
                this.iosMaxVersion = iosMaxVersion;
                return this;
            }

            /**
             * IosMinVersion.
             */
            public Builder iosMinVersion(String iosMinVersion) {
                this.iosMinVersion = iosMinVersion;
                return this;
            }

            /**
             * JsonPrivateFileUrl.
             */
            public Builder jsonPrivateFileUrl(String jsonPrivateFileUrl) {
                this.jsonPrivateFileUrl = jsonPrivateFileUrl;
                return this;
            }

            /**
             * JsonPublicFileUrl.
             */
            public Builder jsonPublicFileUrl(String jsonPublicFileUrl) {
                this.jsonPublicFileUrl = jsonPublicFileUrl;
                return this;
            }

            /**
             * MinCubeSdkVersion.
             */
            public Builder minCubeSdkVersion(String minCubeSdkVersion) {
                this.minCubeSdkVersion = minCubeSdkVersion;
                return this;
            }

            /**
             * MockDataDownloadUrl.
             */
            public Builder mockDataDownloadUrl(String mockDataDownloadUrl) {
                this.mockDataDownloadUrl = mockDataDownloadUrl;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * PreviewPictureUrl.
             */
            public Builder previewPictureUrl(String previewPictureUrl) {
                this.previewPictureUrl = previewPictureUrl;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(Long resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateResourceDesc.
             */
            public Builder templateResourceDesc(String templateResourceDesc) {
                this.templateResourceDesc = templateResourceDesc;
                return this;
            }

            /**
             * TemplateResourceVersion.
             */
            public Builder templateResourceVersion(String templateResourceVersion) {
                this.templateResourceVersion = templateResourceVersion;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeResourcesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentMaxAndroidVersion")
        private String currentMaxAndroidVersion;

        @com.aliyun.core.annotation.NameInMap("CurrentMaxIosVersion")
        private String currentMaxIosVersion;

        @com.aliyun.core.annotation.NameInMap("FirstPage")
        private Boolean firstPage;

        @com.aliyun.core.annotation.NameInMap("FirstResult")
        private Long firstResult;

        @com.aliyun.core.annotation.NameInMap("LastPage")
        private Boolean lastPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Long nextPage;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Long prePage;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Content(Builder builder) {
            this.currentMaxAndroidVersion = builder.currentMaxAndroidVersion;
            this.currentMaxIosVersion = builder.currentMaxIosVersion;
            this.firstPage = builder.firstPage;
            this.firstResult = builder.firstResult;
            this.lastPage = builder.lastPage;
            this.list = builder.list;
            this.nextPage = builder.nextPage;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return currentMaxAndroidVersion
         */
        public String getCurrentMaxAndroidVersion() {
            return this.currentMaxAndroidVersion;
        }

        /**
         * @return currentMaxIosVersion
         */
        public String getCurrentMaxIosVersion() {
            return this.currentMaxIosVersion;
        }

        /**
         * @return firstPage
         */
        public Boolean getFirstPage() {
            return this.firstPage;
        }

        /**
         * @return firstResult
         */
        public Long getFirstResult() {
            return this.firstResult;
        }

        /**
         * @return lastPage
         */
        public Boolean getLastPage() {
            return this.lastPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return nextPage
         */
        public Long getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return prePage
         */
        public Long getPrePage() {
            return this.prePage;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String currentMaxAndroidVersion; 
            private String currentMaxIosVersion; 
            private Boolean firstPage; 
            private Long firstResult; 
            private Boolean lastPage; 
            private java.util.List<List> list; 
            private Long nextPage; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long prePage; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.currentMaxAndroidVersion = model.currentMaxAndroidVersion;
                this.currentMaxIosVersion = model.currentMaxIosVersion;
                this.firstPage = model.firstPage;
                this.firstResult = model.firstResult;
                this.lastPage = model.lastPage;
                this.list = model.list;
                this.nextPage = model.nextPage;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.totalCount = model.totalCount;
            } 

            /**
             * CurrentMaxAndroidVersion.
             */
            public Builder currentMaxAndroidVersion(String currentMaxAndroidVersion) {
                this.currentMaxAndroidVersion = currentMaxAndroidVersion;
                return this;
            }

            /**
             * CurrentMaxIosVersion.
             */
            public Builder currentMaxIosVersion(String currentMaxIosVersion) {
                this.currentMaxIosVersion = currentMaxIosVersion;
                return this;
            }

            /**
             * FirstPage.
             */
            public Builder firstPage(Boolean firstPage) {
                this.firstPage = firstPage;
                return this;
            }

            /**
             * FirstResult.
             */
            public Builder firstResult(Long firstResult) {
                this.firstResult = firstResult;
                return this;
            }

            /**
             * LastPage.
             */
            public Builder lastPage(Boolean lastPage) {
                this.lastPage = lastPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(Long nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * PrePage.
             */
            public Builder prePage(Long prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMdsCubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeResourcesResponseBody</p>
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
     * {@link ListMdsCubeResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListMdsCubeResourcesResponseBody</p>
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
