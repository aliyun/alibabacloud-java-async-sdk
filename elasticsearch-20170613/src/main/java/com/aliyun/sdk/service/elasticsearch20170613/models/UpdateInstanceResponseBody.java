// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateInstanceResponseBody</p>
 */
public class UpdateInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateInstanceResponseBody build() {
            return new UpdateInstanceResponseBody(this);
        } 

    } 

    public static class DictList extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
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
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * type.
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
    public static class KibanaConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
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
    public static class MasterConfiguration extends TeaModel {
        @NameInMap("amount")
        private Integer amount;

        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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
             * amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
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
    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * vsArea.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * vswitchId.
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
    public static class NodeSpec extends TeaModel {
        @NameInMap("disk")
        private Integer disk;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("spec")
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
             * disk.
             */
            public Builder disk(Integer disk) {
                this.disk = disk;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * spec.
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
    public static class SynonymsDicts extends TeaModel {
        @NameInMap("fileSize")
        private Long fileSize;

        @NameInMap("name")
        private String name;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("type")
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
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * type.
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
    public static class Result extends TeaModel {
        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("dictList")
        private java.util.List < DictList> dictList;

        @NameInMap("domain")
        private String domain;

        @NameInMap("esVersion")
        private String esVersion;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("kibanaConfiguration")
        private KibanaConfiguration kibanaConfiguration;

        @NameInMap("kibanaDomain")
        private String kibanaDomain;

        @NameInMap("kibanaPort")
        private Integer kibanaPort;

        @NameInMap("masterConfiguration")
        private MasterConfiguration masterConfiguration;

        @NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        private Integer nodeAmount;

        @NameInMap("nodeSpec")
        private NodeSpec nodeSpec;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("publicDomain")
        private String publicDomain;

        @NameInMap("publicPort")
        private Integer publicPort;

        @NameInMap("status")
        private String status;

        @NameInMap("synonymsDicts")
        private java.util.List < SynonymsDicts> synonymsDicts;

        @NameInMap("updatedAt")
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
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * dictList.
             */
            public Builder dictList(java.util.List < DictList> dictList) {
                this.dictList = dictList;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * esVersion.
             */
            public Builder esVersion(String esVersion) {
                this.esVersion = esVersion;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * kibanaConfiguration.
             */
            public Builder kibanaConfiguration(KibanaConfiguration kibanaConfiguration) {
                this.kibanaConfiguration = kibanaConfiguration;
                return this;
            }

            /**
             * kibanaDomain.
             */
            public Builder kibanaDomain(String kibanaDomain) {
                this.kibanaDomain = kibanaDomain;
                return this;
            }

            /**
             * kibanaPort.
             */
            public Builder kibanaPort(Integer kibanaPort) {
                this.kibanaPort = kibanaPort;
                return this;
            }

            /**
             * masterConfiguration.
             */
            public Builder masterConfiguration(MasterConfiguration masterConfiguration) {
                this.masterConfiguration = masterConfiguration;
                return this;
            }

            /**
             * networkConfig.
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            /**
             * nodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
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
             * paymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * publicDomain.
             */
            public Builder publicDomain(String publicDomain) {
                this.publicDomain = publicDomain;
                return this;
            }

            /**
             * publicPort.
             */
            public Builder publicPort(Integer publicPort) {
                this.publicPort = publicPort;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * synonymsDicts.
             */
            public Builder synonymsDicts(java.util.List < SynonymsDicts> synonymsDicts) {
                this.synonymsDicts = synonymsDicts;
                return this;
            }

            /**
             * updatedAt.
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
