// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCsrResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCsrResponseBody</p>
 */
public class CreateCsrResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.NameInMap("CsrId")
    private Long csrId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCsrResponseBody(Builder builder) {
        this.csr = builder.csr;
        this.csrId = builder.csrId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCsrResponseBody create() {
        return builder().build();
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return csrId
     */
    public Long getCsrId() {
        return this.csrId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String csr; 
        private Long csrId; 
        private String requestId; 

        /**
         * The content of the CSR.
         */
        public Builder csr(String csr) {
            this.csr = csr;
            return this;
        }

        /**
         * The unique identifier of the CSR. You can use this value to obtain the content of the CSR. For more information about the operation that you can call to obtain the content of a CSR, see [GetCsrDetail](~~2709720~~).
         */
        public Builder csrId(Long csrId) {
            this.csrId = csrId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCsrResponseBody build() {
            return new CreateCsrResponseBody(this);
        } 

    } 

}
