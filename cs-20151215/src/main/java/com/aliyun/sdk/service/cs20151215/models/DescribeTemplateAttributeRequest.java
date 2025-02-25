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
         * <p>The ID of the template.</p>
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
         * <p>The type of template. The value can be a custom value.</p>
         * <ul>
         * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
         * <li>If the parameter is set to <code>compose</code>, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</li>
         * <li>If the value of the parameter is not <code>kubernetes</code>, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to <code>kubernetes</code>.</li>
         * </ul>
         * <p>Default value: <code>kubernetes</code>.</p>
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
