// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationRequest} extends {@link RequestModel}
 *
 * <p>GetApplicationRequest</p>
 */
public class GetApplicationRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    private GetApplicationRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<GetApplicationRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetApplicationRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * 应用名称
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetApplicationRequest build() {
            return new GetApplicationRequest(this);
        } 

    } 

}
