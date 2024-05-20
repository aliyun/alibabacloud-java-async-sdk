// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransferHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransferHistoryResponseBody</p>
 */
public class DescribeTransferHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HistoryDetails")
    private HistoryDetails historyDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTransferHistoryResponseBody(Builder builder) {
        this.historyDetails = builder.historyDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransferHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return historyDetails
     */
    public HistoryDetails getHistoryDetails() {
        return this.historyDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HistoryDetails historyDetails; 
        private String requestId; 

        /**
         * The migration information.
         */
        public Builder historyDetails(HistoryDetails historyDetails) {
            this.historyDetails = historyDetails;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTransferHistoryResponseBody build() {
            return new DescribeTransferHistoryResponseBody(this);
        } 

    } 

    public static class HistoryDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
        private String sourceDBCluster;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetDBCluster")
        private String targetDBCluster;

        private HistoryDetail(Builder builder) {
            this.progress = builder.progress;
            this.sourceDBCluster = builder.sourceDBCluster;
            this.status = builder.status;
            this.targetDBCluster = builder.targetDBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryDetail create() {
            return builder().build();
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return sourceDBCluster
         */
        public String getSourceDBCluster() {
            return this.sourceDBCluster;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetDBCluster
         */
        public String getTargetDBCluster() {
            return this.targetDBCluster;
        }

        public static final class Builder {
            private String progress; 
            private String sourceDBCluster; 
            private String status; 
            private String targetDBCluster; 

            /**
             * The progress of the data migration.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the source cluster.
             */
            public Builder sourceDBCluster(String sourceDBCluster) {
                this.sourceDBCluster = sourceDBCluster;
                return this;
            }

            /**
             * The status of the data migration task. Valid values:
             * <p>
             * 
             * *   **Finished**: The data migration task is complete.
             * *   **Processing**: The data migration task is in progress.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the destination cluster.
             */
            public Builder targetDBCluster(String targetDBCluster) {
                this.targetDBCluster = targetDBCluster;
                return this;
            }

            public HistoryDetail build() {
                return new HistoryDetail(this);
            } 

        } 

    }
    public static class HistoryDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryDetail")
        private java.util.List < HistoryDetail> historyDetail;

        private HistoryDetails(Builder builder) {
            this.historyDetail = builder.historyDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryDetails create() {
            return builder().build();
        }

        /**
         * @return historyDetail
         */
        public java.util.List < HistoryDetail> getHistoryDetail() {
            return this.historyDetail;
        }

        public static final class Builder {
            private java.util.List < HistoryDetail> historyDetail; 

            /**
             * HistoryDetail.
             */
            public Builder historyDetail(java.util.List < HistoryDetail> historyDetail) {
                this.historyDetail = historyDetail;
                return this;
            }

            public HistoryDetails build() {
                return new HistoryDetails(this);
            } 

        } 

    }
}
