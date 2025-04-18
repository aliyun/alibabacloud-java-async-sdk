// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link SendDocumentAskQuestionResponseBody} extends {@link TeaModel}
 *
 * <p>SendDocumentAskQuestionResponseBody</p>
 */
public class SendDocumentAskQuestionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private SendDocumentAskQuestionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendDocumentAskQuestionResponseBody create() {
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

        private Builder(SendDocumentAskQuestionResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SendDocumentAskQuestionResponseBody build() {
            return new SendDocumentAskQuestionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendDocumentAskQuestionResponseBody} extends {@link TeaModel}
     *
     * <p>SendDocumentAskQuestionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("document")
        private java.util.List<String> document;

        private Data(Builder builder) {
            this.answer = builder.answer;
            this.document = builder.document;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return document
         */
        public java.util.List<String> getDocument() {
            return this.document;
        }

        public static final class Builder {
            private String answer; 
            private java.util.List<String> document; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.answer = model.answer;
                this.document = model.document;
            } 

            /**
             * <p>Q&amp;A result</p>
             * 
             * <strong>example:</strong>
             * <p>Carbon emissions in 2023 totaled 4.681 million tons</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>Documents associated with the answer returned by the query</p>
             */
            public Builder document(java.util.List<String> document) {
                this.document = document;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
