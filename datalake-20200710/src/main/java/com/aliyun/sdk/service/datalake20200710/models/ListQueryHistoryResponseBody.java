// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryHistoryResponseBody</p>
 */
public class ListQueryHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListQueryHistoryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQueryHistoryResponseBody build() {
            return new ListQueryHistoryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Creator")
        private Long creator;

        @NameInMap("CreatorLoginName")
        private String creatorLoginName;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private String id;

        @NameInMap("JobCompleted")
        private Boolean jobCompleted;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResultOssPath")
        private String resultOssPath;

        @NameInMap("ResultTmpDb")
        private String resultTmpDb;

        @NameInMap("ResultTmpTable")
        private String resultTmpTable;

        @NameInMap("RowCount")
        private Integer rowCount;

        @NameInMap("RowCountOverLimit")
        private String rowCountOverLimit;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.creatorLoginName = builder.creatorLoginName;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.errorMessage = builder.errorMessage;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.jobCompleted = builder.jobCompleted;
            this.owner = builder.owner;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.resultOssPath = builder.resultOssPath;
            this.resultTmpDb = builder.resultTmpDb;
            this.resultTmpTable = builder.resultTmpTable;
            this.rowCount = builder.rowCount;
            this.rowCountOverLimit = builder.rowCountOverLimit;
            this.sql = builder.sql;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public Long getCreator() {
            return this.creator;
        }

        /**
         * @return creatorLoginName
         */
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return jobCompleted
         */
        public Boolean getJobCompleted() {
            return this.jobCompleted;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resultOssPath
         */
        public String getResultOssPath() {
            return this.resultOssPath;
        }

        /**
         * @return resultTmpDb
         */
        public String getResultTmpDb() {
            return this.resultTmpDb;
        }

        /**
         * @return resultTmpTable
         */
        public String getResultTmpTable() {
            return this.resultTmpTable;
        }

        /**
         * @return rowCount
         */
        public Integer getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rowCountOverLimit
         */
        public String getRowCountOverLimit() {
            return this.rowCountOverLimit;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
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

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Long creator; 
            private String creatorLoginName; 
            private Long duration; 
            private String endTime; 
            private String errorMessage; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private Boolean jobCompleted; 
            private String owner; 
            private Integer progress; 
            private String regionId; 
            private String resultOssPath; 
            private String resultTmpDb; 
            private String resultTmpTable; 
            private Integer rowCount; 
            private String rowCountOverLimit; 
            private String sql; 
            private String startTime; 
            private String status; 
            private Boolean success; 

            /**
             * Creator.
             */
            public Builder creator(Long creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorLoginName.
             */
            public Builder creatorLoginName(String creatorLoginName) {
                this.creatorLoginName = creatorLoginName;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * JobCompleted.
             */
            public Builder jobCompleted(Boolean jobCompleted) {
                this.jobCompleted = jobCompleted;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResultOssPath.
             */
            public Builder resultOssPath(String resultOssPath) {
                this.resultOssPath = resultOssPath;
                return this;
            }

            /**
             * ResultTmpDb.
             */
            public Builder resultTmpDb(String resultTmpDb) {
                this.resultTmpDb = resultTmpDb;
                return this;
            }

            /**
             * ResultTmpTable.
             */
            public Builder resultTmpTable(String resultTmpTable) {
                this.resultTmpTable = resultTmpTable;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Integer rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * RowCountOverLimit.
             */
            public Builder rowCountOverLimit(String rowCountOverLimit) {
                this.rowCountOverLimit = rowCountOverLimit;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
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

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
