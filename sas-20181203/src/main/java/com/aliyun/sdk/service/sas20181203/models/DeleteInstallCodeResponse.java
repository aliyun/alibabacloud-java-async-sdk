// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstallCodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstallCodeResponse</p>
 */
public class DeleteInstallCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstallCodeResponseBody body;

    private DeleteInstallCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstallCodeResponse create() {
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
    public DeleteInstallCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstallCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstallCodeResponseBody body);

        @Override
        DeleteInstallCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstallCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstallCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstallCodeResponse response) {
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
        public Builder body(DeleteInstallCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstallCodeResponse build() {
            return new DeleteInstallCodeResponse(this);
        } 

    } 

}
