// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsPerformanceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsPerformanceSummaryResponseBody</p>
 */
public class DescribeRdsPerformanceSummaryResponseBody extends TeaModel {
    @NameInMap("RdsPerformanceInfos")
    private java.util.List < RdsPerformanceInfos> rdsPerformanceInfos;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeRdsPerformanceSummaryResponseBody(Builder builder) {
        this.rdsPerformanceInfos = builder.rdsPerformanceInfos;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsPerformanceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return rdsPerformanceInfos
     */
    public java.util.List < RdsPerformanceInfos> getRdsPerformanceInfos() {
        return this.rdsPerformanceInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < RdsPerformanceInfos> rdsPerformanceInfos; 
        private String requestId; 
        private Boolean success; 

        /**
         * A collection of objects.
         */
        public Builder rdsPerformanceInfos(java.util.List < RdsPerformanceInfos> rdsPerformanceInfos) {
            this.rdsPerformanceInfos = rdsPerformanceInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the API request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRdsPerformanceSummaryResponseBody build() {
            return new DescribeRdsPerformanceSummaryResponseBody(this);
        } 

    } 

    public static class RdsPerformanceInfos extends TeaModel {
        @NameInMap("ActiveSessions")
        private Integer activeSessions;

        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Iops")
        private Float iops;

        @NameInMap("RdsId")
        private String rdsId;

        @NameInMap("SpaceUsage")
        private Long spaceUsage;

        @NameInMap("TotalSessions")
        private Integer totalSessions;

        private RdsPerformanceInfos(Builder builder) {
            this.activeSessions = builder.activeSessions;
            this.cpu = builder.cpu;
            this.iops = builder.iops;
            this.rdsId = builder.rdsId;
            this.spaceUsage = builder.spaceUsage;
            this.totalSessions = builder.totalSessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsPerformanceInfos create() {
            return builder().build();
        }

        /**
         * @return activeSessions
         */
        public Integer getActiveSessions() {
            return this.activeSessions;
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return iops
         */
        public Float getIops() {
            return this.iops;
        }

        /**
         * @return rdsId
         */
        public String getRdsId() {
            return this.rdsId;
        }

        /**
         * @return spaceUsage
         */
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        /**
         * @return totalSessions
         */
        public Integer getTotalSessions() {
            return this.totalSessions;
        }

        public static final class Builder {
            private Integer activeSessions; 
            private Float cpu; 
            private Float iops; 
            private String rdsId; 
            private Long spaceUsage; 
            private Integer totalSessions; 

            /**
             * The number of active sessions of the RDS instance.
             */
            public Builder activeSessions(Integer activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * The CPU utilization of an RDS instance.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The IOPS of the RDS instance.
             */
            public Builder iops(Float iops) {
                this.iops = iops;
                return this;
            }

            /**
             * The ID of an RDS instance.
             */
            public Builder rdsId(String rdsId) {
                this.rdsId = rdsId;
                return this;
            }

            /**
             * The disk usage of apsaradb for RDS. Unit: MB.
             */
            public Builder spaceUsage(Long spaceUsage) {
                this.spaceUsage = spaceUsage;
                return this;
            }

            /**
             * The total number of current RDS sessions.
             */
            public Builder totalSessions(Integer totalSessions) {
                this.totalSessions = totalSessions;
                return this;
            }

            public RdsPerformanceInfos build() {
                return new RdsPerformanceInfos(this);
            } 

        } 

    }
}
