// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListVoicemailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVoicemailsResponseBody</p>
 */
public class ListVoicemailsResponseBody extends TeaModel {
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

    private ListVoicemailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoicemailsResponseBody create() {
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

        public ListVoicemailsResponseBody build() {
            return new ListVoicemailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVoicemailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoicemailsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("CdrStartTime")
        private Long cdrStartTime;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecordingDuration")
        private Long recordingDuration;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private List(Builder builder) {
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.cdrStartTime = builder.cdrStartTime;
            this.contactId = builder.contactId;
            this.duration = builder.duration;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.recordingDuration = builder.recordingDuration;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
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
         * @return cdrStartTime
         */
        public Long getCdrStartTime() {
            return this.cdrStartTime;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recordingDuration
         */
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String callee; 
            private String caller; 
            private Long cdrStartTime; 
            private String contactId; 
            private Long duration; 
            private String instanceId; 
            private String name; 
            private Long recordingDuration; 
            private String startTime; 

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
             * CdrStartTime.
             */
            public Builder cdrStartTime(Long cdrStartTime) {
                this.cdrStartTime = cdrStartTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecordingDuration.
             */
            public Builder recordingDuration(Long recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
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
     * {@link ListVoicemailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVoicemailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
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
