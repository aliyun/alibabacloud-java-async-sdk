// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCaCertResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaCertResponseBody</p>
 */
public class GetCaCertResponseBody extends TeaModel {
    @NameInMap("CaCert")
    private String caCert;

    @NameInMap("RequestId")
    private String requestId;

    private GetCaCertResponseBody(Builder builder) {
        this.caCert = builder.caCert;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return caCert
     */
    public String getCaCert() {
        return this.caCert;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String caCert; 
        private String requestId; 

        /**
         * The Base64-encoded content of the CA certificate.
         */
        public Builder caCert(String caCert) {
            this.caCert = caCert;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCaCertResponseBody build() {
            return new GetCaCertResponseBody(this);
        } 

    } 

}
