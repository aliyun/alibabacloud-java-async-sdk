// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignUserResponse} extends {@link TeaModel}
 *
 * <p>AssignUserResponse</p>
 */
public class AssignUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignUserResponseBody body;

    private AssignUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignUserResponse create() {
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
    public AssignUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignUserResponseBody body);

        @Override
        AssignUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignUserResponse response) {
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
        public Builder body(AssignUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignUserResponse build() {
            return new AssignUserResponse(this);
        } 

    } 

}
