// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ListRCVClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListRCVClustersResponseBody</p>
 */
public class ListRCVClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VClusters")
    private java.util.List<VClusters> vClusters;

    private ListRCVClustersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vClusters = builder.vClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRCVClustersResponseBody create() {
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
     * @return vClusters
     */
    public java.util.List<VClusters> getVClusters() {
        return this.vClusters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<VClusters> vClusters; 

        private Builder() {
        } 

        private Builder(ListRCVClustersResponseBody model) {
            this.requestId = model.requestId;
            this.vClusters = model.vClusters;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VClusters.
         */
        public Builder vClusters(java.util.List<VClusters> vClusters) {
            this.vClusters = vClusters;
            return this;
        }

        public ListRCVClustersResponseBody build() {
            return new ListRCVClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRCVClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListRCVClustersResponseBody</p>
     */
    public static class VClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Long instanceCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SupportDiskPerformanceLevel")
        private java.util.List<String> supportDiskPerformanceLevel;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private VClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.instanceCount = builder.instanceCount;
            this.regionId = builder.regionId;
            this.supportDiskPerformanceLevel = builder.supportDiskPerformanceLevel;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceCount
         */
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return supportDiskPerformanceLevel
         */
        public java.util.List<String> getSupportDiskPerformanceLevel() {
            return this.supportDiskPerformanceLevel;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private Long instanceCount; 
            private String regionId; 
            private java.util.List<String> supportDiskPerformanceLevel; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(VClusters model) {
                this.clusterId = model.clusterId;
                this.instanceCount = model.instanceCount;
                this.regionId = model.regionId;
                this.supportDiskPerformanceLevel = model.supportDiskPerformanceLevel;
                this.vpcId = model.vpcId;
            } 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Long instanceCount) {
                this.instanceCount = instanceCount;
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
             * SupportDiskPerformanceLevel.
             */
            public Builder supportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
                this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VClusters build() {
                return new VClusters(this);
            } 

        } 

    }
}
