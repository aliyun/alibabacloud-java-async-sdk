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
 * {@link QueryCustomAuthConnectBlackResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomAuthConnectBlackResponseBody</p>
 */
public class QueryCustomAuthConnectBlackResponseBody extends TeaModel {
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

    private QueryCustomAuthConnectBlackResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthConnectBlackResponseBody create() {
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
         * <p>The HTTP status code. The status code 200 indicates that the request is successful. Other status codes indicate that the request failed. For a list of error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>020F6A43-19E6-4B6E-B846-44EB31DF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCustomAuthConnectBlackResponseBody build() {
            return new QueryCustomAuthConnectBlackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCustomAuthConnectBlackResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomAuthConnectBlackResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("PermitAction")
        private String permitAction;

        private Results(Builder builder) {
            this.clientId = builder.clientId;
            this.effect = builder.effect;
            this.permitAction = builder.permitAction;
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
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return permitAction
         */
        public String getPermitAction() {
            return this.permitAction;
        }

        public static final class Builder {
            private String clientId; 
            private String effect; 
            private String permitAction; 

            /**
             * <p>The client ID.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_TEST@@@test</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>Indicates whether to allow or deny access.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW</p>
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * <p>The authorized permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>CONNECT</p>
             */
            public Builder permitAction(String permitAction) {
                this.permitAction = permitAction;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCustomAuthConnectBlackResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCustomAuthConnectBlackResponseBody</p>
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

            /**
             * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
             * 
             * <strong>example:</strong>
             * <p>AAAAAZ0cM0HTqLXvgm7oMHWXcvc=</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The returned results.</p>
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
