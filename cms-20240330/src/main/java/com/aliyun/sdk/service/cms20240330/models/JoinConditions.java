// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link JoinConditions} extends {@link TeaModel}
 *
 * <p>JoinConditions</p>
 */
public class JoinConditions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lhsField")
    private String lhsField;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("rhsField")
    private String rhsField;

    private JoinConditions(Builder builder) {
        this.lhsField = builder.lhsField;
        this.operator = builder.operator;
        this.rhsField = builder.rhsField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinConditions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lhsField
     */
    public String getLhsField() {
        return this.lhsField;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return rhsField
     */
    public String getRhsField() {
        return this.rhsField;
    }

    public static final class Builder {
        private String lhsField; 
        private String operator; 
        private String rhsField; 

        private Builder() {
        } 

        private Builder(JoinConditions model) {
            this.lhsField = model.lhsField;
            this.operator = model.operator;
            this.rhsField = model.rhsField;
        } 

        /**
         * <p>The left field in the format $<query_idx>.<field>, such as $0.hostIp.</p>
         * 
         * <strong>example:</strong>
         * <p>request_id</p>
         */
        public Builder lhsField(String lhsField) {
            this.lhsField = lhsField;
            return this;
        }

        /**
         * <p>The comparison operator. Valid values: == / != / &lt; / &gt; / &lt;= / &gt;=.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The right field in the format $<query_idx>.<field>, such as $1.hostIp.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_id</p>
         */
        public Builder rhsField(String rhsField) {
            this.rhsField = rhsField;
            return this;
        }

        public JoinConditions build() {
            return new JoinConditions(this);
        } 

    } 

}
