// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnsRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnsRouteEntryResponseBody</p>
 */
public class CreateEnsRouteEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteEntryId")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RouteEntryId.
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
