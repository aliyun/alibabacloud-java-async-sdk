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
 * {@link Catalog} extends {@link TeaModel}
 *
 * <p>Catalog</p>
 */
public class Catalog extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentMetaEntityId")
    private String parentMetaEntityId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Catalog(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifyTime = builder.modifyTime;
        this.name = builder.name;
        this.parentMetaEntityId = builder.parentMetaEntityId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Catalog create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentMetaEntityId
     */
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String comment; 
        private Long createTime; 
        private String id; 
        private Long modifyTime; 
        private String name; 
        private String parentMetaEntityId; 
        private String type; 

        private Builder() {
        } 

        private Builder(Catalog model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifyTime = model.modifyTime;
            this.name = model.name;
            this.parentMetaEntityId = model.parentMetaEntityId;
            this.type = model.type;
        } 

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Default catalog</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The creation time. The value is a millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1725330777000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the data catalog entity. Currently, the DLF and StarRocks types are supported. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts of metadata entities</a>.</p>
         * <ul>
         * <li><p>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</p>
         * </li>
         * <li><p>For the StarRocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Where:<br><code>catalog_id</code>: The DLF catalog ID.<br><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.<br><code>catalog_name</code>: the name of the StarRocks catalog.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dlf-catalog::catalog1</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The modification time. The value is a millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1725330777000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>catalog1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the parent entity.</p>
         * <ul>
         * <li><p>For the DLF type, the format of <code>ParentMetaEntityId</code> is <code>dlf</code>.</p>
         * </li>
         * <li><p>For the StarRocks type, the format of <code>ParentMetaEntityId</code> is <code>starrocks:(instance_id|encoded_jdbc_url)</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Where:<br><code>instance_id</code>: The instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dlf</p>
         */
        public Builder parentMetaEntityId(String parentMetaEntityId) {
            this.parentMetaEntityId = parentMetaEntityId;
            return this;
        }

        /**
         * <p>The catalog type. The valid values depend on the metadata collector type.</p>
         * 
         * <strong>example:</strong>
         * <p>HIVE</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Catalog build() {
            return new Catalog(this);
        } 

    } 

}
