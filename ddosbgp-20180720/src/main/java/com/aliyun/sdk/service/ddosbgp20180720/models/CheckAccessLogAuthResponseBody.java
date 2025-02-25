// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckAccessLogAuthResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAccessLogAuthResponseBody</p>
 */
public class CheckAccessLogAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessLogAuth")
    private Boolean accessLogAuth;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckAccessLogAuthResponseBody(Builder builder) {
        this.accessLogAuth = builder.accessLogAuth;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAccessLogAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessLogAuth
     */
    public Boolean getAccessLogAuth() {
        return this.accessLogAuth;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean accessLogAuth; 
        private String requestId; 

        /**
         * <p>Indicates whether Anti-DDoS Origin was authorized to access Simple Log Service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accessLogAuth(Boolean accessLogAuth) {
            this.accessLogAuth = accessLogAuth;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>864FE2F4-CB2E-4024-B9EF-D59FD08ABD41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckAccessLogAuthResponseBody build() {
            return new CheckAccessLogAuthResponseBody(this);
        } 

    } 

}
