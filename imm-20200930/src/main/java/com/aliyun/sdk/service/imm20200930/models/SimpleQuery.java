// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SimpleQuery} extends {@link TeaModel}
 *
 * <p>SimpleQuery</p>
 */
public class SimpleQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    @com.aliyun.core.annotation.NameInMap("SubQueries")
    private java.util.List<SimpleQuery> subQueries;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private SimpleQuery(Builder builder) {
        this.field = builder.field;
        this.operation = builder.operation;
        this.subQueries = builder.subQueries;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return field
     */
    public String getField() {
        return this.field;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return subQueries
     */
    public java.util.List<SimpleQuery> getSubQueries() {
        return this.subQueries;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String operation; 
        private java.util.List<SimpleQuery> subQueries; 
        private String value; 

        private Builder() {
        } 

        private Builder(SimpleQuery model) {
            this.field = model.field;
            this.operation = model.operation;
            this.subQueries = model.subQueries;
            this.value = model.value;
        } 

        /**
         * <p>This parameter is required. The field name. For a list of the supported fields, see <a href="https://help.aliyun.com/document_detail/252856.html">Supported fields and operators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Size</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>This parameter is required. The operator.</p>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>exist: exists query.</li>
         * <li>not: logical NOT.</li>
         * <li>or: logical OR.</li>
         * <li>prefix: prefix query.</li>
         * <li>and: logical AND.</li>
         * <li>It: less than.</li>
         * <li>match-phrase: string match query.</li>
         * <li>gte: greater than or equal to.</li>
         * <li>eq: equal to.</li>
         * <li>lte: less than or equal to.</li>
         * <li>gt: greater than.</li>
         * <li>nested: You can perform logical condition queries within the same object when the data type of a field is ARRAY.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        public Builder operation(String operation) {
            this.operation = operation;
            return this;
        }

        /**
         * <p>The subquery structure.</p>
         * <p>You can configure Subquery conditions only if you set the Operation parameter to and, or, not, or nested.</p>
         * <p>If you set the Operation parameter to and, or, or not, all query conditions specified by the SubQueries parameter must comply with the logical relationship of the parent query condition.</p>
         * <p>If you set the Operation parameter to nested, the parent field of a subquery must be of the ARRAY type, such as Labels. The operator of a subquery condition must be one or more of the following operators: and, or, and not. The field of the subquery must be a sub-field of the parent field.</p>
         * <p>For information about how to call the SimpleQuery operation, see <a href="https://help.aliyun.com/document_detail/478175.html">SimpleQuery</a>.</p>
         */
        public Builder subQueries(java.util.List<SimpleQuery> subQueries) {
            this.subQueries = subQueries;
            return this;
        }

        /**
         * <p>The field value. If you set the Operation parameter to and, or, not, or nested, this parameter is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public SimpleQuery build() {
            return new SimpleQuery(this);
        } 

    } 

}
