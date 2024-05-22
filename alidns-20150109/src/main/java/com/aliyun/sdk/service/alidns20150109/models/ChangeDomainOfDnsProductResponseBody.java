// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDomainOfDnsProductResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeDomainOfDnsProductResponseBody</p>
 */
public class ChangeDomainOfDnsProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OriginalDomain")
    private String originalDomain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeDomainOfDnsProductResponseBody(Builder builder) {
        this.originalDomain = builder.originalDomain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDomainOfDnsProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return originalDomain
     */
    public String getOriginalDomain() {
        return this.originalDomain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String originalDomain; 
        private String requestId; 

        /**
         * The original domain name that was bound to the instance. If the value of this parameter is empty, the instance is bound with a domain name for the first time.
         */
        public Builder originalDomain(String originalDomain) {
            this.originalDomain = originalDomain;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeDomainOfDnsProductResponseBody build() {
            return new ChangeDomainOfDnsProductResponseBody(this);
        } 

    } 

}
