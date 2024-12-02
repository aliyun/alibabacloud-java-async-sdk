// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNetworkDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkDomainResponseBody</p>
 */
public class CreateNetworkDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    private String networkDomainId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkDomainResponseBody(Builder builder) {
        this.networkDomainId = builder.networkDomainId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String networkDomainId; 
        private String requestId; 

        /**
         * <p>The ID of the network domain.</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A2873E9C-A7EA-5735-845C-65D3792623D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkDomainResponseBody build() {
            return new CreateNetworkDomainResponseBody(this);
        } 

    } 

}
