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
    @Path
    @NameInMap("key")
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
    private String bucket;

    @Query
    @NameInMap("position")
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

    public static final class Builder extends Request.Builder<Builder> {
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

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>Cache-Control.</p>
         */
        public Builder cacheControl(String cacheControl) {
            this.putHeaderParameter("Cache-Control", cacheControl);
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * <p>Content-Disposition.</p>
         */
        public Builder contentDisposition(String contentDisposition) {
            this.putHeaderParameter("Content-Disposition", contentDisposition);
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * <p>Content-Encoding.</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putHeaderParameter("Content-Encoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>Content-MD5.</p>
         */
        public Builder contentMD5(String contentMD5) {
            this.putHeaderParameter("Content-MD5", contentMD5);
            this.contentMD5 = contentMD5;
            return this;
        }

        /**
         * <p>Expires.</p>
         */
        public Builder expires(String expires) {
            this.putHeaderParameter("Expires", expires);
            this.expires = expires;
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

        /**
         * <p>bucket.</p>
         */
        public Builder bucket(String bucket) {
            this.putHostParameter("bucket", bucket);
            this.bucket = bucket;
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
         * <p>x-oss-meta-*.</p>
         */
        public Builder metaData(java.util.Map < String, String > metaData) {
            this.putHeaderParameter("x-oss-meta-*", metaData);
            this.metaData = metaData;
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
         * <p>x-oss-server-side-encryption.</p>
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.putHeaderParameter("x-oss-server-side-encryption", serverSideEncryption);
            this.serverSideEncryption = serverSideEncryption;
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

        public AppendObjectRequest build() {
            return new AppendObjectRequest(this);
        } 

    } 

}
