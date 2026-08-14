// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link ProductHotspotDetectionRequest} extends {@link RequestModel}
 *
 * <p>ProductHotspotDetectionRequest</p>
 */
public class ProductHotspotDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReferenceImageUrls")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> referenceImageUrls;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReqId")
    private String reqId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetImageUrl;

    private ProductHotspotDetectionRequest(Builder builder) {
        super(builder);
        this.referenceImageUrls = builder.referenceImageUrls;
        this.reqId = builder.reqId;
        this.targetImageUrl = builder.targetImageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductHotspotDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return referenceImageUrls
     */
    public java.util.List<String> getReferenceImageUrls() {
        return this.referenceImageUrls;
    }

    /**
     * @return reqId
     */
    public String getReqId() {
        return this.reqId;
    }

    /**
     * @return targetImageUrl
     */
    public String getTargetImageUrl() {
        return this.targetImageUrl;
    }

    public static final class Builder extends Request.Builder<ProductHotspotDetectionRequest, Builder> {
        private java.util.List<String> referenceImageUrls; 
        private String reqId; 
        private String targetImageUrl; 

        private Builder() {
            super();
        } 

        private Builder(ProductHotspotDetectionRequest request) {
            super(request);
            this.referenceImageUrls = request.referenceImageUrls;
            this.reqId = request.reqId;
            this.targetImageUrl = request.targetImageUrl;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder referenceImageUrls(java.util.List<String> referenceImageUrls) {
            String referenceImageUrlsShrink = shrink(referenceImageUrls, "ReferenceImageUrls", "json");
            this.putQueryParameter("ReferenceImageUrls", referenceImageUrlsShrink);
            this.referenceImageUrls = referenceImageUrls;
            return this;
        }

        /**
         * ReqId.
         */
        public Builder reqId(String reqId) {
            this.putQueryParameter("ReqId", reqId);
            this.reqId = reqId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/scene.jpg">https://example.com/scene.jpg</a></p>
         */
        public Builder targetImageUrl(String targetImageUrl) {
            this.putQueryParameter("TargetImageUrl", targetImageUrl);
            this.targetImageUrl = targetImageUrl;
            return this;
        }

        @Override
        public ProductHotspotDetectionRequest build() {
            return new ProductHotspotDetectionRequest(this);
        } 

    } 

}
