// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterCaCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterCaCertificateResponseBody</p>
 */
public class RegisterCaCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    private RegisterCaCertificateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sn = builder.sn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterCaCertificateResponseBody create() {
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
         * <p>Public parameters, each request ID is unique and can be used for troubleshooting and problem localization.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SN serial number of the registered CA certificate, used to uniquely identify a CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>007269004887******</p>
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        public RegisterCaCertificateResponseBody build() {
            return new RegisterCaCertificateResponseBody(this);
        } 

    } 

}
