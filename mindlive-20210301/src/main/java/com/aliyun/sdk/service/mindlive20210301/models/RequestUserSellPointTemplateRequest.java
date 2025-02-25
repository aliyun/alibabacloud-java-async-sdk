// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestUserSellPointTemplateRequest} extends {@link RequestModel}
 *
 * <p>RequestUserSellPointTemplateRequest</p>
 */
public class RequestUserSellPointTemplateRequest extends Request {
    private RequestUserSellPointTemplateRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestUserSellPointTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RequestUserSellPointTemplateRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RequestUserSellPointTemplateRequest request) {
            super(request);
        } 

        @Override
        public RequestUserSellPointTemplateRequest build() {
            return new RequestUserSellPointTemplateRequest(this);
        } 

    } 

}
