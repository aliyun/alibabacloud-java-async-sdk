// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageConfigRequest} extends {@link RequestModel}
 *
 * <p>GetMessageConfigRequest</p>
 */
public class GetMessageConfigRequest extends Request {
    private GetMessageConfigRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMessageConfigRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMessageConfigRequest request) {
            super(request);
        } 

        @Override
        public GetMessageConfigRequest build() {
            return new GetMessageConfigRequest(this);
        } 

    } 

}
