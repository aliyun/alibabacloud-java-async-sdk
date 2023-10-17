// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleInstanceRequest} extends {@link RequestModel}
 *
 * <p>ScaleInstanceRequest</p>
 */
public class ScaleInstanceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("coldStorageSize")
    private Long coldStorageSize;

    @Body
    @NameInMap("cpu")
    private Long cpu;

    @Body
    @NameInMap("gatewayCount")
    private Long gatewayCount;

    @Body
    @NameInMap("scaleType")
    @Validation(required = true)
    private String scaleType;

    @Body
    @NameInMap("storageSize")
    private Long storageSize;

    private ScaleInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.coldStorageSize = builder.coldStorageSize;
        this.cpu = builder.cpu;
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
         * > This parameter is invalid for pay-as-you-go instances.
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
         * *   8-core 32 GB (number of compute Nodes: 1)
         * *   16-core 64 GB (number of compute nodes: 1)
         * *   32-core 128 GB (number of compute nodes: 2)
         * *   64-core 256 GB (number of compute nodes: 4)
         * *   96-core 384 GB (number of compute nodes: 6)
         * *   128-core 512 GB (number of compute nodes: 8)
         * *   Others
         * 
         * > 
         * 
         * *   Set this parameter to the number of cores.
         * 
         * *   If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.
         * 
         * *   This parameter is invalid for shared instances.
         * 
         * *   The specifications of 8-core 32 GB (number of compute nodes: 1) are for trial use only and cannot be used for production.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * gatewayCount.
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
         * > This parameter is invalid for pay-as-you-go instances.
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
