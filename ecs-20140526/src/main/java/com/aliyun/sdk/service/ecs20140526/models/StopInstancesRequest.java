// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link StopInstancesRequest} extends {@link RequestModel}
 *
 * <p>StopInstancesRequest</p>
 */
public class StopInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOptimization")
    private String batchOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    private StopInstancesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.batchOptimization = builder.batchOptimization;
        this.dryRun = builder.dryRun;
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.stoppedMode = builder.stoppedMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return batchOptimization
     */
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceId
     */
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public static final class Builder extends Request.Builder<StopInstancesRequest, Builder> {
        private String sourceRegionId; 
        private String batchOptimization; 
        private Boolean dryRun; 
        private Boolean forceStop; 
        private java.util.List<String> instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String stoppedMode; 

        private Builder() {
            super();
        } 

        private Builder(StopInstancesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.batchOptimization = request.batchOptimization;
            this.dryRun = request.dryRun;
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.stoppedMode = request.stoppedMode;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The batch operation mode. Valid values:</p>
         * <ul>
         * <li><p>AllTogether: all operations must succeed for the entire batch operation to be considered successful. If any operation fails, the entire batch operation fails and all executed operations are rolled back to the pre-operation state.</p>
         * </li>
         * <li><p>SuccessFirst: each operation in the batch is executed independently. If an operation fails, other operations can still be executed and confirmed as successful. Successful operations are committed, and failed operations are marked as failed without affecting the results of other operations.</p>
         * </li>
         * </ul>
         * <p>Default value: AllTogether.</p>
         * 
         * <strong>example:</strong>
         * <p>AllTogether</p>
         */
        public Builder batchOptimization(String batchOptimization) {
            this.putQueryParameter("BatchOptimization", batchOptimization);
            this.batchOptimization = batchOptimization;
            return this;
        }

        /**
         * <p>Specifies whether to send a dry run request. Valid values:</p>
         * <ul>
         * <li><p>true: sends a dry run request without stopping the instances. The system checks the required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, <code>DRYRUN.SUCCESS</code> is returned.</p>
         * <blockquote>
         * <p>If the <code>BatchOptimization</code> parameter is set to <code>SuccessFirst</code>, the dry run result for <code>DryRun=true</code> returns only <code>DRYRUN.SUCCESS</code>.</p>
         * </blockquote>
         * </li>
         * <li><p>false: sends a normal request. After the request passes the check, the instances are stopped.</p>
         * </li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully stop the instances. Valid values:</p>
         * <ul>
         * <li>true: forcefully stops the instances.<blockquote>
         * <p>Warning: A forced stop is equivalent to a power-off. Data that is not written to disks in the instance operating system may be lost. Proceed with caution.</p>
         * </blockquote>
         * </li>
         * <li>false: normally stops the instances.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * <p>The instance IDs. Array length: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The region ID of the instances. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The stop mode. Valid values:</p>
         * <ul>
         * <li><p>StopCharging: economical mode. After economical mode is enabled:</p>
         * <ul>
         * <li>Billing for compute resources (vCPUs, memory, and GPUs), image license fees, and fixed bandwidth of static public IP addresses is suspended.</li>
         * <li>Billing for system disks, data disks, and fixed bandwidth of Elastic IP Addresses (EIPs) continues.</li>
         * <li>Because compute resources are released, the instance may fail to restart due to insufficient resources. Try again later or change the instance type.</li>
         * <li>If an EIP is associated with the instance before it is stopped, the IP address remains unchanged after the instance is restarted. Otherwise, the static public IP address may change, but the private IP address remains unchanged.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
         * <blockquote>
         * <p>Notice:</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>If the instance does not support economical mode, the API does not return an error. Stopping the instance takes priority. Instance types that do not support economical mode include instances with local SSDs and subscription instances.</p>
         * <ul>
         * <li>KeepCharging: standard stop mode. After the instance is stopped, its resources are retained and billing continues. The instance type inventory and public IP address are also retained. If you stop the instance to replace the operating system, reinitialize a disk, change the instance type, or modify the private IP address, select this mode to avoid restart failures.</li>
         * </ul>
         * <p>Default value: If you <a href="~~63353#default~~">enable economical mode for VPC-connected instances</a> and the conditions are met, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>KeepCharging</p>
         */
        public Builder stoppedMode(String stoppedMode) {
            this.putQueryParameter("StoppedMode", stoppedMode);
            this.stoppedMode = stoppedMode;
            return this;
        }

        @Override
        public StopInstancesRequest build() {
            return new StopInstancesRequest(this);
        } 

    } 

}
