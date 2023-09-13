// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveRecordTemplateRequest</p>
 */
public class DeleteLiveRecordTemplateRequest extends Request {
    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteLiveRecordTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRecordTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteLiveRecordTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveRecordTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteLiveRecordTemplateRequest build() {
            return new DeleteLiveRecordTemplateRequest(this);
        } 

    } 

}
