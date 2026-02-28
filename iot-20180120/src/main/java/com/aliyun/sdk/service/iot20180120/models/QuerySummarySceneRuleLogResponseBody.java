// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QuerySummarySceneRuleLogResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySummarySceneRuleLogResponseBody</p>
 */
public class QuerySummarySceneRuleLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySummarySceneRuleLogResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySummarySceneRuleLogResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySummarySceneRuleLogResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySummarySceneRuleLogResponseBody build() {
            return new QuerySummarySceneRuleLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySummarySceneRuleLogResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySummarySceneRuleLogResponseBody</p>
     */
    public static class LogInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogTime")
        private Integer logTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private LogInfo(Builder builder) {
            this.logTime = builder.logTime;
            this.result = builder.result;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogInfo create() {
            return builder().build();
        }

        /**
         * @return logTime
         */
        public Integer getLogTime() {
            return this.logTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private Integer logTime; 
            private String result; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(LogInfo model) {
                this.logTime = model.logTime;
                this.result = model.result;
                this.traceId = model.traceId;
            } 

            /**
             * LogTime.
             */
            public Builder logTime(Integer logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public LogInfo build() {
                return new LogInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySummarySceneRuleLogResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySummarySceneRuleLogResponseBody</p>
     */
    public static class LogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogInfo")
        private java.util.List<LogInfo> logInfo;

        private LogList(Builder builder) {
            this.logInfo = builder.logInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return logInfo
         */
        public java.util.List<LogInfo> getLogInfo() {
            return this.logInfo;
        }

        public static final class Builder {
            private java.util.List<LogInfo> logInfo; 

            private Builder() {
            } 

            private Builder(LogList model) {
                this.logInfo = model.logInfo;
            } 

            /**
             * LogInfo.
             */
            public Builder logInfo(java.util.List<LogInfo> logInfo) {
                this.logInfo = logInfo;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySummarySceneRuleLogResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySummarySceneRuleLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LogList")
        private LogList logList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.logList = builder.logList;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return logList
         */
        public LogList getLogList() {
            return this.logList;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer currentPage; 
            private LogList logList; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.logList = model.logList;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * LogList.
             */
            public Builder logList(LogList logList) {
                this.logList = logList;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
