// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetProjectMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectMemberResponseBody</p>
 */
public class GetProjectMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectMember")
    private ProjectMember projectMember;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectMemberResponseBody(Builder builder) {
        this.projectMember = builder.projectMember;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectMember
     */
    public ProjectMember getProjectMember() {
        return this.projectMember;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectMember projectMember; 
        private String requestId; 

        /**
         * <p>The details about the member in the workspace.</p>
         */
        public Builder projectMember(ProjectMember projectMember) {
            this.projectMember = projectMember;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectMemberResponseBody build() {
            return new GetProjectMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectMemberResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectMemberResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Roles(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String type; 

            /**
             * <p>The code of the role. Valid values:</p>
             * <ul>
             * <li>role_project_admin: Workspace Administrator</li>
             * <li>role_project_dev: Develop</li>
             * <li>role_project_dg_admin: Data Governance Administrator</li>
             * <li>role_project_guest: Visitor</li>
             * <li>role_project_security: Security Administrator</li>
             * <li>role_project_deploy: Deploy</li>
             * <li>role_project_owner: Workspace Owner</li>
             * <li>role_project_data_analyst: Data Analyst</li>
             * <li>role_project_pe: O&amp;M</li>
             * <li>role_project_erd: Model Designer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>role_project_guest</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the role. Valid values:</p>
             * <ul>
             * <li>UserCustom: custom role</li>
             * <li>System: built-in role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProjectMemberResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectMemberResponseBody</p>
     */
    public static class ProjectMember extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ProjectMember(Builder builder) {
            this.projectId = builder.projectId;
            this.roles = builder.roles;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectMember create() {
            return builder().build();
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long projectId; 
            private java.util.List<Roles> roles; 
            private String status; 
            private String userId; 

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>88757</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The roles that are assigned to the member in the workspace.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The status of the member.</p>
             * <ul>
             * <li>Normal</li>
             * <li>Forbidden</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the account used by the member in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>123422344899</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ProjectMember build() {
                return new ProjectMember(this);
            } 

        } 

    }
}
