// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link GetDomainQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetDomainQuotaResponseBody</p>
 */
public class GetDomainQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("size_quota")
    private Long sizeQuota;

    @com.aliyun.core.annotation.NameInMap("size_used")
    private Long sizeUsed;

    @com.aliyun.core.annotation.NameInMap("user_count_quota")
    private Long userCountQuota;

    @com.aliyun.core.annotation.NameInMap("user_count_used")
    private Long userCountUsed;

    private GetDomainQuotaResponseBody(Builder builder) {
        this.sizeQuota = builder.sizeQuota;
        this.sizeUsed = builder.sizeUsed;
        this.userCountQuota = builder.userCountQuota;
        this.userCountUsed = builder.userCountUsed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDomainQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return sizeQuota
     */
    public Long getSizeQuota() {
        return this.sizeQuota;
    }

    /**
     * @return sizeUsed
     */
    public Long getSizeUsed() {
        return this.sizeUsed;
    }

    /**
     * @return userCountQuota
     */
    public Long getUserCountQuota() {
        return this.userCountQuota;
    }

    /**
     * @return userCountUsed
     */
    public Long getUserCountUsed() {
        return this.userCountUsed;
    }

    public static final class Builder {
        private Long sizeQuota; 
        private Long sizeUsed; 
        private Long userCountQuota; 
        private Long userCountUsed; 

        /**
         * size_quota.
         */
        public Builder sizeQuota(Long sizeQuota) {
            this.sizeQuota = sizeQuota;
            return this;
        }

        /**
         * size_used.
         */
        public Builder sizeUsed(Long sizeUsed) {
            this.sizeUsed = sizeUsed;
            return this;
        }

        /**
         * user_count_quota.
         */
        public Builder userCountQuota(Long userCountQuota) {
            this.userCountQuota = userCountQuota;
            return this;
        }

        /**
         * user_count_used.
         */
        public Builder userCountUsed(Long userCountUsed) {
            this.userCountUsed = userCountUsed;
            return this;
        }

        public GetDomainQuotaResponseBody build() {
            return new GetDomainQuotaResponseBody(this);
        } 

    } 

}
