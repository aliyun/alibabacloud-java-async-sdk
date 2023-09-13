// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link UpdateApiDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApiDestinationResponseBody</p>
 */
public class UpdateApiDestinationResponseBody extends TeaModel {
    @NameInMap("ApiDestinationName")
    private String apiDestinationName;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateApiDestinationResponseBody(Builder builder) {
        this.apiDestinationName = builder.apiDestinationName;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiDestinationResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiDestinationName
     */
    public String getApiDestinationName() {
        return this.apiDestinationName;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private String apiDestinationName; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * api-destination-name
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        /**
         * The response code. If the request is successful, Success is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message. If the request is successful, success is returned.
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

        public UpdateApiDestinationResponseBody build() {
            return new UpdateApiDestinationResponseBody(this);
        } 

    } 

}
