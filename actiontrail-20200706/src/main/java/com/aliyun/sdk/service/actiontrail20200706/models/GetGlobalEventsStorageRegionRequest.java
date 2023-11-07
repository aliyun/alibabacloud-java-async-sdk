// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGlobalEventsStorageRegionRequest} extends {@link RequestModel}
 *
 * <p>GetGlobalEventsStorageRegionRequest</p>
 */
public class GetGlobalEventsStorageRegionRequest extends Request {
    private GetGlobalEventsStorageRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalEventsStorageRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetGlobalEventsStorageRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetGlobalEventsStorageRegionRequest request) {
            super(request);
        } 

        @Override
        public GetGlobalEventsStorageRegionRequest build() {
            return new GetGlobalEventsStorageRegionRequest(this);
        } 

    } 

}
