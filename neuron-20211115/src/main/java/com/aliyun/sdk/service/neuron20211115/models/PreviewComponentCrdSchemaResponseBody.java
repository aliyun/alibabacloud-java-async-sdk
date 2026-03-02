// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PreviewComponentCrdSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>PreviewComponentCrdSchemaResponseBody</p>
 */
public class PreviewComponentCrdSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schema")
    private String schema;

    private PreviewComponentCrdSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreviewComponentCrdSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private String requestId; 
        private String schema; 

        private Builder() {
        } 

        private Builder(PreviewComponentCrdSchemaResponseBody model) {
            this.requestId = model.requestId;
            this.schema = model.schema;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3239281273464326823</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        public PreviewComponentCrdSchemaResponseBody build() {
            return new PreviewComponentCrdSchemaResponseBody(this);
        } 

    } 

}
