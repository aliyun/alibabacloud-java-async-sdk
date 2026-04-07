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
 * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallDetailRecordsResponseBody</p>
 */
public class ListCallDetailRecordsResponseBody extends TeaModel {
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

    private ListCallDetailRecordsResponseBody(Builder builder) {
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

    public static ListCallDetailRecordsResponseBody create() {
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

        private Builder(ListCallDetailRecordsResponseBody model) {
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
         * <p>A8AED3C8-F57B-5D71-9A34-4A170287533F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCallDetailRecordsResponseBody build() {
            return new ListCallDetailRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsResponseBody</p>
     */
    public static class CallDetailRecords extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("TransferTarget")
        private String transferTarget;

        @com.aliyun.core.annotation.NameInMap("TransferType")
        private String transferType;

        private CallDetailRecords(Builder builder) {
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
            this.transferTarget = builder.transferTarget;
            this.transferType = builder.transferType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallDetailRecords create() {
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
            private String transferTarget; 
            private String transferType; 

            private Builder() {
            } 

            private Builder(CallDetailRecords model) {
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

            public CallDetailRecords build() {
                return new CallDetailRecords(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallDetailRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallDetailRecords")
        private java.util.List<CallDetailRecords> callDetailRecords;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.callDetailRecords = builder.callDetailRecords;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callDetailRecords
         */
        public java.util.List<CallDetailRecords> getCallDetailRecords() {
            return this.callDetailRecords;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CallDetailRecords> callDetailRecords; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callDetailRecords = model.callDetailRecords;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * CallDetailRecords.
             */
            public Builder callDetailRecords(java.util.List<CallDetailRecords> callDetailRecords) {
                this.callDetailRecords = callDetailRecords;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
