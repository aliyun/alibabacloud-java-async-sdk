// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetKnowledgeRecallResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeRecallResponseBody</p>
 */
public class GetKnowledgeRecallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetKnowledgeRecallResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeRecallResponseBody create() {
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

        private Builder(GetKnowledgeRecallResponseBody model) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKnowledgeRecallResponseBody build() {
            return new GetKnowledgeRecallResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeRecallResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeRecallResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<java.util.Map<String, ?>> results;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private Data(Builder builder) {
            this.count = builder.count;
            this.message = builder.message;
            this.results = builder.results;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return results
         */
        public java.util.List<java.util.Map<String, ?>> getResults() {
            return this.results;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private Integer count; 
            private String message; 
            private java.util.List<java.util.Map<String, ?>> results; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.count = model.count;
                this.message = model.message;
                this.results = model.results;
                this.traceId = model.traceId;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * Results.
             */
            public Builder results(java.util.List<java.util.Map<String, ?>> results) {
                this.results = results;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
