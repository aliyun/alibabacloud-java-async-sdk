// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDomainDNSRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainDNSRecordResponseBody</p>
 */
public class DescribeDomainDNSRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DNSStatus")
    private String DNSStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDomainDNSRecordResponseBody model) {
            this.DNSStatus = model.DNSStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the DNS settings. Valid values:</p>
         * <ul>
         * <li><strong>cnameMatched</strong>: The DNS settings are properly configured.</li>
         * <li><strong>vipMatched</strong>: An A record maps the domain name to the WAF virtual IP address (VIP).</li>
         * <li><strong>wafVip</strong>: An A record maps the domain name to another WAF VIP.</li>
         * <li><strong>unRecord</strong>: The domain name does not have a DNS record.</li>
         * <li><strong>unUsed</strong>: The domain name is not pointed to WAF.</li>
         * <li><strong>checkTimeout</strong>: The check times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cnameMatched</p>
         */
        public Builder DNSStatus(String DNSStatus) {
            this.DNSStatus = DNSStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D827FCFE-90A7-4330-9326-D33C8B4C****</p>
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
