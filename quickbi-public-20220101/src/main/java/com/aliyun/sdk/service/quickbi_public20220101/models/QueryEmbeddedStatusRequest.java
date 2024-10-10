// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryEmbeddedStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryEmbeddedStatusRequest</p>
 */
public class QueryEmbeddedStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The work ID of the query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
