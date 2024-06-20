// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountWithKeyPairAutoCreationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAntChainAccountWithKeyPairAutoCreationResponseBody</p>
 */
public class CreateAntChainAccountWithKeyPairAutoCreationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private CreateAntChainAccountWithKeyPairAutoCreationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainAccountWithKeyPairAutoCreationResponseBody create() {
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

        public CreateAntChainAccountWithKeyPairAutoCreationResponseBody build() {
            return new CreateAntChainAccountWithKeyPairAutoCreationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("AccountPrivateKey")
        private String accountPrivateKey;

        @com.aliyun.core.annotation.NameInMap("AccountPublicKey")
        private String accountPublicKey;

        @com.aliyun.core.annotation.NameInMap("AccountRecoverPrivateKey")
        private String accountRecoverPrivateKey;

        @com.aliyun.core.annotation.NameInMap("AccountRecoverPublicKey")
        private String accountRecoverPublicKey;

        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        private Result(Builder builder) {
            this.account = builder.account;
            this.accountPrivateKey = builder.accountPrivateKey;
            this.accountPublicKey = builder.accountPublicKey;
            this.accountRecoverPrivateKey = builder.accountRecoverPrivateKey;
            this.accountRecoverPublicKey = builder.accountRecoverPublicKey;
            this.antChainId = builder.antChainId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
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

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        public static final class Builder {
            private String account; 
            private String accountPrivateKey; 
            private String accountPublicKey; 
            private String accountRecoverPrivateKey; 
            private String accountRecoverPublicKey; 
            private String antChainId; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

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

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
