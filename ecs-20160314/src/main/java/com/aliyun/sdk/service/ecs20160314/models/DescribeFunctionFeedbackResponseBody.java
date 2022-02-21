// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFunctionFeedbackResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFunctionFeedbackResponseBody</p>
 */
public class DescribeFunctionFeedbackResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFunctionFeedbackResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFunctionFeedbackResponseBody create() {
        return builder().build();
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

        public DescribeFunctionFeedbackResponseBody build() {
            return new DescribeFunctionFeedbackResponseBody(this);
        } 

    } 

    public static class Feedback extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Feedback")
        private String feedback;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Suggestion")
        private String suggestion;

        private Feedback(Builder builder) {
            this.category = builder.category;
            this.creationTime = builder.creationTime;
            this.feedback = builder.feedback;
            this.finishedTime = builder.finishedTime;
            this.functionName = builder.functionName;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Feedback create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String category; 
            private String creationTime; 
            private String feedback; 
            private String finishedTime; 
            private String functionName; 
            private String suggestion; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Feedback.
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Feedback build() {
                return new Feedback(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("feedback")
        private java.util.List < Feedback> feedback;

        private Data(Builder builder) {
            this.feedback = builder.feedback;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return feedback
         */
        public java.util.List < Feedback> getFeedback() {
            return this.feedback;
        }

        public static final class Builder {
            private java.util.List < Feedback> feedback; 

            /**
             * feedback.
             */
            public Builder feedback(java.util.List < Feedback> feedback) {
                this.feedback = feedback;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
