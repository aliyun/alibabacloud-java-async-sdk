// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetValidationQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetValidationQuotaResponseBody</p>
 */
public class GetValidationQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalQuota")
    private Integer totalQuota;

    @com.aliyun.core.annotation.NameInMap("UsedQuota")
    private Integer usedQuota;

    private GetValidationQuotaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalQuota = builder.totalQuota;
        this.usedQuota = builder.usedQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidationQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return usedQuota
     */
    public Integer getUsedQuota() {
        return this.usedQuota;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalQuota; 
        private Integer usedQuota; 

        private Builder() {
        } 

        private Builder(GetValidationQuotaResponseBody model) {
            this.requestId = model.requestId;
            this.totalQuota = model.totalQuota;
            this.usedQuota = model.usedQuota;
        } 

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
        public Builder totalQuota(Integer totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * UsedQuota.
         */
        public Builder usedQuota(Integer usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        public GetValidationQuotaResponseBody build() {
            return new GetValidationQuotaResponseBody(this);
        } 

    } 

}
