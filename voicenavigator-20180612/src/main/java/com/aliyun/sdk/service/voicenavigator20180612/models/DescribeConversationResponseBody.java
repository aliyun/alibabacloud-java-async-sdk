// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConversationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConversationResponseBody</p>
 */
public class DescribeConversationResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    private Long beginTime;

    @NameInMap("CallingNumber")
    private String callingNumber;

    @NameInMap("ConversationId")
    private String conversationId;

    @NameInMap("EffectiveAnswerCount")
    private Integer effectiveAnswerCount;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SkillGroupId")
    private String skillGroupId;

    @NameInMap("TransferredToAgent")
    private Boolean transferredToAgent;

    @NameInMap("UserUtteranceCount")
    private Integer userUtteranceCount;

    private DescribeConversationResponseBody(Builder builder) {
        this.beginTime = builder.beginTime;
        this.callingNumber = builder.callingNumber;
        this.conversationId = builder.conversationId;
        this.effectiveAnswerCount = builder.effectiveAnswerCount;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.skillGroupId = builder.skillGroupId;
        this.transferredToAgent = builder.transferredToAgent;
        this.userUtteranceCount = builder.userUtteranceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConversationResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String skillGroupId; 
        private Boolean transferredToAgent; 
        private Integer userUtteranceCount; 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
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
         * EffectiveAnswerCount.
         */
        public Builder effectiveAnswerCount(Integer effectiveAnswerCount) {
            this.effectiveAnswerCount = effectiveAnswerCount;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * TransferredToAgent.
         */
        public Builder transferredToAgent(Boolean transferredToAgent) {
            this.transferredToAgent = transferredToAgent;
            return this;
        }

        /**
         * UserUtteranceCount.
         */
        public Builder userUtteranceCount(Integer userUtteranceCount) {
            this.userUtteranceCount = userUtteranceCount;
            return this;
        }

        public DescribeConversationResponseBody build() {
            return new DescribeConversationResponseBody(this);
        } 

    } 

}
