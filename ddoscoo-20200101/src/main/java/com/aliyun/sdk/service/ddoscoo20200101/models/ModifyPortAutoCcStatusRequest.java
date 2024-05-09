// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPortAutoCcStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyPortAutoCcStatusRequest</p>
 */
public class ModifyPortAutoCcStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Switch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String _switch;

    private ModifyPortAutoCcStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this._switch = builder._switch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPortAutoCcStatusRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder extends Request.Builder<ModifyPortAutoCcStatusRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String mode; 
        private String _switch; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPortAutoCcStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
            this._switch = request._switch;
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
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The mode of the Intelligent Protection policy. Valid values:
         * <p>
         * 
         * *   **normal**
         * *   **loose**
         * *   **strict**
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * Specifies the status of the Intelligent Protection policy. Valid values:
         * <p>
         * 
         * *   **on**: enables the policy.
         * *   **off**: disables the policy.
         */
        public Builder _switch(String _switch) {
            this.putQueryParameter("Switch", _switch);
            this._switch = _switch;
            return this;
        }

        @Override
        public ModifyPortAutoCcStatusRequest build() {
            return new ModifyPortAutoCcStatusRequest(this);
        } 

    } 

}
