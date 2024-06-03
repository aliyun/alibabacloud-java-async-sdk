// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValueConstraints} extends {@link TeaModel}
 *
 * <p>ValueConstraints</p>
 */
public class ValueConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private Integer defaultValue;

    @com.aliyun.core.annotation.NameInMap("End")
    private Integer end;

    @com.aliyun.core.annotation.NameInMap("Start")
    private Integer start;

    @com.aliyun.core.annotation.NameInMap("Step")
    private Integer step;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List < Integer > values;

    private ValueConstraints(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.end = builder.end;
        this.start = builder.start;
        this.step = builder.step;
        this.type = builder.type;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValueConstraints create() {
        return builder().build();
    }

    /**
     * @return defaultValue
     */
    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return end
     */
    public Integer getEnd() {
        return this.end;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return step
     */
    public Integer getStep() {
        return this.step;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return values
     */
    public java.util.List < Integer > getValues() {
        return this.values;
    }

    public static final class Builder {
        private Integer defaultValue; 
        private Integer end; 
        private Integer start; 
        private Integer step; 
        private String type; 
        private java.util.List < Integer > values; 

        /**
         * 默认值。
         */
        public Builder defaultValue(Integer defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * 结束值。
         */
        public Builder end(Integer end) {
            this.end = end;
            return this;
        }

        /**
         * 起始值。
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * 步长。
         */
        public Builder step(Integer step) {
            this.step = step;
            return this;
        }

        /**
         * 值限制类型。
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 枚举值。
         */
        public Builder values(java.util.List < Integer > values) {
            this.values = values;
            return this;
        }

        public ValueConstraints build() {
            return new ValueConstraints(this);
        } 

    } 

}
