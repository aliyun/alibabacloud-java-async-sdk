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
 * {@link DescribeLLMSimilarQuestionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLLMSimilarQuestionsResponseBody</p>
 */
public class DescribeLLMSimilarQuestionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private DescribeLLMSimilarQuestionsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLLMSimilarQuestionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(DescribeLLMSimilarQuestionsResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
        } 

        /**
         * <p>The queried similar questions.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>96A55627-28E9-5E47-B8F6-D786BE551349</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4847</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public DescribeLLMSimilarQuestionsResponseBody build() {
            return new DescribeLLMSimilarQuestionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLLMSimilarQuestionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLLMSimilarQuestionsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Items(Builder builder) {
            this.answer = builder.answer;
            this.id = builder.id;
            this.score = builder.score;
            this.source = builder.source;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String answer; 
            private String id; 
            private Double score; 
            private String source; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.answer = model.answer;
                this.id = model.id;
                this.score = model.score;
                this.source = model.source;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * <p>The answer to the similar question.</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>The ID of the similar question.</p>
             * 
             * <strong>example:</strong>
             * <p>2389899</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The similarity of the similar question.</p>
             * 
             * <strong>example:</strong>
             * <p>0.58</p>
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The source of the similar question.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The summary of the similar question.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The content of the similar question.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The URL of the answer to the similar question.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com/product">www.aliyun.com/product</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
