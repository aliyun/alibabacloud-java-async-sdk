// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link OpenVsServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenVsServiceRequest</p>
 */
public class OpenVsServiceRequest extends Request {
    private OpenVsServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenVsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenVsServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenVsServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenVsServiceRequest build() {
            return new OpenVsServiceRequest(this);
        } 

    } 

}
