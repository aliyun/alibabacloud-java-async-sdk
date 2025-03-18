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

        private Builder() {
        } 

        private Builder(DescribeInstanceSDGStatusResponseBody model) {
            this.deploymentStatus = model.deploymentStatus;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The deployment information of the SDGs.</p>
         */
        public Builder deploymentStatus(java.util.List<DeploymentStatus> deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1</p>
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
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of queried deployment records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

            private Builder() {
            } 

            private Builder(DeploymentStatus model) {
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
                this.mountType = model.mountType;
                this.phase = model.phase;
                this.SDGId = model.SDGId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guangzhou-26</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
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
             * <p>The deployment type of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>shared</p>
             */
            public Builder mountType(String mountType) {
                this.mountType = mountType;
                return this;
            }

            /**
             * <p>Deployment Phase</p>
             * 
             * <strong>example:</strong>
             * <p>attach</p>
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * <p>The ID of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-xxxxxxx</p>
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * <p>The deployment status of the SDG.</p>
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
