// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeTemplateResponseBody</p>
 */
public class GetResourceTypeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateBody")
    private java.util.Map < String, ? > templateBody;

    @NameInMap("TemplateContent")
    private String templateContent;

    private GetResourceTypeTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateBody = builder.templateBody;
        this.templateContent = builder.templateContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateBody
     */
    public java.util.Map < String, ? > getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > templateBody; 
        private String templateContent; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(java.util.Map < String, ? > templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }

        public GetResourceTypeTemplateResponseBody build() {
            return new GetResourceTypeTemplateResponseBody(this);
        } 

    } 

}
