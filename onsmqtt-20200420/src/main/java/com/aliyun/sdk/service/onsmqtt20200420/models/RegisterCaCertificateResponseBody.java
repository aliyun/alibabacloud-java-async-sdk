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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RegisterCaCertificateResponseBody model) {
            this.requestId = model.requestId;
            this.sn = model.sn;
        } 

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
         * <p>The serial number of the registered CA certificate. The serial number is the unique identifier of a CA certificate.</p>
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
