// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @Body
    @NameInMap("aliasName")
    @Validation(required = true)
    private String aliasName;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("resolvePolicy")
    private String resolvePolicy;

    @Body
    @NameInMap("routePolicy")
    private RoutePolicy routePolicy;

    @Body
    @NameInMap("versionId")
    @Validation(required = true)
    private String versionId;

    private CreateAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.description = builder.description;
        this.resolvePolicy = builder.resolvePolicy;
        this.routePolicy = builder.routePolicy;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resolvePolicy
     */
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    /**
     * @return routePolicy
     */
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<CreateAliasRequest, Builder> {
        private String serviceName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String aliasName; 
        private String description; 
        private String resolvePolicy; 
        private RoutePolicy routePolicy; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAliasRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.additionalVersionWeight = request.additionalVersionWeight;
            this.aliasName = request.aliasName;
            this.description = request.description;
            this.resolvePolicy = request.resolvePolicy;
            this.routePolicy = request.routePolicy;
            this.versionId = request.versionId;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time on which the function is invoked. The format of the value is: **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The trace ID of the invocation request of Function Compute.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The canary release version to which the alias points and the weight of the canary release version.
         * <p>
         * 
         * *   The canary release version takes effect only when the function is invoked.
         * *   The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.putBodyParameter("additionalVersionWeight", additionalVersionWeight);
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * The name of the alias.  The name contains only letters, digits, hyphens (-), and underscores (\_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).  The name cannot be **LATEST**.
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The description of the alias.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The canary release mode. Valid values:
         * <p>
         * 
         * *   **Random**: random canary release. This is the default value.
         * *   **Content**: rule-based canary release.
         */
        public Builder resolvePolicy(String resolvePolicy) {
            this.putBodyParameter("resolvePolicy", resolvePolicy);
            this.resolvePolicy = resolvePolicy;
            return this;
        }

        /**
         * The canary release rule. Traffic that meets the canary release rule is routed to the canary release instance.
         */
        public Builder routePolicy(RoutePolicy routePolicy) {
            this.putBodyParameter("routePolicy", routePolicy);
            this.routePolicy = routePolicy;
            return this;
        }

        /**
         * The ID of the version to which the alias points.
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public CreateAliasRequest build() {
            return new CreateAliasRequest(this);
        } 

    } 

}
