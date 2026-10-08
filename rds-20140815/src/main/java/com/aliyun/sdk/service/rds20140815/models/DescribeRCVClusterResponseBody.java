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
 * {@link DescribeRCVClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCVClusterResponseBody</p>
 */
public class DescribeRCVClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("MysqlOperator")
    private MysqlOperator mysqlOperator;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportDiskPerformanceLevel")
    private java.util.List<String> supportDiskPerformanceLevel;

    @com.aliyun.core.annotation.NameInMap("VClusterStatus")
    private String vClusterStatus;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeRCVClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.mysqlOperator = builder.mysqlOperator;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.supportDiskPerformanceLevel = builder.supportDiskPerformanceLevel;
        this.vClusterStatus = builder.vClusterStatus;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCVClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return mysqlOperator
     */
    public MysqlOperator getMysqlOperator() {
        return this.mysqlOperator;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportDiskPerformanceLevel
     */
    public java.util.List<String> getSupportDiskPerformanceLevel() {
        return this.supportDiskPerformanceLevel;
    }

    /**
     * @return vClusterStatus
     */
    public String getVClusterStatus() {
        return this.vClusterStatus;
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
        private MysqlOperator mysqlOperator; 
        private String region; 
        private String requestId; 
        private java.util.List<String> supportDiskPerformanceLevel; 
        private String vClusterStatus; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(DescribeRCVClusterResponseBody model) {
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.mysqlOperator = model.mysqlOperator;
            this.region = model.region;
            this.requestId = model.requestId;
            this.supportDiskPerformanceLevel = model.supportDiskPerformanceLevel;
            this.vClusterStatus = model.vClusterStatus;
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
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * MysqlOperator.
         */
        public Builder mysqlOperator(MysqlOperator mysqlOperator) {
            this.mysqlOperator = mysqlOperator;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * VClusterStatus.
         */
        public Builder vClusterStatus(String vClusterStatus) {
            this.vClusterStatus = vClusterStatus;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeRCVClusterResponseBody build() {
            return new DescribeRCVClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCVClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCVClusterResponseBody</p>
     */
    public static class MysqlOperator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardPublicEndpoint")
        private String dashboardPublicEndpoint;

        @com.aliyun.core.annotation.NameInMap("DashboardUsername")
        private String dashboardUsername;

        @com.aliyun.core.annotation.NameInMap("DashboardVpcEndpoint")
        private String dashboardVpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private String deployTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MysqlOperator(Builder builder) {
            this.dashboardPublicEndpoint = builder.dashboardPublicEndpoint;
            this.dashboardUsername = builder.dashboardUsername;
            this.dashboardVpcEndpoint = builder.dashboardVpcEndpoint;
            this.deployTime = builder.deployTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MysqlOperator create() {
            return builder().build();
        }

        /**
         * @return dashboardPublicEndpoint
         */
        public String getDashboardPublicEndpoint() {
            return this.dashboardPublicEndpoint;
        }

        /**
         * @return dashboardUsername
         */
        public String getDashboardUsername() {
            return this.dashboardUsername;
        }

        /**
         * @return dashboardVpcEndpoint
         */
        public String getDashboardVpcEndpoint() {
            return this.dashboardVpcEndpoint;
        }

        /**
         * @return deployTime
         */
        public String getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dashboardPublicEndpoint; 
            private String dashboardUsername; 
            private String dashboardVpcEndpoint; 
            private String deployTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(MysqlOperator model) {
                this.dashboardPublicEndpoint = model.dashboardPublicEndpoint;
                this.dashboardUsername = model.dashboardUsername;
                this.dashboardVpcEndpoint = model.dashboardVpcEndpoint;
                this.deployTime = model.deployTime;
                this.status = model.status;
            } 

            /**
             * DashboardPublicEndpoint.
             */
            public Builder dashboardPublicEndpoint(String dashboardPublicEndpoint) {
                this.dashboardPublicEndpoint = dashboardPublicEndpoint;
                return this;
            }

            /**
             * DashboardUsername.
             */
            public Builder dashboardUsername(String dashboardUsername) {
                this.dashboardUsername = dashboardUsername;
                return this;
            }

            /**
             * DashboardVpcEndpoint.
             */
            public Builder dashboardVpcEndpoint(String dashboardVpcEndpoint) {
                this.dashboardVpcEndpoint = dashboardVpcEndpoint;
                return this;
            }

            /**
             * DeployTime.
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MysqlOperator build() {
                return new MysqlOperator(this);
            } 

        } 

    }
}
