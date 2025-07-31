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
 * {@link ListDataServiceApiCallStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiCallStatisticsResponseBody</p>
 */
public class ListDataServiceApiCallStatisticsResponseBody extends TeaModel {
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

    private ListDataServiceApiCallStatisticsResponseBody(Builder builder) {
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

    public static ListDataServiceApiCallStatisticsResponseBody create() {
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

        private Builder(ListDataServiceApiCallStatisticsResponseBody model) {
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

        public ListDataServiceApiCallStatisticsResponseBody build() {
            return new ListDataServiceApiCallStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServiceApiCallStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiCallStatisticsResponseBody</p>
     */
    public static class CallStatisticsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppNameList")
        private java.util.List<String> appNameList;

        @com.aliyun.core.annotation.NameInMap("AuthorizedAppCount")
        private Integer authorizedAppCount;

        @com.aliyun.core.annotation.NameInMap("AvgResponseTime")
        private Double avgResponseTime;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Long callCount;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private String errorCount;

        @com.aliyun.core.annotation.NameInMap("ErrorRate")
        private String errorRate;

        @com.aliyun.core.annotation.NameInMap("LastCallTime")
        private String lastCallTime;

        @com.aliyun.core.annotation.NameInMap("OfflineRate")
        private String offlineRate;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SqlId")
        private Integer sqlId;

        private CallStatisticsList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appNameList = builder.appNameList;
            this.authorizedAppCount = builder.authorizedAppCount;
            this.avgResponseTime = builder.avgResponseTime;
            this.callCount = builder.callCount;
            this.creator = builder.creator;
            this.errorCount = builder.errorCount;
            this.errorRate = builder.errorRate;
            this.lastCallTime = builder.lastCallTime;
            this.offlineRate = builder.offlineRate;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.sqlId = builder.sqlId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallStatisticsList create() {
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
         * @return appNameList
         */
        public java.util.List<String> getAppNameList() {
            return this.appNameList;
        }

        /**
         * @return authorizedAppCount
         */
        public Integer getAuthorizedAppCount() {
            return this.authorizedAppCount;
        }

        /**
         * @return avgResponseTime
         */
        public Double getAvgResponseTime() {
            return this.avgResponseTime;
        }

        /**
         * @return callCount
         */
        public Long getCallCount() {
            return this.callCount;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return errorCount
         */
        public String getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorRate
         */
        public String getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return lastCallTime
         */
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        /**
         * @return offlineRate
         */
        public String getOfflineRate() {
            return this.offlineRate;
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
         * @return sqlId
         */
        public Integer getSqlId() {
            return this.sqlId;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private java.util.List<String> appNameList; 
            private Integer authorizedAppCount; 
            private Double avgResponseTime; 
            private Long callCount; 
            private String creator; 
            private String errorCount; 
            private String errorRate; 
            private String lastCallTime; 
            private String offlineRate; 
            private Integer projectId; 
            private String projectName; 
            private Integer sqlId; 

            private Builder() {
            } 

            private Builder(CallStatisticsList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appNameList = model.appNameList;
                this.authorizedAppCount = model.authorizedAppCount;
                this.avgResponseTime = model.avgResponseTime;
                this.callCount = model.callCount;
                this.creator = model.creator;
                this.errorCount = model.errorCount;
                this.errorRate = model.errorRate;
                this.lastCallTime = model.lastCallTime;
                this.offlineRate = model.offlineRate;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.sqlId = model.sqlId;
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
             * AppNameList.
             */
            public Builder appNameList(java.util.List<String> appNameList) {
                this.appNameList = appNameList;
                return this;
            }

            /**
             * AuthorizedAppCount.
             */
            public Builder authorizedAppCount(Integer authorizedAppCount) {
                this.authorizedAppCount = authorizedAppCount;
                return this;
            }

            /**
             * AvgResponseTime.
             */
            public Builder avgResponseTime(Double avgResponseTime) {
                this.avgResponseTime = avgResponseTime;
                return this;
            }

            /**
             * CallCount.
             */
            public Builder callCount(Long callCount) {
                this.callCount = callCount;
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
             * ErrorCount.
             */
            public Builder errorCount(String errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * ErrorRate.
             */
            public Builder errorRate(String errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * LastCallTime.
             */
            public Builder lastCallTime(String lastCallTime) {
                this.lastCallTime = lastCallTime;
                return this;
            }

            /**
             * OfflineRate.
             */
            public Builder offlineRate(String offlineRate) {
                this.offlineRate = offlineRate;
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
             * SqlId.
             */
            public Builder sqlId(Integer sqlId) {
                this.sqlId = sqlId;
                return this;
            }

            public CallStatisticsList build() {
                return new CallStatisticsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServiceApiCallStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServiceApiCallStatisticsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallStatisticsList")
        private java.util.List<CallStatisticsList> callStatisticsList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.callStatisticsList = builder.callStatisticsList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return callStatisticsList
         */
        public java.util.List<CallStatisticsList> getCallStatisticsList() {
            return this.callStatisticsList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CallStatisticsList> callStatisticsList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.callStatisticsList = model.callStatisticsList;
                this.totalCount = model.totalCount;
            } 

            /**
             * CallStatisticsList.
             */
            public Builder callStatisticsList(java.util.List<CallStatisticsList> callStatisticsList) {
                this.callStatisticsList = callStatisticsList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
