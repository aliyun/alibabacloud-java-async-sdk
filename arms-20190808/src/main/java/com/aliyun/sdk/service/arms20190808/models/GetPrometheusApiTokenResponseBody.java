// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPrometheusApiTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrometheusApiTokenResponseBody</p>
 */
public class GetPrometheusApiTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private GetPrometheusApiTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusApiTokenResponseBody create() {
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A9C645C-C83F-4C9D-8CCB-29BEC9E1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The token required for integrating Prometheus Service.</p>
         * 
         * <strong>example:</strong>
         * <p>6dcbb77ef4ba6ef5466b5debf9e2****</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public GetPrometheusApiTokenResponseBody build() {
            return new GetPrometheusApiTokenResponseBody(this);
        } 

    } 

}
