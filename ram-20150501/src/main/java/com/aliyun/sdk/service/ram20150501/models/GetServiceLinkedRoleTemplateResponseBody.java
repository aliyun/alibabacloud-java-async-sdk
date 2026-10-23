// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetServiceLinkedRoleTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLinkedRoleTemplateResponseBody</p>
 */
public class GetServiceLinkedRoleTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRoleTemplate")
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
     * @return serviceLinkedRoleTemplate
     */
    public ServiceLinkedRoleTemplate getServiceLinkedRoleTemplate() {
        return this.serviceLinkedRoleTemplate;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceLinkedRoleTemplate serviceLinkedRoleTemplate; 

        private Builder() {
        } 

        private Builder(GetServiceLinkedRoleTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.serviceLinkedRoleTemplate = model.serviceLinkedRoleTemplate;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service-linked role template.</p>
         */
        public Builder serviceLinkedRoleTemplate(ServiceLinkedRoleTemplate serviceLinkedRoleTemplate) {
            this.serviceLinkedRoleTemplate = serviceLinkedRoleTemplate;
            return this;
        }

        public GetServiceLinkedRoleTemplateResponseBody build() {
            return new GetServiceLinkedRoleTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceLinkedRoleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleTemplateResponseBody</p>
     */
    public static class RoleDescription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Language")
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

            private Builder() {
            } 

            private Builder(RoleDescription model) {
                this.description = model.description;
                this.language = model.language;
            } 

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
    /**
     * 
     * {@link GetServiceLinkedRoleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleTemplateResponseBody</p>
     */
    public static class RoleDescriptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleDescription")
        private java.util.List<RoleDescription> roleDescription;

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
        public java.util.List<RoleDescription> getRoleDescription() {
            return this.roleDescription;
        }

        public static final class Builder {
            private java.util.List<RoleDescription> roleDescription; 

            private Builder() {
            } 

            private Builder(RoleDescriptions model) {
                this.roleDescription = model.roleDescription;
            } 

            /**
             * RoleDescription.
             */
            public Builder roleDescription(java.util.List<RoleDescription> roleDescription) {
                this.roleDescription = roleDescription;
                return this;
            }

            public RoleDescriptions build() {
                return new RoleDescriptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLinkedRoleTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLinkedRoleTemplateResponseBody</p>
     */
    public static class ServiceLinkedRoleTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MultipleRolesAllowed")
        private Boolean multipleRolesAllowed;

        @com.aliyun.core.annotation.NameInMap("RoleDescriptions")
        private RoleDescriptions roleDescriptions;

        @com.aliyun.core.annotation.NameInMap("RoleNamePrefix")
        private String roleNamePrefix;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SystemPolicyName")
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

            private Builder() {
            } 

            private Builder(ServiceLinkedRoleTemplate model) {
                this.multipleRolesAllowed = model.multipleRolesAllowed;
                this.roleDescriptions = model.roleDescriptions;
                this.roleNamePrefix = model.roleNamePrefix;
                this.serviceName = model.serviceName;
                this.systemPolicyName = model.systemPolicyName;
            } 

            /**
             * <p>Indicates whether multiple roles are supported. Valid values:</p>
             * <ul>
             * <li>true: Multiple roles are supported.</li>
             * <li>false: Multiple roles are not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
             * <p>The prefix of the role name.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunServiceRoleForPolarDB</p>
             */
            public Builder roleNamePrefix(String roleNamePrefix) {
                this.roleNamePrefix = roleNamePrefix;
                return this;
            }

            /**
             * <p>The cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>polardb.aliyuncs.com</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The name of the system policy attached to the role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunServiceRolePolicyForPolarDB</p>
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
