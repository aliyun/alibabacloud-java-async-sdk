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
 * {@link GetUserLogDeliveryQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserLogDeliveryQuotaResponseBody</p>
 */
public class GetUserLogDeliveryQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.NameInMap("FreeQuota")
    private Long freeQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserLogDeliveryQuotaResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.freeQuota = builder.freeQuota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserLogDeliveryQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String businessType; 
        private Long freeQuota; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserLogDeliveryQuotaResponseBody model) {
            this.businessType = model.businessType;
            this.freeQuota = model.freeQuota;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The log category. Valid values:</p>
         * <ul>
         * <li>dcdn_log_access_l1 (default): access logs.</li>
         * <li>dcdn_log_er: Edge Routine logs.</li>
         * <li>dcdn_log_waf: firewall logs.</li>
         * <li>dcdn_log_ipa: TCP/UDP proxy logs.</li>
         * </ul>
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
         * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserLogDeliveryQuotaResponseBody build() {
            return new GetUserLogDeliveryQuotaResponseBody(this);
        } 

    } 

}
