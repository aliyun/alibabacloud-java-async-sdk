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
 * {@link DescribeEdgeContainerAppStatsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeContainerAppStatsResponseBody</p>
 */
public class DescribeEdgeContainerAppStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuUsageSecondsQuotaRateAvg")
    private Double cpuUsageSecondsQuotaRateAvg;

    @com.aliyun.core.annotation.NameInMap("CpuUsageSecondsTotalAvg")
    private Double cpuUsageSecondsTotalAvg;

    @com.aliyun.core.annotation.NameInMap("FsReadsBytesAvgAvg")
    private Double fsReadsBytesAvgAvg;

    @com.aliyun.core.annotation.NameInMap("FsWritesBytesAvgAvg")
    private Double fsWritesBytesAvgAvg;

    @com.aliyun.core.annotation.NameInMap("MemoryRssAvg")
    private Double memoryRssAvg;

    @com.aliyun.core.annotation.NameInMap("MemoryRssQuotaRateAvg")
    private Double memoryRssQuotaRateAvg;

    @com.aliyun.core.annotation.NameInMap("PodReadyRateAvg")
    private Double podReadyRateAvg;

    @com.aliyun.core.annotation.NameInMap("Points")
    private java.util.List<Points> points;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEdgeContainerAppStatsResponseBody(Builder builder) {
        this.cpuUsageSecondsQuotaRateAvg = builder.cpuUsageSecondsQuotaRateAvg;
        this.cpuUsageSecondsTotalAvg = builder.cpuUsageSecondsTotalAvg;
        this.fsReadsBytesAvgAvg = builder.fsReadsBytesAvgAvg;
        this.fsWritesBytesAvgAvg = builder.fsWritesBytesAvgAvg;
        this.memoryRssAvg = builder.memoryRssAvg;
        this.memoryRssQuotaRateAvg = builder.memoryRssQuotaRateAvg;
        this.podReadyRateAvg = builder.podReadyRateAvg;
        this.points = builder.points;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeContainerAppStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuUsageSecondsQuotaRateAvg
     */
    public Double getCpuUsageSecondsQuotaRateAvg() {
        return this.cpuUsageSecondsQuotaRateAvg;
    }

    /**
     * @return cpuUsageSecondsTotalAvg
     */
    public Double getCpuUsageSecondsTotalAvg() {
        return this.cpuUsageSecondsTotalAvg;
    }

    /**
     * @return fsReadsBytesAvgAvg
     */
    public Double getFsReadsBytesAvgAvg() {
        return this.fsReadsBytesAvgAvg;
    }

    /**
     * @return fsWritesBytesAvgAvg
     */
    public Double getFsWritesBytesAvgAvg() {
        return this.fsWritesBytesAvgAvg;
    }

    /**
     * @return memoryRssAvg
     */
    public Double getMemoryRssAvg() {
        return this.memoryRssAvg;
    }

    /**
     * @return memoryRssQuotaRateAvg
     */
    public Double getMemoryRssQuotaRateAvg() {
        return this.memoryRssQuotaRateAvg;
    }

    /**
     * @return podReadyRateAvg
     */
    public Double getPodReadyRateAvg() {
        return this.podReadyRateAvg;
    }

    /**
     * @return points
     */
    public java.util.List<Points> getPoints() {
        return this.points;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Double cpuUsageSecondsQuotaRateAvg; 
        private Double cpuUsageSecondsTotalAvg; 
        private Double fsReadsBytesAvgAvg; 
        private Double fsWritesBytesAvgAvg; 
        private Double memoryRssAvg; 
        private Double memoryRssQuotaRateAvg; 
        private Double podReadyRateAvg; 
        private java.util.List<Points> points; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEdgeContainerAppStatsResponseBody model) {
            this.cpuUsageSecondsQuotaRateAvg = model.cpuUsageSecondsQuotaRateAvg;
            this.cpuUsageSecondsTotalAvg = model.cpuUsageSecondsTotalAvg;
            this.fsReadsBytesAvgAvg = model.fsReadsBytesAvgAvg;
            this.fsWritesBytesAvgAvg = model.fsWritesBytesAvgAvg;
            this.memoryRssAvg = model.memoryRssAvg;
            this.memoryRssQuotaRateAvg = model.memoryRssQuotaRateAvg;
            this.podReadyRateAvg = model.podReadyRateAvg;
            this.points = model.points;
            this.requestId = model.requestId;
        } 

        /**
         * CpuUsageSecondsQuotaRateAvg.
         */
        public Builder cpuUsageSecondsQuotaRateAvg(Double cpuUsageSecondsQuotaRateAvg) {
            this.cpuUsageSecondsQuotaRateAvg = cpuUsageSecondsQuotaRateAvg;
            return this;
        }

        /**
         * CpuUsageSecondsTotalAvg.
         */
        public Builder cpuUsageSecondsTotalAvg(Double cpuUsageSecondsTotalAvg) {
            this.cpuUsageSecondsTotalAvg = cpuUsageSecondsTotalAvg;
            return this;
        }

        /**
         * FsReadsBytesAvgAvg.
         */
        public Builder fsReadsBytesAvgAvg(Double fsReadsBytesAvgAvg) {
            this.fsReadsBytesAvgAvg = fsReadsBytesAvgAvg;
            return this;
        }

        /**
         * FsWritesBytesAvgAvg.
         */
        public Builder fsWritesBytesAvgAvg(Double fsWritesBytesAvgAvg) {
            this.fsWritesBytesAvgAvg = fsWritesBytesAvgAvg;
            return this;
        }

        /**
         * MemoryRssAvg.
         */
        public Builder memoryRssAvg(Double memoryRssAvg) {
            this.memoryRssAvg = memoryRssAvg;
            return this;
        }

        /**
         * MemoryRssQuotaRateAvg.
         */
        public Builder memoryRssQuotaRateAvg(Double memoryRssQuotaRateAvg) {
            this.memoryRssQuotaRateAvg = memoryRssQuotaRateAvg;
            return this;
        }

        /**
         * PodReadyRateAvg.
         */
        public Builder podReadyRateAvg(Double podReadyRateAvg) {
            this.podReadyRateAvg = podReadyRateAvg;
            return this;
        }

        /**
         * Points.
         */
        public Builder points(java.util.List<Points> points) {
            this.points = points;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEdgeContainerAppStatsResponseBody build() {
            return new DescribeEdgeContainerAppStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeContainerAppStatsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeContainerAppStatsResponseBody</p>
     */
    public static class Points extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerCpuUsageSecondsQuotaRate")
        private Double containerCpuUsageSecondsQuotaRate;

        @com.aliyun.core.annotation.NameInMap("ContainerCpuUsageSecondsTotal")
        private Double containerCpuUsageSecondsTotal;

        @com.aliyun.core.annotation.NameInMap("ContainerFsReadsBytesAvg")
        private Double containerFsReadsBytesAvg;

        @com.aliyun.core.annotation.NameInMap("ContainerFsWritesBytesAvg")
        private Double containerFsWritesBytesAvg;

        @com.aliyun.core.annotation.NameInMap("ContainerMemoryRss")
        private Double containerMemoryRss;

        @com.aliyun.core.annotation.NameInMap("ContainerMemoryRssQuotaRate")
        private Double containerMemoryRssQuotaRate;

        @com.aliyun.core.annotation.NameInMap("PodReadyRate")
        private Double podReadyRate;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Points(Builder builder) {
            this.containerCpuUsageSecondsQuotaRate = builder.containerCpuUsageSecondsQuotaRate;
            this.containerCpuUsageSecondsTotal = builder.containerCpuUsageSecondsTotal;
            this.containerFsReadsBytesAvg = builder.containerFsReadsBytesAvg;
            this.containerFsWritesBytesAvg = builder.containerFsWritesBytesAvg;
            this.containerMemoryRss = builder.containerMemoryRss;
            this.containerMemoryRssQuotaRate = builder.containerMemoryRssQuotaRate;
            this.podReadyRate = builder.podReadyRate;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Points create() {
            return builder().build();
        }

        /**
         * @return containerCpuUsageSecondsQuotaRate
         */
        public Double getContainerCpuUsageSecondsQuotaRate() {
            return this.containerCpuUsageSecondsQuotaRate;
        }

        /**
         * @return containerCpuUsageSecondsTotal
         */
        public Double getContainerCpuUsageSecondsTotal() {
            return this.containerCpuUsageSecondsTotal;
        }

        /**
         * @return containerFsReadsBytesAvg
         */
        public Double getContainerFsReadsBytesAvg() {
            return this.containerFsReadsBytesAvg;
        }

        /**
         * @return containerFsWritesBytesAvg
         */
        public Double getContainerFsWritesBytesAvg() {
            return this.containerFsWritesBytesAvg;
        }

        /**
         * @return containerMemoryRss
         */
        public Double getContainerMemoryRss() {
            return this.containerMemoryRss;
        }

        /**
         * @return containerMemoryRssQuotaRate
         */
        public Double getContainerMemoryRssQuotaRate() {
            return this.containerMemoryRssQuotaRate;
        }

        /**
         * @return podReadyRate
         */
        public Double getPodReadyRate() {
            return this.podReadyRate;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private Double containerCpuUsageSecondsQuotaRate; 
            private Double containerCpuUsageSecondsTotal; 
            private Double containerFsReadsBytesAvg; 
            private Double containerFsWritesBytesAvg; 
            private Double containerMemoryRss; 
            private Double containerMemoryRssQuotaRate; 
            private Double podReadyRate; 
            private String time; 

            private Builder() {
            } 

            private Builder(Points model) {
                this.containerCpuUsageSecondsQuotaRate = model.containerCpuUsageSecondsQuotaRate;
                this.containerCpuUsageSecondsTotal = model.containerCpuUsageSecondsTotal;
                this.containerFsReadsBytesAvg = model.containerFsReadsBytesAvg;
                this.containerFsWritesBytesAvg = model.containerFsWritesBytesAvg;
                this.containerMemoryRss = model.containerMemoryRss;
                this.containerMemoryRssQuotaRate = model.containerMemoryRssQuotaRate;
                this.podReadyRate = model.podReadyRate;
                this.time = model.time;
            } 

            /**
             * ContainerCpuUsageSecondsQuotaRate.
             */
            public Builder containerCpuUsageSecondsQuotaRate(Double containerCpuUsageSecondsQuotaRate) {
                this.containerCpuUsageSecondsQuotaRate = containerCpuUsageSecondsQuotaRate;
                return this;
            }

            /**
             * ContainerCpuUsageSecondsTotal.
             */
            public Builder containerCpuUsageSecondsTotal(Double containerCpuUsageSecondsTotal) {
                this.containerCpuUsageSecondsTotal = containerCpuUsageSecondsTotal;
                return this;
            }

            /**
             * ContainerFsReadsBytesAvg.
             */
            public Builder containerFsReadsBytesAvg(Double containerFsReadsBytesAvg) {
                this.containerFsReadsBytesAvg = containerFsReadsBytesAvg;
                return this;
            }

            /**
             * ContainerFsWritesBytesAvg.
             */
            public Builder containerFsWritesBytesAvg(Double containerFsWritesBytesAvg) {
                this.containerFsWritesBytesAvg = containerFsWritesBytesAvg;
                return this;
            }

            /**
             * ContainerMemoryRss.
             */
            public Builder containerMemoryRss(Double containerMemoryRss) {
                this.containerMemoryRss = containerMemoryRss;
                return this;
            }

            /**
             * ContainerMemoryRssQuotaRate.
             */
            public Builder containerMemoryRssQuotaRate(Double containerMemoryRssQuotaRate) {
                this.containerMemoryRssQuotaRate = containerMemoryRssQuotaRate;
                return this;
            }

            /**
             * PodReadyRate.
             */
            public Builder podReadyRate(Double podReadyRate) {
                this.podReadyRate = podReadyRate;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Points build() {
                return new Points(this);
            } 

        } 

    }
}
