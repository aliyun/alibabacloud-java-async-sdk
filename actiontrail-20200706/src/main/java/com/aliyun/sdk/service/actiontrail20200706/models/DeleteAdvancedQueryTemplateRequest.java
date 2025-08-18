// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DeleteAdvancedQueryTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteAdvancedQueryTemplateRequest</p>
 */
public class DeleteAdvancedQueryTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private DeleteAdvancedQueryTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAdvancedQueryTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAdvancedQueryTemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAdvancedQueryTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteAdvancedQueryTemplateRequest build() {
            return new DeleteAdvancedQueryTemplateRequest(this);
        } 

    } 

}
