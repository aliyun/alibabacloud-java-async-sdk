// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPortAutoCcStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyPortAutoCcStatusRequest</p>
 */
public class ModifyPortAutoCcStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Switch")
    @Validation(required = true)
    private String _switch;

    private ModifyPortAutoCcStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return _switch
     */
    public String get_switch() {
        return this._switch;
    }

    public static final class Builder extends Request.Builder<ModifyPortAutoCcStatusRequest, Builder> {
        private String instanceId; 
        private String mode; 
        private String regionId; 
        private String _switch; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPortAutoCcStatusRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.mode = response.mode;
            this.regionId = response.regionId;
            this._switch = response._switch;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
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
         * Switch.
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
