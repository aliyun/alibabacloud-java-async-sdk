// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the template.
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The type of template. The value can be a custom value.
         * <p>
         * 
         * *   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.
         * *   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.
         * *   If the value of the parameter is not `kubernetes`, the template is not displayed on the Templates page in the console. We recommend that you set the parameter to `kubernetes`.
         * 
         * Default value: `kubernetes`.
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
