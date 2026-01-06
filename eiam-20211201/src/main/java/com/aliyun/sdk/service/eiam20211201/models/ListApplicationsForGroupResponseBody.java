// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListApplicationsForGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForGroupResponseBody</p>
 */
public class ListApplicationsForGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsForGroupResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationsForGroupResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Applications.
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsForGroupResponseBody build() {
            return new ListApplicationsForGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsForGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForGroupResponseBody</p>
     */
    public static class ApplicationRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationRoleId")
        private String applicationRoleId;

        private ApplicationRoles(Builder builder) {
            this.applicationRoleId = builder.applicationRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationRoles create() {
            return builder().build();
        }

        /**
         * @return applicationRoleId
         */
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

        public static final class Builder {
            private String applicationRoleId; 

            private Builder() {
            } 

            private Builder(ApplicationRoles model) {
                this.applicationRoleId = model.applicationRoleId;
            } 

            /**
             * <p>应用角色标识。</p>
             * 
             * <strong>example:</strong>
             * <p>app_role_mkv7rgt4ds8d8v0qtzev2mxxxx</p>
             */
            public Builder applicationRoleId(String applicationRoleId) {
                this.applicationRoleId = applicationRoleId;
                return this;
            }

            public ApplicationRoles build() {
                return new ApplicationRoles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsForGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForGroupResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationRoles")
        private java.util.List<ApplicationRoles> applicationRoles;

        @com.aliyun.core.annotation.NameInMap("HasDirectAuthorization")
        private Boolean hasDirectAuthorization;

        @com.aliyun.core.annotation.NameInMap("HasInheritAuthorization")
        private Boolean hasInheritAuthorization;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationRoles = builder.applicationRoles;
            this.hasDirectAuthorization = builder.hasDirectAuthorization;
            this.hasInheritAuthorization = builder.hasInheritAuthorization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationRoles
         */
        public java.util.List<ApplicationRoles> getApplicationRoles() {
            return this.applicationRoles;
        }

        /**
         * @return hasDirectAuthorization
         */
        public Boolean getHasDirectAuthorization() {
            return this.hasDirectAuthorization;
        }

        /**
         * @return hasInheritAuthorization
         */
        public Boolean getHasInheritAuthorization() {
            return this.hasInheritAuthorization;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List<ApplicationRoles> applicationRoles; 
            private Boolean hasDirectAuthorization; 
            private Boolean hasInheritAuthorization; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.applicationRoles = model.applicationRoles;
                this.hasDirectAuthorization = model.hasDirectAuthorization;
                this.hasInheritAuthorization = model.hasInheritAuthorization;
            } 

            /**
             * <p>应用的唯一标识。</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>应用角色列表。</p>
             */
            public Builder applicationRoles(java.util.List<ApplicationRoles> applicationRoles) {
                this.applicationRoles = applicationRoles;
                return this;
            }

            /**
             * <p>直接分配给当前用户的权限，视为直接授权。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDirectAuthorization(Boolean hasDirectAuthorization) {
                this.hasDirectAuthorization = hasDirectAuthorization;
                return this;
            }

            /**
             * <p>通过用户隶属的组织、组获取的权限，视为继承权限。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasInheritAuthorization(Boolean hasInheritAuthorization) {
                this.hasInheritAuthorization = hasInheritAuthorization;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
