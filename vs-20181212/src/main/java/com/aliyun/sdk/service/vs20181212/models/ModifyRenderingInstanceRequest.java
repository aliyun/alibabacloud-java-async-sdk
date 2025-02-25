// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ModifyRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyRenderingInstanceRequest</p>
 */
public class ModifyRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingSpec")
    private String renderingSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private String storageSize;

    private ModifyRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
        this.renderingSpec = builder.renderingSpec;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRenderingInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return renderingSpec
     */
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    /**
     * @return storageSize
     */
    public String getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<ModifyRenderingInstanceRequest, Builder> {
        private String renderingInstanceId; 
        private String renderingSpec; 
        private String storageSize; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRenderingInstanceRequest request) {
            super(request);
            this.renderingInstanceId = request.renderingInstanceId;
            this.renderingSpec = request.renderingSpec;
            this.storageSize = request.storageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * RenderingSpec.
         */
        public Builder renderingSpec(String renderingSpec) {
            this.putQueryParameter("RenderingSpec", renderingSpec);
            this.renderingSpec = renderingSpec;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(String storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public ModifyRenderingInstanceRequest build() {
            return new ModifyRenderingInstanceRequest(this);
        } 

    } 

}
