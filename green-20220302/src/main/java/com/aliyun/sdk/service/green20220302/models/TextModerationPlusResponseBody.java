// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(TextModerationPlusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The moderation results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TextModerationPlusResponseBody build() {
            return new TextModerationPlusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationPlusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Advice model) {
                this.answer = model.answer;
                this.hitLabel = model.hitLabel;
                this.hitLibName = model.hitLibName;
            } 

            /**
             * <p>The answer.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>Hit Label</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder hitLabel(String hitLabel) {
                this.hitLabel = hitLabel;
                return this;
            }

            /**
             * <p>Hit Library Name</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
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
    /**
     * 
     * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationPlusResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CustomizedHit model) {
                this.keyWords = model.keyWords;
                this.libName = model.libName;
            } 

            /**
             * <p>The terms that are hit. Multiple terms are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder keyWords(String keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>The library name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationPlusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("CustomizedHit")
        private java.util.List<CustomizedHit> customizedHit;

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
        public java.util.List<CustomizedHit> getCustomizedHit() {
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
            private java.util.List<CustomizedHit> customizedHit; 
            private String description; 
            private String label; 
            private String riskWords; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.customizedHit = model.customizedHit;
                this.description = model.description;
                this.label = model.label;
                this.riskWords = model.riskWords;
            } 

            /**
             * <p>The score of the confidence level. Valid values: 0 to 100. The value is accurate to two decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>81.22</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The custom term hit by the moderated content.</p>
             */
            public Builder customizedHit(java.util.List<CustomizedHit> customizedHit) {
                this.customizedHit = customizedHit;
                return this;
            }

            /**
             * <p>The description of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label.</p>
             * 
             * <strong>example:</strong>
             * <p>porn</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The term hit by the moderated content.</p>
             * 
             * <strong>example:</strong>
             * <p>XXX</p>
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
    /**
     * 
     * {@link TextModerationPlusResponseBody} extends {@link TeaModel}
     *
     * <p>TextModerationPlusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private java.util.List<Advice> advice;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Float score;

        private Data(Builder builder) {
            this.advice = builder.advice;
            this.dataId = builder.dataId;
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
        public java.util.List<Advice> getAdvice() {
            return this.advice;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
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
            private java.util.List<Advice> advice; 
            private String dataId; 
            private java.util.List<Result> result; 
            private String riskLevel; 
            private Float score; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.advice = model.advice;
                this.dataId = model.dataId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
                this.score = model.score;
            } 

            /**
             * <p>The suggestion.</p>
             */
            public Builder advice(java.util.List<Advice> advice) {
                this.advice = advice;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>The results.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Risk Level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The score.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
