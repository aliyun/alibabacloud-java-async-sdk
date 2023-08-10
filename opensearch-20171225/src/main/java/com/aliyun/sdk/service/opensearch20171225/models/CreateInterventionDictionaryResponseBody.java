// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterventionDictionaryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInterventionDictionaryResponseBody</p>
 */
public class CreateInterventionDictionaryResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private CreateInterventionDictionaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInterventionDictionaryResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The type of the intervention dictionary. Valid values:
         * <p>
         * 
         * *   stopword: an intervention dictionary for stop word filtering
         * *   synonym: an intervention dictionary for synonym configuration
         * *   correction: an intervention dictionary for spelling correction
         * *   category_prediction: an intervention dictionary for category prediction
         * *   ner: an intervention dictionary for named entity recognition (NER)
         * *   term_weighting: an intervention dictionary for term weight analysis
         * *   suggest_allowlist: a drop-down suggestion whitelist
         * *   suggest_denylist: a drop-down suggestion blacklist
         * *   hot_allowlist: a top search whitelist
         * *   hot_denylist: a top search blacklist
         * *   hint_allowlist: a shading whitelist
         * *   hint_denylist: a shading blacklist
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateInterventionDictionaryResponseBody build() {
            return new CreateInterventionDictionaryResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("analyzer")
        private String analyzer;

        @NameInMap("created")
        private String created;

        @NameInMap("name")
        private String name;

        @NameInMap("type")
        private String type;

        @NameInMap("updated")
        private String updated;

        private Result(Builder builder) {
            this.analyzer = builder.analyzer;
            this.created = builder.created;
            this.name = builder.name;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return analyzer
         */
        public String getAnalyzer() {
            return this.analyzer;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String analyzer; 
            private String created; 
            private String name; 
            private String type; 
            private String updated; 

            /**
             * Creates an intervention dictionary.
             */
            public Builder analyzer(String analyzer) {
                this.analyzer = analyzer;
                return this;
            }

            /**
             * The name of the intervention dictionary.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * CreateInterventionDictionary
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
