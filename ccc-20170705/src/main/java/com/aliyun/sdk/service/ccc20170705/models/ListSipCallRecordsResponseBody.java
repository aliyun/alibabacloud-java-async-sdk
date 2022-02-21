// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSipCallRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSipCallRecordsResponseBody</p>
 */
public class ListSipCallRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListSipCallRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSipCallRecordsResponseBody create() {
        return builder().build();
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
        private String requestId; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSipCallRecordsResponseBody build() {
            return new ListSipCallRecordsResponseBody(this);
        } 

    } 

    public static class SipCallRecords extends TeaModel {
        @NameInMap("CallId")
        private String callId;

        @NameInMap("Callee")
        private String callee;

        @NameInMap("CalleeClusterId")
        private String calleeClusterId;

        @NameInMap("Caller")
        private String caller;

        @NameInMap("CallerClusterId")
        private String callerClusterId;

        @NameInMap("CarrierResponse")
        private String carrierResponse;

        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("EarlyMediaText")
        private String earlyMediaText;

        @NameInMap("EarlyMediaUrl")
        private String earlyMediaUrl;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("EstablishedTime")
        private Long establishedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InviteTime")
        private Long inviteTime;

        @NameInMap("LastResponseCode")
        private String lastResponseCode;

        @NameInMap("LastResponseText")
        private String lastResponseText;

        @NameInMap("ReleaseInitiator")
        private String releaseInitiator;

        @NameInMap("ReleasedTime")
        private Long releasedTime;

        @NameInMap("RingTime")
        private Long ringTime;

        @NameInMap("StartTime")
        private Long startTime;

        private SipCallRecords(Builder builder) {
            this.callId = builder.callId;
            this.callee = builder.callee;
            this.calleeClusterId = builder.calleeClusterId;
            this.caller = builder.caller;
            this.callerClusterId = builder.callerClusterId;
            this.carrierResponse = builder.carrierResponse;
            this.contactId = builder.contactId;
            this.earlyMediaText = builder.earlyMediaText;
            this.earlyMediaUrl = builder.earlyMediaUrl;
            this.endTime = builder.endTime;
            this.establishedTime = builder.establishedTime;
            this.instanceId = builder.instanceId;
            this.inviteTime = builder.inviteTime;
            this.lastResponseCode = builder.lastResponseCode;
            this.lastResponseText = builder.lastResponseText;
            this.releaseInitiator = builder.releaseInitiator;
            this.releasedTime = builder.releasedTime;
            this.ringTime = builder.ringTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SipCallRecords create() {
            return builder().build();
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return calleeClusterId
         */
        public String getCalleeClusterId() {
            return this.calleeClusterId;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return callerClusterId
         */
        public String getCallerClusterId() {
            return this.callerClusterId;
        }

        /**
         * @return carrierResponse
         */
        public String getCarrierResponse() {
            return this.carrierResponse;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return earlyMediaText
         */
        public String getEarlyMediaText() {
            return this.earlyMediaText;
        }

        /**
         * @return earlyMediaUrl
         */
        public String getEarlyMediaUrl() {
            return this.earlyMediaUrl;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return establishedTime
         */
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return inviteTime
         */
        public Long getInviteTime() {
            return this.inviteTime;
        }

        /**
         * @return lastResponseCode
         */
        public String getLastResponseCode() {
            return this.lastResponseCode;
        }

        /**
         * @return lastResponseText
         */
        public String getLastResponseText() {
            return this.lastResponseText;
        }

        /**
         * @return releaseInitiator
         */
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        /**
         * @return releasedTime
         */
        public Long getReleasedTime() {
            return this.releasedTime;
        }

        /**
         * @return ringTime
         */
        public Long getRingTime() {
            return this.ringTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String callId; 
            private String callee; 
            private String calleeClusterId; 
            private String caller; 
            private String callerClusterId; 
            private String carrierResponse; 
            private String contactId; 
            private String earlyMediaText; 
            private String earlyMediaUrl; 
            private Long endTime; 
            private Long establishedTime; 
            private String instanceId; 
            private Long inviteTime; 
            private String lastResponseCode; 
            private String lastResponseText; 
            private String releaseInitiator; 
            private Long releasedTime; 
            private Long ringTime; 
            private Long startTime; 

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * CalleeClusterId.
             */
            public Builder calleeClusterId(String calleeClusterId) {
                this.calleeClusterId = calleeClusterId;
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
             * CallerClusterId.
             */
            public Builder callerClusterId(String callerClusterId) {
                this.callerClusterId = callerClusterId;
                return this;
            }

            /**
             * CarrierResponse.
             */
            public Builder carrierResponse(String carrierResponse) {
                this.carrierResponse = carrierResponse;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * EarlyMediaText.
             */
            public Builder earlyMediaText(String earlyMediaText) {
                this.earlyMediaText = earlyMediaText;
                return this;
            }

            /**
             * EarlyMediaUrl.
             */
            public Builder earlyMediaUrl(String earlyMediaUrl) {
                this.earlyMediaUrl = earlyMediaUrl;
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
             * EstablishedTime.
             */
            public Builder establishedTime(Long establishedTime) {
                this.establishedTime = establishedTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InviteTime.
             */
            public Builder inviteTime(Long inviteTime) {
                this.inviteTime = inviteTime;
                return this;
            }

            /**
             * LastResponseCode.
             */
            public Builder lastResponseCode(String lastResponseCode) {
                this.lastResponseCode = lastResponseCode;
                return this;
            }

            /**
             * LastResponseText.
             */
            public Builder lastResponseText(String lastResponseText) {
                this.lastResponseText = lastResponseText;
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
             * ReleasedTime.
             */
            public Builder releasedTime(Long releasedTime) {
                this.releasedTime = releasedTime;
                return this;
            }

            /**
             * RingTime.
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SipCallRecords build() {
                return new SipCallRecords(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("sipCallRecords")
        private java.util.List < SipCallRecords> sipCallRecords;

        private List(Builder builder) {
            this.sipCallRecords = builder.sipCallRecords;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return sipCallRecords
         */
        public java.util.List < SipCallRecords> getSipCallRecords() {
            return this.sipCallRecords;
        }

        public static final class Builder {
            private java.util.List < SipCallRecords> sipCallRecords; 

            /**
             * sipCallRecords.
             */
            public Builder sipCallRecords(java.util.List < SipCallRecords> sipCallRecords) {
                this.sipCallRecords = sipCallRecords;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
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
         * @return list
         */
        public List getList() {
            return this.list;
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
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
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
