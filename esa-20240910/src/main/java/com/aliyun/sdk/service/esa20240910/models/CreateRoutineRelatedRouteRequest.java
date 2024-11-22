// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateRoutineRelatedRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRelatedRouteRequest</p>
 */
public class CreateRoutineRelatedRouteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Route")
    private String route;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private CreateRoutineRelatedRouteRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.route = builder.route;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineRelatedRouteRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<CreateRoutineRelatedRouteRequest, Builder> {
        private String name; 
        private String route; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRelatedRouteRequest request) {
            super(request);
            this.name = request.name;
            this.route = request.route;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The routine name.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateRoutineRelatedRoute</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The route.</p>
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
        public CreateRoutineRelatedRouteRequest build() {
            return new CreateRoutineRelatedRouteRequest(this);
        } 

    } 

}
