// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link QueryTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskConfigRequest</p>
 */
public class QueryTaskConfigRequest extends Request {
    private QueryTaskConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryTaskConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryTaskConfigRequest request) {
            super(request);
        } 

        @Override
        public QueryTaskConfigRequest build() {
            return new QueryTaskConfigRequest(this);
        } 

    } 

}
