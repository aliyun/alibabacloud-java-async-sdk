// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomTemplateResponseBody</p>
 */
public class GetCustomTemplateResponseBody extends TeaModel {
    @NameInMap("CustomTemplate")
    private String customTemplate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Template")
    private String template;

    private GetCustomTemplateResponseBody(Builder builder) {
        this.customTemplate = builder.customTemplate;
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return customTemplate
     */
    public String getCustomTemplate() {
        return this.customTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String customTemplate; 
        private String requestId; 
        private String template; 

        /**
         * CustomTemplate.
         */
        public Builder customTemplate(String customTemplate) {
            this.customTemplate = customTemplate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public GetCustomTemplateResponseBody build() {
            return new GetCustomTemplateResponseBody(this);
        } 

    } 

}
