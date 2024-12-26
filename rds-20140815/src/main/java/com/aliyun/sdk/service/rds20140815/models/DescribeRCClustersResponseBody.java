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
 * {@link DescribeRCClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCClustersResponseBody</p>
 */
public class DescribeRCClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private String requestId; 

        /**
         * <p>The information about the clusters.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2875D608-A228-53D7-B8C9-35F13EDCF36D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCClustersResponseBody build() {
            return new DescribeRCClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
            this.profile = builder.profile;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String createTime; 
            private String profile; 
            private String status; 
            private String vpcId; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-30T02:16:04Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Profile.
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The cluster status. Valid values:</p>
             * <ul>
             * <li><strong>Pending</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Starting</strong></li>
             * <li><strong>Stopping</strong></li>
             * <li><strong>Stopped</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
