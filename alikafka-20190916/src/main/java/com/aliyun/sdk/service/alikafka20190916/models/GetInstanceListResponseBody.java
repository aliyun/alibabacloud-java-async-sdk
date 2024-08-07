// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the call is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The instances.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceListResponseBody build() {
            return new GetInstanceListResponseBody(this);
        } 

    } 

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
             * The number of CPU cores of Connect.
             */
            public Builder connectCU(Integer connectCU) {
                this.connectCU = connectCU;
                return this;
            }

            /**
             * The number of replicas of Connect.
             */
            public Builder connectReplica(Integer connectReplica) {
                this.connectReplica = connectReplica;
                return this;
            }

            /**
             * The number of CPU cores of Control Center.
             */
            public Builder controlCenterCU(Integer controlCenterCU) {
                this.controlCenterCU = controlCenterCU;
                return this;
            }

            /**
             * The number of replicas of Control Center.
             */
            public Builder controlCenterReplica(Integer controlCenterReplica) {
                this.controlCenterReplica = controlCenterReplica;
                return this;
            }

            /**
             * The disk capacity of Control Center. Unit: GB.
             */
            public Builder controlCenterStorage(Integer controlCenterStorage) {
                this.controlCenterStorage = controlCenterStorage;
                return this;
            }

            /**
             * The number of CPU cores of the Kafka broker.
             */
            public Builder kafkaCU(Integer kafkaCU) {
                this.kafkaCU = kafkaCU;
                return this;
            }

            /**
             * The number of replicas of the Kafka broker.
             */
            public Builder kafkaReplica(Integer kafkaReplica) {
                this.kafkaReplica = kafkaReplica;
                return this;
            }

            /**
             * The number of CPU cores of Kafka Rest Proxy.
             */
            public Builder kafkaRestProxyCU(Integer kafkaRestProxyCU) {
                this.kafkaRestProxyCU = kafkaRestProxyCU;
                return this;
            }

            /**
             * The number of replicas of Kafka Rest Proxy.
             */
            public Builder kafkaRestProxyReplica(Integer kafkaRestProxyReplica) {
                this.kafkaRestProxyReplica = kafkaRestProxyReplica;
                return this;
            }

            /**
             * The disk capacity of the Kafka broker. Unit: GB.
             */
            public Builder kafkaStorage(Integer kafkaStorage) {
                this.kafkaStorage = kafkaStorage;
                return this;
            }

            /**
             * The number of CPU cores of ksqlDB.
             */
            public Builder ksqlCU(Integer ksqlCU) {
                this.ksqlCU = ksqlCU;
                return this;
            }

            /**
             * The number of replicas of ksqlDB.
             */
            public Builder ksqlReplica(Integer ksqlReplica) {
                this.ksqlReplica = ksqlReplica;
                return this;
            }

            /**
             * The disk capacity of ksqlDB. Unit: GB.
             */
            public Builder ksqlStorage(Integer ksqlStorage) {
                this.ksqlStorage = ksqlStorage;
                return this;
            }

            /**
             * The number of CPU cores of Schema Registry.
             */
            public Builder schemaRegistryCU(Integer schemaRegistryCU) {
                this.schemaRegistryCU = schemaRegistryCU;
                return this;
            }

            /**
             * The number of replicas of Schema Registry.
             */
            public Builder schemaRegistryReplica(Integer schemaRegistryReplica) {
                this.schemaRegistryReplica = schemaRegistryReplica;
                return this;
            }

            /**
             * The number of CPU cores of ZooKeeper.
             */
            public Builder zooKeeperCU(Integer zooKeeperCU) {
                this.zooKeeperCU = zooKeeperCU;
                return this;
            }

            /**
             * The number of replicas of ZooKeeper.
             */
            public Builder zooKeeperReplica(Integer zooKeeperReplica) {
                this.zooKeeperReplica = zooKeeperReplica;
                return this;
            }

            /**
             * The disk capacity of ZooKeeper. Unit: GB.
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

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagVO")
        private java.util.List < TagVO> tagVO;

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
        public java.util.List < TagVO> getTagVO() {
            return this.tagVO;
        }

        public static final class Builder {
            private java.util.List < TagVO> tagVO; 

            /**
             * TagVO.
             */
            public Builder tagVO(java.util.List < TagVO> tagVO) {
                this.tagVO = tagVO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
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

            /**
             * The open source Apache Kafka version that corresponds to the instance.
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
    public static class InstanceVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllConfig")
        private String allConfig;

        @com.aliyun.core.annotation.NameInMap("ConfluentConfig")
        private ConfluentConfig confluentConfig;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

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

        @com.aliyun.core.annotation.NameInMap("ViewInstanceStatusCode")
        private Integer viewInstanceStatusCode;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private InstanceVO(Builder builder) {
            this.allConfig = builder.allConfig;
            this.confluentConfig = builder.confluentConfig;
            this.createTime = builder.createTime;
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
            this.viewInstanceStatusCode = builder.viewInstanceStatusCode;
            this.vpcId = builder.vpcId;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String allConfig; 
            private ConfluentConfig confluentConfig; 
            private Long createTime; 
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
            private Integer viewInstanceStatusCode; 
            private String vpcId; 
            private String zoneId; 

            /**
             * The configurations of the deployed ApsaraMQ for Kafka instance.
             */
            public Builder allConfig(String allConfig) {
                this.allConfig = allConfig;
                return this;
            }

            /**
             * The parameters that are returned for the ApsaraMQ for Confluent instance.
             */
            public Builder confluentConfig(ConfluentConfig confluentConfig) {
                this.confluentConfig = confluentConfig;
                return this;
            }

            /**
             * The time when the instance was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The type of the network in which the instance is deployed. Valid values:
             * <p>
             * 
             * *   **4**: Internet and VPC
             * *   **5**: VPC
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The disk size. Unit: GB
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * The disk type of the instance. Valid values:
             * <p>
             * 
             * *   **0**: ultra disk
             * *   **1**: standard SSD
             */
            public Builder diskType(Integer diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The default endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.
             * <p>
             * 
             * *   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder domainEndpoint(String domainEndpoint) {
                this.domainEndpoint = domainEndpoint;
                return this;
            }

            /**
             * The maximum Internet traffic in the instance.
             */
            public Builder eipMax(Integer eipMax) {
                this.eipMax = eipMax;
                return this;
            }

            /**
             * The default endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.
             * <p>
             * 
             * *   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * The time when the instance expires. Unit: milliseconds.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The maximum traffic in the instance.
             */
            public Builder ioMax(Integer ioMax) {
                this.ioMax = ioMax;
                return this;
            }

            /**
             * The maximum read traffic in the instance. Unit: Mbit/s.
             */
            public Builder ioMaxRead(Integer ioMaxRead) {
                this.ioMaxRead = ioMaxRead;
                return this;
            }

            /**
             * The traffic specification.
             */
            public Builder ioMaxSpec(String ioMaxSpec) {
                this.ioMaxSpec = ioMaxSpec;
                return this;
            }

            /**
             * The maximum write traffic. Unit: Mbit/s.
             */
            public Builder ioMaxWrite(Integer ioMaxWrite) {
                this.ioMaxWrite = ioMaxWrite;
                return this;
            }

            /**
             * The ID of the key that is used for disk encryption in the region where the instance is deployed.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * The retention period of messages in the instance. Unit: hours.
             */
            public Builder msgRetain(Integer msgRetain) {
                this.msgRetain = msgRetain;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The billing method of the instance. Valid values:
             * <p>
             * 
             * *   **0**: the subscription billing method
             * *   **1**: the pay-as-you-go billing method
             * *   **3**: the pay-as-you-go billing method for serverless ApsaraMQ for Kafka V3 instances
             * *   **4**: the pay-as-you-go billing method for ApsaraMQ for Confluent instances
             */
            public Builder paidType(Integer paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * The ID of the region where the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The traffic reserved for message publishing. Unit: MB/s.
             * <p>
             * 
             * >  This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.
             */
            public Builder reservedPublishCapacity(Integer reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * The traffic reserved for message subscription. Unit: MB/s.
             * <p>
             * 
             * >  This parameter is returned only if the instance is a serverless ApsaraMQ for Kafka V3 instance.
             */
            public Builder reservedSubscribeCapacity(Integer reservedSubscribeCapacity) {
                this.reservedSubscribeCapacity = reservedSubscribeCapacity;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The Simple Authentication and Security Layer (SASL) endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.
             * <p>
             * 
             * *   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder saslDomainEndpoint(String saslDomainEndpoint) {
                this.saslDomainEndpoint = saslDomainEndpoint;
                return this;
            }

            /**
             * The security group to which the instance belongs.
             * <p>
             * 
             * *   If the instance is deployed in the ApsaraMQ for Kafka console or by calling the [StartInstance](~~157786~~) operation without a security group configured, no value is returned.
             * *   If the instance is deployed by calling the [StartInstance](~~157786~~) operation with a security group configured, the returned value is the configured security group.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * The instance version. Valid values: v2, v3, and confluent.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * >  This parameter is out of date. We recommend that you refer to the ViewInstanceStatusCode parameter.
             * <p>
             * 
             * The instance status. Valid values:
             * 
             * *   **0**: pending
             * *   **1**: preparing hardware resources
             * *   **2**: initializing
             * *   **3**: starting
             * *   **5**: running
             * *   **6**: migrating
             * *   **7**: ready for upgrade
             * *   **8**: upgrading
             * *   **9**: ready for change
             * *   **10**: released
             * *   **11**: changing
             * *   **15**: expired
             * *   **30**: scaling
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * The instance edition. Valid values:
             * <p>
             * 
             * *   **professional**: Professional Edition (High Write)
             * *   **professionalForHighRead**: Professional Edition (High Read)
             * *   **normal**: Standard Edition
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * The SSL endpoint of the instance in domain name mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.
             * <p>
             * 
             * *   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder sslDomainEndpoint(String sslDomainEndpoint) {
                this.sslDomainEndpoint = sslDomainEndpoint;
                return this;
            }

            /**
             * The Secure Sockets Layer (SSL) endpoint of the instance in IP address mode. ApsaraMQ for Kafka instances support endpoints in domain name mode and IP address mode.
             * <p>
             * 
             * *   Endpoints in domain name mode: An endpoint in this mode consists of the domain name of the instance and a port number. The format of an endpoint in this mode is `{Instance domain name}:{Port number}`.
             * *   Endpoints in IP address mode: An endpoint in this mode consists of the IP address of the broker and a port number. The format of an endpoint in this mode is `{Broker IP address}:{Port number}`.
             */
            public Builder sslEndPoint(String sslEndPoint) {
                this.sslEndPoint = sslEndPoint;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder standardZoneId(String standardZoneId) {
                this.standardZoneId = standardZoneId;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The maximum number of topics on the instance.
             */
            public Builder topicNumLimit(Integer topicNumLimit) {
                this.topicNumLimit = topicNumLimit;
                return this;
            }

            /**
             * The upgrade information about the instance.
             */
            public Builder upgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
                this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
                return this;
            }

            /**
             * The number of used groups.
             */
            public Builder usedGroupCount(Integer usedGroupCount) {
                this.usedGroupCount = usedGroupCount;
                return this;
            }

            /**
             * The number of used partitions.
             */
            public Builder usedPartitionCount(Integer usedPartitionCount) {
                this.usedPartitionCount = usedPartitionCount;
                return this;
            }

            /**
             * The number of used topics.
             */
            public Builder usedTopicCount(Integer usedTopicCount) {
                this.usedTopicCount = usedTopicCount;
                return this;
            }

            /**
             * The ID of the vSwitch to which the instance belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The instance status. The valid values are consistent with the values displayed in the ApsaraMQ for Kafka console. This parameter is used in the new version of ApsaraMQ for Kafka.
             * <p>
             * 
             * Valid values:
             * 
             * *   **0**: pending
             * *   **1**: deploying
             * *   **2**: running
             * *   **3**: stopped
             * *   **4**: expiring
             * *   **5**: expired
             * *   **6**: released
             * *   **7**: upgrading
             * *   **8**: migrating
             * *   **21**: stopping
             * *   **22**: starting
             * *   **23**: releasing
             * *   **30**: auto scaling
             * *   **101**: deployment failed
             * *   **102**: upgrade failed
             * *   **103**: migration failed
             */
            public Builder viewInstanceStatusCode(Integer viewInstanceStatusCode) {
                this.viewInstanceStatusCode = viewInstanceStatusCode;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The zone ID.
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
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceVO")
        private java.util.List < InstanceVO> instanceVO;

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
        public java.util.List < InstanceVO> getInstanceVO() {
            return this.instanceVO;
        }

        public static final class Builder {
            private java.util.List < InstanceVO> instanceVO; 

            /**
             * InstanceVO.
             */
            public Builder instanceVO(java.util.List < InstanceVO> instanceVO) {
                this.instanceVO = instanceVO;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
