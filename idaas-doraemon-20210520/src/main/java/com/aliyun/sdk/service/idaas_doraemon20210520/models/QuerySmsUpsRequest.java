// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsUpsRequest} extends {@link RequestModel}
 *
 * <p>QuerySmsUpsRequest</p>
 */
public class QuerySmsUpsRequest extends Request {
    private QuerySmsUpsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsUpsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QuerySmsUpsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QuerySmsUpsRequest request) {
            super(request);
        } 

        @Override
        public QuerySmsUpsRequest build() {
            return new QuerySmsUpsRequest(this);
        } 

    } 

}
