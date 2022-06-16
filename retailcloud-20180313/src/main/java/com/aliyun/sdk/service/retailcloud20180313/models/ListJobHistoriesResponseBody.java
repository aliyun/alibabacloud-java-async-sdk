// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobHistoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobHistoriesResponseBody</p>
 */
public class ListJobHistoriesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListJobHistoriesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobHistoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobHistoriesResponseBody build() {
            return new ListJobHistoriesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveDeadlineSeconds")
        private Integer activeDeadlineSeconds;

        @NameInMap("BackoffLimit")
        private Integer backoffLimit;

        @NameInMap("CompletionTime")
        private String completionTime;

        @NameInMap("Completions")
        private Integer completions;

        @NameInMap("Failed")
        private Integer failed;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Parallelism")
        private Integer parallelism;

        @NameInMap("PodList")
        private java.util.List < String > podList;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Succeeded")
        private Integer succeeded;

        private Data(Builder builder) {
            this.activeDeadlineSeconds = builder.activeDeadlineSeconds;
            this.backoffLimit = builder.backoffLimit;
            this.completionTime = builder.completionTime;
            this.completions = builder.completions;
            this.failed = builder.failed;
            this.message = builder.message;
            this.name = builder.name;
            this.parallelism = builder.parallelism;
            this.podList = builder.podList;
            this.startTime = builder.startTime;
            this.succeeded = builder.succeeded;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeDeadlineSeconds
         */
        public Integer getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        /**
         * @return backoffLimit
         */
        public Integer getBackoffLimit() {
            return this.backoffLimit;
        }

        /**
         * @return completionTime
         */
        public String getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return completions
         */
        public Integer getCompletions() {
            return this.completions;
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parallelism
         */
        public Integer getParallelism() {
            return this.parallelism;
        }

        /**
         * @return podList
         */
        public java.util.List < String > getPodList() {
            return this.podList;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return succeeded
         */
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public static final class Builder {
            private Integer activeDeadlineSeconds; 
            private Integer backoffLimit; 
            private String completionTime; 
            private Integer completions; 
            private Integer failed; 
            private String message; 
            private String name; 
            private Integer parallelism; 
            private java.util.List < String > podList; 
            private String startTime; 
            private Integer succeeded; 

            /**
             * ActiveDeadlineSeconds.
             */
            public Builder activeDeadlineSeconds(Integer activeDeadlineSeconds) {
                this.activeDeadlineSeconds = activeDeadlineSeconds;
                return this;
            }

            /**
             * BackoffLimit.
             */
            public Builder backoffLimit(Integer backoffLimit) {
                this.backoffLimit = backoffLimit;
                return this;
            }

            /**
             * CompletionTime.
             */
            public Builder completionTime(String completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * Completions.
             */
            public Builder completions(Integer completions) {
                this.completions = completions;
                return this;
            }

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parallelism.
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            /**
             * PodList.
             */
            public Builder podList(java.util.List < String > podList) {
                this.podList = podList;
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
             * Succeeded.
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
