// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbscInstanceResponseBody</p>
 */
public class DescribeDbscInstanceResponseBody extends TeaModel {
    @NameInMap("Dbsc")
    private Dbsc dbsc;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDbscInstanceResponseBody(Builder builder) {
        this.dbsc = builder.dbsc;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbscInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbsc
     */
    public Dbsc getDbsc() {
        return this.dbsc;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Dbsc dbsc; 
        private String requestId; 

        /**
         * Dbsc.
         */
        public Builder dbsc(Dbsc dbsc) {
            this.dbsc = dbsc;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbscInstanceResponseBody build() {
            return new DescribeDbscInstanceResponseBody(this);
        } 

    } 

    public static class Dbsc extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("Cluster")
        private String cluster;

        @NameInMap("DbscId")
        private String dbscId;

        @NameInMap("DbscName")
        private String dbscName;

        @NameInMap("DeployStatus")
        private String deployStatus;

        @NameInMap("FreeSize")
        private Long freeSize;

        @NameInMap("IoType")
        private String ioType;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ServerCount")
        private Long serverCount;

        @NameInMap("SoldRatio")
        private Double soldRatio;

        @NameInMap("SoldSize")
        private Long soldSize;

        @NameInMap("Status")
        private String status;

        private Dbsc(Builder builder) {
            this.capacity = builder.capacity;
            this.cluster = builder.cluster;
            this.dbscId = builder.dbscId;
            this.dbscName = builder.dbscName;
            this.deployStatus = builder.deployStatus;
            this.freeSize = builder.freeSize;
            this.ioType = builder.ioType;
            this.performanceLevel = builder.performanceLevel;
            this.serverCount = builder.serverCount;
            this.soldRatio = builder.soldRatio;
            this.soldSize = builder.soldSize;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dbsc create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return dbscId
         */
        public String getDbscId() {
            return this.dbscId;
        }

        /**
         * @return dbscName
         */
        public String getDbscName() {
            return this.dbscName;
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
         * @return ioType
         */
        public String getIoType() {
            return this.ioType;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long capacity; 
            private String cluster; 
            private String dbscId; 
            private String dbscName; 
            private String deployStatus; 
            private Long freeSize; 
            private String ioType; 
            private String performanceLevel; 
            private Long serverCount; 
            private Double soldRatio; 
            private Long soldSize; 
            private String status; 

            /**
             * capacity of the dbsc
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * cluster of the dbsc
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
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
             * name of the dbsc
             */
            public Builder dbscName(String dbscName) {
                this.dbscName = dbscName;
                return this;
            }

            /**
             * deployStatus of the dbsc
             */
            public Builder deployStatus(String deployStatus) {
                this.deployStatus = deployStatus;
                return this;
            }

            /**
             * freeSize of the dbsc
             */
            public Builder freeSize(Long freeSize) {
                this.freeSize = freeSize;
                return this;
            }

            /**
             * ioType of the dbsc
             */
            public Builder ioType(String ioType) {
                this.ioType = ioType;
                return this;
            }

            /**
             * performanceLevel of the dbsc
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * serverCount of the dbsc
             */
            public Builder serverCount(Long serverCount) {
                this.serverCount = serverCount;
                return this;
            }

            /**
             * soldRatio of the dbsc
             */
            public Builder soldRatio(Double soldRatio) {
                this.soldRatio = soldRatio;
                return this;
            }

            /**
             * soldSize of the dbsc
             */
            public Builder soldSize(Long soldSize) {
                this.soldSize = soldSize;
                return this;
            }

            /**
             * status of the dbsc
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Dbsc build() {
                return new Dbsc(this);
            } 

        } 

    }
}
