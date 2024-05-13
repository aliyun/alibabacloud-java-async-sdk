// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataImportOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataImportOrderRequest</p>
 */
public class CreateDataImportOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentKey")
    private String attachmentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private Param param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateDataImportOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attachmentKey = builder.attachmentKey;
        this.comment = builder.comment;
        this.param = builder.param;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataImportOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attachmentKey
     */
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List < Long > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateDataImportOrderRequest, Builder> {
        private String regionId; 
        private String attachmentKey; 
        private String comment; 
        private Param param; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataImportOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attachmentKey = request.attachmentKey;
            this.comment = request.comment;
            this.param = request.param;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * The purpose or objective of the data import. This parameter is used to help reduce unnecessary communication.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The parameters of the ticket.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * The stakeholders of the data import. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataImportOrderRequest build() {
            return new CreateDataImportOrderRequest(this);
        } 

    } 

    public static class DbItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("Logic")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean logic;

        private DbItemList(Builder builder) {
            this.dbId = builder.dbId;
            this.logic = builder.logic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbItemList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return logic
         */
        public Boolean getLogic() {
            return this.logic;
        }

        public static final class Builder {
            private Long dbId; 
            private Boolean logic; 

            /**
             * The ID of the database. The database can be a physical database or a logical database.
             * <p>
             * 
             * *   To obtain the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
             * *   To obtain the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * Specifies whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**: The database is a logical database.
             * *   **false**: The database is a physical database.
             * 
             * >  If you set this parameter to **true**, the database that you specify must be a logical database.
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            public DbItemList build() {
                return new DbItemList(this);
            } 

        } 

    }
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String attachmentName;

        @com.aliyun.core.annotation.NameInMap("Classify")
        private String classify;

        @com.aliyun.core.annotation.NameInMap("CsvFirstRowIsColumnDef")
        private Boolean csvFirstRowIsColumnDef;

        @com.aliyun.core.annotation.NameInMap("DbItemList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < DbItemList> dbItemList;

        @com.aliyun.core.annotation.NameInMap("FileEncoding")
        private String fileEncoding;

        @com.aliyun.core.annotation.NameInMap("FileType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("IgnoreError")
        private Boolean ignoreError;

        @com.aliyun.core.annotation.NameInMap("ImportMode")
        private String importMode;

        @com.aliyun.core.annotation.NameInMap("InsertType")
        private String insertType;

        @com.aliyun.core.annotation.NameInMap("RollbackAttachmentName")
        private String rollbackAttachmentName;

        @com.aliyun.core.annotation.NameInMap("RollbackSQL")
        private String rollbackSQL;

        @com.aliyun.core.annotation.NameInMap("RollbackSqlType")
        private String rollbackSqlType;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Param(Builder builder) {
            this.attachmentName = builder.attachmentName;
            this.classify = builder.classify;
            this.csvFirstRowIsColumnDef = builder.csvFirstRowIsColumnDef;
            this.dbItemList = builder.dbItemList;
            this.fileEncoding = builder.fileEncoding;
            this.fileType = builder.fileType;
            this.ignoreError = builder.ignoreError;
            this.importMode = builder.importMode;
            this.insertType = builder.insertType;
            this.rollbackAttachmentName = builder.rollbackAttachmentName;
            this.rollbackSQL = builder.rollbackSQL;
            this.rollbackSqlType = builder.rollbackSqlType;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return attachmentName
         */
        public String getAttachmentName() {
            return this.attachmentName;
        }

        /**
         * @return classify
         */
        public String getClassify() {
            return this.classify;
        }

        /**
         * @return csvFirstRowIsColumnDef
         */
        public Boolean getCsvFirstRowIsColumnDef() {
            return this.csvFirstRowIsColumnDef;
        }

        /**
         * @return dbItemList
         */
        public java.util.List < DbItemList> getDbItemList() {
            return this.dbItemList;
        }

        /**
         * @return fileEncoding
         */
        public String getFileEncoding() {
            return this.fileEncoding;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return ignoreError
         */
        public Boolean getIgnoreError() {
            return this.ignoreError;
        }

        /**
         * @return importMode
         */
        public String getImportMode() {
            return this.importMode;
        }

        /**
         * @return insertType
         */
        public String getInsertType() {
            return this.insertType;
        }

        /**
         * @return rollbackAttachmentName
         */
        public String getRollbackAttachmentName() {
            return this.rollbackAttachmentName;
        }

        /**
         * @return rollbackSQL
         */
        public String getRollbackSQL() {
            return this.rollbackSQL;
        }

        /**
         * @return rollbackSqlType
         */
        public String getRollbackSqlType() {
            return this.rollbackSqlType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String attachmentName; 
            private String classify; 
            private Boolean csvFirstRowIsColumnDef; 
            private java.util.List < DbItemList> dbItemList; 
            private String fileEncoding; 
            private String fileType; 
            private Boolean ignoreError; 
            private String importMode; 
            private String insertType; 
            private String rollbackAttachmentName; 
            private String rollbackSQL; 
            private String rollbackSqlType; 
            private String tableName; 

            /**
             * The key of the attachment that contains the SQL statements used to import data. You can call the [GetUserUploadFileJob](~~206069~~) operation to the attachment key from the value of the AttachmentKey parameter.
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * The reason for the data import.
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * The type of the CSV file. Valid values:
             * <p>
             * 
             * *   **true**: The first row in the CSV file contains field names.
             * *   **false**: The first row in the CSV file contains data.
             * 
             * >  This parameter is required if you set the **FileType** parameter to **CSV**.
             */
            public Builder csvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
                this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
                return this;
            }

            /**
             * The database to which you want to import data. You can specify only one database.
             */
            public Builder dbItemList(java.util.List < DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * The encoding algorithm to be used by the destination database. Valid values:
             * <p>
             * 
             * *   **AUTO**: automatic identification
             * *   **UTF-8**: UTF-8 encoding
             * *   **GBK**: GBK encoding
             * *   **ISO-8859-1**: ISO-8859-1 encoding
             */
            public Builder fileEncoding(String fileEncoding) {
                this.fileEncoding = fileEncoding;
                return this;
            }

            /**
             * The format of the file for the data import. Valid values:
             * <p>
             * 
             * *   **SQL**: an SQL file
             * *   **CSV**: a CSV file
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Specifies whether to skip an error that occurs. Valid values:
             * <p>
             * 
             * *   **true**: skips the error and continues to execute SQL statements.
             * *   **false**: stops executing SQL statements.
             */
            public Builder ignoreError(Boolean ignoreError) {
                this.ignoreError = ignoreError;
                return this;
            }

            /**
             * The import mode. Valid values:
             * <p>
             * 
             * *   **FAST_MODE**: In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.
             * *   **SAFE_MODE**: In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. This mode can be used to import data in a more secure but less efficient manner.
             */
            public Builder importMode(String importMode) {
                this.importMode = importMode;
                return this;
            }

            /**
             * The mode in which the data in the CSV format is to be written to the destination table. Valid values:
             * <p>
             * 
             * *   **INSERT**: The database checks the primary key when data is written. If a duplicate primary key value exists, an error message is returned.
             * *   **INSERT_IGNORE**: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.
             * *   **REPLACE_INTO**: If the imported data contains a row that has the same value for the primary key or unique index as one row in the destination table, the database deletes the existing row and inserts the new row into the destination table.
             * 
             * >  This parameter is required if you set the **FileType** parameter to **CSV**.
             */
            public Builder insertType(String insertType) {
                this.insertType = insertType;
                return this;
            }

            /**
             * The key of the attachment that contains the SQL statements used to roll back the data import. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
             * <p>
             * 
             * >  This parameter is required if you set the **RollbackSqlType** parameter to **ATTACHMENT**.
             */
            public Builder rollbackAttachmentName(String rollbackAttachmentName) {
                this.rollbackAttachmentName = rollbackAttachmentName;
                return this;
            }

            /**
             * The SQL statements used to roll back the data import.
             * <p>
             * 
             * >  This parameter is required if you set the **RollbackSqlType** parameter to **TEXT**.
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * The format of the SQL statements used to roll back the data import. Valid values:
             * <p>
             * 
             * *   **TEXT**: text
             * *   **ATTACHMENT**: attachment
             */
            public Builder rollbackSqlType(String rollbackSqlType) {
                this.rollbackSqlType = rollbackSqlType;
                return this;
            }

            /**
             * The destination table to which you want to import the data in the CSV format.
             * <p>
             * 
             * >  This parameter is required if you set the **FileType** parameter to **CSV**.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
