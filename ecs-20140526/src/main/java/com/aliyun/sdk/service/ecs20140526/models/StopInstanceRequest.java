// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopInstanceRequest</p>
 */
public class StopInstanceRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ConfirmStop")
    private Boolean confirmStop;

    @Query
    @NameInMap("ForceStop")
    private Boolean forceStop;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Hibernate")
    private Boolean hibernate;

    @Query
    @NameInMap("StoppedMode")
    private String stoppedMode;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.confirmStop = builder.confirmStop;
        this.forceStop = builder.forceStop;
        this.dryRun = builder.dryRun;
        this.hibernate = builder.hibernate;
        this.stoppedMode = builder.stoppedMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstanceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return confirmStop
     */
    public Boolean getConfirmStop() {
        return this.confirmStop;
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return hibernate
     */
    public Boolean getHibernate() {
        return this.hibernate;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private Boolean confirmStop; 
        private Boolean forceStop; 
        private Boolean dryRun; 
        private Boolean hibernate; 
        private String stoppedMode; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.confirmStop = request.confirmStop;
            this.forceStop = request.forceStop;
            this.dryRun = request.dryRun;
            this.hibernate = request.hibernate;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * > This parameter is about to be removed. This parameter is temporarily reserved for compatibility improvement. Ignore this parameter when you call this operation.
         */
        public Builder confirmStop(Boolean confirmStop) {
            this.putQueryParameter("ConfirmStop", confirmStop);
            this.confirmStop = confirmStop;
            return this;
        }

        /**
         * Specifies whether to disable the instance. Valid values:
         * <p>
         * 
         * -true: forced shutdown.
         * -false: the shutdown process is normal.
         * 
         * Default value: false.
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * Specifies whether to PreCheck only this request. Valid values:
         * <p>
         * 
         * -true: sends a check request and does not stop the instance. Check items include required parameters, request format, business restrictions, and ECS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the error code "DryRunOperation" is returned ".
         * 
         * -false: sends a normal request and stops the instance after passing the check.
         * 
         * Default value: false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Indicates whether to sleep.
         */
        public Builder hibernate(Boolean hibernate) {
            this.putQueryParameter("Hibernate", hibernate);
            this.hibernate = hibernate;
            return this;
        }

        /**
         * The stop mode that you set when you stop a pay-as-you-go ECS instance. Valid values:
         * <p>
         * 
         * -StopCharging: reduces downtime. For more information about the conditions for "StopCharging" to take effect, see the enable conditions section of [pay-as-you-go instance shutdown mode](~~ 63353 ~~).
         * -KeepCharging: normal shutdown mode. The instance continues to be billed after it is stopped.
         * 
         * default value: if you enable the VPC instance shutdown mode in the ECS console (for more information, see [enable default shutdown mode](~~ 63353#default ~~)) and meet the enabling conditions, the default value is "StopCharging ". Otherwise, the default value is keepcharging ".
         */
        public Builder stoppedMode(String stoppedMode) {
            this.putQueryParameter("StoppedMode", stoppedMode);
            this.stoppedMode = stoppedMode;
            return this;
        }

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
