// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMessageTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddMessageTemplateRequest</p>
 */
public class AddMessageTemplateRequest extends Request {
    @Body
    @NameInMap("TemplateDetail")
    @Validation(required = true)
    private String templateDetail;

    @Body
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private AddMessageTemplateRequest(Builder builder) {
        super(builder);
        this.templateDetail = builder.templateDetail;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMessageTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateDetail
     */
    public String getTemplateDetail() {
        return this.templateDetail;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<AddMessageTemplateRequest, Builder> {
        private String templateDetail; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(AddMessageTemplateRequest request) {
            super(request);
            this.templateDetail = request.templateDetail;
            this.templateName = request.templateName;
        } 

        /**
         * TemplateDetail.
         */
        public Builder templateDetail(String templateDetail) {
            this.putBodyParameter("TemplateDetail", templateDetail);
            this.templateDetail = templateDetail;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public AddMessageTemplateRequest build() {
            return new AddMessageTemplateRequest(this);
        } 

    } 

}
