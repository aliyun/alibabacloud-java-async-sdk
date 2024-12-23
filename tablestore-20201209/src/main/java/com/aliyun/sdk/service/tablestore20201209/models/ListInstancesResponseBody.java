// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The token that determines the start position of the next query. If this parameter is empty, all instances that you want to query are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESCG15aC1xxxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E734979F-5A44-5993-9CE5-C23103576923</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceSpecification")
        private String instanceSpecification;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("IsMultiAZ")
        private Boolean isMultiAZ;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SPInstanceId")
        private String SPInstanceId;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VCUQuota")
        private Integer VCUQuota;

        private Instances(Builder builder) {
            this.aliasName = builder.aliasName;
            this.createTime = builder.createTime;
            this.instanceDescription = builder.instanceDescription;
            this.instanceName = builder.instanceName;
            this.instanceSpecification = builder.instanceSpecification;
            this.instanceStatus = builder.instanceStatus;
            this.isMultiAZ = builder.isMultiAZ;
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
         * @return isMultiAZ
         */
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
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
            private Boolean isMultiAZ; 
            private String paymentType; 
            private String regionId; 
            private String resourceGroupId; 
            private String SPInstanceId; 
            private String storageType; 
            private String userId; 
            private Integer VCUQuota; 

            /**
             * <p>The instance alias.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-test</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-07T09:19:21Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>Description of the test instance.</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The name of the instance, which is used to uniquely identify the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>instance-test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The type of the instance.</p>
             * <ul>
             * <li>SSD: high-performance instance</li>
             * <li>HYBRID: capacity instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder instanceSpecification(String instanceSpecification) {
                this.instanceSpecification = instanceSpecification;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * IsMultiAZ.
             */
            public Builder isMultiAZ(Boolean isMultiAZ) {
                this.isMultiAZ = isMultiAZ;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * <ul>
             * <li>Subscription: subscription</li>
             * <li>PayAsYouGo: pay as you go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscription</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxh4em5jnbcd</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ots_standard_public_cn-g4t3igqjj002</p>
             */
            public Builder SPInstanceId(String SPInstanceId) {
                this.SPInstanceId = SPInstanceId;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * <ul>
             * <li>SSD: high-performance</li>
             * <li>HYBRID: capacity</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HYBRID</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>13542356466</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The VCU quota.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
