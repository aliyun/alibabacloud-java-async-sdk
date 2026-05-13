// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeTairSkvDdbTableSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTairSkvDdbTableSchemaResponseBody</p>
 */
public class DescribeTairSkvDdbTableSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("TtlSpec")
    private String ttlSpec;

    private DescribeTairSkvDdbTableSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.ttlSpec = builder.ttlSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTairSkvDdbTableSchemaResponseBody create() {
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

    /**
     * @return ttlSpec
     */
    public String getTtlSpec() {
        return this.ttlSpec;
    }

    public static final class Builder {
        private String requestId; 
        private String schema; 
        private String ttlSpec; 

        private Builder() {
        } 

        private Builder(DescribeTairSkvDdbTableSchemaResponseBody model) {
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.ttlSpec = model.ttlSpec;
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
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * TtlSpec.
         */
        public Builder ttlSpec(String ttlSpec) {
            this.ttlSpec = ttlSpec;
            return this;
        }

        public DescribeTairSkvDdbTableSchemaResponseBody build() {
            return new DescribeTairSkvDdbTableSchemaResponseBody(this);
        } 

    } 

}
