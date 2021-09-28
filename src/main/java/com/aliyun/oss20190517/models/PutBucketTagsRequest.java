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
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Body
    @NameInMap("Tagging")
    private Tagging tagging;


    private PutBucketTagsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.tagging = builder.tagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketTagsRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return tagging
     */
    public Tagging tagging() {
        return this.tagging;
    }

    public static final class Builder extends Request.Builder<PutBucketTagsRequest.Builder> {
        private String bucket; 
        private Tagging tagging; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>Tagging.</p>
         */
        public Builder tagging(Tagging tagging) {
            this.putBodyParameter("Tagging", tagging);
            this.tagging = tagging;
            return this;
        }

        public PutBucketTagsRequest build() {
            return new PutBucketTagsRequest(this);
        } 

    } 

}
