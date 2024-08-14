// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrationSummaryResponseBody</p>
 */
public class GetMigrationSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The request ID. You can use the request ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
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
        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("MigrationId")
        private Long migrationId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OpUser")
        private String opUser;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The ID of the user who created the task.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The URL that is used to download the package of the export task. You can use the URL to download the package of the export task.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the task was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder migrationId(Long migrationId) {
                this.migrationId = migrationId;
                return this;
            }

            /**
             * The task name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the user who managed the task.
             */
            public Builder opUser(String opUser) {
                this.opUser = opUser;
                return this;
            }

            /**
             * The ID of the DataWorks workspace to which the migration task belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   INIT
             * *   EDITING
             * *   IMPORTING
             * *   IMPORT_ERROR
             * *   IMPORT_SUCCESS
             * *   EXPORTING
             * *   EXPORT_ERROR
             * *   EXPORT_SUCCESS
             * *   REVOKED
             * *   PARTIAL_SUCCESS
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
