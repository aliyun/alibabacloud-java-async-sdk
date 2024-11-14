// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePrePayOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePrePayOrderRequest</p>
 */
public class CreatePrePayOrderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("IoMax")
    private Integer ioMax;

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
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicQuota")
    private Integer topicQuota;

    private CreatePrePayOrderRequest(Builder builder) {
        super(builder);
        this.confluentConfig = builder.confluentConfig;
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.duration = builder.duration;
        this.eipMax = builder.eipMax;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.paidType = builder.paidType;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.specType = builder.specType;
        this.tag = builder.tag;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrePayOrderRequest create() {
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
     * @return ioMax
     */
    public Integer getIoMax() {
        return this.ioMax;
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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return topicQuota
     */
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static final class Builder extends Request.Builder<CreatePrePayOrderRequest, Builder> {
        private ConfluentConfig confluentConfig; 
        private Integer deployType; 
        private Integer diskSize; 
        private String diskType; 
        private Integer duration; 
        private Integer eipMax; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private Integer paidType; 
        private Integer partitionNum; 
        private String regionId; 
        private String resourceGroupId; 
        private String specType; 
        private java.util.List < Tag> tag; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrePayOrderRequest request) {
            super(request);
            this.confluentConfig = request.confluentConfig;
            this.deployType = request.deployType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.duration = request.duration;
            this.eipMax = request.eipMax;
            this.ioMax = request.ioMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.paidType = request.paidType;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.specType = request.specType;
            this.tag = request.tag;
            this.topicQuota = request.topicQuota;
        } 

        /**
         * <p>The configurations of Confluent.</p>
         * <blockquote>
         * <p> When you create an ApsaraMQ for Confluent instance, you must configure this parameter.</p>
         * </blockquote>
         */
        public Builder confluentConfig(ConfluentConfig confluentConfig) {
            String confluentConfigShrink = shrink(confluentConfig, "ConfluentConfig", "json");
            this.putQueryParameter("ConfluentConfig", confluentConfigShrink);
            this.confluentConfig = confluentConfig;
            return this;
        }

        /**
         * <p>The type of the network in which the instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: Internet and virtual private cloud (VPC)</li>
         * <li><strong>5</strong>: VPC</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, set the value to 5. After the instance is created, you can specify whether to enable each component.</p>
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
         * <p>The disk size. Unit: GB</p>
         * <p>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
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
         * <li><strong>0</strong>: ultra disk</li>
         * <li><strong>1</strong>: standard SSD</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: months. Default value: 1. Valid values:</p>
         * <ul>
         * <li><strong>1 to 12</strong></li>
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
         * <p>The maximum Internet traffic in the instance.</p>
         * <ul>
         * <li>If you set <strong>DeployType</strong> to <strong>4</strong>, you must configure this parameter.</li>
         * <li>For information about the valid values, see <a href="https://help.aliyun.com/document_detail/72142.html">Pay-as-you-go</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * <p>The maximum traffic in the instance. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must set one of <strong>IoMax</strong> and <strong>IoMaxSpec</strong>. If both parameters are configured, the value of <strong>IoMaxSpec</strong> is used. We recommend that you configure only <strong>IoMaxSpec</strong>.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must configure one of <strong>IoMax</strong> and <strong>IoMaxSpec</strong>. If both parameters are configured, the value of <strong>IoMaxSpec</strong> is used. We recommend that you configure only <strong>IoMaxSpec</strong>.</li>
         * <li>For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
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
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the subscription billing method</li>
         * <li><strong>4</strong>: the subscription billing method for ApsaraMQ for Confluent instances</li>
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
         * <p>The number of partitions. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
         * <p>The ID of the resource group.</p>
         * <p>If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.</p>
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
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Standard Edition (High Write)</li>
         * <li><strong>professional</strong>: Professional Edition (High Write)</li>
         * <li><strong>professionalForHighRead</strong>: Professional Edition (High Read)</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of topics. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you use exceeds the default value, you are charged additional fees.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create an ApsaraMQ for Confluent instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder topicQuota(Integer topicQuota) {
            this.putQueryParameter("TopicQuota", topicQuota);
            this.topicQuota = topicQuota;
            return this;
        }

        @Override
        public CreatePrePayOrderRequest build() {
            return new CreatePrePayOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrePayOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePrePayOrderRequest</p>
     */
    public static class ConfluentConfig extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("KsqlCU")
        private Integer ksqlCU;

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
            this.ksqlCU = builder.ksqlCU;
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
         * @return ksqlCU
         */
        public Integer getKsqlCU() {
            return this.ksqlCU;
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
            private Integer ksqlCU; 
            private Integer ksqlReplica; 
            private Integer ksqlStorage; 
            private Integer schemaRegistryCU; 
            private Integer schemaRegistryReplica; 
            private Integer zooKeeperCU; 
            private Integer zooKeeperReplica; 
            private Integer zooKeeperStorage; 

            /**
             * <p>The number of CPU cores of Connect.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder connectCU(Integer connectCU) {
                this.connectCU = connectCU;
                return this;
            }

            /**
             * <p>The number of replicas of Connect.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connectReplica(Integer connectReplica) {
                this.connectReplica = connectReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores of Control Center.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder controlCenterCU(Integer controlCenterCU) {
                this.controlCenterCU = controlCenterCU;
                return this;
            }

            /**
             * <p>The number of replicas of Control Center.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder controlCenterReplica(Integer controlCenterReplica) {
                this.controlCenterReplica = controlCenterReplica;
                return this;
            }

            /**
             * <p>The disk capacity of Control Center. Unit: GB</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder controlCenterStorage(Integer controlCenterStorage) {
                this.controlCenterStorage = controlCenterStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores of the Kafka broker.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaCU(Integer kafkaCU) {
                this.kafkaCU = kafkaCU;
                return this;
            }

            /**
             * <p>The number of replicas of the Kafka broker.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder kafkaReplica(Integer kafkaReplica) {
                this.kafkaReplica = kafkaReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores of Kafka Rest Proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaRestProxyCU(Integer kafkaRestProxyCU) {
                this.kafkaRestProxyCU = kafkaRestProxyCU;
                return this;
            }

            /**
             * <p>The number of replicas of Kafka Rest Proxy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder kafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
                this.kafkaRestProxyReplica = kafkaRestProxyReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the Kafka broker. Unit: GB</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores of ksqIDB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ksqlCU(Integer ksqlCU) {
                this.ksqlCU = ksqlCU;
                return this;
            }

            /**
             * <p>The number of replicas of ksqlDB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ksqlReplica(Integer ksqlReplica) {
                this.ksqlReplica = ksqlReplica;
                return this;
            }

            /**
             * <p>The disk capacity of ksqlDB. Unit: GB</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ksqlStorage(Integer ksqlStorage) {
                this.ksqlStorage = ksqlStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores of Schema Registry.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaRegistryCU(Integer schemaRegistryCU) {
                this.schemaRegistryCU = schemaRegistryCU;
                return this;
            }

            /**
             * <p>The number of replicas of Schema Registry.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder schemaRegistryReplica(Integer schemaRegistryReplica) {
                this.schemaRegistryReplica = schemaRegistryReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores of ZooKeeper.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder zooKeeperCU(Integer zooKeeperCU) {
                this.zooKeeperCU = zooKeeperCU;
                return this;
            }

            /**
             * <p>The number of replicas of ZooKeeper.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder zooKeeperReplica(Integer zooKeeperReplica) {
                this.zooKeeperReplica = zooKeeperReplica;
                return this;
            }

            /**
             * <p>The disk capacity of ZooKeeper. Unit: GB</p>
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
     * {@link CreatePrePayOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePrePayOrderRequest</p>
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

            /**
             * <p>The key of tag N.</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>If this parameter is left empty, the keys of all tags are matched.</li>
             * <li>The tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
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
             * <p>The value of tag N.</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>This parameter can be left empty.</li>
             * <li>The tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
