// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CompleteBucketWormRequest} extends {@link RequestModel}
 *
 * <p>CompleteBucketWormRequest</p>
 */
public class CompleteBucketWormRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("wormId")
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

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return wormId
     */
    public String wormId() {
        return this.wormId;
    }

    public static final class Builder extends Request.Builder<CompleteBucketWormRequest.Builder> {
        private String bucket; 
        private String wormId; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The ID of the retention policy</p>
         */
        public Builder wormId(String wormId) {
            this.putQueryParameter("wormId", wormId);
            this.wormId = wormId;
            return this;
        }

        public CompleteBucketWormRequest build() {
            return new CompleteBucketWormRequest(this);
        } 

    } 

}
