// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PrimaryKey} extends {@link TeaModel}
 *
 * <p>PrimaryKey</p>
 */
public class PrimaryKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List < String > columns;

    @com.aliyun.core.annotation.NameInMap("constraintName")
    private String constraintName;

    private PrimaryKey(Builder builder) {
        this.columns = builder.columns;
        this.constraintName = builder.constraintName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrimaryKey create() {
        return builder().build();
    }

    /**
     * @return columns
     */
    public java.util.List < String > getColumns() {
        return this.columns;
    }

    /**
     * @return constraintName
     */
    public String getConstraintName() {
        return this.constraintName;
    }

    public static final class Builder {
        private java.util.List < String > columns; 
        private String constraintName; 

        /**
         * columns.
         */
        public Builder columns(java.util.List < String > columns) {
            this.columns = columns;
            return this;
        }

        /**
         * constraintName.
         */
        public Builder constraintName(String constraintName) {
            this.constraintName = constraintName;
            return this;
        }

        public PrimaryKey build() {
            return new PrimaryKey(this);
        } 

    } 

}
