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
 * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicyInfoResponseBody</p>
 */
public class GetPolicyInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContentSafeModelInfo")
    private ContentSafeModelInfo contentSafeModelInfo;

    @com.aliyun.core.annotation.NameInMap("EnableSensitiveInputCheck")
    private Integer enableSensitiveInputCheck;

    @com.aliyun.core.annotation.NameInMap("EnableSensitiveOutputCheck")
    private Integer enableSensitiveOutputCheck;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("HarmfulCategoryConfigInfoList")
    private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InputSafeAnswer")
    private String inputSafeAnswer;

    @com.aliyun.core.annotation.NameInMap("InputSafeAnswerSwitch")
    private Integer inputSafeAnswerSwitch;

    @com.aliyun.core.annotation.NameInMap("IsSidecarPolicy")
    private Integer isSidecarPolicy;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswer")
    private String outputSafeAnswer;

    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswerSwitch")
    private Integer outputSafeAnswerSwitch;

    @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
    private String policyIdentifier;

    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.NameInMap("PromptAttackInfo")
    private PromptAttackInfo promptAttackInfo;

    @com.aliyun.core.annotation.NameInMap("PromptAttackInfoList")
    private java.util.List<PromptAttackInfoList> promptAttackInfoList;

    @com.aliyun.core.annotation.NameInMap("PromptAttackModelInfo")
    private PromptAttackModelInfo promptAttackModelInfo;

    @com.aliyun.core.annotation.NameInMap("RegularExpressList")
    private java.util.List<RegularExpressList> regularExpressList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    @com.aliyun.core.annotation.NameInMap("SensitiveConfigList")
    private java.util.List<SensitiveConfigList> sensitiveConfigList;

    @com.aliyun.core.annotation.NameInMap("SensitiveTopicList")
    private java.util.List<SensitiveTopicList> sensitiveTopicList;

    @com.aliyun.core.annotation.NameInMap("SensitiveTopicModelInfo")
    private SensitiveTopicModelInfo sensitiveTopicModelInfo;

    @com.aliyun.core.annotation.NameInMap("SensitiveWordList")
    private java.util.List<SensitiveWordList> sensitiveWordList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicConfigInfoList")
    private java.util.List<TopicConfigInfoList> topicConfigInfoList;

    @com.aliyun.core.annotation.NameInMap("WordGroupInfoList")
    private java.util.List<WordGroupInfoList> wordGroupInfoList;

    private GetPolicyInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.contentSafeModelInfo = builder.contentSafeModelInfo;
        this.enableSensitiveInputCheck = builder.enableSensitiveInputCheck;
        this.enableSensitiveOutputCheck = builder.enableSensitiveOutputCheck;
        this.gmtModified = builder.gmtModified;
        this.harmfulCategoryConfigInfoList = builder.harmfulCategoryConfigInfoList;
        this.httpStatusCode = builder.httpStatusCode;
        this.inputSafeAnswer = builder.inputSafeAnswer;
        this.inputSafeAnswerSwitch = builder.inputSafeAnswerSwitch;
        this.isSidecarPolicy = builder.isSidecarPolicy;
        this.message = builder.message;
        this.outputSafeAnswer = builder.outputSafeAnswer;
        this.outputSafeAnswerSwitch = builder.outputSafeAnswerSwitch;
        this.policyIdentifier = builder.policyIdentifier;
        this.policyName = builder.policyName;
        this.promptAttackInfo = builder.promptAttackInfo;
        this.promptAttackInfoList = builder.promptAttackInfoList;
        this.promptAttackModelInfo = builder.promptAttackModelInfo;
        this.regularExpressList = builder.regularExpressList;
        this.requestId = builder.requestId;
        this.sceneType = builder.sceneType;
        this.sensitiveConfigList = builder.sensitiveConfigList;
        this.sensitiveTopicList = builder.sensitiveTopicList;
        this.sensitiveTopicModelInfo = builder.sensitiveTopicModelInfo;
        this.sensitiveWordList = builder.sensitiveWordList;
        this.success = builder.success;
        this.topicConfigInfoList = builder.topicConfigInfoList;
        this.wordGroupInfoList = builder.wordGroupInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicyInfoResponseBody create() {
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
     * @return contentSafeModelInfo
     */
    public ContentSafeModelInfo getContentSafeModelInfo() {
        return this.contentSafeModelInfo;
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
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return harmfulCategoryConfigInfoList
     */
    public java.util.List<HarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
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
     * @return isSidecarPolicy
     */
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
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
     * @return policyIdentifier
     */
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
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
     * @return promptAttackModelInfo
     */
    public PromptAttackModelInfo getPromptAttackModelInfo() {
        return this.promptAttackModelInfo;
    }

    /**
     * @return regularExpressList
     */
    public java.util.List<RegularExpressList> getRegularExpressList() {
        return this.regularExpressList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneType
     */
    public Integer getSceneType() {
        return this.sceneType;
    }

    /**
     * @return sensitiveConfigList
     */
    public java.util.List<SensitiveConfigList> getSensitiveConfigList() {
        return this.sensitiveConfigList;
    }

    /**
     * @return sensitiveTopicList
     */
    public java.util.List<SensitiveTopicList> getSensitiveTopicList() {
        return this.sensitiveTopicList;
    }

    /**
     * @return sensitiveTopicModelInfo
     */
    public SensitiveTopicModelInfo getSensitiveTopicModelInfo() {
        return this.sensitiveTopicModelInfo;
    }

    /**
     * @return sensitiveWordList
     */
    public java.util.List<SensitiveWordList> getSensitiveWordList() {
        return this.sensitiveWordList;
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
        private ContentSafeModelInfo contentSafeModelInfo; 
        private Integer enableSensitiveInputCheck; 
        private Integer enableSensitiveOutputCheck; 
        private Long gmtModified; 
        private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList; 
        private Integer httpStatusCode; 
        private String inputSafeAnswer; 
        private Integer inputSafeAnswerSwitch; 
        private Integer isSidecarPolicy; 
        private String message; 
        private String outputSafeAnswer; 
        private Integer outputSafeAnswerSwitch; 
        private String policyIdentifier; 
        private String policyName; 
        private PromptAttackInfo promptAttackInfo; 
        private java.util.List<PromptAttackInfoList> promptAttackInfoList; 
        private PromptAttackModelInfo promptAttackModelInfo; 
        private java.util.List<RegularExpressList> regularExpressList; 
        private String requestId; 
        private Integer sceneType; 
        private java.util.List<SensitiveConfigList> sensitiveConfigList; 
        private java.util.List<SensitiveTopicList> sensitiveTopicList; 
        private SensitiveTopicModelInfo sensitiveTopicModelInfo; 
        private java.util.List<SensitiveWordList> sensitiveWordList; 
        private Boolean success; 
        private java.util.List<TopicConfigInfoList> topicConfigInfoList; 
        private java.util.List<WordGroupInfoList> wordGroupInfoList; 

        private Builder() {
        } 

        private Builder(GetPolicyInfoResponseBody model) {
            this.code = model.code;
            this.contentSafeModelInfo = model.contentSafeModelInfo;
            this.enableSensitiveInputCheck = model.enableSensitiveInputCheck;
            this.enableSensitiveOutputCheck = model.enableSensitiveOutputCheck;
            this.gmtModified = model.gmtModified;
            this.harmfulCategoryConfigInfoList = model.harmfulCategoryConfigInfoList;
            this.httpStatusCode = model.httpStatusCode;
            this.inputSafeAnswer = model.inputSafeAnswer;
            this.inputSafeAnswerSwitch = model.inputSafeAnswerSwitch;
            this.isSidecarPolicy = model.isSidecarPolicy;
            this.message = model.message;
            this.outputSafeAnswer = model.outputSafeAnswer;
            this.outputSafeAnswerSwitch = model.outputSafeAnswerSwitch;
            this.policyIdentifier = model.policyIdentifier;
            this.policyName = model.policyName;
            this.promptAttackInfo = model.promptAttackInfo;
            this.promptAttackInfoList = model.promptAttackInfoList;
            this.promptAttackModelInfo = model.promptAttackModelInfo;
            this.regularExpressList = model.regularExpressList;
            this.requestId = model.requestId;
            this.sceneType = model.sceneType;
            this.sensitiveConfigList = model.sensitiveConfigList;
            this.sensitiveTopicList = model.sensitiveTopicList;
            this.sensitiveTopicModelInfo = model.sensitiveTopicModelInfo;
            this.sensitiveWordList = model.sensitiveWordList;
            this.success = model.success;
            this.topicConfigInfoList = model.topicConfigInfoList;
            this.wordGroupInfoList = model.wordGroupInfoList;
        } 

        /**
         * <p>Result code, 00000 indicates success; others indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>00000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContentSafeModelInfo.
         */
        public Builder contentSafeModelInfo(ContentSafeModelInfo contentSafeModelInfo) {
            this.contentSafeModelInfo = contentSafeModelInfo;
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
         * <p>Policy modification time</p>
         * 
         * <strong>example:</strong>
         * <p>1634122349000</p>
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>Harmful category configuration list</p>
         */
        public Builder harmfulCategoryConfigInfoList(java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
            this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
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
         * IsSidecarPolicy.
         */
        public Builder isSidecarPolicy(Integer isSidecarPolicy) {
            this.isSidecarPolicy = isSidecarPolicy;
            return this;
        }

        /**
         * <p>Error message.</p>
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
         * <p>Policy identifier</p>
         * 
         * <strong>example:</strong>
         * <p>x1bc5xgs4uhx</p>
         */
        public Builder policyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }

        /**
         * <p>Detection policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicy</p>
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
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
         * PromptAttackModelInfo.
         */
        public Builder promptAttackModelInfo(PromptAttackModelInfo promptAttackModelInfo) {
            this.promptAttackModelInfo = promptAttackModelInfo;
            return this;
        }

        /**
         * RegularExpressList.
         */
        public Builder regularExpressList(java.util.List<RegularExpressList> regularExpressList) {
            this.regularExpressList = regularExpressList;
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
         * SceneType.
         */
        public Builder sceneType(Integer sceneType) {
            this.sceneType = sceneType;
            return this;
        }

        /**
         * SensitiveConfigList.
         */
        public Builder sensitiveConfigList(java.util.List<SensitiveConfigList> sensitiveConfigList) {
            this.sensitiveConfigList = sensitiveConfigList;
            return this;
        }

        /**
         * SensitiveTopicList.
         */
        public Builder sensitiveTopicList(java.util.List<SensitiveTopicList> sensitiveTopicList) {
            this.sensitiveTopicList = sensitiveTopicList;
            return this;
        }

        /**
         * SensitiveTopicModelInfo.
         */
        public Builder sensitiveTopicModelInfo(SensitiveTopicModelInfo sensitiveTopicModelInfo) {
            this.sensitiveTopicModelInfo = sensitiveTopicModelInfo;
            return this;
        }

        /**
         * SensitiveWordList.
         */
        public Builder sensitiveWordList(java.util.List<SensitiveWordList> sensitiveWordList) {
            this.sensitiveWordList = sensitiveWordList;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. <code>true</code> for success, <code>false</code> for failure.</p>
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
         * <p>Keyword group object list</p>
         */
        public Builder wordGroupInfoList(java.util.List<WordGroupInfoList> wordGroupInfoList) {
            this.wordGroupInfoList = wordGroupInfoList;
            return this;
        }

        public GetPolicyInfoResponseBody build() {
            return new GetPolicyInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class ContentSafeModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EasServiceName")
        private String easServiceName;

        @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
        private Long modelInstanceId;

        private ContentSafeModelInfo(Builder builder) {
            this.easServiceName = builder.easServiceName;
            this.modelInstanceId = builder.modelInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentSafeModelInfo create() {
            return builder().build();
        }

        /**
         * @return easServiceName
         */
        public String getEasServiceName() {
            return this.easServiceName;
        }

        /**
         * @return modelInstanceId
         */
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

        public static final class Builder {
            private String easServiceName; 
            private Long modelInstanceId; 

            private Builder() {
            } 

            private Builder(ContentSafeModelInfo model) {
                this.easServiceName = model.easServiceName;
                this.modelInstanceId = model.modelInstanceId;
            } 

            /**
             * EasServiceName.
             */
            public Builder easServiceName(String easServiceName) {
                this.easServiceName = easServiceName;
                return this;
            }

            /**
             * ModelInstanceId.
             */
            public Builder modelInstanceId(Long modelInstanceId) {
                this.modelInstanceId = modelInstanceId;
                return this;
            }

            public ContentSafeModelInfo build() {
                return new ContentSafeModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class HarmfulCategoryConfigInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryConfigId")
        private Long categoryConfigId;

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

        private HarmfulCategoryConfigInfoList(Builder builder) {
            this.categoryConfigId = builder.categoryConfigId;
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

        public static HarmfulCategoryConfigInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryConfigId
         */
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
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
            private Long categoryConfigId; 
            private Long categoryId; 
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer inputOutputType; 
            private Integer isEnabled; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(HarmfulCategoryConfigInfoList model) {
                this.categoryConfigId = model.categoryConfigId;
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.inputOutputType = model.inputOutputType;
                this.isEnabled = model.isEnabled;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Harmful category configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryConfigId(Long categoryConfigId) {
                this.categoryConfigId = categoryConfigId;
                return this;
            }

            /**
             * CategoryId.
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

            public HarmfulCategoryConfigInfoList build() {
                return new HarmfulCategoryConfigInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
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
             * <p>Prompt attack configuration switch
             * 0: Off
             * 1: On</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class PromptAttackInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryConfigId")
        private Long categoryConfigId;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttackInfoList(Builder builder) {
            this.categoryConfigId = builder.categoryConfigId;
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
         * @return categoryConfigId
         */
        public Long getCategoryConfigId() {
            return this.categoryConfigId;
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
            private Long categoryConfigId; 
            private Long categoryId; 
            private String categoryLabel; 
            private Integer isEnabled; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttackInfoList model) {
                this.categoryConfigId = model.categoryConfigId;
                this.categoryId = model.categoryId;
                this.categoryLabel = model.categoryLabel;
                this.isEnabled = model.isEnabled;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Harmful category configuration ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder categoryConfigId(Long categoryConfigId) {
                this.categoryConfigId = categoryConfigId;
                return this;
            }

            /**
             * CategoryId.
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

            public PromptAttackInfoList build() {
                return new PromptAttackInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class PromptAttackModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EasServiceName")
        private String easServiceName;

        @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
        private Long modelInstanceId;

        private PromptAttackModelInfo(Builder builder) {
            this.easServiceName = builder.easServiceName;
            this.modelInstanceId = builder.modelInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttackModelInfo create() {
            return builder().build();
        }

        /**
         * @return easServiceName
         */
        public String getEasServiceName() {
            return this.easServiceName;
        }

        /**
         * @return modelInstanceId
         */
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

        public static final class Builder {
            private String easServiceName; 
            private Long modelInstanceId; 

            private Builder() {
            } 

            private Builder(PromptAttackModelInfo model) {
                this.easServiceName = model.easServiceName;
                this.modelInstanceId = model.modelInstanceId;
            } 

            /**
             * EasServiceName.
             */
            public Builder easServiceName(String easServiceName) {
                this.easServiceName = easServiceName;
                return this;
            }

            /**
             * ModelInstanceId.
             */
            public Builder modelInstanceId(Long modelInstanceId) {
                this.modelInstanceId = modelInstanceId;
                return this;
            }

            public PromptAttackModelInfo build() {
                return new PromptAttackModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class RegularExpressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("MatchAndReplace")
        private String matchAndReplace;

        @com.aliyun.core.annotation.NameInMap("RegularExpress")
        private String regularExpress;

        @com.aliyun.core.annotation.NameInMap("RegularExpressId")
        private Long regularExpressId;

        @com.aliyun.core.annotation.NameInMap("RegularExpressName")
        private String regularExpressName;

        private RegularExpressList(Builder builder) {
            this.actionType = builder.actionType;
            this.inputOutputType = builder.inputOutputType;
            this.isEnabled = builder.isEnabled;
            this.matchAndReplace = builder.matchAndReplace;
            this.regularExpress = builder.regularExpress;
            this.regularExpressId = builder.regularExpressId;
            this.regularExpressName = builder.regularExpressName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegularExpressList create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
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
         * @return matchAndReplace
         */
        public String getMatchAndReplace() {
            return this.matchAndReplace;
        }

        /**
         * @return regularExpress
         */
        public String getRegularExpress() {
            return this.regularExpress;
        }

        /**
         * @return regularExpressId
         */
        public Long getRegularExpressId() {
            return this.regularExpressId;
        }

        /**
         * @return regularExpressName
         */
        public String getRegularExpressName() {
            return this.regularExpressName;
        }

        public static final class Builder {
            private Integer actionType; 
            private Integer inputOutputType; 
            private Integer isEnabled; 
            private String matchAndReplace; 
            private String regularExpress; 
            private Long regularExpressId; 
            private String regularExpressName; 

            private Builder() {
            } 

            private Builder(RegularExpressList model) {
                this.actionType = model.actionType;
                this.inputOutputType = model.inputOutputType;
                this.isEnabled = model.isEnabled;
                this.matchAndReplace = model.matchAndReplace;
                this.regularExpress = model.regularExpress;
                this.regularExpressId = model.regularExpressId;
                this.regularExpressName = model.regularExpressName;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
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
             * RegularExpress.
             */
            public Builder regularExpress(String regularExpress) {
                this.regularExpress = regularExpress;
                return this;
            }

            /**
             * RegularExpressId.
             */
            public Builder regularExpressId(Long regularExpressId) {
                this.regularExpressId = regularExpressId;
                return this;
            }

            /**
             * RegularExpressName.
             */
            public Builder regularExpressName(String regularExpressName) {
                this.regularExpressName = regularExpressName;
                return this;
            }

            public RegularExpressList build() {
                return new RegularExpressList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class SensitiveConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("MatchAndReplace")
        private String matchAndReplace;

        @com.aliyun.core.annotation.NameInMap("SensitiveConfigId")
        private Long sensitiveConfigId;

        @com.aliyun.core.annotation.NameInMap("SensitiveName")
        private String sensitiveName;

        private SensitiveConfigList(Builder builder) {
            this.actionType = builder.actionType;
            this.inputOutputType = builder.inputOutputType;
            this.isEnabled = builder.isEnabled;
            this.matchAndReplace = builder.matchAndReplace;
            this.sensitiveConfigId = builder.sensitiveConfigId;
            this.sensitiveName = builder.sensitiveName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveConfigList create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
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
            private Integer inputOutputType; 
            private Integer isEnabled; 
            private String matchAndReplace; 
            private Long sensitiveConfigId; 
            private String sensitiveName; 

            private Builder() {
            } 

            private Builder(SensitiveConfigList model) {
                this.actionType = model.actionType;
                this.inputOutputType = model.inputOutputType;
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

            public SensitiveConfigList build() {
                return new SensitiveConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class TopicExampleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExampleType")
        private Long exampleType;

        private TopicExampleInfoList(Builder builder) {
            this.content = builder.content;
            this.exampleType = builder.exampleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicExampleInfoList create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return exampleType
         */
        public Long getExampleType() {
            return this.exampleType;
        }

        public static final class Builder {
            private String content; 
            private Long exampleType; 

            private Builder() {
            } 

            private Builder(TopicExampleInfoList model) {
                this.content = model.content;
                this.exampleType = model.exampleType;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ExampleType.
             */
            public Builder exampleType(Long exampleType) {
                this.exampleType = exampleType;
                return this;
            }

            public TopicExampleInfoList build() {
                return new TopicExampleInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class SensitiveTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        @com.aliyun.core.annotation.NameInMap("TopicDefinition")
        private String topicDefinition;

        @com.aliyun.core.annotation.NameInMap("TopicExampleInfoList")
        private java.util.List<TopicExampleInfoList> topicExampleInfoList;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private SensitiveTopicList(Builder builder) {
            this.categoryType = builder.categoryType;
            this.inputOutputType = builder.inputOutputType;
            this.securityLevel = builder.securityLevel;
            this.topicDefinition = builder.topicDefinition;
            this.topicExampleInfoList = builder.topicExampleInfoList;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveTopicList create() {
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
         * @return topicDefinition
         */
        public String getTopicDefinition() {
            return this.topicDefinition;
        }

        /**
         * @return topicExampleInfoList
         */
        public java.util.List<TopicExampleInfoList> getTopicExampleInfoList() {
            return this.topicExampleInfoList;
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
            private String topicDefinition; 
            private java.util.List<TopicExampleInfoList> topicExampleInfoList; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(SensitiveTopicList model) {
                this.categoryType = model.categoryType;
                this.inputOutputType = model.inputOutputType;
                this.securityLevel = model.securityLevel;
                this.topicDefinition = model.topicDefinition;
                this.topicExampleInfoList = model.topicExampleInfoList;
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
             * <p>1</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * TopicDefinition.
             */
            public Builder topicDefinition(String topicDefinition) {
                this.topicDefinition = topicDefinition;
                return this;
            }

            /**
             * TopicExampleInfoList.
             */
            public Builder topicExampleInfoList(java.util.List<TopicExampleInfoList> topicExampleInfoList) {
                this.topicExampleInfoList = topicExampleInfoList;
                return this;
            }

            /**
             * TopicId.
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * TopicName.
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public SensitiveTopicList build() {
                return new SensitiveTopicList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class SensitiveTopicModelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EasServiceName")
        private String easServiceName;

        @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
        private Long modelInstanceId;

        private SensitiveTopicModelInfo(Builder builder) {
            this.easServiceName = builder.easServiceName;
            this.modelInstanceId = builder.modelInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveTopicModelInfo create() {
            return builder().build();
        }

        /**
         * @return easServiceName
         */
        public String getEasServiceName() {
            return this.easServiceName;
        }

        /**
         * @return modelInstanceId
         */
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

        public static final class Builder {
            private String easServiceName; 
            private Long modelInstanceId; 

            private Builder() {
            } 

            private Builder(SensitiveTopicModelInfo model) {
                this.easServiceName = model.easServiceName;
                this.modelInstanceId = model.modelInstanceId;
            } 

            /**
             * EasServiceName.
             */
            public Builder easServiceName(String easServiceName) {
                this.easServiceName = easServiceName;
                return this;
            }

            /**
             * ModelInstanceId.
             */
            public Builder modelInstanceId(Long modelInstanceId) {
                this.modelInstanceId = modelInstanceId;
                return this;
            }

            public SensitiveTopicModelInfo build() {
                return new SensitiveTopicModelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
     */
    public static class SensitiveWordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputOutputType")
        private Integer inputOutputType;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private SensitiveWordList(Builder builder) {
            this.inputOutputType = builder.inputOutputType;
            this.label = builder.label;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveWordList create() {
            return builder().build();
        }

        /**
         * @return inputOutputType
         */
        public Integer getInputOutputType() {
            return this.inputOutputType;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private Integer inputOutputType; 
            private String label; 
            private String word; 

            private Builder() {
            } 

            private Builder(SensitiveWordList model) {
                this.inputOutputType = model.inputOutputType;
                this.label = model.label;
                this.word = model.word;
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
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public SensitiveWordList build() {
                return new SensitiveWordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
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
             * <p>1</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>Sensitive topic ID</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
     * {@link GetPolicyInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicyInfoResponseBody</p>
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
