// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link DomainKnowledgeRetrieveResponseBody} extends {@link TeaModel}
 *
 * <p>DomainKnowledgeRetrieveResponseBody</p>
 */
public class DomainKnowledgeRetrieveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DomainKnowledgeRetrieveResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DomainKnowledgeRetrieveResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DomainKnowledgeRetrieveResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of retrieve result.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>019FABCB-6C7D-18FE-AA42-922BFC9555D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DomainKnowledgeRetrieveResponseBody build() {
            return new DomainKnowledgeRetrieveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DomainKnowledgeRetrieveResponseBody} extends {@link TeaModel}
     *
     * <p>DomainKnowledgeRetrieveResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Data(Builder builder) {
            this.score = builder.score;
            this.source = builder.source;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Double score; 
            private String source; 
            private String text; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.score = model.score;
                this.source = model.source;
                this.text = model.text;
            } 

            /**
             * <p>The score of the retrieved text; the higher the score, the more relevant the result.</p>
             * 
             * <strong>example:</strong>
             * <p>0.6</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>Source of retrieve results.</p>
             * 
             * <strong>example:</strong>
             * <p>Domestic Business Knowledge Base</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Retrieved text.</p>
             * 
             * <strong>example:</strong>
             * <p>On Alibaba Cloud&quot;s domestic website, domain name renewal can be done through the following methods.</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
