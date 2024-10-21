// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReplaceTransitRouterRouteTableAssociationResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceTransitRouterRouteTableAssociationResponseBody</p>
 */
public class ReplaceTransitRouterRouteTableAssociationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReplaceTransitRouterRouteTableAssociationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceTransitRouterRouteTableAssociationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>160BD7D3-3D1E-5702-9AF0-56E4B15FCB65</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReplaceTransitRouterRouteTableAssociationResponseBody build() {
            return new ReplaceTransitRouterRouteTableAssociationResponseBody(this);
        } 

    } 

}
