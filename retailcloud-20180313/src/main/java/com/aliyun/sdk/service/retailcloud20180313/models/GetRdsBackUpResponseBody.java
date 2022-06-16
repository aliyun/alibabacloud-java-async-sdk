// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRdsBackUpResponseBody} extends {@link TeaModel}
 *
 * <p>GetRdsBackUpResponseBody</p>
 */
public class GetRdsBackUpResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ErrMsg")
    private String errMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetRdsBackUpResponseBody(Builder builder) {
        this.code = builder.code;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRdsBackUpResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String errMsg; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ErrMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetRdsBackUpResponseBody build() {
            return new GetRdsBackUpResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("BackupDBNames")
        private String backupDBNames;

        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupExtractionStatus")
        private String backupExtractionStatus;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupLocation")
        private String backupLocation;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupScale")
        private String backupScale;

        @NameInMap("BackupSize")
        private Long backupSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("HostInstanceID")
        private String hostInstanceID;

        @NameInMap("MetaStatus")
        private String metaStatus;

        @NameInMap("StoreStatus")
        private String storeStatus;

        @NameInMap("TotalBackupSize")
        private Long totalBackupSize;

        private Items(Builder builder) {
            this.backupDBNames = builder.backupDBNames;
            this.backupEndTime = builder.backupEndTime;
            this.backupExtractionStatus = builder.backupExtractionStatus;
            this.backupId = builder.backupId;
            this.backupLocation = builder.backupLocation;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupScale = builder.backupScale;
            this.backupSize = builder.backupSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.DBInstanceId = builder.DBInstanceId;
            this.hostInstanceID = builder.hostInstanceID;
            this.metaStatus = builder.metaStatus;
            this.storeStatus = builder.storeStatus;
            this.totalBackupSize = builder.totalBackupSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupDBNames
         */
        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupExtractionStatus
         */
        public String getBackupExtractionStatus() {
            return this.backupExtractionStatus;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupLocation
         */
        public String getBackupLocation() {
            return this.backupLocation;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupScale
         */
        public String getBackupScale() {
            return this.backupScale;
        }

        /**
         * @return backupSize
         */
        public Long getBackupSize() {
            return this.backupSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return hostInstanceID
         */
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        /**
         * @return metaStatus
         */
        public String getMetaStatus() {
            return this.metaStatus;
        }

        /**
         * @return storeStatus
         */
        public String getStoreStatus() {
            return this.storeStatus;
        }

        /**
         * @return totalBackupSize
         */
        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

        public static final class Builder {
            private String backupDBNames; 
            private String backupEndTime; 
            private String backupExtractionStatus; 
            private String backupId; 
            private String backupLocation; 
            private String backupMethod; 
            private String backupMode; 
            private String backupScale; 
            private Long backupSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String DBInstanceId; 
            private String hostInstanceID; 
            private String metaStatus; 
            private String storeStatus; 
            private Long totalBackupSize; 

            /**
             * BackupDBNames.
             */
            public Builder backupDBNames(String backupDBNames) {
                this.backupDBNames = backupDBNames;
                return this;
            }

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupExtractionStatus.
             */
            public Builder backupExtractionStatus(String backupExtractionStatus) {
                this.backupExtractionStatus = backupExtractionStatus;
                return this;
            }

            /**
             * BackupId.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * BackupLocation.
             */
            public Builder backupLocation(String backupLocation) {
                this.backupLocation = backupLocation;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupMode.
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * BackupScale.
             */
            public Builder backupScale(String backupScale) {
                this.backupScale = backupScale;
                return this;
            }

            /**
             * BackupSize.
             */
            public Builder backupSize(Long backupSize) {
                this.backupSize = backupSize;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupStatus.
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * HostInstanceID.
             */
            public Builder hostInstanceID(String hostInstanceID) {
                this.hostInstanceID = hostInstanceID;
                return this;
            }

            /**
             * MetaStatus.
             */
            public Builder metaStatus(String metaStatus) {
                this.metaStatus = metaStatus;
                return this;
            }

            /**
             * StoreStatus.
             */
            public Builder storeStatus(String storeStatus) {
                this.storeStatus = storeStatus;
                return this;
            }

            /**
             * TotalBackupSize.
             */
            public Builder totalBackupSize(Long totalBackupSize) {
                this.totalBackupSize = totalBackupSize;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("PageNumber")
        private String pageNumber;

        @NameInMap("PageRecordCount")
        private String pageRecordCount;

        @NameInMap("TotalBackupSize")
        private Long totalBackupSize;

        @NameInMap("TotalRecordCount")
        private String totalRecordCount;

        private Result(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageRecordCount = builder.pageRecordCount;
            this.totalBackupSize = builder.totalBackupSize;
            this.totalRecordCount = builder.totalRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageRecordCount
         */
        public String getPageRecordCount() {
            return this.pageRecordCount;
        }

        /**
         * @return totalBackupSize
         */
        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

        /**
         * @return totalRecordCount
         */
        public String getTotalRecordCount() {
            return this.totalRecordCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String pageNumber; 
            private String pageRecordCount; 
            private Long totalBackupSize; 
            private String totalRecordCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageRecordCount.
             */
            public Builder pageRecordCount(String pageRecordCount) {
                this.pageRecordCount = pageRecordCount;
                return this;
            }

            /**
             * TotalBackupSize.
             */
            public Builder totalBackupSize(Long totalBackupSize) {
                this.totalBackupSize = totalBackupSize;
                return this;
            }

            /**
             * TotalRecordCount.
             */
            public Builder totalRecordCount(String totalRecordCount) {
                this.totalRecordCount = totalRecordCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
