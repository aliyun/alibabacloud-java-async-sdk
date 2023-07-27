// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkAppAttemptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkAppAttemptsResponseBody</p>
 */
public class ListSparkAppAttemptsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListSparkAppAttemptsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkAppAttemptsResponseBody create() {
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

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSparkAppAttemptsResponseBody build() {
            return new ListSparkAppAttemptsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AttemptInfoList")
        private java.util.List < SparkAttemptInfo > attemptInfoList;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.attemptInfoList = builder.attemptInfoList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attemptInfoList
         */
        public java.util.List < SparkAttemptInfo > getAttemptInfoList() {
            return this.attemptInfoList;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < SparkAttemptInfo > attemptInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The information about the attempts. Fields in the response parameter:
             * <p>
             * 
             * *   **AttemptId**: the attempt ID.
             * 
             * *   **State**: the state of the Spark application. Valid values:
             * 
             *     *   **SUBMITTED**
             *     *   **STARTING**
             *     *   **RUNNING**
             *     *   **FAILING**
             *     *   **FAILED**
             *     *   **KILLING**
             *     *   **KILLED**
             *     *   **SUCCEEDING**
             *     *   **COMPLETED**
             *     *   **FATAL**
             *     *   **UNKNOWN**
             * 
             * *   **Message**: the alert message that is returned. If no alert is generated, null is returned.
             * 
             * *   **Data**: the data of the Spark application template.
             * 
             * *   **EstimateExecutionCpuTimeInSeconds**: the amount of time it takes to consume CPU resources for running the Spark application. Unit: milliseconds.
             * 
             * *   **LogRootPath**: the storage path of log files.
             * 
             * *   **LastAttemptId**: the ID of the last attempt.
             * 
             * *   **WebUiAddress**: the web UI address.
             * 
             * *   **SubmittedTimeInMillis**: the time when the Spark application was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * 
             * *   **StartedTimeInMillis**: the time when the Spark application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * 
             * *   **LastUpdatedTimeInMillis**: the time when the Spark application was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * 
             * *   **TerminatedTimeInMillis**: the time when the Spark application task was terminated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             * 
             * *   **DBClusterId**: the ID of the cluster on which the Spark application runs.
             * 
             * *   **ResourceGroupName**: the name of the job resource group.
             * 
             * *   **DurationInMillis**: the amount of time it takes to run the Spark application. Unit: milliseconds.
             */
            public Builder attemptInfoList(java.util.List < SparkAttemptInfo > attemptInfoList) {
                this.attemptInfoList = attemptInfoList;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
