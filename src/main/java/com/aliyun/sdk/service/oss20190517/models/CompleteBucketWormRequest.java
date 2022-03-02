// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CompleteBucketWormRequest} extends {@link RequestModel}
 *
 * <p>CompleteBucketWormRequest</p>
 */
public class CompleteBucketWormRequest extends Request {
    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("wormId")
    @Validation(required = true)
    private String wormId;

    private CompleteBucketWormRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.wormId = builder.wormId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteBucketWormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return wormId
     */
    public String getWormId() {
        return this.wormId;
    }

    public static final class Builder extends Request.Builder<CompleteBucketWormRequest, Builder> {
        private String bucket; 
        private String wormId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteBucketWormRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.wormId = request.wormId;
        } 

        /**
         * bucket.
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * The ID of the retention policy
         */
        public Builder wormId(String wormId) {
            this.putQueryParameter("wormId", wormId);
            this.wormId = wormId;
            return this;
        }

        @Override
        public CompleteBucketWormRequest build() {
            return new CompleteBucketWormRequest(this);
        } 

    } 

}
