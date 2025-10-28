// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateHealthCheckUrlResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateHealthCheckUrlResponseBody</p>
 */
public class UpdateHealthCheckUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURL")
    private String healthCheckURL;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateHealthCheckUrlResponseBody model) {
            this.code = model.code;
            this.healthCheckURL = model.healthCheckURL;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The health check URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
         */
        public Builder healthCheckURL(String healthCheckURL) {
            this.healthCheckURL = healthCheckURL;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-*****************</p>
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
