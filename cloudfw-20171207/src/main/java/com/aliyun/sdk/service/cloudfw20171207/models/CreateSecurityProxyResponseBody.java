// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityProxyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityProxyResponseBody</p>
 */
public class CreateSecurityProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProxyId")
    private String proxyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateSecurityProxyResponseBody(Builder builder) {
        this.proxyId = builder.proxyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return proxyId
     */
    public String getProxyId() {
        return this.proxyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String proxyId; 
        private String requestId; 

        /**
         * ProxyId.
         */
        public Builder proxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSecurityProxyResponseBody build() {
            return new CreateSecurityProxyResponseBody(this);
        } 

    } 

}
