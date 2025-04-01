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
 * {@link WebAclConfig} extends {@link TeaModel}
 *
 * <p>WebAclConfig</p>
 */
public class WebAclConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("WebAclEntries")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<WebAclEntryConfig> webAclEntries;

    private WebAclConfig(Builder builder) {
        this.webAclEntries = builder.webAclEntries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebAclConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return webAclEntries
     */
    public java.util.List<WebAclEntryConfig> getWebAclEntries() {
        return this.webAclEntries;
    }

    public static final class Builder {
        private java.util.List<WebAclEntryConfig> webAclEntries; 

        private Builder() {
        } 

        private Builder(WebAclConfig model) {
            this.webAclEntries = model.webAclEntries;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder webAclEntries(java.util.List<WebAclEntryConfig> webAclEntries) {
            this.webAclEntries = webAclEntries;
            return this;
        }

        public WebAclConfig build() {
            return new WebAclConfig(this);
        } 

    } 

}
