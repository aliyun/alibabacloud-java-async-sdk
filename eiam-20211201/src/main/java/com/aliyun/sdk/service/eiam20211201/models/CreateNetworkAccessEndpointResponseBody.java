// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkAccessEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkAccessEndpointResponseBody</p>
 */
public class CreateNetworkAccessEndpointResponseBody extends TeaModel {
    @NameInMap("NetworkAccessEndpointId")
    private String networkAccessEndpointId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNetworkAccessEndpointResponseBody(Builder builder) {
        this.networkAccessEndpointId = builder.networkAccessEndpointId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAccessEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkAccessEndpointId
     */
    public String getNetworkAccessEndpointId() {
        return this.networkAccessEndpointId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkAccessEndpointId; 
        private String requestId; 

        /**
         * NetworkAccessEndpointId.
         */
        public Builder networkAccessEndpointId(String networkAccessEndpointId) {
            this.networkAccessEndpointId = networkAccessEndpointId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkAccessEndpointResponseBody build() {
            return new CreateNetworkAccessEndpointResponseBody(this);
        } 

    } 

}
