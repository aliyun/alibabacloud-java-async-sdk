// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryAccelerationLogByCubeIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAccelerationLogByCubeIdResponseBody</p>
 */
public class QueryAccelerationLogByCubeIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAccelerationLogByCubeIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccelerationLogByCubeIdResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAccelerationLogByCubeIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAccelerationLogByCubeIdResponseBody build() {
            return new QueryAccelerationLogByCubeIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAccelerationLogByCubeIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccelerationLogByCubeIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("JobHistoryId")
        private String jobHistoryId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("JonStartDate")
        private String jonStartDate;

        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.jobHistoryId = builder.jobHistoryId;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jonStartDate = builder.jonStartDate;
            this.log = builder.log;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return jobHistoryId
         */
        public String getJobHistoryId() {
            return this.jobHistoryId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jonStartDate
         */
        public String getJonStartDate() {
            return this.jonStartDate;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        public static final class Builder {
            private String duration; 
            private String jobHistoryId; 
            private String jobId; 
            private String jobStatus; 
            private String jonStartDate; 
            private String log; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.duration = model.duration;
                this.jobHistoryId = model.jobHistoryId;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.jonStartDate = model.jonStartDate;
                this.log = model.log;
            } 

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * JobHistoryId.
             */
            public Builder jobHistoryId(String jobHistoryId) {
                this.jobHistoryId = jobHistoryId;
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
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * JonStartDate.
             */
            public Builder jonStartDate(String jonStartDate) {
                this.jonStartDate = jonStartDate;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAccelerationLogByCubeIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAccelerationLogByCubeIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Integer next;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Pre")
        private Integer pre;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.next = builder.next;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pre = builder.pre;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
        public Integer getNext() {
            return this.next;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pre
         */
        public Integer getPre() {
            return this.pre;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer next; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer pre; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.next = model.next;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.pre = model.pre;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
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
            public Builder next(Integer next) {
                this.next = next;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * Pre.
             */
            public Builder pre(Integer pre) {
                this.pre = pre;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
