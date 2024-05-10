// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeTemplateResponseBody</p>
 */
public class GetResourceTypeTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private java.util.Map < String, ? > templateBody;

    @com.aliyun.core.annotation.NameInMap("TemplateContent")
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 51,200 bytes in length. For more information, see [Template syntax](~~28857~~).
         * <p>
         * 
         * > We recommend that use TemplateContent instead of TemplateBody.
         */
        public Builder templateBody(java.util.Map < String, ? > templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The JSON-formatted structure of the template body. For more information, see [Template syntax](~~28857~~).
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
