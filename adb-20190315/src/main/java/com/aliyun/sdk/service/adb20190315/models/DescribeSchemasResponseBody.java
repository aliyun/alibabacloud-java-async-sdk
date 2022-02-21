// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSchemasResponseBody</p>
 */
public class DescribeSchemasResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSchemasResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSchemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSchemasResponseBody build() {
            return new DescribeSchemasResponseBody(this);
        } 

    } 

    public static class Schema extends TeaModel {
        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("SchemaName")
        private String schemaName;

        private Schema(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String schemaName; 

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Schema")
        private java.util.List < Schema> schema;

        private Items(Builder builder) {
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return schema
         */
        public java.util.List < Schema> getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private java.util.List < Schema> schema; 

            /**
             * Schema.
             */
            public Builder schema(java.util.List < Schema> schema) {
                this.schema = schema;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
