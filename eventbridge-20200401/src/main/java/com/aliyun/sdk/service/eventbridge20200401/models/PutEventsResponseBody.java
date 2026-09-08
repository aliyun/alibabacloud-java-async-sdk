// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link PutEventsResponseBody} extends {@link TeaModel}
 *
 * <p>PutEventsResponseBody</p>
 */
public class PutEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PutEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventsResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PutEventsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBusNotExist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2BC1857D-E633-5E79-B2C2-43EF5F7730D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values: true: The operation was successful. false: The operation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutEventsResponseBody build() {
            return new PutEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutEventsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventsResponseBody</p>
     */
    public static class EntryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private EntryList(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.eventId = builder.eventId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryList create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String eventId; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(EntryList model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.eventId = model.eventId;
                this.traceId = model.traceId;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>Success indicates success. Other values indicate exceptions</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The detailed error description.</p>
             * 
             * <strong>example:</strong>
             * <p>triggerPicture failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4c8b7500-2aea-4f5a-b7dd-9d9dd986c07d</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The trace ID, which is used to query the exact call information.</p>
             * 
             * <strong>example:</strong>
             * <p>4E17C677F5357FB23D1A7FF964CD1999</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public EntryList build() {
                return new EntryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntryList")
        private java.util.List<EntryList> entryList;

        @com.aliyun.core.annotation.NameInMap("FailedEntryCount")
        private Integer failedEntryCount;

        private Data(Builder builder) {
            this.entryList = builder.entryList;
            this.failedEntryCount = builder.failedEntryCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entryList
         */
        public java.util.List<EntryList> getEntryList() {
            return this.entryList;
        }

        /**
         * @return failedEntryCount
         */
        public Integer getFailedEntryCount() {
            return this.failedEntryCount;
        }

        public static final class Builder {
            private java.util.List<EntryList> entryList; 
            private Integer failedEntryCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.entryList = model.entryList;
                this.failedEntryCount = model.failedEntryCount;
            } 

            /**
             * <p>The collection of event sending results.</p>
             */
            public Builder entryList(java.util.List<EntryList> entryList) {
                this.entryList = entryList;
                return this;
            }

            /**
             * <p>The number of events that failed to be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failedEntryCount(Integer failedEntryCount) {
                this.failedEntryCount = failedEntryCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
