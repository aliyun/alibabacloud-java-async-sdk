// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

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
 * {@link GenRealPersonVerificationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenRealPersonVerificationTokenResponseBody</p>
 */
public class GenRealPersonVerificationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenRealPersonVerificationTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenRealPersonVerificationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenRealPersonVerificationTokenResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenRealPersonVerificationTokenResponseBody build() {
            return new GenRealPersonVerificationTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenRealPersonVerificationTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GenRealPersonVerificationTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VerificationToken")
        private String verificationToken;

        private Data(Builder builder) {
            this.verificationToken = builder.verificationToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return verificationToken
         */
        public String getVerificationToken() {
            return this.verificationToken;
        }

        public static final class Builder {
            private String verificationToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.verificationToken = model.verificationToken;
            } 

            /**
             * VerificationToken.
             */
            public Builder verificationToken(String verificationToken) {
                this.verificationToken = verificationToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
