// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiStoreTemplate} extends {@link TeaModel}
 *
 * <p>AiStoreTemplate</p>
 */
public class AiStoreTemplate extends TeaModel {
    @NameInMap("TemplateContext")
    private String templateContext;

    @NameInMap("TemplateVariable")
    private String templateVariable;

    private AiStoreTemplate(Builder builder) {
        this.templateContext = builder.templateContext;
        this.templateVariable = builder.templateVariable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiStoreTemplate create() {
        return builder().build();
    }

    /**
     * @return templateContext
     */
    public String getTemplateContext() {
        return this.templateContext;
    }

    /**
     * @return templateVariable
     */
    public String getTemplateVariable() {
        return this.templateVariable;
    }

    public static final class Builder {
        private String templateContext; 
        private String templateVariable; 

        /**
         * TemplateContext.
         */
        public Builder templateContext(String templateContext) {
            this.templateContext = templateContext;
            return this;
        }

        /**
         * TemplateVariable.
         */
        public Builder templateVariable(String templateVariable) {
            this.templateVariable = templateVariable;
            return this;
        }

        public AiStoreTemplate build() {
            return new AiStoreTemplate(this);
        } 

    } 

}
