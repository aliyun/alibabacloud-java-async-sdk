// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAiotPersonTableResponse} extends {@link TeaModel}
 *
 * <p>AddAiotPersonTableResponse</p>
 */
public class AddAiotPersonTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAiotPersonTableResponseBody body;

    private AddAiotPersonTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAiotPersonTableResponse create() {
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
    public AddAiotPersonTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAiotPersonTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAiotPersonTableResponseBody body);

        @Override
        AddAiotPersonTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAiotPersonTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAiotPersonTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAiotPersonTableResponse response) {
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
        public Builder body(AddAiotPersonTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAiotPersonTableResponse build() {
            return new AddAiotPersonTableResponse(this);
        } 

    } 

}
