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
 * {@link DeleteRenderingInstanceGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteRenderingInstanceGatewayRequest</p>
 */
public class DeleteRenderingInstanceGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    private DeleteRenderingInstanceGatewayRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRenderingInstanceGatewayRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteRenderingInstanceGatewayRequest, Builder> {
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRenderingInstanceGatewayRequest request) {
            super(request);
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.putQueryParameter("RenderingInstanceId", renderingInstanceId);
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        @Override
        public DeleteRenderingInstanceGatewayRequest build() {
            return new DeleteRenderingInstanceGatewayRequest(this);
        } 

    } 

}
