// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAckClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAckClustersResponseBody</p>
 */
public class DescribeAckClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAckClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAckClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAckClustersResponseBody model) {
            this.clusters = model.clusters;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of ACK clusters.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5DDD596-1191-5F36-A504-8733045A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAckClustersResponseBody build() {
            return new DescribeAckClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAckClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAckClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterSpec")
        private String clusterSpec;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("Network")
        private String network;

        @com.aliyun.core.annotation.NameInMap("Profile")
        private String profile;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterSpec = builder.clusterSpec;
            this.clusterType = builder.clusterType;
            this.memberUid = builder.memberUid;
            this.network = builder.network;
            this.profile = builder.profile;
            this.regionId = builder.regionId;
            this.state = builder.state;
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
         * @return clusterSpec
         */
        public String getClusterSpec() {
            return this.clusterSpec;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return network
         */
        public String getNetwork() {
            return this.network;
        }

        /**
         * @return profile
         */
        public String getProfile() {
            return this.profile;
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
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterSpec; 
            private String clusterType; 
            private String memberUid; 
            private String network; 
            private String profile; 
            private String regionId; 
            private String state; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterSpec = model.clusterSpec;
                this.clusterType = model.clusterType;
                this.memberUid = model.memberUid;
                this.network = model.network;
                this.profile = model.profile;
                this.regionId = model.regionId;
                this.state = model.state;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cb0f5640b1b2d404cad6ba21509d7847b</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-cluster-name</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The specification of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ack.pro.small</p>
             */
            public Builder clusterSpec(String clusterSpec) {
                this.clusterSpec = clusterSpec;
                return this;
            }

            /**
             * <p>The type of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
             * <ul>
             * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Returns a list of ACK clusters in your account that meet specific criteria, such as the cluster type and specifications.</li>
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
             * <p>The Alibaba Cloud UID of the account to which the ACK cluster resources belong.</p>
             * 
             * <strong>example:</strong>
             * <p>135809047715****</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The network plugin of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
             * <ul>
             * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Lists the ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>terway-eniip</p>
             */
            public Builder network(String network) {
                this.network = network;
                return this;
            }

            /**
             * <p>The subtype of the cluster. This parameter is available only when <code>ClusterType</code> is set to <code>ManagedKubernetes</code>. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
             * <ul>
             * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Lists ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder profile(String profile) {
                this.profile = profile;
                return this;
            }

            /**
             * <p>The region ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The running status of the ACK cluster. For more information about the valid values, see <a href="~~DescribeClustersV1~~">DescribeClustersV1</a>.</p>
             * <ul>
             * <li><a href="~~DescribeClustersV1~~">DescribeClustersV1</a>: Retrieves a list of ACK clusters in your account that meet specified conditions, such as cluster type and specifications.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The ID of the VPC where the ACK cluster is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2vcg932hsxsxuqbgl****</p>
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
