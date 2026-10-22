// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAppPluginVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppPluginVersionsResponseBody</p>
 */
public class ListAppPluginVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppPluginVersionsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPluginVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppPluginVersionsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The detailed reason for the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the application to query.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-b</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not used and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAppPluginVersionsResponseBody build() {
            return new ListAppPluginVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppPluginVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPluginVersionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Changelog")
        private String changelog;

        @com.aliyun.core.annotation.NameInMap("CommitSha")
        private String commitSha;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Integer fileCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.changelog = builder.changelog;
            this.commitSha = builder.commitSha;
            this.createdBy = builder.createdBy;
            this.fileCount = builder.fileCount;
            this.gmtCreate = builder.gmtCreate;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changelog
         */
        public String getChangelog() {
            return this.changelog;
        }

        /**
         * @return commitSha
         */
        public String getCommitSha() {
            return this.commitSha;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return fileCount
         */
        public Integer getFileCount() {
            return this.fileCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String changelog; 
            private String commitSha; 
            private String createdBy; 
            private Integer fileCount; 
            private String gmtCreate; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changelog = model.changelog;
                this.commitSha = model.commitSha;
                this.createdBy = model.createdBy;
                this.fileCount = model.fileCount;
                this.gmtCreate = model.gmtCreate;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The version changelog.</p>
             * 
             * <strong>example:</strong>
             * <p>x x x</p>
             */
            public Builder changelog(String changelog) {
                this.changelog = changelog;
                return this;
            }

            /**
             * <p>The commit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder commitSha(String commitSha) {
                this.commitSha = commitSha;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>yinr</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The current number of files in the project.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder fileCount(Integer fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-24T02:29:03.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The file status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The application instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>V2.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppPluginVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPluginVersionsResponseBody</p>
     */
    public static class Next extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Changelog")
        private String changelog;

        @com.aliyun.core.annotation.NameInMap("CommitSha")
        private String commitSha;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("FileCount")
        private Integer fileCount;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Next(Builder builder) {
            this.changelog = builder.changelog;
            this.commitSha = builder.commitSha;
            this.createdBy = builder.createdBy;
            this.fileCount = builder.fileCount;
            this.gmtCreate = builder.gmtCreate;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Next create() {
            return builder().build();
        }

        /**
         * @return changelog
         */
        public String getChangelog() {
            return this.changelog;
        }

        /**
         * @return commitSha
         */
        public String getCommitSha() {
            return this.commitSha;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return fileCount
         */
        public Integer getFileCount() {
            return this.fileCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String changelog; 
            private String commitSha; 
            private String createdBy; 
            private Integer fileCount; 
            private String gmtCreate; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Next model) {
                this.changelog = model.changelog;
                this.commitSha = model.commitSha;
                this.createdBy = model.createdBy;
                this.fileCount = model.fileCount;
                this.gmtCreate = model.gmtCreate;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The version changelog.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder changelog(String changelog) {
                this.changelog = changelog;
                return this;
            }

            /**
             * <p>The commit ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder commitSha(String commitSha) {
                this.commitSha = commitSha;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>adminSubuser(264859988988056208)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The current number of files in the project.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder fileCount(Integer fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-17 20:43:21</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The status. Valid values: unknown, init, testing, and online.</p>
             * 
             * <strong>example:</strong>
             * <p>Succeeded</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The application instance version.</p>
             * 
             * <strong>example:</strong>
             * <p>V2.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Next build() {
                return new Next(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppPluginVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPluginVersionsResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Next next;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Boolean nextPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Boolean prePage;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Boolean resultLimit;

        @com.aliyun.core.annotation.NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @com.aliyun.core.annotation.NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.data = builder.data;
            this.next = builder.next;
            this.nextPage = builder.nextPage;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.resultLimit = builder.resultLimit;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Next getNext() {
            return this.next;
        }

        /**
         * @return nextPage
         */
        public Boolean getNextPage() {
            return this.nextPage;
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
        public Boolean getPrePage() {
            return this.prePage;
        }

        /**
         * @return resultLimit
         */
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List<Data> data; 
            private Next next; 
            private Boolean nextPage; 
            private Integer pageSize; 
            private Boolean prePage; 
            private Boolean resultLimit; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currentPageNum = model.currentPageNum;
                this.data = model.data;
                this.next = model.next;
                this.nextPage = model.nextPage;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.resultLimit = model.resultLimit;
                this.totalItemNum = model.totalItemNum;
                this.totalPageNum = model.totalPageNum;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * <p>The request results.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The decision weight.</p>
             */
            public Builder next(Next next) {
                this.next = next;
                return this;
            }

            /**
             * <p>Indicates whether a next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder nextPage(Boolean nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Indicates whether a previous page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder prePage(Boolean prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * <p>In addition to the pagination limit, the server processes a maximum of the latest 1,000 records for the current query. If the number of results exceeds 1,000, <strong>ResultLimit</strong> is <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder resultLimit(Boolean resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
