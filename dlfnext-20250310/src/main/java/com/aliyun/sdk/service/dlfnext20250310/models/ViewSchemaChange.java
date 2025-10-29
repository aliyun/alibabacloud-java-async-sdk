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
 * {@link ViewSchemaChange} extends {@link TeaModel}
 *
 * <p>ViewSchemaChange</p>
 */
public class ViewSchemaChange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("dialect")
    private String dialect;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ViewSchemaChange(Builder builder) {
        this.action = builder.action;
        this.comment = builder.comment;
        this.dialect = builder.dialect;
        this.key = builder.key;
        this.query = builder.query;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ViewSchemaChange create() {
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
     * @return dialect
     */
    public String getDialect() {
        return this.dialect;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
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
        private String dialect; 
        private String key; 
        private String query; 
        private String value; 

        private Builder() {
        } 

        private Builder(ViewSchemaChange model) {
            this.action = model.action;
            this.comment = model.comment;
            this.dialect = model.dialect;
            this.key = model.key;
            this.query = model.query;
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
         * <p>required in UpdateComment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>required in AddDialect/UpdateDialect/DropDialect</p>
         */
        public Builder dialect(String dialect) {
            this.dialect = dialect;
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
         * <p>required in AddDialect/UpdateDialect</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>required in SetOption</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ViewSchemaChange build() {
            return new ViewSchemaChange(this);
        } 

    } 

}
