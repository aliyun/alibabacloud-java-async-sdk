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
 * {@link GetInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceListResponseBody</p>
 */
public class GetInstanceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private InstanceList instanceList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetInstanceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceList = builder.instanceList;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceList
     */
    public InstanceList getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private InstanceList instanceList; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetInstanceListResponseBody model) {
            this.code = model.code;
            this.instanceList = model.instanceList;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The instances.</p>
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>4B6D821D-7F67-4CAA-9E13-A5A997C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceListResponseBody build() {
            return new GetInstanceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
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
             * <p>The disk capacity of Control Center. Unit: GB.</p>
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
             * <p>The disk capacity of the Kafka broker. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * <p>The number of CPU cores of ksqlDB.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The disk capacity of ksqlDB. Unit: GB.</p>
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
             * <p>4</p>
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
             * <p>The disk capacity of ZooKeeper. Unit: GB.</p>
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
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class TagVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagVO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagVO create() {
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

            private Builder(TagVO model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagVO build() {
                return new TagVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagVO")
        private java.util.List<TagVO> tagVO;

        private Tags(Builder builder) {
            this.tagVO = builder.tagVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagVO
         */
        public java.util.List<TagVO> getTagVO() {
            return this.tagVO;
        }

        public static final class Builder {
            private java.util.List<TagVO> tagVO; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagVO = model.tagVO;
            } 

            /**
             * TagVO.
             */
            public Builder tagVO(java.util.List<TagVO> tagVO) {
                this.tagVO = tagVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class UpgradeServiceDetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current2OpenSourceVersion")
        private String current2OpenSourceVersion;

        private UpgradeServiceDetailInfo(Builder builder) {
            this.current2OpenSourceVersion = builder.current2OpenSourceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradeServiceDetailInfo create() {
            return builder().build();
        }

        /**
         * @return current2OpenSourceVersion
         */
        public String getCurrent2OpenSourceVersion() {
            return this.current2OpenSourceVersion;
        }

        public static final class Builder {
            private String current2OpenSourceVersion; 

            private Builder() {
            } 

            private Builder(UpgradeServiceDetailInfo model) {
                this.current2OpenSourceVersion = model.current2OpenSourceVersion;
            } 

            /**
             * <p>The open source Apache Kafka version that corresponds to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2.2.0</p>
             */
            public Builder current2OpenSourceVersion(String current2OpenSourceVersion) {
                this.current2OpenSourceVersion = current2OpenSourceVersion;
                return this;
            }

            public UpgradeServiceDetailInfo build() {
                return new UpgradeServiceDetailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class VSwitchIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private VSwitchIds(Builder builder) {
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(VSwitchIds model) {
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class InstanceVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllConfig")
        private String allConfig;

        @com.aliyun.core.annotation.NameInMap("AutoCreateGroupEnable")
        private Boolean autoCreateGroupEnable;

        @com.aliyun.core.annotation.NameInMap("AutoCreateTopicEnable")
        private Boolean autoCreateTopicEnable;

        @com.aliyun.core.annotation.NameInMap("BackupZoneId")
        private String backupZoneId;

        @com.aliyun.core.annotation.NameInMap("ConfluentConfig")
        private ConfluentConfig confluentConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultPartitionNum")
        private Integer defaultPartitionNum;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private Integer deployType;

        @com.aliyun.core.annotation.NameInMap("DiskSize")
        private Integer diskSize;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private Integer diskType;

        @com.aliyun.core.annotation.NameInMap("DomainEndpoint")
        private String domainEndpoint;

        @com.aliyun.core.annotation.NameInMap("EipMax")
        private Integer eipMax;

        @com.aliyun.core.annotation.NameInMap("EndPoint")
        private String endPoint;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IoMax")
        private Integer ioMax;

        @com.aliyun.core.annotation.NameInMap("IoMaxRead")
        private Integer ioMaxRead;

        @com.aliyun.core.annotation.NameInMap("IoMaxSpec")
        private String ioMaxSpec;

        @com.aliyun.core.annotation.NameInMap("IoMaxWrite")
        private Integer ioMaxWrite;

        @com.aliyun.core.annotation.NameInMap("KmsKeyId")
        private String kmsKeyId;

        @com.aliyun.core.annotation.NameInMap("MsgRetain")
        private Integer msgRetain;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PaidType")
        private Integer paidType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReservedPublishCapacity")
        private Integer reservedPublishCapacity;

        @com.aliyun.core.annotation.NameInMap("ReservedSubscribeCapacity")
        private Integer reservedSubscribeCapacity;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SaslDomainEndpoint")
        private String saslDomainEndpoint;

        @com.aliyun.core.annotation.NameInMap("SaslEndPoint")
        private String saslEndPoint;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("Series")
        private String series;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private Integer serviceStatus;

        @com.aliyun.core.annotation.NameInMap("SpecType")
        private String specType;

        @com.aliyun.core.annotation.NameInMap("SslDomainEndpoint")
        private String sslDomainEndpoint;

        @com.aliyun.core.annotation.NameInMap("SslEndPoint")
        private String sslEndPoint;

        @com.aliyun.core.annotation.NameInMap("StandardZoneId")
        private String standardZoneId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TopicNumLimit")
        private Integer topicNumLimit;

        @com.aliyun.core.annotation.NameInMap("UpgradeServiceDetailInfo")
        private UpgradeServiceDetailInfo upgradeServiceDetailInfo;

        @com.aliyun.core.annotation.NameInMap("UsedGroupCount")
        private Integer usedGroupCount;

        @com.aliyun.core.annotation.NameInMap("UsedPartitionCount")
        private Integer usedPartitionCount;

        @com.aliyun.core.annotation.NameInMap("UsedTopicCount")
        private Integer usedTopicCount;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("ViewInstanceStatusCode")
        private Integer viewInstanceStatusCode;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcSaslDomainEndpoint")
        private String vpcSaslDomainEndpoint;

        @com.aliyun.core.annotation.NameInMap("VpcSaslEndPoint")
        private String vpcSaslEndPoint;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceVO(Builder builder) {
            this.allConfig = builder.allConfig;
            this.autoCreateGroupEnable = builder.autoCreateGroupEnable;
            this.autoCreateTopicEnable = builder.autoCreateTopicEnable;
            this.backupZoneId = builder.backupZoneId;
            this.confluentConfig = builder.confluentConfig;
            this.createTime = builder.createTime;
            this.defaultPartitionNum = builder.defaultPartitionNum;
            this.deployType = builder.deployType;
            this.diskSize = builder.diskSize;
            this.diskType = builder.diskType;
            this.domainEndpoint = builder.domainEndpoint;
            this.eipMax = builder.eipMax;
            this.endPoint = builder.endPoint;
            this.expiredTime = builder.expiredTime;
            this.instanceId = builder.instanceId;
            this.ioMax = builder.ioMax;
            this.ioMaxRead = builder.ioMaxRead;
            this.ioMaxSpec = builder.ioMaxSpec;
            this.ioMaxWrite = builder.ioMaxWrite;
            this.kmsKeyId = builder.kmsKeyId;
            this.msgRetain = builder.msgRetain;
            this.name = builder.name;
            this.paidType = builder.paidType;
            this.regionId = builder.regionId;
            this.reservedPublishCapacity = builder.reservedPublishCapacity;
            this.reservedSubscribeCapacity = builder.reservedSubscribeCapacity;
            this.resourceGroupId = builder.resourceGroupId;
            this.saslDomainEndpoint = builder.saslDomainEndpoint;
            this.saslEndPoint = builder.saslEndPoint;
            this.securityGroup = builder.securityGroup;
            this.series = builder.series;
            this.serviceStatus = builder.serviceStatus;
            this.specType = builder.specType;
            this.sslDomainEndpoint = builder.sslDomainEndpoint;
            this.sslEndPoint = builder.sslEndPoint;
            this.standardZoneId = builder.standardZoneId;
            this.tags = builder.tags;
            this.topicNumLimit = builder.topicNumLimit;
            this.upgradeServiceDetailInfo = builder.upgradeServiceDetailInfo;
            this.usedGroupCount = builder.usedGroupCount;
            this.usedPartitionCount = builder.usedPartitionCount;
            this.usedTopicCount = builder.usedTopicCount;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.viewInstanceStatusCode = builder.viewInstanceStatusCode;
            this.vpcId = builder.vpcId;
            this.vpcSaslDomainEndpoint = builder.vpcSaslDomainEndpoint;
            this.vpcSaslEndPoint = builder.vpcSaslEndPoint;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceVO create() {
            return builder().build();
        }

        /**
         * @return allConfig
         */
        public String getAllConfig() {
            return this.allConfig;
        }

        /**
         * @return autoCreateGroupEnable
         */
        public Boolean getAutoCreateGroupEnable() {
            return this.autoCreateGroupEnable;
        }

        /**
         * @return autoCreateTopicEnable
         */
        public Boolean getAutoCreateTopicEnable() {
            return this.autoCreateTopicEnable;
        }

        /**
         * @return backupZoneId
         */
        public String getBackupZoneId() {
            return this.backupZoneId;
        }

        /**
         * @return confluentConfig
         */
        public ConfluentConfig getConfluentConfig() {
            return this.confluentConfig;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return defaultPartitionNum
         */
        public Integer getDefaultPartitionNum() {
            return this.defaultPartitionNum;
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
        public Integer getDiskType() {
            return this.diskType;
        }

        /**
         * @return domainEndpoint
         */
        public String getDomainEndpoint() {
            return this.domainEndpoint;
        }

        /**
         * @return eipMax
         */
        public Integer getEipMax() {
            return this.eipMax;
        }

        /**
         * @return endPoint
         */
        public String getEndPoint() {
            return this.endPoint;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
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
         * @return ioMaxRead
         */
        public Integer getIoMaxRead() {
            return this.ioMaxRead;
        }

        /**
         * @return ioMaxSpec
         */
        public String getIoMaxSpec() {
            return this.ioMaxSpec;
        }

        /**
         * @return ioMaxWrite
         */
        public Integer getIoMaxWrite() {
            return this.ioMaxWrite;
        }

        /**
         * @return kmsKeyId
         */
        public String getKmsKeyId() {
            return this.kmsKeyId;
        }

        /**
         * @return msgRetain
         */
        public Integer getMsgRetain() {
            return this.msgRetain;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paidType
         */
        public Integer getPaidType() {
            return this.paidType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reservedPublishCapacity
         */
        public Integer getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        /**
         * @return reservedSubscribeCapacity
         */
        public Integer getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return saslDomainEndpoint
         */
        public String getSaslDomainEndpoint() {
            return this.saslDomainEndpoint;
        }

        /**
         * @return saslEndPoint
         */
        public String getSaslEndPoint() {
            return this.saslEndPoint;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return series
         */
        public String getSeries() {
            return this.series;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return sslDomainEndpoint
         */
        public String getSslDomainEndpoint() {
            return this.sslDomainEndpoint;
        }

        /**
         * @return sslEndPoint
         */
        public String getSslEndPoint() {
            return this.sslEndPoint;
        }

        /**
         * @return standardZoneId
         */
        public String getStandardZoneId() {
            return this.standardZoneId;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return topicNumLimit
         */
        public Integer getTopicNumLimit() {
            return this.topicNumLimit;
        }

        /**
         * @return upgradeServiceDetailInfo
         */
        public UpgradeServiceDetailInfo getUpgradeServiceDetailInfo() {
            return this.upgradeServiceDetailInfo;
        }

        /**
         * @return usedGroupCount
         */
        public Integer getUsedGroupCount() {
            return this.usedGroupCount;
        }

        /**
         * @return usedPartitionCount
         */
        public Integer getUsedPartitionCount() {
            return this.usedPartitionCount;
        }

        /**
         * @return usedTopicCount
         */
        public Integer getUsedTopicCount() {
            return this.usedTopicCount;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchIds
         */
        public VSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return viewInstanceStatusCode
         */
        public Integer getViewInstanceStatusCode() {
            return this.viewInstanceStatusCode;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcSaslDomainEndpoint
         */
        public String getVpcSaslDomainEndpoint() {
            return this.vpcSaslDomainEndpoint;
        }

        /**
         * @return vpcSaslEndPoint
         */
        public String getVpcSaslEndPoint() {
            return this.vpcSaslEndPoint;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String allConfig; 
            private Boolean autoCreateGroupEnable; 
            private Boolean autoCreateTopicEnable; 
            private String backupZoneId; 
            private ConfluentConfig confluentConfig; 
            private Long createTime; 
            private Integer defaultPartitionNum; 
            private Integer deployType; 
            private Integer diskSize; 
            private Integer diskType; 
            private String domainEndpoint; 
            private Integer eipMax; 
            private String endPoint; 
            private Long expiredTime; 
            private String instanceId; 
            private Integer ioMax; 
            private Integer ioMaxRead; 
            private String ioMaxSpec; 
            private Integer ioMaxWrite; 
            private String kmsKeyId; 
            private Integer msgRetain; 
            private String name; 
            private Integer paidType; 
            private String regionId; 
            private Integer reservedPublishCapacity; 
            private Integer reservedSubscribeCapacity; 
            private String resourceGroupId; 
            private String saslDomainEndpoint; 
            private String saslEndPoint; 
            private String securityGroup; 
            private String series; 
            private Integer serviceStatus; 
            private String specType; 
            private String sslDomainEndpoint; 
            private String sslEndPoint; 
            private String standardZoneId; 
            private Tags tags; 
            private Integer topicNumLimit; 
            private UpgradeServiceDetailInfo upgradeServiceDetailInfo; 
            private Integer usedGroupCount; 
            private Integer usedPartitionCount; 
            private Integer usedTopicCount; 
            private String vSwitchId; 
            private VSwitchIds vSwitchIds; 
            private Integer viewInstanceStatusCode; 
            private String vpcId; 
            private String vpcSaslDomainEndpoint; 
            private String vpcSaslEndPoint; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(InstanceVO model) {
                this.allConfig = model.allConfig;
                this.autoCreateGroupEnable = model.autoCreateGroupEnable;
                this.autoCreateTopicEnable = model.autoCreateTopicEnable;
                this.backupZoneId = model.backupZoneId;
                this.confluentConfig = model.confluentConfig;
                this.createTime = model.createTime;
                this.defaultPartitionNum = model.defaultPartitionNum;
                this.deployType = model.deployType;
                this.diskSize = model.diskSize;
                this.diskType = model.diskType;
                this.domainEndpoint = model.domainEndpoint;
                this.eipMax = model.eipMax;
                this.endPoint = model.endPoint;
                this.expiredTime = model.expiredTime;
                this.instanceId = model.instanceId;
                this.ioMax = model.ioMax;
                this.ioMaxRead = model.ioMaxRead;
                this.ioMaxSpec = model.ioMaxSpec;
                this.ioMaxWrite = model.ioMaxWrite;
                this.kmsKeyId = model.kmsKeyId;
                this.msgRetain = model.msgRetain;
                this.name = model.name;
                this.paidType = model.paidType;
                this.regionId = model.regionId;
                this.reservedPublishCapacity = model.reservedPublishCapacity;
                this.reservedSubscribeCapacity = model.reservedSubscribeCapacity;
                this.resourceGroupId = model.resourceGroupId;
                this.saslDomainEndpoint = model.saslDomainEndpoint;
                this.saslEndPoint = model.saslEndPoint;
                this.securityGroup = model.securityGroup;
                this.series = model.series;
                this.serviceStatus = model.serviceStatus;
                this.specType = model.specType;
                this.sslDomainEndpoint = model.sslDomainEndpoint;
                this.sslEndPoint = model.sslEndPoint;
                this.standardZoneId = model.standardZoneId;
                this.tags = model.tags;
                this.topicNumLimit = model.topicNumLimit;
                this.upgradeServiceDetailInfo = model.upgradeServiceDetailInfo;
                this.usedGroupCount = model.usedGroupCount;
                this.usedPartitionCount = model.usedPartitionCount;
                this.usedTopicCount = model.usedTopicCount;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchIds = model.vSwitchIds;
                this.viewInstanceStatusCode = model.viewInstanceStatusCode;
                this.vpcId = model.vpcId;
                this.vpcSaslDomainEndpoint = model.vpcSaslDomainEndpoint;
                this.vpcSaslEndPoint = model.vpcSaslEndPoint;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The configurations of the deployed ApsaraMQ for Kafka instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;enable.vpc_sasl_ssl&quot;:&quot;false&quot;,&quot;kafka.log.retention.hours&quot;:&quot;66&quot;,&quot;enable.acl&quot;:&quot;false&quot;,&quot;kafka.message.max.bytes&quot;:&quot;6291456&quot;}</p>
             */
            public Builder allConfig(String allConfig) {
                this.allConfig = allConfig;
                return this;
            }

            /**
             * <p>Indicates whether the flexible group creation feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreateGroupEnable(Boolean autoCreateGroupEnable) {
                this.autoCreateGroupEnable = autoCreateGroupEnable;
                return this;
            }

            /**
             * <p>Indicates whether the automatic topic creation feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreateTopicEnable(Boolean autoCreateTopicEnable) {
                this.autoCreateTopicEnable = autoCreateTopicEnable;
                return this;
            }

            /**
             * <p>The ID of the secondary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder backupZoneId(String backupZoneId) {
                this.backupZoneId = backupZoneId;
                return this;
            }

            /**
             * <p>The parameters that are returned for the ApsaraMQ for Confluent instance.</p>
             */
            public Builder confluentConfig(ConfluentConfig confluentConfig) {
                this.confluentConfig = confluentConfig;
                return this;
            }

            /**
             * <p>The time when the instance was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1577961819000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of partitions in a topic that is automatically created.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder defaultPartitionNum(Integer defaultPartitionNum) {
                this.defaultPartitionNum = defaultPartitionNum;
                return this;
            }

            /**
             * <p>The type of the network in which the instance is deployed. Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: Internet and VPC</li>
             * <li><strong>5</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The disk size. Unit: GB</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * <p>The disk type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: ultra disk</li>
             * <li><strong>1</strong>: standard SSD</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder diskType(Integer diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The default endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alikafka-pre-cn-zv**********-1-vpc.alikafka.aliyuncs.com:9092,alikafka-pre-cn-zv**********-2-vpc.alikafka.aliyuncs.com:9092,alikafka-pre-cn-zv**********-3-vpc.alikafka.aliyuncs.com:9092</p>
             */
            public Builder domainEndpoint(String domainEndpoint) {
                this.domainEndpoint = domainEndpoint;
                return this;
            }

            /**
             * <p>The maximum Internet traffic in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder eipMax(Integer eipMax) {
                this.eipMax = eipMax;
                return this;
            }

            /**
             * <p>The default endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX:9092,192.168.XX.XX:9092,192.168.XX.XX:9092</p>
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * <p>The time when the instance expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1893581018000</p>
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_pre-cn-mp919o4v****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The maximum traffic in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ioMax(Integer ioMax) {
                this.ioMax = ioMax;
                return this;
            }

            /**
             * <p>The maximum read traffic in the instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder ioMaxRead(Integer ioMaxRead) {
                this.ioMaxRead = ioMaxRead;
                return this;
            }

            /**
             * <p>The traffic specification.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka.hw.2xlarge</p>
             */
            public Builder ioMaxSpec(String ioMaxSpec) {
                this.ioMaxSpec = ioMaxSpec;
                return this;
            }

            /**
             * <p>The maximum write traffic. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder ioMaxWrite(Integer ioMaxWrite) {
                this.ioMaxWrite = ioMaxWrite;
                return this;
            }

            /**
             * <p>The ID of the key that is used for disk encryption in the region where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>0d24xxxx-da7b-4786-b981-9a164dxxxxxx</p>
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * <p>The retention period of messages in the instance. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder msgRetain(Integer msgRetain) {
                this.msgRetain = msgRetain;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>alikafka_post-cn-mp91gnw0****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The billing method of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: the subscription billing method</li>
             * <li><strong>1</strong>: the pay-as-you-go billing method</li>
             * <li><strong>3</strong>: the pay-as-you-go billing method for serverless ApsaraMQ for Kafka V3 instances</li>
             * <li><strong>4</strong>: the pay-as-you-go billing method for ApsaraMQ for Confluent instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder paidType(Integer paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * <p>The ID of the region where the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The traffic reserved for message publishing. Unit: MB/s.</p>
             * <blockquote>
             * <p> This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder reservedPublishCapacity(Integer reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * <p>The traffic reserved for message subscription. Unit: MB/s.</p>
             * <blockquote>
             * <p> This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder reservedSubscribeCapacity(Integer reservedSubscribeCapacity) {
                this.reservedSubscribeCapacity = reservedSubscribeCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-ac***********7q</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alikafka-pre-cn-zv**********-1-vpc.alikafka.aliyuncs.com:9094,alikafka-pre-cn-zv**********-2-vpc.alikafka.aliyuncs.com:9094,alikafka-pre-cn-zv**********-3-vpc.alikafka.aliyuncs.com:9094</p>
             */
            public Builder saslDomainEndpoint(String saslDomainEndpoint) {
                this.saslDomainEndpoint = saslDomainEndpoint;
                return this;
            }

            /**
             * <p>The Simple Authentication and Security Layer (SASL) endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172.16.3.XX:9094,172.16.3.XX:9094,172.16.3.XX:9094</p>
             */
            public Builder saslEndPoint(String saslEndPoint) {
                this.saslEndPoint = saslEndPoint;
                return this;
            }

            /**
             * <p>The security group to which the instance belongs.</p>
             * <ul>
             * <li>If the instance is deployed in the ApsaraMQ for Kafka console or by calling the <a href="https://help.aliyun.com/document_detail/157786.html">StartInstance</a> operation without a security group configured, no value is returned.</li>
             * <li>If the instance is deployed by calling the <a href="https://help.aliyun.com/document_detail/157786.html">StartInstance</a> operation with a security group configured, the returned value is the configured security group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sg-bp13wfx7kz9pkow****</p>
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * <p>The instance version. Valid values: v2, v3, and confluent.</p>
             * 
             * <strong>example:</strong>
             * <p>v3</p>
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is out of date. We recommend that you refer to the ViewInstanceStatusCode parameter.</p>
             * </blockquote>
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: pending</li>
             * <li><strong>1</strong>: preparing hardware resources</li>
             * <li><strong>2</strong>: initializing</li>
             * <li><strong>3</strong>: starting</li>
             * <li><strong>5</strong>: running</li>
             * <li><strong>6</strong>: migrating</li>
             * <li><strong>7</strong>: ready for upgrade</li>
             * <li><strong>8</strong>: upgrading</li>
             * <li><strong>9</strong>: ready for change</li>
             * <li><strong>10</strong>: released</li>
             * <li><strong>11</strong>: changing</li>
             * <li><strong>15</strong>: expired</li>
             * <li><strong>30</strong>: scaling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li><strong>professional</strong>: Professional Edition (High Write)</li>
             * <li><strong>professionalForHighRead</strong>: Professional Edition (High Read)</li>
             * <li><strong>normal</strong>: Standard Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>professional</p>
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * <p>The SSL endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alikafka-pre-cn-zv**********-1.alikafka.aliyuncs.com:9093,alikafka-pre-cn-zv**********-2.alikafka.aliyuncs.com:9093,alikafka-pre-cn-zv**********-3.alikafka.aliyuncs.com:9093</p>
             */
            public Builder sslDomainEndpoint(String sslDomainEndpoint) {
                this.sslDomainEndpoint = sslDomainEndpoint;
                return this;
            }

            /**
             * <p>The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX:9093,198.51.XX.XX:9093,203.0.XX.XX:9093</p>
             */
            public Builder sslEndPoint(String sslEndPoint) {
                this.sslEndPoint = sslEndPoint;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder standardZoneId(String standardZoneId) {
                this.standardZoneId = standardZoneId;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The maximum number of topics on the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder topicNumLimit(Integer topicNumLimit) {
                this.topicNumLimit = topicNumLimit;
                return this;
            }

            /**
             * <p>The upgrade information about the instance.</p>
             */
            public Builder upgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
                this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
                return this;
            }

            /**
             * <p>The number of used groups.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usedGroupCount(Integer usedGroupCount) {
                this.usedGroupCount = usedGroupCount;
                return this;
            }

            /**
             * <p>The number of used partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder usedPartitionCount(Integer usedPartitionCount) {
                this.usedPartitionCount = usedPartitionCount;
                return this;
            }

            /**
             * <p>The number of used topics.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder usedTopicCount(Integer usedTopicCount) {
                this.usedTopicCount = usedTopicCount;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1fvuw0ljd7vzmo3****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The vSwitch IDs.</p>
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The instance status. The valid values are consistent with the values displayed in the ApsaraMQ for Kafka console. This parameter is used in the new version of ApsaraMQ for Kafka.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: pending</li>
             * <li><strong>1</strong>: deploying</li>
             * <li><strong>2</strong>: running</li>
             * <li><strong>3</strong>: stopped</li>
             * <li><strong>4</strong>: expiring</li>
             * <li><strong>5</strong>: expired</li>
             * <li><strong>6</strong>: released</li>
             * <li><strong>7</strong>: upgrading</li>
             * <li><strong>8</strong>: migrating</li>
             * <li><strong>21</strong>: stopping</li>
             * <li><strong>22</strong>: starting</li>
             * <li><strong>23</strong>: releasing</li>
             * <li><strong>30</strong>: auto scaling</li>
             * <li><strong>101</strong>: deployment failed</li>
             * <li><strong>102</strong>: upgrade failed</li>
             * <li><strong>103</strong>: migration failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder viewInstanceStatusCode(Integer viewInstanceStatusCode) {
                this.viewInstanceStatusCode = viewInstanceStatusCode;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1ojac7bv448nifj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The SSL endpoint of the instance in domain name mode. You can use the endpoint to access the instance only in virtual private clouds (VPCs). ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alikafka-post-cn-<strong><strong><strong>-1-vpc.alikafka.aliyuncs.com:9095,alikafka-post-cn-</strong></strong></strong>-2-vpc.alikafka.aliyuncs.com:9095,alikafka-post-cn-******-3-vpc.alikafka.aliyuncs.com:9095</p>
             */
            public Builder vpcSaslDomainEndpoint(String vpcSaslDomainEndpoint) {
                this.vpcSaslDomainEndpoint = vpcSaslDomainEndpoint;
                return this;
            }

            /**
             * <p>The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode. You can use the endpoint to access the instance only in virtual private clouds (VPCs). ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.</p>
             * <ul>
             * <li>Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is <code>{Instance domain name}:{Port number}</code>.</li>
             * <li>Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is <code>{Broker IP address}:{Port number}</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172.16.3.XX:9095,172.16.3.XX:9095,172.16.3.XX:9095</p>
             */
            public Builder vpcSaslEndPoint(String vpcSaslEndPoint) {
                this.vpcSaslEndPoint = vpcSaslEndPoint;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>zonei</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public InstanceVO build() {
                return new InstanceVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceVO")
        private java.util.List<InstanceVO> instanceVO;

        private InstanceList(Builder builder) {
            this.instanceVO = builder.instanceVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceVO
         */
        public java.util.List<InstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

        public static final class Builder {
            private java.util.List<InstanceVO> instanceVO; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.instanceVO = model.instanceVO;
            } 

            /**
             * InstanceVO.
             */
            public Builder instanceVO(java.util.List<InstanceVO> instanceVO) {
                this.instanceVO = instanceVO;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
