// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAclCheckQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclCheckQuotaResponseBody</p>
 */
public class DescribeAclCheckQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAclCheckQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclCheckQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Quota quota; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAclCheckQuotaResponseBody model) {
            this.quota = model.quota;
            this.requestId = model.requestId;
        } 

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAclCheckQuotaResponseBody build() {
            return new DescribeAclCheckQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclCheckQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclCheckQuotaResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableQuota")
        private Long availableQuota;

        @com.aliyun.core.annotation.NameInMap("ConsumedQuota")
        private Long consumedQuota;

        @com.aliyun.core.annotation.NameInMap("TotalQuota")
        private Long totalQuota;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Quota(Builder builder) {
            this.availableQuota = builder.availableQuota;
            this.consumedQuota = builder.consumedQuota;
            this.totalQuota = builder.totalQuota;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return availableQuota
         */
        public Long getAvailableQuota() {
            return this.availableQuota;
        }

        /**
         * @return consumedQuota
         */
        public Long getConsumedQuota() {
            return this.consumedQuota;
        }

        /**
         * @return totalQuota
         */
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long availableQuota; 
            private Long consumedQuota; 
            private Long totalQuota; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.availableQuota = model.availableQuota;
                this.consumedQuota = model.consumedQuota;
                this.totalQuota = model.totalQuota;
                this.updateTime = model.updateTime;
            } 

            /**
             * AvailableQuota.
             */
            public Builder availableQuota(Long availableQuota) {
                this.availableQuota = availableQuota;
                return this;
            }

            /**
             * ConsumedQuota.
             */
            public Builder consumedQuota(Long consumedQuota) {
                this.consumedQuota = consumedQuota;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
