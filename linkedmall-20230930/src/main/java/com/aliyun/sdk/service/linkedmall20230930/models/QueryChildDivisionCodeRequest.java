// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChildDivisionCodeRequest} extends {@link RequestModel}
 *
 * <p>QueryChildDivisionCodeRequest</p>
 */
public class QueryChildDivisionCodeRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private DivisionQuery body;

    private QueryChildDivisionCodeRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChildDivisionCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public DivisionQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<QueryChildDivisionCodeRequest, Builder> {
        private DivisionQuery body; 

        private Builder() {
            super();
        } 

        private Builder(QueryChildDivisionCodeRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(DivisionQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public QueryChildDivisionCodeRequest build() {
            return new QueryChildDivisionCodeRequest(this);
        } 

    } 

}
