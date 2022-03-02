// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DeleteMarkerEntry} extends {@link TeaModel}
 *
 * <p>DeleteMarkerEntry</p>
 */
public class DeleteMarkerEntry extends TeaModel {
    @NameInMap("IsLatest")
    private Boolean isLatest;

    @NameInMap("Key")
    private String key;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Owner")
    private Owner owner;

    @NameInMap("VersionId")
    private String versionId;

    private DeleteMarkerEntry(Builder builder) {
        this.isLatest = builder.isLatest;
        this.key = builder.key;
        this.lastModified = builder.lastModified;
        this.owner = builder.owner;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMarkerEntry create() {
        return builder().build();
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
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private Boolean isLatest; 
        private String key; 
        private String lastModified; 
        private Owner owner; 
        private String versionId; 

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
         * Owner.
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /**
         * The version ID of the object
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public DeleteMarkerEntry build() {
            return new DeleteMarkerEntry(this);
        } 

    } 

}
