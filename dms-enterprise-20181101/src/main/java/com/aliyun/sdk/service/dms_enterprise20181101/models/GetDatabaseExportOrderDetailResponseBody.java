// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDatabaseExportOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatabaseExportOrderDetailResponseBody</p>
 */
public class GetDatabaseExportOrderDetailResponseBody extends TeaModel {
    @NameInMap("DatabaseExportOrderDetail")
    private DatabaseExportOrderDetail databaseExportOrderDetail;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * DatabaseExportOrderDetail.
         */
        public Builder databaseExportOrderDetail(DatabaseExportOrderDetail databaseExportOrderDetail) {
            this.databaseExportOrderDetail = databaseExportOrderDetail;
            return this;
        }

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

        public GetDatabaseExportOrderDetailResponseBody build() {
            return new GetDatabaseExportOrderDetailResponseBody(this);
        } 

    } 

    public static class ExportTypes extends TeaModel {
        @NameInMap("ExportTypes")
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
        @NameInMap("SQLExtOption")
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
        @NameInMap("SelectedTables")
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
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("ExportContent")
        private String exportContent;

        @NameInMap("ExportTypes")
        private ExportTypes exportTypes;

        @NameInMap("SQLExtOption")
        private SQLExtOption SQLExtOption;

        @NameInMap("SelectedTables")
        private SelectedTables selectedTables;

        @NameInMap("TargetOption")
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
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * ExportContent.
             */
            public Builder exportContent(String exportContent) {
                this.exportContent = exportContent;
                return this;
            }

            /**
             * ExportTypes.
             */
            public Builder exportTypes(ExportTypes exportTypes) {
                this.exportTypes = exportTypes;
                return this;
            }

            /**
             * SQLExtOption.
             */
            public Builder SQLExtOption(SQLExtOption SQLExtOption) {
                this.SQLExtOption = SQLExtOption;
                return this;
            }

            /**
             * SelectedTables.
             */
            public Builder selectedTables(SelectedTables selectedTables) {
                this.selectedTables = selectedTables;
                return this;
            }

            /**
             * TargetOption.
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
        @NameInMap("AuditDate")
        private String auditDate;

        @NameInMap("Config")
        private Config config;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("DownloadURL")
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
             * AuditDate.
             */
            public Builder auditDate(String auditDate) {
                this.auditDate = auditDate;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * DownloadURL.
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
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Committer")
        private String committer;

        @NameInMap("CommitterId")
        private String committerId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("KeyInfo")
        private KeyInfo keyInfo;

        @NameInMap("Log")
        private String log;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("StatusDesc")
        private String statusDesc;

        @NameInMap("WorkflowStatusDesc")
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Committer.
             */
            public Builder committer(String committer) {
                this.committer = committer;
                return this;
            }

            /**
             * CommitterId.
             */
            public Builder committerId(String committerId) {
                this.committerId = committerId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * KeyInfo.
             */
            public Builder keyInfo(KeyInfo keyInfo) {
                this.keyInfo = keyInfo;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(String log) {
                this.log = log;
                return this;
            }

            /**
             * SearchName.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * StatusDesc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * WorkflowStatusDesc.
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
