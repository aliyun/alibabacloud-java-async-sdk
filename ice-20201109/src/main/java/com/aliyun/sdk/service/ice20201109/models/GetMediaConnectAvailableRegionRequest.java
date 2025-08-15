// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaConnectAvailableRegionRequest} extends {@link RequestModel}
 *
 * <p>GetMediaConnectAvailableRegionRequest</p>
 */
public class GetMediaConnectAvailableRegionRequest extends Request {
    private GetMediaConnectAvailableRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaConnectAvailableRegionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMediaConnectAvailableRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMediaConnectAvailableRegionRequest request) {
            super(request);
        } 

        @Override
        public GetMediaConnectAvailableRegionRequest build() {
            return new GetMediaConnectAvailableRegionRequest(this);
        } 

    } 

}
