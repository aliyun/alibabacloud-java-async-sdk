// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySyncStatusByAliUidRequest} extends {@link RequestModel}
 *
 * <p>QuerySyncStatusByAliUidRequest</p>
 */
public class QuerySyncStatusByAliUidRequest extends Request {
    private QuerySyncStatusByAliUidRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySyncStatusByAliUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QuerySyncStatusByAliUidRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QuerySyncStatusByAliUidRequest request) {
            super(request);
        } 

        @Override
        public QuerySyncStatusByAliUidRequest build() {
            return new QuerySyncStatusByAliUidRequest(this);
        } 

    } 

}
