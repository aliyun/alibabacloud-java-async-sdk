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
 * {@link EnableInternalAuthenticationSourceRequest} extends {@link RequestModel}
 *
 * <p>EnableInternalAuthenticationSourceRequest</p>
 */
public class EnableInternalAuthenticationSourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationSourceId")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String authenticationSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private EnableInternalAuthenticationSourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authenticationSourceId = builder.authenticationSourceId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInternalAuthenticationSourceRequest create() {
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
     * @return authenticationSourceId
     */
    public String getAuthenticationSourceId() {
        return this.authenticationSourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<EnableInternalAuthenticationSourceRequest, Builder> {
        private String regionId; 
        private String authenticationSourceId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(EnableInternalAuthenticationSourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authenticationSourceId = request.authenticationSourceId;
            this.instanceId = request.instanceId;
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
         * <p>内部认证源ID，比如 ia_password, ia_otp_sms 等</p>
         * 
         * <strong>example:</strong>
         * <p>ia_password</p>
         */
        public Builder authenticationSourceId(String authenticationSourceId) {
            this.putQueryParameter("AuthenticationSourceId", authenticationSourceId);
            this.authenticationSourceId = authenticationSourceId;
            return this;
        }

        /**
         * <p>IDaaS EIAM的实例id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_111ccc11xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public EnableInternalAuthenticationSourceRequest build() {
            return new EnableInternalAuthenticationSourceRequest(this);
        } 

    } 

}
