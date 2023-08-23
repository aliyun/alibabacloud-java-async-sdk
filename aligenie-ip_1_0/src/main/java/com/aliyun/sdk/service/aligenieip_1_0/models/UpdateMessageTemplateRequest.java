// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageTemplateRequest</p>
 */
public class UpdateMessageTemplateRequest extends Request {
    @Body
    @NameInMap("TemplateDetail")
    private String templateDetail;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    @Body
    @NameInMap("TemplateName")
    private String templateName;

    private UpdateMessageTemplateRequest(Builder builder) {
        super(builder);
        this.templateDetail = builder.templateDetail;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageTemplateRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<UpdateMessageTemplateRequest, Builder> {
        private String templateDetail; 
        private Long templateId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageTemplateRequest request) {
            super(request);
            this.templateDetail = request.templateDetail;
            this.templateId = request.templateId;
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
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
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
        public UpdateMessageTemplateRequest build() {
            return new UpdateMessageTemplateRequest(this);
        } 

    } 

}
