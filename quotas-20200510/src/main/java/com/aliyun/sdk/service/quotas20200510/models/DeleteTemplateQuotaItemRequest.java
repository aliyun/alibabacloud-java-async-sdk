// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateQuotaItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateQuotaItemRequest</p>
 */
public class DeleteTemplateQuotaItemRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteTemplateQuotaItemRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateQuotaItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateQuotaItemRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateQuotaItemRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 配额项ID
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteTemplateQuotaItemRequest build() {
            return new DeleteTemplateQuotaItemRequest(this);
        } 

    } 

}
