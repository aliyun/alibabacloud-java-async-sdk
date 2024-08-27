// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InactivateCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>InactivateCaCertificateResponseBody</p>
 */
public class InactivateCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    private InactivateCaCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InactivateCaCertificateResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        public InactivateCaCertificateResponseBody build() {
            return new InactivateCaCertificateResponseBody(this);
        } 

    } 

}
