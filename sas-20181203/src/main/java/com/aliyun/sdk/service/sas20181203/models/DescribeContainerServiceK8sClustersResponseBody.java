// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerServiceK8sClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeContainerServiceK8sClustersResponseBody</p>
 */
public class DescribeContainerServiceK8sClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("K8sClusters")
    private java.util.List < K8sClusters> k8sClusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeContainerServiceK8sClustersResponseBody(Builder builder) {
        this.k8sClusters = builder.k8sClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerServiceK8sClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return k8sClusters
     */
    public java.util.List < K8sClusters> getK8sClusters() {
        return this.k8sClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < K8sClusters> k8sClusters; 
        private String requestId; 

        /**
         * <p>The information about the clusters.</p>
         */
        public Builder k8sClusters(java.util.List < K8sClusters> k8sClusters) {
            this.k8sClusters = k8sClusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeContainerServiceK8sClustersResponseBody build() {
            return new DescribeContainerServiceK8sClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerServiceK8sClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeContainerServiceK8sClustersResponseBody</p>
     */
    public static class K8sClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private K8sClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static K8sClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String clusterId; 
            private String name; 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cdbbe7aa56cbf4b8f830f83718d26****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public K8sClusters build() {
                return new K8sClusters(this);
            } 

        } 

    }
}
