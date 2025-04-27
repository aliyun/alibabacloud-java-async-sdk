// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptedInstance")
    private Boolean encryptedInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConnections")
    private Integer maxConnections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxEipTps")
    private Long maxEipTps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxPrivateTps")
    private Long maxPrivateTps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueCapacity")
    private Integer queueCapacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessChargeType")
    private String serverlessChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Integer storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportEip")
    private Boolean supportEip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportTracing")
    private Boolean supportTracing;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TracingStorageTime")
    private Integer tracingStorageTime;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.encryptedInstance = builder.encryptedInstance;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.kmsKeyId = builder.kmsKeyId;
        this.maxConnections = builder.maxConnections;
        this.maxEipTps = builder.maxEipTps;
        this.maxPrivateTps = builder.maxPrivateTps;
        this.modifyType = builder.modifyType;
        this.queueCapacity = builder.queueCapacity;
        this.serverlessChargeType = builder.serverlessChargeType;
        this.storageSize = builder.storageSize;
        this.supportEip = builder.supportEip;
        this.supportTracing = builder.supportTracing;
        this.tracingStorageTime = builder.tracingStorageTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return encryptedInstance
     */
    public Boolean getEncryptedInstance() {
        return this.encryptedInstance;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return maxConnections
     */
    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * @return maxEipTps
     */
    public Long getMaxEipTps() {
        return this.maxEipTps;
    }

    /**
     * @return maxPrivateTps
     */
    public Long getMaxPrivateTps() {
        return this.maxPrivateTps;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return queueCapacity
     */
    public Integer getQueueCapacity() {
        return this.queueCapacity;
    }

    /**
     * @return serverlessChargeType
     */
    public String getServerlessChargeType() {
        return this.serverlessChargeType;
    }

    /**
     * @return storageSize
     */
    public Integer getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return supportEip
     */
    public Boolean getSupportEip() {
        return this.supportEip;
    }

    /**
     * @return supportTracing
     */
    public Boolean getSupportTracing() {
        return this.supportTracing;
    }

    /**
     * @return tracingStorageTime
     */
    public Integer getTracingStorageTime() {
        return this.tracingStorageTime;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Boolean encryptedInstance; 
        private String instanceId; 
        private String instanceType; 
        private String kmsKeyId; 
        private Integer maxConnections; 
        private Long maxEipTps; 
        private Long maxPrivateTps; 
        private String modifyType; 
        private Integer queueCapacity; 
        private String serverlessChargeType; 
        private Integer storageSize; 
        private Boolean supportEip; 
        private Boolean supportTracing; 
        private Integer tracingStorageTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.encryptedInstance = request.encryptedInstance;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.kmsKeyId = request.kmsKeyId;
            this.maxConnections = request.maxConnections;
            this.maxEipTps = request.maxEipTps;
            this.maxPrivateTps = request.maxPrivateTps;
            this.modifyType = request.modifyType;
            this.queueCapacity = request.queueCapacity;
            this.serverlessChargeType = request.serverlessChargeType;
            this.storageSize = request.storageSize;
            this.supportEip = request.supportEip;
            this.supportTracing = request.supportTracing;
            this.tracingStorageTime = request.tracingStorageTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>c2c5d1274axxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>实例是否开通数据存储加密功能</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder encryptedInstance(Boolean encryptedInstance) {
            this.putQueryParameter("EncryptedInstance", encryptedInstance);
            this.encryptedInstance = encryptedInstance;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-jtexxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance edition. Valid values for subscription instances:</p>
         * <ul>
         * <li>professional: Professional Edition</li>
         * <li>enterprise: Enterprise Edition</li>
         * <li>vip: Enterprise Platinum Edition.</li>
         * </ul>
         * <p>If your instance is a pay-as-you-go instance, you do not need to configure this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>使用同地域下KMS密钥ID</p>
         * 
         * <strong>example:</strong>
         * <p>key-bjj66c2a893vmhawtq5fd</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The maximum number of connections that can be created on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxConnections(Integer maxConnections) {
            this.putQueryParameter("MaxConnections", maxConnections);
            this.maxConnections = maxConnections;
            return this;
        }

        /**
         * <p>The peak TPS for accessing the instance over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder maxEipTps(Long maxEipTps) {
            this.putQueryParameter("MaxEipTps", maxEipTps);
            this.maxEipTps = maxEipTps;
            return this;
        }

        /**
         * <p>The peak transactions per second (TPS) for accessing the instance in a virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder maxPrivateTps(Long maxPrivateTps) {
            this.putQueryParameter("MaxPrivateTps", maxPrivateTps);
            this.maxPrivateTps = maxPrivateTps;
            return this;
        }

        /**
         * <p>The type of the configuration change. Valid values:</p>
         * <ul>
         * <li>UPGRADE</li>
         * <li>DOWNGRADE</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * <p>The maximum number of queues that can be created on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder queueCapacity(Integer queueCapacity) {
            this.putQueryParameter("QueueCapacity", queueCapacity);
            this.queueCapacity = queueCapacity;
            return this;
        }

        /**
         * <p>The billing method of the serverless instance. Valid values:</p>
         * <ul>
         * <li>onDemand: You are charged based on your actual usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onDemand</p>
         */
        public Builder serverlessChargeType(String serverlessChargeType) {
            this.putQueryParameter("ServerlessChargeType", serverlessChargeType);
            this.serverlessChargeType = serverlessChargeType;
            return this;
        }

        /**
         * <p>The size of the storage space that can be used to store messages.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder storageSize(Integer storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * <p>Specifies whether elastic IP addresses (EIPs) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder supportEip(Boolean supportEip) {
            this.putQueryParameter("SupportEip", supportEip);
            this.supportEip = supportEip;
            return this;
        }

        /**
         * <p>Specifies whether to enable the message trace feature.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder supportTracing(Boolean supportTracing) {
            this.putQueryParameter("SupportTracing", supportTracing);
            this.supportTracing = supportTracing;
            return this;
        }

        /**
         * <p>The retention period of message traces.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>3</li>
         * <li>7</li>
         * <li>15</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder tracingStorageTime(Integer tracingStorageTime) {
            this.putQueryParameter("TracingStorageTime", tracingStorageTime);
            this.tracingStorageTime = tracingStorageTime;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

}
