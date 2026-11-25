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
 * {@link UpgradeRenderingServerImageRequest} extends {@link RequestModel}
 *
 * <p>UpgradeRenderingServerImageRequest</p>
 */
public class UpgradeRenderingServerImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Precheck")
    private Boolean precheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> renderingInstanceIds;

    private UpgradeRenderingServerImageRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.precheck = builder.precheck;
        this.renderingInstanceIds = builder.renderingInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeRenderingServerImageRequest create() {
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
     * @return precheck
     */
    public Boolean getPrecheck() {
        return this.precheck;
    }

    /**
     * @return renderingInstanceIds
     */
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

    public static final class Builder extends Request.Builder<UpgradeRenderingServerImageRequest, Builder> {
        private String imageId; 
        private Boolean precheck; 
        private java.util.List<String> renderingInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeRenderingServerImageRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.precheck = request.precheck;
            this.renderingInstanceIds = request.renderingInstanceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-9timxhrrgopkec8ju</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Precheck.
         */
        public Builder precheck(Boolean precheck) {
            this.putQueryParameter("Precheck", precheck);
            this.precheck = precheck;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;render-30d593fb042946c58568316956624c6b&quot;]</p>
         */
        public Builder renderingInstanceIds(java.util.List<String> renderingInstanceIds) {
            String renderingInstanceIdsShrink = shrink(renderingInstanceIds, "RenderingInstanceIds", "json");
            this.putQueryParameter("RenderingInstanceIds", renderingInstanceIdsShrink);
            this.renderingInstanceIds = renderingInstanceIds;
            return this;
        }

        @Override
        public UpgradeRenderingServerImageRequest build() {
            return new UpgradeRenderingServerImageRequest(this);
        } 

    } 

}
