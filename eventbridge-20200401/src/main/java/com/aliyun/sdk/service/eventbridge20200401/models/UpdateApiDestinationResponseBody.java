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
 * {@link UpdateApiDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApiDestinationResponseBody</p>
 */
public class UpdateApiDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
    private String apiDestinationName;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateApiDestinationResponseBody model) {
            this.apiDestinationName = model.apiDestinationName;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>api-destination-name</p>
         * 
         * <strong>example:</strong>
         * <p>api-destination-name</p>
         */
        public Builder apiDestinationName(String apiDestinationName) {
            this.apiDestinationName = apiDestinationName;
            return this;
        }

        /**
         * <p>The response code. If the request is successful, Success is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message. If the request is successful, success is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>382E6272-8E9C-5681-AC96-A8AF0BFAC1A5</p>
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
