// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>CreateUserAnalyzerRequest</p>
 */
public class CreateUserAnalyzerRequest extends Request {
    private CreateUserAnalyzerRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserAnalyzerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateUserAnalyzerRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateUserAnalyzerRequest response) {
            super(response);
        } 

        @Override
        public CreateUserAnalyzerRequest build() {
            return new CreateUserAnalyzerRequest(this);
        } 

    } 

}
