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
         * ConfluentConfig.
         */
        public Builder confluentConfig(ConfluentConfig confluentConfig) {
            String confluentConfigShrink = shrink(confluentConfig, "ConfluentConfig", "json");
            this.putQueryParameter("ConfluentConfig", confluentConfigShrink);
            this.confluentConfig = confluentConfig;
            return this;
        }

        /**
         * DeployType.
         */
        public Builder deployType(Integer deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * DiskType.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * EipMax.
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * IoMaxSpec.
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
         * PartitionNum.
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SpecType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * Tag.
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

            /**
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
             * Value.
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
