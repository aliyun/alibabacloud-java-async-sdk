// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleInstanceRequest} extends {@link RequestModel}
 *
 * <p>ScaleInstanceRequest</p>
 */
public class ScaleInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("coldStorageSize")
    private Long coldStorageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Long cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableServerlessComputing")
    private Boolean enableServerlessComputing;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gatewayCount")
    private Long gatewayCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scaleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scaleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storageSize")
    private Long storageSize;

    private ScaleInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.coldStorageSize = builder.coldStorageSize;
        this.cpu = builder.cpu;
        this.enableServerlessComputing = builder.enableServerlessComputing;
        this.gatewayCount = builder.gatewayCount;
        this.scaleType = builder.scaleType;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return coldStorageSize
     */
    public Long getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return enableServerlessComputing
     */
    public Boolean getEnableServerlessComputing() {
        return this.enableServerlessComputing;
    }

    /**
     * @return gatewayCount
     */
    public Long getGatewayCount() {
        return this.gatewayCount;
    }

    /**
     * @return scaleType
     */
    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<ScaleInstanceRequest, Builder> {
        private String instanceId; 
        private Long coldStorageSize; 
        private Long cpu; 
        private Boolean enableServerlessComputing; 
        private Long gatewayCount; 
        private String scaleType; 
        private Long storageSize; 

        private Builder() {
            super();
        } 

        private Builder(ScaleInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.coldStorageSize = request.coldStorageSize;
            this.cpu = request.cpu;
            this.enableServerlessComputing = request.enableServerlessComputing;
            this.gatewayCount = request.gatewayCount;
            this.scaleType = request.scaleType;
            this.storageSize = request.storageSize;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The infrequent access (IA) storage space of the instance. Unit: GB.
         * <p>
         * 
         * > Ignore this parameter for pay-as-you-go instances.
         */
        public Builder coldStorageSize(Long coldStorageSize) {
            this.putBodyParameter("coldStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * The specifications of the instance. Valid values:
         * <p>
         * 
         * *   8-core 32GB (number of compute nodes: 1)
         * *   16-core 64GB (number of compute nodes: 1)
         * *   32-core 128GB (number of compute nodes: 2)
         * *   64-core 256GB (number of compute nodes: 4)
         * *   96-core 384GB (number of compute nodes: 6)
         * *   128-core 512GB (number of compute nodes: 8)
         * *   Others
         * 
         * > 
         * 
         * *   Set this parameter to the number of cores.
         * 
         * *   If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.
         * 
         * *   This parameter is invalid for Hologres Shared Cluster instances.
         * 
         * *   The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * enableServerlessComputing.
         */
        public Builder enableServerlessComputing(Boolean enableServerlessComputing) {
            this.putBodyParameter("enableServerlessComputing", enableServerlessComputing);
            this.enableServerlessComputing = enableServerlessComputing;
            return this;
        }

        /**
         * The number of gateways. Valid values: 2 to 50.
         * <p>
         * 
         * > This parameter is required only for virtual warehouse instances.
         */
        public Builder gatewayCount(Long gatewayCount) {
            this.putBodyParameter("gatewayCount", gatewayCount);
            this.gatewayCount = gatewayCount;
            return this;
        }

        /**
         * The specification change type. Valid values:
         * <p>
         * 
         * *   UPGRADE
         * *   DOWNGRADE
         * 
         * > 
         * 
         * *   If you set this parameter to UPGRADE, the new specifications must be higher than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.
         * 
         * *   If you set this parameter to DOWNGRADE, the new specifications must be lower than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.
         */
        public Builder scaleType(String scaleType) {
            this.putBodyParameter("scaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * The standard storage space of the instance. Unit: GB.
         * <p>
         * 
         * > Ignore this parameter for pay-as-you-go instances.
         */
        public Builder storageSize(Long storageSize) {
            this.putBodyParameter("storageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public ScaleInstanceRequest build() {
            return new ScaleInstanceRequest(this);
        } 

    } 

}
