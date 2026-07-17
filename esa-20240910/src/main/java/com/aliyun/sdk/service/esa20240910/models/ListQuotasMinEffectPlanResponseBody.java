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
 * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotasMinEffectPlanResponseBody</p>
 */
public class ListQuotasMinEffectPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quotas")
    private java.util.List<Quotas> quotas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListQuotasMinEffectPlanResponseBody(Builder builder) {
        this.quotas = builder.quotas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasMinEffectPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotas
     */
    public java.util.List<Quotas> getQuotas() {
        return this.quotas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Quotas> quotas; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListQuotasMinEffectPlanResponseBody model) {
            this.quotas = model.quotas;
            this.requestId = model.requestId;
        } 

        /**
         * Quotas.
         */
        public Builder quotas(java.util.List<Quotas> quotas) {
            this.quotas = quotas;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListQuotasMinEffectPlanResponseBody build() {
            return new ListQuotasMinEffectPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasMinEffectPlanResponseBody</p>
     */
    public static class QuotaValueDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEffect")
        private String isEffect;

        @com.aliyun.core.annotation.NameInMap("MinEffectPlan")
        private String minEffectPlan;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QuotaValueDetail(Builder builder) {
            this.isEffect = builder.isEffect;
            this.minEffectPlan = builder.minEffectPlan;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaValueDetail create() {
            return builder().build();
        }

        /**
         * @return isEffect
         */
        public String getIsEffect() {
            return this.isEffect;
        }

        /**
         * @return minEffectPlan
         */
        public String getMinEffectPlan() {
            return this.minEffectPlan;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String isEffect; 
            private String minEffectPlan; 
            private String value; 

            private Builder() {
            } 

            private Builder(QuotaValueDetail model) {
                this.isEffect = model.isEffect;
                this.minEffectPlan = model.minEffectPlan;
                this.value = model.value;
            } 

            /**
             * IsEffect.
             */
            public Builder isEffect(String isEffect) {
                this.isEffect = isEffect;
                return this;
            }

            /**
             * MinEffectPlan.
             */
            public Builder minEffectPlan(String minEffectPlan) {
                this.minEffectPlan = minEffectPlan;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QuotaValueDetail build() {
                return new QuotaValueDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotasMinEffectPlanResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotasMinEffectPlanResponseBody</p>
     */
    public static class Quotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaValueDetail")
        private java.util.List<QuotaValueDetail> quotaValueDetail;

        @com.aliyun.core.annotation.NameInMap("QuotaValueType")
        private String quotaValueType;

        private Quotas(Builder builder) {
            this.quotaName = builder.quotaName;
            this.quotaValueDetail = builder.quotaValueDetail;
            this.quotaValueType = builder.quotaValueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quotas create() {
            return builder().build();
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaValueDetail
         */
        public java.util.List<QuotaValueDetail> getQuotaValueDetail() {
            return this.quotaValueDetail;
        }

        /**
         * @return quotaValueType
         */
        public String getQuotaValueType() {
            return this.quotaValueType;
        }

        public static final class Builder {
            private String quotaName; 
            private java.util.List<QuotaValueDetail> quotaValueDetail; 
            private String quotaValueType; 

            private Builder() {
            } 

            private Builder(Quotas model) {
                this.quotaName = model.quotaName;
                this.quotaValueDetail = model.quotaValueDetail;
                this.quotaValueType = model.quotaValueType;
            } 

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * QuotaValueDetail.
             */
            public Builder quotaValueDetail(java.util.List<QuotaValueDetail> quotaValueDetail) {
                this.quotaValueDetail = quotaValueDetail;
                return this;
            }

            /**
             * QuotaValueType.
             */
            public Builder quotaValueType(String quotaValueType) {
                this.quotaValueType = quotaValueType;
                return this;
            }

            public Quotas build() {
                return new Quotas(this);
            } 

        } 

    }
}
