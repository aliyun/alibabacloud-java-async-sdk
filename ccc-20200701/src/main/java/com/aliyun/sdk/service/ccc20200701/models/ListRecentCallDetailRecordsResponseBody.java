// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRecentCallDetailRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentCallDetailRecordsResponseBody</p>
 */
public class ListRecentCallDetailRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRecentCallDetailRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentCallDetailRecordsResponseBody create() {
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

        public ListRecentCallDetailRecordsResponseBody build() {
            return new ListRecentCallDetailRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallDetailRecordsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentIds")
        private String agentIds;

        @com.aliyun.core.annotation.NameInMap("CallDuration")
        private String callDuration;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("ContactDisposition")
        private String contactDisposition;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
        private String skillGroupIds;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private List(Builder builder) {
            this.agentIds = builder.agentIds;
            this.callDuration = builder.callDuration;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.contactDisposition = builder.contactDisposition;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.skillGroupIds = builder.skillGroupIds;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentIds
         */
        public String getAgentIds() {
            return this.agentIds;
        }

        /**
         * @return callDuration
         */
        public String getCallDuration() {
            return this.callDuration;
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
         * @return contactDisposition
         */
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactType
         */
        public String getContactType() {
            return this.contactType;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return skillGroupIds
         */
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentIds; 
            private String callDuration; 
            private String calledNumber; 
            private String callingNumber; 
            private String contactDisposition; 
            private String contactId; 
            private String contactType; 
            private Long duration; 
            private String instanceId; 
            private String skillGroupIds; 
            private Long startTime; 

            /**
             * AgentIds.
             */
            public Builder agentIds(String agentIds) {
                this.agentIds = agentIds;
                return this;
            }

            /**
             * CallDuration.
             */
            public Builder callDuration(String callDuration) {
                this.callDuration = callDuration;
                return this;
            }

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
             * ContactDisposition.
             */
            public Builder contactDisposition(String contactDisposition) {
                this.contactDisposition = contactDisposition;
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
             * ContactType.
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
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
             * SkillGroupIds.
             */
            public Builder skillGroupIds(String skillGroupIds) {
                this.skillGroupIds = skillGroupIds;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecentCallDetailRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentCallDetailRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
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
