// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncOrderDetailResponseBody</p>
 */
public class GetStructSyncOrderDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StructSyncOrderDetail")
    private StructSyncOrderDetail structSyncOrderDetail;

    @NameInMap("Success")
    private Boolean success;

    private GetStructSyncOrderDetailResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.structSyncOrderDetail = builder.structSyncOrderDetail;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return structSyncOrderDetail
     */
    public StructSyncOrderDetail getStructSyncOrderDetail() {
        return this.structSyncOrderDetail;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private StructSyncOrderDetail structSyncOrderDetail; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StructSyncOrderDetail.
         */
        public Builder structSyncOrderDetail(StructSyncOrderDetail structSyncOrderDetail) {
            this.structSyncOrderDetail = structSyncOrderDetail;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncOrderDetailResponseBody build() {
            return new GetStructSyncOrderDetailResponseBody(this);
        } 

    } 

    public static class SourceDatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("SearchName")
        private String searchName;

        private SourceDatabaseInfo(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDatabaseInfo create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String searchName; 

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * SearchName.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public SourceDatabaseInfo build() {
                return new SourceDatabaseInfo(this);
            } 

        } 

    }
    public static class SourceVersionInfo extends TeaModel {
        @NameInMap("VersionId")
        private String versionId;

        private SourceVersionInfo(Builder builder) {
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceVersionInfo create() {
            return builder().build();
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String versionId; 

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public SourceVersionInfo build() {
                return new SourceVersionInfo(this);
            } 

        } 

    }
    public static class TableInfoList extends TeaModel {
        @NameInMap("SourceTableName")
        private String sourceTableName;

        @NameInMap("TargetTableName")
        private String targetTableName;

        private TableInfoList(Builder builder) {
            this.sourceTableName = builder.sourceTableName;
            this.targetTableName = builder.targetTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfoList create() {
            return builder().build();
        }

        /**
         * @return sourceTableName
         */
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        /**
         * @return targetTableName
         */
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public static final class Builder {
            private String sourceTableName; 
            private String targetTableName; 

            /**
             * SourceTableName.
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * TargetTableName.
             */
            public Builder targetTableName(String targetTableName) {
                this.targetTableName = targetTableName;
                return this;
            }

            public TableInfoList build() {
                return new TableInfoList(this);
            } 

        } 

    }
    public static class TargetDatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Logic")
        private Boolean logic;

        @NameInMap("SearchName")
        private String searchName;

        private TargetDatabaseInfo(Builder builder) {
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetDatabaseInfo create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private Long dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String searchName; 

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * SearchName.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public TargetDatabaseInfo build() {
                return new TargetDatabaseInfo(this);
            } 

        } 

    }
    public static class TargetVersionInfo extends TeaModel {
        @NameInMap("VersionId")
        private String versionId;

        private TargetVersionInfo(Builder builder) {
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetVersionInfo create() {
            return builder().build();
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String versionId; 

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public TargetVersionInfo build() {
                return new TargetVersionInfo(this);
            } 

        } 

    }
    public static class StructSyncOrderDetail extends TeaModel {
        @NameInMap("IgnoreError")
        private Boolean ignoreError;

        @NameInMap("SourceDatabaseInfo")
        private SourceDatabaseInfo sourceDatabaseInfo;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("SourceVersionInfo")
        private SourceVersionInfo sourceVersionInfo;

        @NameInMap("TableInfoList")
        private java.util.List < TableInfoList> tableInfoList;

        @NameInMap("TargetDatabaseInfo")
        private TargetDatabaseInfo targetDatabaseInfo;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TargetVersionInfo")
        private TargetVersionInfo targetVersionInfo;

        private StructSyncOrderDetail(Builder builder) {
            this.ignoreError = builder.ignoreError;
            this.sourceDatabaseInfo = builder.sourceDatabaseInfo;
            this.sourceType = builder.sourceType;
            this.sourceVersionInfo = builder.sourceVersionInfo;
            this.tableInfoList = builder.tableInfoList;
            this.targetDatabaseInfo = builder.targetDatabaseInfo;
            this.targetType = builder.targetType;
            this.targetVersionInfo = builder.targetVersionInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructSyncOrderDetail create() {
            return builder().build();
        }

        /**
         * @return ignoreError
         */
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        /**
         * @return sourceDatabaseInfo
         */
        public SourceDatabaseInfo getSourceDatabaseInfo() {
            return this.sourceDatabaseInfo;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceVersionInfo
         */
        public SourceVersionInfo getSourceVersionInfo() {
            return this.sourceVersionInfo;
        }

        /**
         * @return tableInfoList
         */
        public java.util.List < TableInfoList> getTableInfoList() {
            return this.tableInfoList;
        }

        /**
         * @return targetDatabaseInfo
         */
        public TargetDatabaseInfo getTargetDatabaseInfo() {
            return this.targetDatabaseInfo;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return targetVersionInfo
         */
        public TargetVersionInfo getTargetVersionInfo() {
            return this.targetVersionInfo;
        }

        public static final class Builder {
            private Boolean ignoreError; 
            private SourceDatabaseInfo sourceDatabaseInfo; 
            private String sourceType; 
            private SourceVersionInfo sourceVersionInfo; 
            private java.util.List < TableInfoList> tableInfoList; 
            private TargetDatabaseInfo targetDatabaseInfo; 
            private String targetType; 
            private TargetVersionInfo targetVersionInfo; 

            /**
             * IgnoreError.
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * SourceDatabaseInfo.
             */
            public Builder sourceDatabaseInfo(SourceDatabaseInfo sourceDatabaseInfo) {
                this.sourceDatabaseInfo = sourceDatabaseInfo;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * SourceVersionInfo.
             */
            public Builder sourceVersionInfo(SourceVersionInfo sourceVersionInfo) {
                this.sourceVersionInfo = sourceVersionInfo;
                return this;
            }

            /**
             * TableInfoList.
             */
            public Builder tableInfoList(java.util.List < TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * TargetDatabaseInfo.
             */
            public Builder targetDatabaseInfo(TargetDatabaseInfo targetDatabaseInfo) {
                this.targetDatabaseInfo = targetDatabaseInfo;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TargetVersionInfo.
             */
            public Builder targetVersionInfo(TargetVersionInfo targetVersionInfo) {
                this.targetVersionInfo = targetVersionInfo;
                return this;
            }

            public StructSyncOrderDetail build() {
                return new StructSyncOrderDetail(this);
            } 

        } 

    }
}
