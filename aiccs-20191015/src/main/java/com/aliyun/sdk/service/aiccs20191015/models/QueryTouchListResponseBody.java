// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryTouchListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTouchListResponseBody</p>
 */
public class QueryTouchListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultData")
    private ResultData resultData;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTouchListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultData = builder.resultData;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTouchListResponseBody create() {
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
     * @return resultData
     */
    public ResultData getResultData() {
        return this.resultData;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultData resultData; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryTouchListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultData = model.resultData;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>865658FD-80DE-5D49-ABEB-F3CC9863F4F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Data result.</p>
         */
        public Builder resultData(ResultData resultData) {
            this.resultData = resultData;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.  </li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTouchListResponseBody build() {
            return new QueryTouchListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class ExtAttrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ani")
        private String ani;

        @com.aliyun.core.annotation.NameInMap("Dnis")
        private String dnis;

        @com.aliyun.core.annotation.NameInMap("EvaluationLevel")
        private Integer evaluationLevel;

        @com.aliyun.core.annotation.NameInMap("EvaluationScore")
        private Integer evaluationScore;

        @com.aliyun.core.annotation.NameInMap("EvaluationSolution")
        private Integer evaluationSolution;

        @com.aliyun.core.annotation.NameInMap("EvaluationStatus")
        private Integer evaluationStatus;

        @com.aliyun.core.annotation.NameInMap("OnlineJoinRespInterval")
        private Integer onlineJoinRespInterval;

        @com.aliyun.core.annotation.NameInMap("OnlineSessionSource")
        private Integer onlineSessionSource;

        @com.aliyun.core.annotation.NameInMap("OutCallRouteNumber")
        private String outCallRouteNumber;

        private ExtAttrs(Builder builder) {
            this.ani = builder.ani;
            this.dnis = builder.dnis;
            this.evaluationLevel = builder.evaluationLevel;
            this.evaluationScore = builder.evaluationScore;
            this.evaluationSolution = builder.evaluationSolution;
            this.evaluationStatus = builder.evaluationStatus;
            this.onlineJoinRespInterval = builder.onlineJoinRespInterval;
            this.onlineSessionSource = builder.onlineSessionSource;
            this.outCallRouteNumber = builder.outCallRouteNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtAttrs create() {
            return builder().build();
        }

        /**
         * @return ani
         */
        public String getAni() {
            return this.ani;
        }

        /**
         * @return dnis
         */
        public String getDnis() {
            return this.dnis;
        }

        /**
         * @return evaluationLevel
         */
        public Integer getEvaluationLevel() {
            return this.evaluationLevel;
        }

        /**
         * @return evaluationScore
         */
        public Integer getEvaluationScore() {
            return this.evaluationScore;
        }

        /**
         * @return evaluationSolution
         */
        public Integer getEvaluationSolution() {
            return this.evaluationSolution;
        }

        /**
         * @return evaluationStatus
         */
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

        /**
         * @return onlineJoinRespInterval
         */
        public Integer getOnlineJoinRespInterval() {
            return this.onlineJoinRespInterval;
        }

        /**
         * @return onlineSessionSource
         */
        public Integer getOnlineSessionSource() {
            return this.onlineSessionSource;
        }

        /**
         * @return outCallRouteNumber
         */
        public String getOutCallRouteNumber() {
            return this.outCallRouteNumber;
        }

        public static final class Builder {
            private String ani; 
            private String dnis; 
            private Integer evaluationLevel; 
            private Integer evaluationScore; 
            private Integer evaluationSolution; 
            private Integer evaluationStatus; 
            private Integer onlineJoinRespInterval; 
            private Integer onlineSessionSource; 
            private String outCallRouteNumber; 

            private Builder() {
            } 

            private Builder(ExtAttrs model) {
                this.ani = model.ani;
                this.dnis = model.dnis;
                this.evaluationLevel = model.evaluationLevel;
                this.evaluationScore = model.evaluationScore;
                this.evaluationSolution = model.evaluationSolution;
                this.evaluationStatus = model.evaluationStatus;
                this.onlineJoinRespInterval = model.onlineJoinRespInterval;
                this.onlineSessionSource = model.onlineSessionSource;
                this.outCallRouteNumber = model.outCallRouteNumber;
            } 

            /**
             * <p>Inbound call caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>187****0000</p>
             */
            public Builder ani(String ani) {
                this.ani = ani;
                return this;
            }

            /**
             * <p>For outbound calls, this is the called number. For inbound calls, this is also the called number.</p>
             * 
             * <strong>example:</strong>
             * <p>05712688****</p>
             */
            public Builder dnis(String dnis) {
                this.dnis = dnis;
                return this;
            }

            /**
             * <p>Satisfaction Level. Valid values:  </p>
             * <ul>
             * <li><strong>2</strong>: Level 2 satisfaction.  </li>
             * <li><strong>3</strong>: Level 3 satisfaction.  </li>
             * <li><strong>4</strong>: Level 4 satisfaction.  </li>
             * <li><strong>5</strong>: Level 5 satisfaction.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder evaluationLevel(Integer evaluationLevel) {
                this.evaluationLevel = evaluationLevel;
                return this;
            }

            /**
             * <p>Satisfaction rating. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Very dissatisfied.</li>
             * <li><strong>2</strong>: Dissatisfied.</li>
             * <li><strong>3</strong>: Neutral.</li>
             * <li><strong>4</strong>: Satisfied.</li>
             * <li><strong>5</strong>: Very satisfied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder evaluationScore(Integer evaluationScore) {
                this.evaluationScore = evaluationScore;
                return this;
            }

            /**
             * <p>Evaluation solution.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder evaluationSolution(Integer evaluationSolution) {
                this.evaluationSolution = evaluationSolution;
                return this;
            }

            /**
             * <p>Evaluation status. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: Evaluation not initiated.</li>
             * <li><strong>0</strong>: Not evaluated.</li>
             * <li><strong>1</strong>: Evaluated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder evaluationStatus(Integer evaluationStatus) {
                this.evaluationStatus = evaluationStatus;
                return this;
            }

            /**
             * <p>Duration until first response (unit: seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder onlineJoinRespInterval(Integer onlineJoinRespInterval) {
                this.onlineJoinRespInterval = onlineJoinRespInterval;
                return this;
            }

            /**
             * <p>Online session source.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onlineSessionSource(Integer onlineSessionSource) {
                this.onlineSessionSource = onlineSessionSource;
                return this;
            }

            /**
             * <p>Outbound call caller number.</p>
             * 
             * <strong>example:</strong>
             * <p>05712688****</p>
             */
            public Builder outCallRouteNumber(String outCallRouteNumber) {
                this.outCallRouteNumber = outCallRouteNumber;
                return this;
            }

            public ExtAttrs build() {
                return new ExtAttrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuId")
        private Long buId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Integer channelType;

        @com.aliyun.core.annotation.NameInMap("CloseTime")
        private Long closeTime;

        @com.aliyun.core.annotation.NameInMap("CommonQueueName")
        private String commonQueueName;

        @com.aliyun.core.annotation.NameInMap("DepId")
        private Long depId;

        @com.aliyun.core.annotation.NameInMap("ExtAttrs")
        private ExtAttrs extAttrs;

        @com.aliyun.core.annotation.NameInMap("ExtAttrsString")
        private java.util.Map<String, ?> extAttrsString;

        @com.aliyun.core.annotation.NameInMap("Feedback")
        private String feedback;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("FromId")
        private Long fromId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private Long memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("ParentTouchId")
        private Long parentTouchId;

        @com.aliyun.core.annotation.NameInMap("QueueId")
        private Long queueId;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private Long servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchUser")
        private String switchUser;

        @com.aliyun.core.annotation.NameInMap("ToId")
        private Long toId;

        @com.aliyun.core.annotation.NameInMap("TouchContent")
        private String touchContent;

        @com.aliyun.core.annotation.NameInMap("TouchEndReason")
        private Integer touchEndReason;

        @com.aliyun.core.annotation.NameInMap("TouchId")
        private String touchId;

        @com.aliyun.core.annotation.NameInMap("TouchTime")
        private String touchTime;

        @com.aliyun.core.annotation.NameInMap("TouchType")
        private Integer touchType;

        @com.aliyun.core.annotation.NameInMap("UserTouchId")
        private Long userTouchId;

        private Data(Builder builder) {
            this.buId = builder.buId;
            this.channelId = builder.channelId;
            this.channelType = builder.channelType;
            this.closeTime = builder.closeTime;
            this.commonQueueName = builder.commonQueueName;
            this.depId = builder.depId;
            this.extAttrs = builder.extAttrs;
            this.extAttrsString = builder.extAttrsString;
            this.feedback = builder.feedback;
            this.firstTime = builder.firstTime;
            this.fromId = builder.fromId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.parentTouchId = builder.parentTouchId;
            this.queueId = builder.queueId;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.status = builder.status;
            this.switchUser = builder.switchUser;
            this.toId = builder.toId;
            this.touchContent = builder.touchContent;
            this.touchEndReason = builder.touchEndReason;
            this.touchId = builder.touchId;
            this.touchTime = builder.touchTime;
            this.touchType = builder.touchType;
            this.userTouchId = builder.userTouchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelType
         */
        public Integer getChannelType() {
            return this.channelType;
        }

        /**
         * @return closeTime
         */
        public Long getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return commonQueueName
         */
        public String getCommonQueueName() {
            return this.commonQueueName;
        }

        /**
         * @return depId
         */
        public Long getDepId() {
            return this.depId;
        }

        /**
         * @return extAttrs
         */
        public ExtAttrs getExtAttrs() {
            return this.extAttrs;
        }

        /**
         * @return extAttrsString
         */
        public java.util.Map<String, ?> getExtAttrsString() {
            return this.extAttrsString;
        }

        /**
         * @return feedback
         */
        public String getFeedback() {
            return this.feedback;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return fromId
         */
        public Long getFromId() {
            return this.fromId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return memberId
         */
        public Long getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return parentTouchId
         */
        public Long getParentTouchId() {
            return this.parentTouchId;
        }

        /**
         * @return queueId
         */
        public Long getQueueId() {
            return this.queueId;
        }

        /**
         * @return servicerId
         */
        public Long getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchUser
         */
        public String getSwitchUser() {
            return this.switchUser;
        }

        /**
         * @return toId
         */
        public Long getToId() {
            return this.toId;
        }

        /**
         * @return touchContent
         */
        public String getTouchContent() {
            return this.touchContent;
        }

        /**
         * @return touchEndReason
         */
        public Integer getTouchEndReason() {
            return this.touchEndReason;
        }

        /**
         * @return touchId
         */
        public String getTouchId() {
            return this.touchId;
        }

        /**
         * @return touchTime
         */
        public String getTouchTime() {
            return this.touchTime;
        }

        /**
         * @return touchType
         */
        public Integer getTouchType() {
            return this.touchType;
        }

        /**
         * @return userTouchId
         */
        public Long getUserTouchId() {
            return this.userTouchId;
        }

        public static final class Builder {
            private Long buId; 
            private String channelId; 
            private Integer channelType; 
            private Long closeTime; 
            private String commonQueueName; 
            private Long depId; 
            private ExtAttrs extAttrs; 
            private java.util.Map<String, ?> extAttrsString; 
            private String feedback; 
            private Long firstTime; 
            private Long fromId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long memberId; 
            private String memberName; 
            private Long parentTouchId; 
            private Long queueId; 
            private Long servicerId; 
            private String servicerName; 
            private Integer status; 
            private String switchUser; 
            private Long toId; 
            private String touchContent; 
            private Integer touchEndReason; 
            private String touchId; 
            private String touchTime; 
            private Integer touchType; 
            private Long userTouchId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.buId = model.buId;
                this.channelId = model.channelId;
                this.channelType = model.channelType;
                this.closeTime = model.closeTime;
                this.commonQueueName = model.commonQueueName;
                this.depId = model.depId;
                this.extAttrs = model.extAttrs;
                this.extAttrsString = model.extAttrsString;
                this.feedback = model.feedback;
                this.firstTime = model.firstTime;
                this.fromId = model.fromId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.parentTouchId = model.parentTouchId;
                this.queueId = model.queueId;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.status = model.status;
                this.switchUser = model.switchUser;
                this.toId = model.toId;
                this.touchContent = model.touchContent;
                this.touchEndReason = model.touchEndReason;
                this.touchId = model.touchId;
                this.touchTime = model.touchTime;
                this.touchType = model.touchType;
                this.userTouchId = model.userTouchId;
            } 

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>905</p>
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * <p>Session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4f8807a9de024507a3090b5b66a8****</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>Contact channel.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>Session end time. UNIX timestamp format (unit: milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1611207976000</p>
             */
            public Builder closeTime(Long closeTime) {
                this.closeTime = closeTime;
                return this;
            }

            /**
             * <p>Skill group name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试1</p>
             */
            public Builder commonQueueName(String commonQueueName) {
                this.commonQueueName = commonQueueName;
                return this;
            }

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder depId(Long depId) {
                this.depId = depId;
                return this;
            }

            /**
             * <p>Extension fields.</p>
             */
            public Builder extAttrs(ExtAttrs extAttrs) {
                this.extAttrs = extAttrs;
                return this;
            }

            /**
             * <p>Large object.</p>
             */
            public Builder extAttrsString(java.util.Map<String, ?> extAttrsString) {
                this.extAttrsString = extAttrsString;
                return this;
            }

            /**
             * <p>Feedback.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxx</p>
             */
            public Builder feedback(String feedback) {
                this.feedback = feedback;
                return this;
            }

            /**
             * <p>Conversation pickup time, in UNIX timestamp format (unit: milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1611209971000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Conversation initiator.</p>
             * 
             * <strong>example:</strong>
             * <p>6400665****</p>
             */
            public Builder fromId(Long fromId) {
                this.fromId = fromId;
                return this;
            }

            /**
             * <p>Creation Time, in UNIX timestamp format (unit: milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1611209971000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Update Time. UNIX timestamp format (unit: milliseconds).</p>
             * 
             * <strong>example:</strong>
             * <p>1611207979000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Membership ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6400665****</p>
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>Membership name.</p>
             * 
             * <strong>example:</strong>
             * <p>访客</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>Parent contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parentTouchId(Long parentTouchId) {
                this.parentTouchId = parentTouchId;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder queueId(Long queueId) {
                this.queueId = queueId;
                return this;
            }

            /**
             * <p>Service agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>67****</p>
             */
            public Builder servicerId(Long servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * <p>Service agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>1390000****</p>
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * <p>Contact status. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Incoming call received.  </li>
             * <li><strong>2</strong>: Agent has joined.  </li>
             * <li><strong>3</strong>: In conversation.  </li>
             * <li><strong>4</strong>: Ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Change owner list.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder switchUser(String switchUser) {
                this.switchUser = switchUser;
                return this;
            }

            /**
             * <p>Conversation recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>67****</p>
             */
            public Builder toId(Long toId) {
                this.toId = toId;
                return this;
            }

            /**
             * <p>The reason why the session ended. Valid values:  </p>
             * <ul>
             * <li><strong>0</strong>: Unknown.  </li>
             * <li><strong>1</strong>: Contact failed.  </li>
             * <li><strong>2</strong>: Terminated by customer.  </li>
             * <li><strong>3</strong>: Terminated by agent.  </li>
             * <li><strong>4</strong>: Call abnormally interrupted.  </li>
             * <li><strong>5</strong>: Terminated due to change owner.  </li>
             * <li><strong>6</strong>: Terminated by system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder touchContent(String touchContent) {
                this.touchContent = touchContent;
                return this;
            }

            /**
             * <p>End reason.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder touchEndReason(Integer touchEndReason) {
                this.touchEndReason = touchEndReason;
                return this;
            }

            /**
             * <p>Touch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1386****</p>
             */
            public Builder touchId(String touchId) {
                this.touchId = touchId;
                return this;
            }

            /**
             * <p>Conversation duration (unit: seconds).</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder touchTime(String touchTime) {
                this.touchTime = touchTime;
                return this;
            }

            /**
             * <p>Touch type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Active touch.</li>
             * <li><strong>2</strong>: Passive touch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder touchType(Integer touchType) {
                this.touchType = touchType;
                return this;
            }

            /**
             * <p>User touch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1386****</p>
             */
            public Builder userTouchId(Long userTouchId) {
                this.userTouchId = userTouchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTouchListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTouchListResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Empty")
        private Boolean empty;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Integer nextPage;

        @com.aliyun.core.annotation.NameInMap("OnePageSize")
        private Integer onePageSize;

        @com.aliyun.core.annotation.NameInMap("PreviousPage")
        private Integer previousPage;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
        private Integer totalResults;

        private ResultData(Builder builder) {
            this.currentPage = builder.currentPage;
            this.data = builder.data;
            this.empty = builder.empty;
            this.nextPage = builder.nextPage;
            this.onePageSize = builder.onePageSize;
            this.previousPage = builder.previousPage;
            this.totalPage = builder.totalPage;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return empty
         */
        public Boolean getEmpty() {
            return this.empty;
        }

        /**
         * @return nextPage
         */
        public Integer getNextPage() {
            return this.nextPage;
        }

        /**
         * @return onePageSize
         */
        public Integer getOnePageSize() {
            return this.onePageSize;
        }

        /**
         * @return previousPage
         */
        public Integer getPreviousPage() {
            return this.previousPage;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalResults
         */
        public Integer getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private Integer currentPage; 
            private java.util.List<Data> data; 
            private Boolean empty; 
            private Integer nextPage; 
            private Integer onePageSize; 
            private Integer previousPage; 
            private Integer totalPage; 
            private Integer totalResults; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.currentPage = model.currentPage;
                this.data = model.data;
                this.empty = model.empty;
                this.nextPage = model.nextPage;
                this.onePageSize = model.onePageSize;
                this.previousPage = model.previousPage;
                this.totalPage = model.totalPage;
                this.totalResults = model.totalResults;
            } 

            /**
             * <p>Current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Indicates whether the result is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder empty(Boolean empty) {
                this.empty = empty;
                return this;
            }

            /**
             * <p>The page number of the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nextPage(Integer nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder onePageSize(Integer onePageSize) {
                this.onePageSize = onePageSize;
                return this;
            }

            /**
             * <p>Previous page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder previousPage(Integer previousPage) {
                this.previousPage = previousPage;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * <p>Total number of query results.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalResults(Integer totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
}
