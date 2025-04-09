// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetAnnotationMissionSummaryResponseBody</p>
 */
public class GetAnnotationMissionSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAnnotationMissionSummaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationMissionSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAnnotationMissionSummaryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAnnotationMissionSummaryResponseBody build() {
            return new GetAnnotationMissionSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionSummaryResponseBody</p>
     */
    public static class AsrSummaryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddCustomizationDataCount")
        private Integer addCustomizationDataCount;

        @com.aliyun.core.annotation.NameInMap("AddVocabularyDataCount")
        private Integer addVocabularyDataCount;

        @com.aliyun.core.annotation.NameInMap("AnnotationInvalid")
        private Integer annotationInvalid;

        @com.aliyun.core.annotation.NameInMap("CharacterCorrectRate")
        private Integer characterCorrectRate;

        @com.aliyun.core.annotation.NameInMap("CharacterErrorRate")
        private Integer characterErrorRate;

        @com.aliyun.core.annotation.NameInMap("ChatTotalCount")
        private Integer chatTotalCount;

        @com.aliyun.core.annotation.NameInMap("NoAnnotation")
        private Integer noAnnotation;

        @com.aliyun.core.annotation.NameInMap("SentenceErrorRate")
        private Integer sentenceErrorRate;

        @com.aliyun.core.annotation.NameInMap("WordErrorRate")
        private Integer wordErrorRate;

        private AsrSummaryInfo(Builder builder) {
            this.addCustomizationDataCount = builder.addCustomizationDataCount;
            this.addVocabularyDataCount = builder.addVocabularyDataCount;
            this.annotationInvalid = builder.annotationInvalid;
            this.characterCorrectRate = builder.characterCorrectRate;
            this.characterErrorRate = builder.characterErrorRate;
            this.chatTotalCount = builder.chatTotalCount;
            this.noAnnotation = builder.noAnnotation;
            this.sentenceErrorRate = builder.sentenceErrorRate;
            this.wordErrorRate = builder.wordErrorRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrSummaryInfo create() {
            return builder().build();
        }

        /**
         * @return addCustomizationDataCount
         */
        public Integer getAddCustomizationDataCount() {
            return this.addCustomizationDataCount;
        }

        /**
         * @return addVocabularyDataCount
         */
        public Integer getAddVocabularyDataCount() {
            return this.addVocabularyDataCount;
        }

        /**
         * @return annotationInvalid
         */
        public Integer getAnnotationInvalid() {
            return this.annotationInvalid;
        }

        /**
         * @return characterCorrectRate
         */
        public Integer getCharacterCorrectRate() {
            return this.characterCorrectRate;
        }

        /**
         * @return characterErrorRate
         */
        public Integer getCharacterErrorRate() {
            return this.characterErrorRate;
        }

        /**
         * @return chatTotalCount
         */
        public Integer getChatTotalCount() {
            return this.chatTotalCount;
        }

        /**
         * @return noAnnotation
         */
        public Integer getNoAnnotation() {
            return this.noAnnotation;
        }

        /**
         * @return sentenceErrorRate
         */
        public Integer getSentenceErrorRate() {
            return this.sentenceErrorRate;
        }

        /**
         * @return wordErrorRate
         */
        public Integer getWordErrorRate() {
            return this.wordErrorRate;
        }

        public static final class Builder {
            private Integer addCustomizationDataCount; 
            private Integer addVocabularyDataCount; 
            private Integer annotationInvalid; 
            private Integer characterCorrectRate; 
            private Integer characterErrorRate; 
            private Integer chatTotalCount; 
            private Integer noAnnotation; 
            private Integer sentenceErrorRate; 
            private Integer wordErrorRate; 

            private Builder() {
            } 

            private Builder(AsrSummaryInfo model) {
                this.addCustomizationDataCount = model.addCustomizationDataCount;
                this.addVocabularyDataCount = model.addVocabularyDataCount;
                this.annotationInvalid = model.annotationInvalid;
                this.characterCorrectRate = model.characterCorrectRate;
                this.characterErrorRate = model.characterErrorRate;
                this.chatTotalCount = model.chatTotalCount;
                this.noAnnotation = model.noAnnotation;
                this.sentenceErrorRate = model.sentenceErrorRate;
                this.wordErrorRate = model.wordErrorRate;
            } 

            /**
             * AddCustomizationDataCount.
             */
            public Builder addCustomizationDataCount(Integer addCustomizationDataCount) {
                this.addCustomizationDataCount = addCustomizationDataCount;
                return this;
            }

            /**
             * AddVocabularyDataCount.
             */
            public Builder addVocabularyDataCount(Integer addVocabularyDataCount) {
                this.addVocabularyDataCount = addVocabularyDataCount;
                return this;
            }

            /**
             * AnnotationInvalid.
             */
            public Builder annotationInvalid(Integer annotationInvalid) {
                this.annotationInvalid = annotationInvalid;
                return this;
            }

            /**
             * CharacterCorrectRate.
             */
            public Builder characterCorrectRate(Integer characterCorrectRate) {
                this.characterCorrectRate = characterCorrectRate;
                return this;
            }

            /**
             * CharacterErrorRate.
             */
            public Builder characterErrorRate(Integer characterErrorRate) {
                this.characterErrorRate = characterErrorRate;
                return this;
            }

            /**
             * ChatTotalCount.
             */
            public Builder chatTotalCount(Integer chatTotalCount) {
                this.chatTotalCount = chatTotalCount;
                return this;
            }

            /**
             * NoAnnotation.
             */
            public Builder noAnnotation(Integer noAnnotation) {
                this.noAnnotation = noAnnotation;
                return this;
            }

            /**
             * SentenceErrorRate.
             */
            public Builder sentenceErrorRate(Integer sentenceErrorRate) {
                this.sentenceErrorRate = sentenceErrorRate;
                return this;
            }

            /**
             * WordErrorRate.
             */
            public Builder wordErrorRate(Integer wordErrorRate) {
                this.wordErrorRate = wordErrorRate;
                return this;
            }

            public AsrSummaryInfo build() {
                return new AsrSummaryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionSummaryResponseBody</p>
     */
    public static class IntentSummaryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationCorrectCount")
        private Integer annotationCorrectCount;

        @com.aliyun.core.annotation.NameInMap("AnnotationInvalid")
        private Integer annotationInvalid;

        @com.aliyun.core.annotation.NameInMap("ChatTotalCount")
        private Integer chatTotalCount;

        @com.aliyun.core.annotation.NameInMap("IntentUserSayCount")
        private Integer intentUserSayCount;

        @com.aliyun.core.annotation.NameInMap("IntentionNotCoveredCount")
        private Integer intentionNotCoveredCount;

        @com.aliyun.core.annotation.NameInMap("MatchErrorCount")
        private Integer matchErrorCount;

        @com.aliyun.core.annotation.NameInMap("NoAnnotation")
        private Integer noAnnotation;

        @com.aliyun.core.annotation.NameInMap("TranslationUnrecognizedCount")
        private Integer translationUnrecognizedCount;

        private IntentSummaryInfo(Builder builder) {
            this.annotationCorrectCount = builder.annotationCorrectCount;
            this.annotationInvalid = builder.annotationInvalid;
            this.chatTotalCount = builder.chatTotalCount;
            this.intentUserSayCount = builder.intentUserSayCount;
            this.intentionNotCoveredCount = builder.intentionNotCoveredCount;
            this.matchErrorCount = builder.matchErrorCount;
            this.noAnnotation = builder.noAnnotation;
            this.translationUnrecognizedCount = builder.translationUnrecognizedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentSummaryInfo create() {
            return builder().build();
        }

        /**
         * @return annotationCorrectCount
         */
        public Integer getAnnotationCorrectCount() {
            return this.annotationCorrectCount;
        }

        /**
         * @return annotationInvalid
         */
        public Integer getAnnotationInvalid() {
            return this.annotationInvalid;
        }

        /**
         * @return chatTotalCount
         */
        public Integer getChatTotalCount() {
            return this.chatTotalCount;
        }

        /**
         * @return intentUserSayCount
         */
        public Integer getIntentUserSayCount() {
            return this.intentUserSayCount;
        }

        /**
         * @return intentionNotCoveredCount
         */
        public Integer getIntentionNotCoveredCount() {
            return this.intentionNotCoveredCount;
        }

        /**
         * @return matchErrorCount
         */
        public Integer getMatchErrorCount() {
            return this.matchErrorCount;
        }

        /**
         * @return noAnnotation
         */
        public Integer getNoAnnotation() {
            return this.noAnnotation;
        }

        /**
         * @return translationUnrecognizedCount
         */
        public Integer getTranslationUnrecognizedCount() {
            return this.translationUnrecognizedCount;
        }

        public static final class Builder {
            private Integer annotationCorrectCount; 
            private Integer annotationInvalid; 
            private Integer chatTotalCount; 
            private Integer intentUserSayCount; 
            private Integer intentionNotCoveredCount; 
            private Integer matchErrorCount; 
            private Integer noAnnotation; 
            private Integer translationUnrecognizedCount; 

            private Builder() {
            } 

            private Builder(IntentSummaryInfo model) {
                this.annotationCorrectCount = model.annotationCorrectCount;
                this.annotationInvalid = model.annotationInvalid;
                this.chatTotalCount = model.chatTotalCount;
                this.intentUserSayCount = model.intentUserSayCount;
                this.intentionNotCoveredCount = model.intentionNotCoveredCount;
                this.matchErrorCount = model.matchErrorCount;
                this.noAnnotation = model.noAnnotation;
                this.translationUnrecognizedCount = model.translationUnrecognizedCount;
            } 

            /**
             * AnnotationCorrectCount.
             */
            public Builder annotationCorrectCount(Integer annotationCorrectCount) {
                this.annotationCorrectCount = annotationCorrectCount;
                return this;
            }

            /**
             * AnnotationInvalid.
             */
            public Builder annotationInvalid(Integer annotationInvalid) {
                this.annotationInvalid = annotationInvalid;
                return this;
            }

            /**
             * ChatTotalCount.
             */
            public Builder chatTotalCount(Integer chatTotalCount) {
                this.chatTotalCount = chatTotalCount;
                return this;
            }

            /**
             * IntentUserSayCount.
             */
            public Builder intentUserSayCount(Integer intentUserSayCount) {
                this.intentUserSayCount = intentUserSayCount;
                return this;
            }

            /**
             * IntentionNotCoveredCount.
             */
            public Builder intentionNotCoveredCount(Integer intentionNotCoveredCount) {
                this.intentionNotCoveredCount = intentionNotCoveredCount;
                return this;
            }

            /**
             * MatchErrorCount.
             */
            public Builder matchErrorCount(Integer matchErrorCount) {
                this.matchErrorCount = matchErrorCount;
                return this;
            }

            /**
             * NoAnnotation.
             */
            public Builder noAnnotation(Integer noAnnotation) {
                this.noAnnotation = noAnnotation;
                return this;
            }

            /**
             * TranslationUnrecognizedCount.
             */
            public Builder translationUnrecognizedCount(Integer translationUnrecognizedCount) {
                this.translationUnrecognizedCount = translationUnrecognizedCount;
                return this;
            }

            public IntentSummaryInfo build() {
                return new IntentSummaryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionSummaryResponseBody</p>
     */
    public static class TagSummaryInfoDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TagSummaryInfoDetailList(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagSummaryInfoDetailList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer count; 
            private String name; 

            private Builder() {
            } 

            private Builder(TagSummaryInfoDetailList model) {
                this.count = model.count;
                this.name = model.name;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TagSummaryInfoDetailList build() {
                return new TagSummaryInfoDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionSummaryResponseBody</p>
     */
    public static class TagSummaryInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagSummaryInfoDetailList")
        private java.util.List<TagSummaryInfoDetailList> tagSummaryInfoDetailList;

        private TagSummaryInfo(Builder builder) {
            this.tagSummaryInfoDetailList = builder.tagSummaryInfoDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagSummaryInfo create() {
            return builder().build();
        }

        /**
         * @return tagSummaryInfoDetailList
         */
        public java.util.List<TagSummaryInfoDetailList> getTagSummaryInfoDetailList() {
            return this.tagSummaryInfoDetailList;
        }

        public static final class Builder {
            private java.util.List<TagSummaryInfoDetailList> tagSummaryInfoDetailList; 

            private Builder() {
            } 

            private Builder(TagSummaryInfo model) {
                this.tagSummaryInfoDetailList = model.tagSummaryInfoDetailList;
            } 

            /**
             * TagSummaryInfoDetailList.
             */
            public Builder tagSummaryInfoDetailList(java.util.List<TagSummaryInfoDetailList> tagSummaryInfoDetailList) {
                this.tagSummaryInfoDetailList = tagSummaryInfoDetailList;
                return this;
            }

            public TagSummaryInfo build() {
                return new TagSummaryInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAnnotationMissionSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetAnnotationMissionSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
        private String annotationMissionId;

        @com.aliyun.core.annotation.NameInMap("AsrSummaryInfo")
        private AsrSummaryInfo asrSummaryInfo;

        @com.aliyun.core.annotation.NameInMap("IntentSummaryInfo")
        private IntentSummaryInfo intentSummaryInfo;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("TagSummaryInfo")
        private TagSummaryInfo tagSummaryInfo;

        private Data(Builder builder) {
            this.annotationMissionId = builder.annotationMissionId;
            this.asrSummaryInfo = builder.asrSummaryInfo;
            this.intentSummaryInfo = builder.intentSummaryInfo;
            this.message = builder.message;
            this.success = builder.success;
            this.tagSummaryInfo = builder.tagSummaryInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return annotationMissionId
         */
        public String getAnnotationMissionId() {
            return this.annotationMissionId;
        }

        /**
         * @return asrSummaryInfo
         */
        public AsrSummaryInfo getAsrSummaryInfo() {
            return this.asrSummaryInfo;
        }

        /**
         * @return intentSummaryInfo
         */
        public IntentSummaryInfo getIntentSummaryInfo() {
            return this.intentSummaryInfo;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return tagSummaryInfo
         */
        public TagSummaryInfo getTagSummaryInfo() {
            return this.tagSummaryInfo;
        }

        public static final class Builder {
            private String annotationMissionId; 
            private AsrSummaryInfo asrSummaryInfo; 
            private IntentSummaryInfo intentSummaryInfo; 
            private String message; 
            private Boolean success; 
            private TagSummaryInfo tagSummaryInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.annotationMissionId = model.annotationMissionId;
                this.asrSummaryInfo = model.asrSummaryInfo;
                this.intentSummaryInfo = model.intentSummaryInfo;
                this.message = model.message;
                this.success = model.success;
                this.tagSummaryInfo = model.tagSummaryInfo;
            } 

            /**
             * AnnotationMissionId.
             */
            public Builder annotationMissionId(String annotationMissionId) {
                this.annotationMissionId = annotationMissionId;
                return this;
            }

            /**
             * AsrSummaryInfo.
             */
            public Builder asrSummaryInfo(AsrSummaryInfo asrSummaryInfo) {
                this.asrSummaryInfo = asrSummaryInfo;
                return this;
            }

            /**
             * IntentSummaryInfo.
             */
            public Builder intentSummaryInfo(IntentSummaryInfo intentSummaryInfo) {
                this.intentSummaryInfo = intentSummaryInfo;
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
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * TagSummaryInfo.
             */
            public Builder tagSummaryInfo(TagSummaryInfo tagSummaryInfo) {
                this.tagSummaryInfo = tagSummaryInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
