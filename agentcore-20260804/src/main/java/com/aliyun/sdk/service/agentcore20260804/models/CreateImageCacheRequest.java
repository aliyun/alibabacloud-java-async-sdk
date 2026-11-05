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
 * {@link CreateImageCacheRequest} extends {@link RequestModel}
 *
 * <p>CreateImageCacheRequest</p>
 */
public class CreateImageCacheRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateImageCacheRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateImageCacheRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public CreateImageCacheRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateImageCacheRequest, Builder> {
        private CreateImageCacheRequestBody body; 
        private String clientToken; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageCacheRequest request) {
            super(request);
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The request body for creating an image cache.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(CreateImageCacheRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The non-empty request token passed as a query parameter. The current implementation does not guarantee deduplication by this token or recovery of the original acceptance result.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The product entry region, passed as a query parameter. It must match the selected region endpoint and the workspace region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-example</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateImageCacheRequest build() {
            return new CreateImageCacheRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateImageCacheRequest} extends {@link TeaModel}
     *
     * <p>CreateImageCacheRequest</p>
     */
    public static class CreateImageCacheRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessInternet")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean accessInternet;

        @com.aliyun.core.annotation.NameInMap("accessVpc")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean accessVpc;

        @com.aliyun.core.annotation.NameInMap("acrInstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String acrInstanceId;

        @com.aliyun.core.annotation.NameInMap("namespace")
        @com.aliyun.core.annotation.Validation(required = true)
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("repository")
        @com.aliyun.core.annotation.Validation(required = true)
        private String repository;

        @com.aliyun.core.annotation.NameInMap("tag")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tag;

        private CreateImageCacheRequestBody(Builder builder) {
            this.accessInternet = builder.accessInternet;
            this.accessVpc = builder.accessVpc;
            this.acrInstanceId = builder.acrInstanceId;
            this.namespace = builder.namespace;
            this.repository = builder.repository;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateImageCacheRequestBody create() {
            return builder().build();
        }

        /**
         * @return accessInternet
         */
        public Boolean getAccessInternet() {
            return this.accessInternet;
        }

        /**
         * @return accessVpc
         */
        public Boolean getAccessVpc() {
            return this.accessVpc;
        }

        /**
         * @return acrInstanceId
         */
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return repository
         */
        public String getRepository() {
            return this.repository;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Boolean accessInternet; 
            private Boolean accessVpc; 
            private String acrInstanceId; 
            private String namespace; 
            private String repository; 
            private String tag; 

            private Builder() {
            } 

            private Builder(CreateImageCacheRequestBody model) {
                this.accessInternet = model.accessInternet;
                this.accessVpc = model.accessVpc;
                this.acrInstanceId = model.acrInstanceId;
                this.namespace = model.namespace;
                this.repository = model.repository;
                this.tag = model.tag;
            } 

            /**
             * <p>Specifies whether to allow public network access for the current source reading and transfer. At least one of this parameter and <code>accessVpc</code> must be set to true. The server validates the access conditions of the current workspace.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder accessInternet(Boolean accessInternet) {
                this.accessInternet = accessInternet;
                return this;
            }

            /**
             * <p>Specifies whether to allow the use of a VPC for the current source reading and transfer. At least one of this parameter and <code>accessInternet</code> must be set to true. The server resolves the trusted network of the current workspace and does not modify the runtime network of the agent.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder accessVpc(Boolean accessVpc) {
                this.accessVpc = accessVpc;
                return this;
            }

            /**
             * <p>The ID of the source ACR Enterprise instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-example</p>
             */
            public Builder acrInstanceId(String acrInstanceId) {
                this.acrInstanceId = acrInstanceId;
                return this;
            }

            /**
             * <p>The namespace of the source ACR.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the repository under the namespace. Do not include the namespace in the repository name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder repository(String repository) {
                this.repository = repository;
                return this;
            }

            /**
             * <p>The selected tag of the source image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public CreateImageCacheRequestBody build() {
                return new CreateImageCacheRequestBody(this);
            } 

        } 

    }
}
