// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link PrimaryKey} extends {@link TeaModel}
 *
 * <p>PrimaryKey</p>
 */
public class PrimaryKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> columns;

    @com.aliyun.core.annotation.NameInMap("constraintName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constraintName;

    @com.aliyun.core.annotation.NameInMap("constraintType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String constraintType;

    @com.aliyun.core.annotation.NameInMap("enforced")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enforced;

    private PrimaryKey(Builder builder) {
        this.columns = builder.columns;
        this.constraintName = builder.constraintName;
        this.constraintType = builder.constraintType;
        this.enforced = builder.enforced;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrimaryKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columns
     */
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    /**
     * @return constraintName
     */
    public String getConstraintName() {
        return this.constraintName;
    }

    /**
     * @return constraintType
     */
    public String getConstraintType() {
        return this.constraintType;
    }

    /**
     * @return enforced
     */
    public Boolean getEnforced() {
        return this.enforced;
    }

    public static final class Builder {
        private java.util.List<String> columns; 
        private String constraintName; 
        private String constraintType; 
        private Boolean enforced; 

        private Builder() {
        } 

        private Builder(PrimaryKey model) {
            this.columns = model.columns;
            this.constraintName = model.constraintName;
            this.constraintType = model.constraintType;
            this.enforced = model.enforced;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder columns(java.util.List<String> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder constraintName(String constraintName) {
            this.constraintName = constraintName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder constraintType(String constraintType) {
            this.constraintType = constraintType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enforced(Boolean enforced) {
            this.enforced = enforced;
            return this;
        }

        public PrimaryKey build() {
            return new PrimaryKey(this);
        } 

    } 

}
