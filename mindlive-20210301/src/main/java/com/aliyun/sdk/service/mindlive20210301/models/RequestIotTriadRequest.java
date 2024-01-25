// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestIotTriadRequest} extends {@link RequestModel}
 *
 * <p>RequestIotTriadRequest</p>
 */
public class RequestIotTriadRequest extends Request {
    private RequestIotTriadRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestIotTriadRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestIotTriadRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestIotTriadRequest request) {
            super(request);
        } 

        @Override
        public RequestIotTriadRequest build() {
            return new RequestIotTriadRequest(this);
        } 

    } 

}
