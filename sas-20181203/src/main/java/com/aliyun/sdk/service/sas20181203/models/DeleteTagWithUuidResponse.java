// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagWithUuidResponse} extends {@link TeaModel}
 *
 * <p>DeleteTagWithUuidResponse</p>
 */
public class DeleteTagWithUuidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTagWithUuidResponseBody body;

    private DeleteTagWithUuidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTagWithUuidResponse create() {
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
    public DeleteTagWithUuidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTagWithUuidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTagWithUuidResponseBody body);

        @Override
        DeleteTagWithUuidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTagWithUuidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTagWithUuidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTagWithUuidResponse response) {
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
        public Builder body(DeleteTagWithUuidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTagWithUuidResponse build() {
            return new DeleteTagWithUuidResponse(this);
        } 

    } 

}
