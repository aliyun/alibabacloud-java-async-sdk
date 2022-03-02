// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketWebsiteRequest} extends {@link RequestModel}
 *
 * <p>PutBucketWebsiteRequest</p>
 */
public class PutBucketWebsiteRequest extends Request {
    @Body
    @NameInMap("WebsiteConfiguration")
    @Validation(required = true)
    private WebsiteConfiguration websiteConfiguration;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    private PutBucketWebsiteRequest(Builder builder) {
        super(builder);
        this.websiteConfiguration = builder.websiteConfiguration;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketWebsiteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return websiteConfiguration
     */
    public WebsiteConfiguration getWebsiteConfiguration() {
        return this.websiteConfiguration;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<PutBucketWebsiteRequest, Builder> {
        private WebsiteConfiguration websiteConfiguration; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketWebsiteRequest request) {
            super(request);
            this.websiteConfiguration = request.websiteConfiguration;
            this.bucket = request.bucket;
        } 

        /**
         * WebsiteConfiguration.
         */
        public Builder websiteConfiguration(WebsiteConfiguration websiteConfiguration) {
            this.putBodyParameter("WebsiteConfiguration", websiteConfiguration);
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        @Override
        public PutBucketWebsiteRequest build() {
            return new PutBucketWebsiteRequest(this);
        } 

    } 

}
