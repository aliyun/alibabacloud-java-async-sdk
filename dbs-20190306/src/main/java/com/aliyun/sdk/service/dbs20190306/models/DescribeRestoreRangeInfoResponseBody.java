// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreRangeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestoreRangeInfoResponseBody</p>
 */
public class DescribeRestoreRangeInfoResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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

        public DescribeRestoreRangeInfoResponseBody build() {
            return new DescribeRestoreRangeInfoResponseBody(this);
        } 

    } 

    public static class FullBackupDetail extends TeaModel {
        @NameInMap("BackupSetId")
        private String backupSetId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("StartTime")
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

            /**
             * BackupSetId.
             */
            public Builder backupSetId(String backupSetId) {
                this.backupSetId = backupSetId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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
    public static class FullBackupList extends TeaModel {
        @NameInMap("FullBackupDetail")
        private java.util.List < FullBackupDetail> fullBackupDetail;

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
        public java.util.List < FullBackupDetail> getFullBackupDetail() {
            return this.fullBackupDetail;
        }

        public static final class Builder {
            private java.util.List < FullBackupDetail> fullBackupDetail; 

            /**
             * FullBackupDetail.
             */
            public Builder fullBackupDetail(java.util.List < FullBackupDetail> fullBackupDetail) {
                this.fullBackupDetail = fullBackupDetail;
                return this;
            }

            public FullBackupList build() {
                return new FullBackupList(this);
            } 

        } 

    }
    public static class DBSRecoverRange extends TeaModel {
        @NameInMap("BeginTimestampForRestore")
        private Long beginTimestampForRestore;

        @NameInMap("EndTimestampForRestore")
        private Long endTimestampForRestore;

        @NameInMap("FullBackupList")
        private FullBackupList fullBackupList;

        @NameInMap("RangeType")
        private String rangeType;

        @NameInMap("SourceEndpointInstanceID")
        private String sourceEndpointInstanceID;

        @NameInMap("SourceEndpointInstanceType")
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

            /**
             * BeginTimestampForRestore.
             */
            public Builder beginTimestampForRestore(Long beginTimestampForRestore) {
                this.beginTimestampForRestore = beginTimestampForRestore;
                return this;
            }

            /**
             * EndTimestampForRestore.
             */
            public Builder endTimestampForRestore(Long endTimestampForRestore) {
                this.endTimestampForRestore = endTimestampForRestore;
                return this;
            }

            /**
             * FullBackupList.
             */
            public Builder fullBackupList(FullBackupList fullBackupList) {
                this.fullBackupList = fullBackupList;
                return this;
            }

            /**
             * RangeType.
             */
            public Builder rangeType(String rangeType) {
                this.rangeType = rangeType;
                return this;
            }

            /**
             * SourceEndpointInstanceID.
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * SourceEndpointInstanceType.
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
    public static class Items extends TeaModel {
        @NameInMap("DBSRecoverRange")
        private java.util.List < DBSRecoverRange> DBSRecoverRange;

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
        public java.util.List < DBSRecoverRange> getDBSRecoverRange() {
            return this.DBSRecoverRange;
        }

        public static final class Builder {
            private java.util.List < DBSRecoverRange> DBSRecoverRange; 

            /**
             * DBSRecoverRange.
             */
            public Builder DBSRecoverRange(java.util.List < DBSRecoverRange> DBSRecoverRange) {
                this.DBSRecoverRange = DBSRecoverRange;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
