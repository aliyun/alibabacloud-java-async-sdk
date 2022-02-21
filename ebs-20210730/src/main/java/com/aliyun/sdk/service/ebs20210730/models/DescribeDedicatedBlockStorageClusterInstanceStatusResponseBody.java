// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody</p>
 */
public class DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody extends TeaModel {
    @NameInMap("DbscInstanceStatus")
    private DbscInstanceStatus dbscInstanceStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody(Builder builder) {
        this.dbscInstanceStatus = builder.dbscInstanceStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody build() {
            return new DescribeDedicatedBlockStorageClusterInstanceStatusResponseBody(this);
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
             * cluster name of the dbsc
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * status of health
             */
            public Builder clusterOpsStatus(String clusterOpsStatus) {
                this.clusterOpsStatus = clusterOpsStatus;
                return this;
            }

            /**
             * Id of the dbsc
             */
            public Builder dbscId(String dbscId) {
                this.dbscId = dbscId;
                return this;
            }

            /**
             * deploy status of the dbsc
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * free size of the dbsc
             */
            public Builder freeSize(Long freeSize) {
                this.freeSize = freeSize;
                return this;
            }

            /**
             * server count of the dbsc
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * sold ratio of the dbsc
             */
            public Builder soldRatio(Double soldRatio) {
                this.soldRatio = soldRatio;
                return this;
            }

            /**
             * sold size of the dbsc
             */
            public Builder soldSize(Long soldSize) {
                this.soldSize = soldSize;
                return this;
            }

            /**
             * capacity of the dbsc
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
