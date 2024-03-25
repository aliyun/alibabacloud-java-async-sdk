// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomAuthIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomAuthIdentityResponseBody</p>
 */
public class QueryCustomAuthIdentityResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryCustomAuthIdentityResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthIdentityResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomAuthIdentityResponseBody build() {
            return new QueryCustomAuthIdentityResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("IdentityType")
        private String identityType;

        @NameInMap("Secret")
        private String secret;

        @NameInMap("SignMode")
        private String signMode;

        @NameInMap("Username")
        private String username;

        private Results(Builder builder) {
            this.clientId = builder.clientId;
            this.identityType = builder.identityType;
            this.secret = builder.secret;
            this.signMode = builder.signMode;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return identityType
         */
        public String getIdentityType() {
            return this.identityType;
        }

        /**
         * @return secret
         */
        public String getSecret() {
            return this.secret;
        }

        /**
         * @return signMode
         */
        public String getSignMode() {
            return this.signMode;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String clientId; 
            private String identityType; 
            private String secret; 
            private String signMode; 
            private String username; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * IdentityType.
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * Secret.
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * SignMode.
             */
            public Builder signMode(String signMode) {
                this.signMode = signMode;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("NextToken")
        private String nextToken;

        @NameInMap("Results")
        private java.util.List < Results> results;

        private Data(Builder builder) {
            this.nextToken = builder.nextToken;
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List < Results> results; 

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
