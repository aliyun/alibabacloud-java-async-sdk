// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetCertWarehouseQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetCertWarehouseQuotaResponseBody</p>
 */
public class GetCertWarehouseQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppTotalQuota")
    private Long appTotalQuota;

    @com.aliyun.core.annotation.NameInMap("AppUseCount")
    private Long appUseCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalQuota")
    private Long totalQuota;

    @com.aliyun.core.annotation.NameInMap("UseCount")
    private Long useCount;

    private GetCertWarehouseQuotaResponseBody(Builder builder) {
        this.appTotalQuota = builder.appTotalQuota;
        this.appUseCount = builder.appUseCount;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appTotalQuota
     */
    public Long getAppTotalQuota() {
        return this.appTotalQuota;
    }

    /**
     * @return appUseCount
     */
    public Long getAppUseCount() {
        return this.appUseCount;
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
        private Long appTotalQuota; 
        private Long appUseCount; 
        private String requestId; 
        private Long totalQuota; 
        private Long useCount; 

        private Builder() {
        } 

        private Builder(GetCertWarehouseQuotaResponseBody model) {
            this.appTotalQuota = model.appTotalQuota;
            this.appUseCount = model.appUseCount;
            this.requestId = model.requestId;
            this.totalQuota = model.totalQuota;
            this.useCount = model.useCount;
        } 

        /**
         * AppTotalQuota.
         */
        public Builder appTotalQuota(Long appTotalQuota) {
            this.appTotalQuota = appTotalQuota;
            return this;
        }

        /**
         * AppUseCount.
         */
        public Builder appUseCount(Long appUseCount) {
            this.appUseCount = appUseCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total quota for certificate repositories, including the free quota and purchased quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder totalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * <p>The used quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
