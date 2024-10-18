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
         * ProjectRole.
         */
        public Builder projectRole(ProjectRole projectRole) {
            this.projectRole = projectRole;
            return this;
        }

        /**
         * RequestId.
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Type.
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
