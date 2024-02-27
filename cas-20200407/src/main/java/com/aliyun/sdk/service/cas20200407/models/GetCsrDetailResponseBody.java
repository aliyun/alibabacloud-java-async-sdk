// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCsrDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetCsrDetailResponseBody</p>
 */
public class GetCsrDetailResponseBody extends TeaModel {
    @NameInMap("Csr")
    private String csr;

    @NameInMap("RequestId")
    private String requestId;

    private GetCsrDetailResponseBody(Builder builder) {
        this.csr = builder.csr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCsrDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String csr; 
        private String requestId; 

        /**
         * Csr.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCsrDetailResponseBody build() {
            return new GetCsrDetailResponseBody(this);
        } 

    } 

}
