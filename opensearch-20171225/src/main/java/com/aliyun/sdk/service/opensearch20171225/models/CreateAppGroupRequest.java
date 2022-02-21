// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppGroupRequest</p>
 */
public class CreateAppGroupRequest extends Request {
    private CreateAppGroupRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateAppGroupRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateAppGroupRequest response) {
            super(response);
        } 

        @Override
        public CreateAppGroupRequest build() {
            return new CreateAppGroupRequest(this);
        } 

    } 

}
