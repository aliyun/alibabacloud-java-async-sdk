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
 * {@link UmodelEntityFilter} extends {@link TeaModel}
 *
 * <p>UmodelEntityFilter</p>
 */
public class UmodelEntityFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UmodelEntityFilter(Builder builder) {
        this.field = builder.field;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UmodelEntityFilter create() {
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
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String operator; 
        private String value; 

        private Builder() {
        } 

        private Builder(UmodelEntityFilter model) {
            this.field = model.field;
            this.operator = model.operator;
            this.value = model.value;
        } 

        /**
         * <p>过滤字段名</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>过滤操作符，仅支持 = 或 !=</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>过滤值</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public UmodelEntityFilter build() {
            return new UmodelEntityFilter(this);
        } 

    } 

}
