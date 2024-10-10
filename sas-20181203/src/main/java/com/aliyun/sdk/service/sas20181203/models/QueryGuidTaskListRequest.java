// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGuidTaskListRequest} extends {@link RequestModel}
 *
 * <p>QueryGuidTaskListRequest</p>
 */
public class QueryGuidTaskListRequest extends Request {
    private QueryGuidTaskListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGuidTaskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryGuidTaskListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryGuidTaskListRequest request) {
            super(request);
        } 

        @Override
        public QueryGuidTaskListRequest build() {
            return new QueryGuidTaskListRequest(this);
        } 

    } 

}
