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
 * {@link CreateInterventionDictionaryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInterventionDictionaryResponseBody</p>
 */
public class CreateInterventionDictionaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(CreateInterventionDictionaryResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>80326EFE-485F-46E7-B291-5A1DD08D2198</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateInterventionDictionaryResponseBody build() {
            return new CreateInterventionDictionaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateInterventionDictionaryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateInterventionDictionaryResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analyzer")
        private String analyzer;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updated")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.analyzer = model.analyzer;
                this.created = model.created;
                this.name = model.name;
                this.type = model.type;
                this.updated = model.updated;
            } 

            /**
             * <p>The custom analyzer.</p>
             * 
             * <strong>example:</strong>
             * <p>dianshang</p>
             */
            public Builder analyzer(String analyzer) {
                this.analyzer = analyzer;
                return this;
            }

            /**
             * <p>The time when the test scenario was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1591086323</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The name of the test group.</p>
             * 
             * <strong>example:</strong>
             * <p>testb</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the intervention dictionary. Valid values:</p>
             * <ul>
             * <li>stopword: an intervention dictionary for stop word filtering</li>
             * <li>synonym: an intervention dictionary for synonym configuration</li>
             * <li>correction: an intervention dictionary for spelling correction</li>
             * <li>category_prediction: an intervention dictionary for category prediction</li>
             * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
             * <li>term_weighting: an intervention dictionary for term weight analysis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ner</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the intervention dictionary was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1591086323</p>
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
