// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClassicNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClassicNetworkResponseBody</p>
 */
public class CreateClassicNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the network.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5s9ayrxsd9hszrlt5fgv2****</p>
         */
        public Builder networkId(String networkId) {
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A004E06-AC1B-5806-BA5E-41AB6B02DE83</p>
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
