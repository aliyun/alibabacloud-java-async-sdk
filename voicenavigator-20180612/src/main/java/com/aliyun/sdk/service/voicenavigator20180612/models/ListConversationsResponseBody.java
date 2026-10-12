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
 * {@link ListConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConversationsResponseBody</p>
 */
public class ListConversationsResponseBody extends TeaModel {
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

        private Builder(ListConversationsResponseBody model) {
            this.conversations = model.conversations;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of sessions.</p>
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
         * <p>a2c26e67-5984-4935-984e-bcee52971993</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListConversationsResponseBody build() {
            return new ListConversationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConversationsResponseBody</p>
     */
    public static class Conversations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbTestName")
        private String abTestName;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ConversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("DsReport")
        private String dsReport;

        @com.aliyun.core.annotation.NameInMap("DsReportTitles")
        private java.util.List<String> dsReportTitles;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private Integer endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HasLastPlaybackCompleted")
        private Boolean hasLastPlaybackCompleted;

        @com.aliyun.core.annotation.NameInMap("HasToAgent")
        private Boolean hasToAgent;

        @com.aliyun.core.annotation.NameInMap("Rounds")
        private Integer rounds;

        @com.aliyun.core.annotation.NameInMap("SandBox")
        private Boolean sandBox;

        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private String skillGroup;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Voice")
        private String voice;

        private Conversations(Builder builder) {
            this.abTestName = builder.abTestName;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.conversationId = builder.conversationId;
            this.dsReport = builder.dsReport;
            this.dsReportTitles = builder.dsReportTitles;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.hasLastPlaybackCompleted = builder.hasLastPlaybackCompleted;
            this.hasToAgent = builder.hasToAgent;
            this.rounds = builder.rounds;
            this.sandBox = builder.sandBox;
            this.skillGroup = builder.skillGroup;
            this.startTime = builder.startTime;
            this.voice = builder.voice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conversations create() {
            return builder().build();
        }

        /**
         * @return abTestName
         */
        public String getAbTestName() {
            return this.abTestName;
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
         * @return dsReport
         */
        public String getDsReport() {
            return this.dsReport;
        }

        /**
         * @return dsReportTitles
         */
        public java.util.List<String> getDsReportTitles() {
            return this.dsReportTitles;
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

        /**
         * @return voice
         */
        public String getVoice() {
            return this.voice;
        }

        public static final class Builder {
            private String abTestName; 
            private String calledNumber; 
            private String callingNumber; 
            private String conversationId; 
            private String dsReport; 
            private java.util.List<String> dsReportTitles; 
            private Integer endReason; 
            private Long endTime; 
            private Boolean hasLastPlaybackCompleted; 
            private Boolean hasToAgent; 
            private Integer rounds; 
            private Boolean sandBox; 
            private String skillGroup; 
            private Long startTime; 
            private String voice; 

            private Builder() {
            } 

            private Builder(Conversations model) {
                this.abTestName = model.abTestName;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.conversationId = model.conversationId;
                this.dsReport = model.dsReport;
                this.dsReportTitles = model.dsReportTitles;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.hasLastPlaybackCompleted = model.hasLastPlaybackCompleted;
                this.hasToAgent = model.hasToAgent;
                this.rounds = model.rounds;
                this.sandBox = model.sandBox;
                this.skillGroup = model.skillGroup;
                this.startTime = model.startTime;
                this.voice = model.voice;
            } 

            /**
             * AbTestName.
             */
            public Builder abTestName(String abTestName) {
                this.abTestName = abTestName;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>12356</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>135815884***</p>
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>82b2eaae-ce5c-45f8-8231-f15b6b27e55c</p>
             */
            public Builder conversationId(String conversationId) {
                this.conversationId = conversationId;
                return this;
            }

            /**
             * DsReport.
             */
            public Builder dsReport(String dsReport) {
                this.dsReport = dsReport;
                return this;
            }

            /**
             * DsReportTitles.
             */
            public Builder dsReportTitles(java.util.List<String> dsReportTitles) {
                this.dsReportTitles = dsReportTitles;
                return this;
            }

            /**
             * <p>The reason for ending the session. Valid values:</p>
             * <ol>
             * <li>Normal completion.</li>
             * <li>Hangup by the bot after unrecognized input.</li>
             * <li>Hangup due to silence timeout.</li>
             * <li>Hangup by the user after unrecognized input.</li>
             * <li>Hangup by the user without a reason.</li>
             * <li>Transfer to a human agent due to matched intent.</li>
             * <li>Transfer to a human agent after unrecognized input.</li>
             * <li>No interaction from the user.</li>
             * <li>Interruption due to a system exception.</li>
             * <li>Transfer to IVR due to matched intent.</li>
             * <li>Transfer to IVR after unrecognized input.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1582266750353</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Specifies whether the last prompt was fully played before the session ended.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
                this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
                return this;
            }

            /**
             * <p>Specifies whether the session was transferred to a human agent.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasToAgent(Boolean hasToAgent) {
                this.hasToAgent = hasToAgent;
                return this;
            }

            /**
             * <p>The number of conversation rounds.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder rounds(Integer rounds) {
                this.rounds = rounds;
                return this;
            }

            /**
             * <p>Specifies whether the sandbox mode is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sandBox(Boolean sandBox) {
                this.sandBox = sandBox;
                return this;
            }

            /**
             * <p>The skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>skg-123</p>
             */
            public Builder skillGroup(String skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1641625694286</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The text-to-speech (TTS) voice used for the call.</p>
             * 
             * <strong>example:</strong>
             * <p>cosyvoice-v3-flash:longanyang</p>
             */
            public Builder voice(String voice) {
                this.voice = voice;
                return this;
            }

            public Conversations build() {
                return new Conversations(this);
            } 

        } 

    }
}
