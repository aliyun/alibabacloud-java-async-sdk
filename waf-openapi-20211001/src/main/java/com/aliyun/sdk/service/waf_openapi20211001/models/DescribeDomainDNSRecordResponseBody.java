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
         * <p>The DNS status. Valid values:</p>
         * <ul>
         * <li><p><strong>cnameMatched</strong>: Normal.</p>
         * </li>
         * <li><p><strong>vipMatched</strong>: A record.</p>
         * </li>
         * <li><p><strong>wafVip</strong>: The VIP of another WAF is used.</p>
         * </li>
         * <li><p><strong>unRecord</strong>: No DNS resolution is configured.</p>
         * </li>
         * <li><p><strong>unUsed</strong>: Traffic does not pass through WAF.</p>
         * </li>
         * <li><p><strong>checkTimeout</strong>: The detection timed out.</p>
         * </li>
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
