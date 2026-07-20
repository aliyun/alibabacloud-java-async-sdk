// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link QueryGuideSubStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryGuideSubStatusRequest</p>
 */
public class QueryGuideSubStatusRequest extends Request {
    private QueryGuideSubStatusRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGuideSubStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryGuideSubStatusRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryGuideSubStatusRequest request) {
            super(request);
        } 

        @Override
        public QueryGuideSubStatusRequest build() {
            return new QueryGuideSubStatusRequest(this);
        } 

    } 

}
