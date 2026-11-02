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
         * <p>The response code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(InstanceList instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
    public static class ConfluentInstanceComponentResourceVO extends TeaModel {
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

        private ConfluentInstanceComponentResourceVO(Builder builder) {
            this.cu = builder.cu;
            this.internalId = builder.internalId;
            this.replica = builder.replica;
            this.storage = builder.storage;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfluentInstanceComponentResourceVO create() {
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

            private Builder(ConfluentInstanceComponentResourceVO model) {
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

            public ConfluentInstanceComponentResourceVO build() {
                return new ConfluentInstanceComponentResourceVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class KsqlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfluentInstanceComponentResourceVO")
        private java.util.List<ConfluentInstanceComponentResourceVO> confluentInstanceComponentResourceVO;

        private KsqlList(Builder builder) {
            this.confluentInstanceComponentResourceVO = builder.confluentInstanceComponentResourceVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KsqlList create() {
            return builder().build();
        }

        /**
         * @return confluentInstanceComponentResourceVO
         */
        public java.util.List<ConfluentInstanceComponentResourceVO> getConfluentInstanceComponentResourceVO() {
            return this.confluentInstanceComponentResourceVO;
        }

        public static final class Builder {
            private java.util.List<ConfluentInstanceComponentResourceVO> confluentInstanceComponentResourceVO; 

            private Builder() {
            } 

            private Builder(KsqlList model) {
                this.confluentInstanceComponentResourceVO = model.confluentInstanceComponentResourceVO;
            } 

            /**
             * ConfluentInstanceComponentResourceVO.
             */
            public Builder confluentInstanceComponentResourceVO(java.util.List<ConfluentInstanceComponentResourceVO> confluentInstanceComponentResourceVO) {
                this.confluentInstanceComponentResourceVO = confluentInstanceComponentResourceVO;
                return this;
            }

            public KsqlList build() {
                return new KsqlList(this);
            } 

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

        @com.aliyun.core.annotation.NameInMap("KsqlList")
        private KsqlList ksqlList;

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
         * @return ksqlCU
         */
        public Integer getKsqlCU() {
            return this.ksqlCU;
        }

        /**
         * @return ksqlList
         */
        public KsqlList getKsqlList() {
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
            private Integer ksqlCU; 
            private KsqlList ksqlList; 
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
             * KsqlList.
             */
            public Builder ksqlList(KsqlList ksqlList) {
                this.ksqlList = ksqlList;
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
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class ConfluentInstanceComponentVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("DeployModule")
        private String deployModule;

        @com.aliyun.core.annotation.NameInMap("PubEndpoint")
        private String pubEndpoint;

        @com.aliyun.core.annotation.NameInMap("VpcEndpoint")
        private String vpcEndpoint;

        @com.aliyun.core.annotation.NameInMap("internalId")
        private String internalId;

        private ConfluentInstanceComponentVO(Builder builder) {
            this.componentType = builder.componentType;
            this.deployModule = builder.deployModule;
            this.pubEndpoint = builder.pubEndpoint;
            this.vpcEndpoint = builder.vpcEndpoint;
            this.internalId = builder.internalId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfluentInstanceComponentVO create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return deployModule
         */
        public String getDeployModule() {
            return this.deployModule;
        }

        /**
         * @return pubEndpoint
         */
        public String getPubEndpoint() {
            return this.pubEndpoint;
        }

        /**
         * @return vpcEndpoint
         */
        public String getVpcEndpoint() {
            return this.vpcEndpoint;
        }

        /**
         * @return internalId
         */
        public String getInternalId() {
            return this.internalId;
        }

        public static final class Builder {
            private String componentType; 
            private String deployModule; 
            private String pubEndpoint; 
            private String vpcEndpoint; 
            private String internalId; 

            private Builder() {
            } 

            private Builder(ConfluentInstanceComponentVO model) {
                this.componentType = model.componentType;
                this.deployModule = model.deployModule;
                this.pubEndpoint = model.pubEndpoint;
                this.vpcEndpoint = model.vpcEndpoint;
                this.internalId = model.internalId;
            } 

            /**
             * ComponentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * DeployModule.
             */
            public Builder deployModule(String deployModule) {
                this.deployModule = deployModule;
                return this;
            }

            /**
             * PubEndpoint.
             */
            public Builder pubEndpoint(String pubEndpoint) {
                this.pubEndpoint = pubEndpoint;
                return this;
            }

            /**
             * VpcEndpoint.
             */
            public Builder vpcEndpoint(String vpcEndpoint) {
                this.vpcEndpoint = vpcEndpoint;
                return this;
            }

            /**
             * internalId.
             */
            public Builder internalId(String internalId) {
                this.internalId = internalId;
                return this;
            }

            public ConfluentInstanceComponentVO build() {
                return new ConfluentInstanceComponentVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceListResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceListResponseBody</p>
     */
    public static class ConfluentInstanceComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfluentInstanceComponentVO")
        private java.util.List<ConfluentInstanceComponentVO> confluentInstanceComponentVO;

        private ConfluentInstanceComponents(Builder builder) {
            this.confluentInstanceComponentVO = builder.confluentInstanceComponentVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfluentInstanceComponents create() {
            return builder().build();
        }

        /**
         * @return confluentInstanceComponentVO
         */
        public java.util.List<ConfluentInstanceComponentVO> getConfluentInstanceComponentVO() {
            return this.confluentInstanceComponentVO;
        }

        public static final class Builder {
            private java.util.List<ConfluentInstanceComponentVO> confluentInstanceComponentVO; 

            private Builder() {
            } 

            private Builder(ConfluentInstanceComponents model) {
                this.confluentInstanceComponentVO = model.confluentInstanceComponentVO;
            } 

            /**
             * ConfluentInstanceComponentVO.
             */
            public Builder confluentInstanceComponentVO(java.util.List<ConfluentInstanceComponentVO> confluentInstanceComponentVO) {
                this.confluentInstanceComponentVO = confluentInstanceComponentVO;
                return this;
            }

            public ConfluentInstanceComponents build() {
                return new ConfluentInstanceComponents(this);
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
             * Key.
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

        @com.aliyun.core.annotation.NameInMap("MinorVersion")
        private String minorVersion;

        private UpgradeServiceDetailInfo(Builder builder) {
            this.current2OpenSourceVersion = builder.current2OpenSourceVersion;
            this.minorVersion = builder.minorVersion;
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

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public static final class Builder {
            private String current2OpenSourceVersion; 
            private String minorVersion; 

            private Builder() {
            } 

            private Builder(UpgradeServiceDetailInfo model) {
                this.current2OpenSourceVersion = model.current2OpenSourceVersion;
                this.minorVersion = model.minorVersion;
            } 

            /**
             * Current2OpenSourceVersion.
             */
            public Builder current2OpenSourceVersion(String current2OpenSourceVersion) {
                this.current2OpenSourceVersion = current2OpenSourceVersion;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
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

        @com.aliyun.core.annotation.NameInMap("ConfluentInstanceComponents")
        private ConfluentInstanceComponents confluentInstanceComponents;

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

        @com.aliyun.core.annotation.NameInMap("RecommendedPartitionCount")
        private Integer recommendedPartitionCount;

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

        @com.aliyun.core.annotation.NameInMap("ScheduledRetirement")
        private Boolean scheduledRetirement;

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
            this.confluentInstanceComponents = builder.confluentInstanceComponents;
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
            this.recommendedPartitionCount = builder.recommendedPartitionCount;
            this.regionId = builder.regionId;
            this.reservedPublishCapacity = builder.reservedPublishCapacity;
            this.reservedSubscribeCapacity = builder.reservedSubscribeCapacity;
            this.resourceGroupId = builder.resourceGroupId;
            this.saslDomainEndpoint = builder.saslDomainEndpoint;
            this.saslEndPoint = builder.saslEndPoint;
            this.scheduledRetirement = builder.scheduledRetirement;
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
         * @return confluentInstanceComponents
         */
        public ConfluentInstanceComponents getConfluentInstanceComponents() {
            return this.confluentInstanceComponents;
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
         * @return recommendedPartitionCount
         */
        public Integer getRecommendedPartitionCount() {
            return this.recommendedPartitionCount;
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
         * @return scheduledRetirement
         */
        public Boolean getScheduledRetirement() {
            return this.scheduledRetirement;
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
            private ConfluentInstanceComponents confluentInstanceComponents; 
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
            private Integer recommendedPartitionCount; 
            private String regionId; 
            private Integer reservedPublishCapacity; 
            private Integer reservedSubscribeCapacity; 
            private String resourceGroupId; 
            private String saslDomainEndpoint; 
            private String saslEndPoint; 
            private Boolean scheduledRetirement; 
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
                this.confluentInstanceComponents = model.confluentInstanceComponents;
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
                this.recommendedPartitionCount = model.recommendedPartitionCount;
                this.regionId = model.regionId;
                this.reservedPublishCapacity = model.reservedPublishCapacity;
                this.reservedSubscribeCapacity = model.reservedSubscribeCapacity;
                this.resourceGroupId = model.resourceGroupId;
                this.saslDomainEndpoint = model.saslDomainEndpoint;
                this.saslEndPoint = model.saslEndPoint;
                this.scheduledRetirement = model.scheduledRetirement;
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
             * AllConfig.
             */
            public Builder allConfig(String allConfig) {
                this.allConfig = allConfig;
                return this;
            }

            /**
             * AutoCreateGroupEnable.
             */
            public Builder autoCreateGroupEnable(Boolean autoCreateGroupEnable) {
                this.autoCreateGroupEnable = autoCreateGroupEnable;
                return this;
            }

            /**
             * AutoCreateTopicEnable.
             */
            public Builder autoCreateTopicEnable(Boolean autoCreateTopicEnable) {
                this.autoCreateTopicEnable = autoCreateTopicEnable;
                return this;
            }

            /**
             * BackupZoneId.
             */
            public Builder backupZoneId(String backupZoneId) {
                this.backupZoneId = backupZoneId;
                return this;
            }

            /**
             * ConfluentConfig.
             */
            public Builder confluentConfig(ConfluentConfig confluentConfig) {
                this.confluentConfig = confluentConfig;
                return this;
            }

            /**
             * ConfluentInstanceComponents.
             */
            public Builder confluentInstanceComponents(ConfluentInstanceComponents confluentInstanceComponents) {
                this.confluentInstanceComponents = confluentInstanceComponents;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultPartitionNum.
             */
            public Builder defaultPartitionNum(Integer defaultPartitionNum) {
                this.defaultPartitionNum = defaultPartitionNum;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * DiskSize.
             */
            public Builder diskSize(Integer diskSize) {
                this.diskSize = diskSize;
                return this;
            }

            /**
             * DiskType.
             */
            public Builder diskType(Integer diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * DomainEndpoint.
             */
            public Builder domainEndpoint(String domainEndpoint) {
                this.domainEndpoint = domainEndpoint;
                return this;
            }

            /**
             * EipMax.
             */
            public Builder eipMax(Integer eipMax) {
                this.eipMax = eipMax;
                return this;
            }

            /**
             * EndPoint.
             */
            public Builder endPoint(String endPoint) {
                this.endPoint = endPoint;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IoMax.
             */
            public Builder ioMax(Integer ioMax) {
                this.ioMax = ioMax;
                return this;
            }

            /**
             * IoMaxRead.
             */
            public Builder ioMaxRead(Integer ioMaxRead) {
                this.ioMaxRead = ioMaxRead;
                return this;
            }

            /**
             * IoMaxSpec.
             */
            public Builder ioMaxSpec(String ioMaxSpec) {
                this.ioMaxSpec = ioMaxSpec;
                return this;
            }

            /**
             * IoMaxWrite.
             */
            public Builder ioMaxWrite(Integer ioMaxWrite) {
                this.ioMaxWrite = ioMaxWrite;
                return this;
            }

            /**
             * KmsKeyId.
             */
            public Builder kmsKeyId(String kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            /**
             * MsgRetain.
             */
            public Builder msgRetain(Integer msgRetain) {
                this.msgRetain = msgRetain;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PaidType.
             */
            public Builder paidType(Integer paidType) {
                this.paidType = paidType;
                return this;
            }

            /**
             * RecommendedPartitionCount.
             */
            public Builder recommendedPartitionCount(Integer recommendedPartitionCount) {
                this.recommendedPartitionCount = recommendedPartitionCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReservedPublishCapacity.
             */
            public Builder reservedPublishCapacity(Integer reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * ReservedSubscribeCapacity.
             */
            public Builder reservedSubscribeCapacity(Integer reservedSubscribeCapacity) {
                this.reservedSubscribeCapacity = reservedSubscribeCapacity;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SaslDomainEndpoint.
             */
            public Builder saslDomainEndpoint(String saslDomainEndpoint) {
                this.saslDomainEndpoint = saslDomainEndpoint;
                return this;
            }

            /**
             * SaslEndPoint.
             */
            public Builder saslEndPoint(String saslEndPoint) {
                this.saslEndPoint = saslEndPoint;
                return this;
            }

            /**
             * ScheduledRetirement.
             */
            public Builder scheduledRetirement(Boolean scheduledRetirement) {
                this.scheduledRetirement = scheduledRetirement;
                return this;
            }

            /**
             * SecurityGroup.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(String series) {
                this.series = series;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            /**
             * SpecType.
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * SslDomainEndpoint.
             */
            public Builder sslDomainEndpoint(String sslDomainEndpoint) {
                this.sslDomainEndpoint = sslDomainEndpoint;
                return this;
            }

            /**
             * SslEndPoint.
             */
            public Builder sslEndPoint(String sslEndPoint) {
                this.sslEndPoint = sslEndPoint;
                return this;
            }

            /**
             * StandardZoneId.
             */
            public Builder standardZoneId(String standardZoneId) {
                this.standardZoneId = standardZoneId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TopicNumLimit.
             */
            public Builder topicNumLimit(Integer topicNumLimit) {
                this.topicNumLimit = topicNumLimit;
                return this;
            }

            /**
             * UpgradeServiceDetailInfo.
             */
            public Builder upgradeServiceDetailInfo(UpgradeServiceDetailInfo upgradeServiceDetailInfo) {
                this.upgradeServiceDetailInfo = upgradeServiceDetailInfo;
                return this;
            }

            /**
             * UsedGroupCount.
             */
            public Builder usedGroupCount(Integer usedGroupCount) {
                this.usedGroupCount = usedGroupCount;
                return this;
            }

            /**
             * UsedPartitionCount.
             */
            public Builder usedPartitionCount(Integer usedPartitionCount) {
                this.usedPartitionCount = usedPartitionCount;
                return this;
            }

            /**
             * UsedTopicCount.
             */
            public Builder usedTopicCount(Integer usedTopicCount) {
                this.usedTopicCount = usedTopicCount;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * ViewInstanceStatusCode.
             */
            public Builder viewInstanceStatusCode(Integer viewInstanceStatusCode) {
                this.viewInstanceStatusCode = viewInstanceStatusCode;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcSaslDomainEndpoint.
             */
            public Builder vpcSaslDomainEndpoint(String vpcSaslDomainEndpoint) {
                this.vpcSaslDomainEndpoint = vpcSaslDomainEndpoint;
                return this;
            }

            /**
             * VpcSaslEndPoint.
             */
            public Builder vpcSaslEndPoint(String vpcSaslEndPoint) {
                this.vpcSaslEndPoint = vpcSaslEndPoint;
                return this;
            }

            /**
             * ZoneId.
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
