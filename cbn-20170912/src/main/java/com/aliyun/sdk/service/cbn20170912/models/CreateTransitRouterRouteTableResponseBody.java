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
 * {@link CreateTransitRouterRouteTableResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteTableResponseBody</p>
 */
public class CreateTransitRouterRouteTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    private String transitRouterRouteTableId;

    private CreateTransitRouterRouteTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteTableResponseBody create() {
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
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterRouteTableId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterRouteTableResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterRouteTableId = model.transitRouterRouteTableId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>599904C8-A3DA-4E5F-83B6-D5364E664247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the custom route table.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1xbcgpgcz9axl9m****</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        public CreateTransitRouterRouteTableResponseBody build() {
            return new CreateTransitRouterRouteTableResponseBody(this);
        } 

    } 

}
