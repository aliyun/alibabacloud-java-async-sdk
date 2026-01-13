// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListRecallManagementTableVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementTableVersionsResponseBody</p>
 */
public class ListRecallManagementTableVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersions")
    private java.util.List<RecallManagementTableVersions> recallManagementTableVersions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecallManagementTableVersionsResponseBody(Builder builder) {
        this.recallManagementTableVersions = builder.recallManagementTableVersions;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementTableVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableVersions
     */
    public java.util.List<RecallManagementTableVersions> getRecallManagementTableVersions() {
        return this.recallManagementTableVersions;
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
        private java.util.List<RecallManagementTableVersions> recallManagementTableVersions; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementTableVersionsResponseBody model) {
            this.recallManagementTableVersions = model.recallManagementTableVersions;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * RecallManagementTableVersions.
         */
        public Builder recallManagementTableVersions(java.util.List<RecallManagementTableVersions> recallManagementTableVersions) {
            this.recallManagementTableVersions = recallManagementTableVersions;
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

        public ListRecallManagementTableVersionsResponseBody build() {
            return new ListRecallManagementTableVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementTableVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementTableVersionsResponseBody</p>
     */
    public static class RecallManagementTableVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataVersion")
        private String dataVersion;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("PublishEndTime")
        private String publishEndTime;

        @com.aliyun.core.annotation.NameInMap("PublishStartTime")
        private String publishStartTime;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersionId")
        private String recallManagementTableVersionId;

        @com.aliyun.core.annotation.NameInMap("SourceTableDataSize")
        private Long sourceTableDataSize;

        @com.aliyun.core.annotation.NameInMap("SourceTableRowCount")
        private Long sourceTableRowCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RecallManagementTableVersions(Builder builder) {
            this.dataVersion = builder.dataVersion;
            this.effectiveTime = builder.effectiveTime;
            this.publishEndTime = builder.publishEndTime;
            this.publishStartTime = builder.publishStartTime;
            this.recallManagementTableVersionId = builder.recallManagementTableVersionId;
            this.sourceTableDataSize = builder.sourceTableDataSize;
            this.sourceTableRowCount = builder.sourceTableRowCount;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementTableVersions create() {
            return builder().build();
        }

        /**
         * @return dataVersion
         */
        public String getDataVersion() {
            return this.dataVersion;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return publishEndTime
         */
        public String getPublishEndTime() {
            return this.publishEndTime;
        }

        /**
         * @return publishStartTime
         */
        public String getPublishStartTime() {
            return this.publishStartTime;
        }

        /**
         * @return recallManagementTableVersionId
         */
        public String getRecallManagementTableVersionId() {
            return this.recallManagementTableVersionId;
        }

        /**
         * @return sourceTableDataSize
         */
        public Long getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        /**
         * @return sourceTableRowCount
         */
        public Long getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dataVersion; 
            private String effectiveTime; 
            private String publishEndTime; 
            private String publishStartTime; 
            private String recallManagementTableVersionId; 
            private Long sourceTableDataSize; 
            private Long sourceTableRowCount; 
            private String status; 

            private Builder() {
            } 

            private Builder(RecallManagementTableVersions model) {
                this.dataVersion = model.dataVersion;
                this.effectiveTime = model.effectiveTime;
                this.publishEndTime = model.publishEndTime;
                this.publishStartTime = model.publishStartTime;
                this.recallManagementTableVersionId = model.recallManagementTableVersionId;
                this.sourceTableDataSize = model.sourceTableDataSize;
                this.sourceTableRowCount = model.sourceTableRowCount;
                this.status = model.status;
            } 

            /**
             * DataVersion.
             */
            public Builder dataVersion(String dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * PublishEndTime.
             */
            public Builder publishEndTime(String publishEndTime) {
                this.publishEndTime = publishEndTime;
                return this;
            }

            /**
             * PublishStartTime.
             */
            public Builder publishStartTime(String publishStartTime) {
                this.publishStartTime = publishStartTime;
                return this;
            }

            /**
             * RecallManagementTableVersionId.
             */
            public Builder recallManagementTableVersionId(String recallManagementTableVersionId) {
                this.recallManagementTableVersionId = recallManagementTableVersionId;
                return this;
            }

            /**
             * SourceTableDataSize.
             */
            public Builder sourceTableDataSize(Long sourceTableDataSize) {
                this.sourceTableDataSize = sourceTableDataSize;
                return this;
            }

            /**
             * SourceTableRowCount.
             */
            public Builder sourceTableRowCount(Long sourceTableRowCount) {
                this.sourceTableRowCount = sourceTableRowCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RecallManagementTableVersions build() {
                return new RecallManagementTableVersions(this);
            } 

        } 

    }
}
