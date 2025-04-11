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
 * {@link CreateTransitRouterRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteEntryResponseBody</p>
 */
public class CreateTransitRouterRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryId")
    private String transitRouterRouteEntryId;

    private CreateTransitRouterRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterRouteEntryId = builder.transitRouterRouteEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteEntryResponseBody create() {
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
     * @return transitRouterRouteEntryId
     */
    public String getTransitRouterRouteEntryId() {
        return this.transitRouterRouteEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterRouteEntryId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterRouteEntryResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterRouteEntryId = model.transitRouterRouteEntryId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>835E7F4B-B380-4E0F-96A5-6EA572388047</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-75eg4jprkvk0pw****</p>
         */
        public Builder transitRouterRouteEntryId(String transitRouterRouteEntryId) {
            this.transitRouterRouteEntryId = transitRouterRouteEntryId;
            return this;
        }

        public CreateTransitRouterRouteEntryResponseBody build() {
            return new CreateTransitRouterRouteEntryResponseBody(this);
        } 

    } 

}
