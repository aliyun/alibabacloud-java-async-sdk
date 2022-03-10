// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedStausRequest} extends {@link RequestModel}
 *
 * <p>QueryEmbeddedStausRequest</p>
 */
public class QueryEmbeddedStausRequest extends Request {
    @Query
    @NameInMap("WorksId")
    @Validation(required = true)
    private String worksId;

    private QueryEmbeddedStausRequest(Builder builder) {
        super(builder);
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmbeddedStausRequest create() {
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

    public static final class Builder extends Request.Builder<QueryEmbeddedStausRequest, Builder> {
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(QueryEmbeddedStausRequest request) {
            super(request);
            this.worksId = request.worksId;
        } 

        /**
         * WorksId.
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public QueryEmbeddedStausRequest build() {
            return new QueryEmbeddedStausRequest(this);
        } 

    } 

}
