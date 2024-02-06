// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClassicNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClassicNetworkResponseBody</p>
 */
public class CreateClassicNetworkResponseBody extends TeaModel {
    @NameInMap("NetworkId")
    private String networkId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateClassicNetworkResponseBody(Builder builder) {
        this.networkId = builder.networkId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClassicNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkId; 
        private String requestId; 

        /**
         * The ID of the network.
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClassicNetworkResponseBody build() {
            return new CreateClassicNetworkResponseBody(this);
        } 

    } 

}
