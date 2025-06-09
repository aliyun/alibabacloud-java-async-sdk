// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link InstanceMetadataOptions} extends {@link TeaModel}
 *
 * <p>InstanceMetadataOptions</p>
 */
public class InstanceMetadataOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("http_tokens")
    private String httpTokens;

    private InstanceMetadataOptions(Builder builder) {
        this.httpTokens = builder.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceMetadataOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public static final class Builder {
        private String httpTokens; 

        private Builder() {
        } 

        private Builder(InstanceMetadataOptions model) {
            this.httpTokens = model.httpTokens;
        } 

        /**
         * http_tokens.
         */
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        public InstanceMetadataOptions build() {
            return new InstanceMetadataOptions(this);
        } 

    } 

}
