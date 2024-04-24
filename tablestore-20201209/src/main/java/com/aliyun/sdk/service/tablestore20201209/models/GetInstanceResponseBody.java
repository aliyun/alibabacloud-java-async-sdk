// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
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

    @NameInMap("Network")
    private String network;

    @NameInMap("NetworkSourceACL")
    private java.util.List < String > networkSourceACL;

    @NameInMap("NetworkTypeACL")
    private java.util.List < String > networkTypeACL;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("PolicyVersion")
    private Long policyVersion;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SPInstanceId")
    private String SPInstanceId;

    @NameInMap("StorageType")
    private String storageType;

    @NameInMap("TableQuota")
    private Integer tableQuota;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("VCUQuota")
    private Integer VCUQuota;

    private GetInstanceResponseBody(Builder builder) {
        this.aliasName = builder.aliasName;
        this.createTime = builder.createTime;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.instanceSpecification = builder.instanceSpecification;
        this.instanceStatus = builder.instanceStatus;
        this.network = builder.network;
        this.networkSourceACL = builder.networkSourceACL;
        this.networkTypeACL = builder.networkTypeACL;
        this.paymentType = builder.paymentType;
        this.policy = builder.policy;
        this.policyVersion = builder.policyVersion;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.SPInstanceId = builder.SPInstanceId;
        this.storageType = builder.storageType;
        this.tableQuota = builder.tableQuota;
        this.tags = builder.tags;
        this.userId = builder.userId;
        this.VCUQuota = builder.VCUQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
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
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List < String > getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List < String > getNetworkTypeACL() {
        return this.networkTypeACL;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return this.policyVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return tableQuota
     */
    public Integer getTableQuota() {
        return this.tableQuota;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
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
        private String network; 
        private java.util.List < String > networkSourceACL; 
        private java.util.List < String > networkTypeACL; 
        private String paymentType; 
        private String policy; 
        private Long policyVersion; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String SPInstanceId; 
        private String storageType; 
        private Integer tableQuota; 
        private java.util.List < Tags> tags; 
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
         * Network.
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * NetworkSourceACL.
         */
        public Builder networkSourceACL(java.util.List < String > networkSourceACL) {
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * NetworkTypeACL.
         */
        public Builder networkTypeACL(java.util.List < String > networkTypeACL) {
            this.networkTypeACL = networkTypeACL;
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
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * PolicyVersion.
         */
        public Builder policyVersion(Long policyVersion) {
            this.policyVersion = policyVersion;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * TableQuota.
         */
        public Builder tableQuota(Integer tableQuota) {
            this.tableQuota = tableQuota;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
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

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String tagKey; 
            private String tagValue; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
