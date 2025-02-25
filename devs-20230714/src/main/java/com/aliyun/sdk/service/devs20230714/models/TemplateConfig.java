// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateConfig} extends {@link TeaModel}
 *
 * <p>TemplateConfig</p>
 */
public class TemplateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.NameInMap("templateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private TemplateConfig(Builder builder) {
        this.parameters = builder.parameters;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateConfig create() {
        return builder().build();
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private java.util.Map < String, ? > parameters; 
        private String templateName; 

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public TemplateConfig build() {
            return new TemplateConfig(this);
        } 

    } 

}
