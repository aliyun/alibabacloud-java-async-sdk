// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link QueryConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryConversationsResponseBody</p>
 */
public class QueryConversationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Conversations")
    private java.util.List<Conversations> conversations;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryConversationsResponseBody(Builder builder) {
        this.conversations = builder.conversations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConversationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversations
     */
    public java.util.List<Conversations> getConversations() {
        return this.conversations;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Conversations> conversations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(QueryConversationsResponseBody model) {
            this.conversations = model.conversations;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The conversation list.</p>
         */
        public Builder conversations(java.util.List<Conversations> conversations) {
            this.conversations = conversations;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count of conversation records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryConversationsResponseBody build() {
            return new QueryConversationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryConversationsResponseBody</p>
     */
    public static class Conversations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("EffectiveAnswerCount")
        private Integer effectiveAnswerCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("TransferredToAgent")
        private Boolean transferredToAgent;

        @com.aliyun.core.annotation.NameInMap("UserUtteranceCount")
        private Integer userUtteranceCount;

        private Conversations(Builder builder) {
            this.beginTime = builder.beginTime;
            this.callingNumber = builder.callingNumber;
            this.conversationId = builder.conversationId;
            this.effectiveAnswerCount = builder.effectiveAnswerCount;
            this.endTime = builder.endTime;
            this.skillGroupId = builder.skillGroupId;
            this.transferredToAgent = builder.transferredToAgent;
            this.userUtteranceCount = builder.userUtteranceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversations create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return conversationId
         */
        public String getConversationId() {
            return this.conversationId;
        }

        /**
         * @return effectiveAnswerCount
         */
        public Integer getEffectiveAnswerCount() {
            return this.effectiveAnswerCount;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return transferredToAgent
         */
        public Boolean getTransferredToAgent() {
            return this.transferredToAgent;
        }

        /**
         * @return userUtteranceCount
         */
        public Integer getUserUtteranceCount() {
            return this.userUtteranceCount;
        }

        public static final class Builder {
            private Long beginTime; 
            private String callingNumber; 
            private String conversationId; 
            private Integer effectiveAnswerCount; 
            private Long endTime; 
            private String skillGroupId; 
            private Boolean transferredToAgent; 
            private Integer userUtteranceCount; 

            private Builder() {
            } 

            private Builder(Conversations model) {
                this.beginTime = model.beginTime;
                this.callingNumber = model.callingNumber;
                this.conversationId = model.conversationId;
                this.effectiveAnswerCount = model.effectiveAnswerCount;
                this.endTime = model.endTime;
                this.skillGroupId = model.skillGroupId;
                this.transferredToAgent = model.transferredToAgent;
                this.userUtteranceCount = model.userUtteranceCount;
            } 

            /**
             * <p>The start time. This value is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582183381000</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>02811111111</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * <p>The effective answer count.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder effectiveAnswerCount(Integer effectiveAnswerCount) {
                this.effectiveAnswerCount = effectiveAnswerCount;
                return this;
            }

            /**
             * <p>The end time. This value is a Unix timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1582183481000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>AAA</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>Whether the conversation was transferred to an agent.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder transferredToAgent(Boolean transferredToAgent) {
                this.transferredToAgent = transferredToAgent;
                return this;
            }

            /**
             * <p>The user utterance count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder userUtteranceCount(Integer userUtteranceCount) {
                this.userUtteranceCount = userUtteranceCount;
                return this;
            }

            public Conversations build() {
                return new Conversations(this);
            } 

        } 

    }
}
