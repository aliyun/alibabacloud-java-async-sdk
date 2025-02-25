// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
         * <p>The migration information.</p>
         */
        public Builder historyDetails(HistoryDetails historyDetails) {
            this.historyDetails = historyDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTransferHistoryResponseBody build() {
            return new DescribeTransferHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransferHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransferHistoryResponseBody</p>
     */
    public static class HistoryDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BytesPerMinute")
        private Long bytesPerMinute;

        @com.aliyun.core.annotation.NameInMap("DisableWriteWindows")
        private String disableWriteWindows;

        @com.aliyun.core.annotation.NameInMap("PartsPerMinute")
        private Double partsPerMinute;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("SourceControlVersion")
        private String sourceControlVersion;

        @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
        private String sourceDBCluster;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubJob")
        private String subJob;

        @com.aliyun.core.annotation.NameInMap("SubJobStatus")
        private String subJobStatus;

        @com.aliyun.core.annotation.NameInMap("TargetControlVersion")
        private String targetControlVersion;

        @com.aliyun.core.annotation.NameInMap("TargetDBCluster")
        private String targetDBCluster;

        @com.aliyun.core.annotation.NameInMap("UnsyncedBytes")
        private Long unsyncedBytes;

        @com.aliyun.core.annotation.NameInMap("UnsyncedParts")
        private Long unsyncedParts;

        private HistoryDetail(Builder builder) {
            this.bytesPerMinute = builder.bytesPerMinute;
            this.disableWriteWindows = builder.disableWriteWindows;
            this.partsPerMinute = builder.partsPerMinute;
            this.progress = builder.progress;
            this.sourceControlVersion = builder.sourceControlVersion;
            this.sourceDBCluster = builder.sourceDBCluster;
            this.status = builder.status;
            this.subJob = builder.subJob;
            this.subJobStatus = builder.subJobStatus;
            this.targetControlVersion = builder.targetControlVersion;
            this.targetDBCluster = builder.targetDBCluster;
            this.unsyncedBytes = builder.unsyncedBytes;
            this.unsyncedParts = builder.unsyncedParts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryDetail create() {
            return builder().build();
        }

        /**
         * @return bytesPerMinute
         */
        public Long getBytesPerMinute() {
            return this.bytesPerMinute;
        }

        /**
         * @return disableWriteWindows
         */
        public String getDisableWriteWindows() {
            return this.disableWriteWindows;
        }

        /**
         * @return partsPerMinute
         */
        public Double getPartsPerMinute() {
            return this.partsPerMinute;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return sourceControlVersion
         */
        public String getSourceControlVersion() {
            return this.sourceControlVersion;
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
         * @return subJob
         */
        public String getSubJob() {
            return this.subJob;
        }

        /**
         * @return subJobStatus
         */
        public String getSubJobStatus() {
            return this.subJobStatus;
        }

        /**
         * @return targetControlVersion
         */
        public String getTargetControlVersion() {
            return this.targetControlVersion;
        }

        /**
         * @return targetDBCluster
         */
        public String getTargetDBCluster() {
            return this.targetDBCluster;
        }

        /**
         * @return unsyncedBytes
         */
        public Long getUnsyncedBytes() {
            return this.unsyncedBytes;
        }

        /**
         * @return unsyncedParts
         */
        public Long getUnsyncedParts() {
            return this.unsyncedParts;
        }

        public static final class Builder {
            private Long bytesPerMinute; 
            private String disableWriteWindows; 
            private Double partsPerMinute; 
            private String progress; 
            private String sourceControlVersion; 
            private String sourceDBCluster; 
            private String status; 
            private String subJob; 
            private String subJobStatus; 
            private String targetControlVersion; 
            private String targetDBCluster; 
            private Long unsyncedBytes; 
            private Long unsyncedParts; 

            /**
             * BytesPerMinute.
             */
            public Builder bytesPerMinute(Long bytesPerMinute) {
                this.bytesPerMinute = bytesPerMinute;
                return this;
            }

            /**
             * DisableWriteWindows.
             */
            public Builder disableWriteWindows(String disableWriteWindows) {
                this.disableWriteWindows = disableWriteWindows;
                return this;
            }

            /**
             * PartsPerMinute.
             */
            public Builder partsPerMinute(Double partsPerMinute) {
                this.partsPerMinute = partsPerMinute;
                return this;
            }

            /**
             * <p>The progress of the data migration.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * SourceControlVersion.
             */
            public Builder sourceControlVersion(String sourceControlVersion) {
                this.sourceControlVersion = sourceControlVersion;
                return this;
            }

            /**
             * <p>The ID of the source cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp108z124a8o7****</p>
             */
            public Builder sourceDBCluster(String sourceDBCluster) {
                this.sourceDBCluster = sourceDBCluster;
                return this;
            }

            /**
             * <p>The status of the data migration task. Valid values:</p>
             * <ul>
             * <li><strong>Finished</strong>: The data migration task is complete.</li>
             * <li><strong>Processing</strong>: The data migration task is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubJob.
             */
            public Builder subJob(String subJob) {
                this.subJob = subJob;
                return this;
            }

            /**
             * SubJobStatus.
             */
            public Builder subJobStatus(String subJobStatus) {
                this.subJobStatus = subJobStatus;
                return this;
            }

            /**
             * TargetControlVersion.
             */
            public Builder targetControlVersion(String targetControlVersion) {
                this.targetControlVersion = targetControlVersion;
                return this;
            }

            /**
             * <p>The ID of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cc-bp13zkh9uw523****</p>
             */
            public Builder targetDBCluster(String targetDBCluster) {
                this.targetDBCluster = targetDBCluster;
                return this;
            }

            /**
             * UnsyncedBytes.
             */
            public Builder unsyncedBytes(Long unsyncedBytes) {
                this.unsyncedBytes = unsyncedBytes;
                return this;
            }

            /**
             * UnsyncedParts.
             */
            public Builder unsyncedParts(Long unsyncedParts) {
                this.unsyncedParts = unsyncedParts;
                return this;
            }

            public HistoryDetail build() {
                return new HistoryDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTransferHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransferHistoryResponseBody</p>
     */
    public static class HistoryDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HistoryDetail")
        private java.util.List<HistoryDetail> historyDetail;

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
        public java.util.List<HistoryDetail> getHistoryDetail() {
            return this.historyDetail;
        }

        public static final class Builder {
            private java.util.List<HistoryDetail> historyDetail; 

            /**
             * HistoryDetail.
             */
            public Builder historyDetail(java.util.List<HistoryDetail> historyDetail) {
                this.historyDetail = historyDetail;
                return this;
            }

            public HistoryDetails build() {
                return new HistoryDetails(this);
            } 

        } 

    }
}
