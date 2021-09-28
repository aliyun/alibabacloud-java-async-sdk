// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AppendObjectRequest} extends {@link RequestModel}
 *
 * <p>AppendObjectRequest</p>
 */
public class AppendObjectRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Query
    @NameInMap("position")
    private Long position;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private String storageClass;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;


    private AppendObjectRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.position = builder.position;
        this.acl = builder.acl;
        this.storageClass = builder.storageClass;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendObjectRequest create() {
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
     * @return position
     */
    public Long position() {
        return this.position;
    }

    /**
     * @return acl
     */
    public String acl() {
        return this.acl;
    }

    /**
     * @return storageClass
     */
    public String storageClass() {
        return this.storageClass;
    }

    /**
     * @return body
     */
    public java.io.InputStream body() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<AppendObjectRequest.Builder> {
        private String bucket; 
        private String key; 
        private Long position; 
        private String acl; 
        private String storageClass; 
        private java.io.InputStream body; 

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
         * <p>position.</p>
         */
        public Builder position(Long position) {
            this.putQueryParameter("position", position);
            this.position = position;
            return this;
        }

        /**
         * <p>x-oss-object-acl.</p>
         */
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>x-oss-storage-class.</p>
         */
        public Builder storageClass(String storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        public AppendObjectRequest build() {
            return new AppendObjectRequest(this);
        } 

    } 

}
