// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterInfoListResponseBody</p>
 */
public class DescribeClusterInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterList")
    private java.util.List < ClusterList> clusterList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterInfoListResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterInfoListResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterList
     */
    public java.util.List < ClusterList> getClusterList() {
        return this.clusterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ClusterList> clusterList; 
        private String requestId; 

        /**
         * <p>An array that consists of the information about clusters.</p>
         */
        public Builder clusterList(java.util.List < ClusterList> clusterList) {
            this.clusterList = clusterList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterInfoListResponseBody build() {
            return new DescribeClusterInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterInfoListResponseBody</p>
     */
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TargetResult")
        private Boolean targetResult;

        private ClusterList(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.regionId = builder.regionId;
            this.state = builder.state;
            this.targetResult = builder.targetResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
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
            private String regionId; 
            private String state; 
            private Boolean targetResult; 

            /**
             * <p>The ID of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cfeb7a9f99ce740e98c5595d0fe37****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test111</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li><strong>ManagedKubernetes</strong>: managed Kubernetes cluster.</li>
             * <li><strong>NotManagedKubernetes</strong>: non-managed Kubernetes cluster.</li>
             * <li><strong>PrivateKubernetes</strong>: private cluster.</li>
             * <li><strong>kubernetes</strong>: dedicated Kubernetes cluster.</li>
             * <li><strong>ask</strong>: dedicated serverless Kubernetes (ASK) cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The region in which the cluster resides.</p>
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
             * <li><strong>unavailable</strong>: The cluster is unavailable.</li>
             * <li><strong>Available</strong>: The cluster is available.</li>
             * <li><strong>Creating</strong>: The cluster is being created.</li>
             * <li><strong>CreateFailed</strong>: The cluster failed to be created.</li>
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
             * <p>Indicates whether container network topology was enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder targetResult(Boolean targetResult) {
                this.targetResult = targetResult;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
}
