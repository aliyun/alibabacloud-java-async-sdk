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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("durationSeconds")
    private Integer durationSeconds;

    private ObtainCloudAccountRoleAccessCredentialRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.authorization = builder.authorization;
        this.cloudAccountRoleExternalId = builder.cloudAccountRoleExternalId;
        this.durationSeconds = builder.durationSeconds;
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

    /**
     * @return durationSeconds
     */
    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public static final class Builder extends Request.Builder<ObtainCloudAccountRoleAccessCredentialRequest, Builder> {
        private String instanceId; 
        private String authorization; 
        private String cloudAccountRoleExternalId; 
        private Integer durationSeconds; 

        private Builder() {
            super();
        } 

        private Builder(ObtainCloudAccountRoleAccessCredentialRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.authorization = request.authorization;
            this.cloudAccountRoleExternalId = request.cloudAccountRoleExternalId;
            this.durationSeconds = request.durationSeconds;
        } 

        /**
         * <p>The instance ID.</p>
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
         * <p>The authentication information. Format: Bearer ${access_token}. </p>
         * <blockquote>
         * <p>Enter the Access Token issued by IDaaS.</p>
         * </blockquote>
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
         * <p>The business identifier of the cloud account role.</p>
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

        /**
         * <p>Specifies the validity duration of the temporary security credentials (STS Token) for the cloud account role, in seconds. Valid values: 900 to 43200 (15 minutes to 12 hours).
         * Constraints:</p>
         * <ul>
         * <li>The minimum value cannot be less than 900 seconds.</li>
         * <li>The maximum value is subject to the maximum session duration limit of the cloud provider role or service account. For example, the default maximum session limit for an AWS role is 3600 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        public Builder durationSeconds(Integer durationSeconds) {
            this.putQueryParameter("durationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        @Override
        public ObtainCloudAccountRoleAccessCredentialRequest build() {
            return new ObtainCloudAccountRoleAccessCredentialRequest(this);
        } 

    } 

}
