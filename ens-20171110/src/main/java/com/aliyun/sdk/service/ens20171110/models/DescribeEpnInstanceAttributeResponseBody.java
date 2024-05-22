// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnInstanceAttributeResponseBody</p>
 */
public class DescribeEpnInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfVersions")
    private java.util.List < ConfVersions> confVersions;

    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @com.aliyun.core.annotation.NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

    @com.aliyun.core.annotation.NameInMap("NetworkingModel")
    private String networkingModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private java.util.List < VSwitches> vSwitches;

    private DescribeEpnInstanceAttributeResponseBody(Builder builder) {
        this.confVersions = builder.confVersions;
        this.EPNInstanceId = builder.EPNInstanceId;
        this.EPNInstanceName = builder.EPNInstanceName;
        this.instances = builder.instances;
        this.networkingModel = builder.networkingModel;
        this.requestId = builder.requestId;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnInstanceAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return confVersions
     */
    public java.util.List < ConfVersions> getConfVersions() {
        return this.confVersions;
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return EPNInstanceName
     */
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return networkingModel
     */
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vSwitches
     */
    public java.util.List < VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private java.util.List < ConfVersions> confVersions; 
        private String EPNInstanceId; 
        private String EPNInstanceName; 
        private java.util.List < Instances> instances; 
        private String networkingModel; 
        private String requestId; 
        private java.util.List < VSwitches> vSwitches; 

        /**
         * The information about the EPN configurations.
         */
        public Builder confVersions(java.util.List < ConfVersions> confVersions) {
            this.confVersions = confVersions;
            return this;
        }

        /**
         * The ID of the EPN instance.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * The name of the EPN instance.
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * The information about the instance.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * The networking mode. Valid values:
         * <p>
         * 
         * *   SpeedUp: intelligent acceleration network (Internet)
         * *   Connection: internal network
         * *   SpeedUpAndConnection: intelligent acceleration network and internal network
         */
        public Builder networkingModel(String networkingModel) {
            this.networkingModel = networkingModel;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Details of the vSwitch.
         */
        public Builder vSwitches(java.util.List < VSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeEpnInstanceAttributeResponseBody build() {
            return new DescribeEpnInstanceAttributeResponseBody(this);
        } 

    } 

    public static class ConfVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfVersion")
        private String confVersion;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        private ConfVersions(Builder builder) {
            this.confVersion = builder.confVersion;
            this.ensRegionId = builder.ensRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfVersions create() {
            return builder().build();
        }

        /**
         * @return confVersion
         */
        public String getConfVersion() {
            return this.confVersion;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public static final class Builder {
            private String confVersion; 
            private String ensRegionId; 

            /**
             * The version number.
             */
            public Builder confVersion(String confVersion) {
                this.confVersion = confVersion;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public ConfVersions build() {
                return new ConfVersions(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Instances(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.isp = builder.isp;
            this.privateIpAddress = builder.privateIpAddress;
            this.publicIpAddress = builder.publicIpAddress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
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
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return privateIpAddress
         */
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        /**
         * @return publicIpAddress
         */
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String instanceId; 
            private String instanceName; 
            private String isp; 
            private String privateIpAddress; 
            private String publicIpAddress; 
            private String status; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
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
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ISP. Valid values:
             * <p>
             * 
             * *   cmcc: China Mobile
             * *   unicom: China Unicom
             * *   telecom: China Telecom
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The private IP address.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * The public IP address.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   Running
             * *   Stopped
             * *   Expired
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchName")
        private String vSwitchName;

        private VSwitches(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.ensRegionId = builder.ensRegionId;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String ensRegionId; 
            private String vSwitchId; 
            private String vSwitchName; 

            /**
             * The CIDR block.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The name of the vSwitch.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
