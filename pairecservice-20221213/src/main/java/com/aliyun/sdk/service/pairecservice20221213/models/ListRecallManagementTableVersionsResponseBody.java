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
         * <p>The list of RecallManagementTable versions.</p>
         */
        public Builder recallManagementTableVersions(java.util.List<RecallManagementTableVersions> recallManagementTableVersions) {
            this.recallManagementTableVersions = recallManagementTableVersions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The data version.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20250701</p>
             */
            public Builder dataVersion(String dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * <p>The effective time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The sync end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T23:24:33.132</p>
             */
            public Builder publishEndTime(String publishEndTime) {
                this.publishEndTime = publishEndTime;
                return this;
            }

            /**
             * <p>The sync start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-15T22:24:33.132</p>
             */
            public Builder publishStartTime(String publishStartTime) {
                this.publishStartTime = publishStartTime;
                return this;
            }

            /**
             * <p>The ID of the RecallManagementTable version.</p>
             * 
             * <strong>example:</strong>
             * <p>202507010000</p>
             */
            public Builder recallManagementTableVersionId(String recallManagementTableVersionId) {
                this.recallManagementTableVersionId = recallManagementTableVersionId;
                return this;
            }

            /**
             * <p>The source table data size.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder sourceTableDataSize(Long sourceTableDataSize) {
                this.sourceTableDataSize = sourceTableDataSize;
                return this;
            }

            /**
             * <p>The source table row count.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sourceTableRowCount(Long sourceTableRowCount) {
                this.sourceTableRowCount = sourceTableRowCount;
                return this;
            }

            /**
             * <p>The status of the version. Valid values:</p>
             * <ul>
             * <li><p>Online: The version is online.</p>
             * </li>
             * <li><p>Offline: The version is offline.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
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
