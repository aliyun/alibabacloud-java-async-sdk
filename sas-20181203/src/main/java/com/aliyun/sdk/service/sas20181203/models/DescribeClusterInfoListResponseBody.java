// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * An array that consists of the information about clusters.
         */
        public Builder clusterList(java.util.List < ClusterList> clusterList) {
            this.clusterList = clusterList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterInfoListResponseBody build() {
            return new DescribeClusterInfoListResponseBody(this);
        } 

    } 

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
             * The ID of the container cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the container cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   **ManagedKubernetes**: managed Kubernetes cluster.
             * *   **NotManagedKubernetes**: non-managed Kubernetes cluster.
             * *   **PrivateKubernetes**: private cluster.
             * *   **kubernetes**: dedicated Kubernetes cluster.
             * *   **ask**: dedicated serverless Kubernetes (ASK) cluster.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The region in which the cluster resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   **unavailable**: The cluster is unavailable.
             * *   **Available**: The cluster is available.
             * *   **Creating**: The cluster is being created.
             * *   **CreateFailed**: The cluster failed to be created.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Indicates whether container network topology was enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
