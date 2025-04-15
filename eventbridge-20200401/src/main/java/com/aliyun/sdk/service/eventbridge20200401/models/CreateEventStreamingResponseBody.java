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
 * {@link CreateEventStreamingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventStreamingResponseBody</p>
 */
public class CreateEventStreamingResponseBody extends TeaModel {
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

    private CreateEventStreamingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventStreamingResponseBody create() {
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

        private Builder(CreateEventStreamingResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>Success: The request is successful.</li>
         * <li>Other codes: The request failed. For more information about error codes, see Error codes.</li>
         * </ul>
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
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The name [xxxx] of event streaming in request is already exist!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B896B484-F16D-59DE-9E23-DD0E5C361108</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. The value true indicates that the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEventStreamingResponseBody build() {
            return new CreateEventStreamingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventStreamingResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEventStreamingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventStreamingARN")
        private String eventStreamingARN;

        private Data(Builder builder) {
            this.eventStreamingARN = builder.eventStreamingARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventStreamingARN
         */
        public String getEventStreamingARN() {
            return this.eventStreamingARN;
        }

        public static final class Builder {
            private String eventStreamingARN; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventStreamingARN = model.eventStreamingARN;
            } 

            /**
             * <p>The ARN of the event stream.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventstreaming/myeventstreaming</p>
             */
            public Builder eventStreamingARN(String eventStreamingARN) {
                this.eventStreamingARN = eventStreamingARN;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
