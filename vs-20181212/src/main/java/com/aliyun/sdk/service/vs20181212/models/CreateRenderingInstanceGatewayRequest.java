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
 * {@link CreateRenderingInstanceGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateRenderingInstanceGatewayRequest</p>
 */
public class CreateRenderingInstanceGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private CreateRenderingInstanceGatewayRequest(Builder builder) {
        super(builder);
        this.gatewayInstanceId = builder.gatewayInstanceId;
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingInstanceGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayInstanceId
     */
    public String getGatewayInstanceId() {
        return this.gatewayInstanceId;
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public static final class Builder extends Request.Builder<CreateRenderingInstanceGatewayRequest, Builder> {
        private String gatewayInstanceId; 
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRenderingInstanceGatewayRequest request) {
            super(request);
            this.gatewayInstanceId = request.gatewayInstanceId;
            this.renderingInstanceId = request.renderingInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>render-xxx</p>
         */
        public Builder gatewayInstanceId(String gatewayInstanceId) {
            this.putQueryParameter("GatewayInstanceId", gatewayInstanceId);
            this.gatewayInstanceId = gatewayInstanceId;
            return this;
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

        @Override
        public CreateRenderingInstanceGatewayRequest build() {
            return new CreateRenderingInstanceGatewayRequest(this);
        } 

    } 

}
