// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApiRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiRequest</p>
 */
public class DeleteApiRequest extends Request {
    @Query
    @NameInMap("apiExternalId")
    private String apiExternalId;

    private DeleteApiRequest(Builder builder) {
        super(builder);
        this.apiExternalId = builder.apiExternalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiExternalId
     */
    public String getApiExternalId() {
        return this.apiExternalId;
    }

    public static final class Builder extends Request.Builder<DeleteApiRequest, Builder> {
        private String apiExternalId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiRequest request) {
            super(request);
            this.apiExternalId = request.apiExternalId;
        } 

        /**
         * apiExternalId.
         */
        public Builder apiExternalId(String apiExternalId) {
            this.putQueryParameter("apiExternalId", apiExternalId);
            this.apiExternalId = apiExternalId;
            return this;
        }

        @Override
        public DeleteApiRequest build() {
            return new DeleteApiRequest(this);
        } 

    } 

}
