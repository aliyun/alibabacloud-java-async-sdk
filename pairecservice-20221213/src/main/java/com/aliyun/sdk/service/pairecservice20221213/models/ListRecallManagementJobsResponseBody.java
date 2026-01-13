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
 * {@link ListRecallManagementJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementJobsResponseBody</p>
 */
public class ListRecallManagementJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RecallManagementJobs")
    private java.util.List<RecallManagementJobs> recallManagementJobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRecallManagementJobsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.recallManagementJobs = builder.recallManagementJobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return recallManagementJobs
     */
    public java.util.List<RecallManagementJobs> getRecallManagementJobs() {
        return this.recallManagementJobs;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<RecallManagementJobs> recallManagementJobs; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementJobsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.recallManagementJobs = model.recallManagementJobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RecallManagementJobs.
         */
        public Builder recallManagementJobs(java.util.List<RecallManagementJobs> recallManagementJobs) {
            this.recallManagementJobs = recallManagementJobs;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecallManagementJobsResponseBody build() {
            return new ListRecallManagementJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementJobsResponseBody</p>
     */
    public static class RecallManagerTableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataVersion")
        private String dataVersion;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersionId")
        private String recallManagementTableVersionId;

        @com.aliyun.core.annotation.NameInMap("SourceTableDataSize")
        private String sourceTableDataSize;

        @com.aliyun.core.annotation.NameInMap("SourceTableRowCount")
        private String sourceTableRowCount;

        private RecallManagerTableInfo(Builder builder) {
            this.dataVersion = builder.dataVersion;
            this.recallManagementTableVersionId = builder.recallManagementTableVersionId;
            this.sourceTableDataSize = builder.sourceTableDataSize;
            this.sourceTableRowCount = builder.sourceTableRowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagerTableInfo create() {
            return builder().build();
        }

        /**
         * @return dataVersion
         */
        public String getDataVersion() {
            return this.dataVersion;
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
        public String getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        /**
         * @return sourceTableRowCount
         */
        public String getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

        public static final class Builder {
            private String dataVersion; 
            private String recallManagementTableVersionId; 
            private String sourceTableDataSize; 
            private String sourceTableRowCount; 

            private Builder() {
            } 

            private Builder(RecallManagerTableInfo model) {
                this.dataVersion = model.dataVersion;
                this.recallManagementTableVersionId = model.recallManagementTableVersionId;
                this.sourceTableDataSize = model.sourceTableDataSize;
                this.sourceTableRowCount = model.sourceTableRowCount;
            } 

            /**
             * DataVersion.
             */
            public Builder dataVersion(String dataVersion) {
                this.dataVersion = dataVersion;
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
            public Builder sourceTableDataSize(String sourceTableDataSize) {
                this.sourceTableDataSize = sourceTableDataSize;
                return this;
            }

            /**
             * SourceTableRowCount.
             */
            public Builder sourceTableRowCount(String sourceTableRowCount) {
                this.sourceTableRowCount = sourceTableRowCount;
                return this;
            }

            public RecallManagerTableInfo build() {
                return new RecallManagerTableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecallManagementJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementJobsResponseBody</p>
     */
    public static class RecallManagementJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("RecallManagementJobId")
        private String recallManagementJobId;

        @com.aliyun.core.annotation.NameInMap("RecallManagerTableInfo")
        private RecallManagerTableInfo recallManagerTableInfo;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RecallManagementJobs(Builder builder) {
            this.endTime = builder.endTime;
            this.recallManagementJobId = builder.recallManagementJobId;
            this.recallManagerTableInfo = builder.recallManagerTableInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementJobs create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return recallManagementJobId
         */
        public String getRecallManagementJobId() {
            return this.recallManagementJobId;
        }

        /**
         * @return recallManagerTableInfo
         */
        public RecallManagerTableInfo getRecallManagerTableInfo() {
            return this.recallManagerTableInfo;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endTime; 
            private String recallManagementJobId; 
            private RecallManagerTableInfo recallManagerTableInfo; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(RecallManagementJobs model) {
                this.endTime = model.endTime;
                this.recallManagementJobId = model.recallManagementJobId;
                this.recallManagerTableInfo = model.recallManagerTableInfo;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * RecallManagementJobId.
             */
            public Builder recallManagementJobId(String recallManagementJobId) {
                this.recallManagementJobId = recallManagementJobId;
                return this;
            }

            /**
             * RecallManagerTableInfo.
             */
            public Builder recallManagerTableInfo(RecallManagerTableInfo recallManagerTableInfo) {
                this.recallManagerTableInfo = recallManagerTableInfo;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RecallManagementJobs build() {
                return new RecallManagementJobs(this);
            } 

        } 

    }
}
