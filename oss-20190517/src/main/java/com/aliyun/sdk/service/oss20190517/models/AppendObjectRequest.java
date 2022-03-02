// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link AppendObjectRequest} extends {@link RequestModel}
 *
 * <p>AppendObjectRequest</p>
 */
public class AppendObjectRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Header
    @NameInMap("Cache-Control")
    private String cacheControl;

    @Header
    @NameInMap("Content-Disposition")
    private String contentDisposition;

    @Header
    @NameInMap("Content-Encoding")
    private String contentEncoding;

    @Header
    @NameInMap("Content-MD5")
    private String contentMD5;

    @Header
    @NameInMap("Expires")
    private String expires;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Query
    @NameInMap("position")
    @Validation(required = true)
    private Long position;

    @Header
    @NameInMap("x-oss-meta-*")
    private java.util.Map < String, String > metaData;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

    @Header
    @NameInMap("x-oss-server-side-encryption")
    private String serverSideEncryption;

    @Header
    @NameInMap("x-oss-storage-class")
    private String storageClass;

    private AppendObjectRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.cacheControl = builder.cacheControl;
        this.contentDisposition = builder.contentDisposition;
        this.contentEncoding = builder.contentEncoding;
        this.contentMD5 = builder.contentMD5;
        this.expires = builder.expires;
        this.body = builder.body;
        this.bucket = builder.bucket;
        this.position = builder.position;
        this.metaData = builder.metaData;
        this.acl = builder.acl;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendObjectRequest create() {
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
     * @return cacheControl
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * @return contentDisposition
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return contentMD5
     */
    public String getContentMD5() {
        return this.contentMD5;
    }

    /**
     * @return expires
     */
    public String getExpires() {
        return this.expires;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return position
     */
    public Long getPosition() {
        return this.position;
    }

    /**
     * @return metaData
     */
    public java.util.Map < String, String > getMetaData() {
        return this.metaData;
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
    }

    /**
     * @return serverSideEncryption
     */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<AppendObjectRequest, Builder> {
        private String key; 
        private String cacheControl; 
        private String contentDisposition; 
        private String contentEncoding; 
        private String contentMD5; 
        private String expires; 
        private java.io.InputStream body; 
        private String bucket; 
        private Long position; 
        private java.util.Map < String, String > metaData; 
        private String acl; 
        private String serverSideEncryption; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(AppendObjectRequest request) {
            super(request);
            this.key = request.key;
            this.cacheControl = request.cacheControl;
            this.contentDisposition = request.contentDisposition;
            this.contentEncoding = request.contentEncoding;
            this.contentMD5 = request.contentMD5;
            this.expires = request.expires;
            this.body = request.body;
            this.bucket = request.bucket;
            this.position = request.position;
            this.metaData = request.metaData;
            this.acl = request.acl;
            this.serverSideEncryption = request.serverSideEncryption;
            this.storageClass = request.storageClass;
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
         * Cache-Control.
         */
        public Builder cacheControl(String cacheControl) {
            this.putHeaderParameter("Cache-Control", cacheControl);
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * Content-Disposition.
         */
        public Builder contentDisposition(String contentDisposition) {
            this.putHeaderParameter("Content-Disposition", contentDisposition);
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * Content-Encoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putHeaderParameter("Content-Encoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Content-MD5.
         */
        public Builder contentMD5(String contentMD5) {
            this.putHeaderParameter("Content-MD5", contentMD5);
            this.contentMD5 = contentMD5;
            return this;
        }

        /**
         * Expires.
         */
        public Builder expires(String expires) {
            this.putHeaderParameter("Expires", expires);
            this.expires = expires;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
         * position.
         */
        public Builder position(Long position) {
            this.putQueryParameter("position", position);
            this.position = position;
            return this;
        }

        /**
         * x-oss-meta-*.
         */
        public Builder metaData(java.util.Map < String, String > metaData) {
            this.putHeaderParameter("x-oss-meta-*", metaData);
            this.metaData = metaData;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(String acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * x-oss-object-acl.
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl.getValue());
            this.acl = acl.getValue();
            return this;
        }

        /**
         * x-oss-server-side-encryption.
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.putHeaderParameter("x-oss-server-side-encryption", serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * x-oss-storage-class.
         */
        public Builder storageClass(String storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        /**
         * x-oss-storage-class.
         */
        public Builder storageClass(StorageClass storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass.getValue());
            this.storageClass = storageClass.getValue();
            return this;
        }

        @Override
        public AppendObjectRequest build() {
            return new AppendObjectRequest(this);
        } 

    } 

}
