// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTransitRouterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterResponseBody</p>
 */
public class CreateTransitRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTransitRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>404DA7EC-F495-44B5-B543-6EDCDF90F3D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf6llz2286805i44g****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }

        public CreateTransitRouterResponseBody build() {
            return new CreateTransitRouterResponseBody(this);
        } 

    } 

}
