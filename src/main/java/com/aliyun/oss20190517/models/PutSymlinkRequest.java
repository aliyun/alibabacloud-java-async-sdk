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
    @Path
    @NameInMap("key")
    private String key;

    @Host
    @NameInMap("bucket")
    private String bucket;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;

    @Header
    @NameInMap("x-oss-object-acl")
    private ObjectACL acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private StorageClass storageClass;

    @Header
    @NameInMap("x-oss-symlink-target")
    private String symlinkTargetKey;


    private PutSymlinkRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
        this.bucket = builder.bucket;
        this.forbidOverwrite = builder.forbidOverwrite;
        this.acl = builder.acl;
        this.storageClass = builder.storageClass;
        this.symlinkTargetKey = builder.symlinkTargetKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutSymlinkRequest create() {
        return builder().build();
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
     * @return forbidOverwrite
     */
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return acl
     */
    public ObjectACL getAcl() {
        return this.acl;
    }

    /**
     * @return storageClass
     */
    public StorageClass getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return symlinkTargetKey
     */
    public String getSymlinkTargetKey() {
        return this.symlinkTargetKey;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String key; 
        private String bucket; 
        private String forbidOverwrite; 
        private ObjectACL acl; 
        private StorageClass storageClass; 
        private String symlinkTargetKey; 

        /**
         * <p>key.</p>
         */
        public Builder key(String key) {
            this.putPathParameter("key", key);
            this.key = key;
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
         * <p>x-oss-forbid-overwrite.</p>
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
            return this;
        }

        /**
         * <p>x-oss-object-acl.</p>
         */
        public Builder acl(ObjectACL acl) {
            this.putHeaderParameter("x-oss-object-acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>x-oss-storage-class.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.putHeaderParameter("x-oss-storage-class", storageClass);
            this.storageClass = storageClass;
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

        public PutSymlinkRequest build() {
            return new PutSymlinkRequest(this);
        } 

    } 

}
