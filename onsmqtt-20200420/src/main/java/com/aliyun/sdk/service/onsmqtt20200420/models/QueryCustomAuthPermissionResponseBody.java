// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomAuthPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCustomAuthPermissionResponseBody</p>
 */
public class QueryCustomAuthPermissionResponseBody extends TeaModel {
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

    private QueryCustomAuthPermissionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthPermissionResponseBody create() {
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

        public QueryCustomAuthPermissionResponseBody build() {
            return new QueryCustomAuthPermissionResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Effect")
        private String effect;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("IdentityType")
        private String identityType;

        @NameInMap("PermitAction")
        private String permitAction;

        @NameInMap("Topic")
        private String topic;

        private Results(Builder builder) {
            this.effect = builder.effect;
            this.identity = builder.identity;
            this.identityType = builder.identityType;
            this.permitAction = builder.permitAction;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return identityType
         */
        public String getIdentityType() {
            return this.identityType;
        }

        /**
         * @return permitAction
         */
        public String getPermitAction() {
            return this.permitAction;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String effect; 
            private String identity; 
            private String identityType; 
            private String permitAction; 
            private String topic; 

            /**
             * Effect.
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
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
             * PermitAction.
             */
            public Builder permitAction(String permitAction) {
                this.permitAction = permitAction;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
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
