// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DeleteSystemPropertyTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteSystemPropertyTemplatesRequest</p>
 */
public class DeleteSystemPropertyTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private java.util.List<String> templateIds;

    private DeleteSystemPropertyTemplatesRequest(Builder builder) {
        super(builder);
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSystemPropertyTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateIds
     */
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public static final class Builder extends Request.Builder<DeleteSystemPropertyTemplatesRequest, Builder> {
        private java.util.List<String> templateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSystemPropertyTemplatesRequest request) {
            super(request);
            this.templateIds = request.templateIds;
        } 

        /**
         * TemplateIds.
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public DeleteSystemPropertyTemplatesRequest build() {
            return new DeleteSystemPropertyTemplatesRequest(this);
        } 

    } 

}
