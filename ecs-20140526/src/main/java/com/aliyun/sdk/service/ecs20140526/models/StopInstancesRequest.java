// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstancesRequest} extends {@link RequestModel}
 *
 * <p>StopInstancesRequest</p>
 */
public class StopInstancesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ForceStop")
    private Boolean forceStop;

    @Query
    @NameInMap("StoppedMode")
    private String stoppedMode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("BatchOptimization")
    private String batchOptimization;

    private StopInstancesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.forceStop = builder.forceStop;
        this.stoppedMode = builder.stoppedMode;
        this.instanceId = builder.instanceId;
        this.batchOptimization = builder.batchOptimization;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return batchOptimization
     */
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public static final class Builder extends Request.Builder<StopInstancesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Boolean dryRun; 
        private String regionId; 
        private Boolean forceStop; 
        private String stoppedMode; 
        private java.util.List < String > instanceId; 
        private String batchOptimization; 

        private Builder() {
            super();
        } 

        private Builder(StopInstancesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.forceStop = request.forceStop;
            this.stoppedMode = request.stoppedMode;
            this.instanceId = request.instanceId;
            this.batchOptimization = request.batchOptimization;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request and does not stop the instance. Check items include required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, "DRYRUN.SUCCESS" is returned ".
         * > If the "BatchOptimization" parameter is set to "SuccessFirst", only "DryRun. SUCCESS" is returned for the PreCheck result of "DRYRUN = true ".
         * 
         * -false: Sends a normal request and stops the instance after passing the check.
         * 
         * Default value: false
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The region of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Indicates whether to force shutdown. Valid values:
         * <p>
         * 
         * -true: forced shutdown. This is equivalent to a typical power-off operation. All cached data that is not written to the storage device will be lost.
         * 
         * -false: the instance is powered off.
         * 
         * Default value: false
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * The stop mode that you set when you stop a pay-as-you-go ECS instance. Valid values:
         * <p>
         * 
         * -StopCharging: reduces downtime. For more information about the conditions for "StopCharging" to take effect, see The enable conditions section of [pay-as-you-go instance shutdown mode](~~ 63353 ~~).
         * -KeepCharging: normal shutdown mode. The instance continues to be billed after it is stopped.
         * 
         * default value: if you enable the VPC instance shutdown mode in the ECS console (For more information, see [enable default shutdown mode](~~ 63353#default ~~)) and meet the enabling conditions, the default value is "StopCharging ". Otherwise, the default value is keepcharging ".
         */
        public Builder stoppedMode(String stoppedMode) {
            this.putQueryParameter("StoppedMode", stoppedMode);
            this.stoppedMode = stoppedMode;
            return this;
        }

        /**
         * The list of instance IDs.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Set the batch operation mode. Valid values:
         * <p>
         * 
         * -AllTogether: in this mode, if all instances are stopped successfully, a success message is returned. If any instance fails the verification, all instances fail to be stopped and a failure message is returned.
         * 
         * -SuccessFirst: in this mode, each instance is stopped. The returned results include the operation results of each instance.
         * 
         * Default value: AllTogether
         */
        public Builder batchOptimization(String batchOptimization) {
            this.putQueryParameter("BatchOptimization", batchOptimization);
            this.batchOptimization = batchOptimization;
            return this;
        }

        @Override
        public StopInstancesRequest build() {
            return new StopInstancesRequest(this);
        } 

    } 

}
