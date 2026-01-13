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
            this.recallManagerTableInfo = model.recallManagerTableInfo;
            this.requestId = model.requestId;
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
         * Log.
         */
        public Builder log(String log) {
            this.log = log;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
             * DataVersion.
             */
            public Builder dataVersion(String dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * RecallManagerTableVersionId.
             */
            public Builder recallManagerTableVersionId(String recallManagerTableVersionId) {
                this.recallManagerTableVersionId = recallManagerTableVersionId;
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
}
