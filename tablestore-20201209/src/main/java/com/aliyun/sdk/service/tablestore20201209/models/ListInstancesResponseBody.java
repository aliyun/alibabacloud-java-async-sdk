// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Instances> instances; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceSpecification")
        private String instanceSpecification;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SPInstanceId")
        private String SPInstanceId;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VCUQuota")
        private Integer VCUQuota;

        private Instances(Builder builder) {
            this.aliasName = builder.aliasName;
            this.createTime = builder.createTime;
            this.instanceDescription = builder.instanceDescription;
            this.instanceName = builder.instanceName;
            this.instanceSpecification = builder.instanceSpecification;
            this.instanceStatus = builder.instanceStatus;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.SPInstanceId = builder.SPInstanceId;
            this.storageType = builder.storageType;
            this.userId = builder.userId;
            this.VCUQuota = builder.VCUQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceSpecification
         */
        public String getInstanceSpecification() {
            return this.instanceSpecification;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return SPInstanceId
         */
        public String getSPInstanceId() {
            return this.SPInstanceId;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return VCUQuota
         */
        public Integer getVCUQuota() {
            return this.VCUQuota;
        }

        public static final class Builder {
            private String aliasName; 
            private String createTime; 
            private String instanceDescription; 
            private String instanceName; 
            private String instanceSpecification; 
            private String instanceStatus; 
            private String paymentType; 
            private String regionId; 
            private String resourceGroupId; 
            private String SPInstanceId; 
            private String storageType; 
            private String userId; 
            private Integer VCUQuota; 

            /**
             * AliasName.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceSpecification.
             */
            public Builder instanceSpecification(String instanceSpecification) {
                this.instanceSpecification = instanceSpecification;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SPInstanceId.
             */
            public Builder SPInstanceId(String SPInstanceId) {
                this.SPInstanceId = SPInstanceId;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * VCUQuota.
             */
            public Builder VCUQuota(Integer VCUQuota) {
                this.VCUQuota = VCUQuota;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
