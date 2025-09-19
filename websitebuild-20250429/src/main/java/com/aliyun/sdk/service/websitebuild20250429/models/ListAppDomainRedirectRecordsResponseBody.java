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
 * {@link ListAppDomainRedirectRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppDomainRedirectRecordsResponseBody</p>
 */
public class ListAppDomainRedirectRecordsResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppDomainRedirectRecordsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppDomainRedirectRecordsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppDomainRedirectRecordsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAppDomainRedirectRecordsResponseBody build() {
            return new ListAppDomainRedirectRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppDomainRedirectRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppDomainRedirectRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("SourceDomain")
        private String sourceDomain;

        @com.aliyun.core.annotation.NameInMap("TargetDomain")
        private String targetDomain;

        private Data(Builder builder) {
            this.recordId = builder.recordId;
            this.sourceDomain = builder.sourceDomain;
            this.targetDomain = builder.targetDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return sourceDomain
         */
        public String getSourceDomain() {
            return this.sourceDomain;
        }

        /**
         * @return targetDomain
         */
        public String getTargetDomain() {
            return this.targetDomain;
        }

        public static final class Builder {
            private String recordId; 
            private String sourceDomain; 
            private String targetDomain; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.recordId = model.recordId;
                this.sourceDomain = model.sourceDomain;
                this.targetDomain = model.targetDomain;
            } 

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * SourceDomain.
             */
            public Builder sourceDomain(String sourceDomain) {
                this.sourceDomain = sourceDomain;
                return this;
            }

            /**
             * TargetDomain.
             */
            public Builder targetDomain(String targetDomain) {
                this.targetDomain = targetDomain;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppDomainRedirectRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppDomainRedirectRecordsResponseBody</p>
     */
    public static class Next extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("SourceDomain")
        private String sourceDomain;

        @com.aliyun.core.annotation.NameInMap("TargetDomain")
        private String targetDomain;

        private Next(Builder builder) {
            this.recordId = builder.recordId;
            this.sourceDomain = builder.sourceDomain;
            this.targetDomain = builder.targetDomain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Next create() {
            return builder().build();
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return sourceDomain
         */
        public String getSourceDomain() {
            return this.sourceDomain;
        }

        /**
         * @return targetDomain
         */
        public String getTargetDomain() {
            return this.targetDomain;
        }

        public static final class Builder {
            private String recordId; 
            private String sourceDomain; 
            private String targetDomain; 

            private Builder() {
            } 

            private Builder(Next model) {
                this.recordId = model.recordId;
                this.sourceDomain = model.sourceDomain;
                this.targetDomain = model.targetDomain;
            } 

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * SourceDomain.
             */
            public Builder sourceDomain(String sourceDomain) {
                this.sourceDomain = sourceDomain;
                return this;
            }

            /**
             * TargetDomain.
             */
            public Builder targetDomain(String targetDomain) {
                this.targetDomain = targetDomain;
                return this;
            }

            public Next build() {
                return new Next(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppDomainRedirectRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppDomainRedirectRecordsResponseBody</p>
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
             * CurrentPageNum.
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Next.
             */
            public Builder next(Next next) {
                this.next = next;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(Boolean nextPage) {
                this.nextPage = nextPage;
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
            public Builder prePage(Boolean prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * ResultLimit.
             */
            public Builder resultLimit(Boolean resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * TotalItemNum.
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * TotalPageNum.
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
