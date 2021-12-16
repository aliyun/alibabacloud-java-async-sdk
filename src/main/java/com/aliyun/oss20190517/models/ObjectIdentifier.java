// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ObjectIdentifier} extends {@link TeaModel}
 *
 * <p>ObjectIdentifier</p>
 */
public class ObjectIdentifier extends TeaModel {
    @NameInMap("Key")
    private String key;

    @NameInMap("VersionId")
    private String versionId;


    private ObjectIdentifier(Builder builder) {
        this.key = builder.key;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObjectIdentifier create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String key; 
        private String versionId; 

        /**
         * <p>key</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>version id</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public ObjectIdentifier build() {
            return new ObjectIdentifier(this);
        } 

    } 

}
