// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    private GetTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateBody = builder.templateBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getTemplateBody() {
        return this.templateBody;
    }

    public static final class Builder {
        private String requestId; 
        private String templateBody; 

        private Builder() {
        } 

        private Builder(GetTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.templateBody = model.templateBody;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The content of the template.</p>
         * <p>For more information about the template syntax, see <a href="https://help.aliyun.com/document_detail/184397.html">Structure of Terraform templates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
         *   &quot;Transform&quot;: &quot;Aliyun::Terraform-v1.1&quot;,
         *   &quot;Workspace&quot;: {
         *     &quot;main.tf&quot;: &quot;variable  &quot;name&quot; {  default = &quot;auto_provisioning_group&quot;}&quot;
         *   },
         *   &quot;Outputs&quot;: {}
         * }</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

}
