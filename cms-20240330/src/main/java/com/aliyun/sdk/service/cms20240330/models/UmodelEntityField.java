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
 * {@link UmodelEntityField} extends {@link TeaModel}
 *
 * <p>UmodelEntityField</p>
 */
public class UmodelEntityField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("field")
    private String field;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UmodelEntityField(Builder builder) {
        this.field = builder.field;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UmodelEntityField create() {
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String field; 
        private String value; 

        private Builder() {
        } 

        private Builder(UmodelEntityField model) {
            this.field = model.field;
            this.value = model.value;
        } 

        /**
         * <p>实体字段名</p>
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * <p>字段别名或展示值</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public UmodelEntityField build() {
            return new UmodelEntityField(this);
        } 

    } 

}
