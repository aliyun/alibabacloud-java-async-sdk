// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectApiInvokeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetFileDetectApiInvokeInfoRequest</p>
 */
public class GetFileDetectApiInvokeInfoRequest extends Request {
    private GetFileDetectApiInvokeInfoRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectApiInvokeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetFileDetectApiInvokeInfoRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetFileDetectApiInvokeInfoRequest request) {
            super(request);
        } 

        @Override
        public GetFileDetectApiInvokeInfoRequest build() {
            return new GetFileDetectApiInvokeInfoRequest(this);
        } 

    } 

}
