// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentIconListRequest} extends {@link RequestModel}
 *
 * <p>QueryIncidentIconListRequest</p>
 */
public class QueryIncidentIconListRequest extends Request {
    private QueryIncidentIconListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentIconListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryIncidentIconListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryIncidentIconListRequest request) {
            super(request);
        } 

        @Override
        public QueryIncidentIconListRequest build() {
            return new QueryIncidentIconListRequest(this);
        } 

    } 

}
