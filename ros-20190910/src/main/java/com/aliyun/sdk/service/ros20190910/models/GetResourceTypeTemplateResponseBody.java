// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87F54B2B-AEF0-4C33-A72A-3F8856A575E9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The structure that contains the template body. The template body must be 1 to 51,200 bytes in length. For more information, see <a href="https://help.aliyun.com/document_detail/28857.html">Template syntax</a>.</p>
         * <blockquote>
         * <p>We recommend that use TemplateContent instead of TemplateBody.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(java.util.Map < String, ? > templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The JSON-formatted structure of the template body. For more information, see <a href="https://help.aliyun.com/document_detail/28857.html">Template syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;
         * }</p>
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
