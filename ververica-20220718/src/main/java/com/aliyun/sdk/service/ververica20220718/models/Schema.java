// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Schema} extends {@link TeaModel}
 *
 * <p>Schema</p>
 */
public class Schema extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List < TableColumn > columns;

    @com.aliyun.core.annotation.NameInMap("primaryKey")
    private PrimaryKey primaryKey;

    @com.aliyun.core.annotation.NameInMap("watermarkSpecs")
    private java.util.List < WatermarkSpec > watermarkSpecs;

    private Schema(Builder builder) {
        this.columns = builder.columns;
        this.primaryKey = builder.primaryKey;
        this.watermarkSpecs = builder.watermarkSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schema create() {
        return builder().build();
    }

    /**
     * @return columns
     */
    public java.util.List < TableColumn > getColumns() {
        return this.columns;
    }

    /**
     * @return primaryKey
     */
    public PrimaryKey getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * @return watermarkSpecs
     */
    public java.util.List < WatermarkSpec > getWatermarkSpecs() {
        return this.watermarkSpecs;
    }

    public static final class Builder {
        private java.util.List < TableColumn > columns; 
        private PrimaryKey primaryKey; 
        private java.util.List < WatermarkSpec > watermarkSpecs; 

        /**
         * columns.
         */
        public Builder columns(java.util.List < TableColumn > columns) {
            this.columns = columns;
            return this;
        }

        /**
         * primaryKey.
         */
        public Builder primaryKey(PrimaryKey primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        /**
         * watermarkSpecs.
         */
        public Builder watermarkSpecs(java.util.List < WatermarkSpec > watermarkSpecs) {
            this.watermarkSpecs = watermarkSpecs;
            return this;
        }

        public Schema build() {
            return new Schema(this);
        } 

    } 

}
