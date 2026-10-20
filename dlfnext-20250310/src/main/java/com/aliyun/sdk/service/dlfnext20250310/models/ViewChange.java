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
 * {@link ViewChange} extends {@link TeaModel}
 *
 * <p>ViewChange</p>
 */
public class ViewChange extends TeaModel {
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

    private ViewChange(Builder builder) {
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

    public static ViewChange create() {
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

        private Builder(ViewChange model) {
            this.action = model.action;
            this.comment = model.comment;
            this.dialect = model.dialect;
            this.key = model.key;
            this.query = model.query;
            this.value = model.value;
        } 

        /**
         * <p>The type of the view change operation.</p>
         * 
         * <strong>example:</strong>
         * <p>updateComment</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The view comment. Required when you perform the updateComment operation.</p>
         * 
         * <strong>example:</strong>
         * <p>View update description</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The dialect used in the view query statement. Required when you perform the addDialect, updateDialect, or dropDialect operation.</p>
         * 
         * <strong>example:</strong>
         * <p>flink</p>
         */
        public Builder dialect(String dialect) {
            this.dialect = dialect;
            return this;
        }

        /**
         * <p>The key of the view property. Required when you perform the setOption or removeOption operation.</p>
         * 
         * <strong>example:</strong>
         * <p>view_option</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The view query statement. Required when you perform the addDialect or updateDialect operation.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT region, SUM(amount) AS total_amount FROM sales GROUP BY region</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The value of the view property. Required when you perform the setOption operation.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ViewChange build() {
            return new ViewChange(this);
        } 

    } 

}
