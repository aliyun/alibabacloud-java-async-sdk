// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private GetTemplateRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetTemplateRequest, Builder> {
        private String tenantId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.templateId = request.templateId;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
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
        public GetTemplateRequest build() {
            return new GetTemplateRequest(this);
        } 

    } 

}
