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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
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

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AuthLevel.
             */
            public Builder authLevel(String authLevel) {
                this.authLevel = authLevel;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * DsId.
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * DsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * DsVersion.
             */
            public Builder dsVersion(String dsVersion) {
                this.dsVersion = dsVersion;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * NoSasl.
             */
            public Builder noSasl(Boolean noSasl) {
                this.noSasl = noSasl;
                return this;
            }

            /**
             * ParentDsType.
             */
            public Builder parentDsType(String parentDsType) {
                this.parentDsType = parentDsType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * WorkspaceId.
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
