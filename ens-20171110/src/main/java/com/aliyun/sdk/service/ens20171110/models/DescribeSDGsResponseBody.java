// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the SDGs.
         */
        public Builder SDGs(java.util.List < SDGs> SDGs) {
            this.SDGs = SDGs;
            return this;
        }

        public DescribeSDGsResponseBody build() {
            return new DescribeSDGsResponseBody(this);
        } 

    } 

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
             * The time when the SDG was created on the node.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the snapshot.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The status of the SDG on the node. Valid values:
             * <p>
             * 
             * *   **sdg_making**
             * *   **sdg_saving**
             * *   **sdg_copying**
             * *   **failed**
             * *   **success**
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
             * The time when the SDG was deployed on the instance.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The deployment type of the SDG. Valid values:
             * <p>
             * 
             * *   common: common deployment.
             * *   overlay: read/write splitting deployment.
             */
            public Builder deploymentType(String deploymentType) {
                this.deploymentType = deploymentType;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The deployment status. Valid values:
             * <p>
             * 
             * *   **sdg_deploying**
             * *   **failed**
             * *   **success**
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
             * The IDs of available edge nodes.
             */
            public Builder avaliableRegionIds(java.util.List < AvaliableRegionIds> avaliableRegionIds) {
                this.avaliableRegionIds = avaliableRegionIds;
                return this;
            }

            /**
             * The ID of the instance on which the SDG is created.
             */
            public Builder creationInstanceId(String creationInstanceId) {
                this.creationInstanceId = creationInstanceId;
                return this;
            }

            /**
             * The ID of the node on which the SDG is created.
             */
            public Builder creationRegionId(String creationRegionId) {
                this.creationRegionId = creationRegionId;
                return this;
            }

            /**
             * The time when the SDG was first created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The deployment information.
             */
            public Builder deployedInstanceIds(java.util.List < DeployedInstanceIds> deployedInstanceIds) {
                this.deployedInstanceIds = deployedInstanceIds;
                return this;
            }

            /**
             * The description of the SDG.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the source SDG from which you want to create an SDG. The value of this parameter is the value of the **FromSDGId** parameter that you need to specify when you call the [CreateSDG](~~608128~~) operation.
             */
            public Builder parentSDGId(String parentSDGId) {
                this.parentSDGId = parentSDGId;
                return this;
            }

            /**
             * The ID of the SDG.
             */
            public Builder SDGId(String SDGId) {
                this.SDGId = SDGId;
                return this;
            }

            /**
             * The size of the SDG. Unit: GB.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the SDG creation. Valid values:
             * <p>
             * 
             * *   **sdg_making**
             * *   **sdg_saving**
             * *   **failed**
             * *   **success**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the SDG was last updated.
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
