// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyComputeBurstConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyComputeBurstConfigRequest</p>
 */
public class ModifyComputeBurstConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstStatus")
    private String burstStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuEnlargeThreshold")
    private String cpuEnlargeThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuShrinkThreshold")
    private String cpuShrinkThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrontabJobId")
    private String crontabJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryEnlargeThreshold")
    private String memoryEnlargeThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemoryShrinkThreshold")
    private String memoryShrinkThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMaxCpus")
    private String scaleMaxCpus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMaxMemory")
    private String scaleMaxMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMaxRcu")
    private Double scaleMaxRcu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMinRcu")
    private Double scaleMinRcu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private String switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTimeMode")
    private String switchTimeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private ModifyComputeBurstConfigRequest(Builder builder) {
        super(builder);
        this.burstStatus = builder.burstStatus;
        this.clientToken = builder.clientToken;
        this.cpuEnlargeThreshold = builder.cpuEnlargeThreshold;
        this.cpuShrinkThreshold = builder.cpuShrinkThreshold;
        this.crontabJobId = builder.crontabJobId;
        this.DBInstanceId = builder.DBInstanceId;
        this.memoryEnlargeThreshold = builder.memoryEnlargeThreshold;
        this.memoryShrinkThreshold = builder.memoryShrinkThreshold;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scaleMaxCpus = builder.scaleMaxCpus;
        this.scaleMaxMemory = builder.scaleMaxMemory;
        this.scaleMaxRcu = builder.scaleMaxRcu;
        this.scaleMinRcu = builder.scaleMinRcu;
        this.switchTime = builder.switchTime;
        this.switchTimeMode = builder.switchTimeMode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyComputeBurstConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return burstStatus
     */
    public String getBurstStatus() {
        return this.burstStatus;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cpuEnlargeThreshold
     */
    public String getCpuEnlargeThreshold() {
        return this.cpuEnlargeThreshold;
    }

    /**
     * @return cpuShrinkThreshold
     */
    public String getCpuShrinkThreshold() {
        return this.cpuShrinkThreshold;
    }

    /**
     * @return crontabJobId
     */
    public String getCrontabJobId() {
        return this.crontabJobId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return memoryEnlargeThreshold
     */
    public String getMemoryEnlargeThreshold() {
        return this.memoryEnlargeThreshold;
    }

    /**
     * @return memoryShrinkThreshold
     */
    public String getMemoryShrinkThreshold() {
        return this.memoryShrinkThreshold;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scaleMaxCpus
     */
    public String getScaleMaxCpus() {
        return this.scaleMaxCpus;
    }

    /**
     * @return scaleMaxMemory
     */
    public String getScaleMaxMemory() {
        return this.scaleMaxMemory;
    }

    /**
     * @return scaleMaxRcu
     */
    public Double getScaleMaxRcu() {
        return this.scaleMaxRcu;
    }

    /**
     * @return scaleMinRcu
     */
    public Double getScaleMinRcu() {
        return this.scaleMinRcu;
    }

    /**
     * @return switchTime
     */
    public String getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return switchTimeMode
     */
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ModifyComputeBurstConfigRequest, Builder> {
        private String burstStatus; 
        private String clientToken; 
        private String cpuEnlargeThreshold; 
        private String cpuShrinkThreshold; 
        private String crontabJobId; 
        private String DBInstanceId; 
        private String memoryEnlargeThreshold; 
        private String memoryShrinkThreshold; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private String scaleMaxCpus; 
        private String scaleMaxMemory; 
        private Double scaleMaxRcu; 
        private Double scaleMinRcu; 
        private String switchTime; 
        private String switchTimeMode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyComputeBurstConfigRequest request) {
            super(request);
            this.burstStatus = request.burstStatus;
            this.clientToken = request.clientToken;
            this.cpuEnlargeThreshold = request.cpuEnlargeThreshold;
            this.cpuShrinkThreshold = request.cpuShrinkThreshold;
            this.crontabJobId = request.crontabJobId;
            this.DBInstanceId = request.DBInstanceId;
            this.memoryEnlargeThreshold = request.memoryEnlargeThreshold;
            this.memoryShrinkThreshold = request.memoryShrinkThreshold;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scaleMaxCpus = request.scaleMaxCpus;
            this.scaleMaxMemory = request.scaleMaxMemory;
            this.scaleMaxRcu = request.scaleMaxRcu;
            this.scaleMinRcu = request.scaleMinRcu;
            this.switchTime = request.switchTime;
            this.switchTimeMode = request.switchTimeMode;
            this.taskId = request.taskId;
        } 

        /**
         * <p>Set this parameter to <strong>disabled</strong> to disable the committed serverless feature.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        public Builder burstStatus(String burstStatus) {
            this.putQueryParameter("BurstStatus", burstStatus);
            this.burstStatus = burstStatus;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCziJZNwH****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The CPU utilization threshold for elastic <strong>scale-out</strong>. Valid values: 60 to 90. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder cpuEnlargeThreshold(String cpuEnlargeThreshold) {
            this.putQueryParameter("CpuEnlargeThreshold", cpuEnlargeThreshold);
            this.cpuEnlargeThreshold = cpuEnlargeThreshold;
            return this;
        }

        /**
         * <p>The CPU utilization threshold for elastic <strong>scale-in</strong>. Valid values: 30 to 55. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder cpuShrinkThreshold(String cpuShrinkThreshold) {
            this.putQueryParameter("CpuShrinkThreshold", cpuShrinkThreshold);
            this.cpuShrinkThreshold = cpuShrinkThreshold;
            return this;
        }

        /**
         * <p>A reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder crontabJobId(String crontabJobId) {
            this.putQueryParameter("CrontabJobId", crontabJobId);
            this.crontabJobId = crontabJobId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-2ze63v2p3o3k****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The memory utilization threshold for elastic <strong>scale-out</strong>. Valid values: 60 to 90. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder memoryEnlargeThreshold(String memoryEnlargeThreshold) {
            this.putQueryParameter("MemoryEnlargeThreshold", memoryEnlargeThreshold);
            this.memoryEnlargeThreshold = memoryEnlargeThreshold;
            return this;
        }

        /**
         * <p>The memory utilization threshold for elastic <strong>scale-in</strong>. Valid values: 30 to 55. Unit: %.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder memoryShrinkThreshold(String memoryShrinkThreshold) {
            this.putQueryParameter("MemoryShrinkThreshold", memoryShrinkThreshold);
            this.memoryShrinkThreshold = memoryShrinkThreshold;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The maximum number of CPUs for elastic scale-out. The value can be up to twice the initial CPU configuration of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleMaxCpus(String scaleMaxCpus) {
            this.putQueryParameter("ScaleMaxCpus", scaleMaxCpus);
            this.scaleMaxCpus = scaleMaxCpus;
            return this;
        }

        /**
         * <p>The maximum memory for elastic scale-out. The value can be up to twice the initial memory configuration of the instance. Unit: GB. The value is adjusted in increments of 2 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder scaleMaxMemory(String scaleMaxMemory) {
            this.putQueryParameter("ScaleMaxMemory", scaleMaxMemory);
            this.scaleMaxMemory = scaleMaxMemory;
            return this;
        }

        /**
         * ScaleMaxRcu.
         */
        public Builder scaleMaxRcu(Double scaleMaxRcu) {
            this.putQueryParameter("ScaleMaxRcu", scaleMaxRcu);
            this.scaleMaxRcu = scaleMaxRcu;
            return this;
        }

        /**
         * ScaleMinRcu.
         */
        public Builder scaleMinRcu(Double scaleMinRcu) {
            this.putQueryParameter("ScaleMinRcu", scaleMinRcu);
            this.scaleMinRcu = scaleMinRcu;
            return this;
        }

        /**
         * <p>The specified time at which the modification takes effect. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code> (UTC).</p>
         * <blockquote>
         * <p>This parameter is required when <strong>SwitchTimeMode</strong> is set to <strong>2</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-05-06T09:24:00Z</p>
         */
        public Builder switchTime(String switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The effective policy. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The modification takes effect immediately.</li>
         * <li><strong>1</strong>: The modification takes effect during the maintenance window. You can call the <strong>ModifyDBInstanceMaintainTime</strong> operation to modify the maintenance window.</li>
         * <li><strong>2</strong>: The modification takes effect at a specified point in time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
         */
        public Builder switchTimeMode(String switchTimeMode) {
            this.putQueryParameter("SwitchTimeMode", switchTimeMode);
            this.switchTimeMode = switchTimeMode;
            return this;
        }

        /**
         * <p>A reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ModifyComputeBurstConfigRequest build() {
            return new ModifyComputeBurstConfigRequest(this);
        } 

    } 

}
