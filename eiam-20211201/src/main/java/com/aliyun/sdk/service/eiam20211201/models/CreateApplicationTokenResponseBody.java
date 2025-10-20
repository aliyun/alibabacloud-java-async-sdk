// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateApplicationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationTokenResponseBody</p>
 */
public class CreateApplicationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationTokens")
    private ApplicationTokens applicationTokens;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationTokenResponseBody(Builder builder) {
        this.applicationTokens = builder.applicationTokens;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationTokens
     */
    public ApplicationTokens getApplicationTokens() {
        return this.applicationTokens;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationTokens applicationTokens; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApplicationTokenResponseBody model) {
            this.applicationTokens = model.applicationTokens;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationTokens.
         */
        public Builder applicationTokens(ApplicationTokens applicationTokens) {
            this.applicationTokens = applicationTokens;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationTokenResponseBody build() {
            return new CreateApplicationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationTokenResponseBody</p>
     */
    public static class ApplicationTokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationToken")
        private String applicationToken;

        @com.aliyun.core.annotation.NameInMap("ApplicationTokenId")
        private String applicationTokenId;

        @com.aliyun.core.annotation.NameInMap("ApplicationTokenType")
        private String applicationTokenType;

        private ApplicationTokens(Builder builder) {
            this.applicationToken = builder.applicationToken;
            this.applicationTokenId = builder.applicationTokenId;
            this.applicationTokenType = builder.applicationTokenType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationTokens create() {
            return builder().build();
        }

        /**
         * @return applicationToken
         */
        public String getApplicationToken() {
            return this.applicationToken;
        }

        /**
         * @return applicationTokenId
         */
        public String getApplicationTokenId() {
            return this.applicationTokenId;
        }

        /**
         * @return applicationTokenType
         */
        public String getApplicationTokenType() {
            return this.applicationTokenType;
        }

        public static final class Builder {
            private String applicationToken; 
            private String applicationTokenId; 
            private String applicationTokenType; 

            private Builder() {
            } 

            private Builder(ApplicationTokens model) {
                this.applicationToken = model.applicationToken;
                this.applicationTokenId = model.applicationTokenId;
                this.applicationTokenType = model.applicationTokenType;
            } 

            /**
             * <p>应用token</p>
             * 
             * <strong>example:</strong>
             * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBYkt3XXX</p>
             */
            public Builder applicationToken(String applicationToken) {
                this.applicationToken = applicationToken;
                return this;
            }

            /**
             * <p>应用token ID</p>
             * 
             * <strong>example:</strong>
             * <p>token_ndfxxigahelfne2y2hodehrxxxx</p>
             */
            public Builder applicationTokenId(String applicationTokenId) {
                this.applicationTokenId = applicationTokenId;
                return this;
            }

            /**
             * <p>应用token类型</p>
             * 
             * <strong>example:</strong>
             * <p>bearer_token</p>
             */
            public Builder applicationTokenType(String applicationTokenType) {
                this.applicationTokenType = applicationTokenType;
                return this;
            }

            public ApplicationTokens build() {
                return new ApplicationTokens(this);
            } 

        } 

    }
}
