// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link QueryProjectListRequest} extends {@link RequestModel}
 *
 * <p>QueryProjectListRequest</p>
 */
public class QueryProjectListRequest extends Request {
    private QueryProjectListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProjectListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryProjectListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryProjectListRequest request) {
            super(request);
        } 

        @Override
        public QueryProjectListRequest build() {
            return new QueryProjectListRequest(this);
        } 

    } 

}
