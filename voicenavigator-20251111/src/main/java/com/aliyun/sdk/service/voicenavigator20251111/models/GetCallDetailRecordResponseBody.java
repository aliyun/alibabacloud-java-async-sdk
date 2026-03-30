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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
                this.playedWords = model.playedWords;
                this.role = model.role;
                this.streamEnd = model.streamEnd;
                this.streamId = model.streamId;
                this.utterance = model.utterance;
                this.vendorParams = model.vendorParams;
            } 

            /**
             * Answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * Backchannels.
             */
            public Builder backchannels(Boolean backchannels) {
                this.backchannels = backchannels;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(Long beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * ControlParamsList.
             */
            public Builder controlParamsList(String controlParamsList) {
                this.controlParamsList = controlParamsList;
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
             * EventTime.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(String extras) {
                this.extras = extras;
                return this;
            }

            /**
             * Interrupted.
             */
            public Builder interrupted(Boolean interrupted) {
                this.interrupted = interrupted;
                return this;
            }

            /**
             * Legacy.
             */
            public Builder legacy(Boolean legacy) {
                this.legacy = legacy;
                return this;
            }

            /**
             * PlayedWords.
             */
            public Builder playedWords(Integer playedWords) {
                this.playedWords = playedWords;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * StreamEnd.
             */
            public Builder streamEnd(Boolean streamEnd) {
                this.streamEnd = streamEnd;
                return this;
            }

            /**
             * StreamId.
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            /**
             * Utterance.
             */
            public Builder utterance(String utterance) {
                this.utterance = utterance;
                return this;
            }

            /**
             * VendorParams.
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
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * DispositionCode.
             */
            public Builder dispositionCode(String dispositionCode) {
                this.dispositionCode = dispositionCode;
                return this;
            }

            /**
             * DispositionReason.
             */
            public Builder dispositionReason(String dispositionReason) {
                this.dispositionReason = dispositionReason;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * IssueResolved.
             */
            public Builder issueResolved(Boolean issueResolved) {
                this.issueResolved = issueResolved;
                return this;
            }

            /**
             * ReleaseInitiator.
             */
            public Builder releaseInitiator(String releaseInitiator) {
                this.releaseInitiator = releaseInitiator;
                return this;
            }

            /**
             * ResolutionEvidence.
             */
            public Builder resolutionEvidence(String resolutionEvidence) {
                this.resolutionEvidence = resolutionEvidence;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TalkTime.
             */
            public Builder talkTime(Integer talkTime) {
                this.talkTime = talkTime;
                return this;
            }

            /**
             * TalkTurns.
             */
            public Builder talkTurns(Integer talkTurns) {
                this.talkTurns = talkTurns;
                return this;
            }

            /**
             * Transcripts.
             */
            public Builder transcripts(java.util.List<Transcripts> transcripts) {
                this.transcripts = transcripts;
                return this;
            }

            /**
             * TransferTarget.
             */
            public Builder transferTarget(String transferTarget) {
                this.transferTarget = transferTarget;
                return this;
            }

            /**
             * TransferType.
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
