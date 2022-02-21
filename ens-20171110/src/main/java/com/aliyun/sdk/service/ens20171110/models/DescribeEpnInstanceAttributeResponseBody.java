// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnInstanceAttributeResponseBody</p>
 */
public class DescribeEpnInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("ConfVersions")
    private java.util.List < ConfVersions> confVersions;

    @NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("NetworkingModel")
    private String networkingModel;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VSwitches")
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
         * ConfVersions.
         */
        public Builder confVersions(java.util.List < ConfVersions> confVersions) {
            this.confVersions = confVersions;
            return this;
        }

        /**
         * EPNInstanceId.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * EPNInstanceName.
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * NetworkingModel.
         */
        public Builder networkingModel(String networkingModel) {
            this.networkingModel = networkingModel;
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
         * VSwitches.
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
        @NameInMap("ConfVersion")
        private String confVersion;

        @NameInMap("EnsRegionId")
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
             * ConfVersion.
             */
            public Builder confVersion(String confVersion) {
                this.confVersion = confVersion;
                return this;
            }

            /**
             * EnsRegionId.
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
        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("PrivateIpAddress")
        private String privateIpAddress;

        @NameInMap("PublicIpAddress")
        private String publicIpAddress;

        @NameInMap("Status")
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
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
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
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * PrivateIpAddress.
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * PublicIpAddress.
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("EnsRegionId")
        private String ensRegionId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchName")
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
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
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
             * VSwitchName.
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
