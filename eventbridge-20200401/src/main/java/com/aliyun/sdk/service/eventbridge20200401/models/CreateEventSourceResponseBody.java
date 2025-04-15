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
 * {@link CreateEventSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventSourceResponseBody</p>
 */
public class CreateEventSourceResponseBody extends TeaModel {
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

    private CreateEventSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventSourceResponseBody create() {
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

        private Builder(CreateEventSourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned response code. Valid values:</p>
         * <ul>
         * <li>Success: The request is successful.</li>
         * <li>Other codes: The request failed. For more information about error codes, see Error codes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
         * <p>Remote error. requestId: [A8EFABD2-95B9-1C46-9E01-xxxx], error code: [CreateRelatedResourceFailed], message: [Create related resource failed, EntityNotExist.Role : The role not exists: xxxx. \r\nRequestId : xxxx-168C-54ED-8FEB-BF11CB70AEB7]</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2922208e-e1c6-43ee-bfd1-aca50263bc8a</p>
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

        public CreateEventSourceResponseBody build() {
            return new CreateEventSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEventSourceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEventSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSourceARN")
        private String eventSourceARN;

        private Data(Builder builder) {
            this.eventSourceARN = builder.eventSourceARN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventSourceARN
         */
        public String getEventSourceARN() {
            return this.eventSourceARN;
        }

        public static final class Builder {
            private String eventSourceARN; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventSourceARN = model.eventSourceARN;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:164901546557****:eventbus/my-event-bus/eventsource/mymns.source</p>
             */
            public Builder eventSourceARN(String eventSourceARN) {
                this.eventSourceARN = eventSourceARN;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
