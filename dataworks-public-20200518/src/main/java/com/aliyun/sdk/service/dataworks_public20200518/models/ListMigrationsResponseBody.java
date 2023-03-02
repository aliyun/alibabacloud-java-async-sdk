// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMigrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMigrationsResponseBody</p>
 */
public class ListMigrationsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListMigrationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMigrationsResponseBody create() {
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
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
         * *   false: The request fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMigrationsResponseBody build() {
            return new ListMigrationsResponseBody(this);
        } 

    } 

    public static class Migrations extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("Description")
        private String description;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Message")
        private String message;

        @NameInMap("MigrationType")
        private String migrationType;

        @NameInMap("Name")
        private String name;

        @NameInMap("PackageType")
        private String packageType;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TenantId")
        private Long tenantId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UpdateUser")
        private String updateUser;

        @NameInMap("UpdateUserName")
        private String updateUserName;

        private Migrations(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.downloadUrl = builder.downloadUrl;
            this.id = builder.id;
            this.message = builder.message;
            this.migrationType = builder.migrationType;
            this.name = builder.name;
            this.packageType = builder.packageType;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.updateTime = builder.updateTime;
            this.updateUser = builder.updateUser;
            this.updateUserName = builder.updateUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Migrations create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageType
         */
        public String getPackageType() {
            return this.packageType;
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

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateUser
         */
        public String getUpdateUser() {
            return this.updateUser;
        }

        /**
         * @return updateUserName
         */
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        public static final class Builder {
            private Long createTime; 
            private String createUser; 
            private String createUserName; 
            private String description; 
            private String downloadUrl; 
            private Long id; 
            private String message; 
            private String migrationType; 
            private String name; 
            private String packageType; 
            private Long projectId; 
            private String status; 
            private Long tenantId; 
            private Long updateTime; 
            private String updateUser; 
            private String updateUserName; 

            /**
             * The time when the migration task was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the user who created the migration task.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The name of the user who created the migration task.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * The description of the export task.
             */
            public Builder description(String description) {
                this.description = description;
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
             * The ID of the primary key.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The type of the migration task.
             * <p>
             * 
             * *   IMPORT
             * *   EXPORT
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
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
             * The type of the import or export package. Valid values:
             * <p>
             * 
             * *   DWMA (standard format)
             * *   DATAWORKS_MODEL (standard format)
             * *   DATAWORKS_V2 (Apsara Stack DataWorks V3.6.1 to V3.11)
             * *   DATAWORKS_V3 (Apsara Stack DataWorks V3.12 and later)
             * 
             * The DWMA and DATAWORKS_MODEL types are interchangeable.
             */
            public Builder packageType(String packageType) {
                this.packageType = packageType;
                return this;
            }

            /**
             * The ID of the DataWorks workspace to which the task belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The status of the migration task. Valid values:
             * <p>
             * 
             * *   INIT: The migration task is in the initial state.
             * *   EDITING: The migration task is being edited.
             * *   RUNNING: The migration task is running.
             * *   FAILURE: The migration task fails to run.
             * *   SUCCESS: The migration task is successfully run.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the tenant.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * The time when the migration task was last updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user who last updated the migration task.
             */
            public Builder updateUser(String updateUser) {
                this.updateUser = updateUser;
                return this;
            }

            /**
             * The name of the user who last updated the migration task.
             */
            public Builder updateUserName(String updateUserName) {
                this.updateUserName = updateUserName;
                return this;
            }

            public Migrations build() {
                return new Migrations(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Migrations")
        private java.util.List < Migrations> migrations;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.migrations = builder.migrations;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return migrations
         */
        public java.util.List < Migrations> getMigrations() {
            return this.migrations;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Migrations> migrations; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of migration tasks.
             */
            public Builder migrations(java.util.List < Migrations> migrations) {
                this.migrations = migrations;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 10. Maximum value: 50.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
