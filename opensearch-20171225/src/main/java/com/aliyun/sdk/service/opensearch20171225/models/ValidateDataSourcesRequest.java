// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ValidateDataSourcesRequest</p>
 */
public class ValidateDataSourcesRequest extends Request {
    private ValidateDataSourcesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateDataSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ValidateDataSourcesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ValidateDataSourcesRequest response) {
            super(response);
        } 

        @Override
        public ValidateDataSourcesRequest build() {
            return new ValidateDataSourcesRequest(this);
        } 

    } 

}
