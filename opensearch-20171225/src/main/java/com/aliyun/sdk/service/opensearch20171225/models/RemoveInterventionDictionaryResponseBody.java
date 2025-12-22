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
 * {@link RemoveInterventionDictionaryResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveInterventionDictionaryResponseBody</p>
 */
public class RemoveInterventionDictionaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private RemoveInterventionDictionaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInterventionDictionaryResponseBody create() {
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

        private Builder(RemoveInterventionDictionaryResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>06BBD41A-5F72-34E4-2DAF-E43B0526051D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the intervention dictionary.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public RemoveInterventionDictionaryResponseBody build() {
            return new RemoveInterventionDictionaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveInterventionDictionaryResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveInterventionDictionaryResponseBody</p>
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
             * <p>&quot;&quot;</p>
             */
            public Builder analyzer(String analyzer) {
                this.analyzer = analyzer;
                return this;
            }

            /**
             * <p>The time when the intervention dictionary was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1539158313</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Parameter</p>
             * 
             * <strong>example:</strong>
             * <p>tongyici</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Type</p>
             * <ul>
             * <li>stopword: an intervention dictionary for stop word filtering.</li>
             * <li>synonym: an intervention dictionary for synonym configuration.</li>
             * <li>correction: an intervention dictionary for spelling correction.</li>
             * <li>category_prediction: an intervention dictionary for category prediction.</li>
             * <li>ner: an intervention dictionary for named entity recognition.</li>
             * <li>term_weighting: an intervention dictionary for term weight analysis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>synonym</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the the intervention dictionary was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1539158313</p>
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
