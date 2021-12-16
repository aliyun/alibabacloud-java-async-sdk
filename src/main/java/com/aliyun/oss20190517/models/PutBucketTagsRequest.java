// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutBucketTagsRequest} extends {@link RequestModel}
 *
 * <p>PutBucketTagsRequest</p>
 */
public class PutBucketTagsRequest extends Request {
    @Body
    @NameInMap("Tagging")
    private Tagging tagging;

    @Host
    @NameInMap("bucket")
    private String bucket;


    private PutBucketTagsRequest(Builder builder) {
        super(builder);
        this.tagging = builder.tagging;
        this.bucket = builder.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketTagsRequest create() {
        return builder().build();
    }

    /**
     * @return tagging
     */
    public Tagging getTagging() {
        return this.tagging;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Tagging tagging; 
        private String bucket; 

        /**
         * <p>Tagging.</p>
         */
        public Builder tagging(Tagging tagging) {
            this.putBodyParameter("Tagging", tagging);
            this.tagging = tagging;
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

        public PutBucketTagsRequest build() {
            return new PutBucketTagsRequest(this);
        } 

    } 

}
