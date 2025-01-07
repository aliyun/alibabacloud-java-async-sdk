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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EncryptedInstance.
         */
        public Builder encryptedInstance(Boolean encryptedInstance) {
            this.putQueryParameter("EncryptedInstance", encryptedInstance);
            this.encryptedInstance = encryptedInstance;
            return this;
        }

        /**
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * KmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putQueryParameter("KmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * MaxConnections.
         */
        public Builder maxConnections(Integer maxConnections) {
            this.putQueryParameter("MaxConnections", maxConnections);
            this.maxConnections = maxConnections;
            return this;
        }

        /**
         * MaxEipTps.
         */
        public Builder maxEipTps(Long maxEipTps) {
            this.putQueryParameter("MaxEipTps", maxEipTps);
            this.maxEipTps = maxEipTps;
            return this;
        }

        /**
         * MaxPrivateTps.
         */
        public Builder maxPrivateTps(Long maxPrivateTps) {
            this.putQueryParameter("MaxPrivateTps", maxPrivateTps);
            this.maxPrivateTps = maxPrivateTps;
            return this;
        }

        /**
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
         * QueueCapacity.
         */
        public Builder queueCapacity(Integer queueCapacity) {
            this.putQueryParameter("QueueCapacity", queueCapacity);
            this.queueCapacity = queueCapacity;
            return this;
        }

        /**
         * ServerlessChargeType.
         */
        public Builder serverlessChargeType(String serverlessChargeType) {
            this.putQueryParameter("ServerlessChargeType", serverlessChargeType);
            this.serverlessChargeType = serverlessChargeType;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Integer storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * SupportEip.
         */
        public Builder supportEip(Boolean supportEip) {
            this.putQueryParameter("SupportEip", supportEip);
            this.supportEip = supportEip;
            return this;
        }

        /**
         * SupportTracing.
         */
        public Builder supportTracing(Boolean supportTracing) {
            this.putQueryParameter("SupportTracing", supportTracing);
            this.supportTracing = supportTracing;
            return this;
        }

        /**
         * TracingStorageTime.
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
