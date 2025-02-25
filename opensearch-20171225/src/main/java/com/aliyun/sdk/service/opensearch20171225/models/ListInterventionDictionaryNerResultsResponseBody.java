// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryNerResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterventionDictionaryNerResultsResponseBody</p>
 */
public class ListInterventionDictionaryNerResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

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

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The NER result.
         * <p>
         * 
         * For more information, see [InterventionDictionaryEntry](~~173606~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListInterventionDictionaryNerResultsResponseBody build() {
            return new ListInterventionDictionaryNerResultsResponseBody(this);
        } 

    } 

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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
