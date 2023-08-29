// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateNonceResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateNonceResponseBody</p>
 */
public class GenerateNonceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("data")
    private Data data;

    private GenerateNonceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateNonceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Data data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        public GenerateNonceResponseBody build() {
            return new GenerateNonceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CredentialBlob")
        private String credentialBlob;

        private Data(Builder builder) {
            this.credentialBlob = builder.credentialBlob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return credentialBlob
         */
        public String getCredentialBlob() {
            return this.credentialBlob;
        }

        public static final class Builder {
            private String credentialBlob; 

            /**
             * CredentialBlob.
             */
            public Builder credentialBlob(String credentialBlob) {
                this.credentialBlob = credentialBlob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
