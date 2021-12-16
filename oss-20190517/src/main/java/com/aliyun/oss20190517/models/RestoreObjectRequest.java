// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RestoreObjectRequest} extends {@link RequestModel}
 *
 * <p>RestoreObjectRequest</p>
 */
public class RestoreObjectRequest extends Request {
    @Path
    @NameInMap("key")
    private String key;

    @Body
    @NameInMap("body")
    private RestoreRequest body;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Query
    @NameInMap("versionId")
    private String versionId;


    private RestoreObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.body = builder.body;
        this.bucket = builder.bucket;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreObjectRequest create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return body
     */
    public RestoreRequest getBody() {
        return this.body;
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
        private RestoreRequest body; 
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
         * <p>body.</p>
         */
        public Builder body(RestoreRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
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

        public RestoreObjectRequest build() {
            return new RestoreObjectRequest(this);
        } 

    } 

}
