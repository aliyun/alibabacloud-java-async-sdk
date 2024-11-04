// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertRuleAlertMetricParamDef} extends {@link TeaModel}
 *
 * <p>AlertRuleAlertMetricParamDef</p>
 */
public class AlertRuleAlertMetricParamDef extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxWidth")
    private Integer maxWidth;

    @com.aliyun.core.annotation.NameInMap("minWidth")
    private Integer minWidth;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("placeholderCn")
    private String placeholderCn;

    @com.aliyun.core.annotation.NameInMap("placeholderEn")
    private String placeholderEn;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("values")
    private java.util.List < Values> values;

    private AlertRuleAlertMetricParamDef(Builder builder) {
        this.maxWidth = builder.maxWidth;
        this.minWidth = builder.minWidth;
        this.name = builder.name;
        this.placeholderCn = builder.placeholderCn;
        this.placeholderEn = builder.placeholderEn;
        this.type = builder.type;
        this.value = builder.value;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricParamDef create() {
        return builder().build();
    }

    /**
     * @return maxWidth
     */
    public Integer getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * @return minWidth
     */
    public Integer getMinWidth() {
        return this.minWidth;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return placeholderCn
     */
    public String getPlaceholderCn() {
        return this.placeholderCn;
    }

    /**
     * @return placeholderEn
     */
    public String getPlaceholderEn() {
        return this.placeholderEn;
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
     * @return values
     */
    public java.util.List < Values> getValues() {
        return this.values;
    }

    public static final class Builder {
        private Integer maxWidth; 
        private Integer minWidth; 
        private String name; 
        private String placeholderCn; 
        private String placeholderEn; 
        private String type; 
        private String value; 
        private java.util.List < Values> values; 

        /**
         * maxWidth.
         */
        public Builder maxWidth(Integer maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        /**
         * minWidth.
         */
        public Builder minWidth(Integer minWidth) {
            this.minWidth = minWidth;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * placeholderCn.
         */
        public Builder placeholderCn(String placeholderCn) {
            this.placeholderCn = placeholderCn;
            return this;
        }

        /**
         * placeholderEn.
         */
        public Builder placeholderEn(String placeholderEn) {
            this.placeholderEn = placeholderEn;
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
         * values.
         */
        public Builder values(java.util.List < Values> values) {
            this.values = values;
            return this;
        }

        public AlertRuleAlertMetricParamDef build() {
            return new AlertRuleAlertMetricParamDef(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleAlertMetricParamDef} extends {@link TeaModel}
     *
     * <p>AlertRuleAlertMetricParamDef</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("labelCn")
        private String labelCn;

        @com.aliyun.core.annotation.NameInMap("labelEn")
        private String labelEn;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Values(Builder builder) {
            this.labelCn = builder.labelCn;
            this.labelEn = builder.labelEn;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return labelCn
         */
        public String getLabelCn() {
            return this.labelCn;
        }

        /**
         * @return labelEn
         */
        public String getLabelEn() {
            return this.labelEn;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String labelCn; 
            private String labelEn; 
            private String value; 

            /**
             * labelCn.
             */
            public Builder labelCn(String labelCn) {
                this.labelCn = labelCn;
                return this;
            }

            /**
             * labelEn.
             */
            public Builder labelEn(String labelEn) {
                this.labelEn = labelEn;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
}
