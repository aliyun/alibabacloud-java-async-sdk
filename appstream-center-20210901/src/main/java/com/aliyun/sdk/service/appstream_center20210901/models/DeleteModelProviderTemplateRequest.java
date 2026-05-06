// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DeleteModelProviderTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelProviderTemplateRequest</p>
 */
public class DeleteModelProviderTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String providerTemplateId;

    private DeleteModelProviderTemplateRequest(Builder builder) {
        super(builder);
        this.providerTemplateId = builder.providerTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelProviderTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return providerTemplateId
     */
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public static final class Builder extends Request.Builder<DeleteModelProviderTemplateRequest, Builder> {
        private String providerTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelProviderTemplateRequest request) {
            super(request);
            this.providerTemplateId = request.providerTemplateId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mpt-xxxx</p>
         */
        public Builder providerTemplateId(String providerTemplateId) {
            this.putQueryParameter("ProviderTemplateId", providerTemplateId);
            this.providerTemplateId = providerTemplateId;
            return this;
        }

        @Override
        public DeleteModelProviderTemplateRequest build() {
            return new DeleteModelProviderTemplateRequest(this);
        } 

    } 

}
