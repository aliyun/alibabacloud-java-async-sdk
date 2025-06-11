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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeTransferHistoryResponseBody model) {
            this.historyDetails = model.historyDetails;
            this.requestId = model.requestId;
        } 

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

            private Builder() {
            } 

            private Builder(HistoryDetail model) {
                this.bytesPerMinute = model.bytesPerMinute;
                this.disableWriteWindows = model.disableWriteWindows;
                this.partsPerMinute = model.partsPerMinute;
                this.progress = model.progress;
                this.sourceControlVersion = model.sourceControlVersion;
                this.sourceDBCluster = model.sourceDBCluster;
                this.status = model.status;
                this.subJob = model.subJob;
                this.subJobStatus = model.subJobStatus;
                this.targetControlVersion = model.targetControlVersion;
                this.targetDBCluster = model.targetDBCluster;
                this.unsyncedBytes = model.unsyncedBytes;
                this.unsyncedParts = model.unsyncedParts;
            } 

            /**
             * <p>The amount of data that is migrated per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder bytesPerMinute(Long bytesPerMinute) {
                this.bytesPerMinute = bytesPerMinute;
                return this;
            }

            /**
             * <p>The time window during which write operations are stopped.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-08T00:00:00+08:00,2025-02-12T00:00:00+08:00</p>
             */
            public Builder disableWriteWindows(String disableWriteWindows) {
                this.disableWriteWindows = disableWriteWindows;
                return this;
            }

            /**
             * <p>The number of parts that are migrated per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>1.24</p>
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
             * <p>The control version of the source cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
             * <p>The running subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>SubJob</p>
             */
            public Builder subJob(String subJob) {
                this.subJob = subJob;
                return this;
            }

            /**
             * <p>The subtask status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder subJobStatus(String subJobStatus) {
                this.subJobStatus = subJobStatus;
                return this;
            }

            /**
             * <p>The control version of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
             * <p>The amount of data that is not migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>102400</p>
             */
            public Builder unsyncedBytes(Long unsyncedBytes) {
                this.unsyncedBytes = unsyncedBytes;
                return this;
            }

            /**
             * <p>The number of parts that are not migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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

            private Builder() {
            } 

            private Builder(HistoryDetails model) {
                this.historyDetail = model.historyDetail;
            } 

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
