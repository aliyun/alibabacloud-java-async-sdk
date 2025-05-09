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
 * {@link AssociateRouteTablesWithVpcGatewayEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateRouteTablesWithVpcGatewayEndpointResponseBody</p>
 */
public class AssociateRouteTablesWithVpcGatewayEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateRouteTablesWithVpcGatewayEndpointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateRouteTablesWithVpcGatewayEndpointResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssociateRouteTablesWithVpcGatewayEndpointResponseBody model) {
            this.requestId = model.requestId;
        } 

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

        public AssociateRouteTablesWithVpcGatewayEndpointResponseBody build() {
            return new AssociateRouteTablesWithVpcGatewayEndpointResponseBody(this);
        } 

    } 

}
