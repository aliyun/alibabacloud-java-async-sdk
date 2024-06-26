// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The details of the database export ticket.
         */
        public Builder databaseExportOrderDetail(DatabaseExportOrderDetail databaseExportOrderDetail) {
            this.databaseExportOrderDetail = databaseExportOrderDetail;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDatabaseExportOrderDetailResponseBody build() {
            return new GetDatabaseExportOrderDetailResponseBody(this);
        } 

    } 

    public static class ExportTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportTypes")
        private java.util.List < String > exportTypes;

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
        public java.util.List < String > getExportTypes() {
            return this.exportTypes;
        }

        public static final class Builder {
            private java.util.List < String > exportTypes; 

            /**
             * ExportTypes.
             */
            public Builder exportTypes(java.util.List < String > exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            public ExportTypes build() {
                return new ExportTypes(this);
            } 

        } 

    }
    public static class SQLExtOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLExtOption")
        private java.util.List < String > SQLExtOption;

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
        public java.util.List < String > getSQLExtOption() {
            return this.SQLExtOption;
        }

        public static final class Builder {
            private java.util.List < String > SQLExtOption; 

            /**
             * SQLExtOption.
             */
            public Builder SQLExtOption(java.util.List < String > SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            public SQLExtOption build() {
                return new SQLExtOption(this);
            } 

        } 

    }
    public static class SelectedTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SelectedTables")
        private java.util.List < String > selectedTables;

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
        public java.util.List < String > getSelectedTables() {
            return this.selectedTables;
        }

        public static final class Builder {
            private java.util.List < String > selectedTables; 

            /**
             * SelectedTables.
             */
            public Builder selectedTables(java.util.List < String > selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            public SelectedTables build() {
                return new SelectedTables(this);
            } 

        } 

    }
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
             * The database name.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * The type of data that was exported. Valid values:
             * <p>
             * 
             * *   **DATA**: The data of the database was exported.
             * *   **STRUCT**: The schema of the database was exported.
             * *   **DATA_STRUCT**: The data and schema of the database were exported.
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * The type of schema that was exported.
             */
            public Builder exportTypes(ExportTypes exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            /**
             * The extension options of the SQL script.
             */
            public Builder SQLExtOption(SQLExtOption SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            /**
             * The tables that were exported from the database.
             */
            public Builder selectedTables(SelectedTables selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            /**
             * The format in which the database was exported. Valid values:
             * <p>
             * 
             * *   **SQL**
             * *   **CSV**
             * *   **XLSX**
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
             * The time when the ticket was submitted.
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * The configuration information about the ticket.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * The database ID.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The URL that is used to download the export result.
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
             * The business background information of the database export ticket.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The user who submitted the ticket.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * The ID of the user who submitted the ticket. This ID is a user ID and is not the ID of an Alibaba Cloud account.
             */
            public Builder committerId(String committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * The ticket ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The key information about the ticket.
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * The execution logs.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The status description of the ticket.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * The status description of the workflow.
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
