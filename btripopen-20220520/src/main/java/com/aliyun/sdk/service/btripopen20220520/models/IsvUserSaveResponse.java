// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvUserSaveResponse} extends {@link TeaModel}
 *
 * <p>IsvUserSaveResponse</p>
 */
public class IsvUserSaveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IsvUserSaveResponseBody body;

    private IsvUserSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IsvUserSaveResponse create() {
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
    public IsvUserSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IsvUserSaveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IsvUserSaveResponseBody body);

        @Override
        IsvUserSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IsvUserSaveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IsvUserSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IsvUserSaveResponse response) {
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
        public Builder body(IsvUserSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IsvUserSaveResponse build() {
            return new IsvUserSaveResponse(this);
        } 

    } 

}
