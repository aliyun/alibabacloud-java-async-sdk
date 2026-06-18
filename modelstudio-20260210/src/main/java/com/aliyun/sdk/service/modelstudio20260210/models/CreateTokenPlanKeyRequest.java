// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link CreateTokenPlanKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateTokenPlanKeyRequest</p>
 */
public class CreateTokenPlanKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateTokenPlanKeyRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.description = builder.description;
        this.namespaceId = builder.namespaceId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTokenPlanKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTokenPlanKeyRequest, Builder> {
        private String accountId; 
        private String callerUacAccountId; 
        private String description; 
        private String namespaceId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTokenPlanKeyRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.callerUacAccountId = request.callerUacAccountId;
            this.description = request.description;
            this.namespaceId = request.namespaceId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acc_123456789</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putQueryParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_123456789</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTokenPlanKeyRequest build() {
            return new CreateTokenPlanKeyRequest(this);
        } 

    } 

}
