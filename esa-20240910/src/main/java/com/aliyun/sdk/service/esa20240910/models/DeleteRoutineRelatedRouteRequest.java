// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteRoutineRelatedRouteRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoutineRelatedRouteRequest</p>
 */
public class DeleteRoutineRelatedRouteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Route")
    private String route;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RouteId")
    private String routeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private DeleteRoutineRelatedRouteRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.route = builder.route;
        this.routeId = builder.routeId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoutineRelatedRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return route
     */
    public String getRoute() {
        return this.route;
    }

    /**
     * @return routeId
     */
    public String getRouteId() {
        return this.routeId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DeleteRoutineRelatedRouteRequest, Builder> {
        private String name; 
        private String route; 
        private String routeId; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoutineRelatedRouteRequest request) {
            super(request);
            this.name = request.name;
            this.route = request.route;
            this.routeId = request.routeId;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>DeleteRoutineRelatedRoute</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The route URL.</p>
         * 
         * <strong>example:</strong>
         * <p><em>.example.com/path1</em></p>
         */
        public Builder route(String route) {
            this.putBodyParameter("Route", route);
            this.route = route;
            return this;
        }

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c3b82a3d1524e9f750da11d0cc0be0a</p>
         */
        public Builder routeId(String routeId) {
            this.putBodyParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        public Builder siteId(Long siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DeleteRoutineRelatedRouteRequest build() {
            return new DeleteRoutineRelatedRouteRequest(this);
        } 

    } 

}
