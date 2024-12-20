// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link AclConfig} extends {@link TeaModel}
 *
 * <p>AclConfig</p>
 */
public class AclConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aclEntries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AclEntryConfig> aclEntries;

    private AclConfig(Builder builder) {
        this.aclEntries = builder.aclEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AclConfig create() {
        return builder().build();
    }

    /**
     * @return aclEntries
     */
    public java.util.List<AclEntryConfig> getAclEntries() {
        return this.aclEntries;
    }

    public static final class Builder {
        private java.util.List<AclEntryConfig> aclEntries; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder aclEntries(java.util.List<AclEntryConfig> aclEntries) {
            this.aclEntries = aclEntries;
            return this;
        }

        public AclConfig build() {
            return new AclConfig(this);
        } 

    } 

}
