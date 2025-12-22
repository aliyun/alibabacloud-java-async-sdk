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
 * {@link ListInterventionDictionaryNerResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryNerResultsResponseBody</p>
 */
public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private ListInterventionDictionaryNerResultsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryNerResultsResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListInterventionDictionaryNerResultsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8F780CA8-D4D4-2FFE-B8AC-42040822C554</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The NER result.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173606.html">InterventionDictionaryEntry</a>.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListInterventionDictionaryNerResultsResponseBody build() {
            return new ListInterventionDictionaryNerResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterventionDictionaryNerResultsResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterventionDictionaryNerResultsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("tagLabel")
        private String tagLabel;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        private Result(Builder builder) {
            this.order = builder.order;
            this.tag = builder.tag;
            this.tagLabel = builder.tagLabel;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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

            private Builder(Result model) {
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
             * <p>eaa73f35-007a-4be7-88c7-37dca4a04ab7</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
