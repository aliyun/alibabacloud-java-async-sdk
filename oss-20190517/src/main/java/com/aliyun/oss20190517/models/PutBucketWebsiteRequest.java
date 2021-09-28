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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("websiteConfiguration")
    private WebsiteConfiguration websiteConfiguration;


    private PutBucketWebsiteRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.websiteConfiguration = builder.websiteConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketWebsiteRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return websiteConfiguration
     */
    public WebsiteConfiguration websiteConfiguration() {
        return this.websiteConfiguration;
    }

    public static final class Builder extends Request.Builder<PutBucketWebsiteRequest.Builder> {
        private String bucket; 
        private WebsiteConfiguration websiteConfiguration; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>websiteConfiguration.</p>
         */
        public Builder websiteConfiguration(WebsiteConfiguration websiteConfiguration) {
            this.putBodyParameter("websiteConfiguration", websiteConfiguration);
            this.websiteConfiguration = websiteConfiguration;
            return this;
        }

        public PutBucketWebsiteRequest build() {
            return new PutBucketWebsiteRequest(this);
        } 

    } 

}
