// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyDefaultOptionsResponseBody</p>
 */
public class GetPolicyDefaultOptionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EnableSensitiveInputCheck")
    private Integer enableSensitiveInputCheck;

    @com.aliyun.core.annotation.NameInMap("EnableSensitiveOutputCheck")
    private Integer enableSensitiveOutputCheck;

    @com.aliyun.core.annotation.NameInMap("HarmfulCategoryInfoList")
    private java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InputSafeAnswer")
    private String inputSafeAnswer;

    @com.aliyun.core.annotation.NameInMap("InputSafeAnswerSwitch")
    private Integer inputSafeAnswerSwitch;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswer")
    private String outputSafeAnswer;

    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswerSwitch")
    private Integer outputSafeAnswerSwitch;

    @com.aliyun.core.annotation.NameInMap("PromptAttackInfo")
    private PromptAttackInfo promptAttackInfo;

    @com.aliyun.core.annotation.NameInMap("PromptAttackInfoList")
    private java.util.List<PromptAttackInfoList> promptAttackInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SensitiveDataTypeList")
    private java.util.List<SensitiveDataTypeList> sensitiveDataTypeList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicConfigInfoList")
    private java.util.List<TopicConfigInfoList> topicConfigInfoList;

    @com.aliyun.core.annotation.NameInMap("WordGroupInfoList")
    private java.util.List<WordGroupInfoList> wordGroupInfoList;

    private GetPolicyDefaultOptionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.enableSensitiveInputCheck = builder.enableSensitiveInputCheck;
        this.enableSensitiveOutputCheck = builder.enableSensitiveOutputCheck;
        this.harmfulCategoryInfoList = builder.harmfulCategoryInfoList;
        this.httpStatusCode = builder.httpStatusCode;
        this.inputSafeAnswer = builder.inputSafeAnswer;
        this.inputSafeAnswerSwitch = builder.inputSafeAnswerSwitch;
        this.message = builder.message;
        this.outputSafeAnswer = builder.outputSafeAnswer;
        this.outputSafeAnswerSwitch = builder.outputSafeAnswerSwitch;
        this.promptAttackInfo = builder.promptAttackInfo;
        this.promptAttackInfoList = builder.promptAttackInfoList;
        this.requestId = builder.requestId;
        this.sensitiveDataTypeList = builder.sensitiveDataTypeList;
        this.success = builder.success;
        this.topicConfigInfoList = builder.topicConfigInfoList;
        this.wordGroupInfoList = builder.wordGroupInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyDefaultOptionsResponseBody create() {
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
     * @return enableSensitiveInputCheck
     */
    public Integer getEnableSensitiveInputCheck() {
        return this.enableSensitiveInputCheck;
    }

    /**
     * @return enableSensitiveOutputCheck
     */
    public Integer getEnableSensitiveOutputCheck() {
        return this.enableSensitiveOutputCheck;
    }

    /**
     * @return harmfulCategoryInfoList
     */
    public java.util.List<HarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
        return this.harmfulCategoryInfoList;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return inputSafeAnswer
     */
    public String getInputSafeAnswer() {
        return this.inputSafeAnswer;
    }

    /**
     * @return inputSafeAnswerSwitch
     */
    public Integer getInputSafeAnswerSwitch() {
        return this.inputSafeAnswerSwitch;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outputSafeAnswer
     */
    public String getOutputSafeAnswer() {
        return this.outputSafeAnswer;
    }

    /**
     * @return outputSafeAnswerSwitch
     */
    public Integer getOutputSafeAnswerSwitch() {
        return this.outputSafeAnswerSwitch;
    }

    /**
     * @return promptAttackInfo
     */
    public PromptAttackInfo getPromptAttackInfo() {
        return this.promptAttackInfo;
    }

    /**
     * @return promptAttackInfoList
     */
    public java.util.List<PromptAttackInfoList> getPromptAttackInfoList() {
        return this.promptAttackInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveDataTypeList
     */
    public java.util.List<SensitiveDataTypeList> getSensitiveDataTypeList() {
        return this.sensitiveDataTypeList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return topicConfigInfoList
     */
    public java.util.List<TopicConfigInfoList> getTopicConfigInfoList() {
        return this.topicConfigInfoList;
    }

    /**
     * @return wordGroupInfoList
     */
    public java.util.List<WordGroupInfoList> getWordGroupInfoList() {
        return this.wordGroupInfoList;
    }

    public static final class Builder {
        private String code; 
        private Integer enableSensitiveInputCheck; 
        private Integer enableSensitiveOutputCheck; 
        private java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList; 
        private Integer httpStatusCode; 
        private String inputSafeAnswer; 
        private Integer inputSafeAnswerSwitch; 
        private String message; 
        private String outputSafeAnswer; 
        private Integer outputSafeAnswerSwitch; 
        private PromptAttackInfo promptAttackInfo; 
        private java.util.List<PromptAttackInfoList> promptAttackInfoList; 
        private String requestId; 
        private java.util.List<SensitiveDataTypeList> sensitiveDataTypeList; 
        private Boolean success; 
        private java.util.List<TopicConfigInfoList> topicConfigInfoList; 
        private java.util.List<WordGroupInfoList> wordGroupInfoList; 

        private Builder() {
        } 

        private Builder(GetPolicyDefaultOptionsResponseBody model) {
            this.code = model.code;
            this.enableSensitiveInputCheck = model.enableSensitiveInputCheck;
            this.enableSensitiveOutputCheck = model.enableSensitiveOutputCheck;
            this.harmfulCategoryInfoList = model.harmfulCategoryInfoList;
            this.httpStatusCode = model.httpStatusCode;
            this.inputSafeAnswer = model.inputSafeAnswer;
            this.inputSafeAnswerSwitch = model.inputSafeAnswerSwitch;
            this.message = model.message;
            this.outputSafeAnswer = model.outputSafeAnswer;
            this.outputSafeAnswerSwitch = model.outputSafeAnswerSwitch;
            this.promptAttackInfo = model.promptAttackInfo;
            this.promptAttackInfoList = model.promptAttackInfoList;
            this.requestId = model.requestId;
            this.sensitiveDataTypeList = model.sensitiveDataTypeList;
            this.success = model.success;
            this.topicConfigInfoList = model.topicConfigInfoList;
            this.wordGroupInfoList = model.wordGroupInfoList;
        } 

        /**
         * <p>Status code, 00000 indicates success; others indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>00000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnableSensitiveInputCheck.
         */
        public Builder enableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
            this.enableSensitiveInputCheck = enableSensitiveInputCheck;
            return this;
        }

        /**
         * EnableSensitiveOutputCheck.
         */
        public Builder enableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
            this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
            return this;
        }

        /**
         * <p>List of harmful category objects</p>
         */
        public Builder harmfulCategoryInfoList(java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList) {
            this.harmfulCategoryInfoList = harmfulCategoryInfoList;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * InputSafeAnswer.
         */
        public Builder inputSafeAnswer(String inputSafeAnswer) {
            this.inputSafeAnswer = inputSafeAnswer;
            return this;
        }

        /**
         * InputSafeAnswerSwitch.
         */
        public Builder inputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
            this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OutputSafeAnswer.
         */
        public Builder outputSafeAnswer(String outputSafeAnswer) {
            this.outputSafeAnswer = outputSafeAnswer;
            return this;
        }

        /**
         * OutputSafeAnswerSwitch.
         */
        public Builder outputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
            this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
            return this;
        }

        /**
         * <p>Prompt attack detection result object</p>
         */
        public Builder promptAttackInfo(PromptAttackInfo promptAttackInfo) {
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }

        /**
         * <p>Prompt attack list</p>
         */
        public Builder promptAttackInfoList(java.util.List<PromptAttackInfoList> promptAttackInfoList) {
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SensitiveDataTypeList.
         */
        public Builder sensitiveDataTypeList(java.util.List<SensitiveDataTypeList> sensitiveDataTypeList) {
            this.sensitiveDataTypeList = sensitiveDataTypeList;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. <code>true</code> means success, <code>false</code> means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Sensitive topic list</p>
         */
        public Builder topicConfigInfoList(java.util.List<TopicConfigInfoList> topicConfigInfoList) {
            this.topicConfigInfoList = topicConfigInfoList;
            return this;
        }

        /**
         * <p>List of keyword group objects</p>
         */
        public Builder wordGroupInfoList(java.util.List<WordGroupInfoList> wordGroupInfoList) {
            this.wordGroupInfoList = wordGroupInfoList;
            return this;
        }

        public GetPolicyDefaultOptionsResponseBody build() {
            return new GetPolicyDefaultOptionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class HarmfulCategoryInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private HarmfulCategoryInfoList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryLabel = builder.categoryLabel;
            this.categoryType = builder.categoryType;
            this.inputOutputType = builder.inputOutputType;
            this.isEnabled = builder.isEnabled;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HarmfulCategoryInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLabel
         */
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return inputOutputType
         */
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        /**
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer inputOutputType; 
            private Integer isEnabled; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(HarmfulCategoryInfoList model) {
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.inputOutputType = model.inputOutputType;
                this.isEnabled = model.isEnabled;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Harmful category ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Category name</p>
             * 
             * <strong>example:</strong>
             * <p>Morality</p>
             */
            public Builder categoryLabel(String categoryLabel) {
                this.categoryLabel = categoryLabel;
                return this;
            }

            /**
             * <p>0: Text
             * 1: Image</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>Model input/output type
             * 0: Input
             * 1: Output</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inputOutputType(Integer inputOutputType) {
                this.inputOutputType = inputOutputType;
                return this;
            }

            /**
             * <p>Harmful category configuration switch
             * 0: Off
             * 1: On</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * <p>Security level
             * 0: Low
             * 1: Medium
             * 2: High</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public HarmfulCategoryInfoList build() {
                return new HarmfulCategoryInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class PromptAttackInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttackInfo(Builder builder) {
            this.isEnabled = builder.isEnabled;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttackInfo create() {
            return builder().build();
        }

        /**
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Integer isEnabled; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttackInfo model) {
                this.isEnabled = model.isEnabled;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Harmful category configuration switch
             * 0: Off
             * 1: On</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * <p>Security level
             * 0: Low
             * 1: Medium
             * 2: High</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public PromptAttackInfo build() {
                return new PromptAttackInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class PromptAttackInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttackInfoList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryLabel = builder.categoryLabel;
            this.isEnabled = builder.isEnabled;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttackInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryLabel
         */
        public String getCategoryLabel() {
            return this.categoryLabel;
        }

        /**
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryLabel; 
            private Integer isEnabled; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttackInfoList model) {
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.isEnabled = model.isEnabled;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Harmful category ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>Category name</p>
             * 
             * <strong>example:</strong>
             * <p>Role Play</p>
             */
            public Builder categoryLabel(String categoryLabel) {
                this.categoryLabel = categoryLabel;
                return this;
            }

            /**
             * <p>Prompt attack configuration switch
             * 0: Off
             * 1: On</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * <p>Security level
             * 0: Low
             * 1: Medium
             * 2: High</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public PromptAttackInfoList build() {
                return new PromptAttackInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class SensitiveDataTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("ExampleProcessed")
        private String exampleProcessed;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("MatchAndReplace")
        private String matchAndReplace;

        @com.aliyun.core.annotation.NameInMap("SensitiveConfigId")
        private Long sensitiveConfigId;

        @com.aliyun.core.annotation.NameInMap("SensitiveName")
        private String sensitiveName;

        private SensitiveDataTypeList(Builder builder) {
            this.actionType = builder.actionType;
            this.dataType = builder.dataType;
            this.example = builder.example;
            this.exampleProcessed = builder.exampleProcessed;
            this.isEnabled = builder.isEnabled;
            this.matchAndReplace = builder.matchAndReplace;
            this.sensitiveConfigId = builder.sensitiveConfigId;
            this.sensitiveName = builder.sensitiveName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveDataTypeList create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return example
         */
        public String getExample() {
            return this.example;
        }

        /**
         * @return exampleProcessed
         */
        public String getExampleProcessed() {
            return this.exampleProcessed;
        }

        /**
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return matchAndReplace
         */
        public String getMatchAndReplace() {
            return this.matchAndReplace;
        }

        /**
         * @return sensitiveConfigId
         */
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

        /**
         * @return sensitiveName
         */
        public String getSensitiveName() {
            return this.sensitiveName;
        }

        public static final class Builder {
            private Integer actionType; 
            private String dataType; 
            private String example; 
            private String exampleProcessed; 
            private Integer isEnabled; 
            private String matchAndReplace; 
            private Long sensitiveConfigId; 
            private String sensitiveName; 

            private Builder() {
            } 

            private Builder(SensitiveDataTypeList model) {
                this.actionType = model.actionType;
                this.dataType = model.dataType;
                this.example = model.example;
                this.exampleProcessed = model.exampleProcessed;
                this.isEnabled = model.isEnabled;
                this.matchAndReplace = model.matchAndReplace;
                this.sensitiveConfigId = model.sensitiveConfigId;
                this.sensitiveName = model.sensitiveName;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Example.
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * ExampleProcessed.
             */
            public Builder exampleProcessed(String exampleProcessed) {
                this.exampleProcessed = exampleProcessed;
                return this;
            }

            /**
             * <p>Prompt attack configuration switch
             * 0: Off
             * 1: On</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isEnabled(Integer isEnabled) {
                this.isEnabled = isEnabled;
                return this;
            }

            /**
             * MatchAndReplace.
             */
            public Builder matchAndReplace(String matchAndReplace) {
                this.matchAndReplace = matchAndReplace;
                return this;
            }

            /**
             * SensitiveConfigId.
             */
            public Builder sensitiveConfigId(Long sensitiveConfigId) {
                this.sensitiveConfigId = sensitiveConfigId;
                return this;
            }

            /**
             * SensitiveName.
             */
            public Builder sensitiveName(String sensitiveName) {
                this.sensitiveName = sensitiveName;
                return this;
            }

            public SensitiveDataTypeList build() {
                return new SensitiveDataTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class TopicConfigInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private TopicConfigInfoList(Builder builder) {
            this.categoryType = builder.categoryType;
            this.inputOutputType = builder.inputOutputType;
            this.securityLevel = builder.securityLevel;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicConfigInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return inputOutputType
         */
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Integer categoryType; 
            private Integer inputOutputType; 
            private Integer securityLevel; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(TopicConfigInfoList model) {
                this.categoryType = model.categoryType;
                this.inputOutputType = model.inputOutputType;
                this.securityLevel = model.securityLevel;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>0: Text
             * 1: Image</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * <p>Model input/output type
             * 0: Input
             * 1: Output</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inputOutputType(Integer inputOutputType) {
                this.inputOutputType = inputOutputType;
                return this;
            }

            /**
             * <p>Security level
             * 0: Low
             * 1: Medium
             * 2: High</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>Sensitive topic ID</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>Topic name</p>
             * 
             * <strong>example:</strong>
             * <p>Buss.</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public TopicConfigInfoList build() {
                return new TopicConfigInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyDefaultOptionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyDefaultOptionsResponseBody</p>
     */
    public static class WordGroupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        private WordGroupInfoList(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.inputOutputType = builder.inputOutputType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordGroupInfoList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return inputOutputType
         */
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        public static final class Builder {
            private Long groupId; 
            private String groupName; 
            private Integer inputOutputType; 

            private Builder() {
            } 

            private Builder(WordGroupInfoList model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.inputOutputType = model.inputOutputType;
            } 

            /**
             * <p>Keyword group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Keyword group name</p>
             * 
             * <strong>example:</strong>
             * <p>testGroup</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Model input/output type
             * 0: Input
             * 1: Output</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inputOutputType(Integer inputOutputType) {
                this.inputOutputType = inputOutputType;
                return this;
            }

            public WordGroupInfoList build() {
                return new WordGroupInfoList(this);
            } 

        } 

    }
}
