// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link DeleteDataCheckTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataCheckTemplateRequest</p>
 */
public class DeleteDataCheckTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateIds")
    private java.util.List<String> templateIds;

    private DeleteDataCheckTemplateRequest(Builder builder) {
        super(builder);
        this.templateIds = builder.templateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataCheckTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDataCheckTemplateRequest, Builder> {
        private java.util.List<String> templateIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataCheckTemplateRequest request) {
            super(request);
            this.templateIds = request.templateIds;
        } 

        /**
         * <p>The list of validation template IDs. Batch operations are supported.</p>
         */
        public Builder templateIds(java.util.List<String> templateIds) {
            this.putBodyParameter("templateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        @Override
        public DeleteDataCheckTemplateRequest build() {
            return new DeleteDataCheckTemplateRequest(this);
        } 

    } 

}
