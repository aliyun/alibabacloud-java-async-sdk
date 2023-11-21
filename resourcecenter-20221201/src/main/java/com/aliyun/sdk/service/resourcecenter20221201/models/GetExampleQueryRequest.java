// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExampleQueryRequest} extends {@link RequestModel}
 *
 * <p>GetExampleQueryRequest</p>
 */
public class GetExampleQueryRequest extends Request {
    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private GetExampleQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExampleQueryRequest create() {
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

    public static final class Builder extends Request.Builder<GetExampleQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetExampleQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * The ID of the template.
         * <p>
         * 
         * >  You can call the [ListExampleQueries](~~ListExampleQueries~~) operation to obtain the template ID.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public GetExampleQueryRequest build() {
            return new GetExampleQueryRequest(this);
        } 

    } 

}
