// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePortResponse} extends {@link TeaModel}
 *
 * <p>CreatePortResponse</p>
 */
public class CreatePortResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePortResponseBody body;

    private CreatePortResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePortResponse create() {
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
    public CreatePortResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePortResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePortResponseBody body);

        @Override
        CreatePortResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePortResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePortResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePortResponse response) {
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
        public Builder body(CreatePortResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePortResponse build() {
            return new CreatePortResponse(this);
        } 

    } 

}
