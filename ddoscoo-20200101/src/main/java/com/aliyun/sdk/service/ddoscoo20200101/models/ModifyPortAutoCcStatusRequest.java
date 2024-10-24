// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The mode of the Intelligent Protection policy. Valid values:</p>
         * <ul>
         * <li><strong>normal</strong></li>
         * <li><strong>loose</strong></li>
         * <li><strong>strict</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>Specifies the status of the Intelligent Protection policy. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables the policy.</li>
         * <li><strong>off</strong>: disables the policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
