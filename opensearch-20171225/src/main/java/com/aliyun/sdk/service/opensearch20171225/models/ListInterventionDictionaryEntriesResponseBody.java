// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryEntriesResponseBody</p>
 */
public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("totalCount")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about intervention entries.
         * <p>
         * 
         * For more information, see [InterventionDictionaryEntry](~~173606~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("tagLabel")
        private String tagLabel;

        @com.aliyun.core.annotation.NameInMap("token")
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
             * The sequence number.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The internal name of the identified entity type. Valid values:
             * <p>
             * 
             * *   brand
             * *   category
             * *   material
             * *   element
             * *   style
             * *   color
             * *   function
             * *   scenario
             * *   people
             * *   season
             * *   model
             * *   region
             * *   name
             * *   adjective
             * *   category-modifier
             * *   size
             * *   quality
             * *   suit
             * *   new-release
             * *   series
             * *   marketing
             * *   entertainment
             * *   organization
             * *   movie
             * *   game
             * *   number
             * *   unit
             * *   common
             * *   new-word
             * *   proper-noun
             * *   symbol
             * *   prefix
             * *   suffix
             * *   gift
             * *   negative
             * *   agent
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * The description of the internal name of the identified entity type.
             */
            public Builder tagLabel(String tagLabel) {
                this.tagLabel = tagLabel;
                return this;
            }

            /**
             * The entity.
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
        @com.aliyun.core.annotation.NameInMap("cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("relevance")
        private java.util.Map < String, ? > relevance;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tokens")
        private java.util.List < Tokens> tokens;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Long updated;

        @com.aliyun.core.annotation.NameInMap("word")
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
             * The command. Valid values:
             * <p>
             * 
             * *   add
             * *   delete
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * The timestamp when the intervention entry was created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * The content of an intervention entry for category prediction. The field value consists of key-value pairs. The key in a key-value pair indicates the ID of the category. The value in a key-value pair indicates the relevance to the category. A value of 0 indicates irrelevant. A value of 1 indicates slightly relevant. A value of 2 indicates relevant. Example: {"2":1, "100":0}
             */
            public Builder relevance(java.util.Map < String, ? > relevance) {
                this.relevance = relevance;
                return this;
            }

            /**
             * The status of the intervention entry. Valid value:
             * <p>
             * 
             * *   ACTIVE: The intervention entry takes effect.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The content of the intervention entry for term weight analysis.
             */
            public Builder tokens(java.util.List < Tokens> tokens) {
                this.tokens = tokens;
                return this;
            }

            /**
             * The timestamp when the intervention entry was last updated.
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The intervention entry.
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
