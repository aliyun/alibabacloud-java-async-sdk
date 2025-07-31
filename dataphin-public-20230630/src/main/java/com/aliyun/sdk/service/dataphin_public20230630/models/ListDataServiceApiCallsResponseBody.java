// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListDataServiceApiCallsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiCallsResponseBody</p>
 */
public class ListDataServiceApiCallsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataServiceApiCallsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiCallsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataServiceApiCallsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServiceApiCallsResponseBody build() {
            return new ListDataServiceApiCallsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiCallsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiCallsResponseBody</p>
     */
    public static class CallLogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("BizCodeDescription")
        private String bizCodeDescription;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Integer costTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Env")
        private Integer env;

        @com.aliyun.core.annotation.NameInMap("ExecuteCostTime")
        private Integer executeCostTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteMode")
        private Integer executeMode;

        @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
        private String httpStatusCode;

        @com.aliyun.core.annotation.NameInMap("HttpStatusDescription")
        private String httpStatusDescription;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RequestParameter")
        private String requestParameter;

        @com.aliyun.core.annotation.NameInMap("RequestSize")
        private Integer requestSize;

        @com.aliyun.core.annotation.NameInMap("ResponseParameter")
        private String responseParameter;

        @com.aliyun.core.annotation.NameInMap("ResponseSize")
        private Integer responseSize;

        @com.aliyun.core.annotation.NameInMap("ResultCount")
        private Integer resultCount;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Successful")
        private Boolean successful;

        private CallLogList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.bizCode = builder.bizCode;
            this.bizCodeDescription = builder.bizCodeDescription;
            this.clientIp = builder.clientIp;
            this.costTime = builder.costTime;
            this.endTime = builder.endTime;
            this.env = builder.env;
            this.executeCostTime = builder.executeCostTime;
            this.executeMode = builder.executeMode;
            this.httpStatusCode = builder.httpStatusCode;
            this.httpStatusDescription = builder.httpStatusDescription;
            this.jobId = builder.jobId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.requestId = builder.requestId;
            this.requestParameter = builder.requestParameter;
            this.requestSize = builder.requestSize;
            this.responseParameter = builder.responseParameter;
            this.responseSize = builder.responseSize;
            this.resultCount = builder.resultCount;
            this.sql = builder.sql;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.successful = builder.successful;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallLogList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return bizCodeDescription
         */
        public String getBizCodeDescription() {
            return this.bizCodeDescription;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return costTime
         */
        public Integer getCostTime() {
            return this.costTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return env
         */
        public Integer getEnv() {
            return this.env;
        }

        /**
         * @return executeCostTime
         */
        public Integer getExecuteCostTime() {
            return this.executeCostTime;
        }

        /**
         * @return executeMode
         */
        public Integer getExecuteMode() {
            return this.executeMode;
        }

        /**
         * @return httpStatusCode
         */
        public String getHttpStatusCode() {
            return this.httpStatusCode;
        }

        /**
         * @return httpStatusDescription
         */
        public String getHttpStatusDescription() {
            return this.httpStatusDescription;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return requestParameter
         */
        public String getRequestParameter() {
            return this.requestParameter;
        }

        /**
         * @return requestSize
         */
        public Integer getRequestSize() {
            return this.requestSize;
        }

        /**
         * @return responseParameter
         */
        public String getResponseParameter() {
            return this.responseParameter;
        }

        /**
         * @return responseSize
         */
        public Integer getResponseSize() {
            return this.responseSize;
        }

        /**
         * @return resultCount
         */
        public Integer getResultCount() {
            return this.resultCount;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successful
         */
        public Boolean getSuccessful() {
            return this.successful;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private Long appKey; 
            private String appName; 
            private String bizCode; 
            private String bizCodeDescription; 
            private String clientIp; 
            private Integer costTime; 
            private String endTime; 
            private Integer env; 
            private Integer executeCostTime; 
            private Integer executeMode; 
            private String httpStatusCode; 
            private String httpStatusDescription; 
            private String jobId; 
            private Integer projectId; 
            private String projectName; 
            private String requestId; 
            private String requestParameter; 
            private Integer requestSize; 
            private String responseParameter; 
            private Integer responseSize; 
            private Integer resultCount; 
            private String sql; 
            private String startTime; 
            private Integer status; 
            private Boolean successful; 

            private Builder() {
            } 

            private Builder(CallLogList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.bizCode = model.bizCode;
                this.bizCodeDescription = model.bizCodeDescription;
                this.clientIp = model.clientIp;
                this.costTime = model.costTime;
                this.endTime = model.endTime;
                this.env = model.env;
                this.executeCostTime = model.executeCostTime;
                this.executeMode = model.executeMode;
                this.httpStatusCode = model.httpStatusCode;
                this.httpStatusDescription = model.httpStatusDescription;
                this.jobId = model.jobId;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.requestId = model.requestId;
                this.requestParameter = model.requestParameter;
                this.requestSize = model.requestSize;
                this.responseParameter = model.responseParameter;
                this.responseSize = model.responseSize;
                this.resultCount = model.resultCount;
                this.sql = model.sql;
                this.startTime = model.startTime;
                this.status = model.status;
                this.successful = model.successful;
            } 

            /**
             * ApiId.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * AppKey.
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
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
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * BizCodeDescription.
             */
            public Builder bizCodeDescription(String bizCodeDescription) {
                this.bizCodeDescription = bizCodeDescription;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * CostTime.
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(Integer env) {
                this.env = env;
                return this;
            }

            /**
             * ExecuteCostTime.
             */
            public Builder executeCostTime(Integer executeCostTime) {
                this.executeCostTime = executeCostTime;
                return this;
            }

            /**
             * ExecuteMode.
             */
            public Builder executeMode(Integer executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * HttpStatusCode.
             */
            public Builder httpStatusCode(String httpStatusCode) {
                this.httpStatusCode = httpStatusCode;
                return this;
            }

            /**
             * HttpStatusDescription.
             */
            public Builder httpStatusDescription(String httpStatusDescription) {
                this.httpStatusDescription = httpStatusDescription;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * RequestParameter.
             */
            public Builder requestParameter(String requestParameter) {
                this.requestParameter = requestParameter;
                return this;
            }

            /**
             * RequestSize.
             */
            public Builder requestSize(Integer requestSize) {
                this.requestSize = requestSize;
                return this;
            }

            /**
             * ResponseParameter.
             */
            public Builder responseParameter(String responseParameter) {
                this.responseParameter = responseParameter;
                return this;
            }

            /**
             * ResponseSize.
             */
            public Builder responseSize(Integer responseSize) {
                this.responseSize = responseSize;
                return this;
            }

            /**
             * ResultCount.
             */
            public Builder resultCount(Integer resultCount) {
                this.resultCount = resultCount;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
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
             * Successful.
             */
            public Builder successful(Boolean successful) {
                this.successful = successful;
                return this;
            }

            public CallLogList build() {
                return new CallLogList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceApiCallsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiCallsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallLogList")
        private java.util.List<CallLogList> callLogList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.callLogList = builder.callLogList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return callLogList
         */
        public java.util.List<CallLogList> getCallLogList() {
            return this.callLogList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CallLogList> callLogList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.callLogList = model.callLogList;
                this.totalCount = model.totalCount;
            } 

            /**
             * CallLogList.
             */
            public Builder callLogList(java.util.List<CallLogList> callLogList) {
                this.callLogList = callLogList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
