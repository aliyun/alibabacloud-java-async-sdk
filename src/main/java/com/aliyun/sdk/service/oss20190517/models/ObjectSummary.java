// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ObjectSummary} extends {@link TeaModel}
 *
 * <p>ObjectSummary</p>
 */
public class ObjectSummary extends TeaModel {
    @NameInMap("ETag")
    private String eTag;

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

    @NameInMap("Type")
    private String type;

    private ObjectSummary(Builder builder) {
        this.eTag = builder.eTag;
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
     * @return eTag
     */
    public String getETag() {
        return this.eTag;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String eTag; 
        private String key; 
        private String lastModified; 
        private Owner owner; 
        private Long size; 
        private String storageClass; 
        private String type; 

        /**
         * The entity tag is a hash of the object.
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /**
         * The name of the object.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * The last modification time of the object.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * The size in bytes of the object
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
         * The type of the object.
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
