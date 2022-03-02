// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutSymlinkRequest} extends {@link RequestModel}
 *
 * <p>PutSymlinkRequest</p>
 */
public class PutSymlinkRequest extends Request {
    @Path
    @NameInMap("key")
    @Validation(required = true)
    private String key;

    @Host
    @NameInMap("bucket")
    @Validation(required = true)
    private String bucket;

    @Header
    @NameInMap("x-oss-forbid-overwrite")
    private String forbidOverwrite;

    @Header
    @NameInMap("x-oss-object-acl")
    private String acl;

    @Header
    @NameInMap("x-oss-storage-class")
    private String storageClass;

    @Header
    @NameInMap("x-oss-symlink-target")
    @Validation(required = true)
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
     * @return forbidOverwrite
     */
    public String getForbidOverwrite() {
        return this.forbidOverwrite;
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return symlinkTargetKey
     */
    public String getSymlinkTargetKey() {
        return this.symlinkTargetKey;
    }

    public static final class Builder extends Request.Builder<PutSymlinkRequest, Builder> {
        private String key; 
        private String bucket; 
        private String forbidOverwrite; 
        private String acl; 
        private String storageClass; 
        private String symlinkTargetKey; 

        private Builder() {
            super();
        } 

        private Builder(PutSymlinkRequest request) {
            super(request);
            this.key = request.key;
            this.bucket = request.bucket;
            this.forbidOverwrite = request.forbidOverwrite;
            this.acl = request.acl;
            this.storageClass = request.storageClass;
            this.symlinkTargetKey = request.symlinkTargetKey;
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
         * x-oss-forbid-overwrite.
         */
        public Builder forbidOverwrite(String forbidOverwrite) {
            this.putHeaderParameter("x-oss-forbid-overwrite", forbidOverwrite);
            this.forbidOverwrite = forbidOverwrite;
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

        /**
         * x-oss-symlink-target.
         */
        public Builder symlinkTargetKey(String symlinkTargetKey) {
            this.putHeaderParameter("x-oss-symlink-target", symlinkTargetKey);
            this.symlinkTargetKey = symlinkTargetKey;
            return this;
        }

        @Override
        public PutSymlinkRequest build() {
            return new PutSymlinkRequest(this);
        } 

    } 

}
