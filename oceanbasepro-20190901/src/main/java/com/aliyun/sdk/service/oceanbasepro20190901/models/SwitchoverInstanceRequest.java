// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchoverInstanceRequest} extends {@link RequestModel}
 *
 * <p>SwitchoverInstanceRequest</p>
 */
public class SwitchoverInstanceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Forced")
    private Boolean forced;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    private String targetInstanceId;

    private SwitchoverInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.forced = builder.forced;
        this.instanceId = builder.instanceId;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchoverInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return forced
     */
    public Boolean getForced() {
        return this.forced;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<SwitchoverInstanceRequest, Builder> {
        private String regionId; 
        private Boolean forced; 
        private String instanceId; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchoverInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.forced = request.forced;
            this.instanceId = request.instanceId;
            this.targetInstanceId = request.targetInstanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Whether to force the switchover.
         * <p>
         * - true: Force the switchover.
         * - false: Do not force the switchover.
         */
        public Builder forced(Boolean forced) {
            this.putBodyParameter("Forced", forced);
            this.forced = forced;
            return this;
        }

        /**
         * The instance ID of the primary/standby instance. You can set the default value to the instance ID of the instance to be switched to the primary instance.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The instance ID of the instance to be switched to the primary instance.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putBodyParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public SwitchoverInstanceRequest build() {
            return new SwitchoverInstanceRequest(this);
        } 

    } 

}
