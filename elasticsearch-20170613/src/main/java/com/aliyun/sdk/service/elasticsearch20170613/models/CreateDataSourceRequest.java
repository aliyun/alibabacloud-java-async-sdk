// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    private CreateDataSourceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest response) {
            super(response);
        } 

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

}
