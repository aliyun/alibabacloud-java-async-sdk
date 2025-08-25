// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageaudit20191230.models;

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
 * {@link ScanTextResponseBody} extends {@link TeaModel}
 *
 * <p>ScanTextResponseBody</p>
 */
public class ScanTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ScanTextResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanTextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ScanTextResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ScanTextResponseBody build() {
            return new ScanTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ScanTextResponseBody} extends {@link TeaModel}
     *
     * <p>ScanTextResponseBody</p>
     */
    public static class Contexts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        private Contexts(Builder builder) {
            this.context = builder.context;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contexts create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        public static final class Builder {
            private String context; 

            private Builder() {
            } 

            private Builder(Contexts model) {
                this.context = model.context;
            } 

            /**
             * Context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            public Contexts build() {
                return new Contexts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanTextResponseBody} extends {@link TeaModel}
     *
     * <p>ScanTextResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contexts")
        private java.util.List<Contexts> contexts;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Details(Builder builder) {
            this.contexts = builder.contexts;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return contexts
         */
        public java.util.List<Contexts> getContexts() {
            return this.contexts;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private java.util.List<Contexts> contexts; 
            private String label; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.contexts = model.contexts;
                this.label = model.label;
            } 

            /**
             * Contexts.
             */
            public Builder contexts(java.util.List<Contexts> contexts) {
                this.contexts = contexts;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanTextResponseBody} extends {@link TeaModel}
     *
     * <p>ScanTextResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Float rate;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Results(Builder builder) {
            this.details = builder.details;
            this.label = builder.label;
            this.rate = builder.rate;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List<Details> getDetails() {
            return this.details;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List<Details> details; 
            private String label; 
            private Float rate; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.details = model.details;
                this.label = model.label;
                this.rate = model.rate;
                this.suggestion = model.suggestion;
            } 

            /**
             * Details.
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanTextResponseBody} extends {@link TeaModel}
     *
     * <p>ScanTextResponseBody</p>
     */
    public static class Elements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Elements(Builder builder) {
            this.results = builder.results;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Elements create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List<Results> results; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Elements model) {
                this.results = model.results;
                this.taskId = model.taskId;
            } 

            /**
             * Results.
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Elements build() {
                return new Elements(this);
            } 

        } 

    }
    /**
     * 
     * {@link ScanTextResponseBody} extends {@link TeaModel}
     *
     * <p>ScanTextResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Elements")
        private java.util.List<Elements> elements;

        private Data(Builder builder) {
            this.elements = builder.elements;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return elements
         */
        public java.util.List<Elements> getElements() {
            return this.elements;
        }

        public static final class Builder {
            private java.util.List<Elements> elements; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.elements = model.elements;
            } 

            /**
             * Elements.
             */
            public Builder elements(java.util.List<Elements> elements) {
                this.elements = elements;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
