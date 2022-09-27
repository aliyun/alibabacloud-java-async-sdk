// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Elasticsearch} extends {@link TeaModel}
 *
 * <p>Elasticsearch</p>
 */
public class Elasticsearch extends TeaModel {
    @NameInMap("advancedDedicateMaster")
    private Boolean advancedDedicateMaster;

    @NameInMap("advancedSetting")
    private AdvancedSetting advancedSetting;

    @NameInMap("aliwsDicts")
    private java.util.List < DictInfo > aliwsDicts;

    @NameInMap("clientNodeConfiguration")
    private ClientNodeConfiguration clientNodeConfiguration;

    @NameInMap("createdAt")
    private String createdAt;

    @NameInMap("dataNode")
    private Boolean dataNode;

    @NameInMap("dedicateMaster")
    private Boolean dedicateMaster;

    @NameInMap("description")
    private String description;

    @NameInMap("dictList")
    private java.util.List < DictInfo > dictList;

    @NameInMap("domain")
    private String domain;

    @NameInMap("elasticDataNodeConfiguration")
    private ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @NameInMap("enableKibanaPrivateNetwork")
    private Boolean enableKibanaPrivateNetwork;

    @NameInMap("enableKibanaPublicNetwork")
    private Boolean enableKibanaPublicNetwork;

    @NameInMap("enablePublic")
    private Boolean enablePublic;

    @NameInMap("endTime")
    private Long endTime;

    @NameInMap("esConfig")
    private java.util.Map < String, String > esConfig;

    @NameInMap("esIPWhitelist")
    private java.util.List < String > esIPWhitelist;

    @NameInMap("esVersion")
    private String esVersion;

    @NameInMap("extendConfigs")
    private java.util.List < java.util.Map<String, ?>> extendConfigs;

    @NameInMap("haveClientNode")
    private Boolean haveClientNode;

    @NameInMap("haveElasticDataNode")
    private Boolean haveElasticDataNode;

    @NameInMap("haveKibana")
    private Boolean haveKibana;

    @NameInMap("ikHotDicts")
    private java.util.List < DictInfo > ikHotDicts;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("kibanaConfiguration")
    private KibanaNodeConfiguration kibanaConfiguration;

    @NameInMap("kibanaDomain")
    private String kibanaDomain;

    @NameInMap("kibanaIPWhitelist")
    private java.util.List < String > kibanaIPWhitelist;

    @NameInMap("kibanaPort")
    private Long kibanaPort;

    @NameInMap("kibanaPrivateDomain")
    private String kibanaPrivateDomain;

    @NameInMap("kibanaPrivateIPWhitelist")
    private java.util.List < String > kibanaPrivateIPWhitelist;

    @NameInMap("kibanaPrivatePort")
    private Long kibanaPrivatePort;

    @NameInMap("kibanaProtocol")
    private String kibanaProtocol;

    @NameInMap("masterConfiguration")
    private MasterNodeConfiguration masterConfiguration;

    @NameInMap("networkConfig")
    private NetworkConfig networkConfig;

    @NameInMap("nodeAmount")
    private Long nodeAmount;

    @NameInMap("nodeSpec")
    private NodeSpec nodeSpec;

    @NameInMap("paymentType")
    private String paymentType;

    @NameInMap("port")
    private Long port;

    @NameInMap("privateNetworkIpWhiteList")
    private java.util.List < String > privateNetworkIpWhiteList;

    @NameInMap("productType")
    private String productType;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("publicDomain")
    private String publicDomain;

    @NameInMap("publicIpWhitelist")
    private java.util.List < String > publicIpWhitelist;

    @NameInMap("publicPort")
    private Long publicPort;

    @NameInMap("readWritePolicy")
    private ReadWritePolicy readWritePolicy;

    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @NameInMap("serviceVpc")
    private Boolean serviceVpc;

    @NameInMap("status")
    private String status;

    @NameInMap("synonymsDicts")
    private java.util.List < DictInfo > synonymsDicts;

    @NameInMap("tags")
    private java.util.List < Tag > tags;

    @NameInMap("updatedAt")
    private String updatedAt;

    @NameInMap("warmNode")
    private Boolean warmNode;

    @NameInMap("warmNodeConfiguration")
    private WarmNodeConfiguration warmNodeConfiguration;

    @NameInMap("zoneCount")
    private Long zoneCount;

    @NameInMap("zoneInfos")
    private java.util.List < ZoneInfo > zoneInfos;

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
    public java.util.List < DictInfo > getAliwsDicts() {
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
    public java.util.List < DictInfo > getDictList() {
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
    public java.util.Map < String, String > getEsConfig() {
        return this.esConfig;
    }

    /**
     * @return esIPWhitelist
     */
    public java.util.List < String > getEsIPWhitelist() {
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
    public java.util.List < java.util.Map<String, ?>> getExtendConfigs() {
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
    public java.util.List < DictInfo > getIkHotDicts() {
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
    public java.util.List < String > getKibanaIPWhitelist() {
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
    public java.util.List < String > getKibanaPrivateIPWhitelist() {
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
    public java.util.List < String > getPrivateNetworkIpWhiteList() {
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
    public java.util.List < String > getPublicIpWhitelist() {
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
    public java.util.List < DictInfo > getSynonymsDicts() {
        return this.synonymsDicts;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
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
    public java.util.List < ZoneInfo > getZoneInfos() {
        return this.zoneInfos;
    }

    public static final class Builder {
        private Boolean advancedDedicateMaster; 
        private AdvancedSetting advancedSetting; 
        private java.util.List < DictInfo > aliwsDicts; 
        private ClientNodeConfiguration clientNodeConfiguration; 
        private String createdAt; 
        private Boolean dataNode; 
        private Boolean dedicateMaster; 
        private String description; 
        private java.util.List < DictInfo > dictList; 
        private String domain; 
        private ElasticDataNodeConfiguration elasticDataNodeConfiguration; 
        private Boolean enableKibanaPrivateNetwork; 
        private Boolean enableKibanaPublicNetwork; 
        private Boolean enablePublic; 
        private Long endTime; 
        private java.util.Map < String, String > esConfig; 
        private java.util.List < String > esIPWhitelist; 
        private String esVersion; 
        private java.util.List < java.util.Map<String, ?>> extendConfigs; 
        private Boolean haveClientNode; 
        private Boolean haveElasticDataNode; 
        private Boolean haveKibana; 
        private java.util.List < DictInfo > ikHotDicts; 
        private String instanceId; 
        private KibanaNodeConfiguration kibanaConfiguration; 
        private String kibanaDomain; 
        private java.util.List < String > kibanaIPWhitelist; 
        private Long kibanaPort; 
        private String kibanaPrivateDomain; 
        private java.util.List < String > kibanaPrivateIPWhitelist; 
        private Long kibanaPrivatePort; 
        private String kibanaProtocol; 
        private MasterNodeConfiguration masterConfiguration; 
        private NetworkConfig networkConfig; 
        private Long nodeAmount; 
        private NodeSpec nodeSpec; 
        private String paymentType; 
        private Long port; 
        private java.util.List < String > privateNetworkIpWhiteList; 
        private String productType; 
        private String protocol; 
        private String publicDomain; 
        private java.util.List < String > publicIpWhitelist; 
        private Long publicPort; 
        private ReadWritePolicy readWritePolicy; 
        private String resourceGroupId; 
        private Boolean serviceVpc; 
        private String status; 
        private java.util.List < DictInfo > synonymsDicts; 
        private java.util.List < Tag > tags; 
        private String updatedAt; 
        private Boolean warmNode; 
        private WarmNodeConfiguration warmNodeConfiguration; 
        private Long zoneCount; 
        private java.util.List < ZoneInfo > zoneInfos; 

        /**
         * 开启新版专有主节点
         */
        public Builder advancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }

        /**
         * 高级配置
         */
        public Builder advancedSetting(AdvancedSetting advancedSetting) {
            this.advancedSetting = advancedSetting;
            return this;
        }

        /**
         * Aliws词典配置
         */
        public Builder aliwsDicts(java.util.List < DictInfo > aliwsDicts) {
            this.aliwsDicts = aliwsDicts;
            return this;
        }

        /**
         * 协调节点配置
         */
        public Builder clientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * 是否包含数据节点
         */
        public Builder dataNode(Boolean dataNode) {
            this.dataNode = dataNode;
            return this;
        }

        /**
         * 是否包含旧专有主节点
         */
        public Builder dedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }

        /**
         * 集群自定义名称
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * IK词典配置
         */
        public Builder dictList(java.util.List < DictInfo > dictList) {
            this.dictList = dictList;
            return this;
        }

        /**
         * Elasticsearch集群私网访问链接
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * elasticDataNodeConfiguration.
         */
        public Builder elasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }

        /**
         * 是否开启Kibana私网访问
         */
        public Builder enableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
            this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
            return this;
        }

        /**
         * 是否开启kibana公网访问
         */
        public Builder enableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
            this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
            return this;
        }

        /**
         * Elasticsearch是否开启公网访问
         */
        public Builder enablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }

        /**
         * 集群到期时间，后付费实例默认100年
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Elasticsearch集群settings配置
         */
        public Builder esConfig(java.util.Map < String, String > esConfig) {
            this.esConfig = esConfig;
            return this;
        }

        /**
         * Elasticsearch集群私网访问白名单。已废弃
         */
        public Builder esIPWhitelist(java.util.List < String > esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }

        /**
         * 实例版本
         */
        public Builder esVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }

        /**
         * 集群扩展参数配置
         */
        public Builder extendConfigs(java.util.List < java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }

        /**
         * 是否开启协调节点
         */
        public Builder haveClientNode(Boolean haveClientNode) {
            this.haveClientNode = haveClientNode;
            return this;
        }

        /**
         * 是否开启弹性节点
         */
        public Builder haveElasticDataNode(Boolean haveElasticDataNode) {
            this.haveElasticDataNode = haveElasticDataNode;
            return this;
        }

        /**
         * 存在kibana节点
         */
        public Builder haveKibana(Boolean haveKibana) {
            this.haveKibana = haveKibana;
            return this;
        }

        /**
         * IK热词词典配置
         */
        public Builder ikHotDicts(java.util.List < DictInfo > ikHotDicts) {
            this.ikHotDicts = ikHotDicts;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * kibanaConfiguration.
         */
        public Builder kibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }

        /**
         * Kibana公网访问链接
         */
        public Builder kibanaDomain(String kibanaDomain) {
            this.kibanaDomain = kibanaDomain;
            return this;
        }

        /**
         * Kibana公网访问白名单
         */
        public Builder kibanaIPWhitelist(java.util.List < String > kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }

        /**
         * Kibana公网访问端口号
         */
        public Builder kibanaPort(Long kibanaPort) {
            this.kibanaPort = kibanaPort;
            return this;
        }

        /**
         * Kibana私网访问链接
         */
        public Builder kibanaPrivateDomain(String kibanaPrivateDomain) {
            this.kibanaPrivateDomain = kibanaPrivateDomain;
            return this;
        }

        /**
         * Kibana节点私网访问IP
         */
        public Builder kibanaPrivateIPWhitelist(java.util.List < String > kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }

        /**
         * Kibana私网访问端口号
         */
        public Builder kibanaPrivatePort(Long kibanaPrivatePort) {
            this.kibanaPrivatePort = kibanaPrivatePort;
            return this;
        }

        /**
         * Kibana访问协议
         */
        public Builder kibanaProtocol(String kibanaProtocol) {
            this.kibanaProtocol = kibanaProtocol;
            return this;
        }

        /**
         * masterConfiguration.
         */
        public Builder masterConfiguration(MasterNodeConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }

        /**
         * 实例网络设置
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * Elasticseach集群热数据节点数量
         */
        public Builder nodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }

        /**
         * nodeSpec.
         */
        public Builder nodeSpec(NodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }

        /**
         * 实例付费类型
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 集群私网访问端口
         */
        public Builder port(Long port) {
            this.port = port;
            return this;
        }

        /**
         * Elasticsearch集群私网访问白名单
         */
        public Builder privateNetworkIpWhiteList(java.util.List < String > privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }

        /**
         * 实例类型
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * Elasticsearch集群访问协议
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * Elasticsearch公网访问
         */
        public Builder publicDomain(String publicDomain) {
            this.publicDomain = publicDomain;
            return this;
        }

        /**
         * Elasticsearch集群公网访问IP
         */
        public Builder publicIpWhitelist(java.util.List < String > publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }

        /**
         * Elasticsearch集群公网访问端口号
         */
        public Builder publicPort(Long publicPort) {
            this.publicPort = publicPort;
            return this;
        }

        /**
         * readWritePolicy.
         */
        public Builder readWritePolicy(ReadWritePolicy readWritePolicy) {
            this.readWritePolicy = readWritePolicy;
            return this;
        }

        /**
         * 资源组标识
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 云服务VPC
         */
        public Builder serviceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }

        /**
         * 集群变更状态
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 实例同义词配置
         */
        public Builder synonymsDicts(java.util.List < DictInfo > synonymsDicts) {
            this.synonymsDicts = synonymsDicts;
            return this;
        }

        /**
         * 标签
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * 实例修改时间
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * 是否开启冷节点
         */
        public Builder warmNode(Boolean warmNode) {
            this.warmNode = warmNode;
            return this;
        }

        /**
         * warmNodeConfiguration.
         */
        public Builder warmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
            this.warmNodeConfiguration = warmNodeConfiguration;
            return this;
        }

        /**
         * 实例所在可用区数量
         */
        public Builder zoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }

        /**
         * 集群可用区分布状态
         */
        public Builder zoneInfos(java.util.List < ZoneInfo > zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }

        public Elasticsearch build() {
            return new Elasticsearch(this);
        } 

    } 

    public static class AdvancedSetting extends TeaModel {
        @NameInMap("gcName")
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

            /**
             * GC垃圾回收器名称
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
