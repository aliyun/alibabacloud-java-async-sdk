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
 * {@link ModelRouterCopyApiKeyRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCopyApiKeyRequest</p>
 */
public class ModelRouterCopyApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    private ModelRouterCopyApiKeyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCopyApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<ModelRouterCopyApiKeyRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCopyApiKeyRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public ModelRouterCopyApiKeyRequest build() {
            return new ModelRouterCopyApiKeyRequest(this);
        } 

    } 

}
