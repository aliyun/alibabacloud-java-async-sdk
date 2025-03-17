// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetDataSourceConnectionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataSourceConnectionInfoResponseBody</p>
 */
public class GetDataSourceConnectionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataSourceConnectionInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceConnectionInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataSourceConnectionInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D-*****-****-*4FC0C976</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Data source information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataSourceConnectionInfoResponseBody build() {
            return new GetDataSourceConnectionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataSourceConnectionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataSourceConnectionInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AuthLevel")
        private String authLevel;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("DsVersion")
        private String dsVersion;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("NoSasl")
        private Boolean noSasl;

        @com.aliyun.core.annotation.NameInMap("ParentDsType")
        private String parentDsType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Result(Builder builder) {
            this.address = builder.address;
            this.authLevel = builder.authLevel;
            this.creatorId = builder.creatorId;
            this.dsId = builder.dsId;
            this.dsType = builder.dsType;
            this.dsVersion = builder.dsVersion;
            this.instance = builder.instance;
            this.instanceId = builder.instanceId;
            this.modifyUser = builder.modifyUser;
            this.noSasl = builder.noSasl;
            this.parentDsType = builder.parentDsType;
            this.port = builder.port;
            this.project = builder.project;
            this.schema = builder.schema;
            this.showName = builder.showName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return authLevel
         */
        public String getAuthLevel() {
            return this.authLevel;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return dsVersion
         */
        public String getDsVersion() {
            return this.dsVersion;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return noSasl
         */
        public Boolean getNoSasl() {
            return this.noSasl;
        }

        /**
         * @return parentDsType
         */
        public String getParentDsType() {
            return this.parentDsType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String address; 
            private String authLevel; 
            private String creatorId; 
            private String dsId; 
            private String dsType; 
            private String dsVersion; 
            private String instance; 
            private String instanceId; 
            private String modifyUser; 
            private Boolean noSasl; 
            private String parentDsType; 
            private String port; 
            private String project; 
            private String schema; 
            private String showName; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.address = model.address;
                this.authLevel = model.authLevel;
                this.creatorId = model.creatorId;
                this.dsId = model.dsId;
                this.dsType = model.dsType;
                this.dsVersion = model.dsVersion;
                this.instance = model.instance;
                this.instanceId = model.instanceId;
                this.modifyUser = model.modifyUser;
                this.noSasl = model.noSasl;
                this.parentDsType = model.parentDsType;
                this.port = model.port;
                this.project = model.project;
                this.schema = model.schema;
                this.showName = model.showName;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>Database connection string address (domain or IP).</p>
             * 
             * <strong>example:</strong>
             * <p>172.<strong>.</strong>.48</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Permission level:</p>
             * <ul>
             * <li>0 -- Private</li>
             * <li>1 -- Collaborative Editing (old)</li>
             * <li>11 -- Collaborative Editing - Space Members</li>
             * <li>12 -- Collaborative Editing - Specified to Individuals</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authLevel(String authLevel) {
                this.authLevel = authLevel;
                return this;
            }

            /**
             * <p>Quick BI user ID of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>U240****0880C6095</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>Data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a201c85c-******</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>Data source type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>Version of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder dsVersion(String dsVersion) {
                this.dsVersion = dsVersion;
                return this;
            }

            /**
             * <p>Database instance, corresponding to the database name, and for ODPS, it is the project.</p>
             * 
             * <strong>example:</strong>
             * <p>rm*********t44ju1</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm*********t44ju1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Quick BI user ID of the modifier.</p>
             * 
             * <strong>example:</strong>
             * <p>U240****0880C6095</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>Whether the impala data source requires authentication to log in:</p>
             * <ul>
             * <li>true - Requires account and password login  </li>
             * <li>false - No authentication required (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder noSasl(Boolean noSasl) {
                this.noSasl = noSasl;
                return this;
            }

            /**
             * <p>Primary data source type for multi-engine data sources.</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin</p>
             */
            public Builder parentDsType(String parentDsType) {
                this.parentDsType = parentDsType;
                return this;
            }

            /**
             * <p>Port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>Used for front-end display when obtaining connection details for ODPS.</p>
             * 
             * <strong>example:</strong>
             * <p>prod-ossdoc</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>Database schema, only needs to be set for databases that support schemas.</p>
             * 
             * <strong>example:</strong>
             * <p>Analysis</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>Display name of the data source on the front end.</p>
             * 
             * <strong>example:</strong>
             * <p>0327</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>Workspace ID to which the data source belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>0de6<strong>2-d</strong>-4720-8836-0cc****1394c</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
