// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetQueryRequest} extends {@link RequestModel}
 *
 * <p>GetQueryRequest</p>
 */
public class GetQueryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queryId")
    private String queryId;

    private GetQueryRequest(Builder builder) {
        super(builder);
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryRequest create() {
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

    public static final class Builder extends Request.Builder<GetQueryRequest, Builder> {
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryRequest request) {
            super(request);
            this.queryId = request.queryId;
        } 

        /**
         * queryId.
         */
        public Builder queryId(String queryId) {
            this.putPathParameter("queryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public GetQueryRequest build() {
            return new GetQueryRequest(this);
        } 

    } 

}
