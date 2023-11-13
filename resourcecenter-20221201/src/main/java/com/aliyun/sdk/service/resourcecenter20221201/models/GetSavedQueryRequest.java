// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>GetSavedQueryRequest</p>
 */
public class GetSavedQueryRequest extends Request {
    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private GetSavedQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSavedQueryRequest create() {
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

    public static final class Builder extends Request.Builder<GetSavedQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetSavedQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public GetSavedQueryRequest build() {
            return new GetSavedQueryRequest(this);
        } 

    } 

}
