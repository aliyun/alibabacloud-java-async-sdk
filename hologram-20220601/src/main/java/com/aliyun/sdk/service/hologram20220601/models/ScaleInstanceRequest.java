// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
         * <blockquote>
         * <p>Ignore this parameter for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000G</p>
         */
        public Builder coldStorageSize(Long coldStorageSize) {
            this.putBodyParameter("coldStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>The specifications of the instance. Valid values:</p>
         * <ul>
         * <li>8-core 32GB (number of compute nodes: 1)</li>
         * <li>16-core 64GB (number of compute nodes: 1)</li>
         * <li>32-core 128GB (number of compute nodes: 2)</li>
         * <li>64-core 256GB (number of compute nodes: 4)</li>
         * <li>96-core 384GB (number of compute nodes: 6)</li>
         * <li>128-core 512GB (number of compute nodes: 8)</li>
         * <li>Others</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Set this parameter to the number of cores.</p>
         * </li>
         * <li><p>If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.</p>
         * </li>
         * <li><p>This parameter is invalid for Hologres Shared Cluster instances.</p>
         * </li>
         * <li><p>The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>是否开启ServerlessComputing</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableServerlessComputing(Boolean enableServerlessComputing) {
            this.putBodyParameter("enableServerlessComputing", enableServerlessComputing);
            this.enableServerlessComputing = enableServerlessComputing;
            return this;
        }

        /**
         * <p>The number of gateways. Valid values: 2 to 50.</p>
         * <blockquote>
         * <p>This parameter is required only for virtual warehouse instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder gatewayCount(Long gatewayCount) {
            this.putBodyParameter("gatewayCount", gatewayCount);
            this.gatewayCount = gatewayCount;
            return this;
        }

        /**
         * <p>The specification change type. Valid values:</p>
         * <ul>
         * <li>UPGRADE</li>
         * <li>DOWNGRADE</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set this parameter to UPGRADE, the new specifications must be higher than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
         * </li>
         * <li><p>If you set this parameter to DOWNGRADE, the new specifications must be lower than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UPGRADE</p>
         */
        public Builder scaleType(String scaleType) {
            this.putBodyParameter("scaleType", scaleType);
            this.scaleType = scaleType;
            return this;
        }

        /**
         * <p>The standard storage space of the instance. Unit: GB.</p>
         * <blockquote>
         * <p>Ignore this parameter for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000G</p>
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
