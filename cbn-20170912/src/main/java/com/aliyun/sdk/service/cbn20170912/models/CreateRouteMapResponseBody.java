// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteMapResponseBody</p>
 */
public class CreateRouteMapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteMapId")
    private String routeMapId;

    private CreateRouteMapResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeMapId = builder.routeMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteMapResponseBody create() {
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
     * @return routeMapId
     */
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeMapId; 

        private Builder() {
        } 

        private Builder(CreateRouteMapResponseBody model) {
            this.requestId = model.requestId;
            this.routeMapId = model.routeMapId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0C2EE7A8-74D4-4081-8236-CEBDE3BBCF50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the route map.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-abcdedfghij****</p>
         */
        public Builder routeMapId(String routeMapId) {
            this.routeMapId = routeMapId;
            return this;
        }

        public CreateRouteMapResponseBody build() {
            return new CreateRouteMapResponseBody(this);
        } 

    } 

}
