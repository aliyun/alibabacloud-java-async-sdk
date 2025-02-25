// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDcdnDomainSSLCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainSSLCertificateResponseBody</p>
 */
public class SetDcdnDomainSSLCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetDcdnDomainSSLCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainSSLCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A7C69682-7F88-40DD-A198-10D0309E439D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDcdnDomainSSLCertificateResponseBody build() {
            return new SetDcdnDomainSSLCertificateResponseBody(this);
        } 

    } 

}
