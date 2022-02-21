// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateAccountGroupResponse</p>
 */
public class CreateAccountGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccountGroupResponseBody body;

    private CreateAccountGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccountGroupResponse create() {
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
    public CreateAccountGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccountGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccountGroupResponseBody body);

        @Override
        CreateAccountGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccountGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccountGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccountGroupResponse response) {
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
        public Builder body(CreateAccountGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccountGroupResponse build() {
            return new CreateAccountGroupResponse(this);
        } 

    } 

}
