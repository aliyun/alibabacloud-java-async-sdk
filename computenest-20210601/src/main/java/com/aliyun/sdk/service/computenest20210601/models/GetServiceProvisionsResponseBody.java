// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceProvisionsResponseBody</p>
 */
public class GetServiceProvisionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceProvisions")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceProvisions.
         */
        public Builder serviceProvisions(java.util.List < ServiceProvisions> serviceProvisions) {
            this.serviceProvisions = serviceProvisions;
            return this;
        }

        public GetServiceProvisionsResponseBody build() {
            return new GetServiceProvisionsResponseBody(this);
        } 

    } 

    public static class Roles extends TeaModel {
        @NameInMap("Created")
        private Boolean created;

        @NameInMap("Function")
        private String function;

        @NameInMap("RoleName")
        private String roleName;

        private Roles(Builder builder) {
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
            private Boolean created; 
            private String function; 
            private String roleName; 

            /**
             * Created.
             */
            public Builder created(Boolean created) {
                this.created = created;
                return this;
            }

            /**
             * Function.
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * RoleName.
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
        @NameInMap("AuthorizationURL")
        private String authorizationURL;

        @NameInMap("Roles")
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
             * AuthorizationURL.
             */
            public Builder authorizationURL(String authorizationURL) {
                this.authorizationURL = authorizationURL;
                return this;
            }

            /**
             * Roles.
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
        @NameInMap("AutoEnableService")
        private Boolean autoEnableService;

        @NameInMap("EnableURL")
        private String enableURL;

        @NameInMap("RoleProvision")
        private RoleProvision roleProvision;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
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
             * AutoEnableService.
             */
            public Builder autoEnableService(Boolean autoEnableService) {
                this.autoEnableService = autoEnableService;
                return this;
            }

            /**
             * EnableURL.
             */
            public Builder enableURL(String enableURL) {
                this.enableURL = enableURL;
                return this;
            }

            /**
             * RoleProvision.
             */
            public Builder roleProvision(RoleProvision roleProvision) {
                this.roleProvision = roleProvision;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusReason.
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
