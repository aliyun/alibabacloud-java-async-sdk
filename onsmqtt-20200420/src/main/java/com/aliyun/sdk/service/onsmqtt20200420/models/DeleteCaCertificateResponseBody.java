// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCaCertificateResponseBody</p>
 */
public class DeleteCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    private DeleteCaCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCaCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    public static final class Builder {
        private String requestId; 
        private String sn; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The serial number of the CA certificate that you deleted. The serial number is the unique identifier of a CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        public DeleteCaCertificateResponseBody build() {
            return new DeleteCaCertificateResponseBody(this);
        } 

    } 

}
