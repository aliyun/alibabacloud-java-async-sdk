// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterServiceResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterServiceResponseBody</p>
 */
public class RegisterServiceResponseBody extends TeaModel {
    @NameInMap("RegistrationId")
    private String registrationId;

    @NameInMap("RequestId")
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
         * RegistrationId.
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        /**
         * RequestId.
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
