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
 * {@link ListApplicationsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsForUserResponseBody</p>
 */
public class ListApplicationsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListApplicationsForUserResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsForUserResponseBody create() {
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

        private Builder(ListApplicationsForUserResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The applications that the EIAM account can access.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationsForUserResponseBody build() {
            return new ListApplicationsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForUserResponseBody</p>
     */
    public static class ApplicationRoles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationRoleId")
        private String applicationRoleId;

        @com.aliyun.core.annotation.NameInMap("HasDirectAuthorization")
        private Boolean hasDirectAuthorization;

        @com.aliyun.core.annotation.NameInMap("HasInheritAuthorization")
        private Boolean hasInheritAuthorization;

        private ApplicationRoles(Builder builder) {
            this.applicationRoleId = builder.applicationRoleId;
            this.hasDirectAuthorization = builder.hasDirectAuthorization;
            this.hasInheritAuthorization = builder.hasInheritAuthorization;
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
            private String applicationRoleId; 
            private Boolean hasDirectAuthorization; 
            private Boolean hasInheritAuthorization; 

            private Builder() {
            } 

            private Builder(ApplicationRoles model) {
                this.applicationRoleId = model.applicationRoleId;
                this.hasDirectAuthorization = model.hasDirectAuthorization;
                this.hasInheritAuthorization = model.hasInheritAuthorization;
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

            public ApplicationRoles build() {
                return new ApplicationRoles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListApplicationsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationsForUserResponseBody</p>
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
             * <p>The ID of the application that the EIAM account can access.</p>
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
             * <p>Indicates whether the EIAM account has direct permissions on the application. Valid values:</p>
             * <ul>
             * <li>true: The EIAM account has direct permissions on the application.</li>
             * <li>false: The EIAM account does not have direct permissions on the application.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDirectAuthorization(Boolean hasDirectAuthorization) {
                this.hasDirectAuthorization = hasDirectAuthorization;
                return this;
            }

            /**
             * <p>Indicates whether the EIAM account has inherited permissions on the application. Valid values:</p>
             * <ul>
             * <li>true: A parent organization or an organization to which the EIAM account belongs has direct permissions on the application.</li>
             * <li>false: A parent organization or an organization to which the EIAM account belongs does not have direct permissions on the application.</li>
             * </ul>
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
