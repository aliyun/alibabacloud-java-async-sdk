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
 * {@link CreatePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePolicyRequest</p>
 */
public class CreatePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentSafeModelInstanceId")
    private Long contentSafeModelInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSensitiveInputCheck")
    private Integer enableSensitiveInputCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSensitiveOutputCheck")
    private Integer enableSensitiveOutputCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HarmfulCategoryConfigInfoList")
    private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputSafeAnswer")
    private String inputSafeAnswer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputSafeAnswerSwitch")
    private Integer inputSafeAnswerSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSidecarPolicy")
    private Integer isSidecarPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswer")
    private String outputSafeAnswer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputSafeAnswerSwitch")
    private Integer outputSafeAnswerSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptAttackInfo")
    private PromptAttackInfo promptAttackInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptAttackInfoList")
    private java.util.List<PromptAttackInfoList> promptAttackInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptAttackModelInstanceId")
    private Long promptAttackModelInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegularExpressList")
    private java.util.List<RegularExpressList> regularExpressList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveConfigList")
    private java.util.List<SensitiveConfigList> sensitiveConfigList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveTopicList")
    private java.util.List<SensitiveTopicList> sensitiveTopicList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveTopicModelInstanceId")
    private Long sensitiveTopicModelInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveWordList")
    private java.util.List<SensitiveWordList> sensitiveWordList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicConfigInfoList")
    private java.util.List<TopicConfigInfoList> topicConfigInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WordGroupInfoList")
    private java.util.List<WordGroupInfoList> wordGroupInfoList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private CreatePolicyRequest(Builder builder) {
        super(builder);
        this.contentSafeModelInstanceId = builder.contentSafeModelInstanceId;
        this.enableSensitiveInputCheck = builder.enableSensitiveInputCheck;
        this.enableSensitiveOutputCheck = builder.enableSensitiveOutputCheck;
        this.harmfulCategoryConfigInfoList = builder.harmfulCategoryConfigInfoList;
        this.inputSafeAnswer = builder.inputSafeAnswer;
        this.inputSafeAnswerSwitch = builder.inputSafeAnswerSwitch;
        this.isSidecarPolicy = builder.isSidecarPolicy;
        this.outputSafeAnswer = builder.outputSafeAnswer;
        this.outputSafeAnswerSwitch = builder.outputSafeAnswerSwitch;
        this.policyName = builder.policyName;
        this.promptAttackInfo = builder.promptAttackInfo;
        this.promptAttackInfoList = builder.promptAttackInfoList;
        this.promptAttackModelInstanceId = builder.promptAttackModelInstanceId;
        this.regionId = builder.regionId;
        this.regularExpressList = builder.regularExpressList;
        this.sceneType = builder.sceneType;
        this.sensitiveConfigList = builder.sensitiveConfigList;
        this.sensitiveTopicList = builder.sensitiveTopicList;
        this.sensitiveTopicModelInstanceId = builder.sensitiveTopicModelInstanceId;
        this.sensitiveWordList = builder.sensitiveWordList;
        this.topicConfigInfoList = builder.topicConfigInfoList;
        this.wordGroupInfoList = builder.wordGroupInfoList;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentSafeModelInstanceId
     */
    public Long getContentSafeModelInstanceId() {
        return this.contentSafeModelInstanceId;
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
     * @return harmfulCategoryConfigInfoList
     */
    public java.util.List<HarmfulCategoryConfigInfoList> getHarmfulCategoryConfigInfoList() {
        return this.harmfulCategoryConfigInfoList;
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
     * @return promptAttackModelInstanceId
     */
    public Long getPromptAttackModelInstanceId() {
        return this.promptAttackModelInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regularExpressList
     */
    public java.util.List<RegularExpressList> getRegularExpressList() {
        return this.regularExpressList;
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
     * @return sensitiveTopicModelInstanceId
     */
    public Long getSensitiveTopicModelInstanceId() {
        return this.sensitiveTopicModelInstanceId;
    }

    /**
     * @return sensitiveWordList
     */
    public java.util.List<SensitiveWordList> getSensitiveWordList() {
        return this.sensitiveWordList;
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

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreatePolicyRequest, Builder> {
        private Long contentSafeModelInstanceId; 
        private Integer enableSensitiveInputCheck; 
        private Integer enableSensitiveOutputCheck; 
        private java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList; 
        private String inputSafeAnswer; 
        private Integer inputSafeAnswerSwitch; 
        private Integer isSidecarPolicy; 
        private String outputSafeAnswer; 
        private Integer outputSafeAnswerSwitch; 
        private String policyName; 
        private PromptAttackInfo promptAttackInfo; 
        private java.util.List<PromptAttackInfoList> promptAttackInfoList; 
        private Long promptAttackModelInstanceId; 
        private String regionId; 
        private java.util.List<RegularExpressList> regularExpressList; 
        private Integer sceneType; 
        private java.util.List<SensitiveConfigList> sensitiveConfigList; 
        private java.util.List<SensitiveTopicList> sensitiveTopicList; 
        private Long sensitiveTopicModelInstanceId; 
        private java.util.List<SensitiveWordList> sensitiveWordList; 
        private java.util.List<TopicConfigInfoList> topicConfigInfoList; 
        private java.util.List<WordGroupInfoList> wordGroupInfoList; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolicyRequest request) {
            super(request);
            this.contentSafeModelInstanceId = request.contentSafeModelInstanceId;
            this.enableSensitiveInputCheck = request.enableSensitiveInputCheck;
            this.enableSensitiveOutputCheck = request.enableSensitiveOutputCheck;
            this.harmfulCategoryConfigInfoList = request.harmfulCategoryConfigInfoList;
            this.inputSafeAnswer = request.inputSafeAnswer;
            this.inputSafeAnswerSwitch = request.inputSafeAnswerSwitch;
            this.isSidecarPolicy = request.isSidecarPolicy;
            this.outputSafeAnswer = request.outputSafeAnswer;
            this.outputSafeAnswerSwitch = request.outputSafeAnswerSwitch;
            this.policyName = request.policyName;
            this.promptAttackInfo = request.promptAttackInfo;
            this.promptAttackInfoList = request.promptAttackInfoList;
            this.promptAttackModelInstanceId = request.promptAttackModelInstanceId;
            this.regionId = request.regionId;
            this.regularExpressList = request.regularExpressList;
            this.sceneType = request.sceneType;
            this.sensitiveConfigList = request.sensitiveConfigList;
            this.sensitiveTopicList = request.sensitiveTopicList;
            this.sensitiveTopicModelInstanceId = request.sensitiveTopicModelInstanceId;
            this.sensitiveWordList = request.sensitiveWordList;
            this.topicConfigInfoList = request.topicConfigInfoList;
            this.wordGroupInfoList = request.wordGroupInfoList;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ContentSafeModelInstanceId.
         */
        public Builder contentSafeModelInstanceId(Long contentSafeModelInstanceId) {
            this.putQueryParameter("ContentSafeModelInstanceId", contentSafeModelInstanceId);
            this.contentSafeModelInstanceId = contentSafeModelInstanceId;
            return this;
        }

        /**
         * EnableSensitiveInputCheck.
         */
        public Builder enableSensitiveInputCheck(Integer enableSensitiveInputCheck) {
            this.putQueryParameter("EnableSensitiveInputCheck", enableSensitiveInputCheck);
            this.enableSensitiveInputCheck = enableSensitiveInputCheck;
            return this;
        }

        /**
         * EnableSensitiveOutputCheck.
         */
        public Builder enableSensitiveOutputCheck(Integer enableSensitiveOutputCheck) {
            this.putQueryParameter("EnableSensitiveOutputCheck", enableSensitiveOutputCheck);
            this.enableSensitiveOutputCheck = enableSensitiveOutputCheck;
            return this;
        }

        /**
         * <p>List of harmful category configurations</p>
         */
        public Builder harmfulCategoryConfigInfoList(java.util.List<HarmfulCategoryConfigInfoList> harmfulCategoryConfigInfoList) {
            String harmfulCategoryConfigInfoListShrink = shrink(harmfulCategoryConfigInfoList, "HarmfulCategoryConfigInfoList", "json");
            this.putQueryParameter("HarmfulCategoryConfigInfoList", harmfulCategoryConfigInfoListShrink);
            this.harmfulCategoryConfigInfoList = harmfulCategoryConfigInfoList;
            return this;
        }

        /**
         * InputSafeAnswer.
         */
        public Builder inputSafeAnswer(String inputSafeAnswer) {
            this.putQueryParameter("InputSafeAnswer", inputSafeAnswer);
            this.inputSafeAnswer = inputSafeAnswer;
            return this;
        }

        /**
         * InputSafeAnswerSwitch.
         */
        public Builder inputSafeAnswerSwitch(Integer inputSafeAnswerSwitch) {
            this.putQueryParameter("InputSafeAnswerSwitch", inputSafeAnswerSwitch);
            this.inputSafeAnswerSwitch = inputSafeAnswerSwitch;
            return this;
        }

        /**
         * IsSidecarPolicy.
         */
        public Builder isSidecarPolicy(Integer isSidecarPolicy) {
            this.putQueryParameter("IsSidecarPolicy", isSidecarPolicy);
            this.isSidecarPolicy = isSidecarPolicy;
            return this;
        }

        /**
         * OutputSafeAnswer.
         */
        public Builder outputSafeAnswer(String outputSafeAnswer) {
            this.putQueryParameter("OutputSafeAnswer", outputSafeAnswer);
            this.outputSafeAnswer = outputSafeAnswer;
            return this;
        }

        /**
         * OutputSafeAnswerSwitch.
         */
        public Builder outputSafeAnswerSwitch(Integer outputSafeAnswerSwitch) {
            this.putQueryParameter("OutputSafeAnswerSwitch", outputSafeAnswerSwitch);
            this.outputSafeAnswerSwitch = outputSafeAnswerSwitch;
            return this;
        }

        /**
         * <p>Detection policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicy</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Prompt attack detection result object</p>
         */
        public Builder promptAttackInfo(PromptAttackInfo promptAttackInfo) {
            String promptAttackInfoShrink = shrink(promptAttackInfo, "PromptAttackInfo", "json");
            this.putQueryParameter("PromptAttackInfo", promptAttackInfoShrink);
            this.promptAttackInfo = promptAttackInfo;
            return this;
        }

        /**
         * <p>List of prompt attacks</p>
         */
        public Builder promptAttackInfoList(java.util.List<PromptAttackInfoList> promptAttackInfoList) {
            String promptAttackInfoListShrink = shrink(promptAttackInfoList, "PromptAttackInfoList", "json");
            this.putQueryParameter("PromptAttackInfoList", promptAttackInfoListShrink);
            this.promptAttackInfoList = promptAttackInfoList;
            return this;
        }

        /**
         * PromptAttackModelInstanceId.
         */
        public Builder promptAttackModelInstanceId(Long promptAttackModelInstanceId) {
            this.putQueryParameter("PromptAttackModelInstanceId", promptAttackModelInstanceId);
            this.promptAttackModelInstanceId = promptAttackModelInstanceId;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegularExpressList.
         */
        public Builder regularExpressList(java.util.List<RegularExpressList> regularExpressList) {
            String regularExpressListShrink = shrink(regularExpressList, "RegularExpressList", "json");
            this.putQueryParameter("RegularExpressList", regularExpressListShrink);
            this.regularExpressList = regularExpressList;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(Integer sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * SensitiveConfigList.
         */
        public Builder sensitiveConfigList(java.util.List<SensitiveConfigList> sensitiveConfigList) {
            String sensitiveConfigListShrink = shrink(sensitiveConfigList, "SensitiveConfigList", "json");
            this.putQueryParameter("SensitiveConfigList", sensitiveConfigListShrink);
            this.sensitiveConfigList = sensitiveConfigList;
            return this;
        }

        /**
         * SensitiveTopicList.
         */
        public Builder sensitiveTopicList(java.util.List<SensitiveTopicList> sensitiveTopicList) {
            String sensitiveTopicListShrink = shrink(sensitiveTopicList, "SensitiveTopicList", "json");
            this.putQueryParameter("SensitiveTopicList", sensitiveTopicListShrink);
            this.sensitiveTopicList = sensitiveTopicList;
            return this;
        }

        /**
         * SensitiveTopicModelInstanceId.
         */
        public Builder sensitiveTopicModelInstanceId(Long sensitiveTopicModelInstanceId) {
            this.putQueryParameter("SensitiveTopicModelInstanceId", sensitiveTopicModelInstanceId);
            this.sensitiveTopicModelInstanceId = sensitiveTopicModelInstanceId;
            return this;
        }

        /**
         * SensitiveWordList.
         */
        public Builder sensitiveWordList(java.util.List<SensitiveWordList> sensitiveWordList) {
            String sensitiveWordListShrink = shrink(sensitiveWordList, "SensitiveWordList", "json");
            this.putQueryParameter("SensitiveWordList", sensitiveWordListShrink);
            this.sensitiveWordList = sensitiveWordList;
            return this;
        }

        /**
         * <p>List of sensitive topics</p>
         */
        public Builder topicConfigInfoList(java.util.List<TopicConfigInfoList> topicConfigInfoList) {
            String topicConfigInfoListShrink = shrink(topicConfigInfoList, "TopicConfigInfoList", "json");
            this.putQueryParameter("TopicConfigInfoList", topicConfigInfoListShrink);
            this.topicConfigInfoList = topicConfigInfoList;
            return this;
        }

        /**
         * <p>List of keyword group objects</p>
         */
        public Builder wordGroupInfoList(java.util.List<WordGroupInfoList> wordGroupInfoList) {
            String wordGroupInfoListShrink = shrink(wordGroupInfoList, "WordGroupInfoList", "json");
            this.putQueryParameter("WordGroupInfoList", wordGroupInfoListShrink);
            this.wordGroupInfoList = wordGroupInfoList;
            return this;
        }

        /**
         * <p>Workspace ID</p>
         * 
         * <strong>example:</strong>
         * <p>608226</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreatePolicyRequest build() {
            return new CreatePolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class HarmfulCategoryConfigInfoList extends TeaModel {
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

            private Builder(HarmfulCategoryConfigInfoList model) {
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
             * <p>Whether it is enabled
             * 0: Not enabled
             * 1: Enabled</p>
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

            public HarmfulCategoryConfigInfoList build() {
                return new HarmfulCategoryConfigInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class RegularExpressList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("RegularExpress")
        private String regularExpress;

        @com.aliyun.core.annotation.NameInMap("RegularExpressName")
        private String regularExpressName;

        private RegularExpressList(Builder builder) {
            this.actionType = builder.actionType;
            this.regularExpress = builder.regularExpress;
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
         * @return regularExpress
         */
        public String getRegularExpress() {
            return this.regularExpress;
        }

        /**
         * @return regularExpressName
         */
        public String getRegularExpressName() {
            return this.regularExpressName;
        }

        public static final class Builder {
            private Integer actionType; 
            private String regularExpress; 
            private String regularExpressName; 

            private Builder() {
            } 

            private Builder(RegularExpressList model) {
                this.actionType = model.actionType;
                this.regularExpress = model.regularExpress;
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
             * RegularExpress.
             */
            public Builder regularExpress(String regularExpress) {
                this.regularExpress = regularExpress;
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class SensitiveConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("IsEnabled")
        private Integer isEnabled;

        @com.aliyun.core.annotation.NameInMap("SensitiveConfigId")
        private Long sensitiveConfigId;

        private SensitiveConfigList(Builder builder) {
            this.actionType = builder.actionType;
            this.isEnabled = builder.isEnabled;
            this.sensitiveConfigId = builder.sensitiveConfigId;
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
         * @return isEnabled
         */
        public Integer getIsEnabled() {
            return this.isEnabled;
        }

        /**
         * @return sensitiveConfigId
         */
        public Long getSensitiveConfigId() {
            return this.sensitiveConfigId;
        }

        public static final class Builder {
            private Integer actionType; 
            private Integer isEnabled; 
            private Long sensitiveConfigId; 

            private Builder() {
            } 

            private Builder(SensitiveConfigList model) {
                this.actionType = model.actionType;
                this.isEnabled = model.isEnabled;
                this.sensitiveConfigId = model.sensitiveConfigId;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
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
             * SensitiveConfigId.
             */
            public Builder sensitiveConfigId(Long sensitiveConfigId) {
                this.sensitiveConfigId = sensitiveConfigId;
                return this;
            }

            public SensitiveConfigList build() {
                return new SensitiveConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class TopicExampleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ExampleType")
        private Integer exampleType;

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
        public Integer getExampleType() {
            return this.exampleType;
        }

        public static final class Builder {
            private String content; 
            private Integer exampleType; 

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
            public Builder exampleType(Integer exampleType) {
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class SensitiveTopicList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        @com.aliyun.core.annotation.NameInMap("TopicDefinition")
        private String topicDefinition;

        @com.aliyun.core.annotation.NameInMap("TopicExampleInfoList")
        private java.util.List<TopicExampleInfoList> topicExampleInfoList;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private SensitiveTopicList(Builder builder) {
            this.categoryType = builder.categoryType;
            this.securityLevel = builder.securityLevel;
            this.topicDefinition = builder.topicDefinition;
            this.topicExampleInfoList = builder.topicExampleInfoList;
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
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Integer categoryType; 
            private Integer securityLevel; 
            private String topicDefinition; 
            private java.util.List<TopicExampleInfoList> topicExampleInfoList; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(SensitiveTopicList model) {
                this.categoryType = model.categoryType;
                this.securityLevel = model.securityLevel;
                this.topicDefinition = model.topicDefinition;
                this.topicExampleInfoList = model.topicExampleInfoList;
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
     */
    public static class SensitiveWordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private SensitiveWordList(Builder builder) {
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
            private String label; 
            private String word; 

            private Builder() {
            } 

            private Builder(SensitiveWordList model) {
                this.label = model.label;
                this.word = model.word;
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
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
             * <p>4</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>Topic Name</p>
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
     * {@link CreatePolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePolicyRequest</p>
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
