// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link Table} extends {@link TeaModel}
 *
 * <p>Table</p>
 */
public class Table extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("RetentionPolicy")
    private RetentionPolicy retentionPolicy;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private Table(Builder builder) {
        this.catalog = builder.catalog;
        this.columns = builder.columns;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.retentionPolicy = builder.retentionPolicy;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Table create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return retentionPolicy
     */
    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String catalog; 
        private java.util.List<Columns> columns; 
        private String comment; 
        private Long createTime; 
        private String name; 
        private String namespace; 
        private RetentionPolicy retentionPolicy; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(Table model) {
            this.catalog = model.catalog;
            this.columns = model.columns;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.name = model.name;
            this.namespace = model.namespace;
            this.retentionPolicy = model.retentionPolicy;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The name of the data catalog to which the table belongs</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>The column definition list of the table. Each column contains Name (column name), Type (data type), and Comment (remarks)</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;Primary key&quot;}]</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>Comment description of the table</p>
         * 
         * <strong>example:</strong>
         * <p>测试事件表</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time of the table (Unix timestamp, in milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1717948800000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The unique identifier name of the event table</p>
         * 
         * <strong>example:</strong>
         * <p>my_table</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The name of the namespace to which the table belongs</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Data retention policy. Includes the retention days for hot data and cold data</p>
         */
        public Builder retentionPolicy(RetentionPolicy retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * <p>The last update time of the table (Unix timestamp, in milliseconds)</p>
         * 
         * <strong>example:</strong>
         * <p>1717948800000</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Table build() {
            return new Table(this);
        } 

    } 

    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String comment; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>Comment description of the table</p>
             * 
             * <strong>example:</strong>
             * <p>测试事件表</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The unique identifier name of the event table</p>
             * 
             * <strong>example:</strong>
             * <p>my_table</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link Table} extends {@link TeaModel}
     *
     * <p>Table</p>
     */
    public static class RetentionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdTTL")
        private Integer coldTTL;

        @com.aliyun.core.annotation.NameInMap("HotTTL")
        private Integer hotTTL;

        private RetentionPolicy(Builder builder) {
            this.coldTTL = builder.coldTTL;
            this.hotTTL = builder.hotTTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetentionPolicy create() {
            return builder().build();
        }

        /**
         * @return coldTTL
         */
        public Integer getColdTTL() {
            return this.coldTTL;
        }

        /**
         * @return hotTTL
         */
        public Integer getHotTTL() {
            return this.hotTTL;
        }

        public static final class Builder {
            private Integer coldTTL; 
            private Integer hotTTL; 

            private Builder() {
            } 

            private Builder(RetentionPolicy model) {
                this.coldTTL = model.coldTTL;
                this.hotTTL = model.hotTTL;
            } 

            /**
             * <p>Retention days for cold data, used for low-cost archival storage</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder coldTTL(Integer coldTTL) {
                this.coldTTL = coldTTL;
                return this;
            }

            /**
             * <p>Retention days for hot data, used for high-performance query storage</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder hotTTL(Integer hotTTL) {
                this.hotTTL = hotTTL;
                return this;
            }

            public RetentionPolicy build() {
                return new RetentionPolicy(this);
            } 

        } 

    }
}
