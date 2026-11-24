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
             * <p>The retry information list. Response parameter description:</p>
             * <ul>
             * <li><strong>AttemptId</strong>: The retry ID.</li>
             * <li><strong>State</strong>: The execution state of the application. Valid values:<ul>
             * <li><strong>SUBMITTED</strong>: Submitted.</li>
             * <li><strong>STARTING</strong>: Starting.</li>
             * <li><strong>RUNNING</strong>: Running.</li>
             * <li><strong>FAILING</strong>: The task failed. Cleaning up the environment.</li>
             * <li><strong>FAILED</strong>: Failed.</li>
             * <li><strong>KILLING</strong>: Aborting the task. Cleaning up the environment.</li>
             * <li><strong>KILLED</strong>: The task aborted.</li>
             * <li><strong>SUCCEEDING</strong>: The task execution ended. Cleaning up the environment.</li>
             * <li><strong>COMPLETED</strong>: The task execution ended.</li>
             * <li><strong>FATAL</strong>: Unexpected failure.</li>
             * <li><strong>UNKNOWN</strong>: Unknown error.</li>
             * </ul>
             * </li>
             * <li><strong>Message</strong>: The alert information. If no alert is generated, an empty value is returned.</li>
             * <li><strong>Data</strong>: The Spark application template data.</li>
             * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: The CPU time consumed to execute the Spark application, in milliseconds.</li>
             * <li><strong>LogRootPath</strong>: The storage path of the log file.</li>
             * <li><strong>LastAttemptId</strong>: The ID of the last retry.</li>
             * <li><strong>WebUiAddress</strong>: The Web UI address.</li>
             * <li><strong>SubmittedTimeInMillis</strong>: The time when the Spark application was submitted. The value is a UNIX timestamp in milliseconds.</li>
             * <li><strong>StartedTimeInMillis</strong>: The time when the Spark application was created. The value is a UNIX timestamp in milliseconds.</li>
             * <li><strong>LastUpdatedTimeInMillis</strong>: The time when the Spark application was last updated. The value is a UNIX timestamp in milliseconds.</li>
             * <li><strong>TerminatedTimeInMillis</strong>: The time when the execution of the Spark application was stopped. The value is a UNIX timestamp in milliseconds.</li>
             * <li><strong>DBClusterId</strong>: The ID of the cluster where the Spark application is executed.</li>
             * <li><strong>ResourceGroupName</strong>: The name of the job resource group.</li>
             * <li><strong>DurationInMillis</strong>: The execution duration of the Spark application, in milliseconds.</li>
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
