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

            /**
             * <p>The queried attempts. Fields in the response parameter:</p>
             * <ul>
             * <li><p><strong>AttemptId</strong>: the attempt ID.</p>
             * </li>
             * <li><p><strong>State</strong>: the state of the Spark application. Valid values:</p>
             * <ul>
             * <li><strong>SUBMITTED</strong></li>
             * <li><strong>STARTING</strong></li>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>FAILING</strong></li>
             * <li><strong>FAILED</strong></li>
             * <li><strong>KILLING</strong></li>
             * <li><strong>KILLED</strong></li>
             * <li><strong>SUCCEEDING</strong></li>
             * <li><strong>COMPLETED</strong></li>
             * <li><strong>FATAL</strong></li>
             * <li><strong>UNKNOWN</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>Message</strong>: the alert message that is returned. If no alert is generated, null is returned.</p>
             * </li>
             * <li><p><strong>Data</strong> the data of the Spark application template.</p>
             * </li>
             * <li><p><strong>EstimateExecutionCpuTimeInSeconds</strong>: the amount of time that is required to consume CPU resources for running the Spark application. Unit: milliseconds.</p>
             * </li>
             * <li><p><strong>LogRootPath</strong>: the storage path of log files.</p>
             * </li>
             * <li><p><strong>LastAttemptId</strong>: the ID of the last attempt.</p>
             * </li>
             * <li><p><strong>WebUiAddress</strong>: the web UI URL.</p>
             * </li>
             * <li><p><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * </li>
             * <li><p><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * </li>
             * <li><p><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * </li>
             * <li><p><strong>TerminatedTimeInMillis</strong>: the time when the Spark application task was terminated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * </li>
             * <li><p><strong>DBClusterId</strong>: the ID of the cluster on which the Spark application runs.</p>
             * </li>
             * <li><p><strong>ResourceGroupName</strong>: the name of the job resource group.</p>
             * </li>
             * <li><p><strong>DurationInMillis</strong>: the amount of time that is required to run the Spark application. Unit: milliseconds.</p>
             * </li>
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
             * <p>The total number of entries returned.</p>
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
