// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedBlockStorageClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDedicatedBlockStorageClustersResponseBody</p>
 */
public class DescribeDedicatedBlockStorageClustersResponseBody extends TeaModel {
    @NameInMap("DedicatedBlockStorageClusters")
    private java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDedicatedBlockStorageClustersResponseBody(Builder builder) {
        this.dedicatedBlockStorageClusters = builder.dedicatedBlockStorageClusters;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedBlockStorageClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedBlockStorageClusters
     */
    public java.util.List < DedicatedBlockStorageClusters> getDedicatedBlockStorageClusters() {
        return this.dedicatedBlockStorageClusters;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters; 
        private String nextToken; 
        private String requestId; 

        /**
         * DedicatedBlockStorageClusters.
         */
        public Builder dedicatedBlockStorageClusters(java.util.List < DedicatedBlockStorageClusters> dedicatedBlockStorageClusters) {
            this.dedicatedBlockStorageClusters = dedicatedBlockStorageClusters;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDedicatedBlockStorageClustersResponseBody build() {
            return new DescribeDedicatedBlockStorageClustersResponseBody(this);
        } 

    } 

    public static class DedicatedBlockStorageClusters extends TeaModel {
        @NameInMap("Azone")
        private String azone;

        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("DbscId")
        private String dbscId;

        @NameInMap("DbscName")
        private String dbscName;

        @NameInMap("IoType")
        private String ioType;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        private DedicatedBlockStorageClusters(Builder builder) {
            this.azone = builder.azone;
            this.capacity = builder.capacity;
            this.dbscId = builder.dbscId;
            this.dbscName = builder.dbscName;
            this.ioType = builder.ioType;
            this.performanceLevel = builder.performanceLevel;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DedicatedBlockStorageClusters create() {
            return builder().build();
        }

        /**
         * @return azone
         */
        public String getAzone() {
            return this.azone;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String azone; 
            private Long capacity; 
            private String dbscId; 
            private String dbscName; 
            private String ioType; 
            private String performanceLevel; 
            private String region; 
            private String status; 

            /**
             * Azone.
             */
            public Builder azone(String azone) {
                this.azone = azone;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
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
             * DbscName.
             */
            public Builder dbscName(String dbscName) {
                this.dbscName = dbscName;
                return this;
            }

            /**
             * IoType.
             */
            public Builder ioType(String ioType) {
                this.ioType = ioType;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DedicatedBlockStorageClusters build() {
                return new DedicatedBlockStorageClusters(this);
            } 

        } 

    }
}
