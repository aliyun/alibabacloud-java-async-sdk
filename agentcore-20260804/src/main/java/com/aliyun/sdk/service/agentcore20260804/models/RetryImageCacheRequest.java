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
 * {@link RetryImageCacheRequest} extends {@link RequestModel}
 *
 * <p>RetryImageCacheRequest</p>
 */
public class RetryImageCacheRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private RetryImageCacheRequestBody body;

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

    private RetryImageCacheRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryImageCacheRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return body
     */
    public RetryImageCacheRequestBody getBody() {
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

    public static final class Builder extends Request.Builder<RetryImageCacheRequest, Builder> {
        private String imageId; 
        private RetryImageCacheRequestBody body; 
        private String clientToken; 
        private String regionId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RetryImageCacheRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.body = request.body;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The ID of the cache record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("imageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The request body for retrying image cache creation.</p>
         */
        public Builder body(RetryImageCacheRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>The non-empty request token passed as a query parameter. The current implementation does not guarantee deduplication or recovery of the original acceptance result based on this token.</p>
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
         * <p>The product entry region. This parameter is passed as a query parameter and must be consistent with the selected region endpoint and the workspace region.</p>
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
        public RetryImageCacheRequest build() {
            return new RetryImageCacheRequest(this);
        } 

    } 

    /**
     * 
     * {@link RetryImageCacheRequest} extends {@link TeaModel}
     *
     * <p>RetryImageCacheRequest</p>
     */
    public static class RetryImageCacheRequestBody extends TeaModel {
        private RetryImageCacheRequestBody(Builder builder) {
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryImageCacheRequestBody create() {
            return builder().build();
        }

        public static final class Builder {

            private Builder() {
            } 

            private Builder(RetryImageCacheRequestBody model) {
            } 

            public RetryImageCacheRequestBody build() {
                return new RetryImageCacheRequestBody(this);
            } 

        } 

    }
}
