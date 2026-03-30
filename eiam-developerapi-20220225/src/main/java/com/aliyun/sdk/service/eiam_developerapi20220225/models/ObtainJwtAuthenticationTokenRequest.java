// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ObtainJwtAuthenticationTokenRequest} extends {@link RequestModel}
 *
 * <p>ObtainJwtAuthenticationTokenRequest</p>
 */
public class ObtainJwtAuthenticationTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authenticationTokenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authenticationTokenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    private ObtainJwtAuthenticationTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.authenticationTokenId = builder.authenticationTokenId;
        this.consumerId = builder.consumerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainJwtAuthenticationTokenRequest create() {
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
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return authenticationTokenId
     */
    public String getAuthenticationTokenId() {
        return this.authenticationTokenId;
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    public static final class Builder extends Request.Builder<ObtainJwtAuthenticationTokenRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private String authenticationTokenId; 
        private String consumerId; 

        private Builder() {
            super();
        } 

        private Builder(ObtainJwtAuthenticationTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.authenticationTokenId = request.authenticationTokenId;
            this.consumerId = request.consumerId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bearer xxxxxx</p>
         */
        public Builder authorization(String authorization) {
            this.putHeaderParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atntkn_01kqflm0sxxx8nmdc1cb5dskxxxxx</p>
         */
        public Builder authenticationTokenId(String authenticationTokenId) {
            this.putBodyParameter("authenticationTokenId", authenticationTokenId);
            this.authenticationTokenId = authenticationTokenId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_jwt_subject</p>
         */
        public Builder consumerId(String consumerId) {
            this.putBodyParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        @Override
        public ObtainJwtAuthenticationTokenRequest build() {
            return new ObtainJwtAuthenticationTokenRequest(this);
        } 

    } 

}
