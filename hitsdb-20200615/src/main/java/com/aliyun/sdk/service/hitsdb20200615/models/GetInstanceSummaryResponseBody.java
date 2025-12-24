// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetInstanceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceSummaryResponseBody</p>
 */
public class GetInstanceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LockingCount")
    private Integer lockingCount;

    @com.aliyun.core.annotation.NameInMap("RegionalSummary")
    private java.util.List<RegionalSummary> regionalSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningCount")
    private Integer runningCount;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetInstanceSummaryResponseBody(Builder builder) {
        this.lockingCount = builder.lockingCount;
        this.regionalSummary = builder.regionalSummary;
        this.requestId = builder.requestId;
        this.runningCount = builder.runningCount;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lockingCount
     */
    public Integer getLockingCount() {
        return this.lockingCount;
    }

    /**
     * @return regionalSummary
     */
    public java.util.List<RegionalSummary> getRegionalSummary() {
        return this.regionalSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningCount
     */
    public Integer getRunningCount() {
        return this.runningCount;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer lockingCount; 
        private java.util.List<RegionalSummary> regionalSummary; 
        private String requestId; 
        private Integer runningCount; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetInstanceSummaryResponseBody model) {
            this.lockingCount = model.lockingCount;
            this.regionalSummary = model.regionalSummary;
            this.requestId = model.requestId;
            this.runningCount = model.runningCount;
            this.total = model.total;
        } 

        /**
         * LockingCount.
         */
        public Builder lockingCount(Integer lockingCount) {
            this.lockingCount = lockingCount;
            return this;
        }

        /**
         * RegionalSummary.
         */
        public Builder regionalSummary(java.util.List<RegionalSummary> regionalSummary) {
            this.regionalSummary = regionalSummary;
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
         * RunningCount.
         */
        public Builder runningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetInstanceSummaryResponseBody build() {
            return new GetInstanceSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceSummaryResponseBody</p>
     */
    public static class RegionalSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LockingCount")
        private Integer lockingCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RunningCount")
        private Integer runningCount;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private RegionalSummary(Builder builder) {
            this.lockingCount = builder.lockingCount;
            this.regionId = builder.regionId;
            this.runningCount = builder.runningCount;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionalSummary create() {
            return builder().build();
        }

        /**
         * @return lockingCount
         */
        public Integer getLockingCount() {
            return this.lockingCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer lockingCount; 
            private String regionId; 
            private Integer runningCount; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(RegionalSummary model) {
                this.lockingCount = model.lockingCount;
                this.regionId = model.regionId;
                this.runningCount = model.runningCount;
                this.total = model.total;
            } 

            /**
             * LockingCount.
             */
            public Builder lockingCount(Integer lockingCount) {
                this.lockingCount = lockingCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RunningCount.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public RegionalSummary build() {
                return new RegionalSummary(this);
            } 

        } 

    }
}
