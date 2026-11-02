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
         * <p>The Confluent component configurations.</p>
         */
        public Builder confluentConfig(ConfluentConfig confluentConfig) {
            String confluentConfigShrink = shrink(confluentConfig, "ConfluentConfig", "json");
            this.putQueryParameter("ConfluentConfig", confluentConfigShrink);
            this.confluentConfig = confluentConfig;
            return this;
        }

        /**
         * <p>The disk capacity.</p>
         * <ul>
         * <li><p>The disk capacity that you specify must be greater than or equal to the current disk capacity of the instance.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
         * </blockquote>
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
         * <p>The public network traffic.</p>
         * <ul>
         * <li><p>The public network traffic that you specify must be greater than or equal to the current public network traffic of the instance.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If <strong>EipModel</strong> is set to <strong>true</strong>, the value of <strong>EipMax</strong> must be greater than 0.</li>
         * <li>If <strong>EipModel</strong> is set to <strong>false</strong>, the value of <strong>EipMax</strong> must be <strong>0</strong>.</li>
         * </ul>
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
         * <p>Specifies whether public network access is required. Valid values:</p>
         * <ul>
         * <li><p>true: Public network access is required.</p>
         * </li>
         * <li><p>false: Public network access is not required.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
         * </blockquote>
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
         * <p>The instance ID.</p>
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
         * <p>The peak traffic (not recommended).</p>
         * <ul>
         * <li><p>The peak traffic that you specify must be greater than or equal to the current peak traffic of the instance.</p>
         * </li>
         * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
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
         * <p>The traffic specification (recommended).</p>
         * <ul>
         * <li><p>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</p>
         * </li>
         * <li><p>You must specify one of peak traffic and traffic specification. If you specify both, the traffic specification takes precedence. Specify only the traffic specification.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
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
         * <p>The billing type. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: subscription.</p>
         * </li>
         * <li><p><strong>4</strong>: Confluent series subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder paidType(Integer paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * <p>The number of partitions (recommended).</p>
         * <ul>
         * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
         * </li>
         * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you upgrade a Confluent instance, you do not need to specify this parameter. This parameter is required for subscription instances.</p>
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
         * <p>The specification type.</p>
         * <p>Valid values for ApsaraMQ for Kafka instances:</p>
         * <ul>
         * <li><p><strong>normal</strong>: Standard Edition (shared throughput)</p>
         * </li>
         * <li><p><strong>professional</strong>: Professional Edition (shared throughput)</p>
         * </li>
         * <li><p><strong>professionalForHighRead</strong>: Professional Edition (shared read)</p>
         * </li>
         * </ul>
         * <p>Valid values for Confluent instances:</p>
         * <ul>
         * <li><p><strong>professional</strong>: Professional Edition.</p>
         * </li>
         * <li><p><strong>enterprise</strong>: Enterprise Edition.</p>
         * </li>
         * </ul>
         * <p>Downgrading an instance from Professional Edition to Standard Edition is not supported. For more information about the specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
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
         * <p>The number of topics (not recommended).</p>
         * <ul>
         * <li><p>You must specify one of the number of partitions and the topic specification. Specify only the number of partitions.</p>
         * </li>
         * <li><p>If you specify both the number of partitions and the topic specification, the system validates whether the number of partitions and the topic specification are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
         * </li>
         * <li><p>The default value varies based on the traffic specification. Additional fees are charged if the value exceeds the default value.</p>
         * </li>
         * <li><p>For valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
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
    public static class KsqlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Integer cu;

        @com.aliyun.core.annotation.NameInMap("InternalId")
        private String internalId;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("Storage")
        private Integer storage;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private KsqlList(Builder builder) {
            this.cu = builder.cu;
            this.internalId = builder.internalId;
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
         * @return cu
         */
        public Integer getCu() {
            return this.cu;
        }

        /**
         * @return internalId
         */
        public String getInternalId() {
            return this.internalId;
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
            private Integer cu; 
            private String internalId; 
            private Integer replica; 
            private Integer storage; 
            private String type; 

            private Builder() {
            } 

            private Builder(KsqlList model) {
                this.cu = model.cu;
                this.internalId = model.internalId;
                this.replica = model.replica;
                this.storage = model.storage;
                this.type = model.type;
            } 

            /**
             * Cu.
             */
            public Builder cu(Integer cu) {
                this.cu = cu;
                return this;
            }

            /**
             * InternalId.
             */
            public Builder internalId(String internalId) {
                this.internalId = internalId;
                return this;
            }

            /**
             * Replica.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * Storage.
             */
            public Builder storage(Integer storage) {
                this.storage = storage;
                return this;
            }

            /**
             * Type.
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

        @com.aliyun.core.annotation.NameInMap("KraftControllerCU")
        private Integer kraftControllerCU;

        @com.aliyun.core.annotation.NameInMap("KraftControllerReplica")
        private Integer kraftControllerReplica;

        @com.aliyun.core.annotation.NameInMap("KraftControllerStorage")
        private Integer kraftControllerStorage;

        @com.aliyun.core.annotation.NameInMap("KsqlCU")
        @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
        private Integer ksqlCU;

        @com.aliyun.core.annotation.NameInMap("KsqlList")
        private java.util.List<KsqlList> ksqlList;

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
             * <p>The number of CPU cores for the ControlCenter component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder controlCenterCU(Integer controlCenterCU) {
                this.controlCenterCU = controlCenterCU;
                return this;
            }

            /**
             * <p>The number of replicas for the ControlCenter component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder controlCenterReplica(Integer controlCenterReplica) {
                this.controlCenterReplica = controlCenterReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the ControlCenter component. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder controlCenterStorage(Integer controlCenterStorage) {
                this.controlCenterStorage = controlCenterStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for the Kafka Broker.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaCU(Integer kafkaCU) {
                this.kafkaCU = kafkaCU;
                return this;
            }

            /**
             * <p>The number of replicas for the Kafka Broker.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder kafkaReplica(Integer kafkaReplica) {
                this.kafkaReplica = kafkaReplica;
                return this;
            }

            /**
             * <p>The number of CPU cores for the KafkaRestProxy component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder kafkaRestProxyCU(Integer kafkaRestProxyCU) {
                this.kafkaRestProxyCU = kafkaRestProxyCU;
                return this;
            }

            /**
             * <p>The number of replicas for the KafkaRestProxy component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder kafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
                this.kafkaRestProxyReplica = kafkaRestProxyReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the Kafka Broker. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * KraftControllerCU.
             */
            public Builder kraftControllerCU(Integer kraftControllerCU) {
                this.kraftControllerCU = kraftControllerCU;
                return this;
            }

            /**
             * KraftControllerReplica.
             */
            public Builder kraftControllerReplica(Integer kraftControllerReplica) {
                this.kraftControllerReplica = kraftControllerReplica;
                return this;
            }

            /**
             * KraftControllerStorage.
             */
            public Builder kraftControllerStorage(Integer kraftControllerStorage) {
                this.kraftControllerStorage = kraftControllerStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for the KsqlDB component.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder ksqlCU(Integer ksqlCU) {
                this.ksqlCU = ksqlCU;
                return this;
            }

            /**
             * KsqlList.
             */
            public Builder ksqlList(java.util.List<KsqlList> ksqlList) {
                this.ksqlList = ksqlList;
                return this;
            }

            /**
             * <p>The number of replicas for the KsqlDB component.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ksqlReplica(Integer ksqlReplica) {
                this.ksqlReplica = ksqlReplica;
                return this;
            }

            /**
             * <p>The disk capacity of the KsqlDB component. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ksqlStorage(Integer ksqlStorage) {
                this.ksqlStorage = ksqlStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores for the SchemaRegistry component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder schemaRegistryCU(Integer schemaRegistryCU) {
                this.schemaRegistryCU = schemaRegistryCU;
                return this;
            }

            /**
             * <p>The number of replicas for the SchemaRegistry component.</p>
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
}
