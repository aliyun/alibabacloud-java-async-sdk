// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RestartInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RestartInstanceResponseBody</p>
 */
public class RestartInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private RestartInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public RestartInstanceResponseBody build() {
            return new RestartInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class DictList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DictList(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DictList create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * <p>The size of the Dictionary File. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2782602</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The name of the dictionary file.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_MAIN.dic</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source type. Valid values:</p>
             * <ul>
             * <li>OSS: OSS open storage (need to ensure that OSS storage space is public readable.)</li>
             * <li>ORIGIN: Open source Elasticsearch</li>
             * <li>UPLOAD: Uploaded files</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORIGIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the dictionary. Valid values:</p>
             * <ul>
             * <li>STOP: The STOP word.</li>
             * <li>MAIN: MAIN Dictionary</li>
             * <li>SYNONYMS: SYNONYMS</li>
             * <li>ALI_WS: an Alibaba Dictionary.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MAIN</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DictList build() {
                return new DictList(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class KibanaConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private KibanaConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KibanaConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The number of performance metrics.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The size of the node storage space. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The specification of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public KibanaConfiguration build() {
                return new KibanaConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class MasterConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private MasterConfiguration(Builder builder) {
            this.amount = builder.amount;
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterConfiguration create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The number of nodes in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The size of the node storage space. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node. This tool only supports cloud_ssd (cloud SSD) disks.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The node specifications of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.sn2ne.large</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public MasterConfiguration build() {
                return new MasterConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("vsArea")
        private String vsArea;

        @com.aliyun.core.annotation.NameInMap("vswitchId")
        private String vswitchId;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 

            /**
             * <p>The network type. Only Virtual Private Cloud (VPC) is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16k1dvzxtmagcva****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the specified VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1k4ec6s7sjdbudw****</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class NodeSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("disk")
        private Integer disk;

        @com.aliyun.core.annotation.NameInMap("diskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("spec")
        private String spec;

        private NodeSpec(Builder builder) {
            this.disk = builder.disk;
            this.diskType = builder.diskType;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSpec create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public Integer getDisk() {
            return this.disk;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer disk; 
            private String diskType; 
            private String spec; 

            /**
             * <p>The storage space size per data node. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * <p>The storage type of the node. Valid values: cloud_ssd and cloud_efficiency.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The specification of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticsearch.n4.small</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public NodeSpec build() {
                return new NodeSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class SynonymsDicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SynonymsDicts(Builder builder) {
            this.fileSize = builder.fileSize;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynonymsDicts create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileSize; 
            private String name; 
            private String sourceType; 
            private String type; 

            /**
             * <p>The size of the Dictionary File. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>2782602</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The name of the dictionary file.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM_MAIN.dic</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The source type. Valid values:</p>
             * <ul>
             * <li>OSS:OSS open storage (the OSS storage space must be publicly readable.)</li>
             * <li>ORIGIN: open-source Elasticsearch</li>
             * <li>UPLOAD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ORIGIN</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The type of the dictionary. Valid values:</p>
             * <ul>
             * <li>STOP: The STOP word.</li>
             * <li>MAIN: MAIN Dictionary</li>
             * <li>SYNONYMS: SYNONYMS</li>
             * <li>ALI_WS: an Alibaba Dictionary.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STOP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SynonymsDicts build() {
                return new SynonymsDicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link RestartInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>RestartInstanceResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("dictList")
        private java.util.List < DictList> dictList;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("esVersion")
        private String esVersion;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @com.aliyun.core.annotation.NameInMap("kibanaDomain")
        private String kibanaDomain;

        @com.aliyun.core.annotation.NameInMap("kibanaPort")
        private Integer kibanaPort;

        @com.aliyun.core.annotation.NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @com.aliyun.core.annotation.NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @com.aliyun.core.annotation.NameInMap("nodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @com.aliyun.core.annotation.NameInMap("paymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("publicDomain")
        private String publicDomain;

        @com.aliyun.core.annotation.NameInMap("publicPort")
        private Integer publicPort;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("synonymsDicts")
        private java.util.List < SynonymsDicts> synonymsDicts;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        private Result(Builder builder) {
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.dictList = builder.dictList;
            this.domain = builder.domain;
            this.esVersion = builder.esVersion;
            this.instanceId = builder.instanceId;
            this.kibanaConfiguration = builder.kibanaConfiguration;
            this.kibanaDomain = builder.kibanaDomain;
            this.kibanaPort = builder.kibanaPort;
            this.masterConfiguration = builder.masterConfiguration;
            this.networkConfig = builder.networkConfig;
            this.nodeAmount = builder.nodeAmount;
            this.nodeSpec = builder.nodeSpec;
            this.paymentType = builder.paymentType;
            this.publicDomain = builder.publicDomain;
            this.publicPort = builder.publicPort;
            this.status = builder.status;
            this.synonymsDicts = builder.synonymsDicts;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
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
        public java.util.List < DictList> getDictList() {
            return this.dictList;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return esVersion
         */
        public String getEsVersion() {
            return this.esVersion;
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
        public KibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        /**
         * @return kibanaDomain
         */
        public String getKibanaDomain() {
            return this.kibanaDomain;
        }

        /**
         * @return kibanaPort
         */
        public Integer getKibanaPort() {
            return this.kibanaPort;
        }

        /**
         * @return masterConfiguration
         */
        public MasterConfiguration getMasterConfiguration() {
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
        public Integer getNodeAmount() {
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
         * @return publicDomain
         */
        public String getPublicDomain() {
            return this.publicDomain;
        }

        /**
         * @return publicPort
         */
        public Integer getPublicPort() {
            return this.publicPort;
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
        public java.util.List < SynonymsDicts> getSynonymsDicts() {
            return this.synonymsDicts;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private String createdAt; 
            private String description; 
            private java.util.List < DictList> dictList; 
            private String domain; 
            private String esVersion; 
            private String instanceId; 
            private KibanaConfiguration kibanaConfiguration; 
            private String kibanaDomain; 
            private Integer kibanaPort; 
            private MasterConfiguration masterConfiguration; 
            private NetworkConfig networkConfig; 
            private Integer nodeAmount; 
            private NodeSpec nodeSpec; 
            private String paymentType; 
            private String publicDomain; 
            private Integer publicPort; 
            private String status; 
            private java.util.List < SynonymsDicts> synonymsDicts; 
            private String updatedAt; 

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-07-06T10:18:48.662Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-abc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The configuration of the IK dictionaries.</p>
             */
            public Builder dictList(java.util.List < DictList> dictList) {
                this.dictList = dictList;
                return this;
            }

            /**
             * <p>The intranet access address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-nif1q8auz0003****.elasticsearch.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6.7.0_with_X-Pack</p>
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-n6w1o1x0w001c****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The configuration of Kibana nodes.</p>
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * <p>The public network access address of Kibana.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-nif1q8auz0003****.kibana.elasticsearch.aliyuncs.com</p>
             */
            public Builder kibanaDomain(String kibanaDomain) {
                this.kibanaDomain = kibanaDomain;
                return this;
            }

            /**
             * <p>The public port of the Kibana network.</p>
             * 
             * <strong>example:</strong>
             * <p>5601</p>
             */
            public Builder kibanaPort(Integer kibanaPort) {
                this.kibanaPort = kibanaPort;
                return this;
            }

            /**
             * <p>The configuration of dedicated master nodes.</p>
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * <p>The network configuration.</p>
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * <p>The number of data nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The configuration of data nodes.</p>
             */
            public Builder nodeSpec(NodeSpec nodeSpec) {
                this.nodeSpec = nodeSpec;
                return this;
            }

            /**
             * <p>The billing method of the created ECS instance.</p>
             * <p>Valid values: prepaid and postpaid.</p>
             * 
             * <strong>example:</strong>
             * <p>postpaid</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * <p>The public network access address.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-n6w1o1x0w001c****.public.elasticsearch.aliyuncs.com</p>
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            /**
             * <p>The public network port.</p>
             * 
             * <strong>example:</strong>
             * <p>9200</p>
             */
            public Builder publicPort(Integer publicPort) {
                this.publicPort = publicPort;
                return this;
            }

            /**
             * <p>The state of the cluster.</p>
             * <p>Supported: active (normal), activating (initializing), inactive (blocked), and invalid (expired).</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The configuration of the synonym dictionaries.</p>
             */
            public Builder synonymsDicts(java.util.List < SynonymsDicts> synonymsDicts) {
                this.synonymsDicts = synonymsDicts;
                return this;
            }

            /**
             * <p>The time when the instance was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-07-18T10:10:04.484Z</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
