// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryEmbeddedStatusRequest</p>
 */
public class QueryEmbeddedStatusRequest extends Request {
    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private QueryEmbeddedStatusRequest(Builder builder) {
        super(builder);
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmbeddedStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return worksId
     */
    public String getWorksId() {
        return this.worksId;
    }

    public static final class Builder extends Request.Builder<QueryEmbeddedStatusRequest, Builder> {
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(QueryEmbeddedStatusRequest request) {
            super(request);
            this.worksId = request.worksId;
        } 

        /**
         * The work ID of the query.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public QueryEmbeddedStatusRequest build() {
            return new QueryEmbeddedStatusRequest(this);
        } 

    } 

}
