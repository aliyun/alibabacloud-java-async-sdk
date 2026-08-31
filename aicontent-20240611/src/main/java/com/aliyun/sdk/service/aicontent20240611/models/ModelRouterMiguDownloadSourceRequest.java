// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterMiguDownloadSourceRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterMiguDownloadSourceRequest</p>
 */
public class ModelRouterMiguDownloadSourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    private ModelRouterMiguDownloadSourceRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterMiguDownloadSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<ModelRouterMiguDownloadSourceRequest, Builder> {
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterMiguDownloadSourceRequest request) {
            super(request);
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3f2a1b9c8d7e4f60a1b2c3d4e5f6a7b8</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public ModelRouterMiguDownloadSourceRequest build() {
            return new ModelRouterMiguDownloadSourceRequest(this);
        } 

    } 

}
