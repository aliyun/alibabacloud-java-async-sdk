// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edsofficeservice20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateDesktopPoolRequest</p>
 */
public class CreateDesktopPoolRequest extends Request {
    private CreateDesktopPoolRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateDesktopPoolRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateDesktopPoolRequest request) {
            super(request);
        } 

        @Override
        public CreateDesktopPoolRequest build() {
            return new CreateDesktopPoolRequest(this);
        } 

    } 

}
