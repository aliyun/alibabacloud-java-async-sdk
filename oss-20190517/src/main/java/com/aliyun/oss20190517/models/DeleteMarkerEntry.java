// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteMarkerEntry} extends {@link TeaModel}
 *
 * <p>DeleteMarkerEntry</p>
 */
public class DeleteMarkerEntry extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("VersionId")
    private String versionId;

    @NameInMap("IsLatest")
    private Boolean isLatest;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Owner")
    private Owner owner;


    private DeleteMarkerEntry(Builder builder) {
        this.key = builder.key;
        this.versionId = builder.versionId;
        this.isLatest = builder.isLatest;
        this.lastModified = builder.lastModified;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMarkerEntry create() {
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
         * <p>Owner.</p>
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        public DeleteMarkerEntry build() {
            return new DeleteMarkerEntry(this);
        } 

    } 

}
