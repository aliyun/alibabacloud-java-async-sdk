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
 * {@link ViewSchema} extends {@link TeaModel}
 *
 * <p>ViewSchema</p>
 */
public class ViewSchema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("dialects")
    private java.util.Map<String, String> dialects;

    @com.aliyun.core.annotation.NameInMap("fields")
    private java.util.List<DataField> fields;

    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private ViewSchema(Builder builder) {
        this.comment = builder.comment;
        this.dialects = builder.dialects;
        this.fields = builder.fields;
        this.options = builder.options;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSchema create() {
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
     * @return dialects
     */
    public java.util.Map<String, String> getDialects() {
        return this.dialects;
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
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder {
        private String comment; 
        private java.util.Map<String, String> dialects; 
        private java.util.List<DataField> fields; 
        private java.util.Map<String, String> options; 
        private String query; 

        private Builder() {
        } 

        private Builder(ViewSchema model) {
            this.comment = model.comment;
            this.dialects = model.dialects;
            this.fields = model.fields;
            this.options = model.options;
            this.query = model.query;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * dialects.
         */
        public Builder dialects(java.util.Map<String, String> dialects) {
            this.dialects = dialects;
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
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public ViewSchema build() {
            return new ViewSchema(this);
        } 

    } 

}
