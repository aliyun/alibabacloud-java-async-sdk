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
 * {@link DescribeSDGDeploymentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDGDeploymentStatusResponseBody</p>
 */
public class DescribeSDGDeploymentStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private java.util.List<DeploymentStatus> deploymentStatus;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<DeploymentStatus> deploymentStatus; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSDGDeploymentStatusResponseBody model) {
            this.deploymentStatus = model.deploymentStatus;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of SDG deployment information.</p>
         */
        public Builder deploymentStatus(java.util.List<DeploymentStatus> deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68B85217-03B8-5141-9216-EA4D7C496B9A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried deployment records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSDGDeploymentStatusResponseBody build() {
            return new DescribeSDGDeploymentStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSDGDeploymentStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGDeploymentStatusResponseBody</p>
     */
    public static class DeploymentStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockRwSplitSize")
        private Integer blockRwSplitSize;

        @com.aliyun.core.annotation.NameInMap("CacheSize")
        private Integer cacheSize;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MountType")
        private String mountType;

        @com.aliyun.core.annotation.NameInMap("Phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DeploymentStatus(Builder builder) {
            this.blockRwSplitSize = builder.blockRwSplitSize;
            this.cacheSize = builder.cacheSize;
            this.instanceId = builder.instanceId;
            this.mountType = builder.mountType;
            this.phase = builder.phase;
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
         * @return blockRwSplitSize
         */
        public Integer getBlockRwSplitSize() {
            return this.blockRwSplitSize;
        }

        /**
         * @return cacheSize
         */
        public Integer getCacheSize() {
            return this.cacheSize;
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
            private Integer blockRwSplitSize; 
            private Integer cacheSize; 
            private String instanceId; 
            private String mountType; 
            private String phase; 
            private String regionId; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(DeploymentStatus model) {
                this.blockRwSplitSize = model.blockRwSplitSize;
                this.cacheSize = model.cacheSize;
                this.instanceId = model.instanceId;
                this.mountType = model.mountType;
                this.phase = model.phase;
                this.regionId = model.regionId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * BlockRwSplitSize.
             */
            public Builder blockRwSplitSize(Integer blockRwSplitSize) {
                this.blockRwSplitSize = blockRwSplitSize;
                return this;
            }

            /**
             * CacheSize.
             */
            public Builder cacheSize(Integer cacheSize) {
                this.cacheSize = cacheSize;
                return this;
            }

            /**
             * <p>The ID of the AIC instance.</p>
             * 
             * <strong>example:</strong>
             * <p>aic-xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The deployment type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>overlay: read/write splitting.</li>
             * <li>common: common deployment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>overlay</p>
             */
            public Builder mountType(String mountType) {
                this.mountType = mountType;
                return this;
            }

            /**
             * <p>The deployment phase of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>attach</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The deployment status of the SDG.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>sdg_deploying</li>
             * <li>success</li>
             * <li>failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the status was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-17T02:44:31Z</p>
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
