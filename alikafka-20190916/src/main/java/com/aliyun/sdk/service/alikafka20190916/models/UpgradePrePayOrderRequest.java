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
 * {@link UpgradePrePayOrderRequest} extends {@link RequestModel}
 *
 * <p>UpgradePrePayOrderRequest</p>
 */
public class UpgradePrePayOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfluentConfig")
    private ConfluentConfig confluentConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMax")
    private Integer eipMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipModel")
    private Boolean eipModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicQuota")
    private Integer topicQuota;

    private UpgradePrePayOrderRequest(Builder builder) {
        super(builder);
        this.confluentConfig = builder.confluentConfig;
        this.diskSize = builder.diskSize;
        this.eipMax = builder.eipMax;
        this.eipModel = builder.eipModel;
        this.instanceId = builder.instanceId;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.paidType = builder.paidType;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.specType = builder.specType;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePrePayOrderRequest create() {
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
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return eipModel
     */
    public Boolean getEipModel() {
        return this.eipModel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return topicQuota
     */
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static final class Builder extends Request.Builder<UpgradePrePayOrderRequest, Builder> {
        private ConfluentConfig confluentConfig; 
        private Integer diskSize; 
        private Integer eipMax; 
        private Boolean eipModel; 
        private String instanceId; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private Integer paidType; 
        private Integer partitionNum; 
        private String regionId; 
        private String specType; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePrePayOrderRequest request) {
            super(request);
            this.confluentConfig = request.confluentConfig;
            this.diskSize = request.diskSize;
            this.eipMax = request.eipMax;
            this.eipModel = request.eipModel;
            this.instanceId = request.instanceId;
            this.ioMax = request.ioMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.paidType = request.paidType;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.specType = request.specType;
            this.topicQuota = request.topicQuota;
        } 

        /**
         * ConfluentConfig.
         */
        public Builder confluentConfig(ConfluentConfig confluentConfig) {
            String confluentConfigShrink = shrink(confluentConfig, "ConfluentConfig", "json");
            this.putQueryParameter("ConfluentConfig", confluentConfigShrink);
            this.confluentConfig = confluentConfig;
            return this;
        }

        /**
         * <p>The size of the disk.</p>
         * <ul>
         * <li>The disk size that you specify must be greater than or equal to the current disk size of the instance.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The Internet traffic for the instance.</p>
         * <ul>
         * <li>The Internet traffic volume that you specify must be greater than or equal to the current Internet traffic volume of the instance.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.<blockquote>
         * <ul>
         * <li>If the <strong>EipModel</strong> parameter is set to <strong>true</strong>, set the <strong>EipMax</strong> parameter to a value that is greater than 0.</li>
         * <li>If the <strong>EipModel</strong> parameter is set to <strong>false</strong>, set the <strong>EipMax</strong> parameter to <strong>0</strong>.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable Internet access for the instance. Valid values:</p>
         * <ul>
         * <li>true: enables Internet access.</li>
         * <li>false: disables Internet access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder eipModel(Boolean eipModel) {
            this.putQueryParameter("EipModel", eipModel);
            this.eipModel = eipModel;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum traffic for the instance. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>The maximum traffic volume that you specify must be greater than or equal to the current maximum traffic volume of the instance.</li>
         * <li>You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</li>
         * <li>You must configure at least one of the IoMax and IoMaxSpec parameters. If you configure both parameters, the value of the IoMaxSpec parameter takes effect. We recommend that you configure only the IoMaxSpec parameter.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
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
         * PaidType.
         */
        public Builder paidType(Integer paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * <p>The number of partitions. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</li>
         * <li>If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
         * </ul>
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
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong>: Standard Edition (High Write)</li>
         * <li><strong>professional</strong>: Professional Edition (High Write)</li>
         * <li><strong>professionalForHighRead</strong>: Professional Edition (High Read)</li>
         * </ul>
         * <p>You cannot downgrade an instance from the Professional Edition to the Standard Edition. For more information about these instance editions, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
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
         * <p>The number of topics. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.</li>
         * <li>If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.</li>
         * <li>The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.</li>
         * <li>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
         * </ul>
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
        public UpgradePrePayOrderRequest build() {
            return new UpgradePrePayOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradePrePayOrderRequest} extends {@link TeaModel}
     *
     * <p>UpgradePrePayOrderRequest</p>
     */
    public static class ConfluentConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer connectCU;

        @com.aliyun.core.annotation.NameInMap("ConnectReplica")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer connectReplica;

        @com.aliyun.core.annotation.NameInMap("ControlCenterCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 4)
        private Integer controlCenterCU;

        @com.aliyun.core.annotation.NameInMap("ControlCenterReplica")
        @com.aliyun.core.annotation.Validation(maximum = 1, minimum = 1)
        private Integer controlCenterReplica;

        @com.aliyun.core.annotation.NameInMap("ControlCenterStorage")
        @com.aliyun.core.annotation.Validation(maximum = 30000, minimum = 300)
        private Integer controlCenterStorage;

        @com.aliyun.core.annotation.NameInMap("KafkaCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 4)
        private Integer kafkaCU;

        @com.aliyun.core.annotation.NameInMap("KafkaReplica")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 3)
        private Integer kafkaReplica;

        @com.aliyun.core.annotation.NameInMap("KafkaRestProxyCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 4)
        private Integer kafkaRestProxyCU;

        @com.aliyun.core.annotation.NameInMap("KafkaRestProxyReplica")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 2)
        private Integer kafkaRestProxyReplica;

        @com.aliyun.core.annotation.NameInMap("KafkaStorage")
        @com.aliyun.core.annotation.Validation(maximum = 30000, minimum = 800)
        private Integer kafkaStorage;

        @com.aliyun.core.annotation.NameInMap("KsqlCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer ksqlCU;

        @com.aliyun.core.annotation.NameInMap("KsqlReplica")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer ksqlReplica;

        @com.aliyun.core.annotation.NameInMap("KsqlStorage")
        @com.aliyun.core.annotation.Validation(maximum = 30000, minimum = 100)
        private Integer ksqlStorage;

        @com.aliyun.core.annotation.NameInMap("SchemaRegistryCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer schemaRegistryCU;

        @com.aliyun.core.annotation.NameInMap("SchemaRegistryReplica")
        @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 2)
        private Integer schemaRegistryReplica;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 2)
        private Integer zooKeeperCU;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperReplica")
        @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 3)
        private Integer zooKeeperReplica;

        @com.aliyun.core.annotation.NameInMap("ZooKeeperStorage")
        @com.aliyun.core.annotation.Validation(maximum = 30000, minimum = 100)
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

            private Builder() {
            } 

            private Builder(ConfluentConfig model) {
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
                this.ksqlCU = model.ksqlCU;
                this.ksqlReplica = model.ksqlReplica;
                this.ksqlStorage = model.ksqlStorage;
                this.schemaRegistryCU = model.schemaRegistryCU;
                this.schemaRegistryReplica = model.schemaRegistryReplica;
                this.zooKeeperCU = model.zooKeeperCU;
                this.zooKeeperReplica = model.zooKeeperReplica;
                this.zooKeeperStorage = model.zooKeeperStorage;
            } 

            /**
             * ConnectCU.
             */
            public Builder connectCU(Integer connectCU) {
                this.connectCU = connectCU;
                return this;
            }

            /**
             * ConnectReplica.
             */
            public Builder connectReplica(Integer connectReplica) {
                this.connectReplica = connectReplica;
                return this;
            }

            /**
             * ControlCenterCU.
             */
            public Builder controlCenterCU(Integer controlCenterCU) {
                this.controlCenterCU = controlCenterCU;
                return this;
            }

            /**
             * ControlCenterReplica.
             */
            public Builder controlCenterReplica(Integer controlCenterReplica) {
                this.controlCenterReplica = controlCenterReplica;
                return this;
            }

            /**
             * ControlCenterStorage.
             */
            public Builder controlCenterStorage(Integer controlCenterStorage) {
                this.controlCenterStorage = controlCenterStorage;
                return this;
            }

            /**
             * KafkaCU.
             */
            public Builder kafkaCU(Integer kafkaCU) {
                this.kafkaCU = kafkaCU;
                return this;
            }

            /**
             * KafkaReplica.
             */
            public Builder kafkaReplica(Integer kafkaReplica) {
                this.kafkaReplica = kafkaReplica;
                return this;
            }

            /**
             * KafkaRestProxyCU.
             */
            public Builder kafkaRestProxyCU(Integer kafkaRestProxyCU) {
                this.kafkaRestProxyCU = kafkaRestProxyCU;
                return this;
            }

            /**
             * KafkaRestProxyReplica.
             */
            public Builder kafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
                this.kafkaRestProxyReplica = kafkaRestProxyReplica;
                return this;
            }

            /**
             * KafkaStorage.
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * KsqlCU.
             */
            public Builder ksqlCU(Integer ksqlCU) {
                this.ksqlCU = ksqlCU;
                return this;
            }

            /**
             * KsqlReplica.
             */
            public Builder ksqlReplica(Integer ksqlReplica) {
                this.ksqlReplica = ksqlReplica;
                return this;
            }

            /**
             * KsqlStorage.
             */
            public Builder ksqlStorage(Integer ksqlStorage) {
                this.ksqlStorage = ksqlStorage;
                return this;
            }

            /**
             * SchemaRegistryCU.
             */
            public Builder schemaRegistryCU(Integer schemaRegistryCU) {
                this.schemaRegistryCU = schemaRegistryCU;
                return this;
            }

            /**
             * SchemaRegistryReplica.
             */
            public Builder schemaRegistryReplica(Integer schemaRegistryReplica) {
                this.schemaRegistryReplica = schemaRegistryReplica;
                return this;
            }

            /**
             * ZooKeeperCU.
             */
            public Builder zooKeeperCU(Integer zooKeeperCU) {
                this.zooKeeperCU = zooKeeperCU;
                return this;
            }

            /**
             * ZooKeeperReplica.
             */
            public Builder zooKeeperReplica(Integer zooKeeperReplica) {
                this.zooKeeperReplica = zooKeeperReplica;
                return this;
            }

            /**
             * ZooKeeperStorage.
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
}
