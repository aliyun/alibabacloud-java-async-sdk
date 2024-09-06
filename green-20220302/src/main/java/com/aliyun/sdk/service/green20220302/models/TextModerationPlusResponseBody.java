// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
 *
 * <p>TextModerationPlusResponseBody</p>
 */
public class TextModerationPlusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The returned HTTP status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The moderation results.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message that is returned in response to the request.
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
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("HitLabel")
        private String hitLabel;

        @com.aliyun.core.annotation.NameInMap("HitLibName")
        private String hitLibName;

        private Advice(Builder builder) {
            this.answer = builder.answer;
            this.hitLabel = builder.hitLabel;
            this.hitLibName = builder.hitLibName;
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

        /**
         * @return hitLabel
         */
        public String getHitLabel() {
            return this.hitLabel;
        }

        /**
         * @return hitLibName
         */
        public String getHitLibName() {
            return this.hitLibName;
        }

        public static final class Builder {
            private String answer; 
            private String hitLabel; 
            private String hitLibName; 

            /**
             * The answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * Hit Label
             */
            public Builder hitLabel(String hitLabel) {
                this.hitLabel = hitLabel;
                return this;
            }

            /**
             * Hit Library Name
             */
            public Builder hitLibName(String hitLibName) {
                this.hitLibName = hitLibName;
                return this;
            }

            public Advice build() {
                return new Advice(this);
            } 

        } 

    }
    public static class CustomizedHit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private String keyWords;

        @com.aliyun.core.annotation.NameInMap("LibName")
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
             * The terms that are hit. Multiple terms are separated by commas (,).
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * The library name.
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
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("CustomizedHit")
        private java.util.List < CustomizedHit> customizedHit;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("RiskWords")
        private String riskWords;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.customizedHit = builder.customizedHit;
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private String label; 
            private String riskWords; 

            /**
             * The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * The custom term hit by the moderated content.
             */
            public Builder customizedHit(java.util.List < CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
                return this;
            }

            /**
             * The description of the label.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The term hit by the moderated content.
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
        @com.aliyun.core.annotation.NameInMap("Advice")
        private java.util.List < Advice> advice;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Data(Builder builder) {
            this.advice = builder.advice;
            this.result = builder.result;
            this.riskLevel = builder.riskLevel;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
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
            private String riskLevel; 
            private Float score; 

            /**
             * The suggestion.
             */
            public Builder advice(java.util.List < Advice> advice) {
                this.advice = advice;
                return this;
            }

            /**
             * The results.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * Risk Level
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The score.
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
