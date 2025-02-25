// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MetadataInfo} extends {@link TeaModel}
 *
 * <p>MetadataInfo</p>
 */
public class MetadataInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("virtual")
    private Boolean virtual;

    private MetadataInfo(Builder builder) {
        this.key = builder.key;
        this.virtual = builder.virtual;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetadataInfo create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return virtual
     */
    public Boolean getVirtual() {
        return this.virtual;
    }

    public static final class Builder {
        private String key; 
        private Boolean virtual; 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * virtual.
         */
        public Builder virtual(Boolean virtual) {
            this.virtual = virtual;
            return this;
        }

        public MetadataInfo build() {
            return new MetadataInfo(this);
        } 

    } 

}
