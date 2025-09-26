// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link UpdateToolInput} extends {@link TeaModel}
 *
 * <p>UpdateToolInput</p>
 */
public class UpdateToolInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    private UpdateToolInput(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String schema; 

        private Builder() {
        } 

        private Builder(UpdateToolInput model) {
            this.description = model.description;
            this.name = model.name;
            this.schema = model.schema;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        public UpdateToolInput build() {
            return new UpdateToolInput(this);
        } 

    } 

}
