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
         * <p>The unique ID for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of objects containing the results of the write operation.</p>
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
             * <p>The ID of the written record or event.</p>
             * 
             * <strong>example:</strong>
             * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
             */
            public Builder contextId(String contextId) {
                this.contextId = contextId;
                return this;
            }

            /**
             * <p>The write status. Can be &quot;accepted&quot;, &quot;queued&quot;, or &quot;created&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>accepted</p>
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
