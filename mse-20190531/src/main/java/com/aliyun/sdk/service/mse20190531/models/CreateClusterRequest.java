// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Tag> tag; 
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
         * <p>The language type of the returned information:</p>
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
         * <p>Billing method, including PREPAY (Subscription) and POSTPAY (Pay-As-You-Go).</p>
         * <p>This parameter is ignored for the Serverless edition.</p>
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
         * <p>Engine specifications, with the following values:</p>
         * <p>[Professional Edition] </p>
         * <ul>
         * <li><code>MSE_SC_2_4_60_c</code>: 2 cores, 4GB</li>
         * <li><code>MSE_SC_1_2_60_c</code>: 1 core, 2GB</li>
         * <li><code>MSE_SC_4_8_60_c</code>: 4 cores, 8GB</li>
         * <li><code>MSE_SC_8_16_60_c</code>: 8 cores, 16GB</li>
         * <li><code>MSE_SC_16_32_60_c</code>: 16 cores, 32GB</li>
         * </ul>
         * <p>[Developer Edition] </p>
         * <ul>
         * <li><code>MSE_SC_1_2_60_c</code>: 1 core, 2GB</li>
         * <li><code>MSE_SC_2_4_60_c</code>: 2 cores, 4GB</li>
         * </ul>
         * <p>[Serverless Edition]</p>
         * <p>Ignore this parameter, or you can fill in <code>MSE_SC_SERVERLESS</code>.</p>
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
         * <p>Cluster type, including ZooKeeper, Nacos-Ans.</p>
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
         * <p>Cluster version, with the following values:</p>
         * <p>[Professional Edition] </p>
         * <ul>
         * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x.x version.</li>
         * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
         * </ul>
         * <p>[Developer Edition] </p>
         * <ul>
         * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x version.</li>
         * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
         * </ul>
         * <p>[Serverless Edition]</p>
         * <ul>
         * <li><code>NACOS_2_0_0</code>: indicates Nacos 2.x version.</li>
         * <li><code>ZooKeeper_3_8_0</code>: indicates ZooKeeper 3.8.x version.</li>
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
         * <p>Network access type, <code>slb</code> or <code>single_eni</code>; some regions&quot; Developer Edition only support the <code>single_eni</code> type.</p>
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
         * <p>No longer in use</p>
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
         * <p>Valid when <code>ConnectionType</code> is <code>single_eni</code>, indicating whether to enable public network access (Elastic IP).</p>
         */
        public Builder eipEnabled(Boolean eipEnabled) {
            this.putQueryParameter("EipEnabled", eipEnabled);
            this.eipEnabled = eipEnabled;
            return this;
        }

        /**
         * <p>Number of instance nodes, with a range limit of 1 to 9.</p>
         * <p>[Professional Edition] </p>
         * <ul>
         * <li>The number of instances must be 3 or more and must be an odd number.</li>
         * </ul>
         * <p>[Developer Edition] </p>
         * <ul>
         * <li>The number of instances can only be 1.</li>
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
         * <p>Custom instance name</p>
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
         * <p>Required unless under special circumstances, with the following values:</p>
         * <ul>
         * <li><code>mse_pro</code>: indicates Professional Edition.</li>
         * <li><code>mse_dev</code>: indicates Developer Edition.</li>
         * <li><code>mse_serverless</code>: indicates Serverless Edition.</li>
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
         * <p>Network type, with the following values:</p>
         * <ul>
         * <li><code>privatenet</code>: indicates a private network.</li>
         * <li><code>pubnet</code>: indicates a public network.</li>
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
         * <p>No longer in use</p>
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
         * <p>Valid when <code>ConnectionType</code> is <code>slb</code>. 0 indicates no public network access SLB creation, and values above 1 indicate a fixed bandwidth for public network access SLB; unit: Mbps.</p>
         * <p>Value range: 0~5000.</p>
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
         * <p>No longer in use</p>
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
         * <p>The region where the cluster is located, including but not limited to the following regions:</p>
         * <ul>
         * <li><code>cn-hangzhou</code>: Hangzhou</li>
         * <li><code>cn-beijing</code>: Beijing</li>
         * <li><code>cn-shanghai</code>: Shanghai</li>
         * <li><code>cn-zhangjiakou</code>: Zhangjiakou</li>
         * <li><code>cn-shenzhen</code>: Shenzhen</li>
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
         * <p>Extended request parameters, in JSON format.</p>
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
         * <p>Resource group ID. For more details about the resource group, see <a href="https://help.aliyun.com/document_detail/457230.html">Basic Information of Resource Group</a>.</p>
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
         * <p>Valid when <code>ConnectionType</code> is <code>single_eni</code>, indicating the security group type of the instance.</p>
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
         * <p>List of tags to be added. Contains up to 20 items.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Switch ID.</p>
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
         * <p>VPC ID.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
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
