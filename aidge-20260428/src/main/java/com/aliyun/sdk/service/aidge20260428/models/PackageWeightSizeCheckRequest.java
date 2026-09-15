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
 * {@link PackageWeightSizeCheckRequest} extends {@link RequestModel}
 *
 * <p>PackageWeightSizeCheckRequest</p>
 */
public class PackageWeightSizeCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotatedImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String annotatedImageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RawImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rawImageUrl;

    private PackageWeightSizeCheckRequest(Builder builder) {
        super(builder);
        this.annotatedImageUrl = builder.annotatedImageUrl;
        this.rawImageUrl = builder.rawImageUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PackageWeightSizeCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotatedImageUrl
     */
    public String getAnnotatedImageUrl() {
        return this.annotatedImageUrl;
    }

    /**
     * @return rawImageUrl
     */
    public String getRawImageUrl() {
        return this.rawImageUrl;
    }

    public static final class Builder extends Request.Builder<PackageWeightSizeCheckRequest, Builder> {
        private String annotatedImageUrl; 
        private String rawImageUrl; 

        private Builder() {
            super();
        } 

        private Builder(PackageWeightSizeCheckRequest request) {
            super(request);
            this.annotatedImageUrl = request.annotatedImageUrl;
            this.rawImageUrl = request.rawImageUrl;
        } 

        /**
         * <p>The URL of the image with manual bounding box annotations, which is the original image overlaid with blue or red rectangular bounding box lines. The URL must be publicly accessible. The image must not exceed 4000 × 4000 pixels or 10 MB in size. Supported formats: png, jpeg, and jpg.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/annotated_image.png">https://example.com/annotated_image.png</a></p>
         */
        public Builder annotatedImageUrl(String annotatedImageUrl) {
            this.putQueryParameter("AnnotatedImageUrl", annotatedImageUrl);
            this.annotatedImageUrl = annotatedImageUrl;
            return this;
        }

        /**
         * <p>The URL of the raw image, which is the unannotated photo of the parcel on the scanning platform. The URL must be publicly accessible. The image must not exceed 4000 × 4000 pixels or 10 MB in size. Supported formats: png, jpeg, and jpg.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/raw_image.png">https://example.com/raw_image.png</a></p>
         */
        public Builder rawImageUrl(String rawImageUrl) {
            this.putQueryParameter("RawImageUrl", rawImageUrl);
            this.rawImageUrl = rawImageUrl;
            return this;
        }

        @Override
        public PackageWeightSizeCheckRequest build() {
            return new PackageWeightSizeCheckRequest(this);
        } 

    } 

}
