// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetStructSyncOrderDetailResponseBody</p>
 */
public class GetStructSyncOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StructSyncOrderDetail")
    private StructSyncOrderDetail structSyncOrderDetail;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the schema synchronization ticket.</p>
         */
        public Builder structSyncOrderDetail(StructSyncOrderDetail structSyncOrderDetail) {
            this.structSyncOrderDetail = structSyncOrderDetail;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStructSyncOrderDetailResponseBody build() {
            return new GetStructSyncOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class SourceDatabaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SearchName")
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
             * <p>The ID of the source database.</p>
             * 
             * <strong>example:</strong>
             * <p>432532</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class SourceVersionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionId")
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
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
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
    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class TableInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceTableName")
        private String sourceTableName;

        @com.aliyun.core.annotation.NameInMap("TargetTableName")
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
             * <p>The name of the table whose schema you want to synchronize.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tbl</p>
             */
            public Builder sourceTableName(String sourceTableName) {
                this.sourceTableName = sourceTableName;
                return this;
            }

            /**
             * <p>The name of the table to which you want to synchronize the schema of a table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_tbl</p>
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
    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class TargetDatabaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SearchName")
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
             * <p>The ID of the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>432543</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The type of the environment to which the database instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/163309.html">Change the environment type of an instance</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>Indicates whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is not a logical database</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class TargetVersionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionId")
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
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>e179bbb8163dcdcfacda24858bedb4d8006ae2b8</p>
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
    /**
     * 
     * {@link GetStructSyncOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetStructSyncOrderDetailResponseBody</p>
     */
    public static class StructSyncOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreError")
        private Boolean ignoreError;

        @com.aliyun.core.annotation.NameInMap("SourceDatabaseInfo")
        private SourceDatabaseInfo sourceDatabaseInfo;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SourceVersionInfo")
        private SourceVersionInfo sourceVersionInfo;

        @com.aliyun.core.annotation.NameInMap("TableInfoList")
        private java.util.List < TableInfoList> tableInfoList;

        @com.aliyun.core.annotation.NameInMap("TargetDatabaseInfo")
        private TargetDatabaseInfo targetDatabaseInfo;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TargetVersionInfo")
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
             * <p>Indicates whether to skip errors. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: skips the error and continues to execute SQL statements.</li>
             * <li><strong>false</strong>: stops executing SQL statements.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * <p>The information about the source database.</p>
             */
            public Builder sourceDatabaseInfo(SourceDatabaseInfo sourceDatabaseInfo) {
                this.sourceDatabaseInfo = sourceDatabaseInfo;
                return this;
            }

            /**
             * <p>The schema version of the source database. Valid values:</p>
             * <ul>
             * <li><strong>DATASOURCE</strong>: the default latest version of the system</li>
             * <li><strong>VERSION</strong>: a previous schema version that you manually specify</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VERSION</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The version information about the source instance.</p>
             * <blockquote>
             * <p>This parameter is displayed only when the value of the <strong>SourceType</strong> parameter is <strong>VERSION</strong>.</p>
             * </blockquote>
             */
            public Builder sourceVersionInfo(SourceVersionInfo sourceVersionInfo) {
                this.sourceVersionInfo = sourceVersionInfo;
                return this;
            }

            /**
             * <p>The information about the table whose schema you want to synchronize.</p>
             */
            public Builder tableInfoList(java.util.List < TableInfoList> tableInfoList) {
                this.tableInfoList = tableInfoList;
                return this;
            }

            /**
             * <p>The information about the destination database.</p>
             */
            public Builder targetDatabaseInfo(TargetDatabaseInfo targetDatabaseInfo) {
                this.targetDatabaseInfo = targetDatabaseInfo;
                return this;
            }

            /**
             * <p>The schema version of the destination database. Valid values:</p>
             * <ul>
             * <li><strong>DATASOURCE</strong>: the default latest version of the system</li>
             * <li><strong>VERSION</strong>: a previous schema version that you manually specify</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATASOURCE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The version information about the destination instance.</p>
             * <blockquote>
             * <p>This parameter is displayed only when the value of the <strong>SourceType</strong> parameter is <strong>VERSION</strong>.</p>
             * </blockquote>
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
