// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponseBody</p>
 */
public class CreateTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("template_id")
    private String templateId;

    private CreateTemplateResponseBody(Builder builder) {
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String templateId; 

        /**
         * <p>The ID of the orchestration template.</p>
         * 
         * <strong>example:</strong>
         * <p>ba1fe77b-b01e-4640-b77e-8f1b80e3e3cf</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public CreateTemplateResponseBody build() {
            return new CreateTemplateResponseBody(this);
        } 

    } 

}
