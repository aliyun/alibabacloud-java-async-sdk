// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DissociateRouteTablesFromVpcGatewayEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateRouteTablesFromVpcGatewayEndpointResponseBody</p>
 */
public class DissociateRouteTablesFromVpcGatewayEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DissociateRouteTablesFromVpcGatewayEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateRouteTablesFromVpcGatewayEndpointResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>59BDDA2D-FB52-59F9-9DC5-5EA7D6808B8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DissociateRouteTablesFromVpcGatewayEndpointResponseBody build() {
            return new DissociateRouteTablesFromVpcGatewayEndpointResponseBody(this);
        } 

    } 

}
