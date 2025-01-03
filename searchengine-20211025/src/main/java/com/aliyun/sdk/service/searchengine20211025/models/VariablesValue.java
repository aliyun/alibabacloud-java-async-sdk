// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link VariablesValue} extends {@link TeaModel}
 *
 * <p>VariablesValue</p>
 */
public class VariablesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disableModify")
    private Boolean disableModify;

    @com.aliyun.core.annotation.NameInMap("isModify")
    private Boolean isModify;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("templateValue")
    private String templateValue;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("funcValue")
    private FuncValue funcValue;

    private VariablesValue(Builder builder) {
        this.disableModify = builder.disableModify;
        this.isModify = builder.isModify;
        this.value = builder.value;
        this.description = builder.description;
        this.templateValue = builder.templateValue;
        this.type = builder.type;
        this.funcValue = builder.funcValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VariablesValue create() {
        return builder().build();
    }

    /**
     * @return disableModify
     */
    public Boolean getDisableModify() {
        return this.disableModify;
    }

    /**
     * @return isModify
     */
    public Boolean getIsModify() {
        return this.isModify;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return templateValue
     */
    public String getTemplateValue() {
        return this.templateValue;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return funcValue
     */
    public FuncValue getFuncValue() {
        return this.funcValue;
    }

    public static final class Builder {
        private Boolean disableModify; 
        private Boolean isModify; 
        private String value; 
        private String description; 
        private String templateValue; 
        private String type; 
        private FuncValue funcValue; 

        /**
         * <p>Specifies whether the variable is not allowed to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableModify(Boolean disableModify) {
            this.disableModify = disableModify;
            return this;
        }

        /**
         * <p>Specifies whether the variable is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isModify(Boolean isModify) {
            this.isModify = isModify;
            return this;
        }

        /**
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The template value of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder templateValue(String templateValue) {
            this.templateValue = templateValue;
            return this;
        }

        /**
         * <p>The variable type. Valid values:</p>
         * <ul>
         * <li>NORMAL: common variable</li>
         * <li>FUNCTION: function variable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The function variables.</p>
         */
        public Builder funcValue(FuncValue funcValue) {
            this.funcValue = funcValue;
            return this;
        }

        public VariablesValue build() {
            return new VariablesValue(this);
        } 

    } 

    /**
     * 
     * {@link VariablesValue} extends {@link TeaModel}
     *
     * <p>VariablesValue</p>
     */
    public static class FuncValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("funcClassName")
        private String funcClassName;

        @com.aliyun.core.annotation.NameInMap("template")
        private String template;

        private FuncValue(Builder builder) {
            this.funcClassName = builder.funcClassName;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FuncValue create() {
            return builder().build();
        }

        /**
         * @return funcClassName
         */
        public String getFuncClassName() {
            return this.funcClassName;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String funcClassName; 
            private String template; 

            /**
             * <p>The class name of the function variable.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder funcClassName(String funcClassName) {
                this.funcClassName = funcClassName;
                return this;
            }

            /**
             * <p>The template of the function variable.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public FuncValue build() {
                return new FuncValue(this);
            } 

        } 

    }
}
