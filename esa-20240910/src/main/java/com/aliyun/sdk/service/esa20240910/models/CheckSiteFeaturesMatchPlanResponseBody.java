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
 * {@link CheckSiteFeaturesMatchPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSiteFeaturesMatchPlanResponseBody</p>
 */
public class CheckSiteFeaturesMatchPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsPassed")
    private Boolean isPassed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnPassedSiteQuotas")
    private java.util.List<UnPassedSiteQuotas> unPassedSiteQuotas;

    private CheckSiteFeaturesMatchPlanResponseBody(Builder builder) {
        this.isPassed = builder.isPassed;
        this.requestId = builder.requestId;
        this.unPassedSiteQuotas = builder.unPassedSiteQuotas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteFeaturesMatchPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isPassed
     */
    public Boolean getIsPassed() {
        return this.isPassed;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unPassedSiteQuotas
     */
    public java.util.List<UnPassedSiteQuotas> getUnPassedSiteQuotas() {
        return this.unPassedSiteQuotas;
    }

    public static final class Builder {
        private Boolean isPassed; 
        private String requestId; 
        private java.util.List<UnPassedSiteQuotas> unPassedSiteQuotas; 

        private Builder() {
        } 

        private Builder(CheckSiteFeaturesMatchPlanResponseBody model) {
            this.isPassed = model.isPassed;
            this.requestId = model.requestId;
            this.unPassedSiteQuotas = model.unPassedSiteQuotas;
        } 

        /**
         * IsPassed.
         */
        public Builder isPassed(Boolean isPassed) {
            this.isPassed = isPassed;
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
         * UnPassedSiteQuotas.
         */
        public Builder unPassedSiteQuotas(java.util.List<UnPassedSiteQuotas> unPassedSiteQuotas) {
            this.unPassedSiteQuotas = unPassedSiteQuotas;
            return this;
        }

        public CheckSiteFeaturesMatchPlanResponseBody build() {
            return new CheckSiteFeaturesMatchPlanResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckSiteFeaturesMatchPlanResponseBody} extends {@link TeaModel}
     *
     * <p>CheckSiteFeaturesMatchPlanResponseBody</p>
     */
    public static class UnPassedSiteQuotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentQuotaValue")
        private String currentQuotaValue;

        @com.aliyun.core.annotation.NameInMap("DestQuotaValue")
        private String destQuotaValue;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        private UnPassedSiteQuotas(Builder builder) {
            this.currentQuotaValue = builder.currentQuotaValue;
            this.destQuotaValue = builder.destQuotaValue;
            this.quotaName = builder.quotaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnPassedSiteQuotas create() {
            return builder().build();
        }

        /**
         * @return currentQuotaValue
         */
        public String getCurrentQuotaValue() {
            return this.currentQuotaValue;
        }

        /**
         * @return destQuotaValue
         */
        public String getDestQuotaValue() {
            return this.destQuotaValue;
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        public static final class Builder {
            private String currentQuotaValue; 
            private String destQuotaValue; 
            private String quotaName; 

            private Builder() {
            } 

            private Builder(UnPassedSiteQuotas model) {
                this.currentQuotaValue = model.currentQuotaValue;
                this.destQuotaValue = model.destQuotaValue;
                this.quotaName = model.quotaName;
            } 

            /**
             * CurrentQuotaValue.
             */
            public Builder currentQuotaValue(String currentQuotaValue) {
                this.currentQuotaValue = currentQuotaValue;
                return this;
            }

            /**
             * DestQuotaValue.
             */
            public Builder destQuotaValue(String destQuotaValue) {
                this.destQuotaValue = destQuotaValue;
                return this;
            }

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            public UnPassedSiteQuotas build() {
                return new UnPassedSiteQuotas(this);
            } 

        } 

    }
}
