// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassignUserResponse} extends {@link TeaModel}
 *
 * <p>UnassignUserResponse</p>
 */
public class UnassignUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassignUserResponseBody body;

    private UnassignUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassignUserResponse create() {
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
    public UnassignUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassignUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassignUserResponseBody body);

        @Override
        UnassignUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassignUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassignUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassignUserResponse response) {
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
        public Builder body(UnassignUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassignUserResponse build() {
            return new UnassignUserResponse(this);
        } 

    } 

}
