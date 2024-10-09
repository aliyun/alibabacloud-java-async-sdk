// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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

    private WatermarkSpec(Builder builder) {
        this.column = builder.column;
        this.watermarkExpression = builder.watermarkExpression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WatermarkSpec create() {
        return builder().build();
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

    public static final class Builder {
        private String column; 
        private String watermarkExpression; 

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

        public WatermarkSpec build() {
            return new WatermarkSpec(this);
        } 

    } 

}
