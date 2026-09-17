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
 * {@link UpgradeRenderingInstanceImageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeRenderingInstanceImageRequest</p>
 */
public class UpgradeRenderingInstanceImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> renderingInstanceIds;

    private UpgradeRenderingInstanceImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.renderingInstanceIds = builder.renderingInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeRenderingInstanceImageRequest create() {
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
     * @return renderingInstanceIds
     */
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

    public static final class Builder extends Request.Builder<UpgradeRenderingInstanceImageRequest, Builder> {
        private String imageId; 
        private java.util.List<String> renderingInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeRenderingInstanceImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.renderingInstanceIds = request.renderingInstanceIds;
        } 

        /**
         * <p>The image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp15om9lg9zb20magg86</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The list of cloud application service instance IDs. A maximum of 100 IDs can be specified.</p>
         * <p>This parameter is required.</p>
         */
        public Builder renderingInstanceIds(java.util.List<String> renderingInstanceIds) {
            String renderingInstanceIdsShrink = shrink(renderingInstanceIds, "RenderingInstanceIds", "json");
            this.putQueryParameter("RenderingInstanceIds", renderingInstanceIdsShrink);
            this.renderingInstanceIds = renderingInstanceIds;
            return this;
        }

        @Override
        public UpgradeRenderingInstanceImageRequest build() {
            return new UpgradeRenderingInstanceImageRequest(this);
        } 

    } 

}
