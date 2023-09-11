// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKmsInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetKmsInstanceResponseBody</p>
 */
public class GetKmsInstanceResponseBody extends TeaModel {
    @NameInMap("KmsInstance")
    private KmsInstance kmsInstance;

    @NameInMap("RequestId")
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
         * KmsInstance.
         */
        public Builder kmsInstance(KmsInstance kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcOwnerId")
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcOwnerId.
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
        @NameInMap("BindVpc")
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
        @NameInMap("BindVpcs")
        private BindVpcs bindVpcs;

        @NameInMap("CaCertificateChainPem")
        private String caCertificateChainPem;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("KeyNum")
        private Long keyNum;

        @NameInMap("SecretNum")
        private String secretNum;

        @NameInMap("Spec")
        private Long spec;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcNum")
        private Long vpcNum;

        @NameInMap("VswitchIds")
        private String vswitchIds;

        @NameInMap("ZoneIds")
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
             * BindVpcs.
             */
            public Builder bindVpcs(BindVpcs bindVpcs) {
                this.bindVpcs = bindVpcs;
                return this;
            }

            /**
             * CaCertificateChainPem.
             */
            public Builder caCertificateChainPem(String caCertificateChainPem) {
                this.caCertificateChainPem = caCertificateChainPem;
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
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * KeyNum.
             */
            public Builder keyNum(Long keyNum) {
                this.keyNum = keyNum;
                return this;
            }

            /**
             * SecretNum.
             */
            public Builder secretNum(String secretNum) {
                this.secretNum = secretNum;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(Long spec) {
                this.spec = spec;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcNum.
             */
            public Builder vpcNum(Long vpcNum) {
                this.vpcNum = vpcNum;
                return this;
            }

            /**
             * VswitchIds.
             */
            public Builder vswitchIds(String vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * ZoneIds.
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
