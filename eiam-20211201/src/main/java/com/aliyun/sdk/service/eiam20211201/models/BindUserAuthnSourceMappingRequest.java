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
 * {@link BindUserAuthnSourceMappingRequest} extends {@link RequestModel}
 *
 * <p>BindUserAuthnSourceMappingRequest</p>
 */
public class BindUserAuthnSourceMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserExternalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private BindUserAuthnSourceMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identityProviderId = builder.identityProviderId;
        this.instanceId = builder.instanceId;
        this.userExternalId = builder.userExternalId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindUserAuthnSourceMappingRequest create() {
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
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return userExternalId
     */
    public String getUserExternalId() {
        return this.userExternalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<BindUserAuthnSourceMappingRequest, Builder> {
        private String regionId; 
        private String identityProviderId; 
        private String instanceId; 
        private String userExternalId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(BindUserAuthnSourceMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identityProviderId = request.identityProviderId;
            this.instanceId = request.instanceId;
            this.userExternalId = request.userExternalId;
            this.userId = request.userId;
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
         * <p>来源Idp Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_mwpcwnhrimlr2horxXXXX</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
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

        /**
         * <p>外部关联ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder userExternalId(String userExternalId) {
            this.putQueryParameter("UserExternalId", userExternalId);
            this.userExternalId = userExternalId;
            return this;
        }

        /**
         * <p>用户ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_fherbdywxxxx</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public BindUserAuthnSourceMappingRequest build() {
            return new BindUserAuthnSourceMappingRequest(this);
        } 

    } 

}
