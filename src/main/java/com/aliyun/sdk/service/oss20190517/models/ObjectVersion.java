// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ObjectVersion} extends {@link TeaModel}
 *
 * <p>ObjectVersion</p>
 */
public class ObjectVersion extends TeaModel {
    @NameInMap("ETag")
    private String eTag;

    @NameInMap("IsLatest")
    private Boolean isLatest;

    @NameInMap("Key")
    private String key;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Owner")
    private Owner owner;

    @NameInMap("Size")
    private Long size;

    @NameInMap("StorageClass")
    private String storageClass;

    @NameInMap("VersionId")
    private String versionId;

    private ObjectVersion(Builder builder) {
        this.eTag = builder.eTag;
        this.isLatest = builder.isLatest;
        this.key = builder.key;
        this.lastModified = builder.lastModified;
        this.owner = builder.owner;
        this.size = builder.size;
        this.storageClass = builder.storageClass;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObjectVersion create() {
        return builder().build();
    }

    /**
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * @return isLatest
     */
    public Boolean getIsLatest() {
        return this.isLatest;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String eTag; 
        private Boolean isLatest; 
        private String key; 
        private String lastModified; 
        private Owner owner; 
        private Long size; 
        private String storageClass; 
        private String versionId; 

        /**
         * The entity tag
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * Indicates whether the version is the current version
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * The name of the object
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The last modified time of the object
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * The information about the bucket owner
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * The size of the returned object
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass.getValue();
            return this;
        }

        /**
         * The version ID of the object
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public ObjectVersion build() {
            return new ObjectVersion(this);
        } 

    } 

}
