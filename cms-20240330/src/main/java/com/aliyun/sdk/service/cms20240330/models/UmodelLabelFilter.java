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
 * {@link UmodelLabelFilter} extends {@link TeaModel}
 *
 * <p>UmodelLabelFilter</p>
 */
public class UmodelLabelFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UmodelLabelFilter(Builder builder) {
        this.name = builder.name;
        this.operator = builder.operator;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UmodelLabelFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
        private String name; 
        private String operator; 
        private String value; 

        private Builder() {
        } 

        private Builder(UmodelLabelFilter model) {
            this.name = model.name;
            this.operator = model.operator;
            this.value = model.value;
        } 

        /**
         * <p>标签名</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>标签过滤操作符，仅支持 = 或 !=</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>标签值</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public UmodelLabelFilter build() {
            return new UmodelLabelFilter(this);
        } 

    } 

}
