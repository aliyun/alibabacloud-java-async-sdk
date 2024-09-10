// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckStsTokenAuthRequest} extends {@link RequestModel}
 *
 * <p>CheckStsTokenAuthRequest</p>
 */
public class CheckStsTokenAuthRequest extends Request {
    private CheckStsTokenAuthRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckStsTokenAuthRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CheckStsTokenAuthRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CheckStsTokenAuthRequest request) {
            super(request);
        } 

        @Override
        public CheckStsTokenAuthRequest build() {
            return new CheckStsTokenAuthRequest(this);
        } 

    } 

}
