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
 * {@link UpdateTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableRequest</p>
 */
public class UpdateTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddColumn")
    private AddColumn addColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Catalog")
    @com.aliyun.core.annotation.Validation(maxLength = 255)
    private String catalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteColumn")
    private DeleteColumn deleteColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 127, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenameColumn")
    private RenameColumn renameColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateColumnComment")
    private UpdateColumnComment updateColumnComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateColumnType")
    private UpdateColumnType updateColumnType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateComment")
    private String updateComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateRetentionPolicy")
    private UpdateRetentionPolicy updateRetentionPolicy;

    private UpdateTableRequest(Builder builder) {
        super(builder);
        this.addColumn = builder.addColumn;
        this.catalog = builder.catalog;
        this.clientToken = builder.clientToken;
        this.deleteColumn = builder.deleteColumn;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.renameColumn = builder.renameColumn;
        this.updateColumnComment = builder.updateColumnComment;
        this.updateColumnType = builder.updateColumnType;
        this.updateComment = builder.updateComment;
        this.updateRetentionPolicy = builder.updateRetentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addColumn
     */
    public AddColumn getAddColumn() {
        return this.addColumn;
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteColumn
     */
    public DeleteColumn getDeleteColumn() {
        return this.deleteColumn;
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
     * @return renameColumn
     */
    public RenameColumn getRenameColumn() {
        return this.renameColumn;
    }

    /**
     * @return updateColumnComment
     */
    public UpdateColumnComment getUpdateColumnComment() {
        return this.updateColumnComment;
    }

    /**
     * @return updateColumnType
     */
    public UpdateColumnType getUpdateColumnType() {
        return this.updateColumnType;
    }

    /**
     * @return updateComment
     */
    public String getUpdateComment() {
        return this.updateComment;
    }

    /**
     * @return updateRetentionPolicy
     */
    public UpdateRetentionPolicy getUpdateRetentionPolicy() {
        return this.updateRetentionPolicy;
    }

    public static final class Builder extends Request.Builder<UpdateTableRequest, Builder> {
        private AddColumn addColumn; 
        private String catalog; 
        private String clientToken; 
        private DeleteColumn deleteColumn; 
        private String name; 
        private String namespace; 
        private RenameColumn renameColumn; 
        private UpdateColumnComment updateColumnComment; 
        private UpdateColumnType updateColumnType; 
        private String updateComment; 
        private UpdateRetentionPolicy updateRetentionPolicy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableRequest request) {
            super(request);
            this.addColumn = request.addColumn;
            this.catalog = request.catalog;
            this.clientToken = request.clientToken;
            this.deleteColumn = request.deleteColumn;
            this.name = request.name;
            this.namespace = request.namespace;
            this.renameColumn = request.renameColumn;
            this.updateColumnComment = request.updateColumnComment;
            this.updateColumnType = request.updateColumnType;
            this.updateComment = request.updateComment;
            this.updateRetentionPolicy = request.updateRetentionPolicy;
        } 

        /**
         * <p>新增列定义（JSON 对象）。包含 Name（列名，必填）、Type（数据类型，必填，如 STRING、INT32、INT64、FLOAT、DOUBLE、BOOLEAN、TIMESTAMP）、Comment（列备注，选填）。每次调用只能新增一列</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;,&quot;Comment&quot;:&quot;主键&quot;}</p>
         */
        public Builder addColumn(AddColumn addColumn) {
            String addColumnShrink = shrink(addColumn, "AddColumn", "json");
            this.putQueryParameter("AddColumn", addColumnShrink);
            this.addColumn = addColumn;
            return this;
        }

        /**
         * <p>表所属的数据目录名称。可通过 ListCatalogs 获取</p>
         * 
         * <strong>example:</strong>
         * <p>my_catalog</p>
         */
        public Builder catalog(String catalog) {
            this.putQueryParameter("Catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * <p>用于保证请求幂等性的Token。建议使用 UUID</p>
         * 
         * <strong>example:</strong>
         * <p>1e9b8f60-3a2c-4d7e-9f1b-8c3d5e7a2b4f</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>删除列定义（JSON 对象）。包含 Name（要删除的列名，必填）。删除后不可恢复，已有数据中该列的值将丢失。每次调用只能删除一列</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Name&quot;:&quot;old_column&quot;}</p>
         */
        public Builder deleteColumn(DeleteColumn deleteColumn) {
            String deleteColumnShrink = shrink(deleteColumn, "DeleteColumn", "json");
            this.putQueryParameter("DeleteColumn", deleteColumnShrink);
            this.deleteColumn = deleteColumn;
            return this;
        }

        /**
         * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_table</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>表所属的命名空间名称。可通过 ListNamespaces 获取</p>
         * 
         * <strong>example:</strong>
         * <p>my_namespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>重命名列（JSON 对象）。包含 Name（原列名，必填）、NewName（新列名，必填）。每次调用只能重命名一列</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Name&quot;:&quot;old_name&quot;,&quot;NewName&quot;:&quot;new_name&quot;}</p>
         */
        public Builder renameColumn(RenameColumn renameColumn) {
            String renameColumnShrink = shrink(renameColumn, "RenameColumn", "json");
            this.putQueryParameter("RenameColumn", renameColumnShrink);
            this.renameColumn = renameColumn;
            return this;
        }

        /**
         * <p>修改列的备注信息（JSON 对象）。包含 Name（目标列名，必填）、Comment（新备注内容，必填，传空字符串可清除备注）。每次调用只能修改一列</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Comment&quot;:&quot;主键ID&quot;}</p>
         */
        public Builder updateColumnComment(UpdateColumnComment updateColumnComment) {
            String updateColumnCommentShrink = shrink(updateColumnComment, "UpdateColumnComment", "json");
            this.putQueryParameter("UpdateColumnComment", updateColumnCommentShrink);
            this.updateColumnComment = updateColumnComment;
            return this;
        }

        /**
         * <p>修改列的数据类型（JSON 对象）。包含 Name（目标列名，必填）、Type（新数据类型，必填）。仅支持兼容类型转换，每次调用只能修改一列</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Name&quot;:&quot;id&quot;,&quot;Type&quot;:&quot;bigint&quot;}</p>
         */
        public Builder updateColumnType(UpdateColumnType updateColumnType) {
            String updateColumnTypeShrink = shrink(updateColumnType, "UpdateColumnType", "json");
            this.putQueryParameter("UpdateColumnType", updateColumnTypeShrink);
            this.updateColumnType = updateColumnType;
            return this;
        }

        /**
         * <p>修改表的备注描述。传入新的备注内容替换原有备注，传空字符串可清除备注</p>
         * 
         * <strong>example:</strong>
         * <p>更新后的备注</p>
         */
        public Builder updateComment(String updateComment) {
            this.putQueryParameter("UpdateComment", updateComment);
            this.updateComment = updateComment;
            return this;
        }

        /**
         * <p>修改数据保留策略（JSON 对象）。包含 HotTTL（热数据保留天数）、ColdTTL（冷数据保留天数）。传入后会替换原有策略</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;HotTTL&quot;:7,&quot;ColdTTL&quot;:30}</p>
         */
        public Builder updateRetentionPolicy(UpdateRetentionPolicy updateRetentionPolicy) {
            String updateRetentionPolicyShrink = shrink(updateRetentionPolicy, "UpdateRetentionPolicy", "json");
            this.putQueryParameter("UpdateRetentionPolicy", updateRetentionPolicyShrink);
            this.updateRetentionPolicy = updateRetentionPolicy;
            return this;
        }

        @Override
        public UpdateTableRequest build() {
            return new UpdateTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class AddColumn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AddColumn(Builder builder) {
            this.comment = builder.comment;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddColumn create() {
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

            private Builder(AddColumn model) {
                this.comment = model.comment;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
             * <p>This parameter is required.</p>
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

            public AddColumn build() {
                return new AddColumn(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class DeleteColumn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DeleteColumn(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteColumn create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DeleteColumn model) {
                this.name = model.name;
            } 

            /**
             * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my_table</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DeleteColumn build() {
                return new DeleteColumn(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class RenameColumn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewName")
        private String newName;

        private RenameColumn(Builder builder) {
            this.name = builder.name;
            this.newName = builder.newName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenameColumn create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newName
         */
        public String getNewName() {
            return this.newName;
        }

        public static final class Builder {
            private String name; 
            private String newName; 

            private Builder() {
            } 

            private Builder(RenameColumn model) {
                this.name = model.name;
                this.newName = model.newName;
            } 

            /**
             * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my_table</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewName.
             */
            public Builder newName(String newName) {
                this.newName = newName;
                return this;
            }

            public RenameColumn build() {
                return new RenameColumn(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class UpdateColumnComment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private UpdateColumnComment(Builder builder) {
            this.comment = builder.comment;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateColumnComment create() {
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

        public static final class Builder {
            private String comment; 
            private String name; 

            private Builder() {
            } 

            private Builder(UpdateColumnComment model) {
                this.comment = model.comment;
                this.name = model.name;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my_table</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UpdateColumnComment build() {
                return new UpdateColumnComment(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class UpdateColumnType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private UpdateColumnType(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateColumnType create() {
            return builder().build();
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpdateColumnType model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>要修改的事件表名称。名称本身不可修改，此处用于定位目标表。需同时指定所属 Catalog 和 Namespace。可通过 ListTables 获取</p>
             * <p>This parameter is required.</p>
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

            public UpdateColumnType build() {
                return new UpdateColumnType(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class UpdateRetentionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdTTL")
        private Integer coldTTL;

        @com.aliyun.core.annotation.NameInMap("HotTTL")
        private Integer hotTTL;

        private UpdateRetentionPolicy(Builder builder) {
            this.coldTTL = builder.coldTTL;
            this.hotTTL = builder.hotTTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateRetentionPolicy create() {
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

            private Builder(UpdateRetentionPolicy model) {
                this.coldTTL = model.coldTTL;
                this.hotTTL = model.hotTTL;
            } 

            /**
             * ColdTTL.
             */
            public Builder coldTTL(Integer coldTTL) {
                this.coldTTL = coldTTL;
                return this;
            }

            /**
             * HotTTL.
             */
            public Builder hotTTL(Integer hotTTL) {
                this.hotTTL = hotTTL;
                return this;
            }

            public UpdateRetentionPolicy build() {
                return new UpdateRetentionPolicy(this);
            } 

        } 

    }
}
