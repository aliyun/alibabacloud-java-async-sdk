// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProjectRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectRoleResponseBody</p>
 */
public class GetProjectRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectRole")
    private ProjectRole projectRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProjectRoleResponseBody(Builder builder) {
        this.projectRole = builder.projectRole;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return projectRole
     */
    public ProjectRole getProjectRole() {
        return this.projectRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProjectRole projectRole; 
        private String requestId; 

        /**
         * <p>The role in the DataWorks workspace.</p>
         */
        public Builder projectRole(ProjectRole projectRole) {
            this.projectRole = projectRole;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>82F28E60-CF48-5EDF-AB25-D806847B97D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProjectRoleResponseBody build() {
            return new GetProjectRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProjectRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetProjectRoleResponseBody</p>
     */
    public static class ProjectRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ProjectRole(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectRole create() {
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
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
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
            private Long projectId; 
            private String type; 

            /**
             * <p>The code of the role in the DataWorks workspace.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>role_project_admin: workspace administrator</li>
             * <li>role_project_dev: developer</li>
             * <li>role_project_dg_admin: data governance administrator</li>
             * <li>role_project_guest: visitor</li>
             * <li>role_project_security: security administrator</li>
             * <li>role_project_deploy: deployer</li>
             * <li>role_project_owner: workspace owner</li>
             * <li>role_project_data_analyst: data analyst</li>
             * <li>role_project_pe: O&amp;M engineer</li>
             * <li>role_project_erd: model designer</li>
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
             * <p>The name of the role in the DataWorks workspace.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10002</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the role in the DataWorks workspace.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>UserCustom: user-defined role</li>
             * <li>System: system role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ProjectRole build() {
                return new ProjectRole(this);
            } 

        } 

    }
}
