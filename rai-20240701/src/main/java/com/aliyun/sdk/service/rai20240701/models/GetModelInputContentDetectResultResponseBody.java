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
 * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelInputContentDetectResultResponseBody</p>
 */
public class GetModelInputContentDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DetectResultList")
    private java.util.List<DetectResultList> detectResultList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProcessedCount")
    private Integer processedCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private Integer taskStatus;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetModelInputContentDetectResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.detectResultList = builder.detectResultList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.processedCount = builder.processedCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelInputContentDetectResultResponseBody create() {
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
     * @return detectResultList
     */
    public java.util.List<DetectResultList> getDetectResultList() {
        return this.detectResultList;
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
     * @return processedCount
     */
    public Integer getProcessedCount() {
        return this.processedCount;
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

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<DetectResultList> detectResultList; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer processedCount; 
        private String requestId; 
        private Boolean success; 
        private String taskId; 
        private Integer taskStatus; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetModelInputContentDetectResultResponseBody model) {
            this.code = model.code;
            this.detectResultList = model.detectResultList;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.processedCount = model.processedCount;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.totalCount = model.totalCount;
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
         * <p>Detection result object</p>
         */
        public Builder detectResultList(java.util.List<DetectResultList> detectResultList) {
            this.detectResultList = detectResultList;
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
         * <p>Number of processed items in the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder processedCount(Integer processedCount) {
            this.processedCount = processedCount;
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
         * <p>Indicates whether the operation was successful. true means success, false means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5d85cd38-03b2-49fd-86b2-be85c4b13215</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Task processing status:
         * 0: Queued
         * 1: Processing
         * 2: Completed
         * 3: Failed</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder taskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetModelInputContentDetectResultResponseBody build() {
            return new GetModelInputContentDetectResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>Word</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>Keyword detection result object list</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>Keyword detection result object list</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>1</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>ConfidenceScore</p>
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
             * <p>List of sensitive topics</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>0</p>
             */
            public Builder securityLevel(Integer securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * <p>Sub-category label</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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
             * <p>Prompt attack list</p>
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
             * <p>0</p>
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
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
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

        private TraceInfo(Builder builder) {
            this.blockWord = builder.blockWord;
            this.denyTopics = builder.denyTopics;
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

        public static final class Builder {
            private BlockWord blockWord; 
            private DenyTopics denyTopics; 
            private HarmfulCategories harmfulCategories; 
            private PromptAttack promptAttack; 

            private Builder() {
            } 

            private Builder(TraceInfo model) {
                this.blockWord = model.blockWord;
                this.denyTopics = model.denyTopics;
                this.harmfulCategories = model.harmfulCategories;
                this.promptAttack = model.promptAttack;
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
             * <p>List of harmful category result objects</p>
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

            public TraceInfo build() {
                return new TraceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelInputContentDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelInputContentDetectResultResponseBody</p>
     */
    public static class DetectResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskResult")
        private Integer riskResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TraceInfo")
        private TraceInfo traceInfo;

        private DetectResultList(Builder builder) {
            this.riskResult = builder.riskResult;
            this.status = builder.status;
            this.traceInfo = builder.traceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectResultList create() {
            return builder().build();
        }

        /**
         * @return riskResult
         */
        public Integer getRiskResult() {
            return this.riskResult;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return traceInfo
         */
        public TraceInfo getTraceInfo() {
            return this.traceInfo;
        }

        public static final class Builder {
            private Integer riskResult; 
            private Integer status; 
            private TraceInfo traceInfo; 

            private Builder() {
            } 

            private Builder(DetectResultList model) {
                this.riskResult = model.riskResult;
                this.status = model.status;
                this.traceInfo = model.traceInfo;
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
             * <p>0: Queued
             * 1: Processing
             * 2: Completed
             * 3: Failed</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Inspection result</p>
             */
            public Builder traceInfo(TraceInfo traceInfo) {
                this.traceInfo = traceInfo;
                return this;
            }

            public DetectResultList build() {
                return new DetectResultList(this);
            } 

        } 

    }
}
