// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceProvisionsResponseBody</p>
 */
public class GetServiceProvisionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceProvisions")
    private java.util.List < ServiceProvisions> serviceProvisions;

    private GetServiceProvisionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceProvisions = builder.serviceProvisions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceProvisionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceProvisions
     */
    public java.util.List < ServiceProvisions> getServiceProvisions() {
        return this.serviceProvisions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ServiceProvisions> serviceProvisions; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the services.
         */
        public Builder serviceProvisions(java.util.List < ServiceProvisions> serviceProvisions) {
            this.serviceProvisions = serviceProvisions;
            return this;
        }

        public GetServiceProvisionsResponseBody build() {
            return new GetServiceProvisionsResponseBody(this);
        } 

    } 

    public static class ApiForCreation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiProductId")
        private String apiProductId;

        @com.aliyun.core.annotation.NameInMap("ApiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map < String, ? > parameters;

        private ApiForCreation(Builder builder) {
            this.apiName = builder.apiName;
            this.apiProductId = builder.apiProductId;
            this.apiType = builder.apiType;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiForCreation create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiProductId
         */
        public String getApiProductId() {
            return this.apiProductId;
        }

        /**
         * @return apiType
         */
        public String getApiType() {
            return this.apiType;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, ? > getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String apiName; 
            private String apiProductId; 
            private String apiType; 
            private java.util.Map < String, ? > parameters; 

            /**
             * The name of the API operation.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud service to which the API operation belongs.
             */
            public Builder apiProductId(String apiProductId) {
                this.apiProductId = apiProductId;
                return this;
            }

            /**
             * The type of the API operation. Valid values:
             * <p>
             * 
             * *   Open: public
             * *   Inner: private
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * The ROS parameters of the cluster.
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            public ApiForCreation build() {
                return new ApiForCreation(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiForCreation")
        private ApiForCreation apiForCreation;

        @com.aliyun.core.annotation.NameInMap("Created")
        private Boolean created;

        @com.aliyun.core.annotation.NameInMap("Function")
        private String function;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private Roles(Builder builder) {
            this.apiForCreation = builder.apiForCreation;
            this.created = builder.created;
            this.function = builder.function;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return apiForCreation
         */
        public ApiForCreation getApiForCreation() {
            return this.apiForCreation;
        }

        /**
         * @return created
         */
        public Boolean getCreated() {
            return this.created;
        }

        /**
         * @return function
         */
        public String getFunction() {
            return this.function;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private ApiForCreation apiForCreation; 
            private Boolean created; 
            private String function; 
            private String roleName; 

            /**
             * The information about the API operation that is used to create the RAM role.
             */
            public Builder apiForCreation(ApiForCreation apiForCreation) {
                this.apiForCreation = apiForCreation;
                return this;
            }

            /**
             * Indicates whether the RAM role is created. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder created(Boolean created) {
                this.created = created;
                return this;
            }

            /**
             * The purpose for which the RAM role is used. Default value: Default. A value of Default indicates that the RAM role is the default role of the service.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * The name of the role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class RoleProvision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationURL")
        private String authorizationURL;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List < Roles> roles;

        private RoleProvision(Builder builder) {
            this.authorizationURL = builder.authorizationURL;
            this.roles = builder.roles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleProvision create() {
            return builder().build();
        }

        /**
         * @return authorizationURL
         */
        public String getAuthorizationURL() {
            return this.authorizationURL;
        }

        /**
         * @return roles
         */
        public java.util.List < Roles> getRoles() {
            return this.roles;
        }

        public static final class Builder {
            private String authorizationURL; 
            private java.util.List < Roles> roles; 

            /**
             * The authorization URL of the RAM role.
             * <p>
             * 
             * > This parameter is returned if Created is set to false.
             */
            public Builder authorizationURL(String authorizationURL) {
                this.authorizationURL = authorizationURL;
                return this;
            }

            /**
             * The RAM roles of the service.
             */
            public Builder roles(java.util.List < Roles> roles) {
                this.roles = roles;
                return this;
            }

            public RoleProvision build() {
                return new RoleProvision(this);
            } 

        } 

    }
    public static class ServiceProvisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoEnableService")
        private Boolean autoEnableService;

        @com.aliyun.core.annotation.NameInMap("EnableURL")
        private String enableURL;

        @com.aliyun.core.annotation.NameInMap("RoleProvision")
        private RoleProvision roleProvision;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private ServiceProvisions(Builder builder) {
            this.autoEnableService = builder.autoEnableService;
            this.enableURL = builder.enableURL;
            this.roleProvision = builder.roleProvision;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceProvisions create() {
            return builder().build();
        }

        /**
         * @return autoEnableService
         */
        public Boolean getAutoEnableService() {
            return this.autoEnableService;
        }

        /**
         * @return enableURL
         */
        public String getEnableURL() {
            return this.enableURL;
        }

        /**
         * @return roleProvision
         */
        public RoleProvision getRoleProvision() {
            return this.roleProvision;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private Boolean autoEnableService; 
            private String enableURL; 
            private RoleProvision roleProvision; 
            private String serviceName; 
            private String status; 
            private String statusReason; 

            /**
             * Indicates whether automatic activation for the service is defined in the template. Valid values:
             * <p>
             * 
             * *   true: Automatic activation for the service is defined in the template.
             * *   false: Manual activation for the service is defined in the template.
             */
            public Builder autoEnableService(Boolean autoEnableService) {
                this.autoEnableService = autoEnableService;
                return this;
            }

            /**
             * The URL that points to the activation page of the service.
             * <p>
             * 
             * > This parameter is returned if Status is set to Disabled.
             */
            public Builder enableURL(String enableURL) {
                this.enableURL = enableURL;
                return this;
            }

            /**
             * The information about the RAM roles of the service. If this parameter is empty, no RAM role is associated with the service.
             */
            public Builder roleProvision(RoleProvision roleProvision) {
                this.roleProvision = roleProvision;
                return this;
            }

            /**
             * The service name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The activation status of the service. Valid values:
             * <p>
             * 
             * *   Enabled: The service is activated.
             * *   Disabled: The service is not activated.
             * *   Unknown: The activation status of the service is unknown.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the service is in the Disabled or Unknown state.
             * <p>
             * 
             * > This parameter is returned if Status is set to Disabled or Unknown.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public ServiceProvisions build() {
                return new ServiceProvisions(this);
            } 

        } 

    }
}
