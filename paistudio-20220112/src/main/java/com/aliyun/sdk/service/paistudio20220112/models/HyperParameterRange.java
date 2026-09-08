// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link HyperParameterRange} extends {@link TeaModel}
 *
 * <p>HyperParameterRange</p>
 */
public class HyperParameterRange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enum")
    private java.util.List<String> _enum;

    @com.aliyun.core.annotation.NameInMap("ExclusiveMaximum")
    private Boolean exclusiveMaximum;

    @com.aliyun.core.annotation.NameInMap("ExclusiveMinimum")
    private Boolean exclusiveMinimum;

    @com.aliyun.core.annotation.NameInMap("MaxLength")
    private Long maxLength;

    @com.aliyun.core.annotation.NameInMap("Maximum")
    private String maximum;

    @com.aliyun.core.annotation.NameInMap("MinLength")
    private Long minLength;

    @com.aliyun.core.annotation.NameInMap("Minimum")
    private String minimum;

    @com.aliyun.core.annotation.NameInMap("Pattern")
    private String pattern;

    private HyperParameterRange(Builder builder) {
        this._enum = builder._enum;
        this.exclusiveMaximum = builder.exclusiveMaximum;
        this.exclusiveMinimum = builder.exclusiveMinimum;
        this.maxLength = builder.maxLength;
        this.maximum = builder.maximum;
        this.minLength = builder.minLength;
        this.minimum = builder.minimum;
        this.pattern = builder.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HyperParameterRange create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _enum
     */
    public java.util.List<String> get_enum() {
        return this._enum;
    }

    /**
     * @return exclusiveMaximum
     */
    public Boolean getExclusiveMaximum() {
        return this.exclusiveMaximum;
    }

    /**
     * @return exclusiveMinimum
     */
    public Boolean getExclusiveMinimum() {
        return this.exclusiveMinimum;
    }

    /**
     * @return maxLength
     */
    public Long getMaxLength() {
        return this.maxLength;
    }

    /**
     * @return maximum
     */
    public String getMaximum() {
        return this.maximum;
    }

    /**
     * @return minLength
     */
    public Long getMinLength() {
        return this.minLength;
    }

    /**
     * @return minimum
     */
    public String getMinimum() {
        return this.minimum;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    public static final class Builder {
        private java.util.List<String> _enum; 
        private Boolean exclusiveMaximum; 
        private Boolean exclusiveMinimum; 
        private Long maxLength; 
        private String maximum; 
        private Long minLength; 
        private String minimum; 
        private String pattern; 

        private Builder() {
        } 

        private Builder(HyperParameterRange model) {
            this._enum = model._enum;
            this.exclusiveMaximum = model.exclusiveMaximum;
            this.exclusiveMinimum = model.exclusiveMinimum;
            this.maxLength = model.maxLength;
            this.maximum = model.maximum;
            this.minLength = model.minLength;
            this.minimum = model.minimum;
            this.pattern = model.pattern;
        } 

        /**
         * <p>Hyperparameter enumeration list.</p>
         */
        public Builder _enum(java.util.List<String> _enum) {
            this._enum = _enum;
            return this;
        }

        /**
         * <p>Whether the maximum value is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exclusiveMaximum(Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        /**
         * <p>Whether the minimum value is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exclusiveMinimum(Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        /**
         * <p>Maximum length.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }

        /**
         * <p>Maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maximum(String maximum) {
            this.maximum = maximum;
            return this;
        }

        /**
         * <p>Minimum length.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * <p>Minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minimum(String minimum) {
            this.minimum = minimum;
            return this;
        }

        /**
         * <p>Regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>^\+?[1-9][0-9]*$</p>
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        public HyperParameterRange build() {
            return new HyperParameterRange(this);
        } 

    } 

}
