// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link UpdateIdentityProviderSCIMRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdentityProviderSCIMRequest</p>
 */
public class UpdateIdentityProviderSCIMRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateIdentityProviderSCIMRequestBody body;

    private UpdateIdentityProviderSCIMRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdentityProviderSCIMRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return body
     */
    public UpdateIdentityProviderSCIMRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateIdentityProviderSCIMRequest, Builder> {
        private String workspaceId; 
        private UpdateIdentityProviderSCIMRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdentityProviderSCIMRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.body = request.body;
        } 

        /**
         * <p>Required. The ID of the destination workspace. The region of the request must be the same as the region of the destination workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The business parameters submitted in the request body. The body parameters of public APIs are mapped to backend wrappers by the gateway and must not be mixed with direct backend body wrappers.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateIdentityProviderSCIMRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateIdentityProviderSCIMRequest build() {
            return new UpdateIdentityProviderSCIMRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIdentityProviderSCIMRequest} extends {@link TeaModel}
     *
     * <p>UpdateIdentityProviderSCIMRequest</p>
     */
    public static class UpdateIdentityProviderSCIMRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("syncEnabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean syncEnabled;

        private UpdateIdentityProviderSCIMRequestBody(Builder builder) {
            this.syncEnabled = builder.syncEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateIdentityProviderSCIMRequestBody create() {
            return builder().build();
        }

        /**
         * @return syncEnabled
         */
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

        public static final class Builder {
            private Boolean syncEnabled; 

            private Builder() {
            } 

            private Builder(UpdateIdentityProviderSCIMRequestBody model) {
                this.syncEnabled = model.syncEnabled;
            } 

            /**
             * <p>Specifies whether to enable SCIM synchronization. Do not set this parameter to true during CustomSSO initialization. You can update this parameter only by calling UpdateIdentityProviderSCIM. Check the operationStatus field to determine the result.</p>
             * <p>This parameter is required.</p>
             */
            public Builder syncEnabled(Boolean syncEnabled) {
                this.syncEnabled = syncEnabled;
                return this;
            }

            public UpdateIdentityProviderSCIMRequestBody build() {
                return new UpdateIdentityProviderSCIMRequestBody(this);
            } 

        } 

    }
}
