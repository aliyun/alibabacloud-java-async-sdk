// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserResponse} extends {@link TeaModel}
 *
 * <p>AddUserResponse</p>
 */
public class AddUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserResponseBody body;

    private AddUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserResponse create() {
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
    public AddUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserResponseBody body);

        @Override
        AddUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserResponse response) {
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
        public Builder body(AddUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserResponse build() {
            return new AddUserResponse(this);
        } 

    } 

}
