// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigTemplateRequest</p>
 */
public class DeleteConfigTemplateRequest extends Request {
    @Query
    @NameInMap("Id")
    private Long id;

    private DeleteConfigTemplateRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteConfigTemplateRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigTemplateRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the configuration template.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteConfigTemplateRequest build() {
            return new DeleteConfigTemplateRequest(this);
        } 

    } 

}
