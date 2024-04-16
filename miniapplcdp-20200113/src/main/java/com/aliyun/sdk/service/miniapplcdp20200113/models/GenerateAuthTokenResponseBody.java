// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAuthTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAuthTokenResponseBody</p>
 */
public class GenerateAuthTokenResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GenerateAuthTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAuthTokenResponseBody create() {
        return builder().build();
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

        public GenerateAuthTokenResponseBody build() {
            return new GenerateAuthTokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("JwtToken")
        private String jwtToken;

        private Data(Builder builder) {
            this.jwtToken = builder.jwtToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jwtToken
         */
        public String getJwtToken() {
            return this.jwtToken;
        }

        public static final class Builder {
            private String jwtToken; 

            /**
             * JwtToken.
             */
            public Builder jwtToken(String jwtToken) {
                this.jwtToken = jwtToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
