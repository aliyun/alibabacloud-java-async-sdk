// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRetcodeAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteRetcodeAppResponse</p>
 */
public class DeleteRetcodeAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRetcodeAppResponseBody body;

    private DeleteRetcodeAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRetcodeAppResponse create() {
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
    public DeleteRetcodeAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRetcodeAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRetcodeAppResponseBody body);

        @Override
        DeleteRetcodeAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRetcodeAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRetcodeAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRetcodeAppResponse response) {
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
        public Builder body(DeleteRetcodeAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRetcodeAppResponse build() {
            return new DeleteRetcodeAppResponse(this);
        } 

    } 

}
