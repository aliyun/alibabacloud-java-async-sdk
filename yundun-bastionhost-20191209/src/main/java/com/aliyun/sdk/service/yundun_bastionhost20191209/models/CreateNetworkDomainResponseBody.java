// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkDomainResponseBody</p>
 */
public class CreateNetworkDomainResponseBody extends TeaModel {
    @NameInMap("NetworkDomainId")
    private String networkDomainId;

    @NameInMap("RequestId")
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
         * NetworkDomainId.
         */
        public Builder networkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * RequestId.
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
