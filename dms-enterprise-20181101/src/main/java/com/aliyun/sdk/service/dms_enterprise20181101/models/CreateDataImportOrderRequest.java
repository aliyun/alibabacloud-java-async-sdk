// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
    private java.util.List<Long> relatedUserList;

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
    public java.util.List<Long> getRelatedUserList() {
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
        private java.util.List<Long> relatedUserList; 
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
         * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>order_attachment.txt</p>
         */
        public Builder attachmentKey(String attachmentKey) {
            this.putQueryParameter("AttachmentKey", attachmentKey);
            this.attachmentKey = attachmentKey;
            return this;
        }

        /**
         * <p>The purpose or objective of the data import. This parameter is used to help reduce unnecessary communication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The parameters of the ticket.</p>
         * <p>This parameter is required.</p>
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * <p>The stakeholders of the data import. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
         */
        public Builder relatedUserList(java.util.List<Long> relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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

    /**
     * 
     * {@link CreateDataImportOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataImportOrderRequest</p>
     */
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
             * <p>The ID of the database. The database can be a physical database or a logical database.</p>
             * <ul>
             * <li>To obtain the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * <li>To obtain the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1860****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>Specifies whether the database is a logical database. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The database is a logical database.</li>
             * <li><strong>false</strong>: The database is a physical database.</li>
             * </ul>
             * <blockquote>
             * <p> If you set this parameter to <strong>true</strong>, the database that you specify must be a logical database.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link CreateDataImportOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateDataImportOrderRequest</p>
     */
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
        private java.util.List<DbItemList> dbItemList;

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
        public java.util.List<DbItemList> getDbItemList() {
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
            private java.util.List<DbItemList> dbItemList; 
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
             * <p>The key of the attachment that contains the SQL statements used to import data. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to the attachment key from the value of the AttachmentKey parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>order_text</p>
             */
            public Builder attachmentName(String attachmentName) {
                this.attachmentName = attachmentName;
                return this;
            }

            /**
             * <p>The reason for the data import.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder classify(String classify) {
                this.classify = classify;
                return this;
            }

            /**
             * <p>The type of the CSV file. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The first row in the CSV file contains field names.</li>
             * <li><strong>false</strong>: The first row in the CSV file contains data.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder csvFirstRowIsColumnDef(Boolean csvFirstRowIsColumnDef) {
                this.csvFirstRowIsColumnDef = csvFirstRowIsColumnDef;
                return this;
            }

            /**
             * <p>The database to which you want to import data. You can specify only one database.</p>
             * <p>This parameter is required.</p>
             */
            public Builder dbItemList(java.util.List<DbItemList> dbItemList) {
                this.dbItemList = dbItemList;
                return this;
            }

            /**
             * <p>The encoding algorithm to be used by the destination database. Valid values:</p>
             * <ul>
             * <li><strong>AUTO</strong>: automatic identification</li>
             * <li><strong>UTF-8</strong>: UTF-8 encoding</li>
             * <li><strong>GBK</strong>: GBK encoding</li>
             * <li><strong>ISO-8859-1</strong>: ISO-8859-1 encoding</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder fileEncoding(String fileEncoding) {
                this.fileEncoding = fileEncoding;
                return this;
            }

            /**
             * <p>The format of the file for the data import. Valid values:</p>
             * <ul>
             * <li><strong>SQL</strong>: an SQL file</li>
             * <li><strong>CSV</strong>: a CSV file</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>Specifies whether to skip an error that occurs. Valid values:</p>
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
             * <p>The import mode. Valid values:</p>
             * <ul>
             * <li><strong>FAST_MODE</strong>: In the Execute step, the uploaded file is read and SQL statements are executed to import data to the specified destination database. Compared with the security mode, this mode can be used to import data in a less secure but more efficient manner.</li>
             * <li><strong>SAFE_MODE</strong>: In the Precheck step, the uploaded file is parsed, and SQL statements or CSV file data is cached. In the Execute step, the cached SQL statements are read and executed to import data, or the cached CSV file data is read and imported to the specified destination database. This mode can be used to import data in a more secure but less efficient manner.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAST_MODE</p>
             */
            public Builder importMode(String importMode) {
                this.importMode = importMode;
                return this;
            }

            /**
             * <p>The mode in which the data in the CSV format is to be written to the destination table. Valid values:</p>
             * <ul>
             * <li><strong>INSERT</strong>: The database checks the primary key when data is written. If a duplicate primary key value exists, an error message is returned.</li>
             * <li><strong>INSERT_IGNORE</strong>: If the imported data contains data records that are the same as those in the destination table, the new data records are ignored.</li>
             * <li><strong>REPLACE_INTO</strong>: If the imported data contains a row that has the same value for the primary key or unique index as one row in the destination table, the database deletes the existing row and inserts the new row into the destination table.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>INSERT</p>
             */
            public Builder insertType(String insertType) {
                this.insertType = insertType;
                return this;
            }

            /**
             * <p>The key of the attachment that contains the SQL statements used to roll back the data import. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key from the value of the AttachmentKey parameter.</p>
             * <blockquote>
             * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>ATTACHMENT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rollback.sql</p>
             */
            public Builder rollbackAttachmentName(String rollbackAttachmentName) {
                this.rollbackAttachmentName = rollbackAttachmentName;
                return this;
            }

            /**
             * <p>The SQL statements used to roll back the data import.</p>
             * <blockquote>
             * <p> This parameter is required if you set the <strong>RollbackSqlType</strong> parameter to <strong>TEXT</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder rollbackSQL(String rollbackSQL) {
                this.rollbackSQL = rollbackSQL;
                return this;
            }

            /**
             * <p>The format of the SQL statements used to roll back the data import. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong>: text</li>
             * <li><strong>ATTACHMENT</strong>: attachment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder rollbackSqlType(String rollbackSqlType) {
                this.rollbackSqlType = rollbackSqlType;
                return this;
            }

            /**
             * <p>The destination table to which you want to import the data in the CSV format.</p>
             * <blockquote>
             * <p> This parameter is required if you set the <strong>FileType</strong> parameter to <strong>CSV</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Table_text</p>
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
