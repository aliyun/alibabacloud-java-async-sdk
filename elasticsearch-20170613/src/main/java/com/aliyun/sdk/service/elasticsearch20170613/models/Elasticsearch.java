// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link Elasticsearch} extends {@link TeaModel}
 *
 * <p>Elasticsearch</p>
 */
public class Elasticsearch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("advancedDedicateMaster")
    private Boolean advancedDedicateMaster;

    @com.aliyun.core.annotation.NameInMap("advancedSetting")
    private AdvancedSetting advancedSetting;

    @com.aliyun.core.annotation.NameInMap("aliwsDicts")
    private java.util.List<DictInfo> aliwsDicts;

    @com.aliyun.core.annotation.NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("dataNode")
    private Boolean dataNode;

    @com.aliyun.core.annotation.NameInMap("dedicateMaster")
    private Boolean dedicateMaster;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("dictList")
    private java.util.List<DictInfo> dictList;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @com.aliyun.core.annotation.NameInMap("enableKibanaPrivateNetwork")
    private Boolean enableKibanaPrivateNetwork;

    @com.aliyun.core.annotation.NameInMap("enableKibanaPublicNetwork")
    private Boolean enableKibanaPublicNetwork;

    @com.aliyun.core.annotation.NameInMap("enablePublic")
    private Boolean enablePublic;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("esConfig")
    private java.util.Map<String, String> esConfig;

    @com.aliyun.core.annotation.NameInMap("esIPWhitelist")
    private java.util.List<String> esIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("esVersion")
    private String esVersion;

    @com.aliyun.core.annotation.NameInMap("extendConfigs")
    private java.util.List<java.util.Map<String, ?>> extendConfigs;

    @com.aliyun.core.annotation.NameInMap("haveClientNode")
    private Boolean haveClientNode;

    @com.aliyun.core.annotation.NameInMap("haveElasticDataNode")
    private Boolean haveElasticDataNode;

    @com.aliyun.core.annotation.NameInMap("haveKibana")
    private Boolean haveKibana;

    @com.aliyun.core.annotation.NameInMap("ikHotDicts")
    private java.util.List<DictInfo> ikHotDicts;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("kibanaConfiguration")
    private KibanaNodeConfiguration kibanaConfiguration;

    @com.aliyun.core.annotation.NameInMap("kibanaDomain")
    private String kibanaDomain;

    @com.aliyun.core.annotation.NameInMap("kibanaIPWhitelist")
    private java.util.List<String> kibanaIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("kibanaPort")
    private Long kibanaPort;

    @com.aliyun.core.annotation.NameInMap("kibanaPrivateDomain")
    private String kibanaPrivateDomain;

    @com.aliyun.core.annotation.NameInMap("kibanaPrivateIPWhitelist")
    private java.util.List<String> kibanaPrivateIPWhitelist;

    @com.aliyun.core.annotation.NameInMap("kibanaPrivatePort")
    private Long kibanaPrivatePort;

    @com.aliyun.core.annotation.NameInMap("kibanaProtocol")
    private String kibanaProtocol;

    @com.aliyun.core.annotation.NameInMap("masterConfiguration")
    private MasterNodeConfiguration masterConfiguration;

    @com.aliyun.core.annotation.NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.NameInMap("nodeAmount")
    private Long nodeAmount;

    @com.aliyun.core.annotation.NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("port")
    private Long port;

    @com.aliyun.core.annotation.NameInMap("privateNetworkIpWhiteList")
    private java.util.List<String> privateNetworkIpWhiteList;

    @com.aliyun.core.annotation.NameInMap("productType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    @com.aliyun.core.annotation.NameInMap("publicDomain")
    private String publicDomain;

    @com.aliyun.core.annotation.NameInMap("publicIpWhitelist")
    private java.util.List<String> publicIpWhitelist;

    @com.aliyun.core.annotation.NameInMap("publicPort")
    private Long publicPort;

    @com.aliyun.core.annotation.NameInMap("readWritePolicy")
    private ReadWritePolicy readWritePolicy;

    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("serviceVpc")
    private Boolean serviceVpc;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("synonymsDicts")
    private java.util.List<DictInfo> synonymsDicts;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tag> tags;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    @com.aliyun.core.annotation.NameInMap("warmNode")
    private Boolean warmNode;

    @com.aliyun.core.annotation.NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @com.aliyun.core.annotation.NameInMap("zoneCount")
    private Long zoneCount;

    @com.aliyun.core.annotation.NameInMap("zoneInfos")
    private java.util.List<ZoneInfo> zoneInfos;

    private Elasticsearch(Builder builder) {
        this.advancedDedicateMaster = builder.advancedDedicateMaster;
        this.advancedSetting = builder.advancedSetting;
        this.aliwsDicts = builder.aliwsDicts;
        this.clientNodeConfiguration = builder.clientNodeConfiguration;
        this.createdAt = builder.createdAt;
        this.dataNode = builder.dataNode;
        this.dedicateMaster = builder.dedicateMaster;
        this.description = builder.description;
        this.dictList = builder.dictList;
        this.domain = builder.domain;
        this.elasticDataNodeConfiguration = builder.elasticDataNodeConfiguration;
        this.enableKibanaPrivateNetwork = builder.enableKibanaPrivateNetwork;
        this.enableKibanaPublicNetwork = builder.enableKibanaPublicNetwork;
        this.enablePublic = builder.enablePublic;
        this.endTime = builder.endTime;
        this.esConfig = builder.esConfig;
        this.esIPWhitelist = builder.esIPWhitelist;
        this.esVersion = builder.esVersion;
        this.extendConfigs = builder.extendConfigs;
        this.haveClientNode = builder.haveClientNode;
        this.haveElasticDataNode = builder.haveElasticDataNode;
        this.haveKibana = builder.haveKibana;
        this.ikHotDicts = builder.ikHotDicts;
        this.instanceId = builder.instanceId;
        this.kibanaConfiguration = builder.kibanaConfiguration;
        this.kibanaDomain = builder.kibanaDomain;
        this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
        this.kibanaPort = builder.kibanaPort;
        this.kibanaPrivateDomain = builder.kibanaPrivateDomain;
        this.kibanaPrivateIPWhitelist = builder.kibanaPrivateIPWhitelist;
        this.kibanaPrivatePort = builder.kibanaPrivatePort;
        this.kibanaProtocol = builder.kibanaProtocol;
        this.masterConfiguration = builder.masterConfiguration;
        this.networkConfig = builder.networkConfig;
        this.nodeAmount = builder.nodeAmount;
        this.nodeSpec = builder.nodeSpec;
        this.paymentType = builder.paymentType;
        this.port = builder.port;
        this.privateNetworkIpWhiteList = builder.privateNetworkIpWhiteList;
        this.productType = builder.productType;
        this.protocol = builder.protocol;
        this.publicDomain = builder.publicDomain;
        this.publicIpWhitelist = builder.publicIpWhitelist;
        this.publicPort = builder.publicPort;
        this.readWritePolicy = builder.readWritePolicy;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceVpc = builder.serviceVpc;
        this.status = builder.status;
        this.synonymsDicts = builder.synonymsDicts;
        this.tags = builder.tags;
        this.updatedAt = builder.updatedAt;
        this.warmNode = builder.warmNode;
        this.warmNodeConfiguration = builder.warmNodeConfiguration;
        this.zoneCount = builder.zoneCount;
        this.zoneInfos = builder.zoneInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Elasticsearch create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return advancedDedicateMaster
     */
    public Boolean getAdvancedDedicateMaster() {
        return this.advancedDedicateMaster;
    }

    /**
     * @return advancedSetting
     */
    public AdvancedSetting getAdvancedSetting() {
        return this.advancedSetting;
    }

    /**
     * @return aliwsDicts
     */
    public java.util.List<DictInfo> getAliwsDicts() {
        return this.aliwsDicts;
    }

    /**
     * @return clientNodeConfiguration
     */
    public ClientNodeConfiguration getClientNodeConfiguration() {
        return this.clientNodeConfiguration;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return dataNode
     */
    public Boolean getDataNode() {
        return this.dataNode;
    }

    /**
     * @return dedicateMaster
     */
    public Boolean getDedicateMaster() {
        return this.dedicateMaster;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dictList
     */
    public java.util.List<DictInfo> getDictList() {
        return this.dictList;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return elasticDataNodeConfiguration
     */
    public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
        return this.elasticDataNodeConfiguration;
    }

    /**
     * @return enableKibanaPrivateNetwork
     */
    public Boolean getEnableKibanaPrivateNetwork() {
        return this.enableKibanaPrivateNetwork;
    }

    /**
     * @return enableKibanaPublicNetwork
     */
    public Boolean getEnableKibanaPublicNetwork() {
        return this.enableKibanaPublicNetwork;
    }

    /**
     * @return enablePublic
     */
    public Boolean getEnablePublic() {
        return this.enablePublic;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return esConfig
     */
    public java.util.Map<String, String> getEsConfig() {
        return this.esConfig;
    }

    /**
     * @return esIPWhitelist
     */
    public java.util.List<String> getEsIPWhitelist() {
        return this.esIPWhitelist;
    }

    /**
     * @return esVersion
     */
    public String getEsVersion() {
        return this.esVersion;
    }

    /**
     * @return extendConfigs
     */
    public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
        return this.extendConfigs;
    }

    /**
     * @return haveClientNode
     */
    public Boolean getHaveClientNode() {
        return this.haveClientNode;
    }

    /**
     * @return haveElasticDataNode
     */
    public Boolean getHaveElasticDataNode() {
        return this.haveElasticDataNode;
    }

    /**
     * @return haveKibana
     */
    public Boolean getHaveKibana() {
        return this.haveKibana;
    }

    /**
     * @return ikHotDicts
     */
    public java.util.List<DictInfo> getIkHotDicts() {
        return this.ikHotDicts;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return kibanaConfiguration
     */
    public KibanaNodeConfiguration getKibanaConfiguration() {
        return this.kibanaConfiguration;
    }

    /**
     * @return kibanaDomain
     */
    public String getKibanaDomain() {
        return this.kibanaDomain;
    }

    /**
     * @return kibanaIPWhitelist
     */
    public java.util.List<String> getKibanaIPWhitelist() {
        return this.kibanaIPWhitelist;
    }

    /**
     * @return kibanaPort
     */
    public Long getKibanaPort() {
        return this.kibanaPort;
    }

    /**
     * @return kibanaPrivateDomain
     */
    public String getKibanaPrivateDomain() {
        return this.kibanaPrivateDomain;
    }

    /**
     * @return kibanaPrivateIPWhitelist
     */
    public java.util.List<String> getKibanaPrivateIPWhitelist() {
        return this.kibanaPrivateIPWhitelist;
    }

    /**
     * @return kibanaPrivatePort
     */
    public Long getKibanaPrivatePort() {
        return this.kibanaPrivatePort;
    }

    /**
     * @return kibanaProtocol
     */
    public String getKibanaProtocol() {
        return this.kibanaProtocol;
    }

    /**
     * @return masterConfiguration
     */
    public MasterNodeConfiguration getMasterConfiguration() {
        return this.masterConfiguration;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return nodeAmount
     */
    public Long getNodeAmount() {
        return this.nodeAmount;
    }

    /**
     * @return nodeSpec
     */
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    /**
     * @return privateNetworkIpWhiteList
     */
    public java.util.List<String> getPrivateNetworkIpWhiteList() {
        return this.privateNetworkIpWhiteList;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return publicDomain
     */
    public String getPublicDomain() {
        return this.publicDomain;
    }

    /**
     * @return publicIpWhitelist
     */
    public java.util.List<String> getPublicIpWhitelist() {
        return this.publicIpWhitelist;
    }

    /**
     * @return publicPort
     */
    public Long getPublicPort() {
        return this.publicPort;
    }

    /**
     * @return readWritePolicy
     */
    public ReadWritePolicy getReadWritePolicy() {
        return this.readWritePolicy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceVpc
     */
    public Boolean getServiceVpc() {
        return this.serviceVpc;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return synonymsDicts
     */
    public java.util.List<DictInfo> getSynonymsDicts() {
        return this.synonymsDicts;
    }

    /**
     * @return tags
     */
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return warmNode
     */
    public Boolean getWarmNode() {
        return this.warmNode;
    }

    /**
     * @return warmNodeConfiguration
     */
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    /**
     * @return zoneCount
     */
    public Long getZoneCount() {
        return this.zoneCount;
    }

    /**
     * @return zoneInfos
     */
    public java.util.List<ZoneInfo> getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder {
        private Boolean advancedDedicateMaster; 
        private AdvancedSetting advancedSetting; 
        private java.util.List<DictInfo> aliwsDicts; 
        private ClientNodeConfiguration clientNodeConfiguration; 
        private String createdAt; 
        private Boolean dataNode; 
        private Boolean dedicateMaster; 
        private String description; 
        private java.util.List<DictInfo> dictList; 
        private String domain; 
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
        private Boolean enableKibanaPrivateNetwork; 
        private Boolean enableKibanaPublicNetwork; 
        private Boolean enablePublic; 
        private Long endTime; 
        private java.util.Map<String, String> esConfig; 
        private java.util.List<String> esIPWhitelist; 
        private String esVersion; 
        private java.util.List<java.util.Map<String, ?>> extendConfigs; 
        private Boolean haveClientNode; 
        private Boolean haveElasticDataNode; 
        private Boolean haveKibana; 
        private java.util.List<DictInfo> ikHotDicts; 
        private String instanceId; 
        private KibanaNodeConfiguration kibanaConfiguration; 
        private String kibanaDomain; 
        private java.util.List<String> kibanaIPWhitelist; 
        private Long kibanaPort; 
        private String kibanaPrivateDomain; 
        private java.util.List<String> kibanaPrivateIPWhitelist; 
        private Long kibanaPrivatePort; 
        private String kibanaProtocol; 
        private MasterNodeConfiguration masterConfiguration; 
        private NetworkConfig networkConfig; 
        private Long nodeAmount; 
        private NodeSpec nodeSpec; 
        private String paymentType; 
        private Long port; 
        private java.util.List<String> privateNetworkIpWhiteList; 
        private String productType; 
        private String protocol; 
        private String publicDomain; 
        private java.util.List<String> publicIpWhitelist; 
        private Long publicPort; 
        private ReadWritePolicy readWritePolicy; 
        private String resourceGroupId; 
        private Boolean serviceVpc; 
        private String status; 
        private java.util.List<DictInfo> synonymsDicts; 
        private java.util.List<Tag> tags; 
        private String updatedAt; 
        private Boolean warmNode; 
        private WarmNodeConfiguration warmNodeConfiguration; 
        private Long zoneCount; 
        private java.util.List<ZoneInfo> zoneInfos; 

        private Builder() {
        } 

        private Builder(Elasticsearch model) {
            this.advancedDedicateMaster = model.advancedDedicateMaster;
            this.advancedSetting = model.advancedSetting;
            this.aliwsDicts = model.aliwsDicts;
            this.clientNodeConfiguration = model.clientNodeConfiguration;
            this.createdAt = model.createdAt;
            this.dataNode = model.dataNode;
            this.dedicateMaster = model.dedicateMaster;
            this.description = model.description;
            this.dictList = model.dictList;
            this.domain = model.domain;
            this.elasticDataNodeConfiguration = model.elasticDataNodeConfiguration;
            this.enableKibanaPrivateNetwork = model.enableKibanaPrivateNetwork;
            this.enableKibanaPublicNetwork = model.enableKibanaPublicNetwork;
            this.enablePublic = model.enablePublic;
            this.endTime = model.endTime;
            this.esConfig = model.esConfig;
            this.esIPWhitelist = model.esIPWhitelist;
            this.esVersion = model.esVersion;
            this.extendConfigs = model.extendConfigs;
            this.haveClientNode = model.haveClientNode;
            this.haveElasticDataNode = model.haveElasticDataNode;
            this.haveKibana = model.haveKibana;
            this.ikHotDicts = model.ikHotDicts;
            this.instanceId = model.instanceId;
            this.kibanaConfiguration = model.kibanaConfiguration;
            this.kibanaDomain = model.kibanaDomain;
            this.kibanaIPWhitelist = model.kibanaIPWhitelist;
            this.kibanaPort = model.kibanaPort;
            this.kibanaPrivateDomain = model.kibanaPrivateDomain;
            this.kibanaPrivateIPWhitelist = model.kibanaPrivateIPWhitelist;
            this.kibanaPrivatePort = model.kibanaPrivatePort;
            this.kibanaProtocol = model.kibanaProtocol;
            this.masterConfiguration = model.masterConfiguration;
            this.networkConfig = model.networkConfig;
            this.nodeAmount = model.nodeAmount;
            this.nodeSpec = model.nodeSpec;
            this.paymentType = model.paymentType;
            this.port = model.port;
            this.privateNetworkIpWhiteList = model.privateNetworkIpWhiteList;
            this.productType = model.productType;
            this.protocol = model.protocol;
            this.publicDomain = model.publicDomain;
            this.publicIpWhitelist = model.publicIpWhitelist;
            this.publicPort = model.publicPort;
            this.readWritePolicy = model.readWritePolicy;
            this.resourceGroupId = model.resourceGroupId;
            this.serviceVpc = model.serviceVpc;
            this.status = model.status;
            this.synonymsDicts = model.synonymsDicts;
            this.tags = model.tags;
            this.updatedAt = model.updatedAt;
            this.warmNode = model.warmNode;
            this.warmNodeConfiguration = model.warmNodeConfiguration;
            this.zoneCount = model.zoneCount;
            this.zoneInfos = model.zoneInfos;
        } 

        /**
         * <p>Indicates whether the new dedicated master node is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }

        /**
         * <p>The advanced settings.</p>
         */
        public Builder advancedSetting(AdvancedSetting advancedSetting) {
            this.advancedSetting = advancedSetting;
            return this;
        }

        /**
         * <p>The Aliws dictionary configuration.</p>
         */
        public Builder aliwsDicts(java.util.List<DictInfo> aliwsDicts) {
            this.aliwsDicts = aliwsDicts;
            return this;
        }

        /**
         * <p>The client node configuration.</p>
         */
        public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>Indicates whether the instance contains data nodes. Valid values:</p>
         * <ul>
         * <li>true: The instance contains data nodes.</li>
         * <li>false: The instance does not contain data nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataNode(Boolean dataNode) {
            this.dataNode = dataNode;
            return this;
        }

        /**
         * <p>Indicates whether the instance contains legacy dedicated master nodes (deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The IK dictionary configuration.</p>
         */
        public Builder dictList(java.util.List<DictInfo> dictList) {
            this.dictList = dictList;
            return this;
        }

        /**
         * <p>The private network access address of the Elasticsearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The elastic data node configuration.</p>
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * <p>Indicates whether private network access to Kibana is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
            this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
            return this;
        }

        /**
         * <p>Indicates whether public network access to Kibana is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
            this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
            return this;
        }

        /**
         * <p>Indicates whether the public network address of the instance is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }

        /**
         * <p>The time when the instance expires. For pay-as-you-go instances, the default value is 100 years.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The YML file configuration of the instance.</p>
         */
        public Builder esConfig(java.util.Map<String, String> esConfig) {
            this.esConfig = esConfig;
            return this;
        }

        /**
         * <p>The private network access whitelist configuration of the instance (deprecated).</p>
         */
        public Builder esIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }

        /**
         * <p>The instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>6.3.2_with_X-Pack</p>
         */
        public Builder esVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }

        /**
         * <p>The extension parameter settings of the instance.</p>
         */
        public Builder extendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }

        /**
         * <p>Indicates whether client nodes are enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder haveClientNode(Boolean haveClientNode) {
            this.haveClientNode = haveClientNode;
            return this;
        }

        /**
         * <p>Indicates whether elastic data nodes are enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder haveElasticDataNode(Boolean haveElasticDataNode) {
            this.haveElasticDataNode = haveElasticDataNode;
            return this;
        }

        /**
         * <p>Indicates whether the instance contains Kibana nodes. Valid values:</p>
         * <ul>
         * <li>true: The instance contains Kibana nodes.</li>
         * <li>false: The instance does not contain Kibana nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder haveKibana(Boolean haveKibana) {
            this.haveKibana = haveKibana;
            return this;
        }

        /**
         * <p>The IK hot dictionary configuration.</p>
         */
        public Builder ikHotDicts(java.util.List<DictInfo> ikHotDicts) {
            this.ikHotDicts = ikHotDicts;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Kibana node configuration.</p>
         */
        public Builder kibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }

        /**
         * <p>The public network access address of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.kibana.elasticsearch.aliyuncs.com</p>
         */
        public Builder kibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }

        /**
         * <p>The public network access whitelist configuration of Kibana.</p>
         */
        public Builder kibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }

        /**
         * <p>The public network access port of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        public Builder kibanaPort(Long kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }

        /**
         * <p>The private network access address of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-tl329rbpc0001****-kibana.internal.elasticsearch.aliyuncs.com</p>
         */
        public Builder kibanaPrivateDomain(String kibanaPrivateDomain) {
            this.kibanaPrivateDomain = kibanaPrivateDomain;
            return this;
        }

        /**
         * <p>The IP whitelist configuration for private network access to Kibana.</p>
         */
        public Builder kibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }

        /**
         * <p>The private network access port of Kibana.</p>
         * 
         * <strong>example:</strong>
         * <p>5601</p>
         */
        public Builder kibanaPrivatePort(Long kibanaPrivatePort) {
            this.kibanaPrivatePort = kibanaPrivatePort;
            return this;
        }

        /**
         * <p>The access protocol for Kibana. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTPS</p>
         */
        public Builder kibanaProtocol(String kibanaProtocol) {
            this.kibanaProtocol = kibanaProtocol;
            return this;
        }

        /**
         * <p>The dedicated master node configuration.</p>
         */
        public Builder masterConfiguration(MasterNodeConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }

        /**
         * <p>The network configuration of the instance.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The number of data nodes in the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * <p>The data node configuration.</p>
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>prepaid: subscription.</li>
         * <li>postpaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prepaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The private network access port of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The private network address access whitelist configuration of the instance.</p>
         */
        public Builder privateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li>logEnhancement: Advanced Edition.</li>
         * <li>generalBusiness: general commercial edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>generalBusiness</p>
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * <p>The access protocol of the instance. Valid values: HTTP and HTTPS.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The public network access address of the Elasticsearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
         */
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }

        /**
         * <p>The public network access whitelist configuration of the instance.</p>
         */
        public Builder publicIpWhitelist(java.util.List<String> publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }

        /**
         * <p>The public network access port of the Elasticsearch instance.</p>
         * 
         * <strong>example:</strong>
         * <p>9200</p>
         */
        public Builder publicPort(Long publicPort) {
            this.publicPort = publicPort;
            return this;
        }

        /**
         * <p>The high availability configuration of the instance.</p>
         */
        public Builder readWritePolicy(ReadWritePolicy readWritePolicy) {
            this.readWritePolicy = readWritePolicy;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvowej3i****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the instance is in the Elasticsearch service VPC. Valid values:</p>
         * <ul>
         * <li>true: The instance is in the service VPC.</li>
         * <li>false: The instance is not in the service VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li>active: Normal.</li>
         * <li>activating: Taking effect.</li>
         * <li>inactive: Frozen.</li>
         * <li>invalid: Expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The synonym dictionary configuration of the instance.</p>
         */
        public Builder synonymsDicts(java.util.List<DictInfo> synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }

        /**
         * <p>The instance tags.</p>
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * <p>Indicates whether warm data nodes are enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder warmNode(Boolean warmNode) {
            this.warmNode = warmNode;
            return this;
        }

        /**
         * <p>The warm data node configuration.</p>
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * <p>The number of zones for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder zoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * <p>The zone information of the instance.</p>
         */
        public Builder zoneInfos(java.util.List<ZoneInfo> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public Elasticsearch build() {
            return new Elasticsearch(this);
        } 

    } 

    /**
     * 
     * {@link Elasticsearch} extends {@link TeaModel}
     *
     * <p>Elasticsearch</p>
     */
    public static class AdvancedSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gcName")
        private String gcName;

        private AdvancedSetting(Builder builder) {
            this.gcName = builder.gcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdvancedSetting create() {
            return builder().build();
        }

        /**
         * @return gcName
         */
        public String getGcName() {
            return this.gcName;
        }

        public static final class Builder {
            private String gcName; 

            private Builder() {
            } 

            private Builder(AdvancedSetting model) {
                this.gcName = model.gcName;
            } 

            /**
             * <p>GC垃圾回收器名称。支持CMS和G1。</p>
             * 
             * <strong>example:</strong>
             * <p>CMS</p>
             */
            public Builder gcName(String gcName) {
                this.gcName = gcName;
                return this;
            }

            public AdvancedSetting build() {
                return new AdvancedSetting(this);
            } 

        } 

    }
}
