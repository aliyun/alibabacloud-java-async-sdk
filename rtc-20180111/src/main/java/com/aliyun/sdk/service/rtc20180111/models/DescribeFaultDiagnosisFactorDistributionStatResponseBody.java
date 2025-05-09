// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeFaultDiagnosisFactorDistributionStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisFactorDistributionStatResponseBody</p>
 */
public class DescribeFaultDiagnosisFactorDistributionStatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatList")
    private java.util.List<StatList> statList;

    private DescribeFaultDiagnosisFactorDistributionStatResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statList = builder.statList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisFactorDistributionStatResponseBody create() {
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
     * @return statList
     */
    public java.util.List<StatList> getStatList() {
        return this.statList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatList> statList; 

        private Builder() {
        } 

        private Builder(DescribeFaultDiagnosisFactorDistributionStatResponseBody model) {
            this.requestId = model.requestId;
            this.statList = model.statList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatList.
         */
        public Builder statList(java.util.List<StatList> statList) {
            this.statList = statList;
            return this;
        }

        public DescribeFaultDiagnosisFactorDistributionStatResponseBody build() {
            return new DescribeFaultDiagnosisFactorDistributionStatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaultDiagnosisFactorDistributionStatResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisFactorDistributionStatResponseBody</p>
     */
    public static class StatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FactorId")
        private String factorId;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        @com.aliyun.core.annotation.NameInMap("UserRatio")
        private Float userRatio;

        private StatList(Builder builder) {
            this.factorId = builder.factorId;
            this.userCount = builder.userCount;
            this.userRatio = builder.userRatio;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatList create() {
            return builder().build();
        }

        /**
         * @return factorId
         */
        public String getFactorId() {
            return this.factorId;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        /**
         * @return userRatio
         */
        public Float getUserRatio() {
            return this.userRatio;
        }

        public static final class Builder {
            private String factorId; 
            private Integer userCount; 
            private Float userRatio; 

            private Builder() {
            } 

            private Builder(StatList model) {
                this.factorId = model.factorId;
                this.userCount = model.userCount;
                this.userRatio = model.userRatio;
            } 

            /**
             * FactorId.
             */
            public Builder factorId(String factorId) {
                this.factorId = factorId;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * UserRatio.
             */
            public Builder userRatio(Float userRatio) {
                this.userRatio = userRatio;
                return this;
            }

            public StatList build() {
                return new StatList(this);
            } 

        } 

    }
}
