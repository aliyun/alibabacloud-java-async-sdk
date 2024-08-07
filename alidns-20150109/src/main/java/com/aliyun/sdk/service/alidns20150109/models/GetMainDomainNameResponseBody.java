// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainDomainNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetMainDomainNameResponseBody</p>
 */
public class GetMainDomainNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainLevel")
    private Long domainLevel;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RR")
    private String rr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMainDomainNameResponseBody(Builder builder) {
        this.domainLevel = builder.domainLevel;
        this.domainName = builder.domainName;
        this.rr = builder.rr;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainDomainNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainLevel
     */
    public Long getDomainLevel() {
        return this.domainLevel;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long domainLevel; 
        private String domainName; 
        private String rr; 
        private String requestId; 

        /**
         * The level of the entered domain name.
         */
        public Builder domainLevel(Long domainLevel) {
            this.domainLevel = domainLevel;
            return this;
        }

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The hostname.
         */
        public Builder rr(String rr) {
            this.rr = rr;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMainDomainNameResponseBody build() {
            return new GetMainDomainNameResponseBody(this);
        } 

    } 

}
