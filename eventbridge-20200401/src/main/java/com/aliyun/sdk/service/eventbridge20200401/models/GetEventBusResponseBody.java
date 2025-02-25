// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link GetEventBusResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventBusResponseBody</p>
 */
public class GetEventBusResponseBody extends TeaModel {
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

    private GetEventBusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventBusResponseBody create() {
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

        /**
         * The response code. The value Success indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation is successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEventBusResponseBody build() {
            return new GetEventBusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventBusARN")
        private String eventBusARN;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        private Data(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.eventBusARN = builder.eventBusARN;
            this.eventBusName = builder.eventBusName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventBusARN
         */
        public String getEventBusARN() {
            return this.eventBusARN;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String description; 
            private String eventBusARN; 
            private String eventBusName; 

            /**
             * The timestamp that indicates when the event bus was created.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The description of the event bus.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the event bus.
             */
            public Builder eventBusARN(String eventBusARN) {
                this.eventBusARN = eventBusARN;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
