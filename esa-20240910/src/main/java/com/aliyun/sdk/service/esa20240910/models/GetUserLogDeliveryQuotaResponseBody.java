// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * FreeQuota.
         */
        public Builder freeQuota(Long freeQuota) {
            this.freeQuota = freeQuota;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
