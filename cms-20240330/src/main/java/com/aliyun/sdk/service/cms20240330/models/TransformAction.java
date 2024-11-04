// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformAction} extends {@link TeaModel}
 *
 * <p>TransformAction</p>
 */
public class TransformAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("labelKey")
    private String labelKey;

    @com.aliyun.core.annotation.NameInMap("mapping")
    private java.util.Map < String, String > mapping;

    @com.aliyun.core.annotation.NameInMap("regExp")
    private String regExp;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("variable")
    private String variable;

    private TransformAction(Builder builder) {
        this.filterSetting = builder.filterSetting;
        this.labelKey = builder.labelKey;
        this.mapping = builder.mapping;
        this.regExp = builder.regExp;
        this.source = builder.source;
        this.target = builder.target;
        this.type = builder.type;
        this.value = builder.value;
        this.variable = builder.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformAction create() {
        return builder().build();
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return labelKey
     */
    public String getLabelKey() {
        return this.labelKey;
    }

    /**
     * @return mapping
     */
    public java.util.Map < String, String > getMapping() {
        return this.mapping;
    }

    /**
     * @return regExp
     */
    public String getRegExp() {
        return this.regExp;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return variable
     */
    public String getVariable() {
        return this.variable;
    }

    public static final class Builder {
        private FilterSetting filterSetting; 
        private String labelKey; 
        private java.util.Map < String, String > mapping; 
        private String regExp; 
        private String source; 
        private String target; 
        private String type; 
        private String value; 
        private String variable; 

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * labelKey.
         */
        public Builder labelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }

        /**
         * mapping.
         */
        public Builder mapping(java.util.Map < String, String > mapping) {
            this.mapping = mapping;
            return this;
        }

        /**
         * regExp.
         */
        public Builder regExp(String regExp) {
            this.regExp = regExp;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * variable.
         */
        public Builder variable(String variable) {
            this.variable = variable;
            return this;
        }

        public TransformAction build() {
            return new TransformAction(this);
        } 

    } 

}
