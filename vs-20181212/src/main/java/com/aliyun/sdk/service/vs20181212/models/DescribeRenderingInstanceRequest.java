// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRenderingInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenderingInstanceRequest</p>
 */
public class DescribeRenderingInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renderingInstanceId;

    private DescribeRenderingInstanceRequest(Builder builder) {
        super(builder);
        this.renderingInstanceId = builder.renderingInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenderingInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRenderingInstanceRequest, Builder> {
        private String renderingInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenderingInstanceRequest request) {
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
        public DescribeRenderingInstanceRequest build() {
            return new DescribeRenderingInstanceRequest(this);
        } 

    } 

}
