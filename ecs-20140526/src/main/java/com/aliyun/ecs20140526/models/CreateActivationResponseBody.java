// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateActivationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateActivationResponseBody</p>
 */
public class CreateActivationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ActivationCode")
    private String activationCode;

    @NameInMap("ActivationId")
    private String activationId;

    private CreateActivationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.activationCode = builder.activationCode;
        this.activationId = builder.activationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActivationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return activationCode
     */
    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * @return activationId
     */
    public String getActivationId() {
        return this.activationId;
    }

    public static final class Builder {
        private String requestId; 
        private String activationCode; 
        private String activationId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The code of the activation code. This code is returned only once when an API is called and cannot be queried later. Therefore, you must properly save the returned value.
         */
        public Builder activationCode(String activationCode) {
            this.activationCode = activationCode;
            return this;
        }

        /**
         * Activation Code ID.
         */
        public Builder activationId(String activationId) {
            this.activationId = activationId;
            return this;
        }

        public CreateActivationResponseBody build() {
            return new CreateActivationResponseBody(this);
        } 

    } 

}
