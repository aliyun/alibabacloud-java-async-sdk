// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeRdsPerformanceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsPerformanceSummaryResponseBody</p>
 */
public class DescribeRdsPerformanceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RdsPerformanceInfos")
    private java.util.List<RdsPerformanceInfos> rdsPerformanceInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
    public java.util.List<RdsPerformanceInfos> getRdsPerformanceInfos() {
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
        private java.util.List<RdsPerformanceInfos> rdsPerformanceInfos; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>A collection of objects.</p>
         */
        public Builder rdsPerformanceInfos(java.util.List<RdsPerformanceInfos> rdsPerformanceInfos) {
            this.rdsPerformanceInfos = rdsPerformanceInfos;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6876277-ECFD-4658-AC1E-A7FAD8******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRdsPerformanceSummaryResponseBody build() {
            return new DescribeRdsPerformanceSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRdsPerformanceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRdsPerformanceSummaryResponseBody</p>
     */
    public static class RdsPerformanceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveSessions")
        private Integer activeSessions;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Iops")
        private Float iops;

        @com.aliyun.core.annotation.NameInMap("RdsId")
        private String rdsId;

        @com.aliyun.core.annotation.NameInMap("SpaceUsage")
        private Long spaceUsage;

        @com.aliyun.core.annotation.NameInMap("TotalSessions")
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
             * <p>The number of active sessions of the RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder activeSessions(Integer activeSessions) {
                this.activeSessions = activeSessions;
                return this;
            }

            /**
             * <p>The CPU utilization of an RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0.26</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The IOPS of the RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>17.62</p>
             */
            public Builder iops(Float iops) {
                this.iops = iops;
                return this;
            }

            /**
             * <p>The ID of an RDS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-**************</p>
             */
            public Builder rdsId(String rdsId) {
                this.rdsId = rdsId;
                return this;
            }

            /**
             * <p>The disk usage of apsaradb for RDS. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>4145144777</p>
             */
            public Builder spaceUsage(Long spaceUsage) {
                this.spaceUsage = spaceUsage;
                return this;
            }

            /**
             * <p>The total number of current RDS sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>162</p>
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
