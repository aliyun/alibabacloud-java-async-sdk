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
 * {@link WatermarkSpec} extends {@link TeaModel}
 *
 * <p>WatermarkSpec</p>
 */
public class WatermarkSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("column")
    private String column;

    @com.aliyun.core.annotation.NameInMap("watermarkExpression")
    private String watermarkExpression;

    @com.aliyun.core.annotation.NameInMap("watermarkType")
    private String watermarkType;

    private WatermarkSpec(Builder builder) {
        this.column = builder.column;
        this.watermarkExpression = builder.watermarkExpression;
        this.watermarkType = builder.watermarkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WatermarkSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return column
     */
    public String getColumn() {
        return this.column;
    }

    /**
     * @return watermarkExpression
     */
    public String getWatermarkExpression() {
        return this.watermarkExpression;
    }

    /**
     * @return watermarkType
     */
    public String getWatermarkType() {
        return this.watermarkType;
    }

    public static final class Builder {
        private String column; 
        private String watermarkExpression; 
        private String watermarkType; 

        private Builder() {
        } 

        private Builder(WatermarkSpec model) {
            this.column = model.column;
            this.watermarkExpression = model.watermarkExpression;
            this.watermarkType = model.watermarkType;
        } 

        /**
         * column.
         */
        public Builder column(String column) {
            this.column = column;
            return this;
        }

        /**
         * watermarkExpression.
         */
        public Builder watermarkExpression(String watermarkExpression) {
            this.watermarkExpression = watermarkExpression;
            return this;
        }

        /**
         * watermarkType.
         */
        public Builder watermarkType(String watermarkType) {
            this.watermarkType = watermarkType;
            return this;
        }

        public WatermarkSpec build() {
            return new WatermarkSpec(this);
        } 

    } 

}
