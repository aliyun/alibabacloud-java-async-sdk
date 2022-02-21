// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreSummaryResponseBody</p>
 */
public class DescribeRestoreSummaryResponseBody extends TeaModel {
    @NameInMap("HasMoreRestoreRecord")
    private Integer hasMoreRestoreRecord;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rescords")
    private Rescords rescords;

    @NameInMap("Total")
    private Integer total;

    private DescribeRestoreSummaryResponseBody(Builder builder) {
        this.hasMoreRestoreRecord = builder.hasMoreRestoreRecord;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.rescords = builder.rescords;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return hasMoreRestoreRecord
     */
    public Integer getHasMoreRestoreRecord() {
        return this.hasMoreRestoreRecord;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rescords
     */
    public Rescords getRescords() {
        return this.rescords;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer hasMoreRestoreRecord; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Rescords rescords; 
        private Integer total; 

        /**
         * HasMoreRestoreRecord.
         */
        public Builder hasMoreRestoreRecord(Integer hasMoreRestoreRecord) {
            this.hasMoreRestoreRecord = hasMoreRestoreRecord;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Rescords.
         */
        public Builder rescords(Rescords rescords) {
            this.rescords = rescords;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeRestoreSummaryResponseBody build() {
            return new DescribeRestoreSummaryResponseBody(this);
        } 

    } 

    public static class Rescord extends TeaModel {
        @NameInMap("BulkLoadProcess")
        private String bulkLoadProcess;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("HfileRestoreProcess")
        private String hfileRestoreProcess;

        @NameInMap("LogProcess")
        private String logProcess;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("SchemaProcess")
        private String schemaProcess;

        @NameInMap("Status")
        private String status;

        private Rescord(Builder builder) {
            this.bulkLoadProcess = builder.bulkLoadProcess;
            this.createTime = builder.createTime;
            this.finishTime = builder.finishTime;
            this.hfileRestoreProcess = builder.hfileRestoreProcess;
            this.logProcess = builder.logProcess;
            this.recordId = builder.recordId;
            this.schemaProcess = builder.schemaProcess;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rescord create() {
            return builder().build();
        }

        /**
         * @return bulkLoadProcess
         */
        public String getBulkLoadProcess() {
            return this.bulkLoadProcess;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return hfileRestoreProcess
         */
        public String getHfileRestoreProcess() {
            return this.hfileRestoreProcess;
        }

        /**
         * @return logProcess
         */
        public String getLogProcess() {
            return this.logProcess;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return schemaProcess
         */
        public String getSchemaProcess() {
            return this.schemaProcess;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bulkLoadProcess; 
            private String createTime; 
            private String finishTime; 
            private String hfileRestoreProcess; 
            private String logProcess; 
            private String recordId; 
            private String schemaProcess; 
            private String status; 

            /**
             * BulkLoadProcess.
             */
            public Builder bulkLoadProcess(String bulkLoadProcess) {
                this.bulkLoadProcess = bulkLoadProcess;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * HfileRestoreProcess.
             */
            public Builder hfileRestoreProcess(String hfileRestoreProcess) {
                this.hfileRestoreProcess = hfileRestoreProcess;
                return this;
            }

            /**
             * LogProcess.
             */
            public Builder logProcess(String logProcess) {
                this.logProcess = logProcess;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * SchemaProcess.
             */
            public Builder schemaProcess(String schemaProcess) {
                this.schemaProcess = schemaProcess;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Rescord build() {
                return new Rescord(this);
            } 

        } 

    }
    public static class Rescords extends TeaModel {
        @NameInMap("Rescord")
        private java.util.List < Rescord> rescord;

        private Rescords(Builder builder) {
            this.rescord = builder.rescord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rescords create() {
            return builder().build();
        }

        /**
         * @return rescord
         */
        public java.util.List < Rescord> getRescord() {
            return this.rescord;
        }

        public static final class Builder {
            private java.util.List < Rescord> rescord; 

            /**
             * Rescord.
             */
            public Builder rescord(java.util.List < Rescord> rescord) {
                this.rescord = rescord;
                return this;
            }

            public Rescords build() {
                return new Rescords(this);
            } 

        } 

    }
}
