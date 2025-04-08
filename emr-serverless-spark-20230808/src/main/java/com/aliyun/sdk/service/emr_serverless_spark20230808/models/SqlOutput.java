// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link SqlOutput} extends {@link TeaModel}
 *
 * <p>SqlOutput</p>
 */
public class SqlOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("rows")
    private java.util.List<Rows> rows;

    @com.aliyun.core.annotation.NameInMap("schema")
    private Schema schema;

    private SqlOutput(Builder builder) {
        this.rows = builder.rows;
        this.schema = builder.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SqlOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rows
     */
    public java.util.List<Rows> getRows() {
        return this.rows;
    }

    /**
     * @return schema
     */
    public Schema getSchema() {
        return this.schema;
    }

    public static final class Builder {
        private java.util.List<Rows> rows; 
        private Schema schema; 

        private Builder() {
        } 

        private Builder(SqlOutput model) {
            this.rows = model.rows;
            this.schema = model.schema;
        } 

        /**
         * rows.
         */
        public Builder rows(java.util.List<Rows> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(Schema schema) {
            this.schema = schema;
            return this;
        }

        public SqlOutput build() {
            return new SqlOutput(this);
        } 

    } 

    /**
     * 
     * {@link SqlOutput} extends {@link TeaModel}
     *
     * <p>SqlOutput</p>
     */
    public static class Rows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private Rows(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rows create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Rows model) {
                this.values = model.values;
            } 

            /**
             * values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Rows build() {
                return new Rows(this);
            } 

        } 

    }
    /**
     * 
     * {@link SqlOutput} extends {@link TeaModel}
     *
     * <p>SqlOutput</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nullable")
        private Boolean nullable;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Fields(Builder builder) {
            this.name = builder.name;
            this.nullable = builder.nullable;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nullable
         */
        public Boolean getNullable() {
            return this.nullable;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private Boolean nullable; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.name = model.name;
                this.nullable = model.nullable;
                this.type = model.type;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nullable.
             */
            public Builder nullable(Boolean nullable) {
                this.nullable = nullable;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    /**
     * 
     * {@link SqlOutput} extends {@link TeaModel}
     *
     * <p>SqlOutput</p>
     */
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fields")
        private java.util.List<Fields> fields;

        private Schema(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List<Fields> getFields() {
            return this.fields;
        }

        public static final class Builder {
            private java.util.List<Fields> fields; 

            private Builder() {
            } 

            private Builder(Schema model) {
                this.fields = model.fields;
            } 

            /**
             * fields.
             */
            public Builder fields(java.util.List<Fields> fields) {
                this.fields = fields;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
}
