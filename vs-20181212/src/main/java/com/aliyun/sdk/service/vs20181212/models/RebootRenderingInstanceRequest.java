// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootRenderingInstanceRequest</p>
 */
public class RebootRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private RebootRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootRenderingInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RebootRenderingInstanceRequest, Builder> {
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RebootRenderingInstanceRequest request) {
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
        public RebootRenderingInstanceRequest build() {
            return new RebootRenderingInstanceRequest(this);
        } 

    } 

}
