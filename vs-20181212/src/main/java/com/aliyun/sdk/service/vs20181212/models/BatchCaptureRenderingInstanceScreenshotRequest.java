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
 * {@link BatchCaptureRenderingInstanceScreenshotRequest} extends {@link RequestModel}
 *
 * <p>BatchCaptureRenderingInstanceScreenshotRequest</p>
 */
public class BatchCaptureRenderingInstanceScreenshotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quality")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer quality;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> renderingInstanceIds;

    private BatchCaptureRenderingInstanceScreenshotRequest(Builder builder) {
        super(builder);
        this.quality = builder.quality;
        this.renderingInstanceIds = builder.renderingInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCaptureRenderingInstanceScreenshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quality
     */
    public Integer getQuality() {
        return this.quality;
    }

    /**
     * @return renderingInstanceIds
     */
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

    public static final class Builder extends Request.Builder<BatchCaptureRenderingInstanceScreenshotRequest, Builder> {
        private Integer quality; 
        private java.util.List<String> renderingInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchCaptureRenderingInstanceScreenshotRequest request) {
            super(request);
            this.quality = request.quality;
            this.renderingInstanceIds = request.renderingInstanceIds;
        } 

        /**
         * Quality.
         */
        public Builder quality(Integer quality) {
            this.putQueryParameter("Quality", quality);
            this.quality = quality;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder renderingInstanceIds(java.util.List<String> renderingInstanceIds) {
            String renderingInstanceIdsShrink = shrink(renderingInstanceIds, "RenderingInstanceIds", "json");
            this.putQueryParameter("RenderingInstanceIds", renderingInstanceIdsShrink);
            this.renderingInstanceIds = renderingInstanceIds;
            return this;
        }

        @Override
        public BatchCaptureRenderingInstanceScreenshotRequest build() {
            return new BatchCaptureRenderingInstanceScreenshotRequest(this);
        } 

    } 

}
