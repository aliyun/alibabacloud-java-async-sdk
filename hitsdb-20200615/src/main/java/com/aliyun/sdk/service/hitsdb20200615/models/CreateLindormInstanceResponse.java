// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLindormInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateLindormInstanceResponse</p>
 */
public class CreateLindormInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLindormInstanceResponseBody body;

    private CreateLindormInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLindormInstanceResponse create() {
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
    public CreateLindormInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLindormInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLindormInstanceResponseBody body);

        @Override
        CreateLindormInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLindormInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLindormInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLindormInstanceResponse response) {
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
        public Builder body(CreateLindormInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLindormInstanceResponse build() {
            return new CreateLindormInstanceResponse(this);
        } 

    } 

}
