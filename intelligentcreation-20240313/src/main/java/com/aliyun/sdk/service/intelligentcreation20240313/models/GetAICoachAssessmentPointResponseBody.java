// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachAssessmentPointResponseBody</p>
 */
public class GetAICoachAssessmentPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("answerList")
    private java.util.List<AnswerList> answerList;

    @com.aliyun.core.annotation.NameInMap("citations")
    private Integer citations;

    @com.aliyun.core.annotation.NameInMap("documentId")
    private String documentId;

    @com.aliyun.core.annotation.NameInMap("documentName")
    private String documentName;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("kbId")
    private String kbId;

    @com.aliyun.core.annotation.NameInMap("kbType")
    private String kbType;

    @com.aliyun.core.annotation.NameInMap("knowledgeList")
    private java.util.List<String> knowledgeList;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("pointId")
    private String pointId;

    @com.aliyun.core.annotation.NameInMap("questionDescription")
    private String questionDescription;

    @com.aliyun.core.annotation.NameInMap("questionSample")
    private String questionSample;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetAICoachAssessmentPointResponseBody(Builder builder) {
        this.answerList = builder.answerList;
        this.citations = builder.citations;
        this.documentId = builder.documentId;
        this.documentName = builder.documentName;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.kbId = builder.kbId;
        this.kbType = builder.kbType;
        this.knowledgeList = builder.knowledgeList;
        this.name = builder.name;
        this.pointId = builder.pointId;
        this.questionDescription = builder.questionDescription;
        this.questionSample = builder.questionSample;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachAssessmentPointResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return answerList
     */
    public java.util.List<AnswerList> getAnswerList() {
        return this.answerList;
    }

    /**
     * @return citations
     */
    public Integer getCitations() {
        return this.citations;
    }

    /**
     * @return documentId
     */
    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return kbId
     */
    public String getKbId() {
        return this.kbId;
    }

    /**
     * @return kbType
     */
    public String getKbType() {
        return this.kbType;
    }

    /**
     * @return knowledgeList
     */
    public java.util.List<String> getKnowledgeList() {
        return this.knowledgeList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pointId
     */
    public String getPointId() {
        return this.pointId;
    }

    /**
     * @return questionDescription
     */
    public String getQuestionDescription() {
        return this.questionDescription;
    }

    /**
     * @return questionSample
     */
    public String getQuestionSample() {
        return this.questionSample;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<AnswerList> answerList; 
        private Integer citations; 
        private String documentId; 
        private String documentName; 
        private String gmtCreate; 
        private String gmtModified; 
        private String kbId; 
        private String kbType; 
        private java.util.List<String> knowledgeList; 
        private String name; 
        private String pointId; 
        private String questionDescription; 
        private String questionSample; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetAICoachAssessmentPointResponseBody model) {
            this.answerList = model.answerList;
            this.citations = model.citations;
            this.documentId = model.documentId;
            this.documentName = model.documentName;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.kbId = model.kbId;
            this.kbType = model.kbType;
            this.knowledgeList = model.knowledgeList;
            this.name = model.name;
            this.pointId = model.pointId;
            this.questionDescription = model.questionDescription;
            this.questionSample = model.questionSample;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * answerList.
         */
        public Builder answerList(java.util.List<AnswerList> answerList) {
            this.answerList = answerList;
            return this;
        }

        /**
         * citations.
         */
        public Builder citations(Integer citations) {
            this.citations = citations;
            return this;
        }

        /**
         * documentId.
         */
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        /**
         * documentName.
         */
        public Builder documentName(String documentName) {
            this.documentName = documentName;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * kbId.
         */
        public Builder kbId(String kbId) {
            this.kbId = kbId;
            return this;
        }

        /**
         * kbType.
         */
        public Builder kbType(String kbType) {
            this.kbType = kbType;
            return this;
        }

        /**
         * knowledgeList.
         */
        public Builder knowledgeList(java.util.List<String> knowledgeList) {
            this.knowledgeList = knowledgeList;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * pointId.
         */
        public Builder pointId(String pointId) {
            this.pointId = pointId;
            return this;
        }

        /**
         * questionDescription.
         */
        public Builder questionDescription(String questionDescription) {
            this.questionDescription = questionDescription;
            return this;
        }

        /**
         * questionSample.
         */
        public Builder questionSample(String questionSample) {
            this.questionSample = questionSample;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4830493A-728F-5F19-BBCC-1443292E9C49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetAICoachAssessmentPointResponseBody build() {
            return new GetAICoachAssessmentPointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachAssessmentPointResponseBody</p>
     */
    public static class KeywordValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private KeywordValues(Builder builder) {
            this.name = builder.name;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordValues create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String name; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(KeywordValues model) {
                this.name = model.name;
                this.weight = model.weight;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public KeywordValues build() {
                return new KeywordValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachAssessmentPointResponseBody</p>
     */
    public static class ScoringRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private ScoringRules(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScoringRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(ScoringRules model) {
                this.name = model.name;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ScoringRules build() {
                return new ScoringRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachAssessmentPointResponseBody</p>
     */
    public static class AnswerValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerName")
        private String answerName;

        @com.aliyun.core.annotation.NameInMap("answerWeight")
        private Integer answerWeight;

        @com.aliyun.core.annotation.NameInMap("keywordValues")
        private java.util.List<KeywordValues> keywordValues;

        @com.aliyun.core.annotation.NameInMap("keywordWeight")
        private Integer keywordWeight;

        @com.aliyun.core.annotation.NameInMap("scoringRules")
        private java.util.List<ScoringRules> scoringRules;

        private AnswerValues(Builder builder) {
            this.answerName = builder.answerName;
            this.answerWeight = builder.answerWeight;
            this.keywordValues = builder.keywordValues;
            this.keywordWeight = builder.keywordWeight;
            this.scoringRules = builder.scoringRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerValues create() {
            return builder().build();
        }

        /**
         * @return answerName
         */
        public String getAnswerName() {
            return this.answerName;
        }

        /**
         * @return answerWeight
         */
        public Integer getAnswerWeight() {
            return this.answerWeight;
        }

        /**
         * @return keywordValues
         */
        public java.util.List<KeywordValues> getKeywordValues() {
            return this.keywordValues;
        }

        /**
         * @return keywordWeight
         */
        public Integer getKeywordWeight() {
            return this.keywordWeight;
        }

        /**
         * @return scoringRules
         */
        public java.util.List<ScoringRules> getScoringRules() {
            return this.scoringRules;
        }

        public static final class Builder {
            private String answerName; 
            private Integer answerWeight; 
            private java.util.List<KeywordValues> keywordValues; 
            private Integer keywordWeight; 
            private java.util.List<ScoringRules> scoringRules; 

            private Builder() {
            } 

            private Builder(AnswerValues model) {
                this.answerName = model.answerName;
                this.answerWeight = model.answerWeight;
                this.keywordValues = model.keywordValues;
                this.keywordWeight = model.keywordWeight;
                this.scoringRules = model.scoringRules;
            } 

            /**
             * answerName.
             */
            public Builder answerName(String answerName) {
                this.answerName = answerName;
                return this;
            }

            /**
             * answerWeight.
             */
            public Builder answerWeight(Integer answerWeight) {
                this.answerWeight = answerWeight;
                return this;
            }

            /**
             * keywordValues.
             */
            public Builder keywordValues(java.util.List<KeywordValues> keywordValues) {
                this.keywordValues = keywordValues;
                return this;
            }

            /**
             * keywordWeight.
             */
            public Builder keywordWeight(Integer keywordWeight) {
                this.keywordWeight = keywordWeight;
                return this;
            }

            /**
             * scoringRules.
             */
            public Builder scoringRules(java.util.List<ScoringRules> scoringRules) {
                this.scoringRules = scoringRules;
                return this;
            }

            public AnswerValues build() {
                return new AnswerValues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachAssessmentPointResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAICoachAssessmentPointResponseBody} extends {@link TeaModel}
     *
     * <p>GetAICoachAssessmentPointResponseBody</p>
     */
    public static class AnswerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answerValues")
        private java.util.List<AnswerValues> answerValues;

        @com.aliyun.core.annotation.NameInMap("enabledKeyword")
        private Boolean enabledKeyword;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("operators")
        private String operators;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private java.util.List<Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Integer weight;

        private AnswerList(Builder builder) {
            this.answerValues = builder.answerValues;
            this.enabledKeyword = builder.enabledKeyword;
            this.nameList = builder.nameList;
            this.operators = builder.operators;
            this.parameters = builder.parameters;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnswerList create() {
            return builder().build();
        }

        /**
         * @return answerValues
         */
        public java.util.List<AnswerValues> getAnswerValues() {
            return this.answerValues;
        }

        /**
         * @return enabledKeyword
         */
        public Boolean getEnabledKeyword() {
            return this.enabledKeyword;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        /**
         * @return operators
         */
        public String getOperators() {
            return this.operators;
        }

        /**
         * @return parameters
         */
        public java.util.List<Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private java.util.List<AnswerValues> answerValues; 
            private Boolean enabledKeyword; 
            private java.util.List<String> nameList; 
            private String operators; 
            private java.util.List<Parameters> parameters; 
            private String type; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(AnswerList model) {
                this.answerValues = model.answerValues;
                this.enabledKeyword = model.enabledKeyword;
                this.nameList = model.nameList;
                this.operators = model.operators;
                this.parameters = model.parameters;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * answerValues.
             */
            public Builder answerValues(java.util.List<AnswerValues> answerValues) {
                this.answerValues = answerValues;
                return this;
            }

            /**
             * enabledKeyword.
             */
            public Builder enabledKeyword(Boolean enabledKeyword) {
                this.enabledKeyword = enabledKeyword;
                return this;
            }

            /**
             * nameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * operators.
             */
            public Builder operators(String operators) {
                this.operators = operators;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AnswerList build() {
                return new AnswerList(this);
            } 

        } 

    }
}
