// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20210610.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMqConsumerTagRequest} extends {@link RequestModel}
 *
 * <p>GetMqConsumerTagRequest</p>
 */
public class GetMqConsumerTagRequest extends Request {
    private GetMqConsumerTagRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMqConsumerTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetMqConsumerTagRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetMqConsumerTagRequest response) {
            super(response);
        } 

        @Override
        public GetMqConsumerTagRequest build() {
            return new GetMqConsumerTagRequest(this);
        } 

    } 

}
