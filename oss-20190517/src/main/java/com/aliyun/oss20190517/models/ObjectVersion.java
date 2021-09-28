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
    @NameInMap("Key")
    private String key;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("IsLatest")
    private Boolean isLatest;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("ETag")
    private String ETag;

    @NameInMap("Size")
    private Long size;

    @NameInMap("StorageClass")
    private StorageClass storageClass;

    @NameInMap("Owner")
    private Owner owner;


    private ObjectVersion(Builder builder) {
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.isLatest = builder.isLatest;
        this.lastModified = builder.lastModified;
        this.ETag = builder.ETag;
        this.size = builder.size;
        this.storageClass = builder.storageClass;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObjectVersion create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
    }

    /**
     * @return versionId
     */
    public String versionId() {
        return this.versionId;
    }

    /**
     * @return isLatest
     */
    public Boolean isLatest() {
        return this.isLatest;
    }

    /**
     * @return lastModified
     */
    public String lastModified() {
        return this.lastModified;
    }

    /**
     * @return ETag
     */
    public String ETag() {
        return this.ETag;
    }

    /**
     * @return size
     */
    public Long size() {
        return this.size;
    }

    /**
     * @return storageClass
     */
    public StorageClass storageClass() {
        return this.storageClass;
    }

    /**
     * @return owner
     */
    public Owner owner() {
        return this.owner;
    }

    public static final class Builder {
        private String key; 
        private String versionId; 
        private Boolean isLatest; 
        private String lastModified; 
        private String ETag; 
        private Long size; 
        private StorageClass storageClass; 
        private Owner owner; 

        /**
         * <p>The name of the object</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The version ID of the object</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
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
         * <p>The last modified time of the object</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>The entity tag</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
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
         * <p>The information about the bucket owner</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public ObjectVersion build() {
            return new ObjectVersion(this);
        } 

    } 

}
