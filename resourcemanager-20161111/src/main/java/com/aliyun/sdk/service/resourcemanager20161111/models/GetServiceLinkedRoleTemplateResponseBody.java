// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceLinkedRoleTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLinkedRoleTemplateResponseBody</p>
 */
public class GetServiceLinkedRoleTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceLinkedRoleTemplate")
    private ServiceLinkedRoleTemplate serviceLinkedRoleTemplate;

    private GetServiceLinkedRoleTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceLinkedRoleTemplate = builder.serviceLinkedRoleTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceLinkedRoleTemplate
     */
    public ServiceLinkedRoleTemplate getServiceLinkedRoleTemplate() {
        return this.serviceLinkedRoleTemplate;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceLinkedRoleTemplate serviceLinkedRoleTemplate; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceLinkedRoleTemplate.
         */
        public Builder serviceLinkedRoleTemplate(ServiceLinkedRoleTemplate serviceLinkedRoleTemplate) {
            this.serviceLinkedRoleTemplate = serviceLinkedRoleTemplate;
            return this;
        }

        public GetServiceLinkedRoleTemplateResponseBody build() {
            return new GetServiceLinkedRoleTemplateResponseBody(this);
        } 

    } 

    public static class RoleDescription extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Language")
        private String language;

        private RoleDescription(Builder builder) {
            this.description = builder.description;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleDescription create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String description; 
            private String language; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public RoleDescription build() {
                return new RoleDescription(this);
            } 

        } 

    }
    public static class RoleDescriptions extends TeaModel {
        @NameInMap("RoleDescription")
        private java.util.List < RoleDescription> roleDescription;

        private RoleDescriptions(Builder builder) {
            this.roleDescription = builder.roleDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleDescriptions create() {
            return builder().build();
        }

        /**
         * @return roleDescription
         */
        public java.util.List < RoleDescription> getRoleDescription() {
            return this.roleDescription;
        }

        public static final class Builder {
            private java.util.List < RoleDescription> roleDescription; 

            /**
             * RoleDescription.
             */
            public Builder roleDescription(java.util.List < RoleDescription> roleDescription) {
                this.roleDescription = roleDescription;
                return this;
            }

            public RoleDescriptions build() {
                return new RoleDescriptions(this);
            } 

        } 

    }
    public static class ServiceLinkedRoleTemplate extends TeaModel {
        @NameInMap("MultipleRolesAllowed")
        private Boolean multipleRolesAllowed;

        @NameInMap("RoleDescriptions")
        private RoleDescriptions roleDescriptions;

        @NameInMap("RoleNamePrefix")
        private String roleNamePrefix;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SystemPolicyName")
        private String systemPolicyName;

        private ServiceLinkedRoleTemplate(Builder builder) {
            this.multipleRolesAllowed = builder.multipleRolesAllowed;
            this.roleDescriptions = builder.roleDescriptions;
            this.roleNamePrefix = builder.roleNamePrefix;
            this.serviceName = builder.serviceName;
            this.systemPolicyName = builder.systemPolicyName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceLinkedRoleTemplate create() {
            return builder().build();
        }

        /**
         * @return multipleRolesAllowed
         */
        public Boolean getMultipleRolesAllowed() {
            return this.multipleRolesAllowed;
        }

        /**
         * @return roleDescriptions
         */
        public RoleDescriptions getRoleDescriptions() {
            return this.roleDescriptions;
        }

        /**
         * @return roleNamePrefix
         */
        public String getRoleNamePrefix() {
            return this.roleNamePrefix;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return systemPolicyName
         */
        public String getSystemPolicyName() {
            return this.systemPolicyName;
        }

        public static final class Builder {
            private Boolean multipleRolesAllowed; 
            private RoleDescriptions roleDescriptions; 
            private String roleNamePrefix; 
            private String serviceName; 
            private String systemPolicyName; 

            /**
             * MultipleRolesAllowed.
             */
            public Builder multipleRolesAllowed(Boolean multipleRolesAllowed) {
                this.multipleRolesAllowed = multipleRolesAllowed;
                return this;
            }

            /**
             * RoleDescriptions.
             */
            public Builder roleDescriptions(RoleDescriptions roleDescriptions) {
                this.roleDescriptions = roleDescriptions;
                return this;
            }

            /**
             * RoleNamePrefix.
             */
            public Builder roleNamePrefix(String roleNamePrefix) {
                this.roleNamePrefix = roleNamePrefix;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SystemPolicyName.
             */
            public Builder systemPolicyName(String systemPolicyName) {
                this.systemPolicyName = systemPolicyName;
                return this;
            }

            public ServiceLinkedRoleTemplate build() {
                return new ServiceLinkedRoleTemplate(this);
            } 

        } 

    }
}
