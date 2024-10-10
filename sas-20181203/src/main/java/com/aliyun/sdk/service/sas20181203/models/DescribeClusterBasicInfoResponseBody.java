// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterBasicInfoResponseBody</p>
 */
public class DescribeClusterBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterInfo")
    private ClusterInfo clusterInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterBasicInfoResponseBody(Builder builder) {
        this.clusterInfo = builder.clusterInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBasicInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterInfo
     */
    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterInfo clusterInfo; 
        private String requestId; 

        /**
         * <p>The detailed information about the cluster.</p>
         */
        public Builder clusterInfo(ClusterInfo clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterBasicInfoResponseBody build() {
            return new DescribeClusterBasicInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterBasicInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterBasicInfoResponseBody</p>
     */
    public static class ClusterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TargetResult")
        private Boolean targetResult;

        private ClusterInfo(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.currentVersion = builder.currentVersion;
            this.instanceCount = builder.instanceCount;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.targetResult = builder.targetResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfo create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetResult
         */
        public Boolean getTargetResult() {
            return this.targetResult;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private Long createTime; 
            private String currentVersion; 
            private Integer instanceCount; 
            private String regionId; 
            private String state; 
            private Boolean targetResult; 

            /**
             * <p>The ID of cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c870ec78ecbcb41d2a35c679823ef****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>testackpro</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>ManagedKubernetes</strong>: managed Kubernetes cluster</li>
             * <li><strong>NotManagedKubernetes</strong>: non-managed Kubernetes cluster</li>
             * <li><strong>PrivateKubernetes</strong>: private cluster</li>
             * <li><strong>kubernetes</strong>: dedicated Kubernetes cluster</li>
             * <li><strong>ask</strong>: dedicated ASK cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1662038134000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The version of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1.22.10-aliyun.1</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The number of instances in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The ID of the region in which the cluster is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>unavailable</strong></li>
             * <li><strong>Available</strong></li>
             * <li><strong>Creating</strong></li>
             * <li><strong>CreateFailed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>Indicates whether the cluster is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The cluster is enabled.</li>
             * <li><strong>false</strong>: The cluster is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder targetResult(Boolean targetResult) {
                this.targetResult = targetResult;
                return this;
            }

            public ClusterInfo build() {
                return new ClusterInfo(this);
            } 

        } 

    }
}
