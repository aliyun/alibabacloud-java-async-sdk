// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetSchemaResponseBody</p>
 */
public class GetSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private Schema schema;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSchemaResponseBody create() {
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
    public Schema getSchema() {
        return this.schema;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Schema schema; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSchemaResponseBody model) {
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.success = model.success;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSchemaResponseBody build() {
            return new GetSchemaResponseBody(this);
        } 

    } 

}
