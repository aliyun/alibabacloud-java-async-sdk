// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListInterventionDictionaryEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryEntriesResponseBody</p>
 */
public class ListInterventionDictionaryEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

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
     * @return result
     */
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInterventionDictionaryEntriesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>516A02B7-2167-8D92-12D0-B639A2A0F3C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about intervention entries.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173606.html">InterventionDictionaryEntry</a>.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInterventionDictionaryEntriesResponseBody build() {
            return new ListInterventionDictionaryEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterventionDictionaryEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterventionDictionaryEntriesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tokens model) {
                this.order = model.order;
                this.tag = model.tag;
                this.tagLabel = model.tagLabel;
                this.token = model.token;
            } 

            /**
             * <p>The sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * <p>The internal name of the identified entity type. Valid values:</p>
             * <ul>
             * <li>brand</li>
             * <li>category</li>
             * <li>material</li>
             * <li>element</li>
             * <li>style</li>
             * <li>color</li>
             * <li>function</li>
             * <li>scenario</li>
             * <li>people</li>
             * <li>season</li>
             * <li>model</li>
             * <li>region</li>
             * <li>name</li>
             * <li>adjective</li>
             * <li>category-modifier</li>
             * <li>size</li>
             * <li>quality</li>
             * <li>suit</li>
             * <li>new-release</li>
             * <li>series</li>
             * <li>marketing</li>
             * <li>entertainment</li>
             * <li>organization</li>
             * <li>movie</li>
             * <li>game</li>
             * <li>number</li>
             * <li>unit</li>
             * <li>common</li>
             * <li>new-word</li>
             * <li>proper-noun</li>
             * <li>symbol</li>
             * <li>prefix</li>
             * <li>suffix</li>
             * <li>gift</li>
             * <li>negative</li>
             * <li>agent</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>category</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The description of the internal name of the identified entity type.</p>
             * 
             * <strong>example:</strong>
             * <p>category</p>
             */
            public Builder tagLabel(String tagLabel) {
                this.tagLabel = tagLabel;
                return this;
            }

            /**
             * <p>The entity.</p>
             * 
             * <strong>example:</strong>
             * <p>category</p>
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
    /**
     * 
     * {@link ListInterventionDictionaryEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterventionDictionaryEntriesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cmd")
        private String cmd;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("relevance")
        private java.util.Map<String, ?> relevance;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("tokens")
        private java.util.List<Tokens> tokens;

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
        public java.util.Map<String, ?> getRelevance() {
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
        public java.util.List<Tokens> getTokens() {
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
            private java.util.Map<String, ?> relevance; 
            private String status; 
            private java.util.List<Tokens> tokens; 
            private Long updated; 
            private String word; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cmd = model.cmd;
                this.created = model.created;
                this.relevance = model.relevance;
                this.status = model.status;
                this.tokens = model.tokens;
                this.updated = model.updated;
                this.word = model.word;
            } 

            /**
             * <p>The command. Valid values:</p>
             * <ul>
             * <li>add</li>
             * <li>delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder cmd(String cmd) {
                this.cmd = cmd;
                return this;
            }

            /**
             * <p>The timestamp when the intervention entry was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1536690285</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The content of an intervention entry for category prediction. The field value consists of key-value pairs. The key in a key-value pair indicates the ID of the category. The value in a key-value pair indicates the relevance to the category. A value of 0 indicates irrelevant. A value of 1 indicates slightly relevant. A value of 2 indicates relevant. Example: {&quot;2&quot;:1, &quot;100&quot;:0}</p>
             * 
             * <strong>example:</strong>
             * <p>{                 &quot;100&quot;: &quot;0&quot;,                 &quot;200&quot;: &quot;2&quot;             }</p>
             */
            public Builder relevance(java.util.Map<String, ?> relevance) {
                this.relevance = relevance;
                return this;
            }

            /**
             * <p>The status of the intervention entry. Valid value:</p>
             * <ul>
             * <li>ACTIVE: The intervention entry takes effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The content of the intervention entry for term weight analysis.</p>
             */
            public Builder tokens(java.util.List<Tokens> tokens) {
                this.tokens = tokens;
                return this;
            }

            /**
             * <p>The timestamp when the intervention entry was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1537348987</p>
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>The intervention entry.</p>
             * 
             * <strong>example:</strong>
             * <p>\u8fc7\u513f</p>
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
