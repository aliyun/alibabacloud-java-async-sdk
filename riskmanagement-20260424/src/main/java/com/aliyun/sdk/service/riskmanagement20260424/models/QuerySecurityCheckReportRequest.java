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
 * {@link QuerySecurityCheckReportRequest} extends {@link RequestModel}
 *
 * <p>QuerySecurityCheckReportRequest</p>
 */
public class QuerySecurityCheckReportRequest extends Request {
    private QuerySecurityCheckReportRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecurityCheckReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QuerySecurityCheckReportRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QuerySecurityCheckReportRequest request) {
            super(request);
        } 

        @Override
        public QuerySecurityCheckReportRequest build() {
            return new QuerySecurityCheckReportRequest(this);
        } 

    } 

}
