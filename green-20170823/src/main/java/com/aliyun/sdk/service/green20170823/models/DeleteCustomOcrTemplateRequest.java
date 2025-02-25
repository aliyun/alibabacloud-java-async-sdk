// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomOcrTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomOcrTemplateRequest</p>
 */
public class DeleteCustomOcrTemplateRequest extends Request {
    @Query
    @NameInMap("Ids")
    @Validation(required = true)
    private String ids;

    private DeleteCustomOcrTemplateRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomOcrTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DeleteCustomOcrTemplateRequest, Builder> {
        private String ids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomOcrTemplateRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DeleteCustomOcrTemplateRequest build() {
            return new DeleteCustomOcrTemplateRequest(this);
        } 

    } 

}
