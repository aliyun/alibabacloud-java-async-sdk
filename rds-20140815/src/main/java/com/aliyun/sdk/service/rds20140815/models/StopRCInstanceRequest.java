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
 * {@link StopRCInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopRCInstanceRequest</p>
 */
public class StopRCInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoppedMode")
    private String stoppedMode;

    private StopRCInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.stoppedMode = builder.stoppedMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopRCInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stoppedMode
     */
    public String getStoppedMode() {
        return this.stoppedMode;
    }

    public static final class Builder extends Request.Builder<StopRCInstanceRequest, Builder> {
        private Boolean forceStop; 
        private String instanceId; 
        private String regionId; 
        private String stoppedMode; 

        private Builder() {
            super();
        } 

        private Builder(StopRCInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.stoppedMode = request.stoppedMode;
        } 

        /**
         * <p>Specifies whether to forcefully stop the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Forcefully stops the instance.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Gracefully stops the instance.</p>
         * </li>
         * </ul>
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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-m5sc1271fv344a1r****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The stop mode of the instance. Valid values:</p>
         * <ul>
         * <li><p>StopCharging: economical mode. After economical mode is enabled:</p>
         * <ul>
         * <li>Billing for compute resources is suspended.</li>
         * <li>Billing for system cloud disks and data cloud disks continues.</li>
         * <li>Because compute resources are released, the instance may fail to start due to insufficient resources. Try again later or change the instance type.</li>
         * </ul>
         * </li>
         * <li><p>KeepCharging: standard mode. Billing continues after the instance is stopped.</p>
         * </li>
         * </ul>
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
        public StopRCInstanceRequest build() {
            return new StopRCInstanceRequest(this);
        } 

    } 

}
