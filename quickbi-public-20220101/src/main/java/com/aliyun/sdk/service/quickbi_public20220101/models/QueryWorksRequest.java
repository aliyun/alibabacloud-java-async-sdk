// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryWorksRequest} extends {@link RequestModel}
 *
 * <p>QueryWorksRequest</p>
 */
public class QueryWorksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorksId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String worksId;

    private QueryWorksRequest(Builder builder) {
        super(builder);
        this.worksId = builder.worksId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorksRequest create() {
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

    public static final class Builder extends Request.Builder<QueryWorksRequest, Builder> {
        private String worksId; 

        private Builder() {
            super();
        } 

        private Builder(QueryWorksRequest request) {
            super(request);
            this.worksId = request.worksId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd****</p>
         */
        public Builder worksId(String worksId) {
            this.putQueryParameter("WorksId", worksId);
            this.worksId = worksId;
            return this;
        }

        @Override
        public QueryWorksRequest build() {
            return new QueryWorksRequest(this);
        } 

    } 

}
