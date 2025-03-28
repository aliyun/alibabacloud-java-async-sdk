// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ModelProviderAuthorization} extends {@link TeaModel}
 *
 * <p>ModelProviderAuthorization</p>
 */
public class ModelProviderAuthorization extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private java.util.Map<String, String> authConfig;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelProviderAuthorization(Builder builder) {
        this.authConfig = builder.authConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelProviderAuthorization create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public java.util.Map<String, String> getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map<String, String> authConfig; 
        private String type; 

        private Builder() {
        } 

        private Builder(ModelProviderAuthorization model) {
            this.authConfig = model.authConfig;
            this.type = model.type;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(java.util.Map<String, String> authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ModelProviderAuthorization build() {
            return new ModelProviderAuthorization(this);
        } 

    } 

}
