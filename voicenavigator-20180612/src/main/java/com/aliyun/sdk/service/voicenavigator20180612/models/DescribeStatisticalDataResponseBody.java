// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticalDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStatisticalDataResponseBody</p>
 */
public class DescribeStatisticalDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConversationTotalNum")
    private Long conversationTotalNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResolvedQuestionTotalNum")
    private Long resolvedQuestionTotalNum;

    @com.aliyun.core.annotation.NameInMap("StatisticalDataReports")
    private java.util.List < StatisticalDataReports> statisticalDataReports;

    @com.aliyun.core.annotation.NameInMap("TotalDialoguePassRate")
    private String totalDialoguePassRate;

    @com.aliyun.core.annotation.NameInMap("TotalKnowledgeHitRate")
    private String totalKnowledgeHitRate;

    @com.aliyun.core.annotation.NameInMap("TotalResolutionRate")
    private String totalResolutionRate;

    @com.aliyun.core.annotation.NameInMap("TotalValidAnswerRate")
    private String totalValidAnswerRate;

    private DescribeStatisticalDataResponseBody(Builder builder) {
        this.conversationTotalNum = builder.conversationTotalNum;
        this.requestId = builder.requestId;
        this.resolvedQuestionTotalNum = builder.resolvedQuestionTotalNum;
        this.statisticalDataReports = builder.statisticalDataReports;
        this.totalDialoguePassRate = builder.totalDialoguePassRate;
        this.totalKnowledgeHitRate = builder.totalKnowledgeHitRate;
        this.totalResolutionRate = builder.totalResolutionRate;
        this.totalValidAnswerRate = builder.totalValidAnswerRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatisticalDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return conversationTotalNum
     */
    public Long getConversationTotalNum() {
        return this.conversationTotalNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resolvedQuestionTotalNum
     */
    public Long getResolvedQuestionTotalNum() {
        return this.resolvedQuestionTotalNum;
    }

    /**
     * @return statisticalDataReports
     */
    public java.util.List < StatisticalDataReports> getStatisticalDataReports() {
        return this.statisticalDataReports;
    }

    /**
     * @return totalDialoguePassRate
     */
    public String getTotalDialoguePassRate() {
        return this.totalDialoguePassRate;
    }

    /**
     * @return totalKnowledgeHitRate
     */
    public String getTotalKnowledgeHitRate() {
        return this.totalKnowledgeHitRate;
    }

    /**
     * @return totalResolutionRate
     */
    public String getTotalResolutionRate() {
        return this.totalResolutionRate;
    }

    /**
     * @return totalValidAnswerRate
     */
    public String getTotalValidAnswerRate() {
        return this.totalValidAnswerRate;
    }

    public static final class Builder {
        private Long conversationTotalNum; 
        private String requestId; 
        private Long resolvedQuestionTotalNum; 
        private java.util.List < StatisticalDataReports> statisticalDataReports; 
        private String totalDialoguePassRate; 
        private String totalKnowledgeHitRate; 
        private String totalResolutionRate; 
        private String totalValidAnswerRate; 

        /**
         * ConversationTotalNum.
         */
        public Builder conversationTotalNum(Long conversationTotalNum) {
            this.conversationTotalNum = conversationTotalNum;
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
         * ResolvedQuestionTotalNum.
         */
        public Builder resolvedQuestionTotalNum(Long resolvedQuestionTotalNum) {
            this.resolvedQuestionTotalNum = resolvedQuestionTotalNum;
            return this;
        }

        /**
         * StatisticalDataReports.
         */
        public Builder statisticalDataReports(java.util.List < StatisticalDataReports> statisticalDataReports) {
            this.statisticalDataReports = statisticalDataReports;
            return this;
        }

        /**
         * TotalDialoguePassRate.
         */
        public Builder totalDialoguePassRate(String totalDialoguePassRate) {
            this.totalDialoguePassRate = totalDialoguePassRate;
            return this;
        }

        /**
         * TotalKnowledgeHitRate.
         */
        public Builder totalKnowledgeHitRate(String totalKnowledgeHitRate) {
            this.totalKnowledgeHitRate = totalKnowledgeHitRate;
            return this;
        }

        /**
         * TotalResolutionRate.
         */
        public Builder totalResolutionRate(String totalResolutionRate) {
            this.totalResolutionRate = totalResolutionRate;
            return this;
        }

        /**
         * TotalValidAnswerRate.
         */
        public Builder totalValidAnswerRate(String totalValidAnswerRate) {
            this.totalValidAnswerRate = totalValidAnswerRate;
            return this;
        }

        public DescribeStatisticalDataResponseBody build() {
            return new DescribeStatisticalDataResponseBody(this);
        } 

    } 

    public static class StatisticalDataReports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialoguePassRate")
        private String dialoguePassRate;

        @com.aliyun.core.annotation.NameInMap("KnowledgeHitRate")
        private String knowledgeHitRate;

        @com.aliyun.core.annotation.NameInMap("ResolutionRate")
        private String resolutionRate;

        @com.aliyun.core.annotation.NameInMap("ResolvedQuestionNum")
        private Integer resolvedQuestionNum;

        @com.aliyun.core.annotation.NameInMap("StatisticalDate")
        private String statisticalDate;

        @com.aliyun.core.annotation.NameInMap("TotalConversationNum")
        private Integer totalConversationNum;

        @com.aliyun.core.annotation.NameInMap("ValidAnswerRate")
        private String validAnswerRate;

        private StatisticalDataReports(Builder builder) {
            this.dialoguePassRate = builder.dialoguePassRate;
            this.knowledgeHitRate = builder.knowledgeHitRate;
            this.resolutionRate = builder.resolutionRate;
            this.resolvedQuestionNum = builder.resolvedQuestionNum;
            this.statisticalDate = builder.statisticalDate;
            this.totalConversationNum = builder.totalConversationNum;
            this.validAnswerRate = builder.validAnswerRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticalDataReports create() {
            return builder().build();
        }

        /**
         * @return dialoguePassRate
         */
        public String getDialoguePassRate() {
            return this.dialoguePassRate;
        }

        /**
         * @return knowledgeHitRate
         */
        public String getKnowledgeHitRate() {
            return this.knowledgeHitRate;
        }

        /**
         * @return resolutionRate
         */
        public String getResolutionRate() {
            return this.resolutionRate;
        }

        /**
         * @return resolvedQuestionNum
         */
        public Integer getResolvedQuestionNum() {
            return this.resolvedQuestionNum;
        }

        /**
         * @return statisticalDate
         */
        public String getStatisticalDate() {
            return this.statisticalDate;
        }

        /**
         * @return totalConversationNum
         */
        public Integer getTotalConversationNum() {
            return this.totalConversationNum;
        }

        /**
         * @return validAnswerRate
         */
        public String getValidAnswerRate() {
            return this.validAnswerRate;
        }

        public static final class Builder {
            private String dialoguePassRate; 
            private String knowledgeHitRate; 
            private String resolutionRate; 
            private Integer resolvedQuestionNum; 
            private String statisticalDate; 
            private Integer totalConversationNum; 
            private String validAnswerRate; 

            /**
             * DialoguePassRate.
             */
            public Builder dialoguePassRate(String dialoguePassRate) {
                this.dialoguePassRate = dialoguePassRate;
                return this;
            }

            /**
             * KnowledgeHitRate.
             */
            public Builder knowledgeHitRate(String knowledgeHitRate) {
                this.knowledgeHitRate = knowledgeHitRate;
                return this;
            }

            /**
             * ResolutionRate.
             */
            public Builder resolutionRate(String resolutionRate) {
                this.resolutionRate = resolutionRate;
                return this;
            }

            /**
             * ResolvedQuestionNum.
             */
            public Builder resolvedQuestionNum(Integer resolvedQuestionNum) {
                this.resolvedQuestionNum = resolvedQuestionNum;
                return this;
            }

            /**
             * StatisticalDate.
             */
            public Builder statisticalDate(String statisticalDate) {
                this.statisticalDate = statisticalDate;
                return this;
            }

            /**
             * TotalConversationNum.
             */
            public Builder totalConversationNum(Integer totalConversationNum) {
                this.totalConversationNum = totalConversationNum;
                return this;
            }

            /**
             * ValidAnswerRate.
             */
            public Builder validAnswerRate(String validAnswerRate) {
                this.validAnswerRate = validAnswerRate;
                return this;
            }

            public StatisticalDataReports build() {
                return new StatisticalDataReports(this);
            } 

        } 

    }
}
