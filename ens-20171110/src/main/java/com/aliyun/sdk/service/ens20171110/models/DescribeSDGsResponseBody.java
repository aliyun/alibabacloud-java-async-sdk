// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSDGsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSDGsResponseBody</p>
 */
public class DescribeSDGsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SDGs")
    private java.util.List < SDGs> SDGs;

    private DescribeSDGsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SDGs = builder.SDGs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSDGsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SDGs
     */
    public java.util.List < SDGs> getSDGs() {
        return this.SDGs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SDGs> SDGs; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3703C4AC-9396-458C-8F25-1D701334D309</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the SDGs.</p>
         */
        public Builder SDGs(java.util.List < SDGs> SDGs) {
            this.SDGs = SDGs;
            return this;
        }

        public DescribeSDGsResponseBody build() {
            return new DescribeSDGsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSDGsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGsResponseBody</p>
     */
    public static class AvaliableRegionIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private AvaliableRegionIds(Builder builder) {
            this.creationTime = builder.creationTime;
            this.regionId = builder.regionId;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvaliableRegionIds create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String regionId; 
            private String snapshotId; 
            private String status; 

            /**
             * <p>The time when the SDG was created on the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 15:13:26</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-26</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>mock-clone_snapshot_id</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The status of the SDG on the node. Valid values:</p>
             * <ul>
             * <li><strong>sdg_making</strong></li>
             * <li><strong>sdg_saving</strong></li>
             * <li><strong>sdg_copying</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AvaliableRegionIds build() {
                return new AvaliableRegionIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSDGsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGsResponseBody</p>
     */
    public static class DeployedInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeploymentType")
        private String deploymentType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DeployedInstanceIds(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deploymentType = builder.deploymentType;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedInstanceIds create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deploymentType
         */
        public String getDeploymentType() {
            return this.deploymentType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String deploymentType; 
            private String instanceId; 
            private String status; 

            /**
             * <p>The time when the SDG was deployed on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 16:48:43</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The deployment type of the SDG. Valid values:</p>
             * <ul>
             * <li>common: common deployment.</li>
             * <li>overlay: read/write splitting deployment.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>overlay</p>
             */
            public Builder deploymentType(String deploymentType) {
                this.deploymentType = deploymentType;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>aic-5x20dyeos****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The deployment status. Valid values:</p>
             * <ul>
             * <li><strong>sdg_deploying</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sdg_deploying</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DeployedInstanceIds build() {
                return new DeployedInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSDGsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSDGsResponseBody</p>
     */
    public static class SDGs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvaliableRegionIds")
        private java.util.List < AvaliableRegionIds> avaliableRegionIds;

        @com.aliyun.core.annotation.NameInMap("CreationInstanceId")
        private String creationInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreationRegionId")
        private String creationRegionId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeployedInstanceIds")
        private java.util.List < DeployedInstanceIds> deployedInstanceIds;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParentSDGId")
        private String parentSDGId;

        @com.aliyun.core.annotation.NameInMap("SDGId")
        private String SDGId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SDGs(Builder builder) {
            this.avaliableRegionIds = builder.avaliableRegionIds;
            this.creationInstanceId = builder.creationInstanceId;
            this.creationRegionId = builder.creationRegionId;
            this.creationTime = builder.creationTime;
            this.deployedInstanceIds = builder.deployedInstanceIds;
            this.description = builder.description;
            this.parentSDGId = builder.parentSDGId;
            this.SDGId = builder.SDGId;
            this.size = builder.size;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SDGs create() {
            return builder().build();
        }

        /**
         * @return avaliableRegionIds
         */
        public java.util.List < AvaliableRegionIds> getAvaliableRegionIds() {
            return this.avaliableRegionIds;
        }

        /**
         * @return creationInstanceId
         */
        public String getCreationInstanceId() {
            return this.creationInstanceId;
        }

        /**
         * @return creationRegionId
         */
        public String getCreationRegionId() {
            return this.creationRegionId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deployedInstanceIds
         */
        public java.util.List < DeployedInstanceIds> getDeployedInstanceIds() {
            return this.deployedInstanceIds;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parentSDGId
         */
        public String getParentSDGId() {
            return this.parentSDGId;
        }

        /**
         * @return SDGId
         */
        public String getSDGId() {
            return this.SDGId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
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
            private java.util.List < AvaliableRegionIds> avaliableRegionIds; 
            private String creationInstanceId; 
            private String creationRegionId; 
            private String creationTime; 
            private java.util.List < DeployedInstanceIds> deployedInstanceIds; 
            private String description; 
            private String parentSDGId; 
            private String SDGId; 
            private Long size; 
            private String status; 
            private String updateTime; 

            /**
             * <p>The IDs of available edge nodes.</p>
             */
            public Builder avaliableRegionIds(java.util.List < AvaliableRegionIds> avaliableRegionIds) {
                this.avaliableRegionIds = avaliableRegionIds;
                return this;
            }

            /**
             * <p>The ID of the instance on which the SDG is created.</p>
             * 
             * <strong>example:</strong>
             * <p>aic-5x20dyeos****</p>
             */
            public Builder creationInstanceId(String creationInstanceId) {
                this.creationInstanceId = creationInstanceId;
                return this;
            }

            /**
             * <p>The ID of the node on which the SDG is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-26</p>
             */
            public Builder creationRegionId(String creationRegionId) {
                this.creationRegionId = creationRegionId;
                return this;
            }

            /**
             * <p>The time when the SDG was first created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 15:07:21</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The deployment information.</p>
             */
            public Builder deployedInstanceIds(java.util.List < DeployedInstanceIds> deployedInstanceIds) {
                this.deployedInstanceIds = deployedInstanceIds;
                return this;
            }

            /**
             * <p>The description of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>Testing SDGs</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the <strong>FromSDGId</strong> parameter that you need to specify when you call the <a href="https://help.aliyun.com/document_detail/608128.html">CreateSDG</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-xxxxx</p>
             */
            public Builder parentSDGId(String parentSDGId) {
                this.parentSDGId = parentSDGId;
                return this;
            }

            /**
             * <p>The ID of the SDG.</p>
             * 
             * <strong>example:</strong>
             * <p>sdg-30e1fdba7196bc****</p>
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * <p>The size of the SDG. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the SDG creation. Valid values:</p>
             * <ul>
             * <li><strong>sdg_making</strong></li>
             * <li><strong>sdg_saving</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>success</strong></li>
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
             * <p>The time when the SDG was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-27 16:04:39</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SDGs build() {
                return new SDGs(this);
            } 

        } 

    }
}
