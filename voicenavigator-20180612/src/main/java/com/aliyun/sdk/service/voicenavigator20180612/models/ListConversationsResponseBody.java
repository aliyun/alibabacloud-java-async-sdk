// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConversationsResponseBody</p>
 */
public class ListConversationsResponseBody extends TeaModel {
    @NameInMap("Conversations")
    private java.util.List < Conversations> conversations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListConversationsResponseBody(Builder builder) {
        this.conversations = builder.conversations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConversationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return conversations
     */
    public java.util.List < Conversations> getConversations() {
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
        private java.util.List < Conversations> conversations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Conversations.
         */
        public Builder conversations(java.util.List < Conversations> conversations) {
            this.conversations = conversations;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConversationsResponseBody build() {
            return new ListConversationsResponseBody(this);
        } 

    } 

    public static class Conversations extends TeaModel {
        @NameInMap("CalledNumber")
        private String calledNumber;

        @NameInMap("CallingNumber")
        private String callingNumber;

        @NameInMap("ConversationId")
        private String conversationId;

        @NameInMap("EndReason")
        private Integer endReason;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @NameInMap("HasToAgent")
        private Boolean hasToAgent;

        @NameInMap("Rounds")
        private Integer rounds;

        @NameInMap("SandBox")
        private Boolean sandBox;

        @NameInMap("SkillGroup")
        private String skillGroup;

        @NameInMap("StartTime")
        private Long startTime;

        private Conversations(Builder builder) {
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.conversationId = builder.conversationId;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.hasLastPlaybackCompleted = builder.hasLastPlaybackCompleted;
            this.hasToAgent = builder.hasToAgent;
            this.rounds = builder.rounds;
            this.sandBox = builder.sandBox;
            this.skillGroup = builder.skillGroup;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversations create() {
            return builder().build();
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
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
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return hasLastPlaybackCompleted
         */
        public Boolean getHasLastPlaybackCompleted() {
            return this.hasLastPlaybackCompleted;
        }

        /**
         * @return hasToAgent
         */
        public Boolean getHasToAgent() {
            return this.hasToAgent;
        }

        /**
         * @return rounds
         */
        public Integer getRounds() {
            return this.rounds;
        }

        /**
         * @return sandBox
         */
        public Boolean getSandBox() {
            return this.sandBox;
        }

        /**
         * @return skillGroup
         */
        public String getSkillGroup() {
            return this.skillGroup;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String calledNumber; 
            private String callingNumber; 
            private String conversationId; 
            private Integer endReason; 
            private Long endTime; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasToAgent; 
            private Integer rounds; 
            private Boolean sandBox; 
            private String skillGroup; 
            private Long startTime; 

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * ConversationId.
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * EndReason.
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HasLastPlaybackCompleted.
             */
            public Builder hasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
                this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
                return this;
            }

            /**
             * HasToAgent.
             */
            public Builder hasToAgent(Boolean hasToAgent) {
                this.hasToAgent = hasToAgent;
                return this;
            }

            /**
             * Rounds.
             */
            public Builder rounds(Integer rounds) {
                this.rounds = rounds;
                return this;
            }

            /**
             * SandBox.
             */
            public Builder sandBox(Boolean sandBox) {
                this.sandBox = sandBox;
                return this;
            }

            /**
             * SkillGroup.
             */
            public Builder skillGroup(String skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Conversations build() {
                return new Conversations(this);
            } 

        } 

    }
}
