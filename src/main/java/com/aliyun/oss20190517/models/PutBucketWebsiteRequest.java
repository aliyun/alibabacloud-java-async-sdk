// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketWebsiteRequest} extends {@link RequestModel}
 *
 * <p>PutBucketWebsiteRequest</p>
 */
public class PutBucketWebsiteRequest extends Request {
    @Body
    @NameInMap("WebsiteConfiguration")
    private WebsiteConfiguration websiteConfiguration;

    @Host
    @NameInMap("bucket")
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

    public static final class Builder extends Request.Builder<Builder> {
        private WebsiteConfiguration websiteConfiguration; 
        private String bucket; 

        /**
         * <p>WebsiteConfiguration.</p>
         */
        public Builder websiteConfiguration(WebsiteConfiguration websiteConfiguration) {
            this.putBodyParameter("WebsiteConfiguration", websiteConfiguration);
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        public PutBucketWebsiteRequest build() {
            return new PutBucketWebsiteRequest(this);
        } 

    } 

}
