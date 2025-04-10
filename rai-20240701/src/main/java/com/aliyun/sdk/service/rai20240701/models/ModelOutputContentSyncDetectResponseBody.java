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
 * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
 *
 * <p>ModelOutputContentSyncDetectResponseBody</p>
 */
public class ModelOutputContentSyncDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskInfo")
    private String riskInfo;

    @com.aliyun.core.annotation.NameInMap("RiskResult")
    private Integer riskResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceInfo")
    private TraceInfo traceInfo;

    private ModelOutputContentSyncDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.riskInfo = builder.riskInfo;
        this.riskResult = builder.riskResult;
        this.success = builder.success;
        this.traceInfo = builder.traceInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelOutputContentSyncDetectResponseBody create() {
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
     * @return riskInfo
     */
    public String getRiskInfo() {
        return this.riskInfo;
    }

    /**
     * @return riskResult
     */
    public Integer getRiskResult() {
        return this.riskResult;
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
        private String riskInfo; 
        private Integer riskResult; 
        private Boolean success; 
        private TraceInfo traceInfo; 

        private Builder() {
        } 

        private Builder(ModelOutputContentSyncDetectResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.riskInfo = model.riskInfo;
            this.riskResult = model.riskResult;
            this.success = model.success;
            this.traceInfo = model.traceInfo;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RiskInfo.
         */
        public Builder riskInfo(String riskInfo) {
            this.riskInfo = riskInfo;
            return this;
        }

        /**
         * RiskResult.
         */
        public Builder riskResult(Integer riskResult) {
            this.riskResult = riskResult;
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
         * TraceInfo.
         */
        public Builder traceInfo(TraceInfo traceInfo) {
            this.traceInfo = traceInfo;
            return this;
        }

        public ModelOutputContentSyncDetectResponseBody build() {
            return new ModelOutputContentSyncDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
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
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            /**
             * WordLabel.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
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
             * BlockWordList.
             */
            public Builder blockWordList(java.util.List<BlockWordList> blockWordList) {
                this.blockWordList = blockWordList;
                return this;
            }

            /**
             * GroupName.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
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
             * BlockWordGroupInfoList.
             */
            public Builder blockWordGroupInfoList(java.util.List<BlockWordGroupInfoList> blockWordGroupInfoList) {
                this.blockWordGroupInfoList = blockWordGroupInfoList;
                return this;
            }

            /**
             * RiskResult.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
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

        private HarmfulCategoryInfoList(Builder builder) {
            this.categoryLabel = builder.categoryLabel;
            this.categoryType = builder.categoryType;
            this.riskResult = builder.riskResult;
            this.securityLevel = builder.securityLevel;
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

        public static final class Builder {
            private String categoryLabel; 
            private Integer categoryType; 
            private Integer riskResult; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(HarmfulCategoryInfoList model) {
                this.categoryLabel = model.categoryLabel;
                this.categoryType = model.categoryType;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * CategoryLabel.
             */
            public Builder categoryLabel(String categoryLabel) {
                this.categoryLabel = categoryLabel;
                return this;
            }

            /**
             * CategoryType.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * RiskResult.
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            /**
             * SecurityLevel.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
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
             * ConfidenceScore.
             */
            public Builder confidenceScore(Double confidenceScore) {
                this.confidenceScore = confidenceScore;
                return this;
            }

            /**
             * HarmfulCategoryInfoList.
             */
            public Builder harmfulCategoryInfoList(java.util.List<HarmfulCategoryInfoList> harmfulCategoryInfoList) {
                this.harmfulCategoryInfoList = harmfulCategoryInfoList;
                return this;
            }

            /**
             * RiskResult.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
     */
    public static class PromptAttack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PromptAttackInfo")
        private String promptAttackInfo;

        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private Integer securityLevel;

        private PromptAttack(Builder builder) {
            this.promptAttackInfo = builder.promptAttackInfo;
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
         * @return promptAttackInfo
         */
        public String getPromptAttackInfo() {
            return this.promptAttackInfo;
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
            private String promptAttackInfo; 
            private Integer riskResult; 
            private Integer securityLevel; 

            private Builder() {
            } 

            private Builder(PromptAttack model) {
                this.promptAttackInfo = model.promptAttackInfo;
                this.riskResult = model.riskResult;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * PromptAttackInfo.
             */
            public Builder promptAttackInfo(String promptAttackInfo) {
                this.promptAttackInfo = promptAttackInfo;
                return this;
            }

            /**
             * RiskResult.
             */
            public Builder riskResult(Integer riskResult) {
                this.riskResult = riskResult;
                return this;
            }

            /**
             * SecurityLevel.
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
     * {@link ModelOutputContentSyncDetectResponseBody} extends {@link TeaModel}
     *
     * <p>ModelOutputContentSyncDetectResponseBody</p>
     */
    public static class TraceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockWord")
        private BlockWord blockWord;

        @com.aliyun.core.annotation.NameInMap("HarmfulCategories")
        private HarmfulCategories harmfulCategories;

        @com.aliyun.core.annotation.NameInMap("PromptAttack")
        private PromptAttack promptAttack;

        private TraceInfo(Builder builder) {
            this.blockWord = builder.blockWord;
            this.harmfulCategories = builder.harmfulCategories;
            this.promptAttack = builder.promptAttack;
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

        public static final class Builder {
            private BlockWord blockWord; 
            private HarmfulCategories harmfulCategories; 
            private PromptAttack promptAttack; 

            private Builder() {
            } 

            private Builder(TraceInfo model) {
                this.blockWord = model.blockWord;
                this.harmfulCategories = model.harmfulCategories;
                this.promptAttack = model.promptAttack;
            } 

            /**
             * BlockWord.
             */
            public Builder blockWord(BlockWord blockWord) {
                this.blockWord = blockWord;
                return this;
            }

            /**
             * HarmfulCategories.
             */
            public Builder harmfulCategories(HarmfulCategories harmfulCategories) {
                this.harmfulCategories = harmfulCategories;
                return this;
            }

            /**
             * PromptAttack.
             */
            public Builder promptAttack(PromptAttack promptAttack) {
                this.promptAttack = promptAttack;
                return this;
            }

            public TraceInfo build() {
                return new TraceInfo(this);
            } 

        } 

    }
}
