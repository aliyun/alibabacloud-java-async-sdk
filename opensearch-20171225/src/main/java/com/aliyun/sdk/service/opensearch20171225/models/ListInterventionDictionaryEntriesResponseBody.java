// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryEntriesResponseBody</p>
 */
public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListInterventionDictionaryEntriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInterventionDictionaryEntriesResponseBody build() {
            return new ListInterventionDictionaryEntriesResponseBody(this);
        } 

    } 

    public static class Tokens extends TeaModel {
        @NameInMap("order")
        private Integer order;

        @NameInMap("tag")
        private String tag;

        @NameInMap("tagLabel")
        private String tagLabel;

        @NameInMap("token")
        private String token;

        private Tokens(Builder builder) {
            this.order = builder.order;
            this.tag = builder.tag;
            this.tagLabel = builder.tagLabel;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tokens create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return tagLabel
         */
        public String getTagLabel() {
            return this.tagLabel;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Integer order; 
            private String tag; 
            private String tagLabel; 
            private String token; 

            /**
             * order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * tagLabel.
             */
            public Builder tagLabel(String tagLabel) {
                this.tagLabel = tagLabel;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Tokens build() {
                return new Tokens(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("cmd")
        private String cmd;

        @NameInMap("created")
        private Long created;

        @NameInMap("relevance")
        private java.util.Map < String, ? > relevance;

        @NameInMap("status")
        private String status;

        @NameInMap("tokens")
        private java.util.List < Tokens> tokens;

        @NameInMap("updated")
        private Long updated;

        @NameInMap("word")
        private String word;

        private Result(Builder builder) {
            this.cmd = builder.cmd;
            this.created = builder.created;
            this.relevance = builder.relevance;
            this.status = builder.status;
            this.tokens = builder.tokens;
            this.updated = builder.updated;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cmd
         */
        public String getCmd() {
            return this.cmd;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return relevance
         */
        public java.util.Map < String, ? > getRelevance() {
            return this.relevance;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tokens
         */
        public java.util.List < Tokens> getTokens() {
            return this.tokens;
        }

        /**
         * @return updated
         */
        public Long getUpdated() {
            return this.updated;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String cmd; 
            private Long created; 
            private java.util.Map < String, ? > relevance; 
            private String status; 
            private java.util.List < Tokens> tokens; 
            private Long updated; 
            private String word; 

            /**
             * cmd.
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * relevance.
             */
            public Builder relevance(java.util.Map < String, ? > relevance) {
                this.relevance = relevance;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * tokens.
             */
            public Builder tokens(java.util.List < Tokens> tokens) {
                this.tokens = tokens;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            /**
             * word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
