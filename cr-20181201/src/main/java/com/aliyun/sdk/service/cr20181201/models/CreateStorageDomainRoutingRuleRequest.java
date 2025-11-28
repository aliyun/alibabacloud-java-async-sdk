// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link CreateStorageDomainRoutingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageDomainRoutingRuleRequest</p>
 */
public class CreateStorageDomainRoutingRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Routes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RouteItem> routes;

    private CreateStorageDomainRoutingRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageDomainRoutingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return routes
     */
    public java.util.List<RouteItem> getRoutes() {
        return this.routes;
    }

    public static final class Builder extends Request.Builder<CreateStorageDomainRoutingRuleRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private java.util.List<RouteItem> routes; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageDomainRoutingRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.routes = request.routes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xkx6vujuhay0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder routes(java.util.List<RouteItem> routes) {
            String routesShrink = shrink(routes, "Routes", "json");
            this.putQueryParameter("Routes", routesShrink);
            this.routes = routes;
            return this;
        }

        @Override
        public CreateStorageDomainRoutingRuleRequest build() {
            return new CreateStorageDomainRoutingRuleRequest(this);
        } 

    } 

}
