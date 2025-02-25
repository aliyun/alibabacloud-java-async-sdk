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
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ElasticVCUUpperLimit")
    private Float elasticVCUUpperLimit;

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

    @com.aliyun.core.annotation.NameInMap("Network")
    private String network;

    @com.aliyun.core.annotation.NameInMap("NetworkSourceACL")
    private java.util.List<String> networkSourceACL;

    @com.aliyun.core.annotation.NameInMap("NetworkTypeACL")
    private java.util.List<String> networkTypeACL;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private Long policyVersion;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SPInstanceId")
    private String SPInstanceId;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("TableQuota")
    private Integer tableQuota;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("VCUQuota")
    private Integer VCUQuota;

    private GetInstanceResponseBody(Builder builder) {
        this.aliasName = builder.aliasName;
        this.createTime = builder.createTime;
        this.elasticVCUUpperLimit = builder.elasticVCUUpperLimit;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.instanceSpecification = builder.instanceSpecification;
        this.instanceStatus = builder.instanceStatus;
        this.isMultiAZ = builder.isMultiAZ;
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
     * @return elasticVCUUpperLimit
     */
    public Float getElasticVCUUpperLimit() {
        return this.elasticVCUUpperLimit;
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
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return networkSourceACL
     */
    public java.util.List<String> getNetworkSourceACL() {
        return this.networkSourceACL;
    }

    /**
     * @return networkTypeACL
     */
    public java.util.List<String> getNetworkTypeACL() {
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
    public java.util.List<Tags> getTags() {
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
        private Float elasticVCUUpperLimit; 
        private String instanceDescription; 
        private String instanceName; 
        private String instanceSpecification; 
        private String instanceStatus; 
        private Boolean isMultiAZ; 
        private String network; 
        private java.util.List<String> networkSourceACL; 
        private java.util.List<String> networkTypeACL; 
        private String paymentType; 
        private String policy; 
        private Long policyVersion; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String SPInstanceId; 
        private String storageType; 
        private Integer tableQuota; 
        private java.util.List<Tags> tags; 
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
         * <p>2019-12-23T07:24:33Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The upper limit for the VCUs of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder elasticVCUUpperLimit(Float elasticVCUUpperLimit) {
            this.elasticVCUUpperLimit = elasticVCUUpperLimit;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the test instance.</p>
         */
        public Builder instanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
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
         * <p>SSD</p>
         */
        public Builder instanceSpecification(String instanceSpecification) {
            this.instanceSpecification = instanceSpecification;
            return this;
        }

        /**
         * <p>The status of the instance.</p>
         * <ul>
         * <li>normal: The instance works as expected.</li>
         * <li>forbidden: The instance is disabled.</li>
         * <li>Deleting: The instance is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>Indicates whether zone-redundant storage (ZRS) is enabled for the instance.</p>
         * <ul>
         * <li>true: ZRS is enabled for the instance.</li>
         * <li>false: Locally redundant storage (LRS) is enabled for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isMultiAZ(Boolean isMultiAZ) {
            this.isMultiAZ = isMultiAZ;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>VPC: The instance can be accessed only over the bound virtual private clouds (VPCs).</li>
         * <li>VPC_CONSOLE: The instance can be accessed from the Tablestore console or over the bound VPCs.</li>
         * <li>NORMAL: The instance can be accessed from networks of the custom types.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder network(String network) {
            this.network = network;
            return this;
        }

        /**
         * <p>The sources of the network from which access is allowed. Valid value:</p>
         * <p>TRUST_PROXY: console</p>
         */
        public Builder networkSourceACL(java.util.List<String> networkSourceACL) {
            this.networkSourceACL = networkSourceACL;
            return this;
        }

        /**
         * <p>The types of the network from which access is allowed. Valid values:</p>
         * <ul>
         * <li>CLASSIC: the classic network</li>
         * <li>INTERNET: the Internet</li>
         * <li>VPC: VPCs</li>
         * </ul>
         */
        public Builder networkTypeACL(java.util.List<String> networkTypeACL) {
            this.networkTypeACL = networkTypeACL;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go</li>
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
         * <p>The instance policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Version&quot;: &quot;1&quot;,
         *     &quot;Statement&quot;: [
         *         {
         *             &quot;Action&quot;: [
         *                 &quot;ots:<em>&quot;
         *             ],
         *             &quot;Resource&quot;: [
         *                 &quot;acs:ots:</em>:13791xxxxxxxxxxx:instance/myinstance*&quot;
         *             ],
         *             &quot;Principal&quot;: [
         *                 &quot;*&quot;
         *             ],
         *             &quot;Effect&quot;: &quot;Allow&quot;,
         *             &quot;Condition&quot;: {
         *                 &quot;StringEquals&quot;: {
         *                     &quot;ots:TLSVersion&quot;: [
         *                         &quot;1.2&quot;
         *                     ]
         *                 },
         *                 &quot;IpAddress&quot;: {
         *                     &quot;acs:SourceIp&quot;: [
         *                         &quot;192.168.0.1&quot;,
         *                         &quot;198.51.100.1&quot;
         *                     ]
         *                 }
         *             }
         *         }
         *     ]
         * }</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The version of the instance policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder policyVersion(Long policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID, which can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>757E172A-F94B-5E78-8A23-D9068E42F2E9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxh4em5jncda</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ots_standard_public_cn-9lb34u7u5001</p>
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
         * <p>The total number of tables in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder tableQuota(Integer tableQuota) {
            this.tableQuota = tableQuota;
            return this;
        }

        /**
         * <p>The tags of the instance.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16542312566</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The VCU quota.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder VCUQuota(Integer VCUQuota) {
            this.VCUQuota = VCUQuota;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>(Deprecated) The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>keyTestA</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>(Deprecated) The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>00004a20240452b0</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>333</p>
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
