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
 * {@link ObtainCloudAccountRoleAccessCredentialRequest} extends {@link RequestModel}
 *
 * <p>ObtainCloudAccountRoleAccessCredentialRequest</p>
 */
public class ObtainCloudAccountRoleAccessCredentialRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cloudAccountRoleExternalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudAccountRoleExternalId;

    private ObtainCloudAccountRoleAccessCredentialRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.cloudAccountRoleExternalId = builder.cloudAccountRoleExternalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObtainCloudAccountRoleAccessCredentialRequest create() {
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
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return cloudAccountRoleExternalId
     */
    public String getCloudAccountRoleExternalId() {
        return this.cloudAccountRoleExternalId;
    }

    public static final class Builder extends Request.Builder<ObtainCloudAccountRoleAccessCredentialRequest, Builder> {
        private String instanceId; 
        private String authorization; 
        private String cloudAccountRoleExternalId; 

        private Builder() {
            super();
        } 

        private Builder(ObtainCloudAccountRoleAccessCredentialRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.cloudAccountRoleExternalId = request.cloudAccountRoleExternalId;
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
         * <p>acs:ram::xxx:role/role-test</p>
         */
        public Builder cloudAccountRoleExternalId(String cloudAccountRoleExternalId) {
            this.putQueryParameter("cloudAccountRoleExternalId", cloudAccountRoleExternalId);
            this.cloudAccountRoleExternalId = cloudAccountRoleExternalId;
            return this;
        }

        @Override
        public ObtainCloudAccountRoleAccessCredentialRequest build() {
            return new ObtainCloudAccountRoleAccessCredentialRequest(this);
        } 

    } 

}
