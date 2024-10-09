// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    private java.util.List < String > instanceId;

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
    public java.util.List < String > getInstanceId() {
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
        private java.util.List < String > instanceId; 
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
         * <li>AllTogether: In this mode, if all instances are stopped, a success message is returned. If an instance fails the verification, all instances fail to stop and an error message is returned.</li>
         * <li>SuccessFirst: In this mode, each instance is separately stopped. The response contains the operation results for each instance.</li>
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, <code>DRYRUN.SUCCESS</code> is returned.</li>
         * </ul>
         * <blockquote>
         * <p> If you set <code>BatchOptimization</code> to <code>SuccessFirst</code> and <code>DryRun</code> to true, only <code>DRYRUN.SUCCESS</code> is returned, regardless of whether the request passes the dry run.</p>
         * </blockquote>
         * <ul>
         * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, instances are stopped.</li>
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
         * <p>Specifies whether to forcefully stop instances. Valid values:</p>
         * <ul>
         * <li>true. This operation is equivalent to the typical power-off operation. Cache data that is not written to storage devices on instances is lost.</li>
         * <li>false.</li>
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
         * <p>The IDs of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp67acfmxazb4p****</p>
         */
        public Builder instanceId(java.util.List < String > instanceId) {
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
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The stop mode of the pay-as-you-go instance. Valid values:</p>
         * <ul>
         * <li>StopCharging: economical mode. For information about how <code>StopCharging</code> takes effect, see the &quot;Prerequisites&quot; section in <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</li>
         * <li>KeepCharging: standard mode. After the instance is stopped in standard mode, you continue to be charged for it.</li>
         * </ul>
         * <p>Default value: If the prerequisites required for enabling economical mode are met and you have enabled the mode in the ECS console, the default value is <a href="~~63353#default~~">StopCharging</a>. For more information, see the &quot;Enable economical mode&quot; section in <code>Economical mode</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
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
