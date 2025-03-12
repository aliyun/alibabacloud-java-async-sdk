// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link SwitchoverInstanceRequest} extends {@link RequestModel}
 *
 * <p>SwitchoverInstanceRequest</p>
 */
public class SwitchoverInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Forced")
    private Boolean forced;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Whether to force the switchover.</p>
         * <ul>
         * <li>true: Force the switchover.</li>
         * <li>false: Do not force the switchover.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forced(Boolean forced) {
            this.putBodyParameter("Forced", forced);
            this.forced = forced;
            return this;
        }

        /**
         * <p>The instance ID of the primary/standby instance. You can set the default value to the instance ID of the instance to be switched to the primary instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob317v4uif****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance ID of the instance to be switched to the primary instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ob4bv8o7sp****</p>
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
