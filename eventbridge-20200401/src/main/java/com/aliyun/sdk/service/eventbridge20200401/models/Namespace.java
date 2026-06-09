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
 * {@link Namespace} extends {@link TeaModel}
 *
 * <p>Namespace</p>
 */
public class Namespace extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private String properties;

    private Namespace(Builder builder) {
        this.catalog = builder.catalog;
        this.comment = builder.comment;
        this.name = builder.name;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Namespace create() {
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
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private String catalog; 
        private String comment; 
        private String name; 
        private String properties; 

        private Builder() {
        } 

        private Builder(Namespace model) {
            this.catalog = model.catalog;
            this.comment = model.comment;
            this.name = model.name;
            this.properties = model.properties;
        } 

        /**
         * <p>命名空间所属的数据目录名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>命名空间的备注描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>测试命名空间</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>命名空间的唯一标识名称</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>命名空间的扩展属性</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
        public Builder properties(String properties) {
            this.properties = properties;
            return this;
        }

        public Namespace build() {
            return new Namespace(this);
        } 

    } 

}
