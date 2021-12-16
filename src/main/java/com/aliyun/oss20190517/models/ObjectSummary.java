// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ObjectSummary} extends {@link TeaModel}
 *
 * <p>ObjectSummary</p>
 */
public class ObjectSummary extends TeaModel {
    @NameInMap("ETag")
    private String ETag;

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

    @NameInMap("Type")
    private String type;


    private ObjectSummary(Builder builder) {
        this.ETag = builder.ETag;
        this.key = builder.key;
        this.lastModified = builder.lastModified;
        this.owner = builder.owner;
        this.size = builder.size;
        this.storageClass = builder.storageClass;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObjectSummary create() {
        return builder().build();
    }

    /**
     * @return ETag
     */
    public String getETag() {
        return this.ETag;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String ETag; 
        private String key; 
        private String lastModified; 
        private Owner owner; 
        private Long size; 
        private StorageClass storageClass; 
        private String type; 

        /**
         * <p>The entity tag is a hash of the object.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        /**
         * <p>The name of the object.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The last modification time of the object.</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The size in bytes of the object</p>
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
         * <p>The type of the object.</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ObjectSummary build() {
            return new ObjectSummary(this);
        } 

    } 

}
