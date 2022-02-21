// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RouteConfig} extends {@link TeaModel}
 *
 * <p>RouteConfig</p>
 */
public class RouteConfig extends TeaModel {
    @NameInMap("routes")
    private java.util.List < PathConfig > routes;

    private RouteConfig(Builder builder) {
        this.routes = builder.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RouteConfig create() {
        return builder().build();
    }

    /**
     * @return routes
     */
    public java.util.List < PathConfig > getRoutes() {
        return this.routes;
    }

    public static final class Builder {
        private java.util.List < PathConfig > routes; 

        /**
         * routes
         */
        public Builder routes(java.util.List < PathConfig > routes) {
            this.routes = routes;
            return this;
        }

        public RouteConfig build() {
            return new RouteConfig(this);
        } 

    } 

}
