// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDesignProjectInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDesignProjectInfoResponseBody</p>
 */
public class GetTableDesignProjectInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProjectInfo")
    private ProjectInfo projectInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableDesignProjectInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.projectInfo = builder.projectInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDesignProjectInfoResponseBody create() {
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
     * @return projectInfo
     */
    public ProjectInfo getProjectInfo() {
        return this.projectInfo;
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
        private String errorCode; 
        private String errorMessage; 
        private ProjectInfo projectInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the request failed.
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
         * The information about the schema design project.
         */
        public Builder projectInfo(ProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
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
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableDesignProjectInfoResponseBody build() {
            return new GetTableDesignProjectInfoResponseBody(this);
        } 

    } 

    public static class BaseDatabase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private Boolean logic;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        private BaseDatabase(Builder builder) {
            this.alias = builder.alias;
            this.dbId = builder.dbId;
            this.dbType = builder.dbType;
            this.envType = builder.envType;
            this.logic = builder.logic;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseDatabase create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
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
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        public static final class Builder {
            private String alias; 
            private Integer dbId; 
            private String dbType; 
            private String envType; 
            private Boolean logic; 
            private String schemaName; 
            private String searchName; 

            /**
             * The alias of the database instance.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * The database ID.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The type of the environment in which the database instance is deployed. Valid values:
             * <p>
             * 
             * *   **product**: production environment.
             * *   **dev**: development environment.
             * *   **pre**: pre-release environment.
             * *   **test**: test environment.
             * *   **sit**: system integration testing (SIT) environment.
             * *   **uat**: user acceptance testing (UAT) environment.
             * *   **pet**: stress testing environment.
             * *   **stag**: staging environment.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Indicates whether the database is a logical database. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder logic(Boolean logic) {
                this.logic = logic;
                return this;
            }

            /**
             * The database name.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name that is used to search for the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            public BaseDatabase build() {
                return new BaseDatabase(this);
            } 

        } 

    }
    public static class ProjectInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseDatabase")
        private BaseDatabase baseDatabase;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ProjectInfo(Builder builder) {
            this.baseDatabase = builder.baseDatabase;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.orderId = builder.orderId;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectInfo create() {
            return builder().build();
        }

        /**
         * @return baseDatabase
         */
        public BaseDatabase getBaseDatabase() {
            return this.baseDatabase;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private BaseDatabase baseDatabase; 
            private Long creatorId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long orderId; 
            private Long projectId; 
            private String status; 
            private String title; 

            /**
             * The information about the change base database of the schema design ticket.
             */
            public Builder baseDatabase(BaseDatabase baseDatabase) {
                this.baseDatabase = baseDatabase;
                return this;
            }

            /**
             * The ID of the user who created the ticket.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the schema design project.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the ticket was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the ticket was last modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ticket ID.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * The project ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The state of the schema design project. Valid values:
             * <p>
             * 
             * *   **DESIGN**: The schema is being designed.
             * *   **PUBLISHED**: The schema is published.
             * *   **CLOSE**: The ticket is closed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the schema design project.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ProjectInfo build() {
                return new ProjectInfo(this);
            } 

        } 

    }
}
