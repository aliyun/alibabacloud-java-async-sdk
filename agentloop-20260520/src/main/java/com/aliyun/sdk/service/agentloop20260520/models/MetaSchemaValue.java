// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link MetaSchemaValue} extends {@link TeaModel}
 *
 * <p>MetaSchemaValue</p>
 */
public class MetaSchemaValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private MetaSchemaValue(Builder builder) {
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaSchemaValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String type; 

        private Builder() {
        } 

        private Builder(MetaSchemaValue model) {
            this.type = model.type;
        } 

        /**
         * <p>The dataset field types. Valid values: text, long, double, and json.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public MetaSchemaValue build() {
            return new MetaSchemaValue(this);
        } 

    } 

}
