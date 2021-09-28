// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PutSymlinkRequest} extends {@link RequestModel}
 *
 * <p>PutSymlinkRequest</p>
 */
public class PutSymlinkRequest extends Request {
    @Host
    @NameInMap("bucket")
    private String bucket;

    @Path
    @NameInMap("key")
    private String key;

    @Header
    @NameInMap("x-oss-symlink-target")
    private String symlinkTargetKey;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private String storageClass;


    private PutSymlinkRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.key = builder.key;
        this.symlinkTargetKey = builder.symlinkTargetKey;
        this.acl = builder.acl;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutSymlinkRequest create() {
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
     * @return symlinkTargetKey
     */
    public String symlinkTargetKey() {
        return this.symlinkTargetKey;
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

    public static final class Builder extends Request.Builder<PutSymlinkRequest.Builder> {
        private String bucket; 
        private String key; 
        private String symlinkTargetKey; 
        private String acl; 
        private String storageClass; 

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
         * <p>x-oss-symlink-target.</p>
         */
        public Builder symlinkTargetKey(String symlinkTargetKey) {
            this.putHeaderParameter("x-oss-symlink-target", symlinkTargetKey);
            this.symlinkTargetKey = symlinkTargetKey;
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

        public PutSymlinkRequest build() {
            return new PutSymlinkRequest(this);
        } 

    } 

}
