// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainDNSRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDNSRecordResponseBody</p>
 */
public class DescribeDomainDNSRecordResponseBody extends TeaModel {
    @NameInMap("DNSStatus")
    private String DNSStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainDNSRecordResponseBody(Builder builder) {
        this.DNSStatus = builder.DNSStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainDNSRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return DNSStatus
     */
    public String getDNSStatus() {
        return this.DNSStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DNSStatus; 
        private String requestId; 

        /**
         * The status of the DNS settings. Valid values:
         * <p>
         * 
         * *   **cnameMatched**: The DNS settings are properly configured.
         * *   **vipMatched**: An A record maps the domain name to the WAF virtual IP address (VIP).
         * *   **wafVip**: An A record maps the domain name to another WAF VIP.
         * *   **unRecord**: The domain name does not have a DNS record.
         * *   **unUsed**: The domain name is not pointed to WAF.
         * *   **checkTimeout**: The check times out.
         */
        public Builder DNSStatus(String DNSStatus) {
            this.DNSStatus = DNSStatus;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainDNSRecordResponseBody build() {
            return new DescribeDomainDNSRecordResponseBody(this);
        } 

    } 

}
