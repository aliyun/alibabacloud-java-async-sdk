// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetKmsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetKmsInstanceResponseBody</p>
 */
public class GetKmsInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsInstance")
    private KmsInstance kmsInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetKmsInstanceResponseBody(Builder builder) {
        this.kmsInstance = builder.kmsInstance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKmsInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsInstance
     */
    public KmsInstance getKmsInstance() {
        return this.kmsInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KmsInstance kmsInstance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetKmsInstanceResponseBody model) {
            this.kmsInstance = model.kmsInstance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the KMS instance.</p>
         */
        public Builder kmsInstance(KmsInstance kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46b4a94a-57d2-44b4-9810-1e87d31abb33</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKmsInstanceResponseBody build() {
            return new GetKmsInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKmsInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetKmsInstanceResponseBody</p>
     */
    public static class BindVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcOwnerId")
        private String vpcOwnerId;

        private BindVpc(Builder builder) {
            this.regionId = builder.regionId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.vpcOwnerId = builder.vpcOwnerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindVpc create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcOwnerId
         */
        public String getVpcOwnerId() {
            return this.vpcOwnerId;
        }

        public static final class Builder {
            private String regionId; 
            private String vSwitchId; 
            private String vpcId; 
            private String vpcOwnerId; 

            private Builder() {
            } 

            private Builder(BindVpc model) {
                this.regionId = model.regionId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.vpcOwnerId = model.vpcOwnerId;
            } 

            /**
             * <p>The region to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The vSwitch in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1i512amhdje10f1****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19z7djuhtad5dff****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>190325303126****</p>
             */
            public Builder vpcOwnerId(String vpcOwnerId) {
                this.vpcOwnerId = vpcOwnerId;
                return this;
            }

            public BindVpc build() {
                return new BindVpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKmsInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetKmsInstanceResponseBody</p>
     */
    public static class BindVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindVpc")
        private java.util.List<BindVpc> bindVpc;

        private BindVpcs(Builder builder) {
            this.bindVpc = builder.bindVpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindVpcs create() {
            return builder().build();
        }

        /**
         * @return bindVpc
         */
        public java.util.List<BindVpc> getBindVpc() {
            return this.bindVpc;
        }

        public static final class Builder {
            private java.util.List<BindVpc> bindVpc; 

            private Builder() {
            } 

            private Builder(BindVpcs model) {
                this.bindVpc = model.bindVpc;
            } 

            /**
             * BindVpc.
             */
            public Builder bindVpc(java.util.List<BindVpc> bindVpc) {
                this.bindVpc = bindVpc;
                return this;
            }

            public BindVpcs build() {
                return new BindVpcs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetKmsInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetKmsInstanceResponseBody</p>
     */
    public static class KmsInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindVpcs")
        private BindVpcs bindVpcs;

        @com.aliyun.core.annotation.NameInMap("CaCertificateChainPem")
        private String caCertificateChainPem;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("KeyNum")
        private Long keyNum;

        @com.aliyun.core.annotation.NameInMap("ProductVersion")
        private String productVersion;

        @com.aliyun.core.annotation.NameInMap("SecretNum")
        private String secretNum;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private Long spec;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcNum")
        private Long vpcNum;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private String vswitchIds;

        @com.aliyun.core.annotation.NameInMap("ZoneIds")
        private String zoneIds;

        private KmsInstance(Builder builder) {
            this.bindVpcs = builder.bindVpcs;
            this.caCertificateChainPem = builder.caCertificateChainPem;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.endDate = builder.endDate;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.keyNum = builder.keyNum;
            this.productVersion = builder.productVersion;
            this.secretNum = builder.secretNum;
            this.spec = builder.spec;
            this.startDate = builder.startDate;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vpcNum = builder.vpcNum;
            this.vswitchIds = builder.vswitchIds;
            this.zoneIds = builder.zoneIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsInstance create() {
            return builder().build();
        }

        /**
         * @return bindVpcs
         */
        public BindVpcs getBindVpcs() {
            return this.bindVpcs;
        }

        /**
         * @return caCertificateChainPem
         */
        public String getCaCertificateChainPem() {
            return this.caCertificateChainPem;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return keyNum
         */
        public Long getKeyNum() {
            return this.keyNum;
        }

        /**
         * @return productVersion
         */
        public String getProductVersion() {
            return this.productVersion;
        }

        /**
         * @return secretNum
         */
        public String getSecretNum() {
            return this.secretNum;
        }

        /**
         * @return spec
         */
        public Long getSpec() {
            return this.spec;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcNum
         */
        public Long getVpcNum() {
            return this.vpcNum;
        }

        /**
         * @return vswitchIds
         */
        public String getVswitchIds() {
            return this.vswitchIds;
        }

        /**
         * @return zoneIds
         */
        public String getZoneIds() {
            return this.zoneIds;
        }

        public static final class Builder {
            private BindVpcs bindVpcs; 
            private String caCertificateChainPem; 
            private String chargeType; 
            private String createTime; 
            private String endDate; 
            private String instanceId; 
            private String instanceName; 
            private Long keyNum; 
            private String productVersion; 
            private String secretNum; 
            private Long spec; 
            private String startDate; 
            private String status; 
            private String vpcId; 
            private Long vpcNum; 
            private String vswitchIds; 
            private String zoneIds; 

            private Builder() {
            } 

            private Builder(KmsInstance model) {
                this.bindVpcs = model.bindVpcs;
                this.caCertificateChainPem = model.caCertificateChainPem;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.endDate = model.endDate;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.keyNum = model.keyNum;
                this.productVersion = model.productVersion;
                this.secretNum = model.secretNum;
                this.spec = model.spec;
                this.startDate = model.startDate;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.vpcNum = model.vpcNum;
                this.vswitchIds = model.vswitchIds;
                this.zoneIds = model.zoneIds;
            } 

            /**
             * <p>A list of associated VPCs.</p>
             * <blockquote>
             * <p> If your self-managed applications are deployed in multiple VPCs in the same region, you can associate VPCs with the KMS instance beyond the VPC that you specify when you enable the KMS instance. The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in the VPCs can access the specified KMS instance.</p>
             * </blockquote>
             */
            public Builder bindVpcs(BindVpcs bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * <p>The content of the certificate authority (CA) certificate of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE-----\r\nMIIDuzCCAqOgAwIBAgIJALTKwWAjvbMiMA0GCSqGSIb3DQEBCwUAMHQxCzAJBgNV****-----END CERTIFICATE-----</p>
             */
            public Builder caCertificateChainPem(String caCertificateChainPem) {
                this.caCertificateChainPem = caCertificateChainPem;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the KMS instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-05T12:44:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-05T16:00:00Z</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The ID of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kst-bjj62f5ba3dnpb6v8****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>kst-bjj62f5ba3dnpb6v8****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The number of keys that can be created for the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder keyNum(Long keyNum) {
                this.keyNum = keyNum;
                return this;
            }

            /**
             * ProductVersion.
             */
            public Builder productVersion(String productVersion) {
                this.productVersion = productVersion;
                return this;
            }

            /**
             * <p>The number of secrets that can be created for the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder secretNum(String secretNum) {
                this.secretNum = secretNum;
                return this;
            }

            /**
             * <p>The computing performance of the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder spec(Long spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The time when the KMS instance is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-09-05T12:44:19Z</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The status of the KMS instance. Valid values:</p>
             * <ul>
             * <li>Uninitialized: The KMS instance is not enabled.</li>
             * <li>Connecting: The KMS instance is being connected.</li>
             * <li>Connected: The KMS instance is enabled.</li>
             * <li>Disconnected: The KMS instance is disconnected.</li>
             * <li>Error: The KMS instance is abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) with which the KMS instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp19z7cwmltad5dff****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The access management quota for the KMS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder vpcNum(Long vpcNum) {
                this.vpcNum = vpcNum;
                return this;
            }

            /**
             * <p>The vSwitch in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1i512amda6d10a0****</p>
             */
            public Builder vswitchIds(String vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * <p>The zone with which the KMS instance is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;cn-hangzhou-k&quot;,       &quot;cn-hangzhou-j&quot;</p>
             */
            public Builder zoneIds(String zoneIds) {
                this.zoneIds = zoneIds;
                return this;
            }

            public KmsInstance build() {
                return new KmsInstance(this);
            } 

        } 

    }
}
