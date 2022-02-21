// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateAttributeRequest</p>
 */
public class DescribeTemplateAttributeRequest extends Request {
    @Path
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DescribeTemplateAttributeRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
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

    public static final class Builder extends Request.Builder<DescribeTemplateAttributeRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateAttributeRequest response) {
            super(response);
            this.templateId = response.templateId;
        } 

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DescribeTemplateAttributeRequest build() {
            return new DescribeTemplateAttributeRequest(this);
        } 

    } 

}
