// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenBdrcServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenBdrcServiceRequest</p>
 */
public class OpenBdrcServiceRequest extends Request {
    private OpenBdrcServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenBdrcServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<OpenBdrcServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(OpenBdrcServiceRequest request) {
            super(request);
        } 

        @Override
        public OpenBdrcServiceRequest build() {
            return new OpenBdrcServiceRequest(this);
        } 

    } 

}
