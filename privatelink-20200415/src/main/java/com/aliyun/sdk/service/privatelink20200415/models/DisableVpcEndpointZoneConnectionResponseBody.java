// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVpcEndpointZoneConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>DisableVpcEndpointZoneConnectionResponseBody</p>
 */
public class DisableVpcEndpointZoneConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableVpcEndpointZoneConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableVpcEndpointZoneConnectionResponseBody create() {
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

        public DisableVpcEndpointZoneConnectionResponseBody build() {
            return new DisableVpcEndpointZoneConnectionResponseBody(this);
        } 

    } 

}
