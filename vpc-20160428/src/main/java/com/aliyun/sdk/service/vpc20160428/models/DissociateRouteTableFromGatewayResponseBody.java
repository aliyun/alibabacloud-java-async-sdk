// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateRouteTableFromGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DissociateRouteTableFromGatewayResponseBody</p>
 */
public class DissociateRouteTableFromGatewayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DissociateRouteTableFromGatewayResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateRouteTableFromGatewayResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DissociateRouteTableFromGatewayResponseBody build() {
            return new DissociateRouteTableFromGatewayResponseBody(this);
        } 

    } 

}
