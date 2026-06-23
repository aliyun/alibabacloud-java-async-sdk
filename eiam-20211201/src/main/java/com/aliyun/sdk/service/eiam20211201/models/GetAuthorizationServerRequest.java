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
 * {@link GetAuthorizationServerRequest} extends {@link RequestModel}
 *
 * <p>GetAuthorizationServerRequest</p>
 */
public class GetAuthorizationServerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationServerId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String authorizationServerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private GetAuthorizationServerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.authorizationServerId = builder.authorizationServerId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationServerRequest create() {
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
     * @return authorizationServerId
     */
    public String getAuthorizationServerId() {
        return this.authorizationServerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetAuthorizationServerRequest, Builder> {
        private String regionId; 
        private String authorizationServerId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthorizationServerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.authorizationServerId = request.authorizationServerId;
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
         * <p>IDaaS的授权服务器资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder authorizationServerId(String authorizationServerId) {
            this.putQueryParameter("AuthorizationServerId", authorizationServerId);
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetAuthorizationServerRequest build() {
            return new GetAuthorizationServerRequest(this);
        } 

    } 

}
