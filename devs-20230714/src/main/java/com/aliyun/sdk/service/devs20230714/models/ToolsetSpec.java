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
 * {@link ToolsetSpec} extends {@link TeaModel}
 *
 * <p>ToolsetSpec</p>
 */
public class ToolsetSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private Authorization authConfig;

    @com.aliyun.core.annotation.NameInMap("schema")
    private ToolsetSchema schema;

    private ToolsetSpec(Builder builder) {
        this.authConfig = builder.authConfig;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolsetSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public Authorization getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return schema
     */
    public ToolsetSchema getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private Authorization authConfig; 
        private ToolsetSchema schema; 

        private Builder() {
        } 

        private Builder(ToolsetSpec model) {
            this.authConfig = model.authConfig;
            this.schema = model.schema;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(Authorization authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(ToolsetSchema schema) {
            this.schema = schema;
            return this;
        }

        public ToolsetSpec build() {
            return new ToolsetSpec(this);
        } 

    } 

}
