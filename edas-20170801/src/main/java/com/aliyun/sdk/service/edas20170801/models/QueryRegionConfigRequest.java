// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegionConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryRegionConfigRequest</p>
 */
public class QueryRegionConfigRequest extends Request {
    private QueryRegionConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryRegionConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryRegionConfigRequest request) {
            super(request);
        } 

        @Override
        public QueryRegionConfigRequest build() {
            return new QueryRegionConfigRequest(this);
        } 

    } 

}
