// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionRequest} extends {@link RequestModel}
 *
 * <p>CreateFunctionRequest</p>
 */
public class CreateFunctionRequest extends Request {
    @Body
    @NameInMap("request")
    @Validation(required = true)
    private CreateFunctionInput request;

    private CreateFunctionRequest(Builder builder) {
        super(builder);
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return request
     */
    public CreateFunctionInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<CreateFunctionRequest, Builder> {
        private CreateFunctionInput request; 

        private Builder() {
            super();
        } 

        private Builder(CreateFunctionRequest request) {
            super(request);
            this.request = request.request;
        } 

        /**
         * request.
         */
        public Builder request(CreateFunctionInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public CreateFunctionRequest build() {
            return new CreateFunctionRequest(this);
        } 

    } 

}
