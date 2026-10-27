// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetCallDetailRecordResponseBody</p>
 */
public class GetCallDetailRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCallDetailRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCallDetailRecordResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCallDetailRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The call detail record.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A list of parameters related to the error.</p>
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a2c26e67-5984-4935-984e-bcee52971993</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCallDetailRecordResponseBody build() {
            return new GetCallDetailRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class Transcripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("Backchannels")
        private Boolean backchannels;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private Long beginTime;

        @com.aliyun.core.annotation.NameInMap("ControlParamsList")
        private String controlParamsList;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private String extras;

        @com.aliyun.core.annotation.NameInMap("Interrupted")
        private Boolean interrupted;

        @com.aliyun.core.annotation.NameInMap("Legacy")
        private Boolean legacy;

        @com.aliyun.core.annotation.NameInMap("PlaybackStatus")
        private String playbackStatus;

        @com.aliyun.core.annotation.NameInMap("PlayedAnswer")
        private String playedAnswer;

        @com.aliyun.core.annotation.NameInMap("PlayedWords")
        private Integer playedWords;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("StreamEnd")
        private Boolean streamEnd;

        @com.aliyun.core.annotation.NameInMap("StreamId")
        private String streamId;

        @com.aliyun.core.annotation.NameInMap("Utterance")
        private String utterance;

        @com.aliyun.core.annotation.NameInMap("VendorParams")
        private String vendorParams;

        private Transcripts(Builder builder) {
            this.answer = builder.answer;
            this.backchannels = builder.backchannels;
            this.beginTime = builder.beginTime;
            this.controlParamsList = builder.controlParamsList;
            this.endTime = builder.endTime;
            this.eventTime = builder.eventTime;
            this.extras = builder.extras;
            this.interrupted = builder.interrupted;
            this.legacy = builder.legacy;
            this.playbackStatus = builder.playbackStatus;
            this.playedAnswer = builder.playedAnswer;
            this.playedWords = builder.playedWords;
            this.role = builder.role;
            this.streamEnd = builder.streamEnd;
            this.streamId = builder.streamId;
            this.utterance = builder.utterance;
            this.vendorParams = builder.vendorParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transcripts create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return backchannels
         */
        public Boolean getBackchannels() {
            return this.backchannels;
        }

        /**
         * @return beginTime
         */
        public Long getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return controlParamsList
         */
        public String getControlParamsList() {
            return this.controlParamsList;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return extras
         */
        public String getExtras() {
            return this.extras;
        }

        /**
         * @return interrupted
         */
        public Boolean getInterrupted() {
            return this.interrupted;
        }

        /**
         * @return legacy
         */
        public Boolean getLegacy() {
            return this.legacy;
        }

        /**
         * @return playbackStatus
         */
        public String getPlaybackStatus() {
            return this.playbackStatus;
        }

        /**
         * @return playedAnswer
         */
        public String getPlayedAnswer() {
            return this.playedAnswer;
        }

        /**
         * @return playedWords
         */
        public Integer getPlayedWords() {
            return this.playedWords;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return streamEnd
         */
        public Boolean getStreamEnd() {
            return this.streamEnd;
        }

        /**
         * @return streamId
         */
        public String getStreamId() {
            return this.streamId;
        }

        /**
         * @return utterance
         */
        public String getUtterance() {
            return this.utterance;
        }

        /**
         * @return vendorParams
         */
        public String getVendorParams() {
            return this.vendorParams;
        }

        public static final class Builder {
            private String answer; 
            private Boolean backchannels; 
            private Long beginTime; 
            private String controlParamsList; 
            private Long endTime; 
            private String eventTime; 
            private String extras; 
            private Boolean interrupted; 
            private Boolean legacy; 
            private String playbackStatus; 
            private String playedAnswer; 
            private Integer playedWords; 
            private String role; 
            private Boolean streamEnd; 
            private String streamId; 
            private String utterance; 
            private String vendorParams; 

            private Builder() {
            } 

            private Builder(Transcripts model) {
                this.answer = model.answer;
                this.backchannels = model.backchannels;
                this.beginTime = model.beginTime;
                this.controlParamsList = model.controlParamsList;
                this.endTime = model.endTime;
                this.eventTime = model.eventTime;
                this.extras = model.extras;
                this.interrupted = model.interrupted;
                this.legacy = model.legacy;
                this.playbackStatus = model.playbackStatus;
                this.playedAnswer = model.playedAnswer;
                this.playedWords = model.playedWords;
                this.role = model.role;
                this.streamEnd = model.streamEnd;
                this.streamId = model.streamId;
                this.utterance = model.utterance;
                this.vendorParams = model.vendorParams;
            } 

            /**
             * <p>The bot\&quot;s response. This parameter is valid when <code>Role</code> is <code>ASSISTANT</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>不好意思，</p>
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * <p>Indicates whether the user\&quot;s utterance is a backchannel (for example, &quot;uh-huh&quot; or &quot;okay&quot;). This parameter is valid when <code>Role</code> is <code>USER</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder backchannels(Boolean backchannels) {
                this.backchannels = backchannels;
                return this;
            }

            /**
             * <p>The start timestamp of the turn, in milliseconds since the Unix epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1748945414222</p>
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * <p>A list of control parameters. This parameter is valid when <code>Role</code> is <code>ASSISTANT</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;endSilenceTimeout&quot;:500,&quot;interruptible&quot;:false,&quot;silenceDetectionTimeout&quot;:5,&quot;type&quot;:&quot;Voice&quot;}]</p>
             */
            public Builder controlParamsList(String controlParamsList) {
                this.controlParamsList = controlParamsList;
                return this;
            }

            /**
             * <p>The end timestamp of the turn, in milliseconds since the Unix epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1767315903531</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The event timestamp, in milliseconds since the Unix epoch.</p>
             * 
             * <strong>example:</strong>
             * <p>1774859592165</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>Additional input from the user other than speech. This parameter is valid when <code>Role</code> is <code>USER</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;dataType&quot;:&quot;Silence&quot;}]</p>
             */
            public Builder extras(String extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>Indicates whether the turn was interrupted.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interrupted(Boolean interrupted) {
                this.interrupted = interrupted;
                return this;
            }

            /**
             * <p>Indicates whether the bot\&quot;s response is obsolete. This parameter is valid when <code>Role</code> is <code>ASSISTANT</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * PlaybackStatus.
             */
            public Builder playbackStatus(String playbackStatus) {
                this.playbackStatus = playbackStatus;
                return this;
            }

            /**
             * PlayedAnswer.
             */
            public Builder playedAnswer(String playedAnswer) {
                this.playedAnswer = playedAnswer;
                return this;
            }

            /**
             * <p>The number of words played from the bot\&quot;s response. This parameter is valid when <code>Role</code> is <code>USER</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder playedWords(Integer playedWords) {
                this.playedWords = playedWords;
                return this;
            }

            /**
             * <p>The role of the speaker.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Indicates if this is the final part of a streamed response.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder streamEnd(Boolean streamEnd) {
                this.streamEnd = streamEnd;
                return this;
            }

            /**
             * <p>The ID of the conversation turn.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            /**
             * <p>The user\&quot;s utterance. This parameter is valid when <code>Role</code> is <code>USER</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>你要说你快点说不说，我挂了哈。</p>
             */
            public Builder utterance(String utterance) {
                this.utterance = utterance;
                return this;
            }

            /**
             * <p>Vendor-specific data sent from the client. This parameter is valid when <code>Role</code> is <code>USER</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test1&quot;:&quot;1234&quot;}</p>
             */
            public Builder vendorParams(String vendorParams) {
                this.vendorParams = vendorParams;
                return this;
            }

            public Transcripts build() {
                return new Transcripts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCallDetailRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetCallDetailRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("DispositionCode")
        private String dispositionCode;

        @com.aliyun.core.annotation.NameInMap("DispositionReason")
        private String dispositionReason;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("IssueResolved")
        private Boolean issueResolved;

        @com.aliyun.core.annotation.NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @com.aliyun.core.annotation.NameInMap("ResolutionEvidence")
        private String resolutionEvidence;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TalkTime")
        private Integer talkTime;

        @com.aliyun.core.annotation.NameInMap("TalkTurns")
        private Integer talkTurns;

        @com.aliyun.core.annotation.NameInMap("Transcripts")
        private java.util.List<Transcripts> transcripts;

        @com.aliyun.core.annotation.NameInMap("TransferTarget")
        private String transferTarget;

        @com.aliyun.core.annotation.NameInMap("TransferType")
        private String transferType;

        private Data(Builder builder) {
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.dispositionCode = builder.dispositionCode;
            this.dispositionReason = builder.dispositionReason;
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.issueResolved = builder.issueResolved;
            this.releaseInitiator = builder.releaseInitiator;
            this.resolutionEvidence = builder.resolutionEvidence;
            this.sessionId = builder.sessionId;
            this.startTime = builder.startTime;
            this.talkTime = builder.talkTime;
            this.talkTurns = builder.talkTurns;
            this.transcripts = builder.transcripts;
            this.transferTarget = builder.transferTarget;
            this.transferType = builder.transferType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return dispositionCode
         */
        public String getDispositionCode() {
            return this.dispositionCode;
        }

        /**
         * @return dispositionReason
         */
        public String getDispositionReason() {
            return this.dispositionReason;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return issueResolved
         */
        public Boolean getIssueResolved() {
            return this.issueResolved;
        }

        /**
         * @return releaseInitiator
         */
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        /**
         * @return resolutionEvidence
         */
        public String getResolutionEvidence() {
            return this.resolutionEvidence;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return talkTime
         */
        public Integer getTalkTime() {
            return this.talkTime;
        }

        /**
         * @return talkTurns
         */
        public Integer getTalkTurns() {
            return this.talkTurns;
        }

        /**
         * @return transcripts
         */
        public java.util.List<Transcripts> getTranscripts() {
            return this.transcripts;
        }

        /**
         * @return transferTarget
         */
        public String getTransferTarget() {
            return this.transferTarget;
        }

        /**
         * @return transferType
         */
        public String getTransferType() {
            return this.transferType;
        }

        public static final class Builder {
            private String callee; 
            private String caller; 
            private String dispositionCode; 
            private String dispositionReason; 
            private Integer duration; 
            private Long endTime; 
            private Boolean issueResolved; 
            private String releaseInitiator; 
            private String resolutionEvidence; 
            private String sessionId; 
            private Long startTime; 
            private Integer talkTime; 
            private Integer talkTurns; 
            private java.util.List<Transcripts> transcripts; 
            private String transferTarget; 
            private String transferType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callee = model.callee;
                this.caller = model.caller;
                this.dispositionCode = model.dispositionCode;
                this.dispositionReason = model.dispositionReason;
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.issueResolved = model.issueResolved;
                this.releaseInitiator = model.releaseInitiator;
                this.resolutionEvidence = model.resolutionEvidence;
                this.sessionId = model.sessionId;
                this.startTime = model.startTime;
                this.talkTime = model.talkTime;
                this.talkTurns = model.talkTurns;
                this.transcripts = model.transcripts;
                this.transferTarget = model.transferTarget;
                this.transferType = model.transferType;
            } 

            /**
             * <p>The phone number of the callee.</p>
             * 
             * <strong>example:</strong>
             * <p>15100000001</p>
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * <p>The phone number of the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>15929990193</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>The disposition code for the call.</p>
             * 
             * <strong>example:</strong>
             * <p>Answered</p>
             */
            public Builder dispositionCode(String dispositionCode) {
                this.dispositionCode = dispositionCode;
                return this;
            }

            /**
             * <p>The reason for the call\&quot;s disposition.</p>
             * 
             * <strong>example:</strong>
             * <p>ConcurrentLimitExceeded</p>
             */
            public Builder dispositionReason(String dispositionReason) {
                this.dispositionReason = dispositionReason;
                return this;
            }

            /**
             * <p>The session duration, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>160</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1752283603978</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the user\&quot;s issue was resolved.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder issueResolved(Boolean issueResolved) {
                this.issueResolved = issueResolved;
                return this;
            }

            /**
             * <p>The party that ended the call.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer</p>
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * <p>The basis for the resolution judgment.</p>
             * 
             * <strong>example:</strong>
             * <p>unknown</p>
             */
            public Builder resolutionEvidence(String resolutionEvidence) {
                this.resolutionEvidence = resolutionEvidence;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>07d72ea0-6e38-48d4-8371-14deaaba996f</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1774858849987</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The talk time, in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder talkTime(Integer talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * <p>The number of conversation turns.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder talkTurns(Integer talkTurns) {
                this.talkTurns = talkTurns;
                return this;
            }

            /**
             * <p>The conversation transcripts.</p>
             */
            public Builder transcripts(java.util.List<Transcripts> transcripts) {
                this.transcripts = transcripts;
                return this;
            }

            /**
             * <p>The transfer target.</p>
             * 
             * <strong>example:</strong>
             * <p>default@testInstance1</p>
             */
            public Builder transferTarget(String transferTarget) {
                this.transferTarget = transferTarget;
                return this;
            }

            /**
             * <p>The transfer type.</p>
             * 
             * <strong>example:</strong>
             * <p>SkillGroup</p>
             */
            public Builder transferType(String transferType) {
                this.transferType = transferType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
