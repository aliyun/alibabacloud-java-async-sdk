// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStorageCommodityListRequest} extends {@link RequestModel}
 *
 * <p>QueryStorageCommodityListRequest</p>
 */
public class QueryStorageCommodityListRequest extends Request {
    private QueryStorageCommodityListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStorageCommodityListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryStorageCommodityListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryStorageCommodityListRequest request) {
            super(request);
        } 

        @Override
        public QueryStorageCommodityListRequest build() {
            return new QueryStorageCommodityListRequest(this);
        } 

    } 

}
