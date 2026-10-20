// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateAttributeRequest</p>
 */
public class DescribeTemplateAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("template_type")
    private String templateType;

    private DescribeTemplateAttributeRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateAttributeRequest, Builder> {
        private String templateId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateAttributeRequest request) {
            super(request);
            this.templateId = request.templateId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>874ec485-e7e6-4373-8a3b-47bde8a****</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The templatetype.</p>
         * <ul>
         * <li><p>If the value is set to <code>kubernetes</code>, the template is displayed on the Orchestration Templates page in the console.</p>
         * </li>
         * <li><p>If this parameter is left empty or set to other values, the template is not displayed on the Orchestration Templates page in the console.</p>
         * </li>
         * </ul>
         * <p>Settings this parameter to <code>kubernetes</code> is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("template_type", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public DescribeTemplateAttributeRequest build() {
            return new DescribeTemplateAttributeRequest(this);
        } 

    } 

}
