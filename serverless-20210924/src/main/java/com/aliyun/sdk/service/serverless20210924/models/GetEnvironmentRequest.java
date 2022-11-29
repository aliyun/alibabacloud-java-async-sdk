// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>GetEnvironmentRequest</p>
 */
public class GetEnvironmentRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true, maxLength = 40, minLength = 1)
    private String name;

    private GetEnvironmentRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetEnvironmentRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetEnvironmentRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the environment
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetEnvironmentRequest build() {
            return new GetEnvironmentRequest(this);
        } 

    } 

}
