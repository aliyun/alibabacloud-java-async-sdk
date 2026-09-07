// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListSparkAppAttemptsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkAppAttemptsResponseBody</p>
 */
public class ListSparkAppAttemptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(ListSparkAppAttemptsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSparkAppAttemptsResponseBody build() {
            return new ListSparkAppAttemptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSparkAppAttemptsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSparkAppAttemptsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttemptInfoList")
        private java.util.List<SparkAttemptInfo> attemptInfoList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<SparkAttemptInfo> getAttemptInfoList() {
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
            private java.util.List<SparkAttemptInfo> attemptInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attemptInfoList = model.attemptInfoList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of retry information. Metric description:</p>
             * <ul>
             * <li><strong>AttemptId</strong>: the retry ID.</li>
             * <li><strong>State</strong>: the execute status of the application. Valid values:<ul>
             * <li><strong>SUBMITTED</strong>: commit.</li>
             * <li><strong>STARTING</strong>: starting.</li>
             * <li><strong>RUNNING</strong>: executing.</li>
             * <li><strong>FAILING</strong>: the node failed and the environment is being cleaned up.</li>
             * <li><strong>FAILED</strong>: failed.</li>
             * <li><strong>KILLING</strong>: aborting the task and cleaning up the environment.</li>
             * <li><strong>KILLED</strong>: the task is aborted.</li>
             * <li><strong>SUCCEEDING</strong>: the node execution is complete and the environment is being cleaned up.</li>
             * <li><strong>COMPLETED</strong>: the node execution is complete.</li>
             * <li><strong>FATAL</strong>: unexpected failure.</li>
             * <li><strong>UNKNOWN</strong>: unknown fault.</li>
             * </ul>
             * </li>
             * <li><strong>Message</strong>: the alerting message. This parameter is empty if no alerting is generated.</li>
             * <li><strong>Data</strong>: the Spark application template data.</li>
             * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: the CPU time consumed to execute the Spark application, in milliseconds (ms).</li>
             * <li><strong>LogRootPath</strong>: the storage path of log files.</li>
             * <li><strong>LastAttemptId</strong>: the ID of the last retry.</li>
             * <li><strong>WebUiAddress</strong>: the web UI address.</li>
             * <li><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was committed. This value is a UNIX timestamp in milliseconds (ms).</li>
             * <li><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. This value is a UNIX timestamp in milliseconds (ms).</li>
             * <li><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. This value is a UNIX timestamp in milliseconds (ms).</li>
             * <li><strong>TerminatedTimeInMillis</strong>: the time when the Spark application stopped executing. This value is a UNIX timestamp in milliseconds (ms).</li>
             * <li><strong>DBClusterId</strong>: the ID of the cluster that executes the Spark application.</li>
             * <li><strong>ResourceGroupName</strong>: the name of the Job-type resource group.</li>
             * <li><strong>DurationInMillis</strong>: the execution duration of the Spark application, in milliseconds (ms).</li>
             * </ul>
             */
            public Builder attemptInfoList(java.util.List<SparkAttemptInfo> attemptInfoList) {
                this.attemptInfoList = attemptInfoList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
