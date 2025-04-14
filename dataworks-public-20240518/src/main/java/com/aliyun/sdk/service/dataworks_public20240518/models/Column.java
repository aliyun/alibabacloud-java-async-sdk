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
 * {@link Column} extends {@link TeaModel}
 *
 * <p>Column</p>
 */
public class Column extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessMetadata")
    private BusinessMetadata businessMetadata;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("ForeignKey")
    private Boolean foreignKey;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PartitionKey")
    private Boolean partitionKey;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Integer position;

    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    private Boolean primaryKey;

    @com.aliyun.core.annotation.NameInMap("TableId")
    private String tableId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private Column(Builder builder) {
        this.businessMetadata = builder.businessMetadata;
        this.comment = builder.comment;
        this.foreignKey = builder.foreignKey;
        this.id = builder.id;
        this.name = builder.name;
        this.partitionKey = builder.partitionKey;
        this.position = builder.position;
        this.primaryKey = builder.primaryKey;
        this.tableId = builder.tableId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Column create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessMetadata
     */
    public BusinessMetadata getBusinessMetadata() {
        return this.businessMetadata;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return foreignKey
     */
    public Boolean getForeignKey() {
        return this.foreignKey;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partitionKey
     */
    public Boolean getPartitionKey() {
        return this.partitionKey;
    }

    /**
     * @return position
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * @return primaryKey
     */
    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return tableId
     */
    public String getTableId() {
        return this.tableId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private BusinessMetadata businessMetadata; 
        private String comment; 
        private Boolean foreignKey; 
        private String id; 
        private String name; 
        private Boolean partitionKey; 
        private Integer position; 
        private Boolean primaryKey; 
        private String tableId; 
        private String type; 

        private Builder() {
        } 

        private Builder(Column model) {
            this.businessMetadata = model.businessMetadata;
            this.comment = model.comment;
            this.foreignKey = model.foreignKey;
            this.id = model.id;
            this.name = model.name;
            this.partitionKey = model.partitionKey;
            this.position = model.position;
            this.primaryKey = model.primaryKey;
            this.tableId = model.tableId;
            this.type = model.type;
        } 

        /**
         * BusinessMetadata.
         */
        public Builder businessMetadata(BusinessMetadata businessMetadata) {
            this.businessMetadata = businessMetadata;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * ForeignKey.
         */
        public Builder foreignKey(Boolean foreignKey) {
            this.foreignKey = foreignKey;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PartitionKey.
         */
        public Builder partitionKey(Boolean partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /**
         * PrimaryKey.
         */
        public Builder primaryKey(Boolean primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * TableId.
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Column build() {
            return new Column(this);
        } 

    } 

    /**
     * 
     * {@link Column} extends {@link TeaModel}
     *
     * <p>Column</p>
     */
    public static class BusinessMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private BusinessMetadata(Builder builder) {
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BusinessMetadata create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String description; 

            private Builder() {
            } 

            private Builder(BusinessMetadata model) {
                this.description = model.description;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public BusinessMetadata build() {
                return new BusinessMetadata(this);
            } 

        } 

    }
}
