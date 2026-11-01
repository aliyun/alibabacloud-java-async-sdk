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
 * {@link UpdateAccessApplicationRequest} extends {@link RequestModel}
 *
 * <p>UpdateAccessApplicationRequest</p>
 */
public class UpdateAccessApplicationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("applicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateAccessApplicationRequestBody body;

    private UpdateAccessApplicationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.applicationId = builder.applicationId;
        this.regionId = builder.regionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAccessApplicationRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public UpdateAccessApplicationRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAccessApplicationRequest, Builder> {
        private String workspaceId; 
        private String applicationId; 
        private String regionId; 
        private UpdateAccessApplicationRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAccessApplicationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.applicationId = request.applicationId;
            this.regionId = request.regionId;
            this.body = request.body;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1234567890</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The access application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1234567890</p>
         */
        public Builder applicationId(String applicationId) {
            this.putPathParameter("applicationId", applicationId);
            this.applicationId = applicationId;
            return this;
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
         * <p>The request body for updating the access application.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateAccessApplicationRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAccessApplicationRequest build() {
            return new UpdateAccessApplicationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAccessApplicationRequest} extends {@link TeaModel}
     *
     * <p>UpdateAccessApplicationRequest</p>
     */
    public static class UpdateAccessApplicationRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("applicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("redirectUris")
        private java.util.List<String> redirectUris;

        private UpdateAccessApplicationRequestBody(Builder builder) {
            this.applicationName = builder.applicationName;
            this.redirectUris = builder.redirectUris;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateAccessApplicationRequestBody create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return redirectUris
         */
        public java.util.List<String> getRedirectUris() {
            return this.redirectUris;
        }

        public static final class Builder {
            private String applicationName; 
            private java.util.List<String> redirectUris; 

            private Builder() {
            } 

            private Builder(UpdateAccessApplicationRequestBody model) {
                this.applicationName = model.applicationName;
                this.redirectUris = model.redirectUris;
            } 

            /**
             * <p>The name of the access application.</p>
             * 
             * <strong>example:</strong>
             * <p>my-access-application</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The list of redirect URIs.</p>
             */
            public Builder redirectUris(java.util.List<String> redirectUris) {
                this.redirectUris = redirectUris;
                return this;
            }

            public UpdateAccessApplicationRequestBody build() {
                return new UpdateAccessApplicationRequestBody(this);
            } 

        } 

    }
}
