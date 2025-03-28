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
 * {@link ModelProviderSpec} extends {@link TeaModel}
 *
 * <p>ModelProviderSpec</p>
 */
public class ModelProviderSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorization")
    private ModelProviderAuthorization authorization;

    @com.aliyun.core.annotation.NameInMap("schema")
    private ModelProviderSchema schema;

    private ModelProviderSpec(Builder builder) {
        this.authorization = builder.authorization;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelProviderSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorization
     */
    public ModelProviderAuthorization getAuthorization() {
        return this.authorization;
    }

    /**
     * @return schema
     */
    public ModelProviderSchema getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private ModelProviderAuthorization authorization; 
        private ModelProviderSchema schema; 

        private Builder() {
        } 

        private Builder(ModelProviderSpec model) {
            this.authorization = model.authorization;
            this.schema = model.schema;
        } 

        /**
         * authorization.
         */
        public Builder authorization(ModelProviderAuthorization authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(ModelProviderSchema schema) {
            this.schema = schema;
            return this;
        }

        public ModelProviderSpec build() {
            return new ModelProviderSpec(this);
        } 

    } 

}
