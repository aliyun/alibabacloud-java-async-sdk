// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The domain name that is originally bound to the instance. If no value is returned for this parameter, the instance is bound to a domain name for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>originaldomain.com</p>
         */
        public Builder originalDomain(String originalDomain) {
            this.originalDomain = originalDomain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
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
