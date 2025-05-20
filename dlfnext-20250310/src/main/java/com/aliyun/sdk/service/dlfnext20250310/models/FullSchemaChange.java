// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link FullSchemaChange} extends {@link TeaModel}
 *
 * <p>FullSchemaChange</p>
 */
public class FullSchemaChange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private FullDataType dataType;

    @com.aliyun.core.annotation.NameInMap("fieldNames")
    private java.util.List<String> fieldNames;

    @com.aliyun.core.annotation.NameInMap("keepNullability")
    private Boolean keepNullability;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("move")
    private Move move;

    @com.aliyun.core.annotation.NameInMap("newComment")
    private String newComment;

    @com.aliyun.core.annotation.NameInMap("newDataType")
    private FullDataType newDataType;

    @com.aliyun.core.annotation.NameInMap("newName")
    private String newName;

    @com.aliyun.core.annotation.NameInMap("newNullability")
    private Boolean newNullability;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private FullSchemaChange(Builder builder) {
        this.action = builder.action;
        this.comment = builder.comment;
        this.dataType = builder.dataType;
        this.fieldNames = builder.fieldNames;
        this.keepNullability = builder.keepNullability;
        this.key = builder.key;
        this.move = builder.move;
        this.newComment = builder.newComment;
        this.newDataType = builder.newDataType;
        this.newName = builder.newName;
        this.newNullability = builder.newNullability;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FullSchemaChange create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return dataType
     */
    public FullDataType getDataType() {
        return this.dataType;
    }

    /**
     * @return fieldNames
     */
    public java.util.List<String> getFieldNames() {
        return this.fieldNames;
    }

    /**
     * @return keepNullability
     */
    public Boolean getKeepNullability() {
        return this.keepNullability;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return move
     */
    public Move getMove() {
        return this.move;
    }

    /**
     * @return newComment
     */
    public String getNewComment() {
        return this.newComment;
    }

    /**
     * @return newDataType
     */
    public FullDataType getNewDataType() {
        return this.newDataType;
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * @return newNullability
     */
    public Boolean getNewNullability() {
        return this.newNullability;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String action; 
        private String comment; 
        private FullDataType dataType; 
        private java.util.List<String> fieldNames; 
        private Boolean keepNullability; 
        private String key; 
        private Move move; 
        private String newComment; 
        private FullDataType newDataType; 
        private String newName; 
        private Boolean newNullability; 
        private String value; 

        private Builder() {
        } 

        private Builder(FullSchemaChange model) {
            this.action = model.action;
            this.comment = model.comment;
            this.dataType = model.dataType;
            this.fieldNames = model.fieldNames;
            this.keepNullability = model.keepNullability;
            this.key = model.key;
            this.move = model.move;
            this.newComment = model.newComment;
            this.newDataType = model.newDataType;
            this.newName = model.newName;
            this.newNullability = model.newNullability;
            this.value = model.value;
        } 

        /**
         * action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>required in UpdateComment/AddColumn</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(FullDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>required in AddColumn/RenameColumn/DropColumn/UpdateColumnComment/UpdateColumnType/UpdateColumnNullability</p>
         */
        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            return this;
        }

        /**
         * <p>required in UpdateColumnType</p>
         */
        public Builder keepNullability(Boolean keepNullability) {
            this.keepNullability = keepNullability;
            return this;
        }

        /**
         * <p>required in SetOption/RemoveOption</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * move.
         */
        public Builder move(Move move) {
            this.move = move;
            return this;
        }

        /**
         * <p>required in UpdateColumnComment</p>
         */
        public Builder newComment(String newComment) {
            this.newComment = newComment;
            return this;
        }

        /**
         * newDataType.
         */
        public Builder newDataType(FullDataType newDataType) {
            this.newDataType = newDataType;
            return this;
        }

        /**
         * <p>required in RenameColumn</p>
         */
        public Builder newName(String newName) {
            this.newName = newName;
            return this;
        }

        /**
         * <p>required in UpdateColumnNullability</p>
         */
        public Builder newNullability(Boolean newNullability) {
            this.newNullability = newNullability;
            return this;
        }

        /**
         * <p>required in SetOption</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FullSchemaChange build() {
            return new FullSchemaChange(this);
        } 

    } 

}
