// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRenderingInstanceStreamingInfoRequest} extends {@link RequestModel}
 *
 * <p>GetRenderingInstanceStreamingInfoRequest</p>
 */
public class GetRenderingInstanceStreamingInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private GetRenderingInstanceStreamingInfoRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenderingInstanceStreamingInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetRenderingInstanceStreamingInfoRequest, Builder> {
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRenderingInstanceStreamingInfoRequest request) {
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
        public GetRenderingInstanceStreamingInfoRequest build() {
            return new GetRenderingInstanceStreamingInfoRequest(this);
        } 

    } 

}
