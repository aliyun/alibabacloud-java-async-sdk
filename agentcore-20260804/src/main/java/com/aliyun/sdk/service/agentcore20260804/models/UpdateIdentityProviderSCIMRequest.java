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
         * <p>The ID of the target workspace. This parameter is required. The request region must be the same as the region of the target workspace.</p>
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
         * <p>Submits the business parameters as described in this API. The body parameters of the public API are mapped to the backend wrapper by the gateway. Do not mix them with the backend direct connection body wrapper.</p>
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
             * <p>Specifies whether to enable synchronization. Do not set this parameter to true during CustomSSO initialization. You can only update this parameter by calling UpdateIdentityProviderSCIM later. Determine the result based on the operationStatus field.</p>
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
