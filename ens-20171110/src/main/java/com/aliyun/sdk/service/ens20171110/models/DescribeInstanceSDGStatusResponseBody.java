// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceSDGStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSDGStatusResponseBody</p>
 */
public class DescribeInstanceSDGStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private java.util.List<DeploymentStatus> deploymentStatus;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeInstanceSDGStatusResponseBody(Builder builder) {
        this.deploymentStatus = builder.deploymentStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSDGStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentStatus
     */
    public java.util.List<DeploymentStatus> getDeploymentStatus() {
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
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DeploymentStatus> deploymentStatus; 
        private Long pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * DeploymentStatus.
         */
        public Builder deploymentStatus(java.util.List<DeploymentStatus> deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceSDGStatusResponseBody build() {
            return new DescribeInstanceSDGStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSDGStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSDGStatusResponseBody</p>
     */
    public static class DeploymentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountType")
        private String mountType;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("SDGId")
        private String SDGId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DeploymentStatus(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.mountType = builder.mountType;
            this.phase = builder.phase;
            this.SDGId = builder.SDGId;
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
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
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
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return SDGId
         */
        public String getSDGId() {
            return this.SDGId;
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
            private String ensRegionId; 
            private String instanceId; 
            private String mountType; 
            private String phase; 
            private String SDGId; 
            private String status; 
            private String updateTime; 

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MountType.
             */
            public Builder mountType(String mountType) {
                this.mountType = mountType;
                return this;
            }

            /**
             * Phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * SDGId.
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
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
