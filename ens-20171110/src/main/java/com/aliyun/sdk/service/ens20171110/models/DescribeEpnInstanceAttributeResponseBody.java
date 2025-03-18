// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnInstanceAttributeResponseBody</p>
 */
public class DescribeEpnInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfVersions")
    private java.util.List<ConfVersions> confVersions;

    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @com.aliyun.core.annotation.NameInMap("EPNInstanceName")
    private String EPNInstanceName;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("NetworkingModel")
    private String networkingModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VSwitches")
    private java.util.List<VSwitches> vSwitches;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confVersions
     */
    public java.util.List<ConfVersions> getConfVersions() {
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
    public java.util.List<Instances> getInstances() {
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
    public java.util.List<VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private java.util.List<ConfVersions> confVersions; 
        private String EPNInstanceId; 
        private String EPNInstanceName; 
        private java.util.List<Instances> instances; 
        private String networkingModel; 
        private String requestId; 
        private java.util.List<VSwitches> vSwitches; 

        private Builder() {
        } 

        private Builder(DescribeEpnInstanceAttributeResponseBody model) {
            this.confVersions = model.confVersions;
            this.EPNInstanceId = model.EPNInstanceId;
            this.EPNInstanceName = model.EPNInstanceName;
            this.instances = model.instances;
            this.networkingModel = model.networkingModel;
            this.requestId = model.requestId;
            this.vSwitches = model.vSwitches;
        } 

        /**
         * <p>The information about the EPN configurations.</p>
         */
        public Builder confVersions(java.util.List<ConfVersions> confVersions) {
            this.confVersions = confVersions;
            return this;
        }

        /**
         * <p>The ID of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-xxxx</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * <p>The name of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-test</p>
         */
        public Builder EPNInstanceName(String EPNInstanceName) {
            this.EPNInstanceName = EPNInstanceName;
            return this;
        }

        /**
         * <p>The information about the instance.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The networking mode. Valid values:</p>
         * <ul>
         * <li>SpeedUp: intelligent acceleration network (Internet)</li>
         * <li>Connection: internal network</li>
         * <li>SpeedUpAndConnection: intelligent acceleration network and internal network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SpeedUp</p>
         */
        public Builder networkingModel(String networkingModel) {
            this.networkingModel = networkingModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the vSwitch.</p>
         */
        public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeEpnInstanceAttributeResponseBody build() {
            return new DescribeEpnInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ConfVersions model) {
                this.confVersion = model.confVersion;
                this.ensRegionId = model.ensRegionId;
            } 

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-10-11</p>
             */
            public Builder confVersion(String confVersion) {
                this.confVersion = confVersion;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom</p>
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
    /**
     * 
     * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Instances model) {
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.isp = model.isp;
                this.privateIpAddress = model.privateIpAddress;
                this.publicIpAddress = model.publicIpAddress;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom-4</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>epn-xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>epn-test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The ISP. Valid values:</p>
             * <ul>
             * <li>cmcc: China Mobile</li>
             * <li>unicom: China Unicom</li>
             * <li>telecom: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.12</p>
             */
            public Builder privateIpAddress(String privateIpAddress) {
                this.privateIpAddress = privateIpAddress;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>20.3.XX.XX</p>
             */
            public Builder publicIpAddress(String publicIpAddress) {
                this.publicIpAddress = publicIpAddress;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Stopped</li>
             * <li>Expired</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
    /**
     * 
     * {@link DescribeEpnInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnInstanceAttributeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.cidrBlock = model.cidrBlock;
                this.ensRegionId = model.ensRegionId;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchName = model.vSwitchName;
            } 

            /**
             * <p>The CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.1/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom-4</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vs-xxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The name of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vs-test</p>
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
