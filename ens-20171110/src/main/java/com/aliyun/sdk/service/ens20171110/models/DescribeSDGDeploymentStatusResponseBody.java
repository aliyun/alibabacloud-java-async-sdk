// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSDGDeploymentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDGDeploymentStatusResponseBody</p>
 */
public class DescribeSDGDeploymentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private java.util.List < DeploymentStatus> deploymentStatus;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSDGDeploymentStatusResponseBody(Builder builder) {
        this.deploymentStatus = builder.deploymentStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGDeploymentStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentStatus
     */
    public java.util.List < DeploymentStatus> getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DeploymentStatus> deploymentStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The deployment information of the SDG.
         */
        public Builder deploymentStatus(java.util.List < DeploymentStatus> deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of queried deployment records.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSDGDeploymentStatusResponseBody build() {
            return new DescribeSDGDeploymentStatusResponseBody(this);
        } 

    } 

    public static class DeploymentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountType")
        private String mountType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DeploymentStatus(Builder builder) {
            this.instanceId = builder.instanceId;
            this.mountType = builder.mountType;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentStatus create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mountType
         */
        public String getMountType() {
            return this.mountType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String instanceId; 
            private String mountType; 
            private String regionId; 
            private String status; 
            private String updateTime; 

            /**
             * The ID of the AIC instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The deployment type.
             * <p>
             * 
             * Valid values:
             * 
             * *   overlay: read/write splitting.
             * *   common: common deployment.
             */
            public Builder mountType(String mountType) {
                this.mountType = mountType;
                return this;
            }

            /**
             * The ID of the edge node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * the deployment status of the shared data group SDG.
             * <p>
             * 
             * Valid values:
             * 
             * *   sdg_deploying
             * *   success
             * *   failed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the status was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DeploymentStatus build() {
                return new DeploymentStatus(this);
            } 

        } 

    }
}
