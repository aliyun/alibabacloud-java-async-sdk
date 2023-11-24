// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AclEntryConfig} extends {@link TeaModel}
 *
 * <p>AclEntryConfig</p>
 */
public class AclEntryConfig extends TeaModel {
    @NameInMap("entry")
    @Validation(required = true)
    private String entry;

    private AclEntryConfig(Builder builder) {
        this.entry = builder.entry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AclEntryConfig create() {
        return builder().build();
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    public static final class Builder {
        private String entry; 

        /**
         * entry.
         */
        public Builder entry(String entry) {
            this.entry = entry;
            return this;
        }

        public AclEntryConfig build() {
            return new AclEntryConfig(this);
        } 

    } 

}
