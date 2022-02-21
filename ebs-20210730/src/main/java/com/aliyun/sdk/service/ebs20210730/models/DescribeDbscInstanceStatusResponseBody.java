// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbscInstanceStatusResponseBody</p>
 */
public class DescribeDbscInstanceStatusResponseBody extends TeaModel {
    @NameInMap("DbscInstanceStatus")
    private DbscInstanceStatus dbscInstanceStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDbscInstanceStatusResponseBody(Builder builder) {
        this.dbscInstanceStatus = builder.dbscInstanceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbscInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbscInstanceStatus
     */
    public DbscInstanceStatus getDbscInstanceStatus() {
        return this.dbscInstanceStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DbscInstanceStatus dbscInstanceStatus; 
        private String requestId; 

        /**
         * DbscInstanceStatus.
         */
        public Builder dbscInstanceStatus(DbscInstanceStatus dbscInstanceStatus) {
            this.dbscInstanceStatus = dbscInstanceStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbscInstanceStatusResponseBody build() {
            return new DescribeDbscInstanceStatusResponseBody(this);
        } 

    } 

    public static class DbscInstanceStatus extends TeaModel {
        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterOpsStatus")
        private String clusterOpsStatus;

        @NameInMap("DbscId")
        private String dbscId;

        @NameInMap("DeployStatus")
        private String deployStatus;

        @NameInMap("FreeSize")
        private Long freeSize;

        @NameInMap("ServerCount")
        private Long serverCount;

        @NameInMap("SoldRatio")
        private Double soldRatio;

        @NameInMap("SoldSize")
        private Long soldSize;

        @NameInMap("TotalSize")
        private Long totalSize;

        private DbscInstanceStatus(Builder builder) {
            this.clusterName = builder.clusterName;
            this.clusterOpsStatus = builder.clusterOpsStatus;
            this.dbscId = builder.dbscId;
            this.deployStatus = builder.deployStatus;
            this.freeSize = builder.freeSize;
            this.serverCount = builder.serverCount;
            this.soldRatio = builder.soldRatio;
            this.soldSize = builder.soldSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbscInstanceStatus create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterOpsStatus
         */
        public String getClusterOpsStatus() {
            return this.clusterOpsStatus;
        }

        /**
         * @return dbscId
         */
        public String getDbscId() {
            return this.dbscId;
        }

        /**
         * @return deployStatus
         */
        public String getDeployStatus() {
            return this.deployStatus;
        }

        /**
         * @return freeSize
         */
        public Long getFreeSize() {
            return this.freeSize;
        }

        /**
         * @return serverCount
         */
        public Long getServerCount() {
            return this.serverCount;
        }

        /**
         * @return soldRatio
         */
        public Double getSoldRatio() {
            return this.soldRatio;
        }

        /**
         * @return soldSize
         */
        public Long getSoldSize() {
            return this.soldSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String clusterName; 
            private String clusterOpsStatus; 
            private String dbscId; 
            private String deployStatus; 
            private Long freeSize; 
            private Long serverCount; 
            private Double soldRatio; 
            private Long soldSize; 
            private Long totalSize; 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterOpsStatus.
             */
            public Builder clusterOpsStatus(String clusterOpsStatus) {
                this.clusterOpsStatus = clusterOpsStatus;
                return this;
            }

            /**
             * DbscId.
             */
            public Builder dbscId(String dbscId) {
                this.dbscId = dbscId;
                return this;
            }

            /**
             * DeployStatus.
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * FreeSize.
             */
            public Builder freeSize(Long freeSize) {
                this.freeSize = freeSize;
                return this;
            }

            /**
             * ServerCount.
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * SoldRatio.
             */
            public Builder soldRatio(Double soldRatio) {
                this.soldRatio = soldRatio;
                return this;
            }

            /**
             * SoldSize.
             */
            public Builder soldSize(Long soldSize) {
                this.soldSize = soldSize;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public DbscInstanceStatus build() {
                return new DbscInstanceStatus(this);
            } 

        } 

    }
}
