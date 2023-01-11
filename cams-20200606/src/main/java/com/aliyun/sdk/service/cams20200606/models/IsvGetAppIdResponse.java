// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IsvGetAppIdResponse} extends {@link TeaModel}
 *
 * <p>IsvGetAppIdResponse</p>
 */
public class IsvGetAppIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IsvGetAppIdResponseBody body;

    private IsvGetAppIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IsvGetAppIdResponse create() {
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
    public IsvGetAppIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IsvGetAppIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IsvGetAppIdResponseBody body);

        @Override
        IsvGetAppIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IsvGetAppIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IsvGetAppIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IsvGetAppIdResponse response) {
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
        public Builder body(IsvGetAppIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IsvGetAppIdResponse build() {
            return new IsvGetAppIdResponse(this);
        } 

    } 

}
