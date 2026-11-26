// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetHttpEventConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetHttpEventConfigResponseBody</p>
 */
public class GetHttpEventConfigResponseBody extends TeaModel {
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

    private GetHttpEventConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpEventConfigResponseBody create() {
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

        private Builder(GetHttpEventConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHttpEventConfigResponseBody build() {
            return new GetHttpEventConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHttpEventConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetHttpEventConfigResponseBody</p>
     */
    public static class EventConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComplaintHandledEvent")
        private Boolean complaintHandledEvent;

        @com.aliyun.core.annotation.NameInMap("FileReviewedEvent")
        private Boolean fileReviewedEvent;

        @com.aliyun.core.annotation.NameInMap("SyncTaskCompleteEvent")
        private Boolean syncTaskCompleteEvent;

        @com.aliyun.core.annotation.NameInMap("TaskCompleteEvent")
        private Boolean taskCompleteEvent;

        private EventConfig(Builder builder) {
            this.complaintHandledEvent = builder.complaintHandledEvent;
            this.fileReviewedEvent = builder.fileReviewedEvent;
            this.syncTaskCompleteEvent = builder.syncTaskCompleteEvent;
            this.taskCompleteEvent = builder.taskCompleteEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventConfig create() {
            return builder().build();
        }

        /**
         * @return complaintHandledEvent
         */
        public Boolean getComplaintHandledEvent() {
            return this.complaintHandledEvent;
        }

        /**
         * @return fileReviewedEvent
         */
        public Boolean getFileReviewedEvent() {
            return this.fileReviewedEvent;
        }

        /**
         * @return syncTaskCompleteEvent
         */
        public Boolean getSyncTaskCompleteEvent() {
            return this.syncTaskCompleteEvent;
        }

        /**
         * @return taskCompleteEvent
         */
        public Boolean getTaskCompleteEvent() {
            return this.taskCompleteEvent;
        }

        public static final class Builder {
            private Boolean complaintHandledEvent; 
            private Boolean fileReviewedEvent; 
            private Boolean syncTaskCompleteEvent; 
            private Boolean taskCompleteEvent; 

            private Builder() {
            } 

            private Builder(EventConfig model) {
                this.complaintHandledEvent = model.complaintHandledEvent;
                this.fileReviewedEvent = model.fileReviewedEvent;
                this.syncTaskCompleteEvent = model.syncTaskCompleteEvent;
                this.taskCompleteEvent = model.taskCompleteEvent;
            } 

            /**
             * ComplaintHandledEvent.
             */
            public Builder complaintHandledEvent(Boolean complaintHandledEvent) {
                this.complaintHandledEvent = complaintHandledEvent;
                return this;
            }

            /**
             * FileReviewedEvent.
             */
            public Builder fileReviewedEvent(Boolean fileReviewedEvent) {
                this.fileReviewedEvent = fileReviewedEvent;
                return this;
            }

            /**
             * SyncTaskCompleteEvent.
             */
            public Builder syncTaskCompleteEvent(Boolean syncTaskCompleteEvent) {
                this.syncTaskCompleteEvent = syncTaskCompleteEvent;
                return this;
            }

            /**
             * TaskCompleteEvent.
             */
            public Builder taskCompleteEvent(Boolean taskCompleteEvent) {
                this.taskCompleteEvent = taskCompleteEvent;
                return this;
            }

            public EventConfig build() {
                return new EventConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHttpEventConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetHttpEventConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallbackUrl")
        private String callbackUrl;

        @com.aliyun.core.annotation.NameInMap("EventConfig")
        private EventConfig eventConfig;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("SwitchFlag")
        private Boolean switchFlag;

        private Data(Builder builder) {
            this.callbackUrl = builder.callbackUrl;
            this.eventConfig = builder.eventConfig;
            this.httpMethod = builder.httpMethod;
            this.switchFlag = builder.switchFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return callbackUrl
         */
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        /**
         * @return eventConfig
         */
        public EventConfig getEventConfig() {
            return this.eventConfig;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return switchFlag
         */
        public Boolean getSwitchFlag() {
            return this.switchFlag;
        }

        public static final class Builder {
            private String callbackUrl; 
            private EventConfig eventConfig; 
            private String httpMethod; 
            private Boolean switchFlag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.callbackUrl = model.callbackUrl;
                this.eventConfig = model.eventConfig;
                this.httpMethod = model.httpMethod;
                this.switchFlag = model.switchFlag;
            } 

            /**
             * CallbackUrl.
             */
            public Builder callbackUrl(String callbackUrl) {
                this.callbackUrl = callbackUrl;
                return this;
            }

            /**
             * EventConfig.
             */
            public Builder eventConfig(EventConfig eventConfig) {
                this.eventConfig = eventConfig;
                return this;
            }

            /**
             * HttpMethod.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * SwitchFlag.
             */
            public Builder switchFlag(Boolean switchFlag) {
                this.switchFlag = switchFlag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
