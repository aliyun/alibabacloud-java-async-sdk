// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link DescribePvtzStatisticsZoneOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePvtzStatisticsZoneOverviewResponseBody</p>
 */
public class DescribePvtzStatisticsZoneOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePvtzStatisticsZoneOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsZoneOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePvtzStatisticsZoneOverviewResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePvtzStatisticsZoneOverviewResponseBody build() {
            return new DescribePvtzStatisticsZoneOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsZoneOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsZoneOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefusedDomainCount")
        private Long refusedDomainCount;

        @com.aliyun.core.annotation.NameInMap("SuddenDropDomainCount")
        private Long suddenDropDomainCount;

        @com.aliyun.core.annotation.NameInMap("SuddenIncreaseDomainCount")
        private Long suddenIncreaseDomainCount;

        private Data(Builder builder) {
            this.refusedDomainCount = builder.refusedDomainCount;
            this.suddenDropDomainCount = builder.suddenDropDomainCount;
            this.suddenIncreaseDomainCount = builder.suddenIncreaseDomainCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return refusedDomainCount
         */
        public Long getRefusedDomainCount() {
            return this.refusedDomainCount;
        }

        /**
         * @return suddenDropDomainCount
         */
        public Long getSuddenDropDomainCount() {
            return this.suddenDropDomainCount;
        }

        /**
         * @return suddenIncreaseDomainCount
         */
        public Long getSuddenIncreaseDomainCount() {
            return this.suddenIncreaseDomainCount;
        }

        public static final class Builder {
            private Long refusedDomainCount; 
            private Long suddenDropDomainCount; 
            private Long suddenIncreaseDomainCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.refusedDomainCount = model.refusedDomainCount;
                this.suddenDropDomainCount = model.suddenDropDomainCount;
                this.suddenIncreaseDomainCount = model.suddenIncreaseDomainCount;
            } 

            /**
             * RefusedDomainCount.
             */
            public Builder refusedDomainCount(Long refusedDomainCount) {
                this.refusedDomainCount = refusedDomainCount;
                return this;
            }

            /**
             * SuddenDropDomainCount.
             */
            public Builder suddenDropDomainCount(Long suddenDropDomainCount) {
                this.suddenDropDomainCount = suddenDropDomainCount;
                return this;
            }

            /**
             * SuddenIncreaseDomainCount.
             */
            public Builder suddenIncreaseDomainCount(Long suddenIncreaseDomainCount) {
                this.suddenIncreaseDomainCount = suddenIncreaseDomainCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
