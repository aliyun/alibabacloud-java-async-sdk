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
         * <p>The ID of the Hologres instance.</p>
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
         * <p>The infrequent access storage space of the instance. Unit: GB.</p>
         * <blockquote>
         * <p>This parameter is ignored for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder coldStorageSize(Long coldStorageSize) {
            this.putBodyParameter("coldStorageSize", coldStorageSize);
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>The instance specifications. Valid values:</p>
         * <ul>
         * <li>16 cores, 64 GB (Number of compute nodes: 1)</li>
         * <li>32 cores, 128 GB (Number of compute nodes: 2)</li>
         * <li>64 cores, 256 GB (Number of compute nodes: 4)</li>
         * <li>96 cores, 384 GB (Number of compute nodes: 6)</li>
         * <li>128 cores, 512 GB (Number of compute nodes: 8)</li>
         * <li>More</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Specify only the number of cores.</li>
         * <li>To purchase specifications with more than 1,024 cores, submit a ticket.</li>
         * <li>You do not need to specify the specifications for shared instances.</li>
         * </ul>
         * </blockquote>
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
         * <p>Specifies whether to enable serverless computing.</p>
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
         * <p>This parameter is required only for the Warehouse type.</p>
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
         * <p>The type of the specification change. Valid values:</p>
         * <ul>
         * <li>UPGRADE: upgrades the specifications.</li>
         * <li>DOWNGRADE: downgrades the specifications.<blockquote>
         * <ul>
         * <li>When you upgrade the specifications, the new specifications cannot be lower than the original specifications. An empty field indicates that the original specifications remain unchanged. At least one specification must be higher than the original specification.</li>
         * <li>When you downgrade the specifications, the new specifications cannot be higher than the original specifications. An empty field indicates that the original specifications remain unchanged. At least one specification must be lower than the original specification.</li>
         * </ul>
         * </blockquote>
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
         * <p>This parameter is ignored for pay-as-you-go instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
