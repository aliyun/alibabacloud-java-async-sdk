// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSparkAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkAppsResponseBody</p>
 */
public class ListSparkAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSparkAppsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D65A809F-34CE-4550-9BC1-0ED21ETG380</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSparkAppsResponseBody build() {
            return new ListSparkAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSparkAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSparkAppsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInfoList")
        private java.util.List < SparkAppInfo > appInfoList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.appInfoList = builder.appInfoList;
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
         * @return appInfoList
         */
        public java.util.List < SparkAppInfo > getAppInfoList() {
            return this.appInfoList;
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
            private java.util.List < SparkAppInfo > appInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>Details of the applications. Fields in the response parameter:</p>
             * <ul>
             * <li><strong>Data</strong>: the data of the Spark application template.</li>
             * <li><strong>EstimateExecutionCpuTimeInSeconds</strong>: the amount of time it takes to consume CPU resources for running the Spark application. Unit: milliseconds.</li>
             * <li><strong>LogRootPath</strong>: the storage path of log files.</li>
             * <li><strong>LastAttemptId</strong>: the most recent attempt ID.</li>
             * <li><strong>WebUiAddress</strong>: the web UI URL.</li>
             * <li><strong>SubmittedTimeInMillis</strong>: the time when the Spark application was submitted. The time is displayed in the UNIX timestamp format. Unit: milliseconds.</li>
             * <li><strong>StartedTimeInMillis</strong>: the time when the Spark application was created. The time is displayed in the UNIX timestamp format. Unit: milliseconds.</li>
             * <li><strong>LastUpdatedTimeInMillis</strong>: the time when the Spark application was last updated. The time is displayed in the UNIX timestamp format. Unit: milliseconds.</li>
             * <li><strong>TerminatedTimeInMillis</strong>: the time when the Spark application task was terminated. The time is displayed in the UNIX timestamp format. Unit: milliseconds.</li>
             * <li><strong>DBClusterId</strong>: the ID of the cluster on which the Spark application runs.</li>
             * <li><strong>ResourceGroupName</strong>: the name of the job resource group.</li>
             * <li><strong>DurationInMillis</strong>: the amount of time it takes to run the Spark application. Unit: milliseconds.</li>
             * </ul>
             */
            public Builder appInfoList(java.util.List < SparkAppInfo > appInfoList) {
                this.appInfoList = appInfoList;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>1</p>
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
