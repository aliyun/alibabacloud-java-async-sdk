// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Schema} extends {@link TeaModel}
 *
 * <p>Schema</p>
 */
public class Schema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("indexSortConfig")
    private java.util.List < IndexSortConfig> indexSortConfig;

    @com.aliyun.core.annotation.NameInMap("indexes")
    private Indexes indexes;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("routeField")
    private String routeField;

    @com.aliyun.core.annotation.NameInMap("routeFieldValues")
    private java.util.List < String > routeFieldValues;

    @com.aliyun.core.annotation.NameInMap("secondRouteField")
    private String secondRouteField;

    @com.aliyun.core.annotation.NameInMap("tables")
    private java.util.Map < String, SchemaTablesValue > tables;

    @com.aliyun.core.annotation.NameInMap("ttlField")
    private TtlField ttlField;

    private Schema(Builder builder) {
        this.indexSortConfig = builder.indexSortConfig;
        this.indexes = builder.indexes;
        this.name = builder.name;
        this.routeField = builder.routeField;
        this.routeFieldValues = builder.routeFieldValues;
        this.secondRouteField = builder.secondRouteField;
        this.tables = builder.tables;
        this.ttlField = builder.ttlField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schema create() {
        return builder().build();
    }

    /**
     * @return indexSortConfig
     */
    public java.util.List < IndexSortConfig> getIndexSortConfig() {
        return this.indexSortConfig;
    }

    /**
     * @return indexes
     */
    public Indexes getIndexes() {
        return this.indexes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return routeField
     */
    public String getRouteField() {
        return this.routeField;
    }

    /**
     * @return routeFieldValues
     */
    public java.util.List < String > getRouteFieldValues() {
        return this.routeFieldValues;
    }

    /**
     * @return secondRouteField
     */
    public String getSecondRouteField() {
        return this.secondRouteField;
    }

    /**
     * @return tables
     */
    public java.util.Map < String, SchemaTablesValue > getTables() {
        return this.tables;
    }

    /**
     * @return ttlField
     */
    public TtlField getTtlField() {
        return this.ttlField;
    }

    public static final class Builder {
        private java.util.List < IndexSortConfig> indexSortConfig; 
        private Indexes indexes; 
        private String name; 
        private String routeField; 
        private java.util.List < String > routeFieldValues; 
        private String secondRouteField; 
        private java.util.Map < String, SchemaTablesValue > tables; 
        private TtlField ttlField; 

        /**
         * indexSortConfig.
         */
        public Builder indexSortConfig(java.util.List < IndexSortConfig> indexSortConfig) {
            this.indexSortConfig = indexSortConfig;
            return this;
        }

        /**
         * indexes.
         */
        public Builder indexes(Indexes indexes) {
            this.indexes = indexes;
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
         * routeField.
         */
        public Builder routeField(String routeField) {
            this.routeField = routeField;
            return this;
        }

        /**
         * routeFieldValues.
         */
        public Builder routeFieldValues(java.util.List < String > routeFieldValues) {
            this.routeFieldValues = routeFieldValues;
            return this;
        }

        /**
         * secondRouteField.
         */
        public Builder secondRouteField(String secondRouteField) {
            this.secondRouteField = secondRouteField;
            return this;
        }

        /**
         * tables.
         */
        public Builder tables(java.util.Map < String, SchemaTablesValue > tables) {
            this.tables = tables;
            return this;
        }

        /**
         * ttlField.
         */
        public Builder ttlField(TtlField ttlField) {
            this.ttlField = ttlField;
            return this;
        }

        public Schema build() {
            return new Schema(this);
        } 

    } 

    public static class IndexSortConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("field")
        private String field;

        private IndexSortConfig(Builder builder) {
            this.direction = builder.direction;
            this.field = builder.field;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexSortConfig create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        public static final class Builder {
            private String direction; 
            private String field; 

            /**
             * direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            public IndexSortConfig build() {
                return new IndexSortConfig(this);
            } 

        } 

    }
    public static class Indexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("filterFields")
        private java.util.List < String > filterFields;

        @com.aliyun.core.annotation.NameInMap("searchFields")
        private java.util.Map < String, SchemaIndexesSearchFieldsValue > searchFields;

        private Indexes(Builder builder) {
            this.filterFields = builder.filterFields;
            this.searchFields = builder.searchFields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indexes create() {
            return builder().build();
        }

        /**
         * @return filterFields
         */
        public java.util.List < String > getFilterFields() {
            return this.filterFields;
        }

        /**
         * @return searchFields
         */
        public java.util.Map < String, SchemaIndexesSearchFieldsValue > getSearchFields() {
            return this.searchFields;
        }

        public static final class Builder {
            private java.util.List < String > filterFields; 
            private java.util.Map < String, SchemaIndexesSearchFieldsValue > searchFields; 

            /**
             * filterFields.
             */
            public Builder filterFields(java.util.List < String > filterFields) {
                this.filterFields = filterFields;
                return this;
            }

            /**
             * searchFields.
             */
            public Builder searchFields(java.util.Map < String, SchemaIndexesSearchFieldsValue > searchFields) {
                this.searchFields = searchFields;
                return this;
            }

            public Indexes build() {
                return new Indexes(this);
            } 

        } 

    }
    public static class TtlField extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ttl")
        private Long ttl;

        private TtlField(Builder builder) {
            this.name = builder.name;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TtlField create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String name; 
            private Long ttl; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            public TtlField build() {
                return new TtlField(this);
            } 

        } 

    }
}
