// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link RescaleApplicationVerticallyRequest} extends {@link RequestModel}
 *
 * <p>RescaleApplicationVerticallyRequest</p>
 */
public class RescaleApplicationVerticallyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Deploy")
    private Boolean deploy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private String diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("autoEnableApplicationScalingRule")
    private Boolean autoEnableApplicationScalingRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("minReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("minReadyInstances")
    private Integer minReadyInstances;

    private RescaleApplicationVerticallyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cpu = builder.cpu;
        this.deploy = builder.deploy;
        this.diskSize = builder.diskSize;
        this.memory = builder.memory;
        this.resourceType = builder.resourceType;
        this.vSwitchId = builder.vSwitchId;
        this.autoEnableApplicationScalingRule = builder.autoEnableApplicationScalingRule;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RescaleApplicationVerticallyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return cpu
     */
    public String getCpu() {
        return this.cpu;
    }

    /**
     * @return deploy
     */
    public Boolean getDeploy() {
        return this.deploy;
    }

    /**
     * @return diskSize
     */
    public String getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return autoEnableApplicationScalingRule
     */
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    /**
     * @return minReadyInstanceRatio
     */
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    /**
     * @return minReadyInstances
     */
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public static final class Builder extends Request.Builder<RescaleApplicationVerticallyRequest, Builder> {
        private String appId; 
        private String cpu; 
        private Boolean deploy; 
        private String diskSize; 
        private String memory; 
        private String resourceType; 
        private String vSwitchId; 
        private Boolean autoEnableApplicationScalingRule; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 

        private Builder() {
            super();
        } 

        private Builder(RescaleApplicationVerticallyRequest request) {
            super(request);
            this.appId = request.appId;
            this.cpu = request.cpu;
            this.deploy = request.deploy;
            this.diskSize = request.diskSize;
            this.memory = request.memory;
            this.resourceType = request.resourceType;
            this.vSwitchId = request.vSwitchId;
            this.autoEnableApplicationScalingRule = request.autoEnableApplicationScalingRule;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
        } 

        /**
         * <p>The app ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Target CPU specification. Unit: millicore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder cpu(String cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * Deploy.
         */
        public Builder deploy(Boolean deploy) {
            this.putQueryParameter("Deploy", deploy);
            this.deploy = deploy;
            return this;
        }

        /**
         * <p>The disk size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder diskSize(String diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>Target memory specification. Unit: MB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder memory(String memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Enable application scale rules automatically.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
            this.putQueryParameter("autoEnableApplicationScalingRule", autoEnableApplicationScalingRule);
            this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
            return this;
        }

        /**
         * <p>The ratio of minimum ready instances.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("minReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * <p>Minimum ready instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("minReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        @Override
        public RescaleApplicationVerticallyRequest build() {
            return new RescaleApplicationVerticallyRequest(this);
        } 

    } 

}
