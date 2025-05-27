// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceProvisionsResponseBody</p>
 */
public class GetServiceProvisionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceProvisions")
    private java.util.List<ServiceProvisions> serviceProvisions;

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
     * @return serviceProvisions
     */
    public java.util.List<ServiceProvisions> getServiceProvisions() {
        return this.serviceProvisions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ServiceProvisions> serviceProvisions; 

        private Builder() {
        } 

        private Builder(GetServiceProvisionsResponseBody model) {
            this.requestId = model.requestId;
            this.serviceProvisions = model.serviceProvisions;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8C27145F-C9F4-545D-A355-DCDDAD63D548</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the services.</p>
         */
        public Builder serviceProvisions(java.util.List<ServiceProvisions> serviceProvisions) {
            this.serviceProvisions = serviceProvisions;
            return this;
        }

        public GetServiceProvisionsResponseBody build() {
            return new GetServiceProvisionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsResponseBody</p>
     */
    public static class CommodityProvisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("EnableURL")
        private String enableURL;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CommodityProvisions(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.enableURL = builder.enableURL;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityProvisions create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return enableURL
         */
        public String getEnableURL() {
            return this.enableURL;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String commodityCode; 
            private String enableURL; 
            private String status; 

            private Builder() {
            } 

            private Builder(CommodityProvisions model) {
                this.commodityCode = model.commodityCode;
                this.enableURL = model.enableURL;
                this.status = model.status;
            } 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CommodityProvisions build() {
                return new CommodityProvisions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsResponseBody</p>
     */
    public static class ApiForCreation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiProductId")
        private String apiProductId;

        @com.aliyun.core.annotation.NameInMap("ApiType")
        private String apiType;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.Map<String, ?> parameters;

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
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String apiName; 
            private String apiProductId; 
            private String apiType; 
            private java.util.Map<String, ?> parameters; 

            private Builder() {
            } 

            private Builder(ApiForCreation model) {
                this.apiName = model.apiName;
                this.apiProductId = model.apiProductId;
                this.apiType = model.apiType;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The name of the API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateServiceLinkedRole</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud service to which the API operation belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder apiProductId(String apiProductId) {
                this.apiProductId = apiProductId;
                return this;
            }

            /**
             * <p>The type of the API operation. Valid values:</p>
             * <ul>
             * <li>Open: public</li>
             * <li>Inner: private</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder apiType(String apiType) {
                this.apiType = apiType;
                return this;
            }

            /**
             * <p>The ROS parameters of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;ServiceLinkedRole&quot;: &quot;AliyunServiceRoleForRdsPgsqlOnEcs&quot;, &quot;RegionId&quot;: &quot;${RegionId}&quot; }</p>
             */
            public Builder parameters(java.util.Map<String, ?> parameters) {
                this.parameters = parameters;
                return this;
            }

            public ApiForCreation build() {
                return new ApiForCreation(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Roles model) {
                this.apiForCreation = model.apiForCreation;
                this.created = model.created;
                this.function = model.function;
                this.roleName = model.roleName;
            } 

            /**
             * <p>The information about the API operation that is used to create the RAM role.</p>
             */
            public Builder apiForCreation(ApiForCreation apiForCreation) {
                this.apiForCreation = apiForCreation;
                return this;
            }

            /**
             * <p>Indicates whether the RAM role is created. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder created(Boolean created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The purpose for which the RAM role is used. Default value: Default. A value of Default indicates that the RAM role is the default role of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder function(String function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunCSManagedVKRole</p>
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
    /**
     * 
     * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsResponseBody</p>
     */
    public static class RoleProvision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationURL")
        private String authorizationURL;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

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
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        public static final class Builder {
            private String authorizationURL; 
            private java.util.List<Roles> roles; 

            private Builder() {
            } 

            private Builder(RoleProvision model) {
                this.authorizationURL = model.authorizationURL;
                this.roles = model.roles;
            } 

            /**
             * <p>The authorization URL of the RAM role.</p>
             * <blockquote>
             * <p>This parameter is returned if Created is set to false.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22:%5B%7B%22Service%22:%22CS%22,%22Roles%22:%5B%7B%22RoleName%22:%22AliyunCSManagedVKRole%22,%22TemplateId%22:%22AliyunCSManagedVKRole%22%7D,%7B%22RoleName%22:%22AliyunCSDefaultRole%22,%22TemplateId%22:%22Default%22%7D%5D%7D%5D,%22ReturnUrl%22:%22https://cs.console.aliyun.com/%22%7D">https://ram.console.aliyun.com/role/authorization?request={&quot;Services&quot;:[{&quot;Service&quot;:&quot;CS&quot;,&quot;Roles&quot;:[{&quot;RoleName&quot;:&quot;AliyunCSManagedVKRole&quot;,&quot;TemplateId&quot;:&quot;AliyunCSManagedVKRole&quot;},{&quot;RoleName&quot;:&quot;AliyunCSDefaultRole&quot;,&quot;TemplateId&quot;:&quot;Default&quot;}]}],&quot;ReturnUrl&quot;:&quot;https://cs.console.aliyun.com/&quot;}</a></p>
             */
            public Builder authorizationURL(String authorizationURL) {
                this.authorizationURL = authorizationURL;
                return this;
            }

            /**
             * <p>The RAM roles of the service.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            public RoleProvision build() {
                return new RoleProvision(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceProvisionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvisionsResponseBody</p>
     */
    public static class ServiceProvisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoEnableService")
        private Boolean autoEnableService;

        @com.aliyun.core.annotation.NameInMap("CommodityProvisions")
        private java.util.List<CommodityProvisions> commodityProvisions;

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
            this.commodityProvisions = builder.commodityProvisions;
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
         * @return commodityProvisions
         */
        public java.util.List<CommodityProvisions> getCommodityProvisions() {
            return this.commodityProvisions;
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
            private java.util.List<CommodityProvisions> commodityProvisions; 
            private String enableURL; 
            private RoleProvision roleProvision; 
            private String serviceName; 
            private String status; 
            private String statusReason; 

            private Builder() {
            } 

            private Builder(ServiceProvisions model) {
                this.autoEnableService = model.autoEnableService;
                this.commodityProvisions = model.commodityProvisions;
                this.enableURL = model.enableURL;
                this.roleProvision = model.roleProvision;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.statusReason = model.statusReason;
            } 

            /**
             * <p>Indicates whether automatic activation for the service is defined in the template. Valid values:</p>
             * <ul>
             * <li>true: Automatic activation for the service is defined in the template.</li>
             * <li>false: Manual activation for the service is defined in the template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoEnableService(Boolean autoEnableService) {
                this.autoEnableService = autoEnableService;
                return this;
            }

            /**
             * CommodityProvisions.
             */
            public Builder commodityProvisions(java.util.List<CommodityProvisions> commodityProvisions) {
                this.commodityProvisions = commodityProvisions;
                return this;
            }

            /**
             * <p>The URL that points to the activation page of the service.</p>
             * <blockquote>
             * <p>This parameter is returned if Status is set to Disabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://common-buy.aliyun.com/?commodityCode=sls">https://common-buy.aliyun.com/?commodityCode=sls</a></p>
             */
            public Builder enableURL(String enableURL) {
                this.enableURL = enableURL;
                return this;
            }

            /**
             * <p>The information about the RAM roles of the service. If this parameter is empty, no RAM role is associated with the service.</p>
             */
            public Builder roleProvision(RoleProvision roleProvision) {
                this.roleProvision = roleProvision;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>CS</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The activation status of the service. Valid values:</p>
             * <ul>
             * <li>Enabled: The service is activated.</li>
             * <li>Disabled: The service is not activated.</li>
             * <li>Unknown: The activation status of the service is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the service is in the Disabled or Unknown state.</p>
             * <blockquote>
             * <p>This parameter is returned if Status is set to Disabled or Unknown.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>No permission</p>
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
