// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrationSummaryResponseBody</p>
 */
public class GetMigrationSummaryResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMigrationSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the migration task.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails. You can locate the error based on the request ID.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMigrationSummaryResponseBody build() {
            return new GetMigrationSummaryResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("MigrationId")
        private Long migrationId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OpUser")
        private String opUser;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.createUser = builder.createUser;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.migrationId = builder.migrationId;
            this.name = builder.name;
            this.opUser = builder.opUser;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return migrationId
         */
        public Long getMigrationId() {
            return this.migrationId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opUser
         */
        public String getOpUser() {
            return this.opUser;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createUser; 
            private String downloadUrl; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long migrationId; 
            private String name; 
            private String opUser; 
            private Long projectId; 
            private String status; 

            /**
             * The ID of the user who creates the migration task.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The URL that is used to download the package of the export task.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The time when the migration task was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the migration task was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the migration task.
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * The name of the migration task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the user who manages the migration task.
             */
            public Builder opUser(String opUser) {
                this.opUser = opUser;
                return this;
            }

            /**
             * The ID of the DataWorks workspace.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   INIT: The migration task is initiating.
             * *   EDITING: The migration task is being edited.
             * *   IMPORTING: The migration task is importing data objects.
             * *   IMPORT_ERROR: The migration task fails to import data objects.
             * *   IMPORT_SUCCESS: Data objects are imported.
             * *   EXPORTING: The migration task is exporting data objects.
             * *   EXPORT_ERROR: The migration task fails to export data objects.
             * *   EXPORT_SUCCESS: The migration task successfully exports data objects.
             * *   REVOKED: The migration task is canceled.
             * *   PARTIAL_SUCCESS: The migration task successfully imports or exports only some data objects.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
