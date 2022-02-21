// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAntChainAccountResponseBody</p>
 */
public class CreateAntChainAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private CreateAntChainAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntChainAccountResponseBody create() {
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

        public CreateAntChainAccountResponseBody build() {
            return new CreateAntChainAccountResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("AntChainId")
        private String antChainId;

        private Result(Builder builder) {
            this.account = builder.account;
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
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        public static final class Builder {
            private String account; 
            private String antChainId; 

            /**
             * Account.
             */
            public Builder account(String account) {
                this.account = account;
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
