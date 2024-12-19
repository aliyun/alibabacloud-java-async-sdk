// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSiteLogDeliveryQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteLogDeliveryQuotaResponseBody</p>
 */
public class GetSiteLogDeliveryQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("FreeQuota")
    private Long freeQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetSiteLogDeliveryQuotaResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.freeQuota = builder.freeQuota;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteLogDeliveryQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return freeQuota
     */
    public Long getFreeQuota() {
        return this.freeQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private String businessType; 
        private Long freeQuota; 
        private String requestId; 
        private Long siteId; 

        /**
         * <p>The log category. Valid values:</p>
         * <ol>
         * <li>dcdn_log_access_l1 (default): access logs.</li>
         * <li>dcdn_log_er: Edge Routine logs.</li>
         * <li>dcdn_log_waf: firewall logs.</li>
         * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>dcdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder freeQuota(Long freeQuota) {
            this.freeQuota = freeQuota;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C14840EF0EAAB6D97CDE0C5F6554ACE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public GetSiteLogDeliveryQuotaResponseBody build() {
            return new GetSiteLogDeliveryQuotaResponseBody(this);
        } 

    } 

}
