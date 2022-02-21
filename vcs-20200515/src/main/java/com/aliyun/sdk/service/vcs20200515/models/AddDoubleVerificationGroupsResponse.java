// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDoubleVerificationGroupsResponse} extends {@link TeaModel}
 *
 * <p>AddDoubleVerificationGroupsResponse</p>
 */
public class AddDoubleVerificationGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDoubleVerificationGroupsResponseBody body;

    private AddDoubleVerificationGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDoubleVerificationGroupsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public AddDoubleVerificationGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDoubleVerificationGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDoubleVerificationGroupsResponseBody body);

        @Override
        AddDoubleVerificationGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDoubleVerificationGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDoubleVerificationGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDoubleVerificationGroupsResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(AddDoubleVerificationGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDoubleVerificationGroupsResponse build() {
            return new AddDoubleVerificationGroupsResponse(this);
        } 

    } 

}
