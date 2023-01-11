// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardStatusStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetCardStatusStatisticsRequest</p>
 */
public class GetCardStatusStatisticsRequest extends Request {
    private GetCardStatusStatisticsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardStatusStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetCardStatusStatisticsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetCardStatusStatisticsRequest request) {
            super(request);
        } 

        @Override
        public GetCardStatusStatisticsRequest build() {
            return new GetCardStatusStatisticsRequest(this);
        } 

    } 

}
