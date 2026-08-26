// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link DisableTrustedOriginRequest} extends {@link RequestModel}
 *
 * <p>DisableTrustedOriginRequest</p>
 */
public class DisableTrustedOriginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustedOriginId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String trustedOriginId;

    private DisableTrustedOriginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.trustedOriginId = builder.trustedOriginId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableTrustedOriginRequest create() {
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
     * @return trustedOriginId
     */
    public String getTrustedOriginId() {
        return this.trustedOriginId;
    }

    public static final class Builder extends Request.Builder<DisableTrustedOriginRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String trustedOriginId; 

        private Builder() {
            super();
        } 

        private Builder(DisableTrustedOriginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.trustedOriginId = request.trustedOriginId;
        } 

        /**
         * <p>资源所属地域ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_example</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>可信来源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>to_example</p>
         */
        public Builder trustedOriginId(String trustedOriginId) {
            this.putQueryParameter("TrustedOriginId", trustedOriginId);
            this.trustedOriginId = trustedOriginId;
            return this;
        }

        @Override
        public DisableTrustedOriginRequest build() {
            return new DisableTrustedOriginRequest(this);
        } 

    } 

}
