// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link RunUserPoolSyncJobRequest} extends {@link RequestModel}
 *
 * <p>RunUserPoolSyncJobRequest</p>
 */
public class RunUserPoolSyncJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityProviderType")
    private String identityProviderType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxSyncUsers")
    private String maxSyncUsers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private RunUserPoolSyncJobRequest(Builder builder) {
        super(builder);
        this.identityProviderType = builder.identityProviderType;
        this.maxSyncUsers = builder.maxSyncUsers;
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunUserPoolSyncJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identityProviderType
     */
    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * @return maxSyncUsers
     */
    public String getMaxSyncUsers() {
        return this.maxSyncUsers;
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<RunUserPoolSyncJobRequest, Builder> {
        private String identityProviderType; 
        private String maxSyncUsers; 
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(RunUserPoolSyncJobRequest request) {
            super(request);
            this.identityProviderType = request.identityProviderType;
            this.maxSyncUsers = request.maxSyncUsers;
            this.userPoolName = request.userPoolName;
        } 

        /**
         * <p>The identity provider type. Currently, only DingTalk is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        public Builder identityProviderType(String identityProviderType) {
            this.putBodyParameter("IdentityProviderType", identityProviderType);
            this.identityProviderType = identityProviderType;
            return this;
        }

        /**
         * <p>The maximum number of users to synchronize in a single task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxSyncUsers(String maxSyncUsers) {
            this.putBodyParameter("MaxSyncUsers", maxSyncUsers);
            this.maxSyncUsers = maxSyncUsers;
            return this;
        }

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public RunUserPoolSyncJobRequest build() {
            return new RunUserPoolSyncJobRequest(this);
        } 

    } 

}
