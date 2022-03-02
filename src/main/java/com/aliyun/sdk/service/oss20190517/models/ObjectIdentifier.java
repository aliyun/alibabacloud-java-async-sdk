// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ObjectIdentifier} extends {@link TeaModel}
 *
 * <p>ObjectIdentifier</p>
 */
public class ObjectIdentifier extends TeaModel {
    @NameInMap("Key")
    @Validation(required = true)
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
         * key
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * version id
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
