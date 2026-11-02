// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link CreatePrePayInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePrePayInstanceRequest</p>
 */
public class CreatePrePayInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfluentConfig")
    private ConfluentConfig confluentConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    private Integer deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Integer duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMax")
    private Integer eipMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMaxSpec")
    private String ioMaxSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidType")
    private Integer paidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Integer partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreatePrePayInstanceRequest(Builder builder) {
        super(builder);
        this.confluentConfig = builder.confluentConfig;
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.duration = builder.duration;
        this.eipMax = builder.eipMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.paidType = builder.paidType;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.specType = builder.specType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrePayInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return confluentConfig
     */
    public ConfluentConfig getConfluentConfig() {
        return this.confluentConfig;
    }

    /**
     * @return deployType
     */
    public Integer getDeployType() {
        return this.deployType;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return ioMaxSpec
     */
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    /**
     * @return paidType
     */
    public Integer getPaidType() {
        return this.paidType;
    }

    /**
     * @return partitionNum
     */
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreatePrePayInstanceRequest, Builder> {
        private ConfluentConfig confluentConfig; 
        private Integer deployType; 
        private Integer diskSize; 
        private String diskType; 
        private Integer duration; 
        private Integer eipMax; 
        private String ioMaxSpec; 
        private Integer paidType; 
        private Integer partitionNum; 
        private String regionId; 
        private String resourceGroupId; 
        private String specType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrePayInstanceRequest request) {
            super(request);
            this.confluentConfig = request.confluentConfig;
            this.deployType = request.deployType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.duration = request.duration;
            this.eipMax = request.eipMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.paidType = request.paidType;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.specType = request.specType;
            this.tag = request.tag;
        } 

        /**
         * <p>The configurations of Confluent components.</p>
         * <blockquote>
         * <p>This parameter is required when you create a Confluent instance.</p>
         * </blockquote>
         */
        public Builder confluentConfig(ConfluentConfig confluentConfig) {
            String confluentConfigShrink = shrink(confluentConfig, "ConfluentConfig", "json");
            this.putQueryParameter("ConfluentConfig", confluentConfigShrink);
            this.confluentConfig = confluentConfig;
            return this;
        }

        /**
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: Internet- and VPC-connected instance</p>
         * </li>
         * <li><p><strong>5</strong>: VPC-connected instance</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a Confluent instance, you cannot select the deployment type. You can only set this parameter to 5. After the purchase, you can configure whether to expose each component to the Internet.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder deployType(Integer deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>The disk capacity. Unit: GB.</p>
         * <p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Ultra disk</p>
         * </li>
         * <li><p><strong>1</strong>: SSD</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: months. Default value: 1. Valid values:</p>
         * <ul>
         * <li><strong>Confluent instances: 1 or 12</strong></li>
         * <li><strong>ApsaraMQ for Kafka instances: 1</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The Internet traffic bandwidth.</p>
         * <ul>
         * <li><p>If <strong>DeployType</strong> is set to <strong>4</strong>, this parameter is required.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/72142.html">pay-as-you-go billing method</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * <p>The traffic specification.</p>
         * <ul>
         * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.<blockquote>
         * <p>If you create a Confluent instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alikafka.hw.2xlarge</p>
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Subscription</p>
         * </li>
         * <li><p><strong>4</strong>: Subscription for Confluent instances</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder paidType(Integer paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * <p>The number of partitions to purchase.</p>
         * <ul>
         * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.<blockquote>
         * <p>If the instance is a Confluent instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Management console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ac***********7q</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The edition.</p>
         * <p>Valid values for ApsaraMQ for Kafka instances:</p>
         * <ul>
         * <li><p><strong>normal</strong>: Standard Edition (High Write)</p>
         * </li>
         * <li><p><strong>professional</strong>: Professional Edition (High Write)</p>
         * </li>
         * <li><p><strong>professionalForHighRead</strong>: Professional Edition (High Read)</p>
         * </li>
         * </ul>
         * <p>Valid values for Confluent instances:</p>
         * <ul>
         * <li><p><strong>professional</strong>: Professional Edition</p>
         * </li>
         * <li><p><strong>enterprise</strong>: Enterprise Edition</p>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreatePrePayInstanceRequest build() {
            return new CreatePrePayInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrePayInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePrePayInstanceRequest</p>
     */
    public static class KsqlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternalId")
        private String internalId;

        @com.aliyun.core.annotation.NameInMap("cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private KsqlList(Builder builder) {
            this.internalId = builder.internalId;
            this.cu = builder.cu;
            this.replica = builder.replica;
            this.storage = builder.storage;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KsqlList create() {
            return builder().build();
        }

        /**
         * @return internalId
         */
        public String getInternalId() {
            return this.internalId;
        }

        /**
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return storage
         */
        public Integer getStorage() {
            return this.storage;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String internalId; 
            private Integer cu; 
            private Integer replica; 
            private Integer storage; 
            private String type; 

            private Builder() {
            } 

            private Builder(KsqlList model) {
                this.internalId = model.internalId;
                this.cu = model.cu;
                this.replica = model.replica;
                this.storage = model.storage;
                this.type = model.type;
            } 

            /**
             * <p>The identifier of the additional ksqlDB instance. It is used to distinguish multiple ksqlDB instances under the same Confluent instance and generate the corresponding service name. Each instance must use a different non-empty identifier, and the original identifier must be retained for subsequent specification changes. Example: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder internalId(String internalId) {
                this.internalId = internalId;
                return this;
            }

            /**
             * <p>The number of CPU cores per node in the ksqlDB instance. Valid values: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of nodes in the ksqlDB instance. Valid values: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The disk capacity per node in the ksqlDB instance. Unit: GB. Valid values: 100 to 30000. The value must be a multiple of 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * <p>The component type. Set the value to KSQLDB. Example: KSQLDB.</p>
             * 
             * <strong>example:</strong>
             * <p>KSQLDB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public KsqlList build() {
                return new KsqlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePrePayInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePrePayInstanceRequest</p>
     */
    public static class ConfluentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfluentVersion")
        private String confluentVersion;

        @com.aliyun.core.annotation.NameInMap("ConnectCU")
        private Integer connectCU;

        @com.aliyun.core.annotation.NameInMap("ConnectReplica")
        private Integer connectReplica;

        @com.aliyun.core.annotation.NameInMap("ControlCenterCU")
        private Integer controlCenterCU;

        @com.aliyun.core.annotation.NameInMap("ControlCenterReplica")
        private Integer controlCenterReplica;

        @com.aliyun.core.annotation.NameInMap("ControlCenterStorage")
        private Integer controlCenterStorage;

        @com.aliyun.core.annotation.NameInMap("KafkaCU")
        private Integer kafkaCU;

        @com.aliyun.core.annotation.NameInMap("KafkaReplica")
        private Integer kafkaReplica;

        @com.aliyun.core.annotation.NameInMap("KafkaRestProxyCU")
        private Integer kafkaRestProxyCU;

        @com.aliyun.core.annotation.NameInMap("KafkaRestProxyReplica")
        private Integer kafkaRestProxyReplica;

        @com.aliyun.core.annotation.NameInMap("KafkaStorage")
        private Integer kafkaStorage;

        @com.aliyun.core.annotation.NameInMap("KraftControllerCU")
        private Integer kraftControllerCU;

        @com.aliyun.core.annotation.NameInMap("KraftControllerReplica")
        private Integer kraftControllerReplica;

        @com.aliyun.core.annotation.NameInMap("KraftControllerStorage")
        private Integer kraftControllerStorage;

        @com.aliyun.core.annotation.NameInMap("KsqlCU")
        private Integer ksqlCU;

        @com.aliyun.core.annotation.NameInMap("KsqlList")
        private java.util.List<KsqlList> ksqlList;

        @com.aliyun.core.annotation.NameInMap("KsqlReplica")
        private Integer ksqlReplica;

        @com.aliyun.core.annotation.NameInMap("KsqlStorage")
        private Integer ksqlStorage;

        @com.aliyun.core.annotation.NameInMap("SchemaRegistryCU")
        private Integer schemaRegistryCU;

        @com.aliyun.core.annotation.NameInMap("SchemaRegistryReplica")
        private Integer schemaRegistryReplica;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperCU")
        private Integer zooKeeperCU;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperReplica")
        private Integer zooKeeperReplica;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperStorage")
        private Integer zooKeeperStorage;

        private ConfluentConfig(Builder builder) {
            this.confluentVersion = builder.confluentVersion;
            this.connectCU = builder.connectCU;
            this.connectReplica = builder.connectReplica;
            this.controlCenterCU = builder.controlCenterCU;
            this.controlCenterReplica = builder.controlCenterReplica;
            this.controlCenterStorage = builder.controlCenterStorage;
            this.kafkaCU = builder.kafkaCU;
            this.kafkaReplica = builder.kafkaReplica;
            this.kafkaRestProxyCU = builder.kafkaRestProxyCU;
            this.kafkaRestProxyReplica = builder.kafkaRestProxyReplica;
            this.kafkaStorage = builder.kafkaStorage;
            this.kraftControllerCU = builder.kraftControllerCU;
            this.kraftControllerReplica = builder.kraftControllerReplica;
            this.kraftControllerStorage = builder.kraftControllerStorage;
            this.ksqlCU = builder.ksqlCU;
            this.ksqlList = builder.ksqlList;
            this.ksqlReplica = builder.ksqlReplica;
            this.ksqlStorage = builder.ksqlStorage;
            this.schemaRegistryCU = builder.schemaRegistryCU;
            this.schemaRegistryReplica = builder.schemaRegistryReplica;
            this.zooKeeperCU = builder.zooKeeperCU;
            this.zooKeeperReplica = builder.zooKeeperReplica;
            this.zooKeeperStorage = builder.zooKeeperStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfluentConfig create() {
            return builder().build();
        }

        /**
         * @return confluentVersion
         */
        public String getConfluentVersion() {
            return this.confluentVersion;
        }

        /**
         * @return connectCU
         */
        public Integer getConnectCU() {
            return this.connectCU;
        }

        /**
         * @return connectReplica
         */
        public Integer getConnectReplica() {
            return this.connectReplica;
        }

        /**
         * @return controlCenterCU
         */
        public Integer getControlCenterCU() {
            return this.controlCenterCU;
        }

        /**
         * @return controlCenterReplica
         */
        public Integer getControlCenterReplica() {
            return this.controlCenterReplica;
        }

        /**
         * @return controlCenterStorage
         */
        public Integer getControlCenterStorage() {
            return this.controlCenterStorage;
        }

        /**
         * @return kafkaCU
         */
        public Integer getKafkaCU() {
            return this.kafkaCU;
        }

        /**
         * @return kafkaReplica
         */
        public Integer getKafkaReplica() {
            return this.kafkaReplica;
        }

        /**
         * @return kafkaRestProxyCU
         */
        public Integer getKafkaRestProxyCU() {
            return this.kafkaRestProxyCU;
        }

        /**
         * @return kafkaRestProxyReplica
         */
        public Integer getKafkaRestProxyReplica() {
            return this.kafkaRestProxyReplica;
        }

        /**
         * @return kafkaStorage
         */
        public Integer getKafkaStorage() {
            return this.kafkaStorage;
        }

        /**
         * @return kraftControllerCU
         */
        public Integer getKraftControllerCU() {
            return this.kraftControllerCU;
        }

        /**
         * @return kraftControllerReplica
         */
        public Integer getKraftControllerReplica() {
            return this.kraftControllerReplica;
        }

        /**
         * @return kraftControllerStorage
         */
        public Integer getKraftControllerStorage() {
            return this.kraftControllerStorage;
        }

        /**
         * @return ksqlCU
         */
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        /**
         * @return ksqlList
         */
        public java.util.List<KsqlList> getKsqlList() {
            return this.ksqlList;
        }

        /**
         * @return ksqlReplica
         */
        public Integer getKsqlReplica() {
            return this.ksqlReplica;
        }

        /**
         * @return ksqlStorage
         */
        public Integer getKsqlStorage() {
            return this.ksqlStorage;
        }

        /**
         * @return schemaRegistryCU
         */
        public Integer getSchemaRegistryCU() {
            return this.schemaRegistryCU;
        }

        /**
         * @return schemaRegistryReplica
         */
        public Integer getSchemaRegistryReplica() {
            return this.schemaRegistryReplica;
        }

        /**
         * @return zooKeeperCU
         */
        public Integer getZooKeeperCU() {
            return this.zooKeeperCU;
        }

        /**
         * @return zooKeeperReplica
         */
        public Integer getZooKeeperReplica() {
            return this.zooKeeperReplica;
        }

        /**
         * @return zooKeeperStorage
         */
        public Integer getZooKeeperStorage() {
            return this.zooKeeperStorage;
        }

        public static final class Builder {
            private String confluentVersion; 
            private Integer connectCU; 
            private Integer connectReplica; 
            private Integer controlCenterCU; 
            private Integer controlCenterReplica; 
            private Integer controlCenterStorage; 
            private Integer kafkaCU; 
            private Integer kafkaReplica; 
            private Integer kafkaRestProxyCU; 
            private Integer kafkaRestProxyReplica; 
            private Integer kafkaStorage; 
            private Integer kraftControllerCU; 
            private Integer kraftControllerReplica; 
            private Integer kraftControllerStorage; 
            private Integer ksqlCU; 
            private java.util.List<KsqlList> ksqlList; 
            private Integer ksqlReplica; 
            private Integer ksqlStorage; 
            private Integer schemaRegistryCU; 
            private Integer schemaRegistryReplica; 
            private Integer zooKeeperCU; 
            private Integer zooKeeperReplica; 
            private Integer zooKeeperStorage; 

            private Builder() {
            } 

            private Builder(ConfluentConfig model) {
                this.confluentVersion = model.confluentVersion;
                this.connectCU = model.connectCU;
                this.connectReplica = model.connectReplica;
                this.controlCenterCU = model.controlCenterCU;
                this.controlCenterReplica = model.controlCenterReplica;
                this.controlCenterStorage = model.controlCenterStorage;
                this.kafkaCU = model.kafkaCU;
                this.kafkaReplica = model.kafkaReplica;
                this.kafkaRestProxyCU = model.kafkaRestProxyCU;
                this.kafkaRestProxyReplica = model.kafkaRestProxyReplica;
                this.kafkaStorage = model.kafkaStorage;
                this.kraftControllerCU = model.kraftControllerCU;
                this.kraftControllerReplica = model.kraftControllerReplica;
                this.kraftControllerStorage = model.kraftControllerStorage;
                this.ksqlCU = model.ksqlCU;
                this.ksqlList = model.ksqlList;
                this.ksqlReplica = model.ksqlReplica;
                this.ksqlStorage = model.ksqlStorage;
                this.schemaRegistryCU = model.schemaRegistryCU;
                this.schemaRegistryReplica = model.schemaRegistryReplica;
                this.zooKeeperCU = model.zooKeeperCU;
                this.zooKeeperReplica = model.zooKeeperReplica;
                this.zooKeeperStorage = model.zooKeeperStorage;
            } 

            /**
             * <p>The platform version of the Confluent instance. Valid values: 7.8.2 and 8.2.1. If you select 7.8.2, you must configure ZooKeeper. If you select 8.2.1, you must configure KRaft Controller. You can configure only one of the two metadata components in a single request.</p>
             * 
             * <strong>example:</strong>
             * <p>7.8.2</p>
             */
            public Builder confluentVersion(String confluentVersion) {
                this.confluentVersion = confluentVersion;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Connect component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder connectCU(Integer connectCU) {
                this.connectCU = connectCU;
                return this;
            }

            /**
             * <p>The number of replicas for the Connect component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connectReplica(Integer connectReplica) {
                this.connectReplica = connectReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Control Center component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder controlCenterCU(Integer controlCenterCU) {
                this.controlCenterCU = controlCenterCU;
                return this;
            }

            /**
             * <p>The number of replicas for the Control Center component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder controlCenterReplica(Integer controlCenterReplica) {
                this.controlCenterReplica = controlCenterReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the Control Center component. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder controlCenterStorage(Integer controlCenterStorage) {
                this.controlCenterStorage = controlCenterStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for Kafka brokers.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaCU(Integer kafkaCU) {
                this.kafkaCU = kafkaCU;
                return this;
            }

            /**
             * <p>The number of replicas for Kafka brokers.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder kafkaReplica(Integer kafkaReplica) {
                this.kafkaReplica = kafkaReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Kafka REST Proxy component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaRestProxyCU(Integer kafkaRestProxyCU) {
                this.kafkaRestProxyCU = kafkaRestProxyCU;
                return this;
            }

            /**
             * <p>The number of replicas for the Kafka REST Proxy component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder kafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
                this.kafkaRestProxyReplica = kafkaRestProxyReplica;
                return this;
            }

            /**
             * <p>The disk capacity of Kafka brokers. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores per node in the KRaft controller. Valid values: 2 to 20. When you create an instance in KRaft mode, you must configure this parameter together with KraftControllerStorage.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder kraftControllerCU(Integer kraftControllerCU) {
                this.kraftControllerCU = kraftControllerCU;
                return this;
            }

            /**
             * <p>The number of nodes in the KRaft controller. The value is fixed to 3. If you configure the KRaft controller but do not specify this parameter, the default value 3 is used.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder kraftControllerReplica(Integer kraftControllerReplica) {
                this.kraftControllerReplica = kraftControllerReplica;
                return this;
            }

            /**
             * <p>The disk capacity per node in the KRaft controller. Unit: GB. Valid values: 100 to 30000. The value must be a multiple of 100. When you create an instance in KRaft mode, you must configure this parameter together with KraftControllerCU.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder kraftControllerStorage(Integer kraftControllerStorage) {
                this.kraftControllerStorage = kraftControllerStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for the ksqlDB component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ksqlCU(Integer ksqlCU) {
                this.ksqlCU = ksqlCU;
                return this;
            }

            /**
             * <p>The list of additional ksqlDB instance configurations, excluding the default ksqlDB instance. Each element configures an independent ksqlDB instance. When you use this parameter, you must also configure KsqlCU, KsqlStorage, and KsqlReplica for the default instance. Each instance in the list is configured with node resources and the number of nodes separately.</p>
             * <p>Example (list content):
             * ```json</p>
             */
            public Builder ksqlList(java.util.List<KsqlList> ksqlList) {
                this.ksqlList = ksqlList;
                return this;
            }

            /**
             * <p>The number of replicas for the ksqlDB component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ksqlReplica(Integer ksqlReplica) {
                this.ksqlReplica = ksqlReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the ksqlDB component. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ksqlStorage(Integer ksqlStorage) {
                this.ksqlStorage = ksqlStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Schema Registry component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaRegistryCU(Integer schemaRegistryCU) {
                this.schemaRegistryCU = schemaRegistryCU;
                return this;
            }

            /**
             * <p>The number of replicas for the Schema Registry component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder schemaRegistryReplica(Integer schemaRegistryReplica) {
                this.schemaRegistryReplica = schemaRegistryReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores for the ZooKeeper component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder zooKeeperCU(Integer zooKeeperCU) {
                this.zooKeeperCU = zooKeeperCU;
                return this;
            }

            /**
             * <p>The number of replicas for the ZooKeeper component.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder zooKeeperReplica(Integer zooKeeperReplica) {
                this.zooKeeperReplica = zooKeeperReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the ZooKeeper component. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder zooKeeperStorage(Integer zooKeeperStorage) {
                this.zooKeeperStorage = zooKeeperStorage;
                return this;
            }

            public ConfluentConfig build() {
                return new ConfluentConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePrePayInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePrePayInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The tag key of the resource.</p>
             * <ul>
             * <li><p>N ranges from 1 to 20.</p>
             * </li>
             * <li><p>If this parameter is left empty, all tag keys are matched.</p>
             * </li>
             * <li><p>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
             * <ul>
             * <li><p>N ranges from 1 to 20.</p>
             * </li>
             * <li><p>The tag value can be empty.</p>
             * </li>
             * <li><p>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
