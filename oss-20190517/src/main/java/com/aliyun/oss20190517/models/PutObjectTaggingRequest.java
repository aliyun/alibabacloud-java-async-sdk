// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutObjectTaggingRequest} extends {@link RequestModel}
 *
 * <p>PutObjectTaggingRequest</p>
 */
public class PutObjectTaggingRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("tagging")
    private Tagging tagging;


    private PutObjectTaggingRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.tagging = builder.tagging;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectTaggingRequest create() {
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

    /**
     * @return tagging
     */
    public Tagging tagging() {
        return this.tagging;
    }

    public static final class Builder extends Request.Builder<PutObjectTaggingRequest.Builder> {
        private String bucket; 
        private String key; 
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
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>tagging.</p>
         */
        public Builder tagging(Tagging tagging) {
            this.putBodyParameter("tagging", tagging);
            this.tagging = tagging;
            return this;
        }

        public PutObjectTaggingRequest build() {
            return new PutObjectTaggingRequest(this);
        } 

    } 

}
