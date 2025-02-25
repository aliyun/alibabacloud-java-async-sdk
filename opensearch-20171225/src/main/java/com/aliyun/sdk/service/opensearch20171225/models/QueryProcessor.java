// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProcessor} extends {@link TeaModel}
 *
 * <p>QueryProcessor</p>
 */
public class QueryProcessor extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("indexes")
    private java.util.List < String > indexes;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("processors")
    private java.util.List < java.util.Map<String, ?>> processors;

    private QueryProcessor(Builder builder) {
        this.active = builder.active;
        this.category = builder.category;
        this.domain = builder.domain;
        this.indexes = builder.indexes;
        this.name = builder.name;
        this.processors = builder.processors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProcessor create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return indexes
     */
    public java.util.List < String > getIndexes() {
        return this.indexes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return processors
     */
    public java.util.List < java.util.Map<String, ?>> getProcessors() {
        return this.processors;
    }

    public static final class Builder {
        private Boolean active; 
        private String category; 
        private String domain; 
        private java.util.List < String > indexes; 
        private String name; 
        private java.util.List < java.util.Map<String, ?>> processors; 

        /**
         * active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * indexes.
         */
        public Builder indexes(java.util.List < String > indexes) {
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
         * processors.
         */
        public Builder processors(java.util.List < java.util.Map<String, ?>> processors) {
            this.processors = processors;
            return this;
        }

        public QueryProcessor build() {
            return new QueryProcessor(this);
        } 

    } 

}
