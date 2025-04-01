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
 * {@link WebAclEntryConfig} extends {@link TeaModel}
 *
 * <p>WebAclEntryConfig</p>
 */
public class WebAclEntryConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entry;

    private WebAclEntryConfig(Builder builder) {
        this.entry = builder.entry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebAclEntryConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entry
     */
    public String getEntry() {
        return this.entry;
    }

    public static final class Builder {
        private String entry; 

        private Builder() {
        } 

        private Builder(WebAclEntryConfig model) {
            this.entry = model.entry;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3.4/32</p>
         */
        public Builder entry(String entry) {
            this.entry = entry;
            return this;
        }

        public WebAclEntryConfig build() {
            return new WebAclEntryConfig(this);
        } 

    } 

}
