// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyTokenResponseBody</p>
 */
public class ApplyTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private ApplyTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String requestId; 
        private String token; 

        /**
         * The request ID. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The token that is returned by the ApsaraMQ for MQTT broker.
         * <p>
         * 
         * >  Do not assume the length, format, or rule of the token to return. The actual returned token shall prevail.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public ApplyTokenResponseBody build() {
            return new ApplyTokenResponseBody(this);
        } 

    } 

}
