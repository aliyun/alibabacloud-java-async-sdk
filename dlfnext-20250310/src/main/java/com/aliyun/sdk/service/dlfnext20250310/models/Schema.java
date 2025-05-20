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
 * {@link Schema} extends {@link TeaModel}
 *
 * <p>Schema</p>
 */
public class Schema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<DataField> fields;

    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("partitionKeys")
    private java.util.List<String> partitionKeys;

    @com.aliyun.core.annotation.NameInMap("primaryKeys")
    private java.util.List<String> primaryKeys;

    private Schema(Builder builder) {
        this.comment = builder.comment;
        this.fields = builder.fields;
        this.options = builder.options;
        this.partitionKeys = builder.partitionKeys;
        this.primaryKeys = builder.primaryKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schema create() {
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
     * @return fields
     */
    public java.util.List<DataField> getFields() {
        return this.fields;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return partitionKeys
     */
    public java.util.List<String> getPartitionKeys() {
        return this.partitionKeys;
    }

    /**
     * @return primaryKeys
     */
    public java.util.List<String> getPrimaryKeys() {
        return this.primaryKeys;
    }

    public static final class Builder {
        private String comment; 
        private java.util.List<DataField> fields; 
        private java.util.Map<String, String> options; 
        private java.util.List<String> partitionKeys; 
        private java.util.List<String> primaryKeys; 

        private Builder() {
        } 

        private Builder(Schema model) {
            this.comment = model.comment;
            this.fields = model.fields;
            this.options = model.options;
            this.partitionKeys = model.partitionKeys;
            this.primaryKeys = model.primaryKeys;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * fields.
         */
        public Builder fields(java.util.List<DataField> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }

        /**
         * partitionKeys.
         */
        public Builder partitionKeys(java.util.List<String> partitionKeys) {
            this.partitionKeys = partitionKeys;
            return this;
        }

        /**
         * primaryKeys.
         */
        public Builder primaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }

        public Schema build() {
            return new Schema(this);
        } 

    } 

}
