// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AddContextsResponseBody} extends {@link TeaModel}
 *
 * <p>AddContextsResponseBody</p>
 */
public class AddContextsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Results> results;

    private AddContextsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddContextsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(AddContextsResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public AddContextsResponseBody build() {
            return new AddContextsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddContextsResponseBody} extends {@link TeaModel}
     *
     * <p>AddContextsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contextId")
        private String contextId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Results(Builder builder) {
            this.contextId = builder.contextId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return contextId
         */
        public String getContextId() {
            return this.contextId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String contextId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.contextId = model.contextId;
                this.status = model.status;
            } 

            /**
             * contextId.
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
