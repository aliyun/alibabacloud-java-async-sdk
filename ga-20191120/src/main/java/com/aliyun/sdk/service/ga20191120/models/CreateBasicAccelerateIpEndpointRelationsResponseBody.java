// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpEndpointRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationsResponseBody</p>
 */
public class CreateBasicAccelerateIpEndpointRelationsResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateBasicAccelerateIpEndpointRelationsResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAccelerateIpEndpointRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String requestId; 

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBasicAccelerateIpEndpointRelationsResponseBody build() {
            return new CreateBasicAccelerateIpEndpointRelationsResponseBody(this);
        } 

    } 

}
