// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetInsightTypesRequest} extends {@link RequestModel}
 *
 * <p>GetInsightTypesRequest</p>
 */
public class GetInsightTypesRequest extends Request {
    private GetInsightTypesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInsightTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetInsightTypesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetInsightTypesRequest request) {
            super(request);
        } 

        @Override
        public GetInsightTypesRequest build() {
            return new GetInsightTypesRequest(this);
        } 

    } 

}
