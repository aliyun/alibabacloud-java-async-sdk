// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableThemeResponse} extends {@link TeaModel}
 *
 * <p>DeleteTableThemeResponse</p>
 */
public class DeleteTableThemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTableThemeResponseBody body;

    private DeleteTableThemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTableThemeResponse create() {
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
    public DeleteTableThemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTableThemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTableThemeResponseBody body);

        @Override
        DeleteTableThemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTableThemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTableThemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTableThemeResponse response) {
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
        public Builder body(DeleteTableThemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTableThemeResponse build() {
            return new DeleteTableThemeResponse(this);
        } 

    } 

}
