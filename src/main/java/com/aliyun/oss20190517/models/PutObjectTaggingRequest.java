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
    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("Tagging")
    private Tagging tagging;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;


    private PutObjectTaggingRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.tagging = builder.tagging;
        this.bucket = builder.bucket;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutObjectTaggingRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private Tagging tagging; 
        private String bucket; 
        private String versionId; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
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

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>versionId.</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        public PutObjectTaggingRequest build() {
            return new PutObjectTaggingRequest(this);
        } 

    } 

}
