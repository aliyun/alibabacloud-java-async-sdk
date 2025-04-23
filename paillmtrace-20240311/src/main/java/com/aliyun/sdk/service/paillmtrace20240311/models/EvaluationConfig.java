// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link EvaluationConfig} extends {@link TeaModel}
 *
 * <p>EvaluationConfig</p>
 */
public class EvaluationConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Answer")
    private Answer answer;

    @com.aliyun.core.annotation.NameInMap("Context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("Query")
    private EvaluationConfigQuery query;

    private EvaluationConfig(Builder builder) {
        this.answer = builder.answer;
        this.context = builder.context;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluationConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answer
     */
    public Answer getAnswer() {
        return this.answer;
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return query
     */
    public EvaluationConfigQuery getQuery() {
        return this.query;
    }

    public static final class Builder {
        private Answer answer; 
        private Context context; 
        private EvaluationConfigQuery query; 

        private Builder() {
        } 

        private Builder(EvaluationConfig model) {
            this.answer = model.answer;
            this.context = model.context;
            this.query = model.query;
        } 

        /**
         * Answer.
         */
        public Builder answer(Answer answer) {
            this.answer = answer;
            return this;
        }

        /**
         * Context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(EvaluationConfigQuery query) {
            this.query = query;
            return this;
        }

        public EvaluationConfig build() {
            return new EvaluationConfig(this);
        } 

    } 

    /**
     * 
     * {@link EvaluationConfig} extends {@link TeaModel}
     *
     * <p>EvaluationConfig</p>
     */
    public static class Answer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JsonPathInSpan")
        private String jsonPathInSpan;

        @com.aliyun.core.annotation.NameInMap("JsonPathInSpanValue")
        private String jsonPathInSpanValue;

        @com.aliyun.core.annotation.NameInMap("SpanName")
        private String spanName;

        private Answer(Builder builder) {
            this.jsonPathInSpan = builder.jsonPathInSpan;
            this.jsonPathInSpanValue = builder.jsonPathInSpanValue;
            this.spanName = builder.spanName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Answer create() {
            return builder().build();
        }

        /**
         * @return jsonPathInSpan
         */
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        /**
         * @return jsonPathInSpanValue
         */
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        /**
         * @return spanName
         */
        public String getSpanName() {
            return this.spanName;
        }

        public static final class Builder {
            private String jsonPathInSpan; 
            private String jsonPathInSpanValue; 
            private String spanName; 

            private Builder() {
            } 

            private Builder(Answer model) {
                this.jsonPathInSpan = model.jsonPathInSpan;
                this.jsonPathInSpanValue = model.jsonPathInSpanValue;
                this.spanName = model.spanName;
            } 

            /**
             * JsonPathInSpan.
             */
            public Builder jsonPathInSpan(String jsonPathInSpan) {
                this.jsonPathInSpan = jsonPathInSpan;
                return this;
            }

            /**
             * JsonPathInSpanValue.
             */
            public Builder jsonPathInSpanValue(String jsonPathInSpanValue) {
                this.jsonPathInSpanValue = jsonPathInSpanValue;
                return this;
            }

            /**
             * SpanName.
             */
            public Builder spanName(String spanName) {
                this.spanName = spanName;
                return this;
            }

            public Answer build() {
                return new Answer(this);
            } 

        } 

    }
    /**
     * 
     * {@link EvaluationConfig} extends {@link TeaModel}
     *
     * <p>EvaluationConfig</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JsonPathInSpan")
        private String jsonPathInSpan;

        @com.aliyun.core.annotation.NameInMap("JsonPathInSpanValue")
        private String jsonPathInSpanValue;

        @com.aliyun.core.annotation.NameInMap("SpanName")
        private String spanName;

        private Context(Builder builder) {
            this.jsonPathInSpan = builder.jsonPathInSpan;
            this.jsonPathInSpanValue = builder.jsonPathInSpanValue;
            this.spanName = builder.spanName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return jsonPathInSpan
         */
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        /**
         * @return jsonPathInSpanValue
         */
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        /**
         * @return spanName
         */
        public String getSpanName() {
            return this.spanName;
        }

        public static final class Builder {
            private String jsonPathInSpan; 
            private String jsonPathInSpanValue; 
            private String spanName; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.jsonPathInSpan = model.jsonPathInSpan;
                this.jsonPathInSpanValue = model.jsonPathInSpanValue;
                this.spanName = model.spanName;
            } 

            /**
             * JsonPathInSpan.
             */
            public Builder jsonPathInSpan(String jsonPathInSpan) {
                this.jsonPathInSpan = jsonPathInSpan;
                return this;
            }

            /**
             * JsonPathInSpanValue.
             */
            public Builder jsonPathInSpanValue(String jsonPathInSpanValue) {
                this.jsonPathInSpanValue = jsonPathInSpanValue;
                return this;
            }

            /**
             * SpanName.
             */
            public Builder spanName(String spanName) {
                this.spanName = spanName;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link EvaluationConfig} extends {@link TeaModel}
     *
     * <p>EvaluationConfig</p>
     */
    public static class EvaluationConfigQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JsonPathInSpan")
        private String jsonPathInSpan;

        @com.aliyun.core.annotation.NameInMap("JsonPathInSpanValue")
        private String jsonPathInSpanValue;

        @com.aliyun.core.annotation.NameInMap("SpanName")
        private String spanName;

        private EvaluationConfigQuery(Builder builder) {
            this.jsonPathInSpan = builder.jsonPathInSpan;
            this.jsonPathInSpanValue = builder.jsonPathInSpanValue;
            this.spanName = builder.spanName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationConfigQuery create() {
            return builder().build();
        }

        /**
         * @return jsonPathInSpan
         */
        public String getJsonPathInSpan() {
            return this.jsonPathInSpan;
        }

        /**
         * @return jsonPathInSpanValue
         */
        public String getJsonPathInSpanValue() {
            return this.jsonPathInSpanValue;
        }

        /**
         * @return spanName
         */
        public String getSpanName() {
            return this.spanName;
        }

        public static final class Builder {
            private String jsonPathInSpan; 
            private String jsonPathInSpanValue; 
            private String spanName; 

            private Builder() {
            } 

            private Builder(EvaluationConfigQuery model) {
                this.jsonPathInSpan = model.jsonPathInSpan;
                this.jsonPathInSpanValue = model.jsonPathInSpanValue;
                this.spanName = model.spanName;
            } 

            /**
             * JsonPathInSpan.
             */
            public Builder jsonPathInSpan(String jsonPathInSpan) {
                this.jsonPathInSpan = jsonPathInSpan;
                return this;
            }

            /**
             * JsonPathInSpanValue.
             */
            public Builder jsonPathInSpanValue(String jsonPathInSpanValue) {
                this.jsonPathInSpanValue = jsonPathInSpanValue;
                return this;
            }

            /**
             * SpanName.
             */
            public Builder spanName(String spanName) {
                this.spanName = spanName;
                return this;
            }

            public EvaluationConfigQuery build() {
                return new EvaluationConfigQuery(this);
            } 

        } 

    }
}
