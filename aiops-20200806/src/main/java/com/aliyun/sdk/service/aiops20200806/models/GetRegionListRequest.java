// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionListRequest} extends {@link RequestModel}
 *
 * <p>GetRegionListRequest</p>
 */
public class GetRegionListRequest extends Request {
    private GetRegionListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetRegionListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetRegionListRequest request) {
            super(request);
        } 

        @Override
        public GetRegionListRequest build() {
            return new GetRegionListRequest(this);
        } 

    } 

}
