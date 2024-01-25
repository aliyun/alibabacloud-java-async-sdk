// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>RequestDeviceInfoRequest</p>
 */
public class RequestDeviceInfoRequest extends Request {
    private RequestDeviceInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestDeviceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestDeviceInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestDeviceInfoRequest request) {
            super(request);
        } 

        @Override
        public RequestDeviceInfoRequest build() {
            return new RequestDeviceInfoRequest(this);
        } 

    } 

}
