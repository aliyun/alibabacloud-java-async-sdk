// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
         * ProjectMember.
         */
        public Builder projectMember(ProjectMember projectMember) {
            this.projectMember = projectMember;
            return this;
        }

        /**
         * RequestId.
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
             * Type.
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
        private java.util.List < Roles> roles;

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
        public java.util.List < Roles> getRoles() {
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
            private java.util.List < Roles> roles; 
            private String status; 
            private String userId; 

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
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
