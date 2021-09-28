// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteObjectTaggingRequest} extends {@link RequestModel}
 *
 * <p>DeleteObjectTaggingRequest</p>
 */
public class DeleteObjectTaggingRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;


    private DeleteObjectTaggingRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteObjectTaggingRequest create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String bucket() {
        return this.bucket;
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<DeleteObjectTaggingRequest.Builder> {
        private String bucket; 
        private String key; 

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        public DeleteObjectTaggingRequest build() {
            return new DeleteObjectTaggingRequest(this);
        } 

    } 

}
