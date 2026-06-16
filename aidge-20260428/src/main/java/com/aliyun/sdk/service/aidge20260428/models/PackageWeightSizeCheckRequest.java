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
