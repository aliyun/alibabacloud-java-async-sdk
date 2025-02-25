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
 * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseExportOrderDetailResponseBody</p>
 */
public class GetDatabaseExportOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseExportOrderDetail")
    private DatabaseExportOrderDetail databaseExportOrderDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDatabaseExportOrderDetailResponseBody(Builder builder) {
        this.databaseExportOrderDetail = builder.databaseExportOrderDetail;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatabaseExportOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseExportOrderDetail
     */
    public DatabaseExportOrderDetail getDatabaseExportOrderDetail() {
        return this.databaseExportOrderDetail;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DatabaseExportOrderDetail databaseExportOrderDetail; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the database export ticket.</p>
         */
        public Builder databaseExportOrderDetail(DatabaseExportOrderDetail databaseExportOrderDetail) {
            this.databaseExportOrderDetail = databaseExportOrderDetail;
            return this;
        }

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
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CFD8FE00-36D9-4C1B-940D-65A7B73D9066</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatabaseExportOrderDetailResponseBody build() {
            return new GetDatabaseExportOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class ExportTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportTypes")
        private java.util.List<String> exportTypes;

        private ExportTypes(Builder builder) {
            this.exportTypes = builder.exportTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportTypes create() {
            return builder().build();
        }

        /**
         * @return exportTypes
         */
        public java.util.List<String> getExportTypes() {
            return this.exportTypes;
        }

        public static final class Builder {
            private java.util.List<String> exportTypes; 

            /**
             * ExportTypes.
             */
            public Builder exportTypes(java.util.List<String> exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            public ExportTypes build() {
                return new ExportTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class SQLExtOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLExtOption")
        private java.util.List<String> SQLExtOption;

        private SQLExtOption(Builder builder) {
            this.SQLExtOption = builder.SQLExtOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLExtOption create() {
            return builder().build();
        }

        /**
         * @return SQLExtOption
         */
        public java.util.List<String> getSQLExtOption() {
            return this.SQLExtOption;
        }

        public static final class Builder {
            private java.util.List<String> SQLExtOption; 

            /**
             * SQLExtOption.
             */
            public Builder SQLExtOption(java.util.List<String> SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            public SQLExtOption build() {
                return new SQLExtOption(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class SelectedTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SelectedTables")
        private java.util.List<String> selectedTables;

        private SelectedTables(Builder builder) {
            this.selectedTables = builder.selectedTables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedTables create() {
            return builder().build();
        }

        /**
         * @return selectedTables
         */
        public java.util.List<String> getSelectedTables() {
            return this.selectedTables;
        }

        public static final class Builder {
            private java.util.List<String> selectedTables; 

            /**
             * SelectedTables.
             */
            public Builder selectedTables(java.util.List<String> selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            public SelectedTables build() {
                return new SelectedTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("ExportContent")
        private String exportContent;

        @com.aliyun.core.annotation.NameInMap("ExportTypes")
        private ExportTypes exportTypes;

        @com.aliyun.core.annotation.NameInMap("SQLExtOption")
        private SQLExtOption SQLExtOption;

        @com.aliyun.core.annotation.NameInMap("SelectedTables")
        private SelectedTables selectedTables;

        @com.aliyun.core.annotation.NameInMap("TargetOption")
        private String targetOption;

        private Config(Builder builder) {
            this.dbName = builder.dbName;
            this.exportContent = builder.exportContent;
            this.exportTypes = builder.exportTypes;
            this.SQLExtOption = builder.SQLExtOption;
            this.selectedTables = builder.selectedTables;
            this.targetOption = builder.targetOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return exportContent
         */
        public String getExportContent() {
            return this.exportContent;
        }

        /**
         * @return exportTypes
         */
        public ExportTypes getExportTypes() {
            return this.exportTypes;
        }

        /**
         * @return SQLExtOption
         */
        public SQLExtOption getSQLExtOption() {
            return this.SQLExtOption;
        }

        /**
         * @return selectedTables
         */
        public SelectedTables getSelectedTables() {
            return this.selectedTables;
        }

        /**
         * @return targetOption
         */
        public String getTargetOption() {
            return this.targetOption;
        }

        public static final class Builder {
            private String dbName; 
            private String exportContent; 
            private ExportTypes exportTypes; 
            private SQLExtOption SQLExtOption; 
            private SelectedTables selectedTables; 
            private String targetOption; 

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>dmstest</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The type of data that was exported. Valid values:</p>
             * <ul>
             * <li><strong>DATA</strong>: The data of the database was exported.</li>
             * <li><strong>STRUCT</strong>: The schema of the database was exported.</li>
             * <li><strong>DATA_STRUCT</strong>: The data and schema of the database were exported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DATA</p>
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * <p>The type of schema that was exported.</p>
             */
            public Builder exportTypes(ExportTypes exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            /**
             * <p>The extension options of the SQL script.</p>
             */
            public Builder SQLExtOption(SQLExtOption SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            /**
             * <p>The tables that were exported from the database.</p>
             */
            public Builder selectedTables(SelectedTables selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            /**
             * <p>The format in which the database was exported. Valid values:</p>
             * <ul>
             * <li><strong>SQL</strong></li>
             * <li><strong>CSV</strong></li>
             * <li><strong>XLSX</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder targetOption(String targetOption) {
                this.targetOption = targetOption;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class KeyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDate")
        private String auditDate;

        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("DownloadURL")
        private String downloadURL;

        private KeyInfo(Builder builder) {
            this.auditDate = builder.auditDate;
            this.config = builder.config;
            this.dbId = builder.dbId;
            this.downloadURL = builder.downloadURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyInfo create() {
            return builder().build();
        }

        /**
         * @return auditDate
         */
        public String getAuditDate() {
            return this.auditDate;
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return downloadURL
         */
        public String getDownloadURL() {
            return this.downloadURL;
        }

        public static final class Builder {
            private String auditDate; 
            private Config config; 
            private Long dbId; 
            private String downloadURL; 

            /**
             * <p>The time when the ticket was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-13 13:44:59</p>
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * <p>The configuration information about the ticket.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The database ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2583****</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The URL that is used to download the export result.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://oss.xxx.com">https://oss.xxx.com</a></p>
             */
            public Builder downloadURL(String downloadURL) {
                this.downloadURL = downloadURL;
                return this;
            }

            public KeyInfo build() {
                return new KeyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDatabaseExportOrderDetailResponseBody</p>
     */
    public static class DatabaseExportOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Committer")
        private String committer;

        @com.aliyun.core.annotation.NameInMap("CommitterId")
        private String committerId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("KeyInfo")
        private KeyInfo keyInfo;

        @com.aliyun.core.annotation.NameInMap("Log")
        private String log;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("StatusDesc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("WorkflowStatusDesc")
        private String workflowStatusDesc;

        private DatabaseExportOrderDetail(Builder builder) {
            this.comment = builder.comment;
            this.committer = builder.committer;
            this.committerId = builder.committerId;
            this.id = builder.id;
            this.keyInfo = builder.keyInfo;
            this.log = builder.log;
            this.searchName = builder.searchName;
            this.statusDesc = builder.statusDesc;
            this.workflowStatusDesc = builder.workflowStatusDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseExportOrderDetail create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return committer
         */
        public String getCommitter() {
            return this.committer;
        }

        /**
         * @return committerId
         */
        public String getCommitterId() {
            return this.committerId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return keyInfo
         */
        public KeyInfo getKeyInfo() {
            return this.keyInfo;
        }

        /**
         * @return log
         */
        public String getLog() {
            return this.log;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return workflowStatusDesc
         */
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

        public static final class Builder {
            private String comment; 
            private String committer; 
            private String committerId; 
            private Long id; 
            private KeyInfo keyInfo; 
            private String log; 
            private String searchName; 
            private String statusDesc; 
            private String workflowStatusDesc; 

            /**
             * <p>The business background information of the database export ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The user who submitted the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>dmsuser</p>
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * <p>The ID of the user who submitted the ticket. This ID is a user ID and is not the ID of an Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>12***</p>
             */
            public Builder committerId(String committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * <p>The ticket ID.</p>
             * 
             * <strong>example:</strong>
             * <p>821****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The key information about the ticket.</p>
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * <p>The execution logs.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-12 14:58:32:015 Database Dump Start.
             * 2023-04-12 14:58:32:096 set server side query timeout, sql : set max_execution_time = 0</p>
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The name that is used to search for the database.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@xxx.xxx.xxx.xxx">test@xxx.xxx.xxx.xxx</a>:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The status description of the ticket.</p>
             * 
             * <strong>example:</strong>
             * <p>ticket approval</p>
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * <p>The status description of the workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>ticket approval</p>
             */
            public Builder workflowStatusDesc(String workflowStatusDesc) {
                this.workflowStatusDesc = workflowStatusDesc;
                return this;
            }

            public DatabaseExportOrderDetail build() {
                return new DatabaseExportOrderDetail(this);
            } 

        } 

    }
}
