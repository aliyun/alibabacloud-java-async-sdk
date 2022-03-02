// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutBucketTagsRequest} extends {@link RequestModel}
 *
 * <p>PutBucketTagsRequest</p>
 */
public class PutBucketTagsRequest extends Request {
    @Body
    @NameInMap("Tagging")
    @Validation(required = true)
    private Tagging tagging;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<PutBucketTagsRequest, Builder> {
        private Tagging tagging; 
        private String bucket; 

        private Builder() {
            super();
        } 

        private Builder(PutBucketTagsRequest request) {
            super(request);
            this.tagging = request.tagging;
            this.bucket = request.bucket;
        } 

        /**
         * Tagging.
         */
        public Builder tagging(Tagging tagging) {
            this.putBodyParameter("Tagging", tagging);
            this.tagging = tagging;
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
        public PutBucketTagsRequest build() {
            return new PutBucketTagsRequest(this);
        } 

    } 

}
