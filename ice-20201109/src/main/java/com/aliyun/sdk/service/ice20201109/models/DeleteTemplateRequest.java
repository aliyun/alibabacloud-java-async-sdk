// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateRequest</p>
 */
public class DeleteTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private String templateIds;

    private DeleteTemplateRequest(Builder builder) {
        super(builder);
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateIds
     */
    public String getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateRequest, Builder> {
        private String templateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateRequest request) {
            super(request);
            this.templateIds = request.templateIds;
        } 

        /**
         * TemplateIds.
         */
        public Builder templateIds(String templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public DeleteTemplateRequest build() {
            return new DeleteTemplateRequest(this);
        } 

    } 

}
