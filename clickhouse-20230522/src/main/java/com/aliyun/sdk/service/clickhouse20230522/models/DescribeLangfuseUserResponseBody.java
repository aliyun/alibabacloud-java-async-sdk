// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeLangfuseUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLangfuseUserResponseBody</p>
 */
public class DescribeLangfuseUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLangfuseUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLangfuseUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLangfuseUserResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLangfuseUserResponseBody build() {
            return new DescribeLangfuseUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLangfuseUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseUserResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("ProjectRole")
        private String projectRole;

        private Projects(Builder builder) {
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.projectRole = builder.projectRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return projectRole
         */
        public String getProjectRole() {
            return this.projectRole;
        }

        public static final class Builder {
            private String projectId; 
            private String projectName; 
            private String projectRole; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.projectRole = model.projectRole;
            } 

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * ProjectRole.
             */
            public Builder projectRole(String projectRole) {
                this.projectRole = projectRole;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLangfuseUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseUserResponseBody</p>
     */
    public static class Memberships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgRole")
        private String orgRole;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("OrganizationName")
        private String organizationName;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List<Projects> projects;

        private Memberships(Builder builder) {
            this.orgRole = builder.orgRole;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
            this.projects = builder.projects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memberships create() {
            return builder().build();
        }

        /**
         * @return orgRole
         */
        public String getOrgRole() {
            return this.orgRole;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return projects
         */
        public java.util.List<Projects> getProjects() {
            return this.projects;
        }

        public static final class Builder {
            private String orgRole; 
            private String organizationId; 
            private String organizationName; 
            private java.util.List<Projects> projects; 

            private Builder() {
            } 

            private Builder(Memberships model) {
                this.orgRole = model.orgRole;
                this.organizationId = model.organizationId;
                this.organizationName = model.organizationName;
                this.projects = model.projects;
            } 

            /**
             * OrgRole.
             */
            public Builder orgRole(String orgRole) {
                this.orgRole = orgRole;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * Projects.
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            public Memberships build() {
                return new Memberships(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLangfuseUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Memberships")
        private java.util.List<Memberships> memberships;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdatedAt")
        private String updatedAt;

        private Data(Builder builder) {
            this.createdAt = builder.createdAt;
            this.email = builder.email;
            this.memberships = builder.memberships;
            this.name = builder.name;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return memberships
         */
        public java.util.List<Memberships> getMemberships() {
            return this.memberships;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String email; 
            private java.util.List<Memberships> memberships; 
            private String name; 
            private String updatedAt; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdAt = model.createdAt;
                this.email = model.email;
                this.memberships = model.memberships;
                this.name = model.name;
                this.updatedAt = model.updatedAt;
            } 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Memberships.
             */
            public Builder memberships(java.util.List<Memberships> memberships) {
                this.memberships = memberships;
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
             * UpdatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
