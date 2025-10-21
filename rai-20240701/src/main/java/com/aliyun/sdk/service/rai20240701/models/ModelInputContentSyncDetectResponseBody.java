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
 * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
 *
 * <p>ModelInputContentSyncDetectResponseBody</p>
 */
public class ModelInputContentSyncDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskResult")
    private Integer riskResult;

    @com.aliyun.core.annotation.NameInMap("SafeAnswer")
    private String safeAnswer;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceInfo")
    private TraceInfo traceInfo;

    private ModelInputContentSyncDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.riskResult = builder.riskResult;
        this.safeAnswer = builder.safeAnswer;
        this.success = builder.success;
        this.traceInfo = builder.traceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelInputContentSyncDetectResponseBody create() {
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
     * @return riskResult
     */
    public Integer getRiskResult() {
        return this.riskResult;
    }

    /**
     * @return safeAnswer
     */
    public String getSafeAnswer() {
        return this.safeAnswer;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceInfo
     */
    public TraceInfo getTraceInfo() {
        return this.traceInfo;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Integer riskResult; 
        private String safeAnswer; 
        private Boolean success; 
        private TraceInfo traceInfo; 

        private Builder() {
        } 

        private Builder(ModelInputContentSyncDetectResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.riskResult = model.riskResult;
            this.safeAnswer = model.safeAnswer;
            this.success = model.success;
            this.traceInfo = model.traceInfo;
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
         * <p>0: No risk
         * 1: Risk exists</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder riskResult(Integer riskResult) {
            this.riskResult = riskResult;
            return this;
        }

        /**
         * SafeAnswer.
         */
        public Builder safeAnswer(String safeAnswer) {
            this.safeAnswer = safeAnswer;
            return this;
        }

        /**
         * <p>Whether the operation was successful. true indicates success, false indicates failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Inspection result</p>
         */
        public Builder traceInfo(TraceInfo traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }

        public ModelInputContentSyncDetectResponseBody build() {
            return new ModelInputContentSyncDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class BlockWordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        @com.aliyun.core.annotation.NameInMap("WordLabel")
        private String wordLabel;

        private BlockWordList(Builder builder) {
            this.word = builder.word;
            this.wordLabel = builder.wordLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockWordList create() {
            return builder().build();
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        /**
         * @return wordLabel
         */
        public String getWordLabel() {
            return this.wordLabel;
        }

        public static final class Builder {
            private String word; 
            private String wordLabel; 

            private Builder() {
            } 

            private Builder(BlockWordList model) {
                this.word = model.word;
                this.wordLabel = model.wordLabel;
            } 

            /**
             * <p>Keyword</p>
             * 
             * <strong>example:</strong>
             * <p>testWord</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            /**
             * <p>Label</p>
             * 
             * <strong>example:</strong>
             * <p>testLabel</p>
             */
            public Builder wordLabel(String wordLabel) {
                this.wordLabel = wordLabel;
                return this;
            }

            public BlockWordList build() {
                return new BlockWordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class BlockWordGroupInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockWordList")
        private java.util.List<BlockWordList> blockWordList;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private BlockWordGroupInfoList(Builder builder) {
            this.blockWordList = builder.blockWordList;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockWordGroupInfoList create() {
            return builder().build();
        }

        /**
         * @return blockWordList
         */
        public java.util.List<BlockWordList> getBlockWordList() {
            return this.blockWordList;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private java.util.List<BlockWordList> blockWordList; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(BlockWordGroupInfoList model) {
                this.blockWordList = model.blockWordList;
                this.groupName = model.groupName;
            } 

            /**
             * <p>List of keyword detection results</p>
             */
            public Builder blockWordList(java.util.List<BlockWordList> blockWordList) {
                this.blockWordList = blockWordList;
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

            public BlockWordGroupInfoList build() {
                return new BlockWordGroupInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class BlockWord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockWordGroupInfoList")
        private java.util.List<BlockWordGroupInfoList> blockWordGroupInfoList;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        private BlockWord(Builder builder) {
            this.blockWordGroupInfoList = builder.blockWordGroupInfoList;
            this.riskResult = builder.riskResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockWord create() {
            return builder().build();
        }

        /**
         * @return blockWordGroupInfoList
         */
        public java.util.List<BlockWordGroupInfoList> getBlockWordGroupInfoList() {
            return this.blockWordGroupInfoList;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public static final class Builder {
            private java.util.List<BlockWordGroupInfoList> blockWordGroupInfoList; 
            private Integer riskResult; 

            private Builder() {
            } 

            private Builder(BlockWord model) {
                this.blockWordGroupInfoList = model.blockWordGroupInfoList;
                this.riskResult = model.riskResult;
            } 

            /**
             * <p>List of keyword detection result objects</p>
             */
            public Builder blockWordGroupInfoList(java.util.List<BlockWordGroupInfoList> blockWordGroupInfoList) {
                this.blockWordGroupInfoList = blockWordGroupInfoList;
                return this;
            }

            /**
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            public BlockWord build() {
                return new BlockWord(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class TopicInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private TopicInfoList(Builder builder) {
            this.categoryType = builder.categoryType;
            this.riskResult = builder.riskResult;
            this.securityLevel = builder.securityLevel;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopicInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Integer categoryType; 
            private Integer riskResult; 
            private Integer securityLevel; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(TopicInfoList model) {
                this.categoryType = model.categoryType;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
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
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
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
             * <p>Topic name</p>
             * 
             * <strong>example:</strong>
             * <p>Buss.</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public TopicInfoList build() {
                return new TopicInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class DenyTopics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidenceScore")
        private Double confidenceScore;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("TopicInfoList")
        private java.util.List<TopicInfoList> topicInfoList;

        private DenyTopics(Builder builder) {
            this.confidenceScore = builder.confidenceScore;
            this.riskResult = builder.riskResult;
            this.topicInfoList = builder.topicInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DenyTopics create() {
            return builder().build();
        }

        /**
         * @return confidenceScore
         */
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return topicInfoList
         */
        public java.util.List<TopicInfoList> getTopicInfoList() {
            return this.topicInfoList;
        }

        public static final class Builder {
            private Double confidenceScore; 
            private Integer riskResult; 
            private java.util.List<TopicInfoList> topicInfoList; 

            private Builder() {
            } 

            private Builder(DenyTopics model) {
                this.confidenceScore = model.confidenceScore;
                this.riskResult = model.riskResult;
                this.topicInfoList = model.topicInfoList;
            } 

            /**
             * <p>Confidence score</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder confidenceScore(Double confidenceScore) {
                this.confidenceScore = confidenceScore;
                return this;
            }

            /**
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            /**
             * <p>Sensitive topic list</p>
             */
            public Builder topicInfoList(java.util.List<TopicInfoList> topicInfoList) {
                this.topicInfoList = topicInfoList;
                return this;
            }

            public DenyTopics build() {
                return new DenyTopics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class HarmfulCategoryInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        @com.aliyun.core.annotation.NameInMap("SubCategoryLabel")
        private String subCategoryLabel;

        private HarmfulCategoryInfoList(Builder builder) {
            this.categoryLabel = builder.categoryLabel;
            this.categoryType = builder.categoryType;
            this.riskResult = builder.riskResult;
            this.securityLevel = builder.securityLevel;
            this.subCategoryLabel = builder.subCategoryLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HarmfulCategoryInfoList create() {
            return builder().build();
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
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return subCategoryLabel
         */
        public String getSubCategoryLabel() {
            return this.subCategoryLabel;
        }

        public static final class Builder {
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer riskResult; 
            private Integer securityLevel; 
            private String subCategoryLabel; 

            private Builder() {
            } 

            private Builder(HarmfulCategoryInfoList model) {
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
                this.subCategoryLabel = model.subCategoryLabel;
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
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
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
             * <p>Subcategory label</p>
             * 
             * <strong>example:</strong>
             * <p>morality_ethics</p>
             */
            public Builder subCategoryLabel(String subCategoryLabel) {
                this.subCategoryLabel = subCategoryLabel;
                return this;
            }

            public HarmfulCategoryInfoList build() {
                return new HarmfulCategoryInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class HarmfulCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidenceScore")
        private Double confidenceScore;

        @com.aliyun.core.annotation.NameInMap("HarmfulCategoryInfoList")
        private java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        private HarmfulCategories(Builder builder) {
            this.confidenceScore = builder.confidenceScore;
            this.harmfulCategoryInfoList = builder.harmfulCategoryInfoList;
            this.riskResult = builder.riskResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HarmfulCategories create() {
            return builder().build();
        }

        /**
         * @return confidenceScore
         */
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        /**
         * @return harmfulCategoryInfoList
         */
        public java.util.List<HarmfulCategoryInfoList> getHarmfulCategoryInfoList() {
            return this.harmfulCategoryInfoList;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        public static final class Builder {
            private Double confidenceScore; 
            private java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList; 
            private Integer riskResult; 

            private Builder() {
            } 

            private Builder(HarmfulCategories model) {
                this.confidenceScore = model.confidenceScore;
                this.harmfulCategoryInfoList = model.harmfulCategoryInfoList;
                this.riskResult = model.riskResult;
            } 

            /**
             * <p>Confidence score</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder confidenceScore(Double confidenceScore) {
                this.confidenceScore = confidenceScore;
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
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            public HarmfulCategories build() {
                return new HarmfulCategories(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class PromptAttackInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryLabel")
        private String categoryLabel;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private Integer categoryType;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttackInfoList(Builder builder) {
            this.categoryLabel = builder.categoryLabel;
            this.categoryType = builder.categoryType;
            this.riskResult = builder.riskResult;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttackInfoList create() {
            return builder().build();
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
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer riskResult; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttackInfoList model) {
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
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
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
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
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class PromptAttack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfidenceScore")
        private Double confidenceScore;

        @com.aliyun.core.annotation.NameInMap("PromptAttackInfo")
        private String promptAttackInfo;

        @com.aliyun.core.annotation.NameInMap("PromptAttackInfoList")
        private java.util.List<PromptAttackInfoList> promptAttackInfoList;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttack(Builder builder) {
            this.confidenceScore = builder.confidenceScore;
            this.promptAttackInfo = builder.promptAttackInfo;
            this.promptAttackInfoList = builder.promptAttackInfoList;
            this.riskResult = builder.riskResult;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromptAttack create() {
            return builder().build();
        }

        /**
         * @return confidenceScore
         */
        public Double getConfidenceScore() {
            return this.confidenceScore;
        }

        /**
         * @return promptAttackInfo
         */
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
        }

        /**
         * @return promptAttackInfoList
         */
        public java.util.List<PromptAttackInfoList> getPromptAttackInfoList() {
            return this.promptAttackInfoList;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return securityLevel
         */
        public Integer getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private Double confidenceScore; 
            private String promptAttackInfo; 
            private java.util.List<PromptAttackInfoList> promptAttackInfoList; 
            private Integer riskResult; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttack model) {
                this.confidenceScore = model.confidenceScore;
                this.promptAttackInfo = model.promptAttackInfo;
                this.promptAttackInfoList = model.promptAttackInfoList;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * <p>Confidence score</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder confidenceScore(Double confidenceScore) {
                this.confidenceScore = confidenceScore;
                return this;
            }

            /**
             * <p>Prompt attack detection result object</p>
             * 
             * <strong>example:</strong>
             * <p>Role Play</p>
             */
            public Builder promptAttackInfo(String promptAttackInfo) {
                this.promptAttackInfo = promptAttackInfo;
                return this;
            }

            /**
             * <p>List of prompt attack objects</p>
             */
            public Builder promptAttackInfoList(java.util.List<PromptAttackInfoList> promptAttackInfoList) {
                this.promptAttackInfoList = promptAttackInfoList;
                return this;
            }

            /**
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
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

            public PromptAttack build() {
                return new PromptAttack(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class SensitiveTypeInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private Integer actionType;

        @com.aliyun.core.annotation.NameInMap("MaskedContent")
        private String maskedContent;

        @com.aliyun.core.annotation.NameInMap("SensitiveCategory")
        private Integer sensitiveCategory;

        @com.aliyun.core.annotation.NameInMap("SensitiveContent")
        private String sensitiveContent;

        @com.aliyun.core.annotation.NameInMap("SensitiveTypeName")
        private String sensitiveTypeName;

        private SensitiveTypeInfoList(Builder builder) {
            this.actionType = builder.actionType;
            this.maskedContent = builder.maskedContent;
            this.sensitiveCategory = builder.sensitiveCategory;
            this.sensitiveContent = builder.sensitiveContent;
            this.sensitiveTypeName = builder.sensitiveTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveTypeInfoList create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public Integer getActionType() {
            return this.actionType;
        }

        /**
         * @return maskedContent
         */
        public String getMaskedContent() {
            return this.maskedContent;
        }

        /**
         * @return sensitiveCategory
         */
        public Integer getSensitiveCategory() {
            return this.sensitiveCategory;
        }

        /**
         * @return sensitiveContent
         */
        public String getSensitiveContent() {
            return this.sensitiveContent;
        }

        /**
         * @return sensitiveTypeName
         */
        public String getSensitiveTypeName() {
            return this.sensitiveTypeName;
        }

        public static final class Builder {
            private Integer actionType; 
            private String maskedContent; 
            private Integer sensitiveCategory; 
            private String sensitiveContent; 
            private String sensitiveTypeName; 

            private Builder() {
            } 

            private Builder(SensitiveTypeInfoList model) {
                this.actionType = model.actionType;
                this.maskedContent = model.maskedContent;
                this.sensitiveCategory = model.sensitiveCategory;
                this.sensitiveContent = model.sensitiveContent;
                this.sensitiveTypeName = model.sensitiveTypeName;
            } 

            /**
             * ActionType.
             */
            public Builder actionType(Integer actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * MaskedContent.
             */
            public Builder maskedContent(String maskedContent) {
                this.maskedContent = maskedContent;
                return this;
            }

            /**
             * SensitiveCategory.
             */
            public Builder sensitiveCategory(Integer sensitiveCategory) {
                this.sensitiveCategory = sensitiveCategory;
                return this;
            }

            /**
             * SensitiveContent.
             */
            public Builder sensitiveContent(String sensitiveContent) {
                this.sensitiveContent = sensitiveContent;
                return this;
            }

            /**
             * SensitiveTypeName.
             */
            public Builder sensitiveTypeName(String sensitiveTypeName) {
                this.sensitiveTypeName = sensitiveTypeName;
                return this;
            }

            public SensitiveTypeInfoList build() {
                return new SensitiveTypeInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class SensitiveType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaskedContent")
        private String maskedContent;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SensitiveTypeInfoList")
        private java.util.List<SensitiveTypeInfoList> sensitiveTypeInfoList;

        private SensitiveType(Builder builder) {
            this.maskedContent = builder.maskedContent;
            this.riskResult = builder.riskResult;
            this.sensitiveTypeInfoList = builder.sensitiveTypeInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveType create() {
            return builder().build();
        }

        /**
         * @return maskedContent
         */
        public String getMaskedContent() {
            return this.maskedContent;
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return sensitiveTypeInfoList
         */
        public java.util.List<SensitiveTypeInfoList> getSensitiveTypeInfoList() {
            return this.sensitiveTypeInfoList;
        }

        public static final class Builder {
            private String maskedContent; 
            private Integer riskResult; 
            private java.util.List<SensitiveTypeInfoList> sensitiveTypeInfoList; 

            private Builder() {
            } 

            private Builder(SensitiveType model) {
                this.maskedContent = model.maskedContent;
                this.riskResult = model.riskResult;
                this.sensitiveTypeInfoList = model.sensitiveTypeInfoList;
            } 

            /**
             * MaskedContent.
             */
            public Builder maskedContent(String maskedContent) {
                this.maskedContent = maskedContent;
                return this;
            }

            /**
             * <p>0: No risk
             * 1: Risk exists</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            /**
             * SensitiveTypeInfoList.
             */
            public Builder sensitiveTypeInfoList(java.util.List<SensitiveTypeInfoList> sensitiveTypeInfoList) {
                this.sensitiveTypeInfoList = sensitiveTypeInfoList;
                return this;
            }

            public SensitiveType build() {
                return new SensitiveType(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelInputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelInputContentSyncDetectResponseBody</p>
     */
    public static class TraceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockWord")
        private BlockWord blockWord;

        @com.aliyun.core.annotation.NameInMap("DenyTopics")
        private DenyTopics denyTopics;

        @com.aliyun.core.annotation.NameInMap("HarmfulCategories")
        private HarmfulCategories harmfulCategories;

        @com.aliyun.core.annotation.NameInMap("PromptAttack")
        private PromptAttack promptAttack;

        @com.aliyun.core.annotation.NameInMap("SensitiveType")
        private SensitiveType sensitiveType;

        private TraceInfo(Builder builder) {
            this.blockWord = builder.blockWord;
            this.denyTopics = builder.denyTopics;
            this.harmfulCategories = builder.harmfulCategories;
            this.promptAttack = builder.promptAttack;
            this.sensitiveType = builder.sensitiveType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceInfo create() {
            return builder().build();
        }

        /**
         * @return blockWord
         */
        public BlockWord getBlockWord() {
            return this.blockWord;
        }

        /**
         * @return denyTopics
         */
        public DenyTopics getDenyTopics() {
            return this.denyTopics;
        }

        /**
         * @return harmfulCategories
         */
        public HarmfulCategories getHarmfulCategories() {
            return this.harmfulCategories;
        }

        /**
         * @return promptAttack
         */
        public PromptAttack getPromptAttack() {
            return this.promptAttack;
        }

        /**
         * @return sensitiveType
         */
        public SensitiveType getSensitiveType() {
            return this.sensitiveType;
        }

        public static final class Builder {
            private BlockWord blockWord; 
            private DenyTopics denyTopics; 
            private HarmfulCategories harmfulCategories; 
            private PromptAttack promptAttack; 
            private SensitiveType sensitiveType; 

            private Builder() {
            } 

            private Builder(TraceInfo model) {
                this.blockWord = model.blockWord;
                this.denyTopics = model.denyTopics;
                this.harmfulCategories = model.harmfulCategories;
                this.promptAttack = model.promptAttack;
                this.sensitiveType = model.sensitiveType;
            } 

            /**
             * <p>Detected keywords</p>
             */
            public Builder blockWord(BlockWord blockWord) {
                this.blockWord = blockWord;
                return this;
            }

            /**
             * <p>Sensitive topic object list</p>
             */
            public Builder denyTopics(DenyTopics denyTopics) {
                this.denyTopics = denyTopics;
                return this;
            }

            /**
             * <p>HarmfulCategories</p>
             */
            public Builder harmfulCategories(HarmfulCategories harmfulCategories) {
                this.harmfulCategories = harmfulCategories;
                return this;
            }

            /**
             * <p>Prompt attack information</p>
             */
            public Builder promptAttack(PromptAttack promptAttack) {
                this.promptAttack = promptAttack;
                return this;
            }

            /**
             * SensitiveType.
             */
            public Builder sensitiveType(SensitiveType sensitiveType) {
                this.sensitiveType = sensitiveType;
                return this;
            }

            public TraceInfo build() {
                return new TraceInfo(this);
            } 

        } 

    }
}
