// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthVersionStatisticRequest} extends {@link RequestModel}
 *
 * <p>GetAuthVersionStatisticRequest</p>
 */
public class GetAuthVersionStatisticRequest extends Request {
    private GetAuthVersionStatisticRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthVersionStatisticRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAuthVersionStatisticRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAuthVersionStatisticRequest request) {
            super(request);
        } 

        @Override
        public GetAuthVersionStatisticRequest build() {
            return new GetAuthVersionStatisticRequest(this);
        } 

    } 

}
