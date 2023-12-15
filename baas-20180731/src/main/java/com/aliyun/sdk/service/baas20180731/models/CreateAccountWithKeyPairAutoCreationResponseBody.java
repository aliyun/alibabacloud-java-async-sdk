// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountWithKeyPairAutoCreationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccountWithKeyPairAutoCreationResponseBody</p>
 */
public class CreateAccountWithKeyPairAutoCreationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateAccountWithKeyPairAutoCreationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountWithKeyPairAutoCreationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateAccountWithKeyPairAutoCreationResponseBody build() {
            return new CreateAccountWithKeyPairAutoCreationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AccountPrivateKey")
        private String accountPrivateKey;

        @NameInMap("AccountPublicKey")
        private String accountPublicKey;

        @NameInMap("AccountRecoverPrivateKey")
        private String accountRecoverPrivateKey;

        @NameInMap("AccountRecoverPublicKey")
        private String accountRecoverPublicKey;

        private Result(Builder builder) {
            this.accountPrivateKey = builder.accountPrivateKey;
            this.accountPublicKey = builder.accountPublicKey;
            this.accountRecoverPrivateKey = builder.accountRecoverPrivateKey;
            this.accountRecoverPublicKey = builder.accountRecoverPublicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accountPrivateKey
         */
        public String getAccountPrivateKey() {
            return this.accountPrivateKey;
        }

        /**
         * @return accountPublicKey
         */
        public String getAccountPublicKey() {
            return this.accountPublicKey;
        }

        /**
         * @return accountRecoverPrivateKey
         */
        public String getAccountRecoverPrivateKey() {
            return this.accountRecoverPrivateKey;
        }

        /**
         * @return accountRecoverPublicKey
         */
        public String getAccountRecoverPublicKey() {
            return this.accountRecoverPublicKey;
        }

        public static final class Builder {
            private String accountPrivateKey; 
            private String accountPublicKey; 
            private String accountRecoverPrivateKey; 
            private String accountRecoverPublicKey; 

            /**
             * AccountPrivateKey.
             */
            public Builder accountPrivateKey(String accountPrivateKey) {
                this.accountPrivateKey = accountPrivateKey;
                return this;
            }

            /**
             * AccountPublicKey.
             */
            public Builder accountPublicKey(String accountPublicKey) {
                this.accountPublicKey = accountPublicKey;
                return this;
            }

            /**
             * AccountRecoverPrivateKey.
             */
            public Builder accountRecoverPrivateKey(String accountRecoverPrivateKey) {
                this.accountRecoverPrivateKey = accountRecoverPrivateKey;
                return this;
            }

            /**
             * AccountRecoverPublicKey.
             */
            public Builder accountRecoverPublicKey(String accountRecoverPublicKey) {
                this.accountRecoverPublicKey = accountRecoverPublicKey;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
