// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHealthCheckUrlResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateHealthCheckUrlResponseBody</p>
 */
public class UpdateHealthCheckUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("HealthCheckURL")
    private String healthCheckURL;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateHealthCheckUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.healthCheckURL = builder.healthCheckURL;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHealthCheckUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return healthCheckURL
     */
    public String getHealthCheckURL() {
        return this.healthCheckURL;
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
        private Integer code; 
        private String healthCheckURL; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The health check URL.
         */
        public Builder healthCheckURL(String healthCheckURL) {
            this.healthCheckURL = healthCheckURL;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateHealthCheckUrlResponseBody build() {
            return new UpdateHealthCheckUrlResponseBody(this);
        } 

    } 

}
