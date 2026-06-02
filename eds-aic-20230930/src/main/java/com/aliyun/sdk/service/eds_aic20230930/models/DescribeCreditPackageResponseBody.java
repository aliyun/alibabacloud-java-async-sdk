// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCreditPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCreditPackageResponseBody</p>
 */
public class DescribeCreditPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreditsPackageInfos")
    private java.util.List<CreditsPackageInfos> creditsPackageInfos;

    @com.aliyun.core.annotation.NameInMap("IsFirstPurchase")
    private Boolean isFirstPurchase;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalAvailableCredits")
    private String totalAvailableCredits;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalExhaustedCredit")
    private String totalExhaustedCredit;

    private DescribeCreditPackageResponseBody(Builder builder) {
        this.creditsPackageInfos = builder.creditsPackageInfos;
        this.isFirstPurchase = builder.isFirstPurchase;
        this.requestId = builder.requestId;
        this.totalAvailableCredits = builder.totalAvailableCredits;
        this.totalCount = builder.totalCount;
        this.totalExhaustedCredit = builder.totalExhaustedCredit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creditsPackageInfos
     */
    public java.util.List<CreditsPackageInfos> getCreditsPackageInfos() {
        return this.creditsPackageInfos;
    }

    /**
     * @return isFirstPurchase
     */
    public Boolean getIsFirstPurchase() {
        return this.isFirstPurchase;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalAvailableCredits
     */
    public String getTotalAvailableCredits() {
        return this.totalAvailableCredits;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalExhaustedCredit
     */
    public String getTotalExhaustedCredit() {
        return this.totalExhaustedCredit;
    }

    public static final class Builder {
        private java.util.List<CreditsPackageInfos> creditsPackageInfos; 
        private Boolean isFirstPurchase; 
        private String requestId; 
        private String totalAvailableCredits; 
        private Integer totalCount; 
        private String totalExhaustedCredit; 

        private Builder() {
        } 

        private Builder(DescribeCreditPackageResponseBody model) {
            this.creditsPackageInfos = model.creditsPackageInfos;
            this.isFirstPurchase = model.isFirstPurchase;
            this.requestId = model.requestId;
            this.totalAvailableCredits = model.totalAvailableCredits;
            this.totalCount = model.totalCount;
            this.totalExhaustedCredit = model.totalExhaustedCredit;
        } 

        /**
         * CreditsPackageInfos.
         */
        public Builder creditsPackageInfos(java.util.List<CreditsPackageInfos> creditsPackageInfos) {
            this.creditsPackageInfos = creditsPackageInfos;
            return this;
        }

        /**
         * IsFirstPurchase.
         */
        public Builder isFirstPurchase(Boolean isFirstPurchase) {
            this.isFirstPurchase = isFirstPurchase;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalAvailableCredits.
         */
        public Builder totalAvailableCredits(String totalAvailableCredits) {
            this.totalAvailableCredits = totalAvailableCredits;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalExhaustedCredit.
         */
        public Builder totalExhaustedCredit(String totalExhaustedCredit) {
            this.totalExhaustedCredit = totalExhaustedCredit;
            return this;
        }

        public DescribeCreditPackageResponseBody build() {
            return new DescribeCreditPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCreditPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCreditPackageResponseBody</p>
     */
    public static class CreditsPackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableCredits")
        private String availableCredits;

        @com.aliyun.core.annotation.NameInMap("CreditPackageId")
        private String creditPackageId;

        @com.aliyun.core.annotation.NameInMap("CreditPackageStatus")
        private String creditPackageStatus;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExhaustedCredits")
        private String exhaustedCredits;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("TotalCredits")
        private String totalCredits;

        private CreditsPackageInfos(Builder builder) {
            this.availableCredits = builder.availableCredits;
            this.creditPackageId = builder.creditPackageId;
            this.creditPackageStatus = builder.creditPackageStatus;
            this.effectiveTime = builder.effectiveTime;
            this.exhaustedCredits = builder.exhaustedCredits;
            this.expiredTime = builder.expiredTime;
            this.totalCredits = builder.totalCredits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditsPackageInfos create() {
            return builder().build();
        }

        /**
         * @return availableCredits
         */
        public String getAvailableCredits() {
            return this.availableCredits;
        }

        /**
         * @return creditPackageId
         */
        public String getCreditPackageId() {
            return this.creditPackageId;
        }

        /**
         * @return creditPackageStatus
         */
        public String getCreditPackageStatus() {
            return this.creditPackageStatus;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return exhaustedCredits
         */
        public String getExhaustedCredits() {
            return this.exhaustedCredits;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return totalCredits
         */
        public String getTotalCredits() {
            return this.totalCredits;
        }

        public static final class Builder {
            private String availableCredits; 
            private String creditPackageId; 
            private String creditPackageStatus; 
            private String effectiveTime; 
            private String exhaustedCredits; 
            private String expiredTime; 
            private String totalCredits; 

            private Builder() {
            } 

            private Builder(CreditsPackageInfos model) {
                this.availableCredits = model.availableCredits;
                this.creditPackageId = model.creditPackageId;
                this.creditPackageStatus = model.creditPackageStatus;
                this.effectiveTime = model.effectiveTime;
                this.exhaustedCredits = model.exhaustedCredits;
                this.expiredTime = model.expiredTime;
                this.totalCredits = model.totalCredits;
            } 

            /**
             * AvailableCredits.
             */
            public Builder availableCredits(String availableCredits) {
                this.availableCredits = availableCredits;
                return this;
            }

            /**
             * CreditPackageId.
             */
            public Builder creditPackageId(String creditPackageId) {
                this.creditPackageId = creditPackageId;
                return this;
            }

            /**
             * CreditPackageStatus.
             */
            public Builder creditPackageStatus(String creditPackageStatus) {
                this.creditPackageStatus = creditPackageStatus;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExhaustedCredits.
             */
            public Builder exhaustedCredits(String exhaustedCredits) {
                this.exhaustedCredits = exhaustedCredits;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * TotalCredits.
             */
            public Builder totalCredits(String totalCredits) {
                this.totalCredits = totalCredits;
                return this;
            }

            public CreditsPackageInfos build() {
                return new CreditsPackageInfos(this);
            } 

        } 

    }
}
