// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterServiceResponseBody</p>
 */
public class RegisterServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterServiceResponseBody(Builder builder) {
        this.registrationId = builder.registrationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String registrationId; 
        private String requestId; 

        /**
         * The registration ID.
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterServiceResponseBody build() {
            return new RegisterServiceResponseBody(this);
        } 

    } 

}
