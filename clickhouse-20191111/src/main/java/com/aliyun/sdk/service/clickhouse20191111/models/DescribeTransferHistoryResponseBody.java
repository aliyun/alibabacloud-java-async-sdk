// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
        @com.aliyun.core.annotation.NameInMap("DisableWriteWindows")
        private String disableWriteWindows;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("SourceControlVersion")
        private String sourceControlVersion;

        @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
        private String sourceDBCluster;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetControlVersion")
        private String targetControlVersion;

        @com.aliyun.core.annotation.NameInMap("TargetDBCluster")
        private String targetDBCluster;

        private HistoryDetail(Builder builder) {
            this.disableWriteWindows = builder.disableWriteWindows;
            this.progress = builder.progress;
            this.sourceControlVersion = builder.sourceControlVersion;
            this.sourceDBCluster = builder.sourceDBCluster;
            this.status = builder.status;
            this.targetControlVersion = builder.targetControlVersion;
            this.targetDBCluster = builder.targetDBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryDetail create() {
            return builder().build();
        }

        /**
         * @return disableWriteWindows
         */
        public String getDisableWriteWindows() {
            return this.disableWriteWindows;
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

        public static final class Builder {
            private String disableWriteWindows; 
            private String progress; 
            private String sourceControlVersion; 
            private String sourceDBCluster; 
            private String status; 
            private String targetControlVersion; 
            private String targetDBCluster; 

            /**
             * DisableWriteWindows.
             */
            public Builder disableWriteWindows(String disableWriteWindows) {
                this.disableWriteWindows = disableWriteWindows;
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
