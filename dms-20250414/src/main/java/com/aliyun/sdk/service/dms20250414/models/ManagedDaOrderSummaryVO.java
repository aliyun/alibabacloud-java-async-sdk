// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ManagedDaOrderSummaryVO} extends {@link TeaModel}
 *
 * <p>ManagedDaOrderSummaryVO</p>
 */
public class ManagedDaOrderSummaryVO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("availableQuota")
    private Integer availableQuota;

    @com.aliyun.core.annotation.NameInMap("totalQuota")
    private Integer totalQuota;

    @com.aliyun.core.annotation.NameInMap("trialExpireTime")
    private String trialExpireTime;

    @com.aliyun.core.annotation.NameInMap("trialUsed")
    private Boolean trialUsed;

    @com.aliyun.core.annotation.NameInMap("usedQuota")
    private Integer usedQuota;

    @com.aliyun.core.annotation.NameInMap("validOrderCount")
    private Integer validOrderCount;

    private ManagedDaOrderSummaryVO(Builder builder) {
        this.availableQuota = builder.availableQuota;
        this.totalQuota = builder.totalQuota;
        this.trialExpireTime = builder.trialExpireTime;
        this.trialUsed = builder.trialUsed;
        this.usedQuota = builder.usedQuota;
        this.validOrderCount = builder.validOrderCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManagedDaOrderSummaryVO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableQuota
     */
    public Integer getAvailableQuota() {
        return this.availableQuota;
    }

    /**
     * @return totalQuota
     */
    public Integer getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return trialExpireTime
     */
    public String getTrialExpireTime() {
        return this.trialExpireTime;
    }

    /**
     * @return trialUsed
     */
    public Boolean getTrialUsed() {
        return this.trialUsed;
    }

    /**
     * @return usedQuota
     */
    public Integer getUsedQuota() {
        return this.usedQuota;
    }

    /**
     * @return validOrderCount
     */
    public Integer getValidOrderCount() {
        return this.validOrderCount;
    }

    public static final class Builder {
        private Integer availableQuota; 
        private Integer totalQuota; 
        private String trialExpireTime; 
        private Boolean trialUsed; 
        private Integer usedQuota; 
        private Integer validOrderCount; 

        private Builder() {
        } 

        private Builder(ManagedDaOrderSummaryVO model) {
            this.availableQuota = model.availableQuota;
            this.totalQuota = model.totalQuota;
            this.trialExpireTime = model.trialExpireTime;
            this.trialUsed = model.trialUsed;
            this.usedQuota = model.usedQuota;
            this.validOrderCount = model.validOrderCount;
        } 

        /**
         * availableQuota.
         */
        public Builder availableQuota(Integer availableQuota) {
            this.availableQuota = availableQuota;
            return this;
        }

        /**
         * totalQuota.
         */
        public Builder totalQuota(Integer totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * trialExpireTime.
         */
        public Builder trialExpireTime(String trialExpireTime) {
            this.trialExpireTime = trialExpireTime;
            return this;
        }

        /**
         * trialUsed.
         */
        public Builder trialUsed(Boolean trialUsed) {
            this.trialUsed = trialUsed;
            return this;
        }

        /**
         * usedQuota.
         */
        public Builder usedQuota(Integer usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        /**
         * validOrderCount.
         */
        public Builder validOrderCount(Integer validOrderCount) {
            this.validOrderCount = validOrderCount;
            return this;
        }

        public ManagedDaOrderSummaryVO build() {
            return new ManagedDaOrderSummaryVO(this);
        } 

    } 

}
