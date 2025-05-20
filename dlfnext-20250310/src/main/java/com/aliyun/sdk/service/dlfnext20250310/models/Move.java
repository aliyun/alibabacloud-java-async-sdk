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
 * {@link Move} extends {@link TeaModel}
 *
 * <p>Move</p>
 */
public class Move extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fieldName")
    private String fieldName;

    @com.aliyun.core.annotation.NameInMap("referenceFieldName")
    private String referenceFieldName;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private Move(Builder builder) {
        this.fieldName = builder.fieldName;
        this.referenceFieldName = builder.referenceFieldName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Move create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return referenceFieldName
     */
    public String getReferenceFieldName() {
        return this.referenceFieldName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String fieldName; 
        private String referenceFieldName; 
        private String type; 

        private Builder() {
        } 

        private Builder(Move model) {
            this.fieldName = model.fieldName;
            this.referenceFieldName = model.referenceFieldName;
            this.type = model.type;
        } 

        /**
         * fieldName.
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * referenceFieldName.
         */
        public Builder referenceFieldName(String referenceFieldName) {
            this.referenceFieldName = referenceFieldName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Move build() {
            return new Move(this);
        } 

    } 

}
