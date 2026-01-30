// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListInstanceResourceSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstanceResourceSchemasResponseBody</p>
 */
public class ListInstanceResourceSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private java.util.List<Schemas> schemas;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstanceResourceSchemasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceResourceSchemasResponseBody create() {
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
     * @return schemas
     */
    public java.util.List<Schemas> getSchemas() {
        return this.schemas;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Schemas> schemas; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstanceResourceSchemasResponseBody model) {
            this.requestId = model.requestId;
            this.schemas = model.schemas;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Schemas.
         */
        public Builder schemas(java.util.List<Schemas> schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstanceResourceSchemasResponseBody build() {
            return new ListInstanceResourceSchemasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceResourceSchemasResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstanceResourceSchemasResponseBody</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        private Schemas(Builder builder) {
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private String schemaName; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.schemaName = model.schemaName;
            } 

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
}
