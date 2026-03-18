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
 * {@link ReinstateAuthenticationTokenByConsumerRequest} extends {@link RequestModel}
 *
 * <p>ReinstateAuthenticationTokenByConsumerRequest</p>
 */
public class ReinstateAuthenticationTokenByConsumerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("consumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialProviderIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialProviderIdentifier;

    private ReinstateAuthenticationTokenByConsumerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.consumerId = builder.consumerId;
        this.credentialProviderIdentifier = builder.credentialProviderIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinstateAuthenticationTokenByConsumerRequest create() {
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
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return credentialProviderIdentifier
     */
    public String getCredentialProviderIdentifier() {
        return this.credentialProviderIdentifier;
    }

    public static final class Builder extends Request.Builder<ReinstateAuthenticationTokenByConsumerRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String authorization; 
        private String consumerId; 
        private String credentialProviderIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ReinstateAuthenticationTokenByConsumerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.consumerId = request.consumerId;
            this.credentialProviderIdentifier = request.credentialProviderIdentifier;
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
         * <p>test_jwt_subject</p>
         */
        public Builder consumerId(String consumerId) {
            this.putBodyParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_example_identifier</p>
         */
        public Builder credentialProviderIdentifier(String credentialProviderIdentifier) {
            this.putBodyParameter("credentialProviderIdentifier", credentialProviderIdentifier);
            this.credentialProviderIdentifier = credentialProviderIdentifier;
            return this;
        }

        @Override
        public ReinstateAuthenticationTokenByConsumerRequest build() {
            return new ReinstateAuthenticationTokenByConsumerRequest(this);
        } 

    } 

}
