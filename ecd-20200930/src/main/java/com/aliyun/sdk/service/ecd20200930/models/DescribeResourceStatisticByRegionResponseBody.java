// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeResourceStatisticByRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceStatisticByRegionResponseBody</p>
 */
public class DescribeResourceStatisticByRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistic")
    private Statistic statistic;

    private DescribeResourceStatisticByRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statistic = builder.statistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceStatisticByRegionResponseBody create() {
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
     * @return statistic
     */
    public Statistic getStatistic() {
        return this.statistic;
    }

    public static final class Builder {
        private String requestId; 
        private Statistic statistic; 

        private Builder() {
        } 

        private Builder(DescribeResourceStatisticByRegionResponseBody model) {
            this.requestId = model.requestId;
            this.statistic = model.statistic;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistic.
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        public DescribeResourceStatisticByRegionResponseBody build() {
            return new DescribeResourceStatisticByRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourceStatisticByRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceStatisticByRegionResponseBody</p>
     */
    public static class RegionStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedEndUserCount")
        private Long assignedEndUserCount;

        @com.aliyun.core.annotation.NameInMap("ConnectedEndUserCount")
        private Long connectedEndUserCount;

        @com.aliyun.core.annotation.NameInMap("DesktopCount")
        private Long desktopCount;

        @com.aliyun.core.annotation.NameInMap("DesktopGroupCount")
        private Long desktopGroupCount;

        @com.aliyun.core.annotation.NameInMap("NetworkPackageCount")
        private Long networkPackageCount;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupCount")
        private Long policyGroupCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private RegionStatistics(Builder builder) {
            this.assignedEndUserCount = builder.assignedEndUserCount;
            this.connectedEndUserCount = builder.connectedEndUserCount;
            this.desktopCount = builder.desktopCount;
            this.desktopGroupCount = builder.desktopGroupCount;
            this.networkPackageCount = builder.networkPackageCount;
            this.policyGroupCount = builder.policyGroupCount;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatistics create() {
            return builder().build();
        }

        /**
         * @return assignedEndUserCount
         */
        public Long getAssignedEndUserCount() {
            return this.assignedEndUserCount;
        }

        /**
         * @return connectedEndUserCount
         */
        public Long getConnectedEndUserCount() {
            return this.connectedEndUserCount;
        }

        /**
         * @return desktopCount
         */
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        /**
         * @return desktopGroupCount
         */
        public Long getDesktopGroupCount() {
            return this.desktopGroupCount;
        }

        /**
         * @return networkPackageCount
         */
        public Long getNetworkPackageCount() {
            return this.networkPackageCount;
        }

        /**
         * @return policyGroupCount
         */
        public Long getPolicyGroupCount() {
            return this.policyGroupCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Long assignedEndUserCount; 
            private Long connectedEndUserCount; 
            private Long desktopCount; 
            private Long desktopGroupCount; 
            private Long networkPackageCount; 
            private Long policyGroupCount; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(RegionStatistics model) {
                this.assignedEndUserCount = model.assignedEndUserCount;
                this.connectedEndUserCount = model.connectedEndUserCount;
                this.desktopCount = model.desktopCount;
                this.desktopGroupCount = model.desktopGroupCount;
                this.networkPackageCount = model.networkPackageCount;
                this.policyGroupCount = model.policyGroupCount;
                this.regionId = model.regionId;
            } 

            /**
             * AssignedEndUserCount.
             */
            public Builder assignedEndUserCount(Long assignedEndUserCount) {
                this.assignedEndUserCount = assignedEndUserCount;
                return this;
            }

            /**
             * ConnectedEndUserCount.
             */
            public Builder connectedEndUserCount(Long connectedEndUserCount) {
                this.connectedEndUserCount = connectedEndUserCount;
                return this;
            }

            /**
             * DesktopCount.
             */
            public Builder desktopCount(Long desktopCount) {
                this.desktopCount = desktopCount;
                return this;
            }

            /**
             * DesktopGroupCount.
             */
            public Builder desktopGroupCount(Long desktopGroupCount) {
                this.desktopGroupCount = desktopGroupCount;
                return this;
            }

            /**
             * NetworkPackageCount.
             */
            public Builder networkPackageCount(Long networkPackageCount) {
                this.networkPackageCount = networkPackageCount;
                return this;
            }

            /**
             * PolicyGroupCount.
             */
            public Builder policyGroupCount(Long policyGroupCount) {
                this.policyGroupCount = policyGroupCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionStatistics build() {
                return new RegionStatistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourceStatisticByRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourceStatisticByRegionResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionStatistics")
        private java.util.List<RegionStatistics> regionStatistics;

        private Statistic(Builder builder) {
            this.regionStatistics = builder.regionStatistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return regionStatistics
         */
        public java.util.List<RegionStatistics> getRegionStatistics() {
            return this.regionStatistics;
        }

        public static final class Builder {
            private java.util.List<RegionStatistics> regionStatistics; 

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.regionStatistics = model.regionStatistics;
            } 

            /**
             * RegionStatistics.
             */
            public Builder regionStatistics(java.util.List<RegionStatistics> regionStatistics) {
                this.regionStatistics = regionStatistics;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
}
