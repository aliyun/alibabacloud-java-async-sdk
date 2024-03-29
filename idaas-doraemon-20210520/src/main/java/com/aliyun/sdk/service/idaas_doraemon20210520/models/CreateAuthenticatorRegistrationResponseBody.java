// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAuthenticatorRegistrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthenticatorRegistrationResponseBody</p>
 */
public class CreateAuthenticatorRegistrationResponseBody extends TeaModel {
    @NameInMap("ChallengeBase64")
    private String challengeBase64;

    @NameInMap("Options")
    private String options;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAuthenticatorRegistrationResponseBody(Builder builder) {
        this.challengeBase64 = builder.challengeBase64;
        this.options = builder.options;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthenticatorRegistrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return challengeBase64
     */
    public String getChallengeBase64() {
        return this.challengeBase64;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String challengeBase64; 
        private String options; 
        private String requestId; 

        /**
         * ChallengeBase64.
         */
        public Builder challengeBase64(String challengeBase64) {
            this.challengeBase64 = challengeBase64;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthenticatorRegistrationResponseBody build() {
            return new CreateAuthenticatorRegistrationResponseBody(this);
        } 

    } 

}
