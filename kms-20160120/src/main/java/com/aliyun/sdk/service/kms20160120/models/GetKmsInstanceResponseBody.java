// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The details of the KMS instance.
         */
        public Builder kmsInstance(KmsInstance kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKmsInstanceResponseBody build() {
            return new GetKmsInstanceResponseBody(this);
        } 

    } 

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

            /**
             * The region to which the VPC belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The vSwitch in the VPC.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the VPC belongs.
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
    public static class BindVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindVpc")
        private java.util.List < BindVpc> bindVpc;

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
        public java.util.List < BindVpc> getBindVpc() {
            return this.bindVpc;
        }

        public static final class Builder {
            private java.util.List < BindVpc> bindVpc; 

            /**
             * BindVpc.
             */
            public Builder bindVpc(java.util.List < BindVpc> bindVpc) {
                this.bindVpc = bindVpc;
                return this;
            }

            public BindVpcs build() {
                return new BindVpcs(this);
            } 

        } 

    }
    public static class KmsInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindVpcs")
        private BindVpcs bindVpcs;

        @com.aliyun.core.annotation.NameInMap("CaCertificateChainPem")
        private String caCertificateChainPem;

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
            this.createTime = builder.createTime;
            this.endDate = builder.endDate;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.keyNum = builder.keyNum;
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
            private String createTime; 
            private String endDate; 
            private String instanceId; 
            private String instanceName; 
            private Long keyNum; 
            private String secretNum; 
            private Long spec; 
            private String startDate; 
            private String status; 
            private String vpcId; 
            private Long vpcNum; 
            private String vswitchIds; 
            private String zoneIds; 

            /**
             * A list of associated VPCs.
             * <p>
             * 
             * >  If your self-managed applications are deployed in multiple VPCs in the same region, you can associate VPCs with the KMS instance beyond the VPC that you specify when you enable the KMS instance. The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, self-managed applications in the VPCs can access the specified KMS instance.
             */
            public Builder bindVpcs(BindVpcs bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * The content of the certificate authority (CA) certificate of the KMS instance.
             */
            public Builder caCertificateChainPem(String caCertificateChainPem) {
                this.caCertificateChainPem = caCertificateChainPem;
                return this;
            }

            /**
             * The time when the KMS instance is created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The expiration time of the KMS instance.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * The ID of the KMS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the KMS instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The number of keys that can be created for the KMS instance.
             */
            public Builder keyNum(Long keyNum) {
                this.keyNum = keyNum;
                return this;
            }

            /**
             * The number of secrets that can be created for the KMS instance.
             */
            public Builder secretNum(String secretNum) {
                this.secretNum = secretNum;
                return this;
            }

            /**
             * The computing performance of the KMS instance.
             */
            public Builder spec(Long spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The time when the KMS instance is enabled.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * The status of the KMS instance. Valid values:
             * <p>
             * 
             * *   Uninitialized: The KMS instance is not enabled.
             * *   Connecting: The KMS instance is being connected.
             * *   Connected: The KMS instance is enabled.
             * *   Disconnected: The KMS instance is disconnected.
             * *   Error: The KMS instance is abnormal.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The virtual private cloud (VPC) with which the KMS instance is associated.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The access management quota for the KMS instance.
             */
            public Builder vpcNum(Long vpcNum) {
                this.vpcNum = vpcNum;
                return this;
            }

            /**
             * The vSwitch in the VPC.
             */
            public Builder vswitchIds(String vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * The zone with which the KMS instance is associated.
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
