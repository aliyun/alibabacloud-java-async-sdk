// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertWarehouseQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertWarehouseQuotaResponseBody</p>
 */
public class GetCertWarehouseQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalQuota")
    private Long totalQuota;

    @NameInMap("UseCount")
    private Long useCount;

    private GetCertWarehouseQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalQuota = builder.totalQuota;
        this.useCount = builder.useCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCertWarehouseQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalQuota
     */
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return useCount
     */
    public Long getUseCount() {
        return this.useCount;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalQuota; 
        private Long useCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalQuota.
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * UseCount.
         */
        public Builder useCount(Long useCount) {
            this.useCount = useCount;
            return this;
        }

        public GetCertWarehouseQuotaResponseBody build() {
            return new GetCertWarehouseQuotaResponseBody(this);
        } 

    } 

}
