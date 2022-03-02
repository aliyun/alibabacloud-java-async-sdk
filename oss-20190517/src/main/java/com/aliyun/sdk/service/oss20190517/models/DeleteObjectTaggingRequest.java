// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteObjectTaggingRequest} extends {@link RequestModel}
 *
 * <p>DeleteObjectTaggingRequest</p>
 */
public class DeleteObjectTaggingRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;

    private DeleteObjectTaggingRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteObjectTaggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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

    public static final class Builder extends Request.Builder<DeleteObjectTaggingRequest, Builder> {
        private String key; 
        private String bucket; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteObjectTaggingRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.versionId = request.versionId;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
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

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteObjectTaggingRequest build() {
            return new DeleteObjectTaggingRequest(this);
        } 

    } 

}
