// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnsRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnsRouteEntryResponseBody</p>
 */
public class CreateEnsRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    private CreateEnsRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeEntryId = builder.routeEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnsRouteEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeEntryId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the route.
         */
        public Builder routeEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }

        public CreateEnsRouteEntryResponseBody build() {
            return new CreateEnsRouteEntryResponseBody(this);
        } 

    } 

}
