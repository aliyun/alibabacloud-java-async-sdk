// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryCustomAuthIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomAuthIdentityResponseBody</p>
 */
public class QueryCustomAuthIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryCustomAuthIdentityResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. 200: The request is successful. Other codes indicate errors. For more information about error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11568B5B-13A8-4E72-9DBA-3A14F7D3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. true: The request is successful. false: The request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomAuthIdentityResponseBody build() {
            return new QueryCustomAuthIdentityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCustomAuthIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomAuthIdentityResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("IdentityType")
        private String identityType;

        @com.aliyun.core.annotation.NameInMap("Secret")
        private String secret;

        @com.aliyun.core.annotation.NameInMap("SignMode")
        private String signMode;

        @com.aliyun.core.annotation.NameInMap("Username")
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

            private Builder() {
            } 

            private Builder(Results model) {
                this.clientId = model.clientId;
                this.identityType = model.identityType;
                this.secret = model.secret;
                this.signMode = model.signMode;
                this.username = model.username;
            } 

            /**
             * <p>The client ID of the device when the identity type is CLIENT.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_ICP@@@4d378084</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The identity type.</p>
             * <ul>
             * <li><p>USER: Username only.</p>
             * </li>
             * <li><p>CLIENT: Specific to a client.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * <p>The secret key.</p>
             * 
             * <strong>example:</strong>
             * <p>62a5916d71767185b48907d85c2efa****</p>
             */
            public Builder secret(String secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The signature verification mode. ORIGIN: Original value comparison, which compares the password with the secret. SIGNED: The HmacSHA1 signature is calculated for the clientId using the secret for verification, and then the password is compared.</p>
             * 
             * <strong>example:</strong>
             * <p>SIGNED</p>
             */
            public Builder signMode(String signMode) {
                this.signMode = signMode;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link QueryCustomAuthIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomAuthIdentityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

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
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private String nextToken; 
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextToken = model.nextToken;
                this.results = model.results;
            } 

            /**
             * <p>If more results are available, a NextToken is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAXA+GzVqTutYpgkFjBrchKzuvSbpuTqtt6OF9tsC9QnJ</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The returned data.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
