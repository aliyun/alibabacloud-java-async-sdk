// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ObjectVersion} extends {@link TeaModel}
 *
 * <p>ObjectVersion</p>
 */
public class ObjectVersion extends TeaModel {
    @NameInMap("ETag")
    private String ETag;

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
    private StorageClass storageClass;

    @NameInMap("VersionId")
    private String versionId;


    private ObjectVersion(Builder builder) {
        this.ETag = builder.ETag;
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
     * @return ETag
     */
    public String getETag() {
        return this.ETag;
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
    public StorageClass getStorageClass() {
        return this.storageClass;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String ETag; 
        private Boolean isLatest; 
        private String key; 
        private String lastModified; 
        private Owner owner; 
        private Long size; 
        private StorageClass storageClass; 
        private String versionId; 

        /**
         * <p>The entity tag</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        /**
         * <p>Indicates whether the version is the current version</p>
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * <p>The name of the object</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The last modified time of the object</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>The information about the bucket owner</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The size of the returned object</p>
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * <p>StorageClass.</p>
         */
        public Builder storageClass(StorageClass storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        /**
         * <p>The version ID of the object</p>
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
