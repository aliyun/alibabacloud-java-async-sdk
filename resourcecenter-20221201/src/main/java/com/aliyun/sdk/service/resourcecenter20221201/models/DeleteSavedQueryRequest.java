// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavedQueryRequest</p>
 */
public class DeleteSavedQueryRequest extends Request {
    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private DeleteSavedQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavedQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<DeleteSavedQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavedQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * The ID of the template.
         * <p>
         * 
         * You can call the [ListSavedQueries](~~ListSavedQueries~~) operation to obtain the template ID.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public DeleteSavedQueryRequest build() {
            return new DeleteSavedQueryRequest(this);
        } 

    } 

}
