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
 * {@link GetRecallManagementJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecallManagementJobResponseBody</p>
 */
public class GetRecallManagementJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Log")
    private String log;

    @com.aliyun.core.annotation.NameInMap("RecallManagementJobId")
    private String recallManagementJobId;

    @com.aliyun.core.annotation.NameInMap("RecallManagementTableInfo")
    private RecallManagementTableInfo recallManagementTableInfo;

    @com.aliyun.core.annotation.NameInMap("RecallManagerTableInfo")
    private RecallManagerTableInfo recallManagerTableInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetRecallManagementJobResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.log = builder.log;
        this.recallManagementJobId = builder.recallManagementJobId;
        this.recallManagementTableInfo = builder.recallManagementTableInfo;
        this.recallManagerTableInfo = builder.recallManagerTableInfo;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return log
     */
    public String getLog() {
        return this.log;
    }

    /**
     * @return recallManagementJobId
     */
    public String getRecallManagementJobId() {
        return this.recallManagementJobId;
    }

    /**
     * @return recallManagementTableInfo
     */
    public RecallManagementTableInfo getRecallManagementTableInfo() {
        return this.recallManagementTableInfo;
    }

    /**
     * @return recallManagerTableInfo
     */
    public RecallManagerTableInfo getRecallManagerTableInfo() {
        return this.recallManagerTableInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String log; 
        private String recallManagementJobId; 
        private RecallManagementTableInfo recallManagementTableInfo; 
        private RecallManagerTableInfo recallManagerTableInfo; 
        private String requestId; 
        private String startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetRecallManagementJobResponseBody model) {
            this.endTime = model.endTime;
            this.log = model.log;
            this.recallManagementJobId = model.recallManagementJobId;
            this.recallManagementTableInfo = model.recallManagementTableInfo;
            this.recallManagerTableInfo = model.recallManagerTableInfo;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The time when the job ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The log of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;success&quot;</p>
         */
        public Builder log(String log) {
            this.log = log;
            return this;
        }

        /**
         * <p>The recall management job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recallManagementJobId(String recallManagementJobId) {
            this.recallManagementJobId = recallManagementJobId;
            return this;
        }

        /**
         * <p>Details of the recall management table.</p>
         */
        public Builder recallManagementTableInfo(RecallManagementTableInfo recallManagementTableInfo) {
            this.recallManagementTableInfo = recallManagementTableInfo;
            return this;
        }

        /**
         * <p>Details of the recall management table.</p>
         */
        public Builder recallManagerTableInfo(RecallManagerTableInfo recallManagerTableInfo) {
            this.recallManagerTableInfo = recallManagerTableInfo;
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
         * <p>The time when the job started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T22:24:33.132</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The status of the job. Valid values are:</p>
         * <ul>
         * <li><p><code>Init</code>: Initializing.</p>
         * </li>
         * <li><p><code>Running</code>: Running.</p>
         * </li>
         * <li><p><code>Success</code>: Successful.</p>
         * </li>
         * <li><p><code>Failed</code>: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRecallManagementJobResponseBody build() {
            return new GetRecallManagementJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecallManagementJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementJobResponseBody</p>
     */
    public static class RecallManagementTableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataVersion")
        private String dataVersion;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersionId")
        private String recallManagementTableVersionId;

        @com.aliyun.core.annotation.NameInMap("SourceTableDataSize")
        private String sourceTableDataSize;

        @com.aliyun.core.annotation.NameInMap("SourceTableRowCount")
        private String sourceTableRowCount;

        private RecallManagementTableInfo(Builder builder) {
            this.dataVersion = builder.dataVersion;
            this.recallManagementTableVersionId = builder.recallManagementTableVersionId;
            this.sourceTableDataSize = builder.sourceTableDataSize;
            this.sourceTableRowCount = builder.sourceTableRowCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementTableInfo create() {
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

            private Builder(RecallManagementTableInfo model) {
                this.dataVersion = model.dataVersion;
                this.recallManagementTableVersionId = model.recallManagementTableVersionId;
                this.sourceTableDataSize = model.sourceTableDataSize;
                this.sourceTableRowCount = model.sourceTableRowCount;
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
             * <p>The recall management table version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20250101000</p>
             */
            public Builder recallManagementTableVersionId(String recallManagementTableVersionId) {
                this.recallManagementTableVersionId = recallManagementTableVersionId;
                return this;
            }

            /**
             * <p>The data size of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder sourceTableDataSize(String sourceTableDataSize) {
                this.sourceTableDataSize = sourceTableDataSize;
                return this;
            }

            /**
             * <p>The number of rows in the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder sourceTableRowCount(String sourceTableRowCount) {
                this.sourceTableRowCount = sourceTableRowCount;
                return this;
            }

            public RecallManagementTableInfo build() {
                return new RecallManagementTableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRecallManagementJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementJobResponseBody</p>
     */
    public static class RecallManagerTableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataVersion")
        private String dataVersion;

        @com.aliyun.core.annotation.NameInMap("RecallManagerTableVersionId")
        private String recallManagerTableVersionId;

        @com.aliyun.core.annotation.NameInMap("SourceTableDataSize")
        private String sourceTableDataSize;

        @com.aliyun.core.annotation.NameInMap("SourceTableRowCount")
        private String sourceTableRowCount;

        private RecallManagerTableInfo(Builder builder) {
            this.dataVersion = builder.dataVersion;
            this.recallManagerTableVersionId = builder.recallManagerTableVersionId;
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
         * @return recallManagerTableVersionId
         */
        public String getRecallManagerTableVersionId() {
            return this.recallManagerTableVersionId;
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
            private String recallManagerTableVersionId; 
            private String sourceTableDataSize; 
            private String sourceTableRowCount; 

            private Builder() {
            } 

            private Builder(RecallManagerTableInfo model) {
                this.dataVersion = model.dataVersion;
                this.recallManagerTableVersionId = model.recallManagerTableVersionId;
                this.sourceTableDataSize = model.sourceTableDataSize;
                this.sourceTableRowCount = model.sourceTableRowCount;
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
             * <p>The recall management table version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20250101000</p>
             */
            public Builder recallManagerTableVersionId(String recallManagerTableVersionId) {
                this.recallManagerTableVersionId = recallManagerTableVersionId;
                return this;
            }

            /**
             * <p>The data size of the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder sourceTableDataSize(String sourceTableDataSize) {
                this.sourceTableDataSize = sourceTableDataSize;
                return this;
            }

            /**
             * <p>The number of rows in the source table.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
}
