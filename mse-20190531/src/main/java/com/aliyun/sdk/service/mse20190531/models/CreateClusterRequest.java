// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClusterSpecification")
    @Validation(required = true)
    private String clusterSpecification;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("ClusterVersion")
    @Validation(required = true)
    private String clusterVersion;

    @Query
    @NameInMap("ConnectionType")
    private String connectionType;

    @Query
    @NameInMap("DiskType")
    @Deprecated
    private String diskType;

    @Query
    @NameInMap("EipEnabled")
    private Boolean eipEnabled;

    @Query
    @NameInMap("InstanceCount")
    @Validation(required = true)
    private Integer instanceCount;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    @Query
    @NameInMap("NetType")
    @Validation(required = true)
    private String netType;

    @Query
    @NameInMap("PrivateSlbSpecification")
    @Deprecated
    private String privateSlbSpecification;

    @Query
    @NameInMap("PubNetworkFlow")
    private String pubNetworkFlow;

    @Query
    @NameInMap("PubSlbSpecification")
    @Deprecated
    private String pubSlbSpecification;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("RequestPars")
    private String requestPars;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityGroupType")
    private String securityGroupType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.chargeType = builder.chargeType;
        this.clusterSpecification = builder.clusterSpecification;
        this.clusterType = builder.clusterType;
        this.clusterVersion = builder.clusterVersion;
        this.connectionType = builder.connectionType;
        this.diskType = builder.diskType;
        this.eipEnabled = builder.eipEnabled;
        this.instanceCount = builder.instanceCount;
        this.instanceName = builder.instanceName;
        this.mseVersion = builder.mseVersion;
        this.netType = builder.netType;
        this.privateSlbSpecification = builder.privateSlbSpecification;
        this.pubNetworkFlow = builder.pubNetworkFlow;
        this.pubSlbSpecification = builder.pubSlbSpecification;
        this.region = builder.region;
        this.requestPars = builder.requestPars;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupType = builder.securityGroupType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clusterSpecification
     */
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return eipEnabled
     */
    public Boolean getEipEnabled() {
        return this.eipEnabled;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return privateSlbSpecification
     */
    public String getPrivateSlbSpecification() {
        return this.privateSlbSpecification;
    }

    /**
     * @return pubNetworkFlow
     */
    public String getPubNetworkFlow() {
        return this.pubNetworkFlow;
    }

    /**
     * @return pubSlbSpecification
     */
    public String getPubSlbSpecification() {
        return this.pubSlbSpecification;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityGroupType
     */
    public String getSecurityGroupType() {
        return this.securityGroupType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String acceptLanguage; 
        private String chargeType; 
        private String clusterSpecification; 
        private String clusterType; 
        private String clusterVersion; 
        private String connectionType; 
        private String diskType; 
        private Boolean eipEnabled; 
        private Integer instanceCount; 
        private String instanceName; 
        private String mseVersion; 
        private String netType; 
        private String privateSlbSpecification; 
        private String pubNetworkFlow; 
        private String pubSlbSpecification; 
        private String region; 
        private String requestPars; 
        private String resourceGroupId; 
        private String securityGroupType; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.chargeType = request.chargeType;
            this.clusterSpecification = request.clusterSpecification;
            this.clusterType = request.clusterType;
            this.clusterVersion = request.clusterVersion;
            this.connectionType = request.connectionType;
            this.diskType = request.diskType;
            this.eipEnabled = request.eipEnabled;
            this.instanceCount = request.instanceCount;
            this.instanceName = request.instanceName;
            this.mseVersion = request.mseVersion;
            this.netType = request.netType;
            this.privateSlbSpecification = request.privateSlbSpecification;
            this.pubNetworkFlow = request.pubNetworkFlow;
            this.pubSlbSpecification = request.pubSlbSpecification;
            this.region = request.region;
            this.requestPars = request.requestPars;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupType = request.securityGroupType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The billing method. Valid values: PREPAY and POSTPAY.
         * <p>
         * 
         * Ignore this parameter for serverless instances.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The engine specifications. Valid values:
         * <p>
         * 
         * \[Professional Edition]
         * 
         * *   `MSE_SC_2_4_60_c`: 2 vCPUs and 4 GB of memory
         * *   `MSE_SC_1_2_60_c`: 1 vCPU and 2 GB of memory
         * *   `MSE_SC_4_8_60_c`: 4 vCPUs and 8 GB of memory
         * *   `MSE_SC_8_16_60_c`: 8 vCPUs and 16 GB of memory
         * *   `MSE_SC_16_32_60_c`: 16 vCPUs and 32 GB of memory
         * 
         * \[Developer Edition]
         * 
         * *   `MSE_SC_1_2_60_c`: 1 vCPU and 2 GB of memory
         * *   `MSE_SC_2_4_60_c`: 2 vCPUs and 4 GB of memory
         * 
         * \[Serverless Edition]
         * 
         * Ignore this parameter or set this parameter to `MSE_SC_SERVERLESS`.
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * The type of the instance. Valid values: ZooKeeper and Nacos-Ans.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The engine version of the instance. Valid values:
         * <p>
         * 
         * \[Professional Edition]
         * 
         * *   `NACOS_2_0_0`
         * *   `ZooKeeper_3_8_0`
         * 
         * \[Developer Edition]
         * 
         * *   `NACOS_2_0_0`
         * *   `ZooKeeper_3_8_0`
         * 
         * \[Serverless Edition]
         * 
         * *   `NACOS_2_0_0`
         * *   `ZooKeeper_3_8_0`
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * The network connection type. Valid values: `slb` or `single_eni`. For instances of the Developer Edition in some regions, only the value `single_eni` is supported.
         */
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * This parameter is obsolete.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * Specifies whether to enable Internet access (Elastic IP Address) if ConnectionType is set to `single_eni`.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder eipEnabled(Boolean eipEnabled) {
            this.putQueryParameter("EipEnabled", eipEnabled);
            this.eipEnabled = eipEnabled;
            return this;
        }

        /**
         * The number of nodes in the instance. Valid values: 1 to 9.
         * <p>
         * 
         * \[Professional Edition]
         * 
         * *   The value must be greater than or equal to 3 and must be an odd number.
         * 
         * \[Developer Edition]
         * 
         * *   The value must be 1.
         * 
         * \[Serverless Edition]
         * 
         * Ignore this parameter.
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * The custom name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Configure this parameter unless otherwise specified. Valid values:
         * <p>
         * 
         * *   `mse_pro`: Professional Edition
         * *   `mse_dev`: Developer Edition
         * *   `mse_dev`: Serverless Edition
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * The network type of the MSE instance. Valid values:
         * <p>
         * 
         * *   `privatenet`: VPC
         * *   `pubnet`: Internet
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * This parameter is obsolete.
         */
        public Builder privateSlbSpecification(String privateSlbSpecification) {
            this.putQueryParameter("PrivateSlbSpecification", privateSlbSpecification);
            this.privateSlbSpecification = privateSlbSpecification;
            return this;
        }

        /**
         * This parameter is valid only if the ConnectionType parameter is set to `slb`. The value 0 indicates that the Server Load Balancer (SLB) instance is not connected over the Internet. A value greater than 1 indicates the fixed bandwidth that is used to access the SLB instance over the Internet. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: 0 to 5000.
         */
        public Builder pubNetworkFlow(String pubNetworkFlow) {
            this.putQueryParameter("PubNetworkFlow", pubNetworkFlow);
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        /**
         * This parameter is obsolete.
         */
        public Builder pubSlbSpecification(String pubSlbSpecification) {
            this.putQueryParameter("PubSlbSpecification", pubSlbSpecification);
            this.pubSlbSpecification = pubSlbSpecification;
            return this;
        }

        /**
         * The region where the instance resides. Examples:
         * <p>
         * 
         * *   `cn-hangzhou`: China (Hangzhou)
         * *   `cn-beijing`: China (Beijing)
         * *   `cn-shanghai`: China (Shanghai)
         * *   `cn-zhangjiakou`: China (Zhangjiakou)
         * *   `cn-shenzhen`: China (Shenzhen)
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * The ID of the resource group. For the details of resource groups, see [View basic information of a resource group](~~457230~~).
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of the security group to which the instance belongs. This parameter is valid only if the ConnectionType parameter is set to `single_eni`.
         * <p>
         * 
         * Valid values:
         * 
         * *   enterprise
         * *   normal
         */
        public Builder securityGroupType(String securityGroupType) {
            this.putQueryParameter("SecurityGroupType", securityGroupType);
            this.securityGroupType = securityGroupType;
            return this;
        }

        /**
         * The tags to add to the resource. You can specify up to 20 tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N to add to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
