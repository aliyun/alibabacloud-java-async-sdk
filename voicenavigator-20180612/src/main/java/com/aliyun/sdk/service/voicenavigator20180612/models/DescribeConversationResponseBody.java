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
 * {@link DescribeConversationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConversationResponseBody</p>
 */
public class DescribeConversationResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.NameInMap("TransferredToAgent")
    private Boolean transferredToAgent;

    @com.aliyun.core.annotation.NameInMap("UserUtteranceCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeConversationResponseBody model) {
            this.beginTime = model.beginTime;
            this.callingNumber = model.callingNumber;
            this.conversationId = model.conversationId;
            this.effectiveAnswerCount = model.effectiveAnswerCount;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.skillGroupId = model.skillGroupId;
            this.transferredToAgent = model.transferredToAgent;
            this.userUtteranceCount = model.userUtteranceCount;
        } 

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1582103260434</p>
         */
        public Builder beginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>138106*****</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2d5aa451-661f-4f08-b0c4-28eec78decc4</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The number of effective Q&amp;A pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder effectiveAnswerCount(Integer effectiveAnswerCount) {
            this.effectiveAnswerCount = effectiveAnswerCount;
            return this;
        }

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1582103299434</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
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
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABABCBAC</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the conversation was transferred to a human agent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder transferredToAgent(Boolean transferredToAgent) {
            this.transferredToAgent = transferredToAgent;
            return this;
        }

        /**
         * <p>The number of user utterances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
