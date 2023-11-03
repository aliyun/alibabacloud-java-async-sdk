// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody</p>
 */
public class UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody build() {
            return new UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody(this);
        } 

    } 

}
