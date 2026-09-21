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
         * <p>The credit booster package information.</p>
         */
        public Builder creditsPackageInfos(java.util.List<CreditsPackageInfos> creditsPackageInfos) {
            this.creditsPackageInfos = creditsPackageInfos;
            return this;
        }

        /**
         * <p>Indicates whether this is the first purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isFirstPurchase(Boolean isFirstPurchase) {
            this.isFirstPurchase = isFirstPurchase;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of available credits.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalAvailableCredits(String totalAvailableCredits) {
            this.totalAvailableCredits = totalAvailableCredits;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of consumed credits.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

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
            this.createTime = builder.createTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
            private String createTime; 
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
                this.createTime = model.createTime;
                this.creditPackageId = model.creditPackageId;
                this.creditPackageStatus = model.creditPackageStatus;
                this.effectiveTime = model.effectiveTime;
                this.exhaustedCredits = model.exhaustedCredits;
                this.expiredTime = model.expiredTime;
                this.totalCredits = model.totalCredits;
            } 

            /**
             * <p>The number of available credits in the current credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder availableCredits(String availableCredits) {
                this.availableCredits = availableCredits;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>crp-xagydbhfkah****</p>
             */
            public Builder creditPackageId(String creditPackageId) {
                this.creditPackageId = creditPackageId;
                return this;
            }

            /**
             * <p>The status of the credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder creditPackageStatus(String creditPackageStatus) {
                this.creditPackageStatus = creditPackageStatus;
                return this;
            }

            /**
             * <p>The effective period of the credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-30 00:00:00</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The number of consumed credits in the current credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder exhaustedCredits(String exhaustedCredits) {
                this.exhaustedCredits = exhaustedCredits;
                return this;
            }

            /**
             * <p>The expiration time of the credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-30 00:00:00</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The total number of credits in the current credit booster package.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
