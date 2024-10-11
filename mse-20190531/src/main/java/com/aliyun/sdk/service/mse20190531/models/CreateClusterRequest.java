// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterSpecification")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionType")
    private String connectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    @Deprecated
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipEnabled")
    private Boolean eipEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer instanceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseVersion")
    private String mseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateSlbSpecification")
    @Deprecated
    private String privateSlbSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PubNetworkFlow")
    private String pubNetworkFlow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PubSlbSpecification")
    @Deprecated
    private String pubSlbSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupType")
    private String securityGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The billing method. Valid values: PREPAY and POSTPAY.</p>
         * <p>Ignore this parameter for serverless instances.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The engine specifications. Valid values:</p>
         * <p>[Professional Edition]</p>
         * <ul>
         * <li><code>MSE_SC_2_4_60_c</code>: 2 vCPUs and 4 GB of memory</li>
         * <li><code>MSE_SC_1_2_60_c</code>: 1 vCPU and 2 GB of memory</li>
         * <li><code>MSE_SC_4_8_60_c</code>: 4 vCPUs and 8 GB of memory</li>
         * <li><code>MSE_SC_8_16_60_c</code>: 8 vCPUs and 16 GB of memory</li>
         * <li><code>MSE_SC_16_32_60_c</code>: 16 vCPUs and 32 GB of memory</li>
         * </ul>
         * <p>[Developer Edition]</p>
         * <ul>
         * <li><code>MSE_SC_1_2_60_c</code>: 1 vCPU and 2 GB of memory</li>
         * <li><code>MSE_SC_2_4_60_c</code>: 2 vCPUs and 4 GB of memory</li>
         * </ul>
         * <p>[Serverless Edition]</p>
         * <p>Ignore this parameter or set this parameter to <code>MSE_SC_SERVERLESS</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_SC_2_4_60_c</p>
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * <p>The type of the instance. Valid values: ZooKeeper and Nacos-Ans.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Nacos-Ans</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The engine version of the instance. Valid values:</p>
         * <p>[Professional Edition]</p>
         * <ul>
         * <li><code>NACOS_2_0_0</code></li>
         * <li><code>ZooKeeper_3_8_0</code></li>
         * </ul>
         * <p>[Developer Edition]</p>
         * <ul>
         * <li><code>NACOS_2_0_0</code></li>
         * <li><code>ZooKeeper_3_8_0</code></li>
         * </ul>
         * <p>[Serverless Edition]</p>
         * <ul>
         * <li><code>NACOS_2_0_0</code></li>
         * <li><code>ZooKeeper_3_8_0</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NACOS_2_0_0</p>
         */
        public Builder clusterVersion(String clusterVersion) {
            this.putQueryParameter("ClusterVersion", clusterVersion);
            this.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * <p>The network connection type. Valid values: <code>slb</code> or <code>single_eni</code>. For instances of the Developer Edition in some regions, only the value <code>single_eni</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder connectionType(String connectionType) {
            this.putQueryParameter("ConnectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * <p>This parameter is obsolete.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud-disk-ssd</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>Specifies whether to enable Internet access (Elastic IP Address) if ConnectionType is set to <code>single_eni</code>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         */
        public Builder eipEnabled(Boolean eipEnabled) {
            this.putQueryParameter("EipEnabled", eipEnabled);
            this.eipEnabled = eipEnabled;
            return this;
        }

        /**
         * <p>The number of nodes in the instance. Valid values: 1 to 9.</p>
         * <p>[Professional Edition]</p>
         * <ul>
         * <li>The value must be greater than or equal to 3 and must be an odd number.</li>
         * </ul>
         * <p>[Developer Edition]</p>
         * <ul>
         * <li>The value must be 1.</li>
         * </ul>
         * <p>[Serverless Edition]</p>
         * <p>Ignore this parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The custom name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tanshuyingtest001</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Configure this parameter unless otherwise specified. Valid values:</p>
         * <ul>
         * <li><code>mse_pro</code>: Professional Edition</li>
         * <li><code>mse_dev</code>: Developer Edition</li>
         * <li><code>mse_dev</code>: Serverless Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * <p>The network type of the MSE instance. Valid values:</p>
         * <ul>
         * <li><code>privatenet</code>: VPC</li>
         * <li><code>pubnet</code>: Internet</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>privatenet</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * <p>This parameter is obsolete.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder privateSlbSpecification(String privateSlbSpecification) {
            this.putQueryParameter("PrivateSlbSpecification", privateSlbSpecification);
            this.privateSlbSpecification = privateSlbSpecification;
            return this;
        }

        /**
         * <p>This parameter is valid only if the ConnectionType parameter is set to <code>slb</code>. The value 0 indicates that the Server Load Balancer (SLB) instance is not connected over the Internet. A value greater than 1 indicates the fixed bandwidth that is used to access the SLB instance over the Internet. Unit: Mbit/s.</p>
         * <p>Valid values: 0 to 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pubNetworkFlow(String pubNetworkFlow) {
            this.putQueryParameter("PubNetworkFlow", pubNetworkFlow);
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        /**
         * <p>This parameter is obsolete.</p>
         * 
         * <strong>example:</strong>
         * <p>slb.s1.small</p>
         */
        public Builder pubSlbSpecification(String pubSlbSpecification) {
            this.putQueryParameter("PubSlbSpecification", pubSlbSpecification);
            this.pubSlbSpecification = pubSlbSpecification;
            return this;
        }

        /**
         * <p>The region where the instance resides. Examples:</p>
         * <ul>
         * <li><code>cn-hangzhou</code>: China (Hangzhou)</li>
         * <li><code>cn-beijing</code>: China (Beijing)</li>
         * <li><code>cn-shanghai</code>: China (Shanghai)</li>
         * <li><code>cn-zhangjiakou</code>: China (Zhangjiakou)</li>
         * <li><code>cn-shenzhen</code>: China (Shenzhen)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The extended request parameters in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        /**
         * <p>The ID of the resource group. For the details of resource groups, see <a href="https://help.aliyun.com/document_detail/457230.html">View basic information of a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzcqmoay3dlyq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the security group to which the instance belongs. This parameter is valid only if the ConnectionType parameter is set to <code>single_eni</code>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>enterprise</li>
         * <li>normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder securityGroupType(String securityGroupType) {
            this.putQueryParameter("SecurityGroupType", securityGroupType);
            this.securityGroupType = securityGroupType;
            return this;
        }

        /**
         * <p>The tags to add to the resource. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp17opt4v18sto39k****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1t50e045b5g7i3p****</p>
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

    /**
     * 
     * {@link CreateClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of tag N to add to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>prd</p>
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
