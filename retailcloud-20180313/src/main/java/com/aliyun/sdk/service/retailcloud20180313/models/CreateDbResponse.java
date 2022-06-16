// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbResponse} extends {@link TeaModel}
 *
 * <p>CreateDbResponse</p>
 */
public class CreateDbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDbResponseBody body;

    private CreateDbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDbResponse create() {
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
    public CreateDbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDbResponseBody body);

        @Override
        CreateDbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDbResponse response) {
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
        public Builder body(CreateDbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDbResponse build() {
            return new CreateDbResponse(this);
        } 

    } 

}
