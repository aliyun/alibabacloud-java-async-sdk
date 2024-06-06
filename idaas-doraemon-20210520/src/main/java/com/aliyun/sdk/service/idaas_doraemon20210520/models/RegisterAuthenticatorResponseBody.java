// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterAuthenticatorResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterAuthenticatorResponseBody</p>
 */
public class RegisterAuthenticatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthenticatorUuid")
    private String authenticatorUuid;

    @com.aliyun.core.annotation.NameInMap("EtasResponseSting")
    private String etasResponseSting;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterAuthenticatorResponseBody(Builder builder) {
        this.authenticatorUuid = builder.authenticatorUuid;
        this.etasResponseSting = builder.etasResponseSting;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterAuthenticatorResponseBody create() {
        return builder().build();
    }

    /**
     * @return authenticatorUuid
     */
    public String getAuthenticatorUuid() {
        return this.authenticatorUuid;
    }

    /**
     * @return etasResponseSting
     */
    public String getEtasResponseSting() {
        return this.etasResponseSting;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authenticatorUuid; 
        private String etasResponseSting; 
        private String requestId; 

        /**
         * AuthenticatorUuid.
         */
        public Builder authenticatorUuid(String authenticatorUuid) {
            this.authenticatorUuid = authenticatorUuid;
            return this;
        }

        /**
         * EtasResponseSting.
         */
        public Builder etasResponseSting(String etasResponseSting) {
            this.etasResponseSting = etasResponseSting;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterAuthenticatorResponseBody build() {
            return new RegisterAuthenticatorResponseBody(this);
        } 

    } 

}
