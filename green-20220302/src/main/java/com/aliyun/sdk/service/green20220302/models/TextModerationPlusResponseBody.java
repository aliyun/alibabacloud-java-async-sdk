// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
 *
 * <p>TextModerationPlusResponseBody</p>
 */
public class TextModerationPlusResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private TextModerationPlusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextModerationPlusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TextModerationPlusResponseBody build() {
            return new TextModerationPlusResponseBody(this);
        } 

    } 

    public static class Advice extends TeaModel {
        @NameInMap("Answer")
        private String answer;

        private Advice(Builder builder) {
            this.answer = builder.answer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Advice create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        public static final class Builder {
            private String answer; 

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            public Advice build() {
                return new Advice(this);
            } 

        } 

    }
    public static class CustomizedHit extends TeaModel {
        @NameInMap("KeyWords")
        private String keyWords;

        @NameInMap("LibName")
        private String libName;

        private CustomizedHit(Builder builder) {
            this.keyWords = builder.keyWords;
            this.libName = builder.libName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedHit create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public String getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return libName
         */
        public String getLibName() {
            return this.libName;
        }

        public static final class Builder {
            private String keyWords; 
            private String libName; 

            /**
             * KeyWords.
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * LibName.
             */
            public Builder libName(String libName) {
                this.libName = libName;
                return this;
            }

            public CustomizedHit build() {
                return new CustomizedHit(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Confidence")
        private Float confidence;

        @NameInMap("CustomizedHit")
        private java.util.List < CustomizedHit> customizedHit;

        @NameInMap("Label")
        private String label;

        @NameInMap("RiskWords")
        private String riskWords;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.customizedHit = builder.customizedHit;
            this.label = builder.label;
            this.riskWords = builder.riskWords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return customizedHit
         */
        public java.util.List < CustomizedHit> getCustomizedHit() {
            return this.customizedHit;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return riskWords
         */
        public String getRiskWords() {
            return this.riskWords;
        }

        public static final class Builder {
            private Float confidence; 
            private java.util.List < CustomizedHit> customizedHit; 
            private String label; 
            private String riskWords; 

            /**
             * Confidence.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * CustomizedHit.
             */
            public Builder customizedHit(java.util.List < CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
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
             * RiskWords.
             */
            public Builder riskWords(String riskWords) {
                this.riskWords = riskWords;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Advice")
        private java.util.List < Advice> advice;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("Score")
        private Float score;

        private Data(Builder builder) {
            this.advice = builder.advice;
            this.result = builder.result;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public java.util.List < Advice> getAdvice() {
            return this.advice;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return score
         */
        public Float getScore() {
            return this.score;
        }

        public static final class Builder {
            private java.util.List < Advice> advice; 
            private java.util.List < Result> result; 
            private Float score; 

            /**
             * Advice.
             */
            public Builder advice(java.util.List < Advice> advice) {
                this.advice = advice;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Float score) {
                this.score = score;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
