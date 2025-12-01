// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreRangeInfoResponseBody</p>
 */
public class DescribeRestoreRangeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeRestoreRangeInfoResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreRangeInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
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

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Items items; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeRestoreRangeInfoResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The information about the time ranges to which you can restore data.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E2BD9DFC-6760-5F49-97C5-DA739E29****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRestoreRangeInfoResponseBody build() {
            return new DescribeRestoreRangeInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreRangeInfoResponseBody</p>
     */
    public static class FullBackupDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetId")
        private String backupSetId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private FullBackupDetail(Builder builder) {
            this.backupSetId = builder.backupSetId;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullBackupDetail create() {
            return builder().build();
        }

        /**
         * @return backupSetId
         */
        public String getBackupSetId() {
            return this.backupSetId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String backupSetId; 
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(FullBackupDetail model) {
                this.backupSetId = model.backupSetId;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The ID of the backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>qecnsxkd****</p>
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * <p>The end time of the full backup task. Example: 1646760308000.</p>
             * 
             * <strong>example:</strong>
             * <p>1646760308000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the full backup task. Example: 1646760282000.</p>
             * 
             * <strong>example:</strong>
             * <p>1646760282000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public FullBackupDetail build() {
                return new FullBackupDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreRangeInfoResponseBody</p>
     */
    public static class FullBackupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullBackupDetail")
        private java.util.List<FullBackupDetail> fullBackupDetail;

        private FullBackupList(Builder builder) {
            this.fullBackupDetail = builder.fullBackupDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullBackupList create() {
            return builder().build();
        }

        /**
         * @return fullBackupDetail
         */
        public java.util.List<FullBackupDetail> getFullBackupDetail() {
            return this.fullBackupDetail;
        }

        public static final class Builder {
            private java.util.List<FullBackupDetail> fullBackupDetail; 

            private Builder() {
            } 

            private Builder(FullBackupList model) {
                this.fullBackupDetail = model.fullBackupDetail;
            } 

            /**
             * FullBackupDetail.
             */
            public Builder fullBackupDetail(java.util.List<FullBackupDetail> fullBackupDetail) {
                this.fullBackupDetail = fullBackupDetail;
                return this;
            }

            public FullBackupList build() {
                return new FullBackupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreRangeInfoResponseBody</p>
     */
    public static class DBSRecoverRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTimestampForRestore")
        private Long beginTimestampForRestore;

        @com.aliyun.core.annotation.NameInMap("EndTimestampForRestore")
        private Long endTimestampForRestore;

        @com.aliyun.core.annotation.NameInMap("FullBackupList")
        private FullBackupList fullBackupList;

        @com.aliyun.core.annotation.NameInMap("RangeType")
        private String rangeType;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
        private String sourceEndpointInstanceID;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceType")
        private String sourceEndpointInstanceType;

        private DBSRecoverRange(Builder builder) {
            this.beginTimestampForRestore = builder.beginTimestampForRestore;
            this.endTimestampForRestore = builder.endTimestampForRestore;
            this.fullBackupList = builder.fullBackupList;
            this.rangeType = builder.rangeType;
            this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
            this.sourceEndpointInstanceType = builder.sourceEndpointInstanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBSRecoverRange create() {
            return builder().build();
        }

        /**
         * @return beginTimestampForRestore
         */
        public Long getBeginTimestampForRestore() {
            return this.beginTimestampForRestore;
        }

        /**
         * @return endTimestampForRestore
         */
        public Long getEndTimestampForRestore() {
            return this.endTimestampForRestore;
        }

        /**
         * @return fullBackupList
         */
        public FullBackupList getFullBackupList() {
            return this.fullBackupList;
        }

        /**
         * @return rangeType
         */
        public String getRangeType() {
            return this.rangeType;
        }

        /**
         * @return sourceEndpointInstanceID
         */
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        /**
         * @return sourceEndpointInstanceType
         */
        public String getSourceEndpointInstanceType() {
            return this.sourceEndpointInstanceType;
        }

        public static final class Builder {
            private Long beginTimestampForRestore; 
            private Long endTimestampForRestore; 
            private FullBackupList fullBackupList; 
            private String rangeType; 
            private String sourceEndpointInstanceID; 
            private String sourceEndpointInstanceType; 

            private Builder() {
            } 

            private Builder(DBSRecoverRange model) {
                this.beginTimestampForRestore = model.beginTimestampForRestore;
                this.endTimestampForRestore = model.endTimestampForRestore;
                this.fullBackupList = model.fullBackupList;
                this.rangeType = model.rangeType;
                this.sourceEndpointInstanceID = model.sourceEndpointInstanceID;
                this.sourceEndpointInstanceType = model.sourceEndpointInstanceType;
            } 

            /**
             * <p>The beginning of the time range to which you can restore data.</p>
             * 
             * <strong>example:</strong>
             * <p>1646760282000</p>
             */
            public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
                this.beginTimestampForRestore = beginTimestampForRestore;
                return this;
            }

            /**
             * <p>The end of the time range to which you can restore data.</p>
             * 
             * <strong>example:</strong>
             * <p>1646760308000</p>
             */
            public Builder endTimestampForRestore(Long endTimestampForRestore) {
                this.endTimestampForRestore = endTimestampForRestore;
                return this;
            }

            /**
             * <p>If the value of the RangeType parameter is point, this parameter is returned. The value of this parameter describes information about all backup points in the time range.</p>
             */
            public Builder fullBackupList(FullBackupList fullBackupList) {
                this.fullBackupList = fullBackupList;
                return this;
            }

            /**
             * <p>The type of the time range to which you can restore data.</p>
             * <ul>
             * <li><strong>point</strong>: The time range contains discrete points in time at which full backups were performed.</li>
             * <li><strong>range</strong>: The time range is a period of time for which continuous backup is performed. You can specify a random point in time in the time range to restore data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>point</p>
             */
            public Builder rangeType(String rangeType) {
                this.rangeType = rangeType;
                return this;
            }

            /**
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp106x9tk2c91****</p>
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * <p>The location of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
                this.sourceEndpointInstanceType = sourceEndpointInstanceType;
                return this;
            }

            public DBSRecoverRange build() {
                return new DBSRecoverRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestoreRangeInfoResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBSRecoverRange")
        private java.util.List<DBSRecoverRange> DBSRecoverRange;

        private Items(Builder builder) {
            this.DBSRecoverRange = builder.DBSRecoverRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBSRecoverRange
         */
        public java.util.List<DBSRecoverRange> getDBSRecoverRange() {
            return this.DBSRecoverRange;
        }

        public static final class Builder {
            private java.util.List<DBSRecoverRange> DBSRecoverRange; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBSRecoverRange = model.DBSRecoverRange;
            } 

            /**
             * DBSRecoverRange.
             */
            public Builder DBSRecoverRange(java.util.List<DBSRecoverRange> DBSRecoverRange) {
                this.DBSRecoverRange = DBSRecoverRange;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
