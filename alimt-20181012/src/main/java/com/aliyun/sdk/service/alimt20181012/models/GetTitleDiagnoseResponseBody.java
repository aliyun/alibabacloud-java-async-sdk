// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetTitleDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>GetTitleDiagnoseResponseBody</p>
 */
public class GetTitleDiagnoseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTitleDiagnoseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTitleDiagnoseResponseBody create() {
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

        private Builder(GetTitleDiagnoseResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTitleDiagnoseResponseBody build() {
            return new GetTitleDiagnoseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTitleDiagnoseResponseBody} extends {@link TeaModel}
     *
     * <p>GetTitleDiagnoseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllUppercaseWords")
        private String allUppercaseWords;

        @com.aliyun.core.annotation.NameInMap("ContainCoreClasses")
        private String containCoreClasses;

        @com.aliyun.core.annotation.NameInMap("DisableWords")
        private String disableWords;

        @com.aliyun.core.annotation.NameInMap("DuplicateWords")
        private String duplicateWords;

        @com.aliyun.core.annotation.NameInMap("LanguageQualityScore")
        private String languageQualityScore;

        @com.aliyun.core.annotation.NameInMap("NoFirstUppercaseList")
        private String noFirstUppercaseList;

        @com.aliyun.core.annotation.NameInMap("OverLengthLimit")
        private String overLengthLimit;

        @com.aliyun.core.annotation.NameInMap("TotalScore")
        private String totalScore;

        @com.aliyun.core.annotation.NameInMap("WordCount")
        private String wordCount;

        @com.aliyun.core.annotation.NameInMap("WordSpelledCorrectError")
        private String wordSpelledCorrectError;

        private Data(Builder builder) {
            this.allUppercaseWords = builder.allUppercaseWords;
            this.containCoreClasses = builder.containCoreClasses;
            this.disableWords = builder.disableWords;
            this.duplicateWords = builder.duplicateWords;
            this.languageQualityScore = builder.languageQualityScore;
            this.noFirstUppercaseList = builder.noFirstUppercaseList;
            this.overLengthLimit = builder.overLengthLimit;
            this.totalScore = builder.totalScore;
            this.wordCount = builder.wordCount;
            this.wordSpelledCorrectError = builder.wordSpelledCorrectError;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allUppercaseWords
         */
        public String getAllUppercaseWords() {
            return this.allUppercaseWords;
        }

        /**
         * @return containCoreClasses
         */
        public String getContainCoreClasses() {
            return this.containCoreClasses;
        }

        /**
         * @return disableWords
         */
        public String getDisableWords() {
            return this.disableWords;
        }

        /**
         * @return duplicateWords
         */
        public String getDuplicateWords() {
            return this.duplicateWords;
        }

        /**
         * @return languageQualityScore
         */
        public String getLanguageQualityScore() {
            return this.languageQualityScore;
        }

        /**
         * @return noFirstUppercaseList
         */
        public String getNoFirstUppercaseList() {
            return this.noFirstUppercaseList;
        }

        /**
         * @return overLengthLimit
         */
        public String getOverLengthLimit() {
            return this.overLengthLimit;
        }

        /**
         * @return totalScore
         */
        public String getTotalScore() {
            return this.totalScore;
        }

        /**
         * @return wordCount
         */
        public String getWordCount() {
            return this.wordCount;
        }

        /**
         * @return wordSpelledCorrectError
         */
        public String getWordSpelledCorrectError() {
            return this.wordSpelledCorrectError;
        }

        public static final class Builder {
            private String allUppercaseWords; 
            private String containCoreClasses; 
            private String disableWords; 
            private String duplicateWords; 
            private String languageQualityScore; 
            private String noFirstUppercaseList; 
            private String overLengthLimit; 
            private String totalScore; 
            private String wordCount; 
            private String wordSpelledCorrectError; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allUppercaseWords = model.allUppercaseWords;
                this.containCoreClasses = model.containCoreClasses;
                this.disableWords = model.disableWords;
                this.duplicateWords = model.duplicateWords;
                this.languageQualityScore = model.languageQualityScore;
                this.noFirstUppercaseList = model.noFirstUppercaseList;
                this.overLengthLimit = model.overLengthLimit;
                this.totalScore = model.totalScore;
                this.wordCount = model.wordCount;
                this.wordSpelledCorrectError = model.wordSpelledCorrectError;
            } 

            /**
             * AllUppercaseWords.
             */
            public Builder allUppercaseWords(String allUppercaseWords) {
                this.allUppercaseWords = allUppercaseWords;
                return this;
            }

            /**
             * ContainCoreClasses.
             */
            public Builder containCoreClasses(String containCoreClasses) {
                this.containCoreClasses = containCoreClasses;
                return this;
            }

            /**
             * DisableWords.
             */
            public Builder disableWords(String disableWords) {
                this.disableWords = disableWords;
                return this;
            }

            /**
             * DuplicateWords.
             */
            public Builder duplicateWords(String duplicateWords) {
                this.duplicateWords = duplicateWords;
                return this;
            }

            /**
             * LanguageQualityScore.
             */
            public Builder languageQualityScore(String languageQualityScore) {
                this.languageQualityScore = languageQualityScore;
                return this;
            }

            /**
             * NoFirstUppercaseList.
             */
            public Builder noFirstUppercaseList(String noFirstUppercaseList) {
                this.noFirstUppercaseList = noFirstUppercaseList;
                return this;
            }

            /**
             * OverLengthLimit.
             */
            public Builder overLengthLimit(String overLengthLimit) {
                this.overLengthLimit = overLengthLimit;
                return this;
            }

            /**
             * TotalScore.
             */
            public Builder totalScore(String totalScore) {
                this.totalScore = totalScore;
                return this;
            }

            /**
             * WordCount.
             */
            public Builder wordCount(String wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            /**
             * WordSpelledCorrectError.
             */
            public Builder wordSpelledCorrectError(String wordSpelledCorrectError) {
                this.wordSpelledCorrectError = wordSpelledCorrectError;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
