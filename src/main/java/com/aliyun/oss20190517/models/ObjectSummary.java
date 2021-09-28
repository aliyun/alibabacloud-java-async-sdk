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
    @NameInMap("Key")
    private String key;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("ETag")
    private String ETag;

    @NameInMap("Type")
    private String type;

    @NameInMap("Size")
    private Long size;

    @NameInMap("StorageClass")
    private StorageClass storageClass;

    @NameInMap("Owner")
    private Owner owner;


    private ObjectSummary(Builder builder) {
        this.key = builder.key;
        this.lastModified = builder.lastModified;
        this.ETag = builder.ETag;
        this.type = builder.type;
        this.size = builder.size;
        this.storageClass = builder.storageClass;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObjectSummary create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String key() {
        return this.key;
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
     * @return type
     */
    public String type() {
        return this.type;
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
        private String lastModified; 
        private String ETag; 
        private String type; 
        private Long size; 
        private StorageClass storageClass; 
        private Owner owner; 

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
         * <p>The entity tag is a hash of the object.</p>
         */
        public Builder ETag(String ETag) {
            this.ETag = ETag;
            return this;
        }

        /**
         * <p>The type of the object.</p>
         */
        public Builder type(String type) {
            this.type = type;
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
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public ObjectSummary build() {
            return new ObjectSummary(this);
        } 

    } 

}
