// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShadowSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShadowSchemaResponseBody</p>
 */
public class DescribeShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schema")
    private String schema;

    private DescribeShadowSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShadowSchemaResponseBody create() {
        return builder().build();
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
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        public DescribeShadowSchemaResponseBody build() {
            return new DescribeShadowSchemaResponseBody(this);
        } 

    } 

}
