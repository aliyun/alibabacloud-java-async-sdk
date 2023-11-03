// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssScanConfigRequest} extends {@link RequestModel}
 *
 * <p>GetOssScanConfigRequest</p>
 */
public class GetOssScanConfigRequest extends Request {
    private GetOssScanConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssScanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOssScanConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOssScanConfigRequest request) {
            super(request);
        } 

        @Override
        public GetOssScanConfigRequest build() {
            return new GetOssScanConfigRequest(this);
        } 

    } 

}
